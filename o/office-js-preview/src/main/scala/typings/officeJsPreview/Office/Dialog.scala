package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The object that is returned when `UI.displayDialogAsync` is called. It exposes methods for registering event handlers and closing the dialog.
  * 
  * @remarks
  * 
  * **Requirement set**: {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/dialog-api-requirement-sets | DialogApi}
  */
trait Dialog extends js.Object {
  /**
    * Registers an event handler. The two supported events are:
    *
    * - DialogMessageReceived. Triggered when the dialog box sends a message to its parent.
    *
    * - DialogEventReceived. Triggered when the dialog box has been closed or otherwise unloaded.
    */
  def addEventHandler(eventType: EventType, handler: js.Function): Unit
  /**
    * Called from a parent page to close the corresponding dialog box. 
    */
  def close(): Unit
  /**
    * Delivers a message from the host page, such as a task pane or a UI-less function file, to a dialog that was opened from the page. 
    * 
    * @beta
    * 
    * @remarks
    * 
    * **Requirement set**: TBD
    * 
    * @param message Accepts a message from the host page to deliver to the dialog. Anything that can be serialized to a string, including JSON and XML, can be sent.
    */
  def messageChild(message: String): Unit
  /**
    * FOR INTERNAL USE ONLY. DO NOT CALL IN YOUR CODE.
    */
  def sendMessage(name: String): Unit
}

object Dialog {
  @scala.inline
  def apply(
    addEventHandler: (EventType, js.Function) => Unit,
    close: () => Unit,
    messageChild: String => Unit,
    sendMessage: String => Unit
  ): Dialog = {
    val __obj = js.Dynamic.literal(addEventHandler = js.Any.fromFunction2(addEventHandler), close = js.Any.fromFunction0(close), messageChild = js.Any.fromFunction1(messageChild), sendMessage = js.Any.fromFunction1(sendMessage))
    __obj.asInstanceOf[Dialog]
  }
}

