package typings
package onesignalDashCordovaDashPluginLib.OneSignalCordovaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OSPermissionState extends js.Object {
  var hasPrompted: scala.Boolean
  var status: OSNotificationPermission
}

object OSPermissionState {
  @scala.inline
  def apply(hasPrompted: scala.Boolean, status: OSNotificationPermission): OSPermissionState = {
    val __obj = js.Dynamic.literal(hasPrompted = hasPrompted, status = status)
  
    __obj.asInstanceOf[OSPermissionState]
  }
}

