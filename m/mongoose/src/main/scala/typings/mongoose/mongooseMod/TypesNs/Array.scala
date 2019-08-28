package typings.mongoose.mongooseMod.TypesNs

import typings.std.ArrayConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section types/array.js
  * http://mongoosejs.com/docs/api.html#types-array-js
  */
@js.native
trait Array[T] extends ArrayConstructor {
  /**
    * Pops the array atomically at most one time per document save().
    * Calling this mulitple times on an array before saving sends the same command as
    * calling it once. This update is implemented using the MongoDB $pop method which
    * enforces this restriction.
    */
  @JSName("$pop")
  def $pop(): T = js.native
  /**
    * Atomically shifts the array at most one time per document save().
    * Calling this mulitple times on an array before saving sends the same command as
    * calling it once. This update is implemented using the MongoDB $pop method which
    * enforces this restriction.
    */
  @JSName("$shift")
  def $shift(): T = js.native
  /**
    * Adds values to the array if not already present.
    * @returns the values that were added
    */
  def addToSet(args: js.Any*): Array[T] = js.native
  /**
    * Return the index of obj or -1 if not found.
    * @param obj the item to look for
    */
  def indexOf(obj: js.Any): Double = js.native
  /** Helper for console.log */
  def inspect(): js.Any = js.native
  /**
    * Marks the entire array as modified, which if saved, will store it as a $set
    * operation, potentially overwritting any changes that happen between when you
    * retrieved the object and when you save it.
    * @returns new length of the array
    */
  def nonAtomicPush(args: js.Any*): Double = js.native
  /**
    * Wraps Array#pop with proper change tracking.
    * marks the entire array as modified which will pass the entire thing to $set
    * potentially overwritting any changes that happen between when you retrieved
    * the object and when you save it.
    */
  def pop(): T = js.native
  /**
    * Pulls items from the array atomically. Equality is determined by casting
    * the provided value to an embedded document and comparing using
    * the Document.equals() function.
    */
  def pull(args: js.Any*): this.type = js.native
  /**
    * Wraps Array#push with proper change tracking.
    * @returns new length of the array
    */
  def push(args: js.Any*): Double = js.native
  /** Alias of pull */
  def remove(args: js.Any*): this.type = js.native
  /** Sets the casted val at index i and marks the array modified. */
  def set(i: Double, `val`: js.Any): this.type = js.native
  /**
    * Wraps Array#shift with proper change tracking.
    * Marks the entire array as modified, which if saved, will store it as a $set operation,
    * potentially overwritting any changes that happen between when you retrieved the object
    * and when you save it.
    */
  def shift(): T = js.native
  /**
    * Wraps Array#sort with proper change tracking.
    * Marks the entire array as modified, which if saved, will store it as a $set operation,
    * potentially overwritting any changes that happen between when you retrieved the object
    * and when you save it.
    */
  // some lib.d.ts have return type "this" and others have return type "T[]"
  // which causes errors. Let the inherited array provide the sort() method.
  //sort(compareFn?: (a: T, b: T) => number): T[];
  /**
    * Wraps Array#splice with proper change tracking and casting.
    * Marks the entire array as modified, which if saved, will store it as a $set operation,
    * potentially overwritting any changes that happen between when you retrieved the object
    * and when you save it.
    */
  def splice(args: js.Any*): Array[T] = js.native
  /** Returns a native js Array. */
  def toObject(): Array[T] = js.native
  def toObject(options: js.Any): Array[T] = js.native
  /**
    * Wraps Array#unshift with proper change tracking.
    * Marks the entire array as modified, which if saved, will store it as a $set operation,
    * potentially overwritting any changes that happen between when you retrieved the object
    * and when you save it.
    */
  def unshift(args: js.Any*): Double = js.native
}

