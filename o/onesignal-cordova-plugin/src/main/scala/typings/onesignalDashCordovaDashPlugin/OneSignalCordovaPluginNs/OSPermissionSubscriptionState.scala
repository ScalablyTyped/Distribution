package typings.onesignalDashCordovaDashPlugin.OneSignalCordovaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OSPermissionSubscriptionState extends js.Object {
  var permissionStatus: OSPermissionState
  var subscriptionStatus: OSSubscriptionState
}

object OSPermissionSubscriptionState {
  @scala.inline
  def apply(permissionStatus: OSPermissionState, subscriptionStatus: OSSubscriptionState): OSPermissionSubscriptionState = {
    val __obj = js.Dynamic.literal(permissionStatus = permissionStatus, subscriptionStatus = subscriptionStatus)
  
    __obj.asInstanceOf[OSPermissionSubscriptionState]
  }
}

