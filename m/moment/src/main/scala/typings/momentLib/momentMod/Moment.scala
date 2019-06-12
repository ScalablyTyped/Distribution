package typings
package momentLib.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Moment
  extends stdLib.Object
     with _LocaleSpecifier
     with _MomentInput {
  def add(): Moment = js.native
  def add(amount: DurationInputArg1): Moment = js.native
  def add(amount: DurationInputArg1, unit: DurationInputArg2): Moment = js.native
  def add(unit: momentLib.momentMod.unitOfTimeNs.DurationConstructor, amount: java.lang.String): Moment = js.native
  /**
    * @deprecated reverse syntax
    */
  def add(unit: momentLib.momentMod.unitOfTimeNs.DurationConstructor, amount: scala.Double): Moment = js.native
  def calendar(): java.lang.String = js.native
  def calendar(time: MomentInput): java.lang.String = js.native
  def calendar(time: MomentInput, formats: CalendarSpec): java.lang.String = js.native
  def creationData(): MomentCreationData = js.native
  def date(): scala.Double = js.native
  def date(d: scala.Double): Moment = js.native
  /**
    * @deprecated use date()
    */
  def dates(): scala.Double = js.native
  /**
    * @deprecated use date(d)
    */
  def dates(d: scala.Double): Moment = js.native
  def day(): scala.Double = js.native
  def day(d: java.lang.String): Moment = js.native
  def day(d: scala.Double): Moment = js.native
  def dayOfYear(): scala.Double = js.native
  def dayOfYear(d: scala.Double): Moment = js.native
  def days(): scala.Double = js.native
  def days(d: java.lang.String): Moment = js.native
  def days(d: scala.Double): Moment = js.native
  def daysInMonth(): scala.Double = js.native
  def diff(b: MomentInput): scala.Double = js.native
  def diff(b: MomentInput, unitOfTime: momentLib.momentMod.unitOfTimeNs.Diff): scala.Double = js.native
  def diff(b: MomentInput, unitOfTime: momentLib.momentMod.unitOfTimeNs.Diff, precise: scala.Boolean): scala.Double = js.native
  def endOf(unitOfTime: momentLib.momentMod.unitOfTimeNs.StartOf): Moment = js.native
  def format(): java.lang.String = js.native
  def format(format: java.lang.String): java.lang.String = js.native
  def from(inp: MomentInput): java.lang.String = js.native
  def from(inp: MomentInput, suffix: scala.Boolean): java.lang.String = js.native
  def fromNow(): java.lang.String = js.native
  def fromNow(withoutSuffix: scala.Boolean): java.lang.String = js.native
  def get(unit: momentLib.momentMod.unitOfTimeNs.All): scala.Double = js.native
  def hasAlignedHourOffset(): scala.Boolean = js.native
  def hasAlignedHourOffset(other: MomentInput): scala.Boolean = js.native
  def hour(): scala.Double = js.native
  def hour(h: scala.Double): Moment = js.native
  def hours(): scala.Double = js.native
  def hours(h: scala.Double): Moment = js.native
  def inspect(): java.lang.String = js.native
  def invalidAt(): scala.Double = js.native
  def isAfter(): scala.Boolean = js.native
  def isAfter(inp: MomentInput): scala.Boolean = js.native
  def isAfter(inp: MomentInput, granularity: momentLib.momentMod.unitOfTimeNs.StartOf): scala.Boolean = js.native
  def isBefore(): scala.Boolean = js.native
  def isBefore(inp: MomentInput): scala.Boolean = js.native
  def isBefore(inp: MomentInput, granularity: momentLib.momentMod.unitOfTimeNs.StartOf): scala.Boolean = js.native
  def isBetween(a: MomentInput, b: MomentInput): scala.Boolean = js.native
  def isBetween(a: MomentInput, b: MomentInput, granularity: momentLib.momentMod.unitOfTimeNs.StartOf): scala.Boolean = js.native
  def isBetween(
    a: MomentInput,
    b: MomentInput,
    granularity: momentLib.momentMod.unitOfTimeNs.StartOf,
    inclusivity: momentLib.momentLibStrings.`()`
  ): scala.Boolean = js.native
  def isBetween(
    a: MomentInput,
    b: MomentInput,
    granularity: momentLib.momentMod.unitOfTimeNs.StartOf,
    inclusivity: momentLib.momentLibStrings.`(]`
  ): scala.Boolean = js.native
  def isBetween(
    a: MomentInput,
    b: MomentInput,
    granularity: momentLib.momentMod.unitOfTimeNs.StartOf,
    inclusivity: momentLib.momentLibStrings.`[)`
  ): scala.Boolean = js.native
  def isBetween(
    a: MomentInput,
    b: MomentInput,
    granularity: momentLib.momentMod.unitOfTimeNs.StartOf,
    inclusivity: momentLib.momentLibStrings.`[]`
  ): scala.Boolean = js.native
  def isDST(): scala.Boolean = js.native
  /**
    * @deprecated no reliable implementation
    */
  def isDSTShifted(): scala.Boolean = js.native
  def isLeapYear(): scala.Boolean = js.native
  def isLocal(): scala.Boolean = js.native
  def isSame(): scala.Boolean = js.native
  def isSame(inp: MomentInput): scala.Boolean = js.native
  def isSame(inp: MomentInput, granularity: momentLib.momentMod.unitOfTimeNs.StartOf): scala.Boolean = js.native
  def isSameOrAfter(): scala.Boolean = js.native
  def isSameOrAfter(inp: MomentInput): scala.Boolean = js.native
  def isSameOrAfter(inp: MomentInput, granularity: momentLib.momentMod.unitOfTimeNs.StartOf): scala.Boolean = js.native
  def isSameOrBefore(): scala.Boolean = js.native
  def isSameOrBefore(inp: MomentInput): scala.Boolean = js.native
  def isSameOrBefore(inp: MomentInput, granularity: momentLib.momentMod.unitOfTimeNs.StartOf): scala.Boolean = js.native
  def isUTC(): scala.Boolean = js.native
  /**
    * @deprecated use isUTC
    */
  def isUtc(): scala.Boolean = js.native
  def isUtcOffset(): scala.Boolean = js.native
  def isValid(): scala.Boolean = js.native
  def isoWeek(): scala.Double = js.native
  def isoWeek(d: scala.Double): Moment = js.native
  def isoWeekYear(): scala.Double = js.native
  def isoWeekYear(d: scala.Double): Moment = js.native
  def isoWeekday(): scala.Double = js.native
  def isoWeekday(d: java.lang.String): Moment = js.native
  def isoWeekday(d: scala.Double): Moment = js.native
  def isoWeeks(): scala.Double = js.native
  def isoWeeks(d: scala.Double): Moment = js.native
  def isoWeeksInYear(): scala.Double = js.native
  /**
    * @deprecated as of 2.8.0, use locale
    */
  def lang(): Locale = js.native
  /**
    * @deprecated as of 2.8.0, use locale
    */
  def lang(language: LocaleSpecifier): Moment = js.native
  // current date/time in local mode
  def local(): Moment = js.native
  def local(keepLocalTime: scala.Boolean): Moment = js.native
  def locale(): java.lang.String = js.native
  def locale(locale: LocaleSpecifier): Moment = js.native
  def localeData(): Locale = js.native
  // NOTE(constructor): Same as moment constructor
  /**
    * @deprecated as of 2.7.0, use moment.min/max
    */
  def max(): Moment = js.native
  def max(inp: MomentInput): Moment = js.native
  def max(inp: MomentInput, format: MomentFormatSpecification): Moment = js.native
  def max(inp: MomentInput, format: MomentFormatSpecification, language: java.lang.String): Moment = js.native
  def max(
    inp: MomentInput,
    format: MomentFormatSpecification,
    language: java.lang.String,
    strict: scala.Boolean
  ): Moment = js.native
  def max(inp: MomentInput, format: MomentFormatSpecification, strict: scala.Boolean): Moment = js.native
  def millisecond(): scala.Double = js.native
  def millisecond(ms: scala.Double): Moment = js.native
  def milliseconds(): scala.Double = js.native
  def milliseconds(ms: scala.Double): Moment = js.native
  // NOTE(constructor): Same as moment constructor
  /**
    * @deprecated as of 2.7.0, use moment.min/max
    */
  def min(): Moment = js.native
  def min(inp: MomentInput): Moment = js.native
  def min(inp: MomentInput, format: MomentFormatSpecification): Moment = js.native
  def min(inp: MomentInput, format: MomentFormatSpecification, language: java.lang.String): Moment = js.native
  def min(
    inp: MomentInput,
    format: MomentFormatSpecification,
    language: java.lang.String,
    strict: scala.Boolean
  ): Moment = js.native
  def min(inp: MomentInput, format: MomentFormatSpecification, strict: scala.Boolean): Moment = js.native
  def minute(): scala.Double = js.native
  def minute(m: scala.Double): Moment = js.native
  def minutes(): scala.Double = js.native
  def minutes(m: scala.Double): Moment = js.native
  def month(): scala.Double = js.native
  def month(M: java.lang.String): Moment = js.native
  def month(M: scala.Double): Moment = js.native
  /**
    * @deprecated use month()
    */
  def months(): scala.Double = js.native
  def months(M: java.lang.String): Moment = js.native
  /**
    * @deprecated use month(M)
    */
  def months(M: scala.Double): Moment = js.native
  def parseZone(): Moment = js.native
  def parsingFlags(): MomentParsingFlags = js.native
  def quarter(): scala.Double = js.native
  def quarter(q: scala.Double): Moment = js.native
  def quarters(): scala.Double = js.native
  def quarters(q: scala.Double): Moment = js.native
  def second(): scala.Double = js.native
  def second(s: scala.Double): Moment = js.native
  def seconds(): scala.Double = js.native
  def seconds(s: scala.Double): Moment = js.native
  def set(objectLiteral: MomentSetObject): Moment = js.native
  def set(unit: momentLib.momentMod.unitOfTimeNs.All, value: scala.Double): Moment = js.native
  def startOf(unitOfTime: momentLib.momentMod.unitOfTimeNs.StartOf): Moment = js.native
  def subtract(): Moment = js.native
  def subtract(amount: DurationInputArg1): Moment = js.native
  def subtract(amount: DurationInputArg1, unit: DurationInputArg2): Moment = js.native
  def subtract(unit: momentLib.momentMod.unitOfTimeNs.DurationConstructor, amount: java.lang.String): Moment = js.native
  /**
    * @deprecated reverse syntax
    */
  def subtract(unit: momentLib.momentMod.unitOfTimeNs.DurationConstructor, amount: scala.Double): Moment = js.native
  def to(inp: MomentInput): java.lang.String = js.native
  def to(inp: MomentInput, suffix: scala.Boolean): java.lang.String = js.native
  def toArray(): js.Array[scala.Double] = js.native
  def toDate(): stdLib.Date = js.native
  def toISOString(): java.lang.String = js.native
  def toISOString(keepOffset: scala.Boolean): java.lang.String = js.native
  def toJSON(): java.lang.String = js.native
  def toNow(): java.lang.String = js.native
  def toNow(withoutPrefix: scala.Boolean): java.lang.String = js.native
  def toObject(): MomentObjectOutput = js.native
  def unix(): scala.Double = js.native
  // current date/time in UTC mode
  def utc(): Moment = js.native
  def utc(keepLocalTime: scala.Boolean): Moment = js.native
  def utcOffset(): scala.Double = js.native
  def utcOffset(b: java.lang.String): Moment = js.native
  def utcOffset(b: java.lang.String, keepLocalTime: scala.Boolean): Moment = js.native
  def utcOffset(b: scala.Double): Moment = js.native
  def utcOffset(b: scala.Double, keepLocalTime: scala.Boolean): Moment = js.native
  def week(): scala.Double = js.native
  def week(d: scala.Double): Moment = js.native
  def weekYear(): scala.Double = js.native
  def weekYear(d: scala.Double): Moment = js.native
  def weekday(): scala.Double = js.native
  def weekday(d: scala.Double): Moment = js.native
  def weeks(): scala.Double = js.native
  def weeks(d: scala.Double): Moment = js.native
  def weeksInYear(): scala.Double = js.native
  def year(): scala.Double = js.native
  def year(y: scala.Double): Moment = js.native
  /**
    * @deprecated use year()
    */
  def years(): scala.Double = js.native
  /**
    * @deprecated use year(y)
    */
  def years(y: scala.Double): Moment = js.native
  /**
    * @deprecated in favor of utcOffset
    */
  def zone(): scala.Double = js.native
  def zone(b: java.lang.String): Moment = js.native
  def zone(b: scala.Double): Moment = js.native
  def zoneAbbr(): java.lang.String = js.native
  def zoneName(): java.lang.String = js.native
}

