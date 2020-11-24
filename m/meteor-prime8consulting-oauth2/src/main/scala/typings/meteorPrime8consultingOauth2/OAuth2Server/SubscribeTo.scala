package typings.meteorPrime8consultingOauth2.OAuth2Server

import typings.meteor.Meteor.SubscriptionHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscribeTo extends js.Object {
  
  /**
    * Wrapper function to subscribe to the auth code subscription. Returns a standard subscription handle.
    */
  def authCode(): SubscriptionHandle = js.native
}
object SubscribeTo {
  
  @scala.inline
  def apply(authCode: () => SubscriptionHandle): SubscribeTo = {
    val __obj = js.Dynamic.literal(authCode = js.Any.fromFunction0(authCode))
    __obj.asInstanceOf[SubscribeTo]
  }
  
  @scala.inline
  implicit class SubscribeToOps[Self <: SubscribeTo] (val x: Self) extends AnyVal {
    
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
    def setAuthCode(value: () => SubscriptionHandle): Self = this.set("authCode", js.Any.fromFunction0(value))
  }
}
