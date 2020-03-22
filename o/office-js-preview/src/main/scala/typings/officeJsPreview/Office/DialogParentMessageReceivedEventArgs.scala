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
trait DialogParentMessageReceivedEventArgs extends js.Object {
  /**
    * Gets the content of the message sent from the parent page, which can be any string or stringified data.
    */
  var message: String
  /**
    * Get an {@link Office.EventType} enumeration value that identifies the kind of event that was raised.
    */
  var `type`: EventType
}

object DialogParentMessageReceivedEventArgs {
  @scala.inline
  def apply(message: String, `type`: EventType): DialogParentMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogParentMessageReceivedEventArgs]
  }
}

