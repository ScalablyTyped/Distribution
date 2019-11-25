package typings.miniprogramDashWxs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberConstructor extends js.Object {
  // new(value?: any): Number;
  // (value?: any): number;
  // readonly prototype: Number;
  /** The largest number that can be represented in JavaScript. Equal to approximately 1.79E+308. */
  val MAX_VALUE: Double
  /** The closest number to zero that can be represented in JavaScript. Equal to approximately 5.00E-324. */
  val MIN_VALUE: Double
  /**
    * A value that is less than the largest negative number that can be represented in JavaScript.
    * JavaScript displays NEGATIVE_INFINITY values as -infinity.
    */
  val NEGATIVE_INFINITY: Double
  /**
    * A value that is not a number.
    * In equality comparisons, NaN does not equal any value, including itself. To test whether a value is equivalent to NaN, use the isNaN function.
    */
  val NaN: Double
  /**
    * A value greater than the largest number that can be represented in JavaScript.
    * JavaScript displays POSITIVE_INFINITY values as infinity.
    */
  val POSITIVE_INFINITY: Double
}

object NumberConstructor {
  @scala.inline
  def apply(
    MAX_VALUE: Double,
    MIN_VALUE: Double,
    NEGATIVE_INFINITY: Double,
    NaN: Double,
    POSITIVE_INFINITY: Double
  ): NumberConstructor = {
    val __obj = js.Dynamic.literal(MAX_VALUE = MAX_VALUE.asInstanceOf[js.Any], MIN_VALUE = MIN_VALUE.asInstanceOf[js.Any], NEGATIVE_INFINITY = NEGATIVE_INFINITY.asInstanceOf[js.Any], NaN = NaN.asInstanceOf[js.Any], POSITIVE_INFINITY = POSITIVE_INFINITY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NumberConstructor]
  }
}

