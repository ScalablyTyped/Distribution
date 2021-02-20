package typings.msRestAzure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthResponse extends StObject {
  
  var credentials: DeviceTokenCredentials | ApplicationTokenCredentials | UserTokenCredentials = js.native
  
  var subscriptions: js.Array[LinkedSubscription] = js.native
}
object AuthResponse {
  
  @scala.inline
  def apply(
    credentials: DeviceTokenCredentials | ApplicationTokenCredentials | UserTokenCredentials,
    subscriptions: js.Array[LinkedSubscription]
  ): AuthResponse = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthResponse]
  }
  
  @scala.inline
  implicit class AuthResponseMutableBuilder[Self <: AuthResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentials(value: DeviceTokenCredentials | ApplicationTokenCredentials | UserTokenCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptions(value: js.Array[LinkedSubscription]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionsVarargs(value: LinkedSubscription*): Self = StObject.set(x, "subscriptions", js.Array(value :_*))
  }
}
