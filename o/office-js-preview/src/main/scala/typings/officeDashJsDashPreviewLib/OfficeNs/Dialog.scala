package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The object that is returned when `UI.displayDialogAsync` is called. It exposes methods for registering event handlers and closing the dialog.
  */
trait Dialog extends js.Object {
  /**
    * Registers an event handler. The two supported events are:
    *
    * - DialogMessageReceived. Triggered when the dialog box sends a message to its parent.
    *
    * - DialogEventReceived. Triggered when the dialog box has been closed or otherwise unloaded.
    */
  def addEventHandler(eventType: EventType, handler: js.Function): scala.Unit
  /**
    * Called from a parent page to close the corresponding dialog box. 
    */
  def close(): scala.Unit
  /**
    * FOR INTERNAL USE ONLY. DO NOT CALL IN YOUR CODE.
    */
  def sendMessage(name: java.lang.String): scala.Unit
}

object Dialog {
  @scala.inline
  def apply(
    addEventHandler: js.Function2[EventType, js.Function, scala.Unit],
    close: js.Function0[scala.Unit],
    sendMessage: js.Function1[java.lang.String, scala.Unit]
  ): Dialog = {
    val __obj = js.Dynamic.literal(addEventHandler = addEventHandler, close = close, sendMessage = sendMessage)
  
    __obj.asInstanceOf[Dialog]
  }
}

