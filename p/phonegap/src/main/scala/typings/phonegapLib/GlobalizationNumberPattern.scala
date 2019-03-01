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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decimal")(decimal)
    __obj.updateDynamic("fraction")(fraction)
    __obj.updateDynamic("grouping")(grouping)
    __obj.updateDynamic("negative")(negative)
    __obj.updateDynamic("pattern")(pattern)
    __obj.updateDynamic("positive")(positive)
    __obj.updateDynamic("rounding")(rounding)
    __obj.updateDynamic("symbol")(symbol)
    __obj.asInstanceOf[GlobalizationNumberPattern]
  }
}

