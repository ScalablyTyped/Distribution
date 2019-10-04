package typings.onesignalDashCordovaDashPlugin.OneSignalCordovaPluginNs

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
    val __obj = js.Dynamic.literal(emailAddress = emailAddress, emailUserId = emailUserId)
  
    __obj.asInstanceOf[OSEmailSubscriptionState]
  }
}

