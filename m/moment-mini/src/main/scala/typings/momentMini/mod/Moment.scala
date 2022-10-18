package typings.momentMini.mod

import typings.momentMini.mod.unitOfTime.All
import typings.momentMini.mod.unitOfTime.Diff
import typings.momentMini.mod.unitOfTime.DurationConstructor
import typings.momentMini.mod.unitOfTime.StartOf
import typings.momentMini.momentMiniStrings.`[]`
import typings.std.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Moment
  extends StObject
     with Object
     with _LocaleSpecifier
     with _MomentInput {
  
  def add(): Moment = js.native
  def add(amount: Unit, unit: DurationInputArg2): Moment = js.native
  def add(amount: DurationInputArg1): Moment = js.native
  def add(amount: DurationInputArg1, unit: DurationInputArg2): Moment = js.native
  def add(unit: DurationConstructor, amount: String): Moment = js.native
  /**
    * @deprecated reverse syntax
    */
  def add(unit: DurationConstructor, amount: Double): Moment = js.native
  
  def calendar(): String = js.native
  def calendar(formats: CalendarSpec): String = js.native
  def calendar(time: MomentInput): String = js.native
  def calendar(time: MomentInput, formats: CalendarSpec): String = js.native
  
  def creationData(): MomentCreationData = js.native
  
  def date(): Double = js.native
  def date(d: Double): Moment = js.native
  
  /**
    * @deprecated use date()
    */
  def dates(): Double = js.native
  /**
    * @deprecated use date(d)
    */
  def dates(d: Double): Moment = js.native
  
  def day(): Double = js.native
  def day(d: String): Moment = js.native
  def day(d: Double): Moment = js.native
  
  def dayOfYear(): Double = js.native
  def dayOfYear(d: Double): Moment = js.native
  
  def days(): Double = js.native
  def days(d: String): Moment = js.native
  def days(d: Double): Moment = js.native
  
  def daysInMonth(): Double = js.native
  
  def diff(b: MomentInput): Double = js.native
  def diff(b: MomentInput, unitOfTime: Unit, precise: Boolean): Double = js.native
  def diff(b: MomentInput, unitOfTime: Diff): Double = js.native
  def diff(b: MomentInput, unitOfTime: Diff, precise: Boolean): Double = js.native
  
  def endOf(unitOfTime: StartOf): Moment = js.native
  
  def format(): String = js.native
  def format(format: String): String = js.native
  
  def from(inp: MomentInput): String = js.native
  def from(inp: MomentInput, suffix: Boolean): String = js.native
  
  def fromNow(): String = js.native
  def fromNow(withoutSuffix: Boolean): String = js.native
  
  def get(unit: All): Double = js.native
  
  def hasAlignedHourOffset(): Boolean = js.native
  def hasAlignedHourOffset(other: MomentInput): Boolean = js.native
  
  def hour(): Double = js.native
  def hour(h: Double): Moment = js.native
  
  def hours(): Double = js.native
  def hours(h: Double): Moment = js.native
  
  def inspect(): String = js.native
  
  def invalidAt(): Double = js.native
  
  def isAfter(): Boolean = js.native
  def isAfter(inp: Unit, granularity: StartOf): Boolean = js.native
  def isAfter(inp: MomentInput): Boolean = js.native
  def isAfter(inp: MomentInput, granularity: StartOf): Boolean = js.native
  
  def isBefore(): Boolean = js.native
  def isBefore(inp: Unit, granularity: StartOf): Boolean = js.native
  def isBefore(inp: MomentInput): Boolean = js.native
  def isBefore(inp: MomentInput, granularity: StartOf): Boolean = js.native
  
  def isBetween(a: MomentInput, b: MomentInput): Boolean = js.native
  def isBetween(a: MomentInput, b: MomentInput, granularity: Unit, inclusivity: (/* () */ String) | `[]`): Boolean = js.native
  def isBetween(a: MomentInput, b: MomentInput, granularity: StartOf): Boolean = js.native
  def isBetween(a: MomentInput, b: MomentInput, granularity: StartOf, inclusivity: (/* () */ String) | `[]`): Boolean = js.native
  
  def isDST(): Boolean = js.native
  
  /**
    * @deprecated no reliable implementation
    */
  def isDSTShifted(): Boolean = js.native
  
  def isLeapYear(): Boolean = js.native
  
  def isLocal(): Boolean = js.native
  
  def isSame(): Boolean = js.native
  def isSame(inp: Unit, granularity: StartOf): Boolean = js.native
  def isSame(inp: MomentInput): Boolean = js.native
  def isSame(inp: MomentInput, granularity: StartOf): Boolean = js.native
  
  def isSameOrAfter(): Boolean = js.native
  def isSameOrAfter(inp: Unit, granularity: StartOf): Boolean = js.native
  def isSameOrAfter(inp: MomentInput): Boolean = js.native
  def isSameOrAfter(inp: MomentInput, granularity: StartOf): Boolean = js.native
  
  def isSameOrBefore(): Boolean = js.native
  def isSameOrBefore(inp: Unit, granularity: StartOf): Boolean = js.native
  def isSameOrBefore(inp: MomentInput): Boolean = js.native
  def isSameOrBefore(inp: MomentInput, granularity: StartOf): Boolean = js.native
  
  def isUTC(): Boolean = js.native
  
  /**
    * @deprecated use isUTC
    */
  def isUtc(): Boolean = js.native
  
  def isUtcOffset(): Boolean = js.native
  
  def isValid(): Boolean = js.native
  
  def isoWeek(): Double = js.native
  def isoWeek(d: Double): Moment = js.native
  
  def isoWeekYear(): Double = js.native
  def isoWeekYear(d: Double): Moment = js.native
  
  def isoWeekday(): Double = js.native
  def isoWeekday(d: String): Moment = js.native
  def isoWeekday(d: Double): Moment = js.native
  
  def isoWeeks(): Double = js.native
  def isoWeeks(d: Double): Moment = js.native
  
  def isoWeeksInISOWeekYear(): Double = js.native
  
  def isoWeeksInYear(): Double = js.native
  
  /**
    * @deprecated as of 2.8.0, use locale
    */
  def lang(): Locale_ = js.native
  /**
    * @deprecated as of 2.8.0, use locale
    */
  def lang(language: LocaleSpecifier): Moment = js.native
  
  // current date/time in local mode
  def local(): Moment = js.native
  def local(keepLocalTime: Boolean): Moment = js.native
  
  def locale(): String = js.native
  def locale(locale: LocaleSpecifier): Moment = js.native
  
  def localeData(): Locale_ = js.native
  
  // NOTE(constructor): Same as moment constructor
  /**
    * @deprecated as of 2.7.0, use moment.min/max
    */
  def max(): Moment = js.native
  def max(inp: Unit, format: Unit, language: String): Moment = js.native
  def max(inp: Unit, format: Unit, language: String, strict: Boolean): Moment = js.native
  def max(inp: Unit, format: Unit, language: Unit, strict: Boolean): Moment = js.native
  def max(inp: Unit, format: Unit, strict: Boolean): Moment = js.native
  def max(inp: Unit, format: MomentFormatSpecification): Moment = js.native
  def max(inp: Unit, format: MomentFormatSpecification, language: String): Moment = js.native
  def max(inp: Unit, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = js.native
  def max(inp: Unit, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment = js.native
  def max(inp: Unit, format: MomentFormatSpecification, strict: Boolean): Moment = js.native
  def max(inp: MomentInput): Moment = js.native
  def max(inp: MomentInput, format: Unit, language: String): Moment = js.native
  def max(inp: MomentInput, format: Unit, language: String, strict: Boolean): Moment = js.native
  def max(inp: MomentInput, format: Unit, language: Unit, strict: Boolean): Moment = js.native
  def max(inp: MomentInput, format: Unit, strict: Boolean): Moment = js.native
  def max(inp: MomentInput, format: MomentFormatSpecification): Moment = js.native
  def max(inp: MomentInput, format: MomentFormatSpecification, language: String): Moment = js.native
  def max(inp: MomentInput, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = js.native
  def max(inp: MomentInput, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment = js.native
  def max(inp: MomentInput, format: MomentFormatSpecification, strict: Boolean): Moment = js.native
  
  def millisecond(): Double = js.native
  def millisecond(ms: Double): Moment = js.native
  
  def milliseconds(): Double = js.native
  def milliseconds(ms: Double): Moment = js.native
  
  // NOTE(constructor): Same as moment constructor
  /**
    * @deprecated as of 2.7.0, use moment.min/max
    */
  def min(): Moment = js.native
  def min(inp: Unit, format: Unit, language: String): Moment = js.native
  def min(inp: Unit, format: Unit, language: String, strict: Boolean): Moment = js.native
  def min(inp: Unit, format: Unit, language: Unit, strict: Boolean): Moment = js.native
  def min(inp: Unit, format: Unit, strict: Boolean): Moment = js.native
  def min(inp: Unit, format: MomentFormatSpecification): Moment = js.native
  def min(inp: Unit, format: MomentFormatSpecification, language: String): Moment = js.native
  def min(inp: Unit, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = js.native
  def min(inp: Unit, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment = js.native
  def min(inp: Unit, format: MomentFormatSpecification, strict: Boolean): Moment = js.native
  def min(inp: MomentInput): Moment = js.native
  def min(inp: MomentInput, format: Unit, language: String): Moment = js.native
  def min(inp: MomentInput, format: Unit, language: String, strict: Boolean): Moment = js.native
  def min(inp: MomentInput, format: Unit, language: Unit, strict: Boolean): Moment = js.native
  def min(inp: MomentInput, format: Unit, strict: Boolean): Moment = js.native
  def min(inp: MomentInput, format: MomentFormatSpecification): Moment = js.native
  def min(inp: MomentInput, format: MomentFormatSpecification, language: String): Moment = js.native
  def min(inp: MomentInput, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = js.native
  def min(inp: MomentInput, format: MomentFormatSpecification, language: Unit, strict: Boolean): Moment = js.native
  def min(inp: MomentInput, format: MomentFormatSpecification, strict: Boolean): Moment = js.native
  
  def minute(): Double = js.native
  def minute(m: Double): Moment = js.native
  
  def minutes(): Double = js.native
  def minutes(m: Double): Moment = js.native
  
  def month(): Double = js.native
  def month(M: String): Moment = js.native
  def month(M: Double): Moment = js.native
  
  /**
    * @deprecated use month()
    */
  def months(): Double = js.native
  def months(M: String): Moment = js.native
  /**
    * @deprecated use month(M)
    */
  def months(M: Double): Moment = js.native
  
  def parseZone(): Moment = js.native
  
  def parsingFlags(): MomentParsingFlags = js.native
  
  def quarter(): Double = js.native
  def quarter(q: Double): Moment = js.native
  
  def quarters(): Double = js.native
  def quarters(q: Double): Moment = js.native
  
  def second(): Double = js.native
  def second(s: Double): Moment = js.native
  
  def seconds(): Double = js.native
  def seconds(s: Double): Moment = js.native
  
  def set(objectLiteral: MomentSetObject): Moment = js.native
  def set(unit: All, value: Double): Moment = js.native
  
  def startOf(unitOfTime: StartOf): Moment = js.native
  
  def subtract(): Moment = js.native
  def subtract(amount: Unit, unit: DurationInputArg2): Moment = js.native
  def subtract(amount: DurationInputArg1): Moment = js.native
  def subtract(amount: DurationInputArg1, unit: DurationInputArg2): Moment = js.native
  def subtract(unit: DurationConstructor, amount: String): Moment = js.native
  /**
    * @deprecated reverse syntax
    */
  def subtract(unit: DurationConstructor, amount: Double): Moment = js.native
  
  def to(inp: MomentInput): String = js.native
  def to(inp: MomentInput, suffix: Boolean): String = js.native
  
  def toArray(): js.Array[Double] = js.native
  
  def toDate(): js.Date = js.native
  
  def toISOString(): String = js.native
  def toISOString(keepOffset: Boolean): String = js.native
  
  def toJSON(): String = js.native
  
  def toNow(): String = js.native
  def toNow(withoutPrefix: Boolean): String = js.native
  
  def toObject(): MomentObjectOutput = js.native
  
  def unix(): Double = js.native
  
  // current date/time in UTC mode
  def utc(): Moment = js.native
  def utc(keepLocalTime: Boolean): Moment = js.native
  
  def utcOffset(): Double = js.native
  def utcOffset(b: String): Moment = js.native
  def utcOffset(b: String, keepLocalTime: Boolean): Moment = js.native
  def utcOffset(b: Double): Moment = js.native
  def utcOffset(b: Double, keepLocalTime: Boolean): Moment = js.native
  
  def week(): Double = js.native
  def week(d: Double): Moment = js.native
  
  def weekYear(): Double = js.native
  def weekYear(d: Double): Moment = js.native
  
  def weekday(): Double = js.native
  def weekday(d: Double): Moment = js.native
  
  def weeks(): Double = js.native
  def weeks(d: Double): Moment = js.native
  
  def weeksInWeekYear(): Double = js.native
  
  def weeksInYear(): Double = js.native
  
  def year(): Double = js.native
  def year(y: Double): Moment = js.native
  
  /**
    * @deprecated use year()
    */
  def years(): Double = js.native
  /**
    * @deprecated use year(y)
    */
  def years(y: Double): Moment = js.native
  
  /**
    * @deprecated in favor of utcOffset
    */
  def zone(): Double = js.native
  def zone(b: String): Moment = js.native
  def zone(b: Double): Moment = js.native
  
  def zoneAbbr(): String = js.native
  
  def zoneName(): String = js.native
}
