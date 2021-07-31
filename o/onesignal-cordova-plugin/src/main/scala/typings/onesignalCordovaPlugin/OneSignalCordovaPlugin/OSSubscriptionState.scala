package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSSubscriptionState extends StObject {
  
  var pushToken: String
  
  var subscribed: Boolean
  
  var userId: String
  
  var userSubscriptionSetting: Boolean
}
object OSSubscriptionState {
  
  @scala.inline
  def apply(pushToken: String, subscribed: Boolean, userId: String, userSubscriptionSetting: Boolean): OSSubscriptionState = {
    val __obj = js.Dynamic.literal(pushToken = pushToken.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], userSubscriptionSetting = userSubscriptionSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSSubscriptionState]
  }
  
  @scala.inline
  implicit class OSSubscriptionStateMutableBuilder[Self <: OSSubscriptionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPushToken(value: String): Self = StObject.set(x, "pushToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribed(value: Boolean): Self = StObject.set(x, "subscribed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSubscriptionSetting(value: Boolean): Self = StObject.set(x, "userSubscriptionSetting", value.asInstanceOf[js.Any])
  }
}
