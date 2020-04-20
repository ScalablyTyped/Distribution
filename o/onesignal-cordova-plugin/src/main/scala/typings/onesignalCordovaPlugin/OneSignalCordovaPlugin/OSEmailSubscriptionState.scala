package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OSEmailSubscriptionState extends js.Object {
  var emailAddress: String
  var emailUserId: String
}

object OSEmailSubscriptionState {
  @scala.inline
  def apply(emailAddress: String, emailUserId: String): OSEmailSubscriptionState = {
    val __obj = js.Dynamic.literal(emailAddress = emailAddress.asInstanceOf[js.Any], emailUserId = emailUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSEmailSubscriptionState]
  }
}

