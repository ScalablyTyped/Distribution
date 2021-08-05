package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSEmailSubscriptionState extends StObject {
  
  var emailAddress: String
  
  var emailUserId: String
}
object OSEmailSubscriptionState {
  
  inline def apply(emailAddress: String, emailUserId: String): OSEmailSubscriptionState = {
    val __obj = js.Dynamic.literal(emailAddress = emailAddress.asInstanceOf[js.Any], emailUserId = emailUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSEmailSubscriptionState]
  }
  
  extension [Self <: OSEmailSubscriptionState](x: Self) {
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailUserId(value: String): Self = StObject.set(x, "emailUserId", value.asInstanceOf[js.Any])
  }
}
