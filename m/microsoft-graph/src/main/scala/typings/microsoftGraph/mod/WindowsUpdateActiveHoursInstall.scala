package typings.microsoftGraph.mod

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
    if (activeHoursEnd != null) __obj.updateDynamic("activeHoursEnd")(activeHoursEnd.asInstanceOf[js.Any])
    if (activeHoursStart != null) __obj.updateDynamic("activeHoursStart")(activeHoursStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsUpdateActiveHoursInstall]
  }
}

