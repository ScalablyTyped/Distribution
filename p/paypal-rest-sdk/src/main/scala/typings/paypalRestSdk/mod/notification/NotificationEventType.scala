package typings.paypalRestSdk.mod.notification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationEventType extends js.Object {
  val description: js.UndefOr[String] = js.undefined
  var name: String
  var status: js.UndefOr[String] = js.undefined
}

object NotificationEventType {
  @scala.inline
  def apply(name: String, description: String = null, status: String = null): NotificationEventType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventType]
  }
}

