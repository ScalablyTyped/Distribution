package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

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
    val __obj = js.Dynamic.literal(emailSubscriptionStatus = emailSubscriptionStatus.asInstanceOf[js.Any], permissionStatus = permissionStatus.asInstanceOf[js.Any], subscriptionStatus = subscriptionStatus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OSPermissionSubscriptionState]
  }
}

