package typings.microsoftDashGraph.microsoftDashGraphMod

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
  var scheduledInstallTime: js.UndefOr[String] = js.undefined
}

object WindowsUpdateScheduledInstall {
  @scala.inline
  def apply(scheduledInstallDay: WeeklySchedule = null, scheduledInstallTime: String = null): WindowsUpdateScheduledInstall = {
    val __obj = js.Dynamic.literal()
    if (scheduledInstallDay != null) __obj.updateDynamic("scheduledInstallDay")(scheduledInstallDay.asInstanceOf[js.Any])
    if (scheduledInstallTime != null) __obj.updateDynamic("scheduledInstallTime")(scheduledInstallTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsUpdateScheduledInstall]
  }
}

