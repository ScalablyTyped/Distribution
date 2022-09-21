package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Win32LobAppAssignmentSettings
  extends StObject
     with MobileAppAssignmentSettings {
  
  /**
    * The delivery optimization priority for this app assignment. This setting is not supported in National Cloud
    * environments. Possible values are: notConfigured, foreground.
    */
  var deliveryOptimizationPriority: js.UndefOr[Win32LobAppDeliveryOptimizationPriority] = js.undefined
  
  // The install time settings to apply for this app assignment.
  var installTimeSettings: js.UndefOr[NullableOption[MobileAppInstallTimeSettings]] = js.undefined
  
  // The notification status for this app assignment. Possible values are: showAll, showReboot, hideAll.
  var notifications: js.UndefOr[Win32LobAppNotification] = js.undefined
  
  // The reboot settings to apply for this app assignment.
  var restartSettings: js.UndefOr[NullableOption[Win32LobAppRestartSettings]] = js.undefined
}
object Win32LobAppAssignmentSettings {
  
  inline def apply(): Win32LobAppAssignmentSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Win32LobAppAssignmentSettings]
  }
  
  extension [Self <: Win32LobAppAssignmentSettings](x: Self) {
    
    inline def setDeliveryOptimizationPriority(value: Win32LobAppDeliveryOptimizationPriority): Self = StObject.set(x, "deliveryOptimizationPriority", value.asInstanceOf[js.Any])
    
    inline def setDeliveryOptimizationPriorityUndefined: Self = StObject.set(x, "deliveryOptimizationPriority", js.undefined)
    
    inline def setInstallTimeSettings(value: NullableOption[MobileAppInstallTimeSettings]): Self = StObject.set(x, "installTimeSettings", value.asInstanceOf[js.Any])
    
    inline def setInstallTimeSettingsNull: Self = StObject.set(x, "installTimeSettings", null)
    
    inline def setInstallTimeSettingsUndefined: Self = StObject.set(x, "installTimeSettings", js.undefined)
    
    inline def setNotifications(value: Win32LobAppNotification): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    inline def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
    
    inline def setRestartSettings(value: NullableOption[Win32LobAppRestartSettings]): Self = StObject.set(x, "restartSettings", value.asInstanceOf[js.Any])
    
    inline def setRestartSettingsNull: Self = StObject.set(x, "restartSettings", null)
    
    inline def setRestartSettingsUndefined: Self = StObject.set(x, "restartSettings", js.undefined)
  }
}
