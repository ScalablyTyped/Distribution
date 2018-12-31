package typings
package momentLib.momentMod.momentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duration extends js.Object {
  def abs(): Duration = js.native
  def add(): Duration = js.native
  def add(inp: DurationInputArg1): Duration = js.native
  def add(inp: DurationInputArg1, unit: DurationInputArg2): Duration = js.native
  def as(units: momentLib.momentMod.momentNs.unitOfTimeNs.Base): scala.Double = js.native
  def asDays(): scala.Double = js.native
  def asHours(): scala.Double = js.native
  def asMilliseconds(): scala.Double = js.native
  def asMinutes(): scala.Double = js.native
  def asMonths(): scala.Double = js.native
  def asSeconds(): scala.Double = js.native
  def asWeeks(): scala.Double = js.native
  def asYears(): scala.Double = js.native
  def days(): scala.Double = js.native
  def get(units: momentLib.momentMod.momentNs.unitOfTimeNs.Base): scala.Double = js.native
  def hours(): scala.Double = js.native
  def humanize(): java.lang.String = js.native
  def humanize(withSuffix: scala.Boolean): java.lang.String = js.native
  def isValid(): scala.Boolean = js.native
  /**
    * @deprecated since version 2.8.0
    */
  def lang(): Locale = js.native
  /**
    * @deprecated since version 2.8.0
    */
  def lang(locale: LocaleSpecifier): Moment = js.native
  def locale(): java.lang.String = js.native
  def locale(locale: LocaleSpecifier): Duration = js.native
  def localeData(): Locale = js.native
  def milliseconds(): scala.Double = js.native
  def minutes(): scala.Double = js.native
  def months(): scala.Double = js.native
  def seconds(): scala.Double = js.native
  def subtract(): Duration = js.native
  def subtract(inp: DurationInputArg1): Duration = js.native
  def subtract(inp: DurationInputArg1, unit: DurationInputArg2): Duration = js.native
  def toISOString(): java.lang.String = js.native
  /**
    * @deprecated
    */
  def toIsoString(): java.lang.String = js.native
  def toJSON(): java.lang.String = js.native
  def weeks(): scala.Double = js.native
  def years(): scala.Double = js.native
}

