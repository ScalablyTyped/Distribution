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
    val __obj = js.Dynamic.literal(days = days, firstDateWasLater = firstDateWasLater, hours = hours, minutes = minutes, months = months, seconds = seconds, years = years)
  
    __obj.asInstanceOf[PreciseRangeValueObject]
  }
}

