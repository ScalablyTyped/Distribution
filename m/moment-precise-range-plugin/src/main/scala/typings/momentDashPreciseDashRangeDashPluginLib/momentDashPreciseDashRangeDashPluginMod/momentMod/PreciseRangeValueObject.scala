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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("days")(days)
    __obj.updateDynamic("firstDateWasLater")(firstDateWasLater)
    __obj.updateDynamic("hours")(hours)
    __obj.updateDynamic("minutes")(minutes)
    __obj.updateDynamic("months")(months)
    __obj.updateDynamic("seconds")(seconds)
    __obj.updateDynamic("years")(years)
    __obj.asInstanceOf[PreciseRangeValueObject]
  }
}

