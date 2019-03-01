package typings
package onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OSSubscriptionState extends js.Object {
  var pushToken: js.Any
  var subscribed: scala.Boolean
  var userId: js.Any
  var userSubscriptionSetting: js.Any
}

object OSSubscriptionState {
  @scala.inline
  def apply(pushToken: js.Any, subscribed: scala.Boolean, userId: js.Any, userSubscriptionSetting: js.Any): OSSubscriptionState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pushToken")(pushToken)
    __obj.updateDynamic("subscribed")(subscribed)
    __obj.updateDynamic("userId")(userId)
    __obj.updateDynamic("userSubscriptionSetting")(userSubscriptionSetting)
    __obj.asInstanceOf[OSSubscriptionState]
  }
}

