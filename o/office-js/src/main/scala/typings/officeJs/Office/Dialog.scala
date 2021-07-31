package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The object that is returned when `UI.displayDialogAsync` is called. It exposes methods for registering event handlers and closing the dialog.
  * 
  * @remarks
  * 
  * **Requirement set**: {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/dialog-api-requirement-sets | DialogApi}
  */
trait Dialog extends StObject {
  
  /**
    * Registers an event handler. The two supported events are:
    *
    * - DialogMessageReceived. Triggered when the dialog box sends a message to its parent.
    *
    * - DialogEventReceived. Triggered when the dialog box has been closed or otherwise unloaded.
    * 
    * @param eventType Must be either DialogMessageReceived or DialogEventReceived.
    * @param handler A function which accepts either an object with a `message` property, if eventType is DialogMessageReceived, or an object with an `error` property, if eventType is DialogEventReceived.
    */
  def addEventHandler(
    eventType: EventType,
    handler: js.Function1[/* args */ typings.officeJs.anon.Message | typings.officeJs.anon.Error, Unit]
  ): Unit
  
  /**
    * Called from a parent page to close the corresponding dialog box. 
    */
  def close(): Unit
  
  /**
    * Delivers a message from the host page, such as a task pane or a UI-less function file, to a dialog that was opened from the page.
    *
    * @remarks
    *
    * **Hosts**: Excel, Outlook (Minimum requirement set: Mailbox 1.9), PowerPoint, Word
    *
    * **Requirement sets**:
    *
    * - {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/dialog-api-requirement-sets | DialogApi 1.2}
    *
    * - {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/outlook-api-requirement-sets | Mailbox 1.9}
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
    addEventHandler: (EventType, js.Function1[/* args */ typings.officeJs.anon.Message | typings.officeJs.anon.Error, Unit]) => Unit,
    close: () => Unit,
    messageChild: String => Unit,
    sendMessage: String => Unit
  ): Dialog = {
    val __obj = js.Dynamic.literal(addEventHandler = js.Any.fromFunction2(addEventHandler), close = js.Any.fromFunction0(close), messageChild = js.Any.fromFunction1(messageChild), sendMessage = js.Any.fromFunction1(sendMessage))
    __obj.asInstanceOf[Dialog]
  }
  
  @scala.inline
  implicit class DialogMutableBuilder[Self <: Dialog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEventHandler(
      value: (EventType, js.Function1[/* args */ typings.officeJs.anon.Message | typings.officeJs.anon.Error, Unit]) => Unit
    ): Self = StObject.set(x, "addEventHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMessageChild(value: String => Unit): Self = StObject.set(x, "messageChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendMessage(value: String => Unit): Self = StObject.set(x, "sendMessage", js.Any.fromFunction1(value))
  }
}
