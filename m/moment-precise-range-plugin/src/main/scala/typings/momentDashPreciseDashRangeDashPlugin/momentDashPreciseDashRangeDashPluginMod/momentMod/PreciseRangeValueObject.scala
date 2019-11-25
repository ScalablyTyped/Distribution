package typings.momentDashPreciseDashRangeDashPlugin.momentDashPreciseDashRangeDashPluginMod.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreciseRangeValueObject extends js.Object {
  var days: Double
  var firstDateWasLater: Boolean
  var hours: Double
  var minutes: Double
  var months: Double
  var seconds: Double
  var years: Double
}

object PreciseRangeValueObject {
  @scala.inline
  def apply(
    days: Double,
    firstDateWasLater: Boolean,
    hours: Double,
    minutes: Double,
    months: Double,
    seconds: Double,
    years: Double
  ): PreciseRangeValueObject = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], firstDateWasLater = firstDateWasLater.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PreciseRangeValueObject]
  }
}

