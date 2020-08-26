package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OSEmailSubscriptionState extends js.Object {
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
  implicit class OSEmailSubscriptionStateOps[Self <: OSEmailSubscriptionState] (val x: Self) extends AnyVal {
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
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmailUserId(value: String): Self = this.set("emailUserId", value.asInstanceOf[js.Any])
  }
  
}

