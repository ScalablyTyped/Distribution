package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The object that is returned when `UI.displayDialogAsync` is called. It exposes methods for registering event handlers and closing the dialog.
  *
  * @remarks
  *
  * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/dialog-api-requirement-sets | DialogApi}
  */
@js.native
trait Dialog extends StObject {
  
  /**
    * Registers an event handler. The two supported events are:
    *
    * - DialogMessageReceived. Triggered when the dialog box sends a message to its parent.
    *
    * - DialogEventReceived. Triggered when the dialog box has been closed or otherwise unloaded.
    * 
    * @param eventType Must be either DialogMessageReceived or DialogEventReceived.
    * @param handler A function which accepts either an object with a `message` and `origin` property, if `eventType` is `DialogMessageReceived`, or an object with an `error` property, if `eventType` is `DialogEventReceived`. Note that the `origin` property is `undefined` on clients that don’t support {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/dialog-origin-requirement-sets | DialogOrigin 1.1}. 
    */
  def addEventHandler(
    eventType: EventType,
    handler: js.Function1[/* args */ typings.officeJs.anon.Message | typings.officeJs.anon.Error, Unit]
  ): Unit = js.native
  
  /**
    * Called from a parent page to close the corresponding dialog box. 
    * 
    * This method is asynchronous. It does not take a callback parameter and it does not return a Promise object, so it cannot be awaited with either the `await` keyword or the `then` function. See this best practice for more information: {@link https://learn.microsoft.com/office/dev/add-ins/develop/dialog-best-practices#opening-another-dialog-immediately-after-closing-one | Opening another dialog immediately after closing one}
    */
  def close(): Unit = js.native
  
  /**
    * Delivers a message from the host page, such as a task pane or a UI-less function file, to a dialog that was opened from the page.
    *
    * @remarks
    *
    * **Applications**: Excel, Outlook (Minimum requirement set: Mailbox 1.9), PowerPoint, Word
    *
    * **Requirement sets**:
    *
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/dialog-api-requirement-sets | DialogApi 1.2}
    *
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/outlook/outlook-api-requirement-sets | Mailbox 1.9}
    *
    * - If the `messageOptions` parameter is used, {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/dialog-origin-requirement-sets | DialogOrigin 1.1} is also required.
    *
    * @param message Accepts a message from the host page to deliver to the dialog. Anything that can be serialized to a string, including JSON and XML, can be sent.
    * @param messageOptions Optional. Provides options for how to send the message. 
    */
  def messageChild(message: String): Unit = js.native
  def messageChild(message: String, messageOptions: DialogMessageOptions): Unit = js.native
  
  /**
    * FOR INTERNAL USE ONLY. DO NOT CALL IN YOUR CODE.
    */
  def sendMessage(name: String): Unit = js.native
}
