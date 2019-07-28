package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsUpdateActiveHoursInstall extends WindowsUpdateInstallScheduleType {
  // Active Hours End
  var activeHoursEnd: js.UndefOr[String] = js.undefined
  // Active Hours Start
  var activeHoursStart: js.UndefOr[String] = js.undefined
}

object WindowsUpdateActiveHoursInstall {
  @scala.inline
  def apply(activeHoursEnd: String = null, activeHoursStart: String = null): WindowsUpdateActiveHoursInstall = {
    val __obj = js.Dynamic.literal()
    if (activeHoursEnd != null) __obj.updateDynamic("activeHoursEnd")(activeHoursEnd)
    if (activeHoursStart != null) __obj.updateDynamic("activeHoursStart")(activeHoursStart)
    __obj.asInstanceOf[WindowsUpdateActiveHoursInstall]
  }
}

