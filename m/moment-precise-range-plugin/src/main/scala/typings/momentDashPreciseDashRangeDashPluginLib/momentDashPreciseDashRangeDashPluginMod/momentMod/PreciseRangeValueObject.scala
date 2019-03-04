package typings
package momentDashPreciseDashRangeDashPluginLib.momentDashPreciseDashRangeDashPluginMod.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreciseRangeValueObject extends js.Object {
  var days: scala.Double
  var firstDateWasLater: scala.Boolean
  var hours: scala.Double
  var minutes: scala.Double
  var months: scala.Double
  var seconds: scala.Double
  var years: scala.Double
}

object PreciseRangeValueObject {
  @scala.inline
  def apply(
    days: scala.Double,
    firstDateWasLater: scala.Boolean,
    hours: scala.Double,
    minutes: scala.Double,
    months: scala.Double,
    seconds: scala.Double,
    years: scala.Double
  ): PreciseRangeValueObject = {
    val __obj = js.Dynamic.literal(days = days, firstDateWasLater = firstDateWasLater, hours = hours, minutes = minutes, months = months, seconds = seconds, years = years)
  
    __obj.asInstanceOf[PreciseRangeValueObject]
  }
}

