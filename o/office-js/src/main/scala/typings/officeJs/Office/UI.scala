package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides objects and methods that you can use to create and manipulate UI components, such as dialog boxes, in your Office Add-ins.
  *
  * Visit "{@link https://learn.microsoft.com/office/dev/add-ins/develop/dialog-api-in-office-add-ins | Use the Dialog API in your Office Add-ins}"
  * for more information.
  */
@js.native
trait UI extends StObject {
  
  /**
    * Adds an event handler to the object using the specified event type.
    *
    * @remarks
    *
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/dialog-api-requirement-sets | DialogApi 1.2}
    *
    * You can add multiple event handlers for the specified event type as long as the name of each event handler function is unique.
    *
    * @param eventType Specifies the type of event to add. This must be `Office.EventType.DialogParentMessageReceived`.
    * @param handler The event handler function to add, whose only parameter is of type {@link Office.DialogParentMessageReceivedEventArgs}.
    * @param callback Optional. A function that is invoked when the handler registration returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def addHandlerAsync(
    eventType: EventType,
    handler: js.Function1[/* result */ DialogParentMessageReceivedEventArgs, Unit]
  ): Unit = js.native
  def addHandlerAsync(
    eventType: EventType,
    handler: js.Function1[/* result */ DialogParentMessageReceivedEventArgs, Unit],
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  /**
    * Adds an event handler to the object using the specified event type.
    *
    * @remarks
    *
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/dialog-api-requirement-sets | DialogApi 1.2}
    *
    * You can add multiple event handlers for the specified event type as long as the name of each event handler function is unique.
    *
    * @param eventType Specifies the type of event to add. This must be `Office.EventType.DialogParentMessageReceived`.
    * @param handler The event handler function to add, whose only parameter is of type {@link Office.DialogParentMessageReceivedEventArgs}.
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the handler registration returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def addHandlerAsync(
    eventType: EventType,
    handler: js.Function1[/* result */ DialogParentMessageReceivedEventArgs, Unit],
    options: AsyncContextOptions
  ): Unit = js.native
  def addHandlerAsync(
    eventType: EventType,
    handler: js.Function1[/* result */ DialogParentMessageReceivedEventArgs, Unit],
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  
  /**
    * Closes the UI container where the JavaScript is executing.
    *
    * @remarks
    *
    * **Applications**: Excel, Outlook (Minimum requirement set: Mailbox 1.5), PowerPoint, Word
    *
    * **Requirement sets**:
    *
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/dialog-api-requirement-sets | DialogApi}
    *
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/outlook/outlook-api-requirement-sets | Mailbox 1.5}
    *
    * The behavior of this method is specified by the following:
    *
    * - Called from a UI-less command button: No effect. Any dialog opened by displayDialogAsync will remain open.
    *
    * - Called from a task pane: The task pane will close. Any dialog opened by displayDialogAsync will also close.
    * If the task pane supports pinning and was pinned by the user, it will be un-pinned.
    *
    * - Called from a module extension: No effect.
    */
  def closeContainer(): Unit = js.native
  
  /**
    * Displays a dialog to show or collect information from the user or to facilitate Web navigation.
    *
    * @remarks
    *
    * **Applications**: Excel, Outlook, PowerPoint, Word
    *
    * **Requirement sets**:
    *
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/dialog-api-requirement-sets | DialogApi}
    *
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/outlook/outlook-api-requirement-sets | Mailbox 1.4}
    *
    * This method is available in the DialogApi requirement set for Excel, PowerPoint, or Word add-ins, and in the Mailbox requirement set 1.4
    * for Outlook. For more on how to specify a requirement set in your manifest, see
    * {@link https://learn.microsoft.com/office/dev/add-ins/develop/specify-office-hosts-and-api-requirements | Specify Office applications and API requirements}, if you're using the XML manifest. If you're using the Teams manifest (preview), see {@link https://learn.microsoft.com/office/dev/add-ins/develop/json-manifest-overview | Teams manifest for Office Add-ins (preview)}.
    *
    * The initial page must be on the same domain as the parent page (the startAddress parameter). After the initial page loads, you can go to
    * other domains.
    *
    * Any page calling `Office.context.ui.messageParent` must also be on the same domain as the parent page.
    *
    * **Design considerations**:
    *
    * The following design considerations apply to dialog boxes.
    *
    * - An Office Add-in task pane can have only one dialog box open at any time. Multiple dialogs can be open at the same time from Add-in
    * Commands (custom ribbon buttons or menu items).
    *
    * - Every dialog box can be moved and resized by the user.
    *
    * - Every dialog box is centered on the screen when opened.
    *
    * - Dialog boxes appear on top of the application and in the order in which they were created.
    *
    * Use a dialog box to:
    *
    * - Display authentication pages to collect user credentials.
    *
    * - Display an error/progress/input screen from a ShowTaskpane or ExecuteAction command.
    *
    * - Temporarily increase the surface area that a user has available to complete a task.
    *
    * Do not use a dialog box to interact with a document. Use a task pane instead.
    *
    * **displayDialogAsync Errors**
    *
    * <table>
    *   <tr>
    *     <th>Code number</th>
    *     <th>Meaning</th>
    *   </tr>
    *   <tr>
    *     <td>12004</td>
    *     <td>The domain of the URL passed to displayDialogAsync is not trusted. The domain must be either the same domain as the host page (including protocol and port number), or it must be registered in the <code>AppDomains</code> section of the add-in manifest.</td>
    *   </tr>
    *   <tr>
    *     <td>12005</td>
    *     <td>The URL passed to displayDialogAsync uses the HTTP protocol. HTTPS is required. (In some versions of Office, the error message returned with 12005 is the same one returned for 12004.)</td>
    *   </tr>
    *   <tr>
    *     <td>12007</td>
    *     <td>A dialog box is already opened from the task pane. A task pane add-in can only have one dialog box open at a time.</td>
    *   </tr>
    *   <tr>
    *     <td>12009</td>
    *     <td>The user chose to ignore the dialog box. This error can occur in online versions of Office, where users may choose not to allow an add-in to present a dialog.</td>
    *   </tr>
    * </table>
    *
    * In the callback function passed to the displayDialogAsync method, you can use the properties of the AsyncResult object to return the
    * following information.
    *
    * <table>
    *   <tr>
    *     <th>Property</th>
    *     <th>Use</th>
    *   </tr>
    *   <tr>
    *     <td><code>AsyncResult.value</code></td>
    *     <td>Access the Dialog object</td>
    *   </tr>
    *   <tr>
    *     <td><code>AsyncResult.status</code></td>
    *     <td>Determine the success or failure of the operation</td>
    *   </tr>
    *   <tr>
    *     <td><code>AsyncResult.error</code></td>
    *     <td>Access an Error object that provides error information if the operation failed</td>
    *   </tr>
    *   <tr>
    *     <td><code>AsyncResult.asyncContext</code></td>
    *     <td>Access your user-defined object or value, if you passed one as the asyncContext parameter</td>
    *   </tr>
    * </table>
    *
    * @param startAddress - Accepts the initial full HTTPS URL that opens in the dialog. Relative URLs must not be used.
    * @param options - Optional. Accepts an {@link Office.DialogOptions} object to define dialog display.
    * @param callback - Optional. Accepts a callback function to handle the dialog creation attempt. If successful, the AsyncResult.value is a Dialog object.
    */
  def displayDialogAsync(startAddress: String): Unit = js.native
  def displayDialogAsync(startAddress: String, callback: js.Function1[/* result */ AsyncResult[Dialog], Unit]): Unit = js.native
  def displayDialogAsync(
    startAddress: String,
    options: Unit,
    callback: js.Function1[/* result */ AsyncResult[Dialog], Unit]
  ): Unit = js.native
  def displayDialogAsync(startAddress: String, options: DialogOptions): Unit = js.native
  def displayDialogAsync(
    startAddress: String,
    options: DialogOptions,
    callback: js.Function1[/* result */ AsyncResult[Dialog], Unit]
  ): Unit = js.native
  
  /**
    * Delivers a message from the dialog box to its parent/opener page. 
    * 
    * @remarks
    * 
    * **Requirement sets**: 
    * 
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/dialog-api-requirement-sets | DialogApi}
    * 
    * - If the `messageOptions` parameter is used, {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/dialog-origin-requirement-sets | DialogOrigin 1.1} is also required.
    * 
    * @param message Accepts a message from the dialog to deliver to the add-in. Anything that can serialized to a string including JSON and XML can be sent. 
    * @param messageOptions Optional. Provides options for how to send the message. 
    */
  def messageParent(message: String): Unit = js.native
  def messageParent(message: String, messageOptions: DialogMessageOptions): Unit = js.native
  
  /**
    * Opens a browser window and loads the specified URL. 
    * 
    * @remarks
    * 
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/open-browser-window-api-requirement-sets | OpenBrowserWindowApi 1.1}
    *  
    * @param url The full URL to be opened including protocol (e.g., https), and port number, if any.
    */
  def openBrowserWindow(url: String): Unit = js.native
}
