package typings.openfin.transportMod

import typings.openfin.openfinStrings.`process-notification-event`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationEventMessage extends Message[NotificationEvent] {
  @JSName("action")
  var action_NotificationEventMessage: `process-notification-event` = js.native
}

object NotificationEventMessage {
  @scala.inline
  def apply(action: `process-notification-event`, payload: NotificationEvent): NotificationEventMessage = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventMessage]
  }
  @scala.inline
  implicit class NotificationEventMessageOps[Self <: NotificationEventMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: `process-notification-event`): Self = this.set("action", value.asInstanceOf[js.Any])
  }
  
}

