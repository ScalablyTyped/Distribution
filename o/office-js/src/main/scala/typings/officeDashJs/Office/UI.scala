package typings.officeDashJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides objects and methods that you can use to create and manipulate UI components, such as dialog boxes, in your Office Add-ins.
  * 
  * Visit "{@link https://docs.microsoft.com/office/dev/add-ins/develop/dialog-api-in-office-add-ins | Use the Dialog API in your Office Add-ins}" 
  * for more information.
  */
@js.native
trait UI extends js.Object {
  /**
    * Closes the UI container where the JavaScript is executing.
    *
    * @remarks
    * 
    * **Hosts**: Excel, Word, PowerPoint, Outlook (Minimum requirement set: Mailbox 1.5)
    * 
    * **Requirement set**: {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/dialog-api-requirement-sets | DialogApi}
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
    * **Hosts**: Word, Excel, Outlook, PowerPoint
    * 
    * **Requirement sets**: 
    * 
    * - {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/dialog-api-requirement-sets | DialogApi}
    * 
    * - {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/outlook-api-requirement-sets | Mailbox 1.4}
    * 
    * This method is available in the DialogApi requirement set for Word, Excel, or PowerPoint add-ins, and in the Mailbox requirement set 1.4 
    * for Outlook. For more on how to specify a requirement set in your manifest, see 
    * {@link https://docs.microsoft.com/office/dev/add-ins/develop/specify-office-hosts-and-api-requirements | Specify Office hosts and API requirements}.
    *
    * The initial page must be on the same domain as the parent page (the startAddress parameter). After the initial page loads, you can go to 
    * other domains.
    *
    * Any page calling `Office.context.ui.messageParent` must also be on the same domain as the parent page.
    * 
    * **Design considerations**:
    *
    * The following design considerations apply to dialog boxes:
    *
    * - An Office Add-in task pane can have only one dialog box open at any time. Multiple dialogs can be open at the same time from Add-in 
    * Commands (custom ribbon buttons or menu items).
    *
    * - Every dialog box can be moved and resized by the user.
    *
    * - Every dialog box is centered on the screen when opened.
    *
    * - Dialog boxes appear on top of the host application and in the order in which they were created.
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
    * For a design pattern that you can use to create a dialog box, see 
    * {@link https://github.com/OfficeDev/Office-Add-in-UX-Design-Patterns/blob/master/Patterns/Client_Dialog.md | Client Dialog}  in the Office 
    * Add-in UX Design Patterns repository on GitHub.
    * 
    * **displayDialogAsync Errors**:
    * 
    * <table>
    *   <tr>
    *     <th>Code number</th>
    *     <th>Meaning</th>
    *   </tr>
    *   <tr>
    *     <td>12004</td>
    *     <td>The domain of the URL passed to displayDialogAsync is not trusted. The domain must be either the same domain as the host page (including protocol and port number), or it must be registered in the <AppDomains> section of the add-in manifest.</td>
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
    *     <th>Use to</th>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.value</td>
    *     <td>Access the Dialog object.</td>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.status</td>
    *     <td>Determine the success or failure of the operation.</td>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.error</td>
    *     <td>Access an Error object that provides error information if the operation failed.</td>
    *   </tr>
    *   <tr>
    *     <td>AsyncResult.asyncContext</td>
    *     <td>Access your user-defined object or value, if you passed one as the asyncContext parameter.</td>
    *   </tr>
    * </table>
    *
    * @param startAddress - Accepts the initial HTTPS URL that opens in the dialog.
    * @param options - Optional. Accepts an {@link Office.DialogOptions} object to define dialog display.
    * @param callback - Optional. Accepts a callback method to handle the dialog creation attempt. If successful, the AsyncResult.value is a Dialog object.
    */
  def displayDialogAsync(startAddress: String): Unit = js.native
  def displayDialogAsync(startAddress: String, callback: js.Function1[/* result */ AsyncResult[Dialog], Unit]): Unit = js.native
  def displayDialogAsync(startAddress: String, options: DialogOptions): Unit = js.native
  def displayDialogAsync(
    startAddress: String,
    options: DialogOptions,
    callback: js.Function1[/* result */ AsyncResult[Dialog], Unit]
  ): Unit = js.native
  def messageParent(message: String): Unit = js.native
  /**
    * Delivers a message from the dialog box to its parent/opener page. The page calling this API must be on the same domain as the parent. 
    * 
    * @remarks
    * 
    * **Requirement set**: {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/dialog-api-requirement-sets | DialogApi}
    * 
    * @param message Accepts a message from the dialog to deliver to the add-in. In addition to a boolean, anything that can serialized to a string including JSON and XML can be sent. 
    */
  def messageParent(message: Boolean): Unit = js.native
}

