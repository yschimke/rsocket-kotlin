/*
 * Copyright 2015-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.rsocket.kotlin.test

actual fun identityHashCode(instance: Any): Int = System.identityHashCode(instance)

actual class MSet<T> actual constructor() {
    private val delegate = mutableSetOf<T>()
    actual fun add(element: T): Boolean = delegate.add(element)
    actual fun remove(element: T): Boolean = delegate.remove(element)
    actual fun clear(): Unit = delegate.clear()
    actual fun values(): List<T> = delegate.toList()
}
