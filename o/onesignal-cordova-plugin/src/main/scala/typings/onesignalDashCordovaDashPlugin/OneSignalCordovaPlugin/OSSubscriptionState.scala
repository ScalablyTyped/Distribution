package typings.onesignalDashCordovaDashPlugin.OneSignalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OSSubscriptionState extends js.Object {
  var pushToken: String
  var subscribed: Boolean
  var userId: String
  var userSubscriptionSetting: Boolean
}

object OSSubscriptionState {
  @scala.inline
  def apply(pushToken: String, subscribed: Boolean, userId: String, userSubscriptionSetting: Boolean): OSSubscriptionState = {
    val __obj = js.Dynamic.literal(pushToken = pushToken, subscribed = subscribed, userId = userId, userSubscriptionSetting = userSubscriptionSetting)
  
    __obj.asInstanceOf[OSSubscriptionState]
  }
}

