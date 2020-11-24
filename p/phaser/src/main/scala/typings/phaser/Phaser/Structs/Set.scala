package typings.phaser.Phaser.Structs

import typings.phaser.EachSetCallback
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Set is a collection of unique elements.
  */
@js.native
trait Set[T] extends js.Object {
  
  /**
    * Clears this Set so that it no longer contains any values.
    */
  def clear(): Set[T] = js.native
  
  /**
    * Returns `true` if this Set contains the given value, otherwise returns `false`.
    * @param value The value to check for in this Set.
    */
  def contains(value: T): Boolean = js.native
  
  /**
    * Removes the given value from this Set if this Set contains that value.
    * @param value The value to remove from the Set.
    */
  def delete(value: T): Set[T] = js.native
  
  /**
    * Returns a new Set containing all the values in this Set which are *not* also in the given Set.
    * @param set The Set to perform the difference with.
    */
  def difference(set: Set[T]): Set[T] = js.native
  
  /**
    * Dumps the contents of this Set to the console via `console.group`.
    */
  def dump(): Unit = js.native
  
  /**
    * Passes each value in this Set to the given callback.
    * Use this function when you know this Set will be modified during the iteration, otherwise use `iterate`.
    * @param callback The callback to be invoked and passed each value this Set contains.
    * @param callbackScope The scope of the callback.
    */
  def each(callback: EachSetCallback[T]): Set[T] = js.native
  def each(callback: EachSetCallback[T], callbackScope: js.Any): Set[T] = js.native
  
  /**
    * The entries of this Set. Stored internally as an array.
    */
  var entries: js.Array[T] = js.native
  
  /**
    * Get an element of this Set which has a property of the specified name, if that property is equal to the specified value.
    * If no elements of this Set satisfy the condition then this method will return `null`.
    * @param property The property name to check on the elements of this Set.
    * @param value The value to check for.
    */
  def get(property: String, value: T): T = js.native
  
  /**
    * Returns an array containing all the values in this Set.
    */
  def getArray(): js.Array[T] = js.native
  
  /**
    * Returns a new Set that contains only the values which are in this Set and that are also in the given Set.
    * @param set The Set to intersect this set with.
    */
  def intersect(set: Set[T]): Set[T] = js.native
  
  /**
    * Passes each value in this Set to the given callback.
    * For when you absolutely know this Set won't be modified during the iteration.
    * @param callback The callback to be invoked and passed each value this Set contains.
    * @param callbackScope The scope of the callback.
    */
  def iterate(callback: EachSetCallback[T]): Set[T] = js.native
  def iterate(callback: EachSetCallback[T], callbackScope: js.Any): Set[T] = js.native
  
  /**
    * Goes through each entry in this Set and invokes the given function on them, passing in the arguments.
    * @param callbackKey The key of the function to be invoked on each Set entry.
    * @param args Additional arguments that will be passed to the callback, after the child.
    */
  def iterateLocal(callbackKey: String, args: js.Any*): Set[T] = js.native
  
  /**
    * Inserts the provided value into this Set. If the value is already contained in this Set this method will have no effect.
    * @param value The value to insert into this Set.
    */
  def set(value: T): Set[T] = js.native
  
  /**
    * The size of this Set. This is the number of entries within it.
    * Changing the size will truncate the Set if the given value is smaller than the current size.
    * Increasing the size larger than the current size has no effect.
    */
  var size: integer = js.native
  
  /**
    * Returns a new Set containing all values that are either in this Set or in the Set provided as an argument.
    * @param set The Set to perform the union with.
    */
  def union(set: Set[T]): Set[T] = js.native
}
