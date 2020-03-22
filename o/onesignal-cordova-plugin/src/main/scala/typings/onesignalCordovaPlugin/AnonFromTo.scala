package typings.onesignalCordovaPlugin

import typings.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSSubscriptionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFromTo extends js.Object {
  var from: OSSubscriptionState
  var to: OSSubscriptionState
}

object AnonFromTo {
  @scala.inline
  def apply(from: OSSubscriptionState, to: OSSubscriptionState): AnonFromTo = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFromTo]
  }
}

