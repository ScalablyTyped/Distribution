package typings
package momentDashPreciseDashRangeDashPluginLib.momentDashPreciseDashRangeDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moment-precise-range-plugin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var ISO_8601: momentLib.momentMod.MomentBuiltinFormat = js.native
  var RFC_2822: momentLib.momentMod.MomentBuiltinFormat = js.native
  var defaultFormat: java.lang.String = js.native
  var defaultFormatUtc: java.lang.String = js.native
  var fn: momentLib.momentMod.Moment = js.native
  var version: java.lang.String = js.native
  def apply(): momentLib.momentMod.Moment = js.native
  def apply(inp: momentLib.momentMod.MomentInput): momentLib.momentMod.Moment = js.native
  def apply(inp: momentLib.momentMod.MomentInput, format: momentLib.momentMod.MomentFormatSpecification): momentLib.momentMod.Moment = js.native
  def apply(
    inp: momentLib.momentMod.MomentInput,
    format: momentLib.momentMod.MomentFormatSpecification,
    language: java.lang.String
  ): momentLib.momentMod.Moment = js.native
  def apply(
    inp: momentLib.momentMod.MomentInput,
    format: momentLib.momentMod.MomentFormatSpecification,
    language: java.lang.String,
    strict: scala.Boolean
  ): momentLib.momentMod.Moment = js.native
  def apply(
    inp: momentLib.momentMod.MomentInput,
    format: momentLib.momentMod.MomentFormatSpecification,
    strict: scala.Boolean
  ): momentLib.momentMod.Moment = js.native
  def calendarFormat(m: momentLib.momentMod.Moment, now: momentLib.momentMod.Moment): java.lang.String = js.native
  def defineLocale(language: java.lang.String, localeSpec: momentLib.momentMod.LocaleSpecification): momentLib.momentMod.Locale = js.native
  def defineLocale(language: java.lang.String, localeSpec: scala.Unit): momentLib.momentMod.Locale = js.native
  def duration(): momentLib.momentMod.Duration = js.native
  def duration(inp: momentLib.momentMod.DurationInputArg1): momentLib.momentMod.Duration = js.native
  def duration(inp: momentLib.momentMod.DurationInputArg1, unit: momentLib.momentMod.DurationInputArg2): momentLib.momentMod.Duration = js.native
  def invalid(): momentLib.momentMod.Moment = js.native
  def invalid(flags: momentLib.momentMod.MomentParsingFlagsOpt): momentLib.momentMod.Moment = js.native
  def isDate(m: js.Any): /* is std.Date */ scala.Boolean = js.native
  def isDuration(d: js.Any): /* is moment.moment.Duration */ scala.Boolean = js.native
  def isMoment(m: js.Any): /* is moment.moment.Moment */ scala.Boolean = js.native
  def lang(): java.lang.String = js.native
  def lang(language: java.lang.String): java.lang.String = js.native
  def lang(language: java.lang.String, definition: momentLib.momentMod.Locale): java.lang.String = js.native
  def locale(): java.lang.String = js.native
  def locale(language: java.lang.String): java.lang.String = js.native
  def locale(language: java.lang.String, definition: momentLib.momentMod.LocaleSpecification): java.lang.String = js.native
  def locale(language: java.lang.String, definition: scala.Unit): java.lang.String = js.native
  def locale(language: js.Array[java.lang.String]): java.lang.String = js.native
  def localeData(): momentLib.momentMod.Locale = js.native
  def localeData(key: java.lang.String): momentLib.momentMod.Locale = js.native
  def localeData(key: js.Array[java.lang.String]): momentLib.momentMod.Locale = js.native
  def locales(): js.Array[java.lang.String] = js.native
  def max(moments: momentLib.momentMod.Moment*): momentLib.momentMod.Moment = js.native
  def max(moments: js.Array[momentLib.momentMod.Moment]): momentLib.momentMod.Moment = js.native
  def min(moments: momentLib.momentMod.Moment*): momentLib.momentMod.Moment = js.native
  def min(moments: js.Array[momentLib.momentMod.Moment]): momentLib.momentMod.Moment = js.native
  def months(): js.Array[java.lang.String] = js.native
  def months(format: java.lang.String): js.Array[java.lang.String] = js.native
  def months(format: java.lang.String, index: scala.Double): java.lang.String = js.native
  def months(index: scala.Double): java.lang.String = js.native
  def monthsShort(): js.Array[java.lang.String] = js.native
  def monthsShort(format: java.lang.String): js.Array[java.lang.String] = js.native
  def monthsShort(format: java.lang.String, index: scala.Double): java.lang.String = js.native
  def monthsShort(index: scala.Double): java.lang.String = js.native
  def normalizeUnits(unit: momentLib.momentMod.unitOfTimeNs.All): java.lang.String = js.native
  def now(): scala.Double = js.native
  def parseTwoDigitYear(input: java.lang.String): scala.Double = js.native
  def parseZone(): momentLib.momentMod.Moment = js.native
  def parseZone(inp: momentLib.momentMod.MomentInput): momentLib.momentMod.Moment = js.native
  def parseZone(inp: momentLib.momentMod.MomentInput, format: momentLib.momentMod.MomentFormatSpecification): momentLib.momentMod.Moment = js.native
  def parseZone(
    inp: momentLib.momentMod.MomentInput,
    format: momentLib.momentMod.MomentFormatSpecification,
    language: java.lang.String
  ): momentLib.momentMod.Moment = js.native
  def parseZone(
    inp: momentLib.momentMod.MomentInput,
    format: momentLib.momentMod.MomentFormatSpecification,
    language: java.lang.String,
    strict: scala.Boolean
  ): momentLib.momentMod.Moment = js.native
  def parseZone(
    inp: momentLib.momentMod.MomentInput,
    format: momentLib.momentMod.MomentFormatSpecification,
    strict: scala.Boolean
  ): momentLib.momentMod.Moment = js.native
  def preciseDiff(
    d1: momentDashPreciseDashRangeDashPluginLib.momentDashPreciseDashRangeDashPluginMod.momentMod.Moment,
    d2: momentDashPreciseDashRangeDashPluginLib.momentDashPreciseDashRangeDashPluginMod.momentMod.Moment
  ): java.lang.String = js.native
  def preciseDiff(
    d1: momentDashPreciseDashRangeDashPluginLib.momentDashPreciseDashRangeDashPluginMod.momentMod.Moment,
    d2: momentDashPreciseDashRangeDashPluginLib.momentDashPreciseDashRangeDashPluginMod.momentMod.Moment,
    returnValueObject: momentDashPreciseDashRangeDashPluginLib.momentDashPreciseDashRangeDashPluginLibNumbers.`false`
  ): java.lang.String = js.native
  def preciseDiff(
    d1: momentDashPreciseDashRangeDashPluginLib.momentDashPreciseDashRangeDashPluginMod.momentMod.Moment,
    d2: momentDashPreciseDashRangeDashPluginLib.momentDashPreciseDashRangeDashPluginMod.momentMod.Moment,
    returnValueObject: momentDashPreciseDashRangeDashPluginLib.momentDashPreciseDashRangeDashPluginLibNumbers.`true`
  ): momentDashPreciseDashRangeDashPluginLib.momentDashPreciseDashRangeDashPluginMod.momentMod.PreciseRangeValueObject = js.native
  def relativeTimeRounding(): js.Function1[/* num */ scala.Double, scala.Double] = js.native
  def relativeTimeRounding(fn: js.Function1[/* num */ scala.Double, scala.Double]): scala.Boolean = js.native
  def relativeTimeThreshold(threshold: java.lang.String): scala.Double | scala.Boolean = js.native
  def relativeTimeThreshold(threshold: java.lang.String, limit: scala.Double): scala.Boolean = js.native
  def unix(timestamp: scala.Double): momentLib.momentMod.Moment = js.native
  def updateLocale(language: java.lang.String, localeSpec: momentLib.momentMod.LocaleSpecification): momentLib.momentMod.Locale = js.native
  def updateLocale(language: java.lang.String, localeSpec: scala.Unit): momentLib.momentMod.Locale = js.native
  def utc(): momentLib.momentMod.Moment = js.native
  def utc(inp: momentLib.momentMod.MomentInput): momentLib.momentMod.Moment = js.native
  def utc(inp: momentLib.momentMod.MomentInput, format: momentLib.momentMod.MomentFormatSpecification): momentLib.momentMod.Moment = js.native
  def utc(
    inp: momentLib.momentMod.MomentInput,
    format: momentLib.momentMod.MomentFormatSpecification,
    language: java.lang.String
  ): momentLib.momentMod.Moment = js.native
  def utc(
    inp: momentLib.momentMod.MomentInput,
    format: momentLib.momentMod.MomentFormatSpecification,
    language: java.lang.String,
    strict: scala.Boolean
  ): momentLib.momentMod.Moment = js.native
  def utc(
    inp: momentLib.momentMod.MomentInput,
    format: momentLib.momentMod.MomentFormatSpecification,
    strict: scala.Boolean
  ): momentLib.momentMod.Moment = js.native
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

