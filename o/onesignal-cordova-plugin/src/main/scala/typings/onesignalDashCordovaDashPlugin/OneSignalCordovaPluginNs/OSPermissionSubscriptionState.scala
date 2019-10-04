package typings.onesignalDashCordovaDashPlugin.OneSignalCordovaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OSPermissionSubscriptionState extends js.Object {
  var emailSubscriptionStatus: OSEmailSubscriptionState
  var permissionStatus: OSPermissionState
  var subscriptionStatus: OSSubscriptionState
}

object OSPermissionSubscriptionState {
  @scala.inline
  def apply(
    emailSubscriptionStatus: OSEmailSubscriptionState,
    permissionStatus: OSPermissionState,
    subscriptionStatus: OSSubscriptionState
  ): OSPermissionSubscriptionState = {
    val __obj = js.Dynamic.literal(emailSubscriptionStatus = emailSubscriptionStatus, permissionStatus = permissionStatus, subscriptionStatus = subscriptionStatus)
  
    __obj.asInstanceOf[OSPermissionSubscriptionState]
  }
}

