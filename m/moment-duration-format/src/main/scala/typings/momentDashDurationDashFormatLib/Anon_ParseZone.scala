package typings
package momentDashDurationDashFormatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ParseZone extends js.Object {
  var HTML5_FMT: momentLib.Anon_DATETIMELOCALSECONDS = js.native
  var ISO_8601: momentLib.momentMod.momentNs.MomentBuiltinFormat = js.native
  var RFC_2822: momentLib.momentMod.momentNs.MomentBuiltinFormat = js.native
  var defaultFormat: java.lang.String = js.native
  var defaultFormatUtc: java.lang.String = js.native
  var fn: momentLib.momentMod.momentNs.Moment = js.native
  var version: java.lang.String = js.native
  def apply(): momentLib.momentMod.momentNs.Moment = js.native
  def apply(inp: momentLib.momentMod.momentNs.MomentInput): momentLib.momentMod.momentNs.Moment = js.native
  def apply(
    inp: momentLib.momentMod.momentNs.MomentInput,
    format: momentLib.momentMod.momentNs.MomentFormatSpecification
  ): momentLib.momentMod.momentNs.Moment = js.native
  def apply(
    inp: momentLib.momentMod.momentNs.MomentInput,
    format: momentLib.momentMod.momentNs.MomentFormatSpecification,
    language: java.lang.String
  ): momentLib.momentMod.momentNs.Moment = js.native
  def apply(
    inp: momentLib.momentMod.momentNs.MomentInput,
    format: momentLib.momentMod.momentNs.MomentFormatSpecification,
    language: java.lang.String,
    strict: scala.Boolean
  ): momentLib.momentMod.momentNs.Moment = js.native
  def apply(
    inp: momentLib.momentMod.momentNs.MomentInput,
    format: momentLib.momentMod.momentNs.MomentFormatSpecification,
    strict: scala.Boolean
  ): momentLib.momentMod.momentNs.Moment = js.native
  def calendarFormat(m: momentLib.momentMod.momentNs.Moment, now: momentLib.momentMod.momentNs.Moment): java.lang.String = js.native
  def defineLocale(language: java.lang.String, localeSpec: momentLib.momentMod.momentNs.LocaleSpecification): momentLib.momentMod.momentNs.Locale = js.native
  def defineLocale(language: java.lang.String, localeSpec: scala.Unit): momentLib.momentMod.momentNs.Locale = js.native
  def duration(): momentLib.momentMod.momentNs.Duration = js.native
  def duration(inp: momentLib.momentMod.momentNs.DurationInputArg1): momentLib.momentMod.momentNs.Duration = js.native
  def duration(
    inp: momentLib.momentMod.momentNs.DurationInputArg1,
    unit: momentLib.momentMod.momentNs.DurationInputArg2
  ): momentLib.momentMod.momentNs.Duration = js.native
  def invalid(): momentLib.momentMod.momentNs.Moment = js.native
  def invalid(flags: momentLib.momentMod.momentNs.MomentParsingFlagsOpt): momentLib.momentMod.momentNs.Moment = js.native
  def isDate(m: js.Any): /* is std.Date */ scala.Boolean = js.native
  def isDuration(d: js.Any): /* is moment.moment.moment.Duration */ scala.Boolean = js.native
  def isMoment(m: js.Any): /* is moment.moment.moment.Moment */ scala.Boolean = js.native
  def lang(): java.lang.String = js.native
  def lang(language: java.lang.String): java.lang.String = js.native
  def lang(language: java.lang.String, definition: momentLib.momentMod.momentNs.Locale): java.lang.String = js.native
  def locale(): java.lang.String = js.native
  def locale(language: java.lang.String): java.lang.String = js.native
  def locale(language: java.lang.String, definition: momentLib.momentMod.momentNs.LocaleSpecification): java.lang.String = js.native
  def locale(language: java.lang.String, definition: scala.Unit): java.lang.String = js.native
  def locale(language: js.Array[java.lang.String]): java.lang.String = js.native
  def localeData(): momentLib.momentMod.momentNs.Locale = js.native
  def localeData(key: java.lang.String): momentLib.momentMod.momentNs.Locale = js.native
  def localeData(key: js.Array[java.lang.String]): momentLib.momentMod.momentNs.Locale = js.native
  def locales(): js.Array[java.lang.String] = js.native
  def max(moments: momentLib.momentMod.momentNs.Moment*): momentLib.momentMod.momentNs.Moment = js.native
  def max(moments: js.Array[momentLib.momentMod.momentNs.Moment]): momentLib.momentMod.momentNs.Moment = js.native
  def min(moments: momentLib.momentMod.momentNs.Moment*): momentLib.momentMod.momentNs.Moment = js.native
  def min(moments: js.Array[momentLib.momentMod.momentNs.Moment]): momentLib.momentMod.momentNs.Moment = js.native
  def months(): js.Array[java.lang.String] = js.native
  def months(format: java.lang.String): js.Array[java.lang.String] = js.native
  def months(format: java.lang.String, index: scala.Double): java.lang.String = js.native
  def months(index: scala.Double): java.lang.String = js.native
  def monthsShort(): js.Array[java.lang.String] = js.native
  def monthsShort(format: java.lang.String): js.Array[java.lang.String] = js.native
  def monthsShort(format: java.lang.String, index: scala.Double): java.lang.String = js.native
  def monthsShort(index: scala.Double): java.lang.String = js.native
  def normalizeUnits(unit: momentLib.momentMod.momentNs.unitOfTimeNs.All): java.lang.String = js.native
  def now(): scala.Double = js.native
  def parseTwoDigitYear(input: java.lang.String): scala.Double = js.native
  def parseZone(): momentLib.momentMod.momentNs.Moment = js.native
  def parseZone(inp: momentLib.momentMod.momentNs.MomentInput): momentLib.momentMod.momentNs.Moment = js.native
  def parseZone(
    inp: momentLib.momentMod.momentNs.MomentInput,
    format: momentLib.momentMod.momentNs.MomentFormatSpecification
  ): momentLib.momentMod.momentNs.Moment = js.native
  def parseZone(
    inp: momentLib.momentMod.momentNs.MomentInput,
    format: momentLib.momentMod.momentNs.MomentFormatSpecification,
    language: java.lang.String
  ): momentLib.momentMod.momentNs.Moment = js.native
  def parseZone(
    inp: momentLib.momentMod.momentNs.MomentInput,
    format: momentLib.momentMod.momentNs.MomentFormatSpecification,
    language: java.lang.String,
    strict: scala.Boolean
  ): momentLib.momentMod.momentNs.Moment = js.native
  def parseZone(
    inp: momentLib.momentMod.momentNs.MomentInput,
    format: momentLib.momentMod.momentNs.MomentFormatSpecification,
    strict: scala.Boolean
  ): momentLib.momentMod.momentNs.Moment = js.native
  def relativeTimeRounding(): js.Function1[/* num */ scala.Double, scala.Double] = js.native
  def relativeTimeRounding(fn: js.Function1[/* num */ scala.Double, scala.Double]): scala.Boolean = js.native
  def relativeTimeThreshold(threshold: java.lang.String): scala.Double | scala.Boolean = js.native
  def relativeTimeThreshold(threshold: java.lang.String, limit: scala.Double): scala.Boolean = js.native
  def unix(timestamp: scala.Double): momentLib.momentMod.momentNs.Moment = js.native
  def updateLocale(language: java.lang.String, localeSpec: momentLib.momentMod.momentNs.LocaleSpecification): momentLib.momentMod.momentNs.Locale = js.native
  def updateLocale(language: java.lang.String, localeSpec: scala.Unit): momentLib.momentMod.momentNs.Locale = js.native
  def utc(): momentLib.momentMod.momentNs.Moment = js.native
  def utc(inp: momentLib.momentMod.momentNs.MomentInput): momentLib.momentMod.momentNs.Moment = js.native
  def utc(
    inp: momentLib.momentMod.momentNs.MomentInput,
    format: momentLib.momentMod.momentNs.MomentFormatSpecification
  ): momentLib.momentMod.momentNs.Moment = js.native
  def utc(
    inp: momentLib.momentMod.momentNs.MomentInput,
    format: momentLib.momentMod.momentNs.MomentFormatSpecification,
    language: java.lang.String
  ): momentLib.momentMod.momentNs.Moment = js.native
  def utc(
    inp: momentLib.momentMod.momentNs.MomentInput,
    format: momentLib.momentMod.momentNs.MomentFormatSpecification,
    language: java.lang.String,
    strict: scala.Boolean
  ): momentLib.momentMod.momentNs.Moment = js.native
  def utc(
    inp: momentLib.momentMod.momentNs.MomentInput,
    format: momentLib.momentMod.momentNs.MomentFormatSpecification,
    strict: scala.Boolean
  ): momentLib.momentMod.momentNs.Moment = js.native
  def weekdays(): js.Array[java.lang.String] = js.native
  def weekdays(format: java.lang.String): js.Array[java.lang.String] = js.native
  def weekdays(format: java.lang.String, index: scala.Double): java.lang.String = js.native
  def weekdays(index: scala.Double): java.lang.String = js.native
  def weekdays(localeSorted: scala.Boolean): js.Array[java.lang.String] = js.native
  def weekdays(localeSorted: scala.Boolean, format: java.lang.String): js.Array[java.lang.String] = js.native
  def weekdays(localeSorted: scala.Boolean, format: java.lang.String, index: scala.Double): java.lang.String = js.native
  def weekdays(localeSorted: scala.Boolean, index: scala.Double): java.lang.String = js.native
  def weekdaysMin(): js.Array[java.lang.String] = js.native
  def weekdaysMin(format: java.lang.String): js.Array[java.lang.String] = js.native
  def weekdaysMin(format: java.lang.String, index: scala.Double): java.lang.String = js.native
  def weekdaysMin(index: scala.Double): java.lang.String = js.native
  def weekdaysMin(localeSorted: scala.Boolean): js.Array[java.lang.String] = js.native
  def weekdaysMin(localeSorted: scala.Boolean, format: java.lang.String): js.Array[java.lang.String] = js.native
  def weekdaysMin(localeSorted: scala.Boolean, format: java.lang.String, index: scala.Double): java.lang.String = js.native
  def weekdaysMin(localeSorted: scala.Boolean, index: scala.Double): java.lang.String = js.native
  def weekdaysShort(): js.Array[java.lang.String] = js.native
  def weekdaysShort(format: java.lang.String): js.Array[java.lang.String] = js.native
  def weekdaysShort(format: java.lang.String, index: scala.Double): java.lang.String = js.native
  def weekdaysShort(index: scala.Double): java.lang.String = js.native
  def weekdaysShort(localeSorted: scala.Boolean): js.Array[java.lang.String] = js.native
  def weekdaysShort(localeSorted: scala.Boolean, format: java.lang.String): js.Array[java.lang.String] = js.native
  def weekdaysShort(localeSorted: scala.Boolean, format: java.lang.String, index: scala.Double): java.lang.String = js.native
  def weekdaysShort(localeSorted: scala.Boolean, index: scala.Double): java.lang.String = js.native
}

