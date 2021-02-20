package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OSNotificationPayload extends StObject {
  
  var actionButtons: js.Array[OSActionButton] = js.native
  
  var additionalData: js.UndefOr[js.Any] = js.native
  
  var backgroundImageLayout: js.UndefOr[OSBackgroundImageLayout] = js.native
  
  var bigPicture: js.UndefOr[String] = js.native
  
  var body: String = js.native
  
  var fromProjectNumber: js.UndefOr[String] = js.native
  
  var groupKey: js.UndefOr[String] = js.native
  
  var groupMessage: js.UndefOr[String] = js.native
  
  var largeIcon: js.UndefOr[String] = js.native
  
  var launchURL: js.UndefOr[String] = js.native
  
  var ledColor: js.UndefOr[String] = js.native
  
  var lockScreenVisibility: js.UndefOr[OSLockScreenVisibility] = js.native
  
  var notificationID: String = js.native
  
  var priority: js.UndefOr[Double] = js.native
  
  var rawPayload: String = js.native
  
  var smallIcon: js.UndefOr[String] = js.native
  
  var smallIconAccentColor: js.UndefOr[String] = js.native
  
  var sound: String = js.native
  
  var title: String = js.native
}
object OSNotificationPayload {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class OSNotificationPayloadMutableBuilder[Self <: OSNotificationPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionButtons(value: js.Array[OSActionButton]): Self = StObject.set(x, "actionButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionButtonsVarargs(value: OSActionButton*): Self = StObject.set(x, "actionButtons", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalData(value: js.Any): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalDataUndefined: Self = StObject.set(x, "additionalData", js.undefined)
    
    @scala.inline
    def setBackgroundImageLayout(value: OSBackgroundImageLayout): Self = StObject.set(x, "backgroundImageLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundImageLayoutUndefined: Self = StObject.set(x, "backgroundImageLayout", js.undefined)
    
    @scala.inline
    def setBigPicture(value: String): Self = StObject.set(x, "bigPicture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigPictureUndefined: Self = StObject.set(x, "bigPicture", js.undefined)
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromProjectNumber(value: String): Self = StObject.set(x, "fromProjectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromProjectNumberUndefined: Self = StObject.set(x, "fromProjectNumber", js.undefined)
    
    @scala.inline
    def setGroupKey(value: String): Self = StObject.set(x, "groupKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupKeyUndefined: Self = StObject.set(x, "groupKey", js.undefined)
    
    @scala.inline
    def setGroupMessage(value: String): Self = StObject.set(x, "groupMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupMessageUndefined: Self = StObject.set(x, "groupMessage", js.undefined)
    
    @scala.inline
    def setLargeIcon(value: String): Self = StObject.set(x, "largeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeIconUndefined: Self = StObject.set(x, "largeIcon", js.undefined)
    
    @scala.inline
    def setLaunchURL(value: String): Self = StObject.set(x, "launchURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchURLUndefined: Self = StObject.set(x, "launchURL", js.undefined)
    
    @scala.inline
    def setLedColor(value: String): Self = StObject.set(x, "ledColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLedColorUndefined: Self = StObject.set(x, "ledColor", js.undefined)
    
    @scala.inline
    def setLockScreenVisibility(value: OSLockScreenVisibility): Self = StObject.set(x, "lockScreenVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockScreenVisibilityUndefined: Self = StObject.set(x, "lockScreenVisibility", js.undefined)
    
    @scala.inline
    def setNotificationID(value: String): Self = StObject.set(x, "notificationID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setRawPayload(value: String): Self = StObject.set(x, "rawPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallIcon(value: String): Self = StObject.set(x, "smallIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallIconAccentColor(value: String): Self = StObject.set(x, "smallIconAccentColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallIconAccentColorUndefined: Self = StObject.set(x, "smallIconAccentColor", js.undefined)
    
    @scala.inline
    def setSmallIconUndefined: Self = StObject.set(x, "smallIcon", js.undefined)
    
    @scala.inline
    def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
