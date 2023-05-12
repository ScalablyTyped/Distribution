package typings.officeJs.Office

import typings.officeJs.Office.MailboxEnums.ItemType
import typings.officeJs.anon.AsyncContextOptionsisInli
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The message compose mode of {@link Office.Item | Office.context.mailbox.item}.
  *
  * **Important**: This is an internal Outlook object, not directly exposed through existing interfaces.
  * You should treat this as a mode of `Office.context.mailbox.item`. For more information, refer to the
  * {@link https://learn.microsoft.com/javascript/api/requirement-sets/outlook/requirement-set-1.12/office.context.mailbox.item | Object Model} page.
  *
  * Parent interfaces:
  *
  * - {@link Office.ItemCompose | ItemCompose}
  *
  * - {@link Office.Message | Message}
  */
@js.native
trait MessageCompose
  extends StObject
     with Item {
  
  /**
    * Adds a file to a message or appointment as an attachment.
    *
    * The `addFileAttachmentAsync` method uploads the file at the specified URI and attaches it to the item in the compose form.
    *
    * You can subsequently use the identifier with the `removeAttachmentAsync` method to remove the attachment in the same session.
    *
    * **Important**: In recent builds of Outlook on Windows, a bug was introduced that incorrectly appends an `Authorization: Bearer` header to
    * this action (whether using this API or the Outlook UI). To work around this issue, you can try using the `addFileAttachmentFromBase64` API
    * introduced with requirement set 1.8.
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * **Errors**:
    *
    * - `AttachmentSizeExceeded`: The attachment is larger than allowed.
    *
    * - `FileTypeNotSupported`: The attachment has an extension that is not allowed.
    *
    * - `NumberOfAttachmentsExceeded`: The message or appointment has too many attachments.
    *
    * @param uri - The URI that provides the location of the file to attach to the message or appointment. The maximum length is 2048 characters.
    * @param attachmentName - The name of the attachment that is shown while the attachment is uploading. The maximum length is 255 characters.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`. On success, the attachment identifier will be provided in the `asyncResult.value` property.
    *                 If uploading the attachment fails, the `asyncResult` object will contain an `Error` object that provides a description of
    *                 the error.
    */
  def addFileAttachmentAsync(uri: String, attachmentName: String): Unit = js.native
  def addFileAttachmentAsync(
    uri: String,
    attachmentName: String,
    callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]
  ): Unit = js.native
  /**
    * Adds a file to a message or appointment as an attachment.
    *
    * The `addFileAttachmentAsync` method uploads the file at the specified URI and attaches it to the item in the compose form.
    *
    * You can subsequently use the identifier with the `removeAttachmentAsync` method to remove the attachment in the same session.
    *
    * **Important**: In recent builds of Outlook on Windows, a bug was introduced that incorrectly appends an `Authorization: Bearer` header to
    * this action (whether using this API or the Outlook UI). To work around this issue, you can try using the `addFileAttachmentFromBase64` API
    * introduced with requirement set 1.8.
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * **Errors**:
    *
    * - `AttachmentSizeExceeded`: The attachment is larger than allowed.
    *
    * - `FileTypeNotSupported`: The attachment has an extension that is not allowed.
    *
    * - `NumberOfAttachmentsExceeded`: The message or appointment has too many attachments.
    *
    * @param uri - The URI that provides the location of the file to attach to the message or appointment. The maximum length is 2048 characters.
    * @param attachmentName - The name of the attachment that is shown while the attachment is uploading. The maximum length is 255 characters.
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    *        `isInline`: If true, indicates that the attachment will be shown inline in the message body, and should not be displayed in the
    *        attachment list.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`. On success, the attachment identifier will be provided in the `asyncResult.value` property.
    *                 If uploading the attachment fails, the `asyncResult` object will contain an `Error` object that provides a description of
    *                 the error.
    */
  def addFileAttachmentAsync(uri: String, attachmentName: String, options: AsyncContextOptionsisInli): Unit = js.native
  def addFileAttachmentAsync(
    uri: String,
    attachmentName: String,
    options: AsyncContextOptionsisInli,
    callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]
  ): Unit = js.native
  
  /**
    * Adds a file to a message or appointment as an attachment.
    *
    * The `addFileAttachmentFromBase64Async` method uploads the file from the Base64 encoding and attaches it to the item in the compose form.
    * This method returns the attachment identifier in the `asyncResult.value` object.
    *
    * You can subsequently use the identifier with the `removeAttachmentAsync` method to remove the attachment in the same session.
    *
    * **Note**: If you're using a data URL API (e.g., `readAsDataURL`), you need to strip out the data URL prefix then send the rest of the string to this API.
    * For example, if the full string is represented by `data:image/svg+xml;base64,<rest of Base64 string>`, remove `data:image/svg+xml;base64,`.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * **Errors**:
    *
    * - `AttachmentSizeExceeded`: The attachment is larger than allowed.
    *
    * - `FileTypeNotSupported`: The attachment has an extension that isn't allowed.
    *
    * - `NumberOfAttachmentsExceeded`: The message or appointment has too many attachments.
    *
    * **Note**: If you're adding an inline Base64 image to the body of a message or appointment being composed, you must first get the current item body using the
    * {@link https://learn.microsoft.com/javascript/api/outlook/office.body#outlook-office-body-getasync-member(1) | Office.context.mailbox.item.body.getAsync} 
    * method before inserting the image using `addFileAttachmentFromBase64Async`. Otherwise, the image won't render in the body once it's inserted.
    * For further guidance, see {@link https://learn.microsoft.com/office/dev/add-ins/outlook/add-and-remove-attachments-to-an-item-in-a-compose-form#attach-a-file | Attach a file}.
    *
    * @param base64File - The Base64-encoded content of an image or file to be added to an email or event. The maximum length of the encoded string is 27,892,122 characters (about 25 MB).
    * @param attachmentName - The name of the attachment that is shown while the attachment is uploading. The maximum length is 255 characters.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                             type Office.AsyncResult. On success, the attachment identifier will be provided in the `asyncResult.value` property.
    *                  If uploading the attachment fails, the `asyncResult` object will contain an `Error` object that provides a description of the error.
    */
  def addFileAttachmentFromBase64Async(base64File: String, attachmentName: String): Unit = js.native
  def addFileAttachmentFromBase64Async(
    base64File: String,
    attachmentName: String,
    callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]
  ): Unit = js.native
  /**
    * Adds a file to a message or appointment as an attachment.
    *
    * The `addFileAttachmentFromBase64Async` method uploads the file from the Base64 encoding and attaches it to the item in the compose form.
    * This method returns the attachment identifier in the `asyncResult.value` object.
    *
    * You can subsequently use the identifier with the `removeAttachmentAsync` method to remove the attachment in the same session.
    *
    * **Note**: If you're using a data URL API (e.g., `readAsDataURL`), you need to strip out the data URL prefix then send the rest of the string to this API.
    * For example, if the full string is represented by `data:image/svg+xml;base64,<rest of Base64 string>`, remove `data:image/svg+xml;base64,`.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * **Errors**:
    *
    * - `AttachmentSizeExceeded`: The attachment is larger than allowed.
    *
    * - `FileTypeNotSupported`: The attachment has an extension that isn't allowed.
    *
    * - `NumberOfAttachmentsExceeded`: The message or appointment has too many attachments.
    *
    * **Note**: If you're adding an inline Base64 image to the body of a message or appointment being composed, you must first get the current item body using the
    * {@link https://learn.microsoft.com/javascript/api/outlook/office.body#outlook-office-body-getasync-member(1) | Office.context.mailbox.item.body.getAsync} 
    * method before inserting the image using `addFileAttachmentFromBase64Async`. Otherwise, the image won't render in the body once it's inserted.
    * For further guidance, see {@link https://learn.microsoft.com/office/dev/add-ins/outlook/add-and-remove-attachments-to-an-item-in-a-compose-form#attach-a-file | Attach a file}.
    *
    * @param base64File - The Base64-encoded content of an image or file to be added to an email or event. The maximum length of the encoded string is 27,892,122 characters (about 25 MB).
    * @param attachmentName - The name of the attachment that is shown while the attachment is uploading. The maximum length is 255 characters.
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    *        `isInline`: If true, indicates that the attachment will be shown inline in the message body and should not be displayed in the attachment list.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                             type Office.AsyncResult. On success, the attachment identifier will be provided in the `asyncResult.value` property.
    *                  If uploading the attachment fails, the `asyncResult` object will contain an `Error` object that provides a description of the error.
    */
  def addFileAttachmentFromBase64Async(base64File: String, attachmentName: String, options: AsyncContextOptionsisInli): Unit = js.native
  def addFileAttachmentFromBase64Async(
    base64File: String,
    attachmentName: String,
    options: AsyncContextOptionsisInli,
    callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]
  ): Unit = js.native
  
  def addHandlerAsync(eventType: String, handler: Any): Unit = js.native
  def addHandlerAsync(eventType: String, handler: Any, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  def addHandlerAsync(eventType: String, handler: Any, options: AsyncContextOptions): Unit = js.native
  def addHandlerAsync(
    eventType: String,
    handler: Any,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  /**
    * Adds an event handler for a supported event. **Note**: Events are only available with task pane implementation.
    *
    * For supported events, refer to the Item object model
    * {@link https://learn.microsoft.com/javascript/api/requirement-sets/outlook/requirement-set-1.12/office.context.mailbox.item#events | events section}.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * @param eventType - The event that should invoke the handler.
    * @param handler - The function to handle the event. The function must accept a single parameter, which is an object literal.
    *                The `type` property on the parameter will match the `eventType` parameter passed to `addHandlerAsync`.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    */
  def addHandlerAsync(eventType: EventType, handler: Any): Unit = js.native
  def addHandlerAsync(
    eventType: EventType,
    handler: Any,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  /**
    * Adds an event handler for a supported event. **Note**: Events are only available with task pane implementation.
    *
    * For supported events, refer to the Item object model
    * {@link https://learn.microsoft.com/javascript/api/requirement-sets/outlook/requirement-set-1.12/office.context.mailbox.item#events | events section}.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * @param eventType - The event that should invoke the handler.
    * @param handler - The function to handle the event. The function must accept a single parameter, which is an object literal.
    *                The `type` property on the parameter will match the `eventType` parameter passed to `addHandlerAsync`.
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    */
  def addHandlerAsync(eventType: EventType, handler: Any, options: AsyncContextOptions): Unit = js.native
  def addHandlerAsync(
    eventType: EventType,
    handler: Any,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  
  /**
    * Adds an Exchange item, such as a message, as an attachment to the message or appointment.
    *
    * The `addItemAttachmentAsync` method attaches the item with the specified Exchange identifier to the item in the compose form.
    * If you specify a callback function, the method is called with one parameter, `asyncResult`, which contains either the attachment identifier or
    * a code that indicates any error that occurred while attaching the item. You can use the options parameter to pass state information to the
    * callback function, if needed.
    *
    * You can subsequently use the identifier with the `removeAttachmentAsync` method to remove the attachment in the same session.
    *
    * If your Office Add-in is running in Outlook on the web, the `addItemAttachmentAsync` method can attach items to items other than the item that
    * you are editing; however, this is not supported and is not recommended.
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * **Errors**:
    *
    * - `NumberOfAttachmentsExceeded`: The message or appointment has too many attachments.
    *
    * @param itemId - The Exchange identifier of the item to attach. The maximum length is 100 characters.
    * @param attachmentName - The name of the attachment that is shown while the attachment is uploading. The maximum length is 255 characters.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`. On success, the attachment identifier will be provided in the `asyncResult.value` property.
    *                 If adding the attachment fails, the `asyncResult` object will contain an `Error` object that provides a description of
    *                 the error.
    */
  def addItemAttachmentAsync(itemId: Any, attachmentName: String): Unit = js.native
  def addItemAttachmentAsync(
    itemId: Any,
    attachmentName: String,
    callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]
  ): Unit = js.native
  /**
    * Adds an Exchange item, such as a message, as an attachment to the message or appointment.
    *
    * The `addItemAttachmentAsync` method attaches the item with the specified Exchange identifier to the item in the compose form.
    * If you specify a callback function, the method is called with one parameter, `asyncResult`, which contains either the attachment identifier or
    * a code that indicates any error that occurred while attaching the item. You can use the options parameter to pass state information to the
    * callback function, if needed.
    *
    * You can subsequently use the identifier with the `removeAttachmentAsync` method to remove the attachment in the same session.
    *
    * If your Office Add-in is running in Outlook on the web, the `addItemAttachmentAsync` method can attach items to items other than the item that
    * you are editing; however, this is not supported and is not recommended.
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * **Errors**:
    *
    * - `NumberOfAttachmentsExceeded`: The message or appointment has too many attachments.
    *
    * @param itemId - The Exchange identifier of the item to attach. The maximum length is 100 characters.
    * @param attachmentName - The name of the attachment that is shown while the attachment is uploading. The maximum length is 255 characters.
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`. On success, the attachment identifier will be provided in the `asyncResult.value` property.
    *                 If adding the attachment fails, the `asyncResult` object will contain an `Error` object that provides a description of
    *                 the error.
    */
  def addItemAttachmentAsync(itemId: Any, attachmentName: String, options: AsyncContextOptions): Unit = js.native
  def addItemAttachmentAsync(
    itemId: Any,
    attachmentName: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]
  ): Unit = js.native
  
  /**
    * Gets an object that provides methods to get or update the recipients on the **Bcc** (blind carbon copy) line of a message.
    *
    * Depending on the client/platform (i.e., Windows, Mac, etc.), limits may apply on how many recipients you can get or update.
    * See the {@link Office.Recipients | Recipients} object for more details.
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    */
  var bcc: Recipients = js.native
  
  /**
    * Gets an object that provides methods for manipulating the body of an item.
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    */
  var body: Body = js.native
  
  /**
    * Gets an object that provides methods for managing the item's categories.
    *
    * **Important**: In Outlook on the web, you can't use the API to manage categories on a message in Compose mode.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    */
  var categories: Categories = js.native
  
  /**
    * Provides access to the Cc (carbon copy) recipients of a message. The type of object and level of access depend on the mode of the
    * current item.
    *
    * The `cc` property returns a `Recipients` object that provides methods to get or update the recipients on the
    * **Cc** line of the message. However, depending on the client/platform (i.e., Windows, Mac, etc.), limits may apply on how many recipients
    * you can get or update. See the {@link Office.Recipients | Recipients} object for more details.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    */
  var cc: Recipients = js.native
  
  /**
    * Closes the current item that is being composed.
    *
    * The behavior of the `close` method depends on the current state of the item being composed.
    * If the item has unsaved changes, the client prompts the user to save, discard, or close the action.
    *
    * In the Outlook desktop client, the `close` method has no effect on a reply in the Reading Pane.
    *
    * @remarks
    * [Api set: Mailbox 1.3]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **restricted**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * **Important**: In Outlook on the web, if the item is an appointment and it has previously been saved using `saveAsync`, the user is prompted to save,
    * discard, or cancel even if no changes have occurred since the item was last saved.
    */
  def close(): Unit = js.native
  
  /**
    * Gets an identifier for the email conversation that contains a particular message.
    *
    * You can get an integer for this property if your mail app is activated in read forms or responses in compose forms.
    * If subsequently the user changes the subject of the reply message, upon sending the reply, the conversation ID for that message will change
    * and that value you obtained earlier will no longer apply.
    *
    * You get null for this property for a new item in a compose form.
    * If the user sets a subject and saves the item, the `conversationId` property will return a value.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    */
  var conversationId: String = js.native
  
  /**
    * Disables the Outlook client signature.
    *
    * For Windows and Mac rich clients, this API sets the signature under the "New Message" and "Replies/Forwards" sections
    * for the sending account to "(none)", effectively disabling the signature.
    * For Outlook on the web, the API should disable the signature option for new mails, replies, and forwards.
    * If the signature is selected, this API call should disable it.
    *
    * @remarks
    * [Api set: Mailbox 1.10]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    */
  def disableClientSignatureAsync(): Unit = js.native
  def disableClientSignatureAsync(callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  /**
    * Disables the Outlook client signature.
    *
    * For Windows and Mac rich clients, this API sets the signature under the "New Message" and "Replies/Forwards" sections
    * for the sending account to "(none)", effectively disabling the signature.
    * For Outlook on the web, the API should disable the signature option for new mails, replies, and forwards.
    * If the signature is selected, this API call should disable it.
    *
    * @remarks
    * [Api set: Mailbox 1.10]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    */
  def disableClientSignatureAsync(options: AsyncContextOptions): Unit = js.native
  def disableClientSignatureAsync(options: AsyncContextOptions, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  
  /**
    * Gets the email address of the sender of a message.
    *
    * The `from` property returns a `From` object that provides a method to get the from value.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    */
  var from: From = js.native
  
  /**
    * Gets an attachment from a message or appointment and returns it as an `AttachmentContent` object.
    *
    * The `getAttachmentContentAsync` method gets the attachment with the specified identifier from the item. As a best practice, you should get
    * the attachment's identifier from a `getAttachmentsAsync` call, then in the same session, use that identifier to retrieve the attachment.
    * In Outlook on the web and mobile devices, the attachment identifier is valid only within the same session.
    * A session is over when the user closes the app, or if the user starts composing an inline form then subsequently pops out the form to
    * continue in a separate window.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * **Errors**:
    *
    * - `AttachmentTypeNotSupported`: The attachment type isn't supported. Unsupported types include embedded images in Rich Text Format,
    *                               or item attachment types other than email or calendar items (such as a contact or task item).
    *
    * - `InvalidAttachmentId`: The attachment identifier does not exist.
    *
    * @param attachmentId - The identifier of the attachment you want to get.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object. If the call fails, the `asyncResult.error` property will contain
    *                an error code with the reason for the failure.
    */
  def getAttachmentContentAsync(attachmentId: String): Unit = js.native
  def getAttachmentContentAsync(
    attachmentId: String,
    callback: js.Function1[/* asyncResult */ AsyncResult[AttachmentContent], Unit]
  ): Unit = js.native
  /**
    * Gets an attachment from a message or appointment and returns it as an `AttachmentContent` object.
    *
    * The `getAttachmentContentAsync` method gets the attachment with the specified identifier from the item. As a best practice, you should get
    * the attachment's identifier from a `getAttachmentsAsync` call, then in the same session, use that identifier to retrieve the attachment.
    * In Outlook on the web and mobile devices, the attachment identifier is valid only within the same session.
    * A session is over when the user closes the app, or if the user starts composing an inline form then subsequently pops out the form to
    * continue in a separate window.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * **Errors**:
    *
    * - `AttachmentTypeNotSupported`: The attachment type isn't supported. Unsupported types include embedded images in Rich Text Format,
    *                               or item attachment types other than email or calendar items (such as a contact or task item).
    *
    * - `InvalidAttachmentId`: The attachment identifier does not exist.
    *
    * @param attachmentId - The identifier of the attachment you want to get.
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object. If the call fails, the `asyncResult.error` property will contain
    *                an error code with the reason for the failure.
    */
  def getAttachmentContentAsync(attachmentId: String, options: AsyncContextOptions): Unit = js.native
  def getAttachmentContentAsync(
    attachmentId: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[AttachmentContent], Unit]
  ): Unit = js.native
  
  /**
    * Gets the item's attachments as an array.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`. If the call fails, the `asyncResult.error` property will contain an error code with the reason for
    *                 the failure.
    */
  def getAttachmentsAsync(): Unit = js.native
  def getAttachmentsAsync(callback: js.Function1[/* asyncResult */ AsyncResult[js.Array[AttachmentDetailsCompose]], Unit]): Unit = js.native
  /**
    * Gets the item's attachments as an array.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`. If the call fails, the `asyncResult.error` property will contain an error code with the reason for
    *                 the failure.
    */
  def getAttachmentsAsync(options: AsyncContextOptions): Unit = js.native
  def getAttachmentsAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[js.Array[AttachmentDetailsCompose]], Unit]
  ): Unit = js.native
  
  /**
    * Specifies the type of message compose and its coercion type. The message can be new, or a reply or forward.
    * The coercion type can be HTML or plain text.
    *
    * @remarks
    * [Api set: Mailbox 1.10]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`. On success, the `asyncResult.value` property contains an object with the item's compose type
    *                 and coercion type.
    *
    * @returns
    * An object with `ComposeType` and `CoercionType` enum values for the message item.
    */
  def getComposeTypeAsync(callback: js.Function1[/* asyncResult */ AsyncResult[Any], Unit]): Unit = js.native
  /**
    * Specifies the type of message compose and its coercion type. The message can be new, or a reply or forward.
    * The coercion type can be HTML or plain text.
    *
    * @remarks
    * [Api set: Mailbox 1.10]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`. On success, the `asyncResult.value` property contains an object with the item's compose type
    *                 and coercion type.
    *
    * @returns
    * An object with `ComposeType` and `CoercionType` enum values for the message item.
    */
  def getComposeTypeAsync(options: AsyncContextOptions, callback: js.Function1[/* asyncResult */ AsyncResult[Any], Unit]): Unit = js.native
  
  /**
    * Gets initialization data passed when the add-in is {@link https://learn.microsoft.com/outlook/actionable-messages/invoke-add-in | activated by an actionable message}.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                 of type `Office.AsyncResult`.
    *                 On success, the initialization context data is provided as a string (or an empty string if there's no initialization context)
    *                 in the `asyncResult.value` property.
    */
  def getInitializationContextAsync(callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]): Unit = js.native
  /**
    * Gets initialization data passed when the add-in is {@link https://learn.microsoft.com/outlook/actionable-messages/invoke-add-in | activated by an actionable message}.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                 of type `Office.AsyncResult`.
    *                 On success, the initialization context data is provided as a string (or an empty string if there's no initialization context)
    *                 in the `asyncResult.value` property.
    */
  def getInitializationContextAsync(options: AsyncContextOptions, callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]): Unit = js.native
  
  /**
    * Asynchronously gets the ID of a saved item.
    *
    * When invoked, this method returns the item ID via the callback function.
    *
    * **Note**: If your add-in calls `getItemIdAsync` on an item in compose mode (e.g., to get an `itemId` to use with EWS or the REST API),
    * be aware that when Outlook is in cached mode, it may take some time before the item is synced to the server.
    * Until the item is synced, the `itemId` is not recognized and using it returns an error.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * **Errors**:
    *
    * - `ItemNotSaved`: The ID can't be retrieved until the item is saved.
    *
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                   of type `Office.AsyncResult`.
    */
  def getItemIdAsync(callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]): Unit = js.native
  /**
    * Asynchronously gets the ID of a saved item.
    *
    * When invoked, this method returns the item ID via the callback function.
    *
    * **Note**: If your add-in calls `getItemIdAsync` on an item in compose mode (e.g., to get an `itemId` to use with EWS or the REST API),
    * be aware that when Outlook is in cached mode, it may take some time before the item is synced to the server.
    * Until the item is synced, the `itemId` is not recognized and using it returns an error.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * **Errors**:
    *
    * - `ItemNotSaved`: The ID can't be retrieved until the item is saved.
    *
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                   of type `Office.AsyncResult`.
    */
  def getItemIdAsync(options: AsyncContextOptions, callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]): Unit = js.native
  
  def getSelectedDataAsync(coercionType: String, callback: js.Function1[/* asyncResult */ AsyncResult[Any], Unit]): Unit = js.native
  def getSelectedDataAsync(
    coercionType: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Any], Unit]
  ): Unit = js.native
  /**
    * Asynchronously returns selected data from the subject or body of a message.
    *
    * If there is no selection but the cursor is in the body or subject, the method returns an empty string for the selected data.
    * If a field other than the body or subject is selected, the method returns the `InvalidSelection` error.
    *
    * To access the selected data from the callback function, call `asyncResult.value.data`.
    * To access the source property that the selection comes from, call `asyncResult.value.sourceProperty`, which will be either `body` or `subject`.
    *
    * @returns
    * The selected data as a string with format determined by `coercionType`.
    *
    * @remarks
    * [Api set: Mailbox 1.2]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * @param coercionType - Requests a format for the data. If `Text`, the method returns the plain text as a string, removing any HTML tags present.
    *                     If `Html`, the method returns the selected text, whether it is plaintext or HTML.
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`.
    */
  def getSelectedDataAsync(coercionType: CoercionType, callback: js.Function1[/* asyncResult */ AsyncResult[Any], Unit]): Unit = js.native
  /**
    * Asynchronously returns selected data from the subject or body of a message.
    *
    * If there is no selection but the cursor is in the body or subject, the method returns an empty string for the selected data.
    * If a field other than the body or subject is selected, the method returns the `InvalidSelection` error.
    *
    * To access the selected data from the callback function, call `asyncResult.value.data`.
    * To access the source property that the selection comes from, call `asyncResult.value.sourceProperty`, which will be either `body` or `subject`.
    *
    * @returns
    * The selected data as a string with format determined by `coercionType`.
    *
    * @remarks
    * [Api set: Mailbox 1.2]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * @param coercionType - Requests a format for the data. If `Text`, the method returns the plain text as a string, removing any HTML tags present.
    *                     If `Html`, the method returns the selected text, whether it is plaintext or HTML.
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`.
    */
  def getSelectedDataAsync(
    coercionType: CoercionType,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Any], Unit]
  ): Unit = js.native
  
  /**
    * Gets the properties of an appointment or message in a shared folder.
    *
    * For more information around using this API, see the
    * {@link https://learn.microsoft.com/office/dev/add-ins/outlook/delegate-access | delegate access} article.
    *
    * **Note**: This method is not supported in Outlook on iOS or Android.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **Important**: In Message Compose mode, this API is not supported in Outlook on the web or on Windows unless the following conditions are met.
    *
    * 1. The mailbox owner starts a message. This can be a new message, a reply, or a forward.
    *
    * 2. They save the message then move it from their own **Drafts** folder to a folder shared with the delegate.
    *
    * 3. The delegate opens the draft from the shared folder then continues composing.
    *
    * The message is now in a shared context and add-ins that support these shared scenarios can get the item's shared properties.
    * After the message has been sent, it's usually found in the sender's **Sent Items** folder.
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`. The `value` property of the result is the properties of the shared item.
    */
  def getSharedPropertiesAsync(callback: js.Function1[/* asyncResult */ AsyncResult[SharedProperties], Unit]): Unit = js.native
  /**
    * Gets the properties of an appointment or message in a shared folder.
    *
    * For more information around using this API, see the
    * {@link https://learn.microsoft.com/office/dev/add-ins/outlook/delegate-access | delegate access} article.
    *
    * **Note**: This method is not supported in Outlook on iOS or Android.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **Important**: In Message Compose mode, this API is not supported in Outlook on the web or on Windows unless the following conditions are met.
    *
    * 1. The mailbox owner starts a message. This can be a new message, a reply, or a forward.
    *
    * 2. They save the message then move it from their own **Drafts** folder to a folder shared with the delegate.
    *
    * 3. The delegate opens the draft from the shared folder then continues composing.
    *
    * The message is now in a shared context and add-ins that support these shared scenarios can get the item's shared properties.
    * After the message has been sent, it's usually found in the sender's **Sent Items** folder.
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`. The `value` property of the result is the properties of the shared item.
    */
  def getSharedPropertiesAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[SharedProperties], Unit]
  ): Unit = js.native
  
  /**
    * Gets or sets the custom internet headers of a message.
    *
    * The `internetHeaders` property returns an `InternetHeaders` object that provides methods to manage the internet headers on the message.
    *
    * To learn more, see
    * {@link https://learn.microsoft.com/office/dev/add-ins/outlook/internet-headers | Get and set internet headers on a message in an Outlook add-in}.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    */
  var internetHeaders: InternetHeaders = js.native
  
  /**
    * Gets if the client signature is enabled.
    *
    * For Windows and Mac rich clients, the API call should return `true` if the default signature for new messages, replies, or forwards is set
    * to a template for the sending Outlook account.
    * For Outlook on the web, the API call should return `true` if the signature is enabled for compose types `newMail`, `reply`, or `forward`.
    * If the settings are set to "(none)" in Mac or Windows rich clients or disabled in Outlook on the Web, the API call should return `false`.
    *
    * @remarks
    * [Api set: Mailbox 1.10]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                   type `Office.AsyncResult`.
    */
  def isClientSignatureEnabledAsync(callback: js.Function1[/* asyncResult */ AsyncResult[Boolean], Unit]): Unit = js.native
  /**
    * Gets if the client signature is enabled.
    *
    * For Windows and Mac rich clients, the API call should return `true` if the default signature for new messages, replies, or forwards is set
    * to a template for the sending Outlook account.
    * For Outlook on the web, the API call should return `true` if the signature is enabled for compose types `newMail`, `reply`, or `forward`.
    * If the settings are set to "(none)" in Mac or Windows rich clients or disabled in Outlook on the Web, the API call should return `false`.
    *
    * @remarks
    * [Api set: Mailbox 1.10]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                   type `Office.AsyncResult`.
    */
  def isClientSignatureEnabledAsync(options: AsyncContextOptions, callback: js.Function1[/* asyncResult */ AsyncResult[Boolean], Unit]): Unit = js.native
  
  /**
    * Gets the type of item that an instance represents.
    *
    * The `itemType` property returns one of the `ItemType` enumeration values, indicating whether the item object instance is a message or
    * an appointment.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    */
  var itemType: ItemType | String = js.native
  
  /**
    * Asynchronously loads custom properties for this add-in on the selected item.
    *
    * Custom properties are stored as key-value pairs on a per-app, per-item basis.
    * This method returns a {@link Office.CustomProperties | CustomProperties} object in the callback, which provides methods to access the custom properties specific to the
    * current item and the current add-in. Custom properties aren't encrypted on the item, so this shouldn't be used as secure storage.
    *
    * The custom properties are provided as a `CustomProperties` object in the `asyncResult.value` property.
    * This object can be used to get, set, save, and remove custom properties from the mail item.
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    *
    * To learn more about custom properties, see
    * {@link https://learn.microsoft.com/office/dev/add-ins/outlook/metadata-for-an-outlook-add-in | Get and set add-in metadata for an Outlook add-in}.
    * 
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`.
    * @param userContext - Optional. Developers can provide any object they wish to access in the callback function.
    *                    This object can be accessed by the `asyncResult.asyncContext` property in the callback function.
    */
  def loadCustomPropertiesAsync(callback: js.Function1[/* asyncResult */ AsyncResult[CustomProperties], Unit]): Unit = js.native
  def loadCustomPropertiesAsync(callback: js.Function1[/* asyncResult */ AsyncResult[CustomProperties], Unit], userContext: Any): Unit = js.native
  
  /**
    * Gets the notification messages for an item.
    *
    * @remarks
    * [Api set: Mailbox 1.3]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    */
  var notificationMessages: NotificationMessages = js.native
  
  /**
    * Removes an attachment from a message or appointment.
    *
    * The `removeAttachmentAsync` method removes the attachment with the specified identifier from the item.
    * As a best practice, you should use the attachment identifier to remove an attachment only if the same mail app has added that attachment
    * in the same session. In Outlook on the web and mobile devices, the attachment identifier is valid only within the same session.
    * A session is over when the user closes the app, or if the user starts composing an inline form then subsequently pops out the form to
    * continue in a separate window.
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * **Errors**:
    *
    * - `InvalidAttachmentId`: The attachment identifier does not exist.
    *
    * @param attachmentId - The identifier of the attachment to remove. The maximum string length of the `attachmentId`
    *                       is 200 characters in Outlook on the web and on Windows.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`. If removing the attachment fails, the `asyncResult.error` property will contain an error code
    *                 with the reason for the failure.
    */
  def removeAttachmentAsync(attachmentId: String): Unit = js.native
  def removeAttachmentAsync(attachmentId: String, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  /**
    * Removes an attachment from a message or appointment.
    *
    * The `removeAttachmentAsync` method removes the attachment with the specified identifier from the item.
    * As a best practice, you should use the attachment identifier to remove an attachment only if the same mail app has added that attachment
    * in the same session. In Outlook on the web and mobile devices, the attachment identifier is valid only within the same session.
    * A session is over when the user closes the app, or if the user starts composing an inline form then subsequently pops out the form to
    * continue in a separate window.
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * **Errors**:
    *
    * - `InvalidAttachmentId`: The attachment identifier does not exist.
    *
    * @param attachmentId - The identifier of the attachment to remove. The maximum string length of the `attachmentId`
    *                       is 200 characters in Outlook on the web and on Windows.
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`. If removing the attachment fails, the `asyncResult.error` property will contain an error code
    *                 with the reason for the failure.
    */
  def removeAttachmentAsync(attachmentId: String, options: AsyncContextOptions): Unit = js.native
  def removeAttachmentAsync(
    attachmentId: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  
  def removeHandlerAsync(eventType: String): Unit = js.native
  def removeHandlerAsync(eventType: String, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  def removeHandlerAsync(eventType: String, options: AsyncContextOptions): Unit = js.native
  def removeHandlerAsync(
    eventType: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  /**
    * Removes the event handlers for a supported event type. **Note**: Events are only available with task pane implementation.
    *
    * For supported events, refer to the Item object model
    * {@link https://learn.microsoft.com/javascript/api/requirement-sets/outlook/requirement-set-1.12/office.context.mailbox.item#events | events section}.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * @param eventType - The event that should revoke the handler.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    */
  def removeHandlerAsync(eventType: EventType): Unit = js.native
  def removeHandlerAsync(eventType: EventType, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  /**
    * Removes the event handlers for a supported event type. **Note**: Events are only available with task pane implementation.
    *
    * For supported events, refer to the Item object model
    * {@link https://learn.microsoft.com/javascript/api/requirement-sets/outlook/requirement-set-1.12/office.context.mailbox.item#events | events section}.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * @param eventType - The event that should revoke the handler.
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    */
  def removeHandlerAsync(eventType: EventType, options: AsyncContextOptions): Unit = js.native
  def removeHandlerAsync(
    eventType: EventType,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  
  /**
    * Asynchronously saves an item.
    *
    * When invoked, this method saves the current message as a draft and returns the item ID via the callback function.
    * In Outlook on the web or Outlook in online mode, the item is saved to the server.
    * In Outlook in cached mode, the item is saved to the local cache.
    *
    * Since appointments have no draft state, if `saveAsync` is called on an appointment in compose mode, the item will be saved as a normal
    * appointment on the user's calendar. For new appointments that have not been saved before, no invitation will be sent.
    * Saving an existing appointment will send an update to added or removed attendees.
    *
    * When working with HTML-formatted content, it's important to note that the Outlook client may modify the content. This means that
    * subsequent calls to methods like `Body.getAsync`, `Body.setAsync`, and even `saveAsync` may not result in the same content.
    *
    * **Note**: If your add-in calls `saveAsync` on an item in compose mode in order to get an item ID to use with EWS or the REST API, be aware
    * that when Outlook is in cached mode, it may take some time before the item is actually synced to the server.
    * Until the item is synced, using the `itemId` will return an error.
    *
    * @remarks
    * [Api set: Mailbox 1.3]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * **Errors**:
    *
    * - `InvalidAttachmentId`: The attachment identifier does not exist.
    *
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`.
    */
  def saveAsync(callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]): Unit = js.native
  /**
    * Asynchronously saves an item.
    *
    * When invoked, this method saves the current message as a draft and returns the item ID via the callback function.
    * In Outlook on the web or Outlook in online mode, the item is saved to the server.
    * In Outlook in cached mode, the item is saved to the local cache.
    *
    * Since appointments have no draft state, if `saveAsync` is called on an appointment in compose mode, the item will be saved as a normal
    * appointment on the user's calendar. For new appointments that have not been saved before, no invitation will be sent.
    * Saving an existing appointment will send an update to added or removed attendees.
    *
    * When working with HTML-formatted content, it's important to note that the Outlook client may modify the content. This means that
    * subsequent calls to methods like `Body.getAsync`, `Body.setAsync`, and even `saveAsync` may not result in the same content.
    *
    * **Note**: If your add-in calls `saveAsync` on an item in compose mode in order to get an item ID to use with EWS or the REST API, be aware
    * that when Outlook is in cached mode, it may take some time before the item is actually synced to the server.
    * Until the item is synced, using the itemId will return an error.
    *
    * @remarks
    * [Api set: Mailbox 1.3]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * **Errors**:
    *
    * - `InvalidAttachmentId`: The attachment identifier does not exist.
    *
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`.
    */
  def saveAsync(options: AsyncContextOptions, callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]): Unit = js.native
  
  /**
    * Gets the ID of the series that an instance belongs to.
    *
    * In Outlook on the web and desktop clients, the `seriesId` returns the Exchange Web Services (EWS) ID of the parent (series) item
    * that this item belongs to. However, on iOS and Android, the seriesId returns the REST ID of the parent item.
    *
    * **Note**: The identifier returned by the `seriesId` property is the same as the Exchange Web Services item identifier.
    * The `seriesId` property is not identical to the Outlook IDs used by the Outlook REST API.
    * Before making REST API calls using this value, it should be converted using `Office.context.mailbox.convertToRestId`.
    * For more details, see {@link https://learn.microsoft.com/office/dev/add-ins/outlook/use-rest-api | Use the Outlook REST APIs from an Outlook add-in}.
    *
    * The `seriesId` property returns `null` for items that do not have parent items such as single appointments, series items, or meeting requests
    * and returns `undefined` for any other items that are not meeting requests.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    */
  var seriesId: String = js.native
  
  /**
    * Manages the {@link Office.SessionData | SessionData} of an item in Compose mode.
    *
    * **Important**: The entire SessionData object is limited to 50,000 characters per add-in.
    *
    * @remarks
    * [Api set: Mailbox 1.11]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    */
  var sessionData: SessionData = js.native
  
  /**
    * Asynchronously inserts data into the body or subject of a message.
    *
    * The `setSelectedDataAsync` method inserts the specified string at the cursor location in the subject or body of the item, or, if text is
    * selected in the editor, it replaces the selected text. If the cursor is not in the body or subject field, an error is returned.
    * After insertion, the cursor is placed at the end of the inserted content.
    *
    * @remarks
    * [Api set: Mailbox 1.2]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * **Errors**:
    *
    * - `InvalidAttachmentId`: The attachment identifier does not exist.
    *
    * @param data - The data to be inserted. Data is not to exceed 1,000,000 characters.
    *             If more than 1,000,000 characters are passed in, an `ArgumentOutOfRange` exception is thrown.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`.
    */
  def setSelectedDataAsync(data: String): Unit = js.native
  def setSelectedDataAsync(data: String, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  /**
    * Asynchronously inserts data into the body or subject of a message.
    *
    * The `setSelectedDataAsync` method inserts the specified string at the cursor location in the subject or body of the item, or, if text is
    * selected in the editor, it replaces the selected text. If the cursor is not in the body or subject field, an error is returned.
    * After insertion, the cursor is placed at the end of the inserted content.
    *
    * @remarks
    * [Api set: Mailbox 1.2]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * **Errors**:
    *
    * - `InvalidAttachmentId`: The attachment identifier does not exist.
    *
    * @param data - The data to be inserted. Data is not to exceed 1,000,000 characters.
    *             If more than 1,000,000 characters are passed in, an `ArgumentOutOfRange` exception is thrown.
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    *        `coercionType`: If text, the current style is applied in Outlook on the web and desktop clients.
    *        If the field is an HTML editor, only the text data is inserted, even if the data is HTML.
    *        If html and the field supports HTML (the subject doesn't), the current style is applied in Outlook on the web and the default style is
    *        applied in Outlook on desktop clients. If the field is a text field, an `InvalidDataFormat` error is returned.
    *        If `coercionType` is not set, the result depends on the field:
    *        if the field is HTML then HTML is used; if the field is text, then plain text is used.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`.
    */
  def setSelectedDataAsync(data: String, options: AsyncContextOptions & CoercionTypeOptions): Unit = js.native
  def setSelectedDataAsync(
    data: String,
    options: AsyncContextOptions & CoercionTypeOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  
  /**
    * Gets or sets the description that appears in the subject field of an item.
    *
    * The `subject` property gets or sets the entire subject of the item, as sent by the email server.
    *
    * The `subject` property returns a `Subject` object that provides methods to get and set the subject.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    */
  var subject: Subject = js.native
  
  /**
    * Provides access to the recipients on the **To** line of a message. The type of object and level of access depend on the mode of the
    * current item.
    *
    * The `to` property returns a `Recipients` object that provides methods to get or update the recipients on the
    * **To** line of the message. However, depending on the client/platform (i.e., Windows, Mac, etc.), limits may apply on how many recipients
    * you can get or update. See the {@link Office.Recipients | Recipients} object for more details.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Compose
    */
  var to: Recipients = js.native
}
