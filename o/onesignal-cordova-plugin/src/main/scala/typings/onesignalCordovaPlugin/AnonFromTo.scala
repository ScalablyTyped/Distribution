package typings.onesignalCordovaPlugin

import typings.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSPermissionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFromTo extends js.Object {
  var from: OSPermissionState
  var to: OSPermissionState
}

object AnonFromTo {
  @scala.inline
  def apply(from: OSPermissionState, to: OSPermissionState): AnonFromTo = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFromTo]
  }
}

