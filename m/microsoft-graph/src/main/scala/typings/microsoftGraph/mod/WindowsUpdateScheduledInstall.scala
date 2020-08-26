package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsUpdateScheduledInstall extends WindowsUpdateInstallScheduleType {
  /**
    * Scheduled Install Day in week. Possible values are: userDefined, everyday, sunday, monday, tuesday, wednesday,
    * thursday, friday, saturday.
    */
  var scheduledInstallDay: js.UndefOr[WeeklySchedule] = js.native
  // Scheduled Install Time during day
  var scheduledInstallTime: js.UndefOr[String] = js.native
}

object WindowsUpdateScheduledInstall {
  @scala.inline
  def apply(): WindowsUpdateScheduledInstall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsUpdateScheduledInstall]
  }
  @scala.inline
  implicit class WindowsUpdateScheduledInstallOps[Self <: WindowsUpdateScheduledInstall] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setScheduledInstallDay(value: WeeklySchedule): Self = this.set("scheduledInstallDay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduledInstallDay: Self = this.set("scheduledInstallDay", js.undefined)
    @scala.inline
    def setScheduledInstallTime(value: String): Self = this.set("scheduledInstallTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduledInstallTime: Self = this.set("scheduledInstallTime", js.undefined)
  }
  
}

