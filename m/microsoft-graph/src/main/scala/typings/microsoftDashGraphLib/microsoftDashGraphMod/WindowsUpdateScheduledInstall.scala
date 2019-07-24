package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsUpdateScheduledInstall extends WindowsUpdateInstallScheduleType {
  /**
    * Scheduled Install Day in week. Possible values are: userDefined, everyday, sunday, monday, tuesday, wednesday,
    * thursday, friday, saturday.
    */
  var scheduledInstallDay: js.UndefOr[WeeklySchedule] = js.undefined
  // Scheduled Install Time during day
  var scheduledInstallTime: js.UndefOr[java.lang.String] = js.undefined
}

object WindowsUpdateScheduledInstall {
  @scala.inline
  def apply(scheduledInstallDay: WeeklySchedule = null, scheduledInstallTime: java.lang.String = null): WindowsUpdateScheduledInstall = {
    val __obj = js.Dynamic.literal()
    if (scheduledInstallDay != null) __obj.updateDynamic("scheduledInstallDay")(scheduledInstallDay)
    if (scheduledInstallTime != null) __obj.updateDynamic("scheduledInstallTime")(scheduledInstallTime)
    __obj.asInstanceOf[WindowsUpdateScheduledInstall]
  }
}

