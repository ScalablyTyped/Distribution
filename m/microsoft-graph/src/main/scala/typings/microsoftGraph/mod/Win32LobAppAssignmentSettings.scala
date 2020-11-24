package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Win32LobAppAssignmentSettings extends MobileAppAssignmentSettings {
  
  // The install time settings to apply for this app assignment.
  var installTimeSettings: js.UndefOr[NullableOption[MobileAppInstallTimeSettings]] = js.native
  
  // The notification status for this app assignment. Possible values are: showAll, showReboot, hideAll.
  var notifications: js.UndefOr[Win32LobAppNotification] = js.native
  
  // The reboot settings to apply for this app assignment.
  var restartSettings: js.UndefOr[NullableOption[Win32LobAppRestartSettings]] = js.native
}
object Win32LobAppAssignmentSettings {
  
  @scala.inline
  def apply(): Win32LobAppAssignmentSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Win32LobAppAssignmentSettings]
  }
  
  @scala.inline
  implicit class Win32LobAppAssignmentSettingsOps[Self <: Win32LobAppAssignmentSettings] (val x: Self) extends AnyVal {
    
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
    def setInstallTimeSettings(value: NullableOption[MobileAppInstallTimeSettings]): Self = this.set("installTimeSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallTimeSettings: Self = this.set("installTimeSettings", js.undefined)
    
    @scala.inline
    def setInstallTimeSettingsNull: Self = this.set("installTimeSettings", null)
    
    @scala.inline
    def setNotifications(value: Win32LobAppNotification): Self = this.set("notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifications: Self = this.set("notifications", js.undefined)
    
    @scala.inline
    def setRestartSettings(value: NullableOption[Win32LobAppRestartSettings]): Self = this.set("restartSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestartSettings: Self = this.set("restartSettings", js.undefined)
    
    @scala.inline
    def setRestartSettingsNull: Self = this.set("restartSettings", null)
  }
}
