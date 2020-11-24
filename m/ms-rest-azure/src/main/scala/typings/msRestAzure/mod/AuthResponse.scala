package typings.msRestAzure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthResponse extends js.Object {
  
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
  implicit class AuthResponseOps[Self <: AuthResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCredentials(value: DeviceTokenCredentials | ApplicationTokenCredentials | UserTokenCredentials): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionsVarargs(value: LinkedSubscription*): Self = this.set("subscriptions", js.Array(value :_*))
    
    @scala.inline
    def setSubscriptions(value: js.Array[LinkedSubscription]): Self = this.set("subscriptions", value.asInstanceOf[js.Any])
  }
}
