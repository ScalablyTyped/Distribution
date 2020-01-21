package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommsNotifications extends js.Object {
  var value: js.UndefOr[js.Array[CommsNotification]] = js.undefined
}

object CommsNotifications {
  @scala.inline
  def apply(value: js.Array[CommsNotification] = null): CommsNotifications = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommsNotifications]
  }
}

