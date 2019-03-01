package typings
package atOracleOraclejetLib.ojtimeaxisMod.ojTimeAxisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Converters extends js.Object {
  var days: js.UndefOr[atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String]] = js.undefined
  var default: js.UndefOr[atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String]] = js.undefined
  var hours: js.UndefOr[atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String]] = js.undefined
  var minutes: js.UndefOr[atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String]] = js.undefined
  var months: js.UndefOr[atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String]] = js.undefined
  var quarters: js.UndefOr[atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String]] = js.undefined
  var seconds: js.UndefOr[atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String]] = js.undefined
  var weeks: js.UndefOr[atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String]] = js.undefined
  var years: js.UndefOr[atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String]] = js.undefined
}

object Converters {
  @scala.inline
  def apply(
    days: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String] = null,
    default: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String] = null,
    hours: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String] = null,
    minutes: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String] = null,
    months: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String] = null,
    quarters: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String] = null,
    seconds: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String] = null,
    weeks: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String] = null,
    years: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String] = null
  ): Converters = {
    val __obj = js.Dynamic.literal()
    if (days != null) __obj.updateDynamic("days")(days)
    if (default != null) __obj.updateDynamic("default")(default)
    if (hours != null) __obj.updateDynamic("hours")(hours)
    if (minutes != null) __obj.updateDynamic("minutes")(minutes)
    if (months != null) __obj.updateDynamic("months")(months)
    if (quarters != null) __obj.updateDynamic("quarters")(quarters)
    if (seconds != null) __obj.updateDynamic("seconds")(seconds)
    if (weeks != null) __obj.updateDynamic("weeks")(weeks)
    if (years != null) __obj.updateDynamic("years")(years)
    __obj.asInstanceOf[Converters]
  }
}

