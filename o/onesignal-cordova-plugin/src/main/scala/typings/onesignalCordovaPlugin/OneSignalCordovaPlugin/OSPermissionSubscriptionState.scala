package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPermissionSubscriptionState extends StObject {
  
  var emailSubscriptionStatus: OSEmailSubscriptionState
  
  var permissionStatus: OSPermissionState
  
  var subscriptionStatus: OSSubscriptionState
}
object OSPermissionSubscriptionState {
  
  inline def apply(
    emailSubscriptionStatus: OSEmailSubscriptionState,
    permissionStatus: OSPermissionState,
    subscriptionStatus: OSSubscriptionState
  ): OSPermissionSubscriptionState = {
    val __obj = js.Dynamic.literal(emailSubscriptionStatus = emailSubscriptionStatus.asInstanceOf[js.Any], permissionStatus = permissionStatus.asInstanceOf[js.Any], subscriptionStatus = subscriptionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSPermissionSubscriptionState]
  }
  
  extension [Self <: OSPermissionSubscriptionState](x: Self) {
    
    inline def setEmailSubscriptionStatus(value: OSEmailSubscriptionState): Self = StObject.set(x, "emailSubscriptionStatus", value.asInstanceOf[js.Any])
    
    inline def setPermissionStatus(value: OSPermissionState): Self = StObject.set(x, "permissionStatus", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionStatus(value: OSSubscriptionState): Self = StObject.set(x, "subscriptionStatus", value.asInstanceOf[js.Any])
  }
}
