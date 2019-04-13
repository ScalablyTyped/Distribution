package typings
package momentLib.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moment", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var ISO_8601: MomentBuiltinFormat = js.native
  var RFC_2822: MomentBuiltinFormat = js.native
  var defaultFormat: java.lang.String = js.native
  var defaultFormatUtc: java.lang.String = js.native
  var fn: Moment = js.native
  var version: java.lang.String = js.native
  def apply(): Moment = js.native
  def apply(inp: MomentInput): Moment = js.native
  def apply(inp: MomentInput, format: MomentFormatSpecification): Moment = js.native
  def apply(inp: MomentInput, format: MomentFormatSpecification, language: java.lang.String): Moment = js.native
  def apply(
    inp: MomentInput,
    format: MomentFormatSpecification,
    language: java.lang.String,
    strict: scala.Boolean
  ): Moment = js.native
  def apply(inp: MomentInput, format: MomentFormatSpecification, strict: scala.Boolean): Moment = js.native
  def calendarFormat(m: Moment, now: Moment): java.lang.String = js.native
  def defineLocale(language: java.lang.String, localeSpec: LocaleSpecification): Locale = js.native
  def defineLocale(language: java.lang.String, localeSpec: scala.Unit): Locale = js.native
  def duration(): Duration = js.native
  def duration(inp: DurationInputArg1): Duration = js.native
  def duration(inp: DurationInputArg1, unit: DurationInputArg2): Duration = js.native
  def invalid(): Moment = js.native
  def invalid(flags: MomentParsingFlagsOpt): Moment = js.native
  def isDate(m: js.Any): /* is std.Date */ scala.Boolean = js.native
  def isDuration(d: js.Any): /* is moment.moment.Duration */ scala.Boolean = js.native
  def isMoment(m: js.Any): /* is moment.moment.Moment */ scala.Boolean = js.native
  def lang(): java.lang.String = js.native
  def lang(language: java.lang.String): java.lang.String = js.native
  def lang(language: java.lang.String, definition: Locale): java.lang.String = js.native
  def locale(): java.lang.String = js.native
  def locale(language: java.lang.String): java.lang.String = js.native
  def locale(language: java.lang.String, definition: LocaleSpecification): java.lang.String = js.native
  def locale(language: java.lang.String, definition: scala.Unit): java.lang.String = js.native
  def locale(language: js.Array[java.lang.String]): java.lang.String = js.native
  def localeData(): Locale = js.native
  def localeData(key: java.lang.String): Locale = js.native
  def localeData(key: js.Array[java.lang.String]): Locale = js.native
  def locales(): js.Array[java.lang.String] = js.native
  def max(moments: Moment*): Moment = js.native
  def max(moments: js.Array[Moment]): Moment = js.native
  def min(moments: Moment*): Moment = js.native
  def min(moments: js.Array[Moment]): Moment = js.native
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
  def parseZone(): Moment = js.native
  def parseZone(inp: MomentInput): Moment = js.native
  def parseZone(inp: MomentInput, format: MomentFormatSpecification): Moment = js.native
  def parseZone(inp: MomentInput, format: MomentFormatSpecification, language: java.lang.String): Moment = js.native
  def parseZone(
    inp: MomentInput,
    format: MomentFormatSpecification,
    language: java.lang.String,
    strict: scala.Boolean
  ): Moment = js.native
  def parseZone(inp: MomentInput, format: MomentFormatSpecification, strict: scala.Boolean): Moment = js.native
  def relativeTimeRounding(): js.Function1[/* num */ scala.Double, scala.Double] = js.native
  def relativeTimeRounding(fn: js.Function1[/* num */ scala.Double, scala.Double]): scala.Boolean = js.native
  def relativeTimeThreshold(threshold: java.lang.String): scala.Double | scala.Boolean = js.native
  def relativeTimeThreshold(threshold: java.lang.String, limit: scala.Double): scala.Boolean = js.native
  def unix(timestamp: scala.Double): Moment = js.native
  def updateLocale(language: java.lang.String, localeSpec: LocaleSpecification): Locale = js.native
  def updateLocale(language: java.lang.String, localeSpec: scala.Unit): Locale = js.native
  def utc(): Moment = js.native
  def utc(inp: MomentInput): Moment = js.native
  def utc(inp: MomentInput, format: MomentFormatSpecification): Moment = js.native
  def utc(inp: MomentInput, format: MomentFormatSpecification, language: java.lang.String): Moment = js.native
  def utc(
    inp: MomentInput,
    format: MomentFormatSpecification,
    language: java.lang.String,
    strict: scala.Boolean
  ): Moment = js.native
  def utc(inp: MomentInput, format: MomentFormatSpecification, strict: scala.Boolean): Moment = js.native
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

