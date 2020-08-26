package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OSPermissionSubscriptionState extends js.Object {
  var emailSubscriptionStatus: OSEmailSubscriptionState = js.native
  var permissionStatus: OSPermissionState = js.native
  var subscriptionStatus: OSSubscriptionState = js.native
}

object OSPermissionSubscriptionState {
  @scala.inline
  def apply(
    emailSubscriptionStatus: OSEmailSubscriptionState,
    permissionStatus: OSPermissionState,
    subscriptionStatus: OSSubscriptionState
  ): OSPermissionSubscriptionState = {
    val __obj = js.Dynamic.literal(emailSubscriptionStatus = emailSubscriptionStatus.asInstanceOf[js.Any], permissionStatus = permissionStatus.asInstanceOf[js.Any], subscriptionStatus = subscriptionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSPermissionSubscriptionState]
  }
  @scala.inline
  implicit class OSPermissionSubscriptionStateOps[Self <: OSPermissionSubscriptionState] (val x: Self) extends AnyVal {
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
    def setEmailSubscriptionStatus(value: OSEmailSubscriptionState): Self = this.set("emailSubscriptionStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissionStatus(value: OSPermissionState): Self = this.set("permissionStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptionStatus(value: OSSubscriptionState): Self = this.set("subscriptionStatus", value.asInstanceOf[js.Any])
  }
  
}

