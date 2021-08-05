package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosNotificationSettings extends StObject {
  
  // Indicates the type of alert for notifications for this app. Possible values are: deviceDefault, banner, modal, none.
  var alertType: js.UndefOr[IosNotificationAlertType] = js.undefined
  
  // Application name to be associated with the bundleID.
  var appName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates whether badges are allowed for this app.
  var badgesEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Bundle id of app to which to apply these notification settings.
  var bundleID: js.UndefOr[String] = js.undefined
  
  // Indicates whether notifications are allowed for this app.
  var enabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Publisher to be associated with the bundleID.
  var publisher: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates whether notifications can be shown in notification center.
  var showInNotificationCenter: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether notifications can be shown on the lock screen.
  var showOnLockScreen: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether sounds are allowed for this app.
  var soundsEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object IosNotificationSettings {
  
  inline def apply(): IosNotificationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosNotificationSettings]
  }
  
  extension [Self <: IosNotificationSettings](x: Self) {
    
    inline def setAlertType(value: IosNotificationAlertType): Self = StObject.set(x, "alertType", value.asInstanceOf[js.Any])
    
    inline def setAlertTypeUndefined: Self = StObject.set(x, "alertType", js.undefined)
    
    inline def setAppName(value: NullableOption[String]): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setAppNameNull: Self = StObject.set(x, "appName", null)
    
    inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
    
    inline def setBadgesEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "badgesEnabled", value.asInstanceOf[js.Any])
    
    inline def setBadgesEnabledNull: Self = StObject.set(x, "badgesEnabled", null)
    
    inline def setBadgesEnabledUndefined: Self = StObject.set(x, "badgesEnabled", js.undefined)
    
    inline def setBundleID(value: String): Self = StObject.set(x, "bundleID", value.asInstanceOf[js.Any])
    
    inline def setBundleIDUndefined: Self = StObject.set(x, "bundleID", js.undefined)
    
    inline def setEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setPublisher(value: NullableOption[String]): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherNull: Self = StObject.set(x, "publisher", null)
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setShowInNotificationCenter(value: NullableOption[Boolean]): Self = StObject.set(x, "showInNotificationCenter", value.asInstanceOf[js.Any])
    
    inline def setShowInNotificationCenterNull: Self = StObject.set(x, "showInNotificationCenter", null)
    
    inline def setShowInNotificationCenterUndefined: Self = StObject.set(x, "showInNotificationCenter", js.undefined)
    
    inline def setShowOnLockScreen(value: NullableOption[Boolean]): Self = StObject.set(x, "showOnLockScreen", value.asInstanceOf[js.Any])
    
    inline def setShowOnLockScreenNull: Self = StObject.set(x, "showOnLockScreen", null)
    
    inline def setShowOnLockScreenUndefined: Self = StObject.set(x, "showOnLockScreen", js.undefined)
    
    inline def setSoundsEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "soundsEnabled", value.asInstanceOf[js.Any])
    
    inline def setSoundsEnabledNull: Self = StObject.set(x, "soundsEnabled", null)
    
    inline def setSoundsEnabledUndefined: Self = StObject.set(x, "soundsEnabled", js.undefined)
  }
}
