package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the message from the parent page that raised the `DialogParentMessageReceived` event.
  *
  * @beta
  *
  * To add an event handler for the `DialogParentMessageReceived` event, use the `addHandlerAsync` method of the
  * {@link Office.UI} object.
  *
  */
@js.native
trait DialogParentMessageReceivedEventArgs extends js.Object {
  /**
    * Gets the content of the message sent from the parent page, which can be any string or stringified data.
    */
  var message: String = js.native
  /**
    * Get an {@link Office.EventType} enumeration value that identifies the kind of event that was raised.
    */
  var `type`: EventType = js.native
}

object DialogParentMessageReceivedEventArgs {
  @scala.inline
  def apply(message: String, `type`: EventType): DialogParentMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogParentMessageReceivedEventArgs]
  }
  @scala.inline
  implicit class DialogParentMessageReceivedEventArgsOps[Self <: DialogParentMessageReceivedEventArgs] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: EventType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

