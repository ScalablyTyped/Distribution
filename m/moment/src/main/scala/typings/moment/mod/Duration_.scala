package typings.moment.mod

import typings.moment.mod.unitOfTime.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duration_
  extends _DurationInputArg1
     with _LocaleSpecifier {
  def abs(): Duration_ = js.native
  def add(): Duration_ = js.native
  def add(inp: DurationInputArg1): Duration_ = js.native
  def add(inp: DurationInputArg1, unit: DurationInputArg2): Duration_ = js.native
  def as(units: Base): Double = js.native
  def asDays(): Double = js.native
  def asHours(): Double = js.native
  def asMilliseconds(): Double = js.native
  def asMinutes(): Double = js.native
  def asMonths(): Double = js.native
  def asSeconds(): Double = js.native
  def asWeeks(): Double = js.native
  def asYears(): Double = js.native
  def days(): Double = js.native
  def get(units: Base): Double = js.native
  def hours(): Double = js.native
  def humanize(): String = js.native
  def humanize(argThresholds: argThresholdOpts): String = js.native
  def humanize(argWithSuffix: Boolean): String = js.native
  def humanize(argWithSuffix: Boolean, argThresholds: argThresholdOpts): String = js.native
  def isValid(): Boolean = js.native
  /**
    * @deprecated since version 2.8.0
    */
  def lang(): Locale_ = js.native
  /**
    * @deprecated since version 2.8.0
    */
  def lang(locale: LocaleSpecifier): Moment = js.native
  def locale(): String = js.native
  def locale(locale: LocaleSpecifier): Duration_ = js.native
  def localeData(): Locale_ = js.native
  def milliseconds(): Double = js.native
  def minutes(): Double = js.native
  def months(): Double = js.native
  def seconds(): Double = js.native
  def subtract(): Duration_ = js.native
  def subtract(inp: DurationInputArg1): Duration_ = js.native
  def subtract(inp: DurationInputArg1, unit: DurationInputArg2): Duration_ = js.native
  def toISOString(): String = js.native
  /**
    * @deprecated
    */
  def toIsoString(): String = js.native
  def toJSON(): String = js.native
  def weeks(): Double = js.native
  def years(): Double = js.native
}

