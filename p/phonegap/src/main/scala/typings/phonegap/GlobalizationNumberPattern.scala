package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalizationNumberPattern extends js.Object {
  var decimal: String = js.native
  var fraction: Double = js.native
  var grouping: String = js.native
  var negative: String = js.native
  var pattern: String = js.native
  var positive: String = js.native
  var rounding: Double = js.native
  var symbol: String = js.native
}

object GlobalizationNumberPattern {
  @scala.inline
  def apply(
    decimal: String,
    fraction: Double,
    grouping: String,
    negative: String,
    pattern: String,
    positive: String,
    rounding: Double,
    symbol: String
  ): GlobalizationNumberPattern = {
    val __obj = js.Dynamic.literal(decimal = decimal.asInstanceOf[js.Any], fraction = fraction.asInstanceOf[js.Any], grouping = grouping.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], rounding = rounding.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalizationNumberPattern]
  }
  @scala.inline
  implicit class GlobalizationNumberPatternOps[Self <: GlobalizationNumberPattern] (val x: Self) extends AnyVal {
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
    def setDecimal(value: String): Self = this.set("decimal", value.asInstanceOf[js.Any])
    @scala.inline
    def setFraction(value: Double): Self = this.set("fraction", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrouping(value: String): Self = this.set("grouping", value.asInstanceOf[js.Any])
    @scala.inline
    def setNegative(value: String): Self = this.set("negative", value.asInstanceOf[js.Any])
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setPositive(value: String): Self = this.set("positive", value.asInstanceOf[js.Any])
    @scala.inline
    def setRounding(value: Double): Self = this.set("rounding", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbol(value: String): Self = this.set("symbol", value.asInstanceOf[js.Any])
  }
  
}

