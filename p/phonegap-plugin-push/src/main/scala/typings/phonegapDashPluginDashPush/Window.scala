package typings.phonegapDashPluginDashPush

import typings.phonegapDashPluginDashPush.PhonegapPluginPush.PushNotificationStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var PushNotification: PushNotificationStatic
}

object Window {
  @scala.inline
  def apply(PushNotification: PushNotificationStatic): Window = {
    val __obj = js.Dynamic.literal(PushNotification = PushNotification.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Window]
  }
}

