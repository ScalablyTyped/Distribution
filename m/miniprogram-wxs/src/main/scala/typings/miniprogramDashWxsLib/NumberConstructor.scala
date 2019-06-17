package typings
package miniprogramDashWxsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberConstructor extends js.Object {
  // new(value?: any): Number;
  // (value?: any): number;
  // readonly prototype: Number;
  /** The largest number that can be represented in JavaScript. Equal to approximately 1.79E+308. */
  val MAX_VALUE: scala.Double
  /** The closest number to zero that can be represented in JavaScript. Equal to approximately 5.00E-324. */
  val MIN_VALUE: scala.Double
  /**
    * A value that is less than the largest negative number that can be represented in JavaScript.
    * JavaScript displays NEGATIVE_INFINITY values as -infinity.
    */
  val NEGATIVE_INFINITY: scala.Double
  /**
    * A value that is not a number.
    * In equality comparisons, NaN does not equal any value, including itself. To test whether a value is equivalent to NaN, use the isNaN function.
    */
  val NaN: scala.Double
  /**
    * A value greater than the largest number that can be represented in JavaScript.
    * JavaScript displays POSITIVE_INFINITY values as infinity.
    */
  val POSITIVE_INFINITY: scala.Double
}

object NumberConstructor {
  @scala.inline
  def apply(
    MAX_VALUE: scala.Double,
    MIN_VALUE: scala.Double,
    NEGATIVE_INFINITY: scala.Double,
    NaN: scala.Double,
    POSITIVE_INFINITY: scala.Double
  ): NumberConstructor = {
    val __obj = js.Dynamic.literal(MAX_VALUE = MAX_VALUE, MIN_VALUE = MIN_VALUE, NEGATIVE_INFINITY = NEGATIVE_INFINITY, NaN = NaN, POSITIVE_INFINITY = POSITIVE_INFINITY)
  
    __obj.asInstanceOf[NumberConstructor]
  }
}

