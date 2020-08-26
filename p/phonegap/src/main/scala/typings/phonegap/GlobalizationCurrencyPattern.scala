package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalizationCurrencyPattern extends js.Object {
  var code: String = js.native
  var decimal: String = js.native
  var fraction: Double = js.native
  var grouping: String = js.native
  var pattern: String = js.native
  var rounding: Double = js.native
}

object GlobalizationCurrencyPattern {
  @scala.inline
  def apply(
    code: String,
    decimal: String,
    fraction: Double,
    grouping: String,
    pattern: String,
    rounding: Double
  ): GlobalizationCurrencyPattern = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], fraction = fraction.asInstanceOf[js.Any], grouping = grouping.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], rounding = rounding.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalizationCurrencyPattern]
  }
  @scala.inline
  implicit class GlobalizationCurrencyPatternOps[Self <: GlobalizationCurrencyPattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecimal(value: String): Self = this.set("decimal", value.asInstanceOf[js.Any])
    @scala.inline
    def setFraction(value: Double): Self = this.set("fraction", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrouping(value: String): Self = this.set("grouping", value.asInstanceOf[js.Any])
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setRounding(value: Double): Self = this.set("rounding", value.asInstanceOf[js.Any])
  }
  
}

