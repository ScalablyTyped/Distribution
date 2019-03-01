package typings
package atOracleOraclejetLib.ojvalidationDashDatetimeMod.IntlDateTimeConverterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ConverterOptions extends js.Object {
  var dateFormat: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.short | atOracleOraclejetLib.atOracleOraclejetLibStrings.medium | atOracleOraclejetLib.atOracleOraclejetLibStrings.long | atOracleOraclejetLib.atOracleOraclejetLibStrings.full
  ] = js.undefined
  var day: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.`2-digit` | atOracleOraclejetLib.atOracleOraclejetLibStrings.numeric
  ] = js.undefined
  var dst: js.UndefOr[scala.Boolean] = js.undefined
  var era: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.narrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.short | atOracleOraclejetLib.atOracleOraclejetLibStrings.long
  ] = js.undefined
  var formatType: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.date | atOracleOraclejetLib.atOracleOraclejetLibStrings.time | atOracleOraclejetLib.atOracleOraclejetLibStrings.datetime
  ] = js.undefined
  var hour: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.`2-digit` | atOracleOraclejetLib.atOracleOraclejetLibStrings.numeric
  ] = js.undefined
  var hour12: js.UndefOr[scala.Boolean] = js.undefined
  var isoStrFormat: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.offset | atOracleOraclejetLib.atOracleOraclejetLibStrings.zulu | atOracleOraclejetLib.atOracleOraclejetLibStrings.local | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ] = js.undefined
  var lenientParse: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.full | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  ] = js.undefined
  var millisecond: js.UndefOr[atOracleOraclejetLib.atOracleOraclejetLibStrings.numeric] = js.undefined
  var minute: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.`2-digit` | atOracleOraclejetLib.atOracleOraclejetLibStrings.numeric
  ] = js.undefined
  var month: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.`2-digit` | atOracleOraclejetLib.atOracleOraclejetLibStrings.numeric | atOracleOraclejetLib.atOracleOraclejetLibStrings.narrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.short | atOracleOraclejetLib.atOracleOraclejetLibStrings.long
  ] = js.undefined
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  var second: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.`2-digit` | atOracleOraclejetLib.atOracleOraclejetLibStrings.numeric
  ] = js.undefined
  var timeFormat: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.short | atOracleOraclejetLib.atOracleOraclejetLibStrings.medium | atOracleOraclejetLib.atOracleOraclejetLibStrings.long | atOracleOraclejetLib.atOracleOraclejetLibStrings.full
  ] = js.undefined
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
  var timeZoneName: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.short | atOracleOraclejetLib.atOracleOraclejetLibStrings.long
  ] = js.undefined
  var `two-digit-year-start`: js.UndefOr[scala.Double] = js.undefined
  var weekday: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.narrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.short | atOracleOraclejetLib.atOracleOraclejetLibStrings.long
  ] = js.undefined
  var year: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.`2-digit` | atOracleOraclejetLib.atOracleOraclejetLibStrings.numeric
  ] = js.undefined
}

object ConverterOptions {
  @scala.inline
  def apply(
    dateFormat: atOracleOraclejetLib.atOracleOraclejetLibStrings.short | atOracleOraclejetLib.atOracleOraclejetLibStrings.medium | atOracleOraclejetLib.atOracleOraclejetLibStrings.long | atOracleOraclejetLib.atOracleOraclejetLibStrings.full = null,
    day: atOracleOraclejetLib.atOracleOraclejetLibStrings.`2-digit` | atOracleOraclejetLib.atOracleOraclejetLibStrings.numeric = null,
    dst: js.UndefOr[scala.Boolean] = js.undefined,
    era: atOracleOraclejetLib.atOracleOraclejetLibStrings.narrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.short | atOracleOraclejetLib.atOracleOraclejetLibStrings.long = null,
    formatType: atOracleOraclejetLib.atOracleOraclejetLibStrings.date | atOracleOraclejetLib.atOracleOraclejetLibStrings.time | atOracleOraclejetLib.atOracleOraclejetLibStrings.datetime = null,
    hour: atOracleOraclejetLib.atOracleOraclejetLibStrings.`2-digit` | atOracleOraclejetLib.atOracleOraclejetLibStrings.numeric = null,
    hour12: js.UndefOr[scala.Boolean] = js.undefined,
    isoStrFormat: atOracleOraclejetLib.atOracleOraclejetLibStrings.offset | atOracleOraclejetLib.atOracleOraclejetLibStrings.zulu | atOracleOraclejetLib.atOracleOraclejetLibStrings.local | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = null,
    lenientParse: atOracleOraclejetLib.atOracleOraclejetLibStrings.full | atOracleOraclejetLib.atOracleOraclejetLibStrings.none = null,
    millisecond: atOracleOraclejetLib.atOracleOraclejetLibStrings.numeric = null,
    minute: atOracleOraclejetLib.atOracleOraclejetLibStrings.`2-digit` | atOracleOraclejetLib.atOracleOraclejetLibStrings.numeric = null,
    month: atOracleOraclejetLib.atOracleOraclejetLibStrings.`2-digit` | atOracleOraclejetLib.atOracleOraclejetLibStrings.numeric | atOracleOraclejetLib.atOracleOraclejetLibStrings.narrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.short | atOracleOraclejetLib.atOracleOraclejetLibStrings.long = null,
    pattern: java.lang.String = null,
    second: atOracleOraclejetLib.atOracleOraclejetLibStrings.`2-digit` | atOracleOraclejetLib.atOracleOraclejetLibStrings.numeric = null,
    timeFormat: atOracleOraclejetLib.atOracleOraclejetLibStrings.short | atOracleOraclejetLib.atOracleOraclejetLibStrings.medium | atOracleOraclejetLib.atOracleOraclejetLibStrings.long | atOracleOraclejetLib.atOracleOraclejetLibStrings.full = null,
    timeZone: java.lang.String = null,
    timeZoneName: atOracleOraclejetLib.atOracleOraclejetLibStrings.short | atOracleOraclejetLib.atOracleOraclejetLibStrings.long = null,
    `two-digit-year-start`: scala.Int | scala.Double = null,
    weekday: atOracleOraclejetLib.atOracleOraclejetLibStrings.narrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.short | atOracleOraclejetLib.atOracleOraclejetLibStrings.long = null,
    year: atOracleOraclejetLib.atOracleOraclejetLibStrings.`2-digit` | atOracleOraclejetLib.atOracleOraclejetLibStrings.numeric = null
  ): ConverterOptions = {
    val __obj = js.Dynamic.literal()
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (!js.isUndefined(dst)) __obj.updateDynamic("dst")(dst)
    if (era != null) __obj.updateDynamic("era")(era.asInstanceOf[js.Any])
    if (formatType != null) __obj.updateDynamic("formatType")(formatType.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (!js.isUndefined(hour12)) __obj.updateDynamic("hour12")(hour12)
    if (isoStrFormat != null) __obj.updateDynamic("isoStrFormat")(isoStrFormat.asInstanceOf[js.Any])
    if (lenientParse != null) __obj.updateDynamic("lenientParse")(lenientParse.asInstanceOf[js.Any])
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond)
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (timeFormat != null) __obj.updateDynamic("timeFormat")(timeFormat.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    if (timeZoneName != null) __obj.updateDynamic("timeZoneName")(timeZoneName.asInstanceOf[js.Any])
    if (`two-digit-year-start` != null) __obj.updateDynamic("two-digit-year-start")(`two-digit-year-start`.asInstanceOf[js.Any])
    if (weekday != null) __obj.updateDynamic("weekday")(weekday.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterOptions]
  }
}

