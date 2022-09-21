package typings.phonegapPluginPush

import typings.phonegapPluginPush.PhonegapPluginPush.CategoryArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alert extends StObject {
    
    /**
    			 * If true|"true" the device shows an alert on receipt of notification.
    			 * Default is false|"false".
    			 * Note: the value you set this option to the first time you call the init method will be how the application always acts.
    			 * Once this is set programmatically in the init method it can only be changed manually by the user in Settings>Notifications>App Name.
    			 * This is normal iOS behaviour.
    			 */
    var alert: js.UndefOr[Boolean | String] = js.undefined
    
    /**
    			 * If true|"true" the device sets the badge number on receipt of notification.
    			 * Default is false|"false".
    			 * Note: the value you set this option to the first time you call the init method will be how the application always acts.
    			 * Once this is set programmatically in the init method it can only be changed manually by the user in Settings>Notifications>App Name.
    			 * This is normal iOS behaviour.
    			 */
    var badge: js.UndefOr[Boolean | String] = js.undefined
    
    /**
    			 * The data required in order to enable Action Buttons for iOS.
    			 * Action Buttons on iOS - https://github.com/phonegap/phonegap-plugin-push/blob/master/docs/PAYLOAD.md#action-buttons-1
    			 */
    var categories: js.UndefOr[CategoryArray] = js.undefined
    
    /**
    			 * If true|"true" the badge will be cleared on app startup. Defaults to false|"false".
    			 */
    var clearBadge: js.UndefOr[Boolean | String] = js.undefined
    
    /**
    			 * Whether to use prod or sandbox GCM setting. Defaults to false.
    			 */
    var fcmSandbox: js.UndefOr[Boolean] = js.undefined
    
    /**
    			 * If true|"true" the device plays a sound on receipt of notification.
    			 * Default is false|"false".
    			 * Note: the value you set this option to the first time you call the init method will be how the application always acts.
    			 * Once this is set programmatically in the init method it can only be changed manually by the user in Settings>Notifications>App Name.
    			 * This is normal iOS behaviour.
    			 */
    var sound: js.UndefOr[Boolean | String] = js.undefined
    
    /**
    			 * If the array contains one or more strings each string will be used to subscribe to a FcmPubSub topic. Defaults to [].
    			 */
    var topics: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
    			 * If true|"true" the device will be set up to receive VoIP Push notifications and the other options will be ignored
    			 * since VoIP notifications are silent notifications that should be handled in the "notification" event.
    			 * Default is false|"false".
    			 */
    var voip: js.UndefOr[Boolean | String] = js.undefined
  }
  object Alert {
    
    inline def apply(): Alert = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Alert]
    }
    
    extension [Self <: Alert](x: Self) {
      
      inline def setAlert(value: Boolean | String): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      inline def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
      
      inline def setBadge(value: Boolean | String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      inline def setCategories(value: CategoryArray): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
      
      inline def setClearBadge(value: Boolean | String): Self = StObject.set(x, "clearBadge", value.asInstanceOf[js.Any])
      
      inline def setClearBadgeUndefined: Self = StObject.set(x, "clearBadge", js.undefined)
      
      inline def setFcmSandbox(value: Boolean): Self = StObject.set(x, "fcmSandbox", value.asInstanceOf[js.Any])
      
      inline def setFcmSandboxUndefined: Self = StObject.set(x, "fcmSandbox", js.undefined)
      
      inline def setSound(value: Boolean | String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      inline def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
      
      inline def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
      
      inline def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
      
      inline def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value*))
      
      inline def setVoip(value: Boolean | String): Self = StObject.set(x, "voip", value.asInstanceOf[js.Any])
      
      inline def setVoipUndefined: Self = StObject.set(x, "voip", js.undefined)
    }
  }
  
  trait ApplicationServerKey extends StObject {
    
    /**
    			 * Your GCM API key if you are using VAPID keys.
    			 */
    var applicationServerKey: js.UndefOr[String] = js.undefined
    
    /**
    			 * URL for the push server you want to use. Default is 'http://push.api.phonegap.com/v1/push'.
    			 */
    var pushServiceURL: js.UndefOr[String] = js.undefined
  }
  object ApplicationServerKey {
    
    inline def apply(): ApplicationServerKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationServerKey]
    }
    
    extension [Self <: ApplicationServerKey](x: Self) {
      
      inline def setApplicationServerKey(value: String): Self = StObject.set(x, "applicationServerKey", value.asInstanceOf[js.Any])
      
      inline def setApplicationServerKeyUndefined: Self = StObject.set(x, "applicationServerKey", js.undefined)
      
      inline def setPushServiceURL(value: String): Self = StObject.set(x, "pushServiceURL", value.asInstanceOf[js.Any])
      
      inline def setPushServiceURLUndefined: Self = StObject.set(x, "pushServiceURL", js.undefined)
    }
  }
  
  trait ClearBadge extends StObject {
    
    /**
    			 * If true the icon badge will be cleared on init and before push messages are processed. Default is false.
    			 */
    var clearBadge: js.UndefOr[Boolean] = js.undefined
    
    /**
    			 * If true the app clears all pending notifications when it is closed. Default is true.
    			 */
    var clearNotifications: js.UndefOr[Boolean] = js.undefined
    
    /**
    			 * If true will always show a notification, even when the app is on the foreground. Default is false.
    			 */
    var forceShow: js.UndefOr[Boolean] = js.undefined
    
    /**
    			 * The name of a drawable resource to use as the small-icon. The name should not include the extension.
    			 */
    var icon: js.UndefOr[String] = js.undefined
    
    /**
    			 * Sets the background color of the small icon on Android 5.0 and greater.
    			 * Supported Formats - http://developer.android.com/reference/android/graphics/Color.html#parseColor(java.lang.String)
    			 */
    var iconColor: js.UndefOr[String] = js.undefined
    
    /**
    			 * The key to search for text of notification. Default is 'message'.
    			 */
    var messageKey: js.UndefOr[String] = js.undefined
    
    /**
    			 * If true it plays the sound specified in the push data or the default system sound. Default is true.
    			 */
    var sound: js.UndefOr[Boolean] = js.undefined
    
    /**
    			 * The key to search for title of notification. Default is 'title'.
    			 */
    var titleKey: js.UndefOr[String] = js.undefined
    
    /**
    			 * If the array contains one or more strings each string will be used to subscribe to a GcmPubSub topic.
    			 */
    var topics: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
    			 * If true the device vibrates on receipt of notification. Default is true.
    			 */
    var vibrate: js.UndefOr[Boolean] = js.undefined
  }
  object ClearBadge {
    
    inline def apply(): ClearBadge = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearBadge]
    }
    
    extension [Self <: ClearBadge](x: Self) {
      
      inline def setClearBadge(value: Boolean): Self = StObject.set(x, "clearBadge", value.asInstanceOf[js.Any])
      
      inline def setClearBadgeUndefined: Self = StObject.set(x, "clearBadge", js.undefined)
      
      inline def setClearNotifications(value: Boolean): Self = StObject.set(x, "clearNotifications", value.asInstanceOf[js.Any])
      
      inline def setClearNotificationsUndefined: Self = StObject.set(x, "clearNotifications", js.undefined)
      
      inline def setForceShow(value: Boolean): Self = StObject.set(x, "forceShow", value.asInstanceOf[js.Any])
      
      inline def setForceShowUndefined: Self = StObject.set(x, "forceShow", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
      
      inline def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMessageKey(value: String): Self = StObject.set(x, "messageKey", value.asInstanceOf[js.Any])
      
      inline def setMessageKeyUndefined: Self = StObject.set(x, "messageKey", js.undefined)
      
      inline def setSound(value: Boolean): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      inline def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
      
      inline def setTitleKey(value: String): Self = StObject.set(x, "titleKey", value.asInstanceOf[js.Any])
      
      inline def setTitleKeyUndefined: Self = StObject.set(x, "titleKey", js.undefined)
      
      inline def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
      
      inline def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
      
      inline def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value*))
      
      inline def setVibrate(value: Boolean): Self = StObject.set(x, "vibrate", value.asInstanceOf[js.Any])
      
      inline def setVibrateUndefined: Self = StObject.set(x, "vibrate", js.undefined)
    }
  }
}
