package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalizationCurrencyPattern extends js.Object {
  var code: String
  var decimal: String
  var fraction: Double
  var grouping: String
  var pattern: String
  var rounding: Double
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
    val __obj = js.Dynamic.literal(code = code, decimal = decimal, fraction = fraction, grouping = grouping, pattern = pattern, rounding = rounding)
  
    __obj.asInstanceOf[GlobalizationCurrencyPattern]
  }
}

