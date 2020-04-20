package typings.onesignalCordovaPlugin

import typings.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSPermissionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTo extends js.Object {
  var from: OSPermissionState
  var to: OSPermissionState
}

object AnonTo {
  @scala.inline
  def apply(from: OSPermissionState, to: OSPermissionState): AnonTo = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTo]
  }
}

