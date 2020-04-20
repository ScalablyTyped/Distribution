package typings.onesignalCordovaPlugin

import typings.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSEmailSubscriptionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFrom extends js.Object {
  var from: OSEmailSubscriptionState
  var to: OSEmailSubscriptionState
}

object AnonFrom {
  @scala.inline
  def apply(from: OSEmailSubscriptionState, to: OSEmailSubscriptionState): AnonFrom = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFrom]
  }
}

