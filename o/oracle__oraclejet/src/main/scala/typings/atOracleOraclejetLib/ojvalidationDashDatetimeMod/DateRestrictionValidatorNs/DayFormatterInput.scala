package typings
package atOracleOraclejetLib.ojvalidationDashDatetimeMod.DateRestrictionValidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait DayFormatterInput extends js.Object {
  var date: scala.Double
  var fullYear: scala.Double
  var month: scala.Double
}

object DayFormatterInput {
  @scala.inline
  def apply(date: scala.Double, fullYear: scala.Double, month: scala.Double): DayFormatterInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("fullYear")(fullYear)
    __obj.updateDynamic("month")(month)
    __obj.asInstanceOf[DayFormatterInput]
  }
}

