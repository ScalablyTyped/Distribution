package typings
package pDashEventLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Atomics extends js.Object {
  @JSName(org.scalablytyped.runtime.Symbol.toStringTag)
  val toStringTag: pDashEventLib.pDashEventLibStrings.Atomics = js.native
  def add(typedArray: Int16Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def add(typedArray: Int32Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  /**
    * Adds a value to the value at the given position in the array, returning the original value.
    * Until this atomic operation completes, any other read or write operation against the array
    * will block.
    */
  def add(typedArray: Int8Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def add(typedArray: Uint16Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def add(typedArray: Uint32Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def add(typedArray: Uint8Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def and(typedArray: Int16Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def and(typedArray: Int32Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  /**
    * Stores the bitwise AND of a value with the value at the given position in the array,
    * returning the original value. Until this atomic operation completes, any other read or
    * write operation against the array will block.
    */
  def and(typedArray: Int8Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def and(typedArray: Uint16Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def and(typedArray: Uint32Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def and(typedArray: Uint8Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def compareExchange(
    typedArray: Int16Array,
    index: scala.Double,
    expectedValue: scala.Double,
    replacementValue: scala.Double
  ): scala.Double = js.native
  def compareExchange(
    typedArray: Int32Array,
    index: scala.Double,
    expectedValue: scala.Double,
    replacementValue: scala.Double
  ): scala.Double = js.native
  /**
    * Replaces the value at the given position in the array if the original value equals the given
    * expected value, returning the original value. Until this atomic operation completes, any
    * other read or write operation against the array will block.
    */
  def compareExchange(
    typedArray: Int8Array,
    index: scala.Double,
    expectedValue: scala.Double,
    replacementValue: scala.Double
  ): scala.Double = js.native
  def compareExchange(
    typedArray: Uint16Array,
    index: scala.Double,
    expectedValue: scala.Double,
    replacementValue: scala.Double
  ): scala.Double = js.native
  def compareExchange(
    typedArray: Uint32Array,
    index: scala.Double,
    expectedValue: scala.Double,
    replacementValue: scala.Double
  ): scala.Double = js.native
  def compareExchange(
    typedArray: Uint8Array,
    index: scala.Double,
    expectedValue: scala.Double,
    replacementValue: scala.Double
  ): scala.Double = js.native
  def exchange(typedArray: Int16Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def exchange(typedArray: Int32Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  /**
    * Replaces the value at the given position in the array, returning the original value. Until
    * this atomic operation completes, any other read or write operation against the array will
    * block.
    */
  def exchange(typedArray: Int8Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def exchange(typedArray: Uint16Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def exchange(typedArray: Uint32Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def exchange(typedArray: Uint8Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  /**
    * Returns a value indicating whether high-performance algorithms can use atomic operations
    * (`true`) or must use locks (`false`) for the given number of bytes-per-element of a typed
    * array.
    */
  def isLockFree(size: scala.Double): scala.Boolean = js.native
  def load(typedArray: Int16Array, index: scala.Double): scala.Double = js.native
  def load(typedArray: Int32Array, index: scala.Double): scala.Double = js.native
  /**
    * Returns the value at the given position in the array. Until this atomic operation completes,
    * any other read or write operation against the array will block.
    */
  def load(typedArray: Int8Array, index: scala.Double): scala.Double = js.native
  def load(typedArray: Uint16Array, index: scala.Double): scala.Double = js.native
  def load(typedArray: Uint32Array, index: scala.Double): scala.Double = js.native
  def load(typedArray: Uint8Array, index: scala.Double): scala.Double = js.native
  def or(typedArray: Int16Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def or(typedArray: Int32Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  /**
    * Stores the bitwise OR of a value with the value at the given position in the array,
    * returning the original value. Until this atomic operation completes, any other read or write
    * operation against the array will block.
    */
  def or(typedArray: Int8Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def or(typedArray: Uint16Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def or(typedArray: Uint32Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def or(typedArray: Uint8Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def store(typedArray: Int16Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def store(typedArray: Int32Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  /**
    * Stores a value at the given position in the array, returning the new value. Until this
    * atomic operation completes, any other read or write operation against the array will block.
    */
  def store(typedArray: Int8Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def store(typedArray: Uint16Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def store(typedArray: Uint32Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def store(typedArray: Uint8Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def sub(typedArray: Int16Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def sub(typedArray: Int32Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  /**
    * Subtracts a value from the value at the given position in the array, returning the original
    * value. Until this atomic operation completes, any other read or write operation against the
    * array will block.
    */
  def sub(typedArray: Int8Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def sub(typedArray: Uint16Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def sub(typedArray: Uint32Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def sub(typedArray: Uint8Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  /**
    * If the value at the given position in the array is equal to the provided value, the current
    * agent is put to sleep causing execution to suspend until the timeout expires (returning
    * `"timed-out"`) or until the agent is awoken (returning `"ok"`); otherwise, returns
    * `"not-equal"`.
    */
  def wait(typedArray: Int32Array, index: scala.Double, value: scala.Double): pDashEventLib.pDashEventLibStrings.ok | pDashEventLib.pDashEventLibStrings.`not-equal` | pDashEventLib.pDashEventLibStrings.`timed-out` = js.native
  def wait(typedArray: Int32Array, index: scala.Double, value: scala.Double, timeout: scala.Double): pDashEventLib.pDashEventLibStrings.ok | pDashEventLib.pDashEventLibStrings.`not-equal` | pDashEventLib.pDashEventLibStrings.`timed-out` = js.native
  /**
    * Wakes up sleeping agents that are waiting on the given index of the array, returning the
    * number of agents that were awoken.
    */
  def wake(typedArray: Int32Array, index: scala.Double, count: scala.Double): scala.Double = js.native
  def xor(typedArray: Int16Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def xor(typedArray: Int32Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  /**
    * Stores the bitwise XOR of a value with the value at the given position in the array,
    * returning the original value. Until this atomic operation completes, any other read or write
    * operation against the array will block.
    */
  def xor(typedArray: Int8Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def xor(typedArray: Uint16Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def xor(typedArray: Uint32Array, index: scala.Double, value: scala.Double): scala.Double = js.native
  def xor(typedArray: Uint8Array, index: scala.Double, value: scala.Double): scala.Double = js.native
}

