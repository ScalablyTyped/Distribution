package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalizationNumberPattern extends js.Object {
  var decimal: String
  var fraction: Double
  var grouping: String
  var negative: String
  var pattern: String
  var positive: String
  var rounding: Double
  var symbol: String
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
    val __obj = js.Dynamic.literal(decimal = decimal, fraction = fraction, grouping = grouping, negative = negative, pattern = pattern, positive = positive, rounding = rounding, symbol = symbol)
  
    __obj.asInstanceOf[GlobalizationNumberPattern]
  }
}

