package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class Win32LobAppAssignmentSettingsMutableBuilder[Self <: Win32LobAppAssignmentSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstallTimeSettings(value: NullableOption[MobileAppInstallTimeSettings]): Self = StObject.set(x, "installTimeSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallTimeSettingsNull: Self = StObject.set(x, "installTimeSettings", null)
    
    @scala.inline
    def setInstallTimeSettingsUndefined: Self = StObject.set(x, "installTimeSettings", js.undefined)
    
    @scala.inline
    def setNotifications(value: Win32LobAppNotification): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
    
    @scala.inline
    def setRestartSettings(value: NullableOption[Win32LobAppRestartSettings]): Self = StObject.set(x, "restartSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestartSettingsNull: Self = StObject.set(x, "restartSettings", null)
    
    @scala.inline
    def setRestartSettingsUndefined: Self = StObject.set(x, "restartSettings", js.undefined)
  }
}
