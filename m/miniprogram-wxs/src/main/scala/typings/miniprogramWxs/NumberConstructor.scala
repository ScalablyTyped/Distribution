package typings.miniprogramWxs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberConstructor extends js.Object {
  // new(value?: any): Number;
  // (value?: any): number;
  // readonly prototype: Number;
  /** The largest number that can be represented in JavaScript. Equal to approximately 1.79E+308. */
  val MAX_VALUE: Double = js.native
  /** The closest number to zero that can be represented in JavaScript. Equal to approximately 5.00E-324. */
  val MIN_VALUE: Double = js.native
  /**
    * A value that is less than the largest negative number that can be represented in JavaScript.
    * JavaScript displays NEGATIVE_INFINITY values as -infinity.
    */
  val NEGATIVE_INFINITY: Double = js.native
  /**
    * A value that is not a number.
    * In equality comparisons, NaN does not equal any value, including itself. To test whether a value is equivalent to NaN, use the isNaN function.
    */
  val NaN: Double = js.native
  /**
    * A value greater than the largest number that can be represented in JavaScript.
    * JavaScript displays POSITIVE_INFINITY values as infinity.
    */
  val POSITIVE_INFINITY: Double = js.native
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
  @scala.inline
  implicit class NumberConstructorOps[Self <: NumberConstructor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMAX_VALUE(value: Double): Self = this.set("MAX_VALUE", value.asInstanceOf[js.Any])
    @scala.inline
    def setMIN_VALUE(value: Double): Self = this.set("MIN_VALUE", value.asInstanceOf[js.Any])
    @scala.inline
    def setNEGATIVE_INFINITY(value: Double): Self = this.set("NEGATIVE_INFINITY", value.asInstanceOf[js.Any])
    @scala.inline
    def setNaN(value: Double): Self = this.set("NaN", value.asInstanceOf[js.Any])
    @scala.inline
    def setPOSITIVE_INFINITY(value: Double): Self = this.set("POSITIVE_INFINITY", value.asInstanceOf[js.Any])
  }
  
}

