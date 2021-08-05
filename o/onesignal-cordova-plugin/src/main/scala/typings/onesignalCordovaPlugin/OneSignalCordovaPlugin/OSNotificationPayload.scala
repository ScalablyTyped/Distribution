package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSNotificationPayload extends StObject {
  
  var actionButtons: js.Array[OSActionButton]
  
  var additionalData: js.UndefOr[js.Any] = js.undefined
  
  var backgroundImageLayout: js.UndefOr[OSBackgroundImageLayout] = js.undefined
  
  var bigPicture: js.UndefOr[String] = js.undefined
  
  var body: String
  
  var fromProjectNumber: js.UndefOr[String] = js.undefined
  
  var groupKey: js.UndefOr[String] = js.undefined
  
  var groupMessage: js.UndefOr[String] = js.undefined
  
  var largeIcon: js.UndefOr[String] = js.undefined
  
  var launchURL: js.UndefOr[String] = js.undefined
  
  var ledColor: js.UndefOr[String] = js.undefined
  
  var lockScreenVisibility: js.UndefOr[OSLockScreenVisibility] = js.undefined
  
  var notificationID: String
  
  var priority: js.UndefOr[Double] = js.undefined
  
  var rawPayload: String
  
  var smallIcon: js.UndefOr[String] = js.undefined
  
  var smallIconAccentColor: js.UndefOr[String] = js.undefined
  
  var sound: String
  
  var title: String
}
object OSNotificationPayload {
  
  inline def apply(
    actionButtons: js.Array[OSActionButton],
    body: String,
    notificationID: String,
    rawPayload: String,
    sound: String,
    title: String
  ): OSNotificationPayload = {
    val __obj = js.Dynamic.literal(actionButtons = actionButtons.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], notificationID = notificationID.asInstanceOf[js.Any], rawPayload = rawPayload.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSNotificationPayload]
  }
  
  extension [Self <: OSNotificationPayload](x: Self) {
    
    inline def setActionButtons(value: js.Array[OSActionButton]): Self = StObject.set(x, "actionButtons", value.asInstanceOf[js.Any])
    
    inline def setActionButtonsVarargs(value: OSActionButton*): Self = StObject.set(x, "actionButtons", js.Array(value :_*))
    
    inline def setAdditionalData(value: js.Any): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
    
    inline def setAdditionalDataUndefined: Self = StObject.set(x, "additionalData", js.undefined)
    
    inline def setBackgroundImageLayout(value: OSBackgroundImageLayout): Self = StObject.set(x, "backgroundImageLayout", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageLayoutUndefined: Self = StObject.set(x, "backgroundImageLayout", js.undefined)
    
    inline def setBigPicture(value: String): Self = StObject.set(x, "bigPicture", value.asInstanceOf[js.Any])
    
    inline def setBigPictureUndefined: Self = StObject.set(x, "bigPicture", js.undefined)
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setFromProjectNumber(value: String): Self = StObject.set(x, "fromProjectNumber", value.asInstanceOf[js.Any])
    
    inline def setFromProjectNumberUndefined: Self = StObject.set(x, "fromProjectNumber", js.undefined)
    
    inline def setGroupKey(value: String): Self = StObject.set(x, "groupKey", value.asInstanceOf[js.Any])
    
    inline def setGroupKeyUndefined: Self = StObject.set(x, "groupKey", js.undefined)
    
    inline def setGroupMessage(value: String): Self = StObject.set(x, "groupMessage", value.asInstanceOf[js.Any])
    
    inline def setGroupMessageUndefined: Self = StObject.set(x, "groupMessage", js.undefined)
    
    inline def setLargeIcon(value: String): Self = StObject.set(x, "largeIcon", value.asInstanceOf[js.Any])
    
    inline def setLargeIconUndefined: Self = StObject.set(x, "largeIcon", js.undefined)
    
    inline def setLaunchURL(value: String): Self = StObject.set(x, "launchURL", value.asInstanceOf[js.Any])
    
    inline def setLaunchURLUndefined: Self = StObject.set(x, "launchURL", js.undefined)
    
    inline def setLedColor(value: String): Self = StObject.set(x, "ledColor", value.asInstanceOf[js.Any])
    
    inline def setLedColorUndefined: Self = StObject.set(x, "ledColor", js.undefined)
    
    inline def setLockScreenVisibility(value: OSLockScreenVisibility): Self = StObject.set(x, "lockScreenVisibility", value.asInstanceOf[js.Any])
    
    inline def setLockScreenVisibilityUndefined: Self = StObject.set(x, "lockScreenVisibility", js.undefined)
    
    inline def setNotificationID(value: String): Self = StObject.set(x, "notificationID", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setRawPayload(value: String): Self = StObject.set(x, "rawPayload", value.asInstanceOf[js.Any])
    
    inline def setSmallIcon(value: String): Self = StObject.set(x, "smallIcon", value.asInstanceOf[js.Any])
    
    inline def setSmallIconAccentColor(value: String): Self = StObject.set(x, "smallIconAccentColor", value.asInstanceOf[js.Any])
    
    inline def setSmallIconAccentColorUndefined: Self = StObject.set(x, "smallIconAccentColor", js.undefined)
    
    inline def setSmallIconUndefined: Self = StObject.set(x, "smallIcon", js.undefined)
    
    inline def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
