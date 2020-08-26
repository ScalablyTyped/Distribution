package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OSSubscriptionState extends js.Object {
  var pushToken: String = js.native
  var subscribed: Boolean = js.native
  var userId: String = js.native
  var userSubscriptionSetting: Boolean = js.native
}

object OSSubscriptionState {
  @scala.inline
  def apply(pushToken: String, subscribed: Boolean, userId: String, userSubscriptionSetting: Boolean): OSSubscriptionState = {
    val __obj = js.Dynamic.literal(pushToken = pushToken.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], userSubscriptionSetting = userSubscriptionSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSSubscriptionState]
  }
  @scala.inline
  implicit class OSSubscriptionStateOps[Self <: OSSubscriptionState] (val x: Self) extends AnyVal {
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
    def setPushToken(value: String): Self = this.set("pushToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscribed(value: Boolean): Self = this.set("subscribed", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserSubscriptionSetting(value: Boolean): Self = this.set("userSubscriptionSetting", value.asInstanceOf[js.Any])
  }
  
}

