package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalizationNumberPattern extends js.Object {
  var decimal: java.lang.String
  var fraction: scala.Double
  var grouping: java.lang.String
  var negative: java.lang.String
  var pattern: java.lang.String
  var positive: java.lang.String
  var rounding: scala.Double
  var symbol: java.lang.String
}

object GlobalizationNumberPattern {
  @scala.inline
  def apply(
    decimal: java.lang.String,
    fraction: scala.Double,
    grouping: java.lang.String,
    negative: java.lang.String,
    pattern: java.lang.String,
    positive: java.lang.String,
    rounding: scala.Double,
    symbol: java.lang.String
  ): GlobalizationNumberPattern = {
    val __obj = js.Dynamic.literal(decimal = decimal, fraction = fraction, grouping = grouping, negative = negative, pattern = pattern, positive = positive, rounding = rounding, symbol = symbol)
  
    __obj.asInstanceOf[GlobalizationNumberPattern]
  }
}

