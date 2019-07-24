package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsUpdateActiveHoursInstall extends WindowsUpdateInstallScheduleType {
  // Active Hours End
  var activeHoursEnd: js.UndefOr[java.lang.String] = js.undefined
  // Active Hours Start
  var activeHoursStart: js.UndefOr[java.lang.String] = js.undefined
}

object WindowsUpdateActiveHoursInstall {
  @scala.inline
  def apply(activeHoursEnd: java.lang.String = null, activeHoursStart: java.lang.String = null): WindowsUpdateActiveHoursInstall = {
    val __obj = js.Dynamic.literal()
    if (activeHoursEnd != null) __obj.updateDynamic("activeHoursEnd")(activeHoursEnd)
    if (activeHoursStart != null) __obj.updateDynamic("activeHoursStart")(activeHoursStart)
    __obj.asInstanceOf[WindowsUpdateActiveHoursInstall]
  }
}

