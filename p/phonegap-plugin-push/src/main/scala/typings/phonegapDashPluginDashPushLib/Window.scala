package typings
package phonegapDashPluginDashPushLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var PushNotification: phonegapDashPluginDashPushLib.PhonegapPluginPushNs.PushNotificationStatic
}

object Window {
  @scala.inline
  def apply(PushNotification: phonegapDashPluginDashPushLib.PhonegapPluginPushNs.PushNotificationStatic): Window = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PushNotification")(PushNotification)
    __obj.asInstanceOf[Window]
  }
}

