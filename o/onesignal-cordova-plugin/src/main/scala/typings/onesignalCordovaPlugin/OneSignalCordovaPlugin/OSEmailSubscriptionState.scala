package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OSEmailSubscriptionState extends StObject {
  
  var emailAddress: String = js.native
  
  var emailUserId: String = js.native
}
object OSEmailSubscriptionState {
  
  @scala.inline
  def apply(emailAddress: String, emailUserId: String): OSEmailSubscriptionState = {
    val __obj = js.Dynamic.literal(emailAddress = emailAddress.asInstanceOf[js.Any], emailUserId = emailUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSEmailSubscriptionState]
  }
  
  @scala.inline
  implicit class OSEmailSubscriptionStateMutableBuilder[Self <: OSEmailSubscriptionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUserId(value: String): Self = StObject.set(x, "emailUserId", value.asInstanceOf[js.Any])
  }
}
