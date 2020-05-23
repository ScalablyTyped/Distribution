package typings.oracleOraclejet.ojvalidationDatetimeMod.IntlDateTimeConverter

import typings.oracleOraclejet.oracleOraclejetStrings.`2-digit`
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.date
import typings.oracleOraclejet.oracleOraclejetStrings.datetime
import typings.oracleOraclejet.oracleOraclejetStrings.full
import typings.oracleOraclejet.oracleOraclejetStrings.local
import typings.oracleOraclejet.oracleOraclejetStrings.long
import typings.oracleOraclejet.oracleOraclejetStrings.medium
import typings.oracleOraclejet.oracleOraclejetStrings.narrow
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.numeric
import typings.oracleOraclejet.oracleOraclejetStrings.offset
import typings.oracleOraclejet.oracleOraclejetStrings.short
import typings.oracleOraclejet.oracleOraclejetStrings.time
import typings.oracleOraclejet.oracleOraclejetStrings.zulu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ConverterOptions extends js.Object {
  var dateFormat: js.UndefOr[short | medium | long | full] = js.undefined
  var day: js.UndefOr[`2-digit` | numeric] = js.undefined
  var dst: js.UndefOr[Boolean] = js.undefined
  var era: js.UndefOr[narrow | short | long] = js.undefined
  var formatType: js.UndefOr[date | time | datetime] = js.undefined
  var hour: js.UndefOr[`2-digit` | numeric] = js.undefined
  var hour12: js.UndefOr[Boolean] = js.undefined
  var isoStrFormat: js.UndefOr[offset | zulu | local | auto] = js.undefined
  var lenientParse: js.UndefOr[full | none] = js.undefined
  var millisecond: js.UndefOr[numeric] = js.undefined
  var minute: js.UndefOr[`2-digit` | numeric] = js.undefined
  var month: js.UndefOr[`2-digit` | numeric | narrow | short | long] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
  var second: js.UndefOr[`2-digit` | numeric] = js.undefined
  var timeFormat: js.UndefOr[short | medium | long | full] = js.undefined
  var timeZone: js.UndefOr[String] = js.undefined
  var timeZoneName: js.UndefOr[short | long] = js.undefined
  var `two-digit-year-start`: js.UndefOr[Double] = js.undefined
  var weekday: js.UndefOr[narrow | short | long] = js.undefined
  var year: js.UndefOr[`2-digit` | numeric] = js.undefined
}

object ConverterOptions {
  @scala.inline
  def apply(
    dateFormat: short | medium | long | full = null,
    day: `2-digit` | numeric = null,
    dst: js.UndefOr[Boolean] = js.undefined,
    era: narrow | short | long = null,
    formatType: date | time | datetime = null,
    hour: `2-digit` | numeric = null,
    hour12: js.UndefOr[Boolean] = js.undefined,
    isoStrFormat: offset | zulu | local | auto = null,
    lenientParse: full | none = null,
    millisecond: numeric = null,
    minute: `2-digit` | numeric = null,
    month: `2-digit` | numeric | narrow | short | long = null,
    pattern: String = null,
    second: `2-digit` | numeric = null,
    timeFormat: short | medium | long | full = null,
    timeZone: String = null,
    timeZoneName: short | long = null,
    `two-digit-year-start`: js.UndefOr[Double] = js.undefined,
    weekday: narrow | short | long = null,
    year: `2-digit` | numeric = null
  ): ConverterOptions = {
    val __obj = js.Dynamic.literal()
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (!js.isUndefined(dst)) __obj.updateDynamic("dst")(dst.get.asInstanceOf[js.Any])
    if (era != null) __obj.updateDynamic("era")(era.asInstanceOf[js.Any])
    if (formatType != null) __obj.updateDynamic("formatType")(formatType.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (!js.isUndefined(hour12)) __obj.updateDynamic("hour12")(hour12.get.asInstanceOf[js.Any])
    if (isoStrFormat != null) __obj.updateDynamic("isoStrFormat")(isoStrFormat.asInstanceOf[js.Any])
    if (lenientParse != null) __obj.updateDynamic("lenientParse")(lenientParse.asInstanceOf[js.Any])
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (timeFormat != null) __obj.updateDynamic("timeFormat")(timeFormat.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    if (timeZoneName != null) __obj.updateDynamic("timeZoneName")(timeZoneName.asInstanceOf[js.Any])
    if (!js.isUndefined(`two-digit-year-start`)) __obj.updateDynamic("two-digit-year-start")(`two-digit-year-start`.get.asInstanceOf[js.Any])
    if (weekday != null) __obj.updateDynamic("weekday")(weekday.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterOptions]
  }
}

