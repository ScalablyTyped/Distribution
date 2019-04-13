package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberDict extends TypedDict {
  /**
    *   Add the given number to the value currently stored
    *   at the given key. The sum then replaces the value
    *   previously stored in the Dictionary.
    *   @param Key for the value you wish to add to
    *   @param Number to add to the value
    */
  def add(Key: scala.Double, Number: scala.Double): scala.Unit = js.native
  /**
    *   Divide the given number with the value currently
    *   stored at the given key. The quotient then
    *   replaces the value previously stored in the
    *   Dictionary.
    *   @param Key for value you wish to divide
    *   @param Amount to divide the value by
    */
  def div(Key: scala.Double, Amount: scala.Double): scala.Unit = js.native
  /**
    *   Return the highest key currently used in the
    *   Dictionary.
    */
  def maxKey(): scala.Double = js.native
  /**
    *   Return the highest number currently stored in the
    *   Dictionary.
    */
  def maxValue(): scala.Double = js.native
  /**
    *   Return the lowest key currently used in the
    *   Dictionary.
    */
  def minKey(): scala.Double = js.native
  /**
    *   Return the lowest number currently stored in the
    *   Dictionary.
    */
  def minValue(): scala.Double = js.native
  /**
    *   Multiply the given number with the value currently
    *   stored at the given key. The product then replaces
    *   the value previously stored in the Dictionary.
    *   @param Key for value you wish to multiply
    *   @param Amount to multiply the value by
    */
  def mult(Key: scala.Double, Amount: scala.Double): scala.Unit = js.native
  /**
    *   Subtract the given number from the value currently
    *   stored at the given key. The difference then
    *   replaces the value previously stored in the
    *   Dictionary.
    *   @param Key for the value you wish to subtract from
    *   @param Number to subtract from the value
    */
  def sub(Key: scala.Double, Number: scala.Double): scala.Unit = js.native
}

