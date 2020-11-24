package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Win32LobAppRestartSettings extends js.Object {
  
  // The number of minutes before the restart time to display the countdown dialog for pending restarts.
  var countdownDisplayBeforeRestartInMinutes: js.UndefOr[Double] = js.native
  
  // The number of minutes to wait before restarting the device after an app installation.
  var gracePeriodInMinutes: js.UndefOr[Double] = js.native
  
  // The number of minutes to snooze the restart notification dialog when the snooze button is selected.
  var restartNotificationSnoozeDurationInMinutes: js.UndefOr[NullableOption[Double]] = js.native
}
object Win32LobAppRestartSettings {
  
  @scala.inline
  def apply(): Win32LobAppRestartSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Win32LobAppRestartSettings]
  }
  
  @scala.inline
  implicit class Win32LobAppRestartSettingsOps[Self <: Win32LobAppRestartSettings] (val x: Self) extends AnyVal {
    
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
    def setCountdownDisplayBeforeRestartInMinutes(value: Double): Self = this.set("countdownDisplayBeforeRestartInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountdownDisplayBeforeRestartInMinutes: Self = this.set("countdownDisplayBeforeRestartInMinutes", js.undefined)
    
    @scala.inline
    def setGracePeriodInMinutes(value: Double): Self = this.set("gracePeriodInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGracePeriodInMinutes: Self = this.set("gracePeriodInMinutes", js.undefined)
    
    @scala.inline
    def setRestartNotificationSnoozeDurationInMinutes(value: NullableOption[Double]): Self = this.set("restartNotificationSnoozeDurationInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestartNotificationSnoozeDurationInMinutes: Self = this.set("restartNotificationSnoozeDurationInMinutes", js.undefined)
    
    @scala.inline
    def setRestartNotificationSnoozeDurationInMinutesNull: Self = this.set("restartNotificationSnoozeDurationInMinutes", null)
  }
}
