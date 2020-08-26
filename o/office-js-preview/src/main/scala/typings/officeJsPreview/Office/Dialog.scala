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
@js.native
trait Dialog extends js.Object {
  /**
    * Registers an event handler. The two supported events are:
    *
    * - DialogMessageReceived. Triggered when the dialog box sends a message to its parent.
    *
    * - DialogEventReceived. Triggered when the dialog box has been closed or otherwise unloaded.
    */
  def addEventHandler(eventType: EventType, handler: js.Function): Unit = js.native
  /**
    * Called from a parent page to close the corresponding dialog box.
    */
  def close(): Unit = js.native
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
  def messageChild(message: String): Unit = js.native
  /**
    * FOR INTERNAL USE ONLY. DO NOT CALL IN YOUR CODE.
    */
  def sendMessage(name: String): Unit = js.native
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
  @scala.inline
  implicit class DialogOps[Self <: Dialog] (val x: Self) extends AnyVal {
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
    def setAddEventHandler(value: (EventType, js.Function) => Unit): Self = this.set("addEventHandler", js.Any.fromFunction2(value))
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setMessageChild(value: String => Unit): Self = this.set("messageChild", js.Any.fromFunction1(value))
    @scala.inline
    def setSendMessage(value: String => Unit): Self = this.set("sendMessage", js.Any.fromFunction1(value))
  }
  
}

