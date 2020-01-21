package typings.oracleOraclejet.ojtimeaxisMod.ojTimeAxis

import typings.oracleOraclejet.ojvalidationBaseMod.Converter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Converters extends js.Object {
  var days: js.UndefOr[Converter[String]] = js.undefined
  var default: js.UndefOr[Converter[String]] = js.undefined
  var hours: js.UndefOr[Converter[String]] = js.undefined
  var minutes: js.UndefOr[Converter[String]] = js.undefined
  var months: js.UndefOr[Converter[String]] = js.undefined
  var quarters: js.UndefOr[Converter[String]] = js.undefined
  var seconds: js.UndefOr[Converter[String]] = js.undefined
  var weeks: js.UndefOr[Converter[String]] = js.undefined
  var years: js.UndefOr[Converter[String]] = js.undefined
}

object Converters {
  @scala.inline
  def apply(
    days: Converter[String] = null,
    default: Converter[String] = null,
    hours: Converter[String] = null,
    minutes: Converter[String] = null,
    months: Converter[String] = null,
    quarters: Converter[String] = null,
    seconds: Converter[String] = null,
    weeks: Converter[String] = null,
    years: Converter[String] = null
  ): Converters = {
    val __obj = js.Dynamic.literal()
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (hours != null) __obj.updateDynamic("hours")(hours.asInstanceOf[js.Any])
    if (minutes != null) __obj.updateDynamic("minutes")(minutes.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (quarters != null) __obj.updateDynamic("quarters")(quarters.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    if (weeks != null) __obj.updateDynamic("weeks")(weeks.asInstanceOf[js.Any])
    if (years != null) __obj.updateDynamic("years")(years.asInstanceOf[js.Any])
    __obj.asInstanceOf[Converters]
  }
}

