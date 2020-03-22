package typings.openfin.notificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationCallback extends js.Object {
  var message: js.UndefOr[js.Any] = js.undefined
}

object NotificationCallback {
  @scala.inline
  def apply(message: js.Any = null): NotificationCallback = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationCallback]
  }
}

