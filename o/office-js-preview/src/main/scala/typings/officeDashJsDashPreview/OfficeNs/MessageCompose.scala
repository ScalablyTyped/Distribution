package typings.officeDashJsDashPreview.OfficeNs

import typings.officeDashJsDashPreview.Anon_IsInline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The message compose mode of {@link Office.Item | Office.context.mailbox.item}.
  * 
  * **Important**: This is an internal Outlook object, not directly exposed through existing interfaces. 
  * You should treat this as a mode of Office.context.mailbox.item. Refer to the
  * {@link https://docs.microsoft.com/office/dev/add-ins/reference/objectmodel/preview-requirement-set/office.context.mailbox.item | Object Model} page for more information.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.officeDashJsDashPreview.OfficeNs.ItemCompose because var conflicts: body, categories, itemType, notificationMessages, seriesId. Inlined subject, addFileAttachmentAsync, addFileAttachmentAsync, addFileAttachmentAsync, addFileAttachmentAsync, addFileAttachmentFromBase64Async, addFileAttachmentFromBase64Async, addFileAttachmentFromBase64Async, addFileAttachmentFromBase64Async, addItemAttachmentAsync, addItemAttachmentAsync, addItemAttachmentAsync, addItemAttachmentAsync, close, getAttachmentsAsync, getAttachmentsAsync, getAttachmentsAsync, getAttachmentsAsync, getSelectedDataAsync, getSelectedDataAsync, getSelectedDataAsync, getSelectedDataAsync, removeAttachmentAsync, removeAttachmentAsync, removeAttachmentAsync, removeAttachmentAsync, saveAsync, saveAsync, setSelectedDataAsync, setSelectedDataAsync, setSelectedDataAsync, setSelectedDataAsync */ @js.native
trait MessageCompose extends Message {
  /**
    * Gets an object that provides methods to get or update the recipients on the Bcc (blind carbon copy) line of a message.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Message Compose
    */
  var bcc: Recipients = js.native
  /**
    * Provides access to the Cc (carbon copy) recipients of a message. The type of object and level of access depends on the mode of the 
    * current item.
    *
    * The cc property returns an {@link Office.Recipients} object that provides methods to get or update the recipients on the Cc line of 
    * the message.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Message Compose
    */
  var cc: Recipients = js.native
  /**
    * Gets the email address of the sender of a message.
    *
    * The from and sender properties represent the same person unless the message is sent by a delegate. 
    * In that case, the from property represents the owner, and the sender property represents the delegate.
    *
    * The from property returns a From object that provides a method to get the from value.
    * 
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Message Compose
    */
  var from: From = js.native
  /**
    * Gets or sets the custom internet headers of a message.
    * 
    * The internetHeaders property returns an InternetHeaders object that provides methods to manage the internet headers on the message.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Message Compose
    * 
    * @beta
    */
  var internetHeaders: InternetHeaders = js.native
  /**
    * Gets or sets the description that appears in the subject field of an item.
    *
    * The subject property gets or sets the entire subject of the item, as sent by the email server.
    *
    * The subject property returns a Subject object that provides methods to get and set the subject.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Message Compose
    */
  var subject: Subject = js.native
  /**
    * Provides access to the recipients on the To line of a message. The type of object and level of access depends on the mode of the 
    * current item.
    *
    * The to property returns a Recipients object that provides methods to get or update the recipients on the To line of the message.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Message Compose
    */
  var to: Recipients = js.native
  /**
    * Adds a file to a message or appointment as an attachment.
    *
    * The addFileAttachmentAsync method uploads the file at the specified URI and attaches it to the item in the compose form.
    *
    * You can subsequently use the identifier with the removeAttachmentAsync method to remove the attachment in the same session.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Message Compose
    * 
    * **Errors**:
    * 
    * - AttachmentSizeExceeded: The attachment is larger than allowed.
    * 
    * - FileTypeNotSupported: The attachment has an extension that is not allowed.
    * 
    * - NumberOfAttachmentsExceeded: The message or appointment has too many attachments.
    * 
    * @param uri - The URI that provides the location of the file to attach to the message or appointment. The maximum length is 2048 characters.
    * @param attachmentName - The name of the attachment that is shown while the attachment is uploading. The maximum length is 255 characters.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    *        isInline: If true, indicates that the attachment will be shown inline in the message body, and should not be displayed in the 
    *        attachment list.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. On success, the attachment identifier will be provided in the asyncResult.value property. 
    *                 If uploading the attachment fails, the asyncResult object will contain an Error object that provides a description of 
    *                 the error.
    */
  /**
    * Adds a file to a message or appointment as an attachment.
    *
    * The addFileAttachmentAsync method uploads the file at the specified URI and attaches it to the item in the compose form.
    *
    * You can subsequently use the identifier with the removeAttachmentAsync method to remove the attachment in the same session.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    * 
    * **Errors**:
    * 
    * - AttachmentSizeExceeded: The attachment is larger than allowed.
    * 
    * - FileTypeNotSupported: The attachment has an extension that is not allowed.
    * 
    * - NumberOfAttachmentsExceeded: The message or appointment has too many attachments.
    * 
    * @param uri - The URI that provides the location of the file to attach to the message or appointment. The maximum length is 2048 characters.
    * @param attachmentName - The name of the attachment that is shown while the attachment is uploading. The maximum length is 255 characters.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    *        isInline: If true, indicates that the attachment will be shown inline in the message body, and should not be displayed in the 
    *        attachment list.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. On success, the attachment identifier will be provided in the asyncResult.value property. 
    *                 If uploading the attachment fails, the asyncResult object will contain an Error object that provides a description of 
    *                 the error.
    */
  def addFileAttachmentAsync(uri: String, attachmentName: String): Unit = js.native
  def addFileAttachmentAsync(
    uri: String,
    attachmentName: String,
    callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]
  ): Unit = js.native
  def addFileAttachmentAsync(uri: String, attachmentName: String, options: AsyncContextOptions with Anon_IsInline): Unit = js.native
  def addFileAttachmentAsync(
    uri: String,
    attachmentName: String,
    options: AsyncContextOptions with Anon_IsInline,
    callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]
  ): Unit = js.native
  /**
    * Adds a file to a message or appointment as an attachment.
    *
    * The addFileAttachmentFromBase64Async method uploads the file from the base64 encoding and attaches it to the item in the compose form. This method returns the attachment identifier in the asyncResult.value object.
    *
    * You can subsequently use the identifier with the removeAttachmentAsync method to remove the attachment in the same session.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Message Compose
    * 
    * **Errors**:
    * 
    * - AttachmentSizeExceeded: The attachment is larger than allowed.
    * 
    * - FileTypeNotSupported: The attachment has an extension that is not allowed.
    * 
    * - NumberOfAttachmentsExceeded: The message or appointment has too many attachments.
    * 
    * @param base64File - The base64 encoded content of an image or file to be added to an email or event.
    * @param attachmentName - The name of the attachment that is shown while the attachment is uploading. The maximum length is 255 characters.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    *        isInline: If true, indicates that the attachment will be shown inline in the message body and should not be displayed in the attachment list.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of type Office.AsyncResult. 
    *                  On success, the attachment identifier will be provided in the asyncResult.value property. 
    *                  If uploading the attachment fails, the asyncResult object will contain an Error object that provides a description of the error.
    * 
    * @beta
    */
  /**
    * Adds a file to a message or appointment as an attachment.
    *
    * The addFileAttachmentFromBase64Async method uploads the file from the base64 encoding and attaches it to the item in the compose form. This method returns the attachment identifier in the asyncResult.value object.
    *
    * You can subsequently use the identifier with the removeAttachmentAsync method to remove the attachment in the same session.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    * 
    * **Errors**:
    * 
    * - AttachmentSizeExceeded: The attachment is larger than allowed.
    * 
    * - FileTypeNotSupported: The attachment has an extension that is not allowed.
    * 
    * - NumberOfAttachmentsExceeded: The message or appointment has too many attachments.
    * 
    * @param base64File - The base64 encoded content of an image or file to be added to an email or event.
    * @param attachmentName - The name of the attachment that is shown while the attachment is uploading. The maximum length is 255 characters.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    *        isInline: If true, indicates that the attachment will be shown inline in the message body and should not be displayed in the attachment list.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of type Office.AsyncResult. 
    *                  On success, the attachment identifier will be provided in the asyncResult.value property. 
    *                  If uploading the attachment fails, the asyncResult object will contain an Error object that provides a description of the error.
    * 
    * @beta
    */
  def addFileAttachmentFromBase64Async(base64File: String, attachmentName: String): Unit = js.native
  def addFileAttachmentFromBase64Async(
    base64File: String,
    attachmentName: String,
    callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]
  ): Unit = js.native
  def addFileAttachmentFromBase64Async(base64File: String, attachmentName: String, options: AsyncContextOptions with Anon_IsInline): Unit = js.native
  def addFileAttachmentFromBase64Async(
    base64File: String,
    attachmentName: String,
    options: AsyncContextOptions with Anon_IsInline,
    callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]
  ): Unit = js.native
  /**
    * Adds an Exchange item, such as a message, as an attachment to the message or appointment.
    *
    * The addItemAttachmentAsync method attaches the item with the specified Exchange identifier to the item in the compose form. 
    * If you specify a callback method, the method is called with one parameter, asyncResult, which contains either the attachment identifier or 
    * a code that indicates any error that occurred while attaching the item. You can use the options parameter to pass state information to the 
    * callback method, if needed.
    *
    * You can subsequently use the identifier with the removeAttachmentAsync method to remove the attachment in the same session.
    *
    * If your Office add-in is running in Outlook on the web, the addItemAttachmentAsync method can attach items to items other than the item that 
    * you are editing; however, this is not supported and is not recommended.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Message Compose
    * 
    * **Errors**:
    * 
    * - NumberOfAttachmentsExceeded: The message or appointment has too many attachments.
    * 
    * @param itemId - The Exchange identifier of the item to attach. The maximum length is 100 characters.
    * @param attachmentName - The name of the attachment that is shown while the attachment is uploading. The maximum length is 255 characters.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. On success, the attachment identifier will be provided in the asyncResult.value property. 
    *                 If adding the attachment fails, the asyncResult object will contain an Error object that provides a description of 
    *                 the error.
    */
  /**
    * Adds an Exchange item, such as a message, as an attachment to the message or appointment.
    *
    * The addItemAttachmentAsync method attaches the item with the specified Exchange identifier to the item in the compose form. 
    * If you specify a callback method, the method is called with one parameter, asyncResult, which contains either the attachment identifier or 
    * a code that indicates any error that occurred while attaching the item. You can use the options parameter to pass state information to the 
    * callback method, if needed.
    *
    * You can subsequently use the identifier with the removeAttachmentAsync method to remove the attachment in the same session.
    *
    * If your Office add-in is running in Outlook on the web, the addItemAttachmentAsync method can attach items to items other than the item that 
    * you are editing; however, this is not supported and is not recommended.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    * 
    * **Errors**:
    * 
    * - NumberOfAttachmentsExceeded: The message or appointment has too many attachments.
    * 
    * @param itemId - The Exchange identifier of the item to attach. The maximum length is 100 characters.
    * @param attachmentName - The name of the attachment that is shown while the attachment is uploading. The maximum length is 255 characters.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. On success, the attachment identifier will be provided in the asyncResult.value property. 
    *                 If adding the attachment fails, the asyncResult object will contain an Error object that provides a description of 
    *                 the error.
    */
  def addItemAttachmentAsync(itemId: js.Any, attachmentName: String): Unit = js.native
  def addItemAttachmentAsync(
    itemId: js.Any,
    attachmentName: String,
    callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]
  ): Unit = js.native
  def addItemAttachmentAsync(itemId: js.Any, attachmentName: String, options: AsyncContextOptions): Unit = js.native
  def addItemAttachmentAsync(
    itemId: js.Any,
    attachmentName: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]
  ): Unit = js.native
  /**
    * Closes the current item that is being composed
    *
    * The behaviors of the close method depends on the current state of the item being composed. 
    * If the item has unsaved changes, the client prompts the user to save, discard, or close the action.
    *
    * In the Outlook desktop client, if the message is an inline reply, the close method has no effect.
    *
    * **Note**: In Outlook on the web, if the item is an appointment and it has previously been saved using saveAsync, the user is prompted to save, 
    * discard, or cancel even if no changes have occurred since the item was last saved.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: Restricted
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Message Compose
    */
  /**
    * Closes the current item that is being composed
    *
    * The behaviors of the close method depends on the current state of the item being composed. 
    * If the item has unsaved changes, the client prompts the user to save, discard, or close the action.
    *
    * In the Outlook desktop client, if the message is an inline reply, the close method has no effect.
    *
    * **Note**: In Outlook on the web, if the item is an appointment and it has previously been saved using saveAsync, the user is prompted to save, 
    * discard, or cancel even if no changes have occurred since the item was last saved.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: Restricted
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    */
  def close(): Unit = js.native
  /**
    * Gets the item's attachments as an array.
    * 
    * [Api set: Mailbox Preview]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Message Compose
    * 
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. If the call fails, the asyncResult.error property will contain and error code with the reason for 
    *                 the failure.
    * 
    * @beta
    */
  /**
    * Gets the item's attachments as an array.
    * 
    * [Api set: Mailbox Preview]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    * 
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. If the call fails, the asyncResult.error property will contain and error code with the reason for 
    *                 the failure.
    * 
    * @beta
    */
  def getAttachmentsAsync(): Unit = js.native
  def getAttachmentsAsync(callback: js.Function1[/* asyncResult */ AsyncResult[js.Array[AttachmentDetails]], Unit]): Unit = js.native
  def getAttachmentsAsync(options: AsyncContextOptions): Unit = js.native
  def getAttachmentsAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[js.Array[AttachmentDetails]], Unit]
  ): Unit = js.native
  /**
    * Asynchronously gets the ID of a saved item.
    *
    * When invoked, this method returns the item ID via the callback method.
    * 
    * **Note**: If your add-in calls `getItemIdAsync` on an item in compose mode (e.g., to get an `itemId` to use with EWS or the REST API),
    * be aware that when Outlook is in cached mode, it may take some time before the item is synced to the server.
    * Until the item is synced, the `itemId` is not recognized and using it returns an error.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Message Compose
    * 
    * **Errors**:
    * 
    * - `ItemNotSaved`: The id can't be retrieved until the item is saved.
    * 
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of type Office.AsyncResult. 
    * 
    * @beta
    */
  def getItemIdAsync(callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]): Unit = js.native
  /**
    * Asynchronously gets the ID of a saved item.
    *
    * When invoked, this method returns the item ID via the callback method.
    * 
    * **Note**: If your add-in calls `getItemIdAsync` on an item in compose mode (e.g., to get an `itemId` to use with EWS or the REST API),
    * be aware that when Outlook is in cached mode, it may take some time before the item is synced to the server.
    * Until the item is synced, the `itemId` is not recognized and using it returns an error.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Message Compose
    * 
    * **Errors**:
    * 
    * - `ItemNotSaved`: The id can't be retrieved until the item is saved.
    * 
    * @param options - An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of type Office.AsyncResult. 
    * 
    * @beta
    */
  def getItemIdAsync(options: AsyncContextOptions, callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]): Unit = js.native
  def getSelectedDataAsync(coercionType: String, callback: js.Function1[/* asyncResult */ AsyncResult[_], Unit]): Unit = js.native
  def getSelectedDataAsync(
    coercionType: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[_], Unit]
  ): Unit = js.native
  /**
    * Asynchronously returns selected data from the subject or body of a message.
    *
    * If there is no selection but the cursor is in the body or subject, the method returns null for the selected data. 
    * If a field other than the body or subject is selected, the method returns the InvalidSelection error.
    *
    * To access the selected data from the callback method, call asyncResult.value.data. 
    * To access the source property that the selection comes from, call asyncResult.value.sourceProperty, which will be either body or subject.
    *
    * [Api set: Mailbox 1.2]
    *
    * @returns
    * The selected data as a string with format determined by coercionType.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * @param coercionType - Requests a format for the data. If Text, the method returns the plain text as a string, removing any HTML tags present. 
    *                     If HTML, the method returns the selected text, whether it is plaintext or HTML.
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
    */
  /**
    * Asynchronously returns selected data from the subject or body of a message.
    *
    * If there is no selection but the cursor is in the body or subject, the method returns null for the selected data. 
    * If a field other than the body or subject is selected, the method returns the InvalidSelection error.
    *
    * To access the selected data from the callback method, call asyncResult.value.data.
    * To access the source property that the selection comes from, call asyncResult.value.sourceProperty, which will be either body or subject.
    *
    * [Api set: Mailbox 1.2]
    *
    * @returns
    * The selected data as a string with format determined by coercionType.
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param coercionType - Requests a format for the data. If Text, the method returns the plain text as a string , removing any HTML tags present. 
    *                     If HTML, the method returns the selected text, whether it is plaintext or HTML.
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
    */
  def getSelectedDataAsync(coercionType: CoercionType, callback: js.Function1[/* asyncResult */ AsyncResult[_], Unit]): Unit = js.native
  /**
    * Asynchronously returns selected data from the subject or body of a message.
    *
    * If there is no selection but the cursor is in the body or subject, the method returns null for the selected data. 
    * If a field other than the body or subject is selected, the method returns the InvalidSelection error.
    *
    * To access the selected data from the callback method, call asyncResult.value.data. 
    * To access the source property that the selection comes from, call asyncResult.value.sourceProperty, which will be either body or subject.
    *
    * [Api set: Mailbox 1.2]
    *
    * @returns
    * The selected data as a string with format determined by coercionType.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Message Compose
    *
    * @param coercionType - Requests a format for the data. If Text, the method returns the plain text as a string, removing any HTML tags present. 
    *                     If HTML, the method returns the selected text, whether it is plaintext or HTML.
    * @param options - An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
    */
  /**
    * Asynchronously returns selected data from the subject or body of a message.
    *
    * If there is no selection but the cursor is in the body or subject, the method returns null for the selected data. 
    * If a field other than the body or subject is selected, the method returns the InvalidSelection error.
    *
    * To access the selected data from the callback method, call asyncResult.value.data.
    * To access the source property that the selection comes from, call asyncResult.value.sourceProperty, which will be either body or subject.
    *
    * [Api set: Mailbox 1.2]
    *
    * @returns
    * The selected data as a string with format determined by coercionType.
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param coercionType - Requests a format for the data. If Text, the method returns the plain text as a string, removing any HTML tags present. 
    *                     If HTML, the method returns the selected text, whether it is plaintext or HTML.
    * @param options - An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
    */
  def getSelectedDataAsync(
    coercionType: CoercionType,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[_], Unit]
  ): Unit = js.native
  /**
    * Removes an attachment from a message or appointment.
    *
    * The removeAttachmentAsync method removes the attachment with the specified identifier from the item. 
    * As a best practice, you should use the attachment identifier to remove an attachment only if the same mail app has added that attachment 
    * in the same session. In Outlook on the web and mobile devices, the attachment identifier is valid only within the same session. 
    * A session is over when the user closes the app, or if the user starts composing an inline form then subsequently pops out the form to 
    * continue in a separate window.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Message Compose
    * 
    * **Errors**:
    * 
    * - InvalidAttachmentId: The attachment identifier does not exist.
    * 
    * @param attachmentId - The identifier of the attachment to remove.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. 
    *                 If removing the attachment fails, the asyncResult.error property will contain an error code with the reason for the failure.
    */
  /**
    * Removes an attachment from a message or appointment.
    *
    * The removeAttachmentAsync method removes the attachment with the specified identifier from the item. 
    * As a best practice, you should use the attachment identifier to remove an attachment only if the same mail app has added that attachment 
    * in the same session. In Outlook on the web and mobile devices, the attachment identifier is valid only within the same session. 
    * A session is over when the user closes the app, or if the user starts composing an inline form then subsequently pops out the form to 
    * continue in a separate window.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    * 
    * **Errors**:
    * 
    * - InvalidAttachmentId: The attachment identifier does not exist.
    * 
    * @param attachmentId - The identifier of the attachment to remove.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. 
    *                 If removing the attachment fails, the asyncResult.error property will contain an error code with the reason for the failure.
    */
  def removeAttachmentAsync(attachmentId: String): Unit = js.native
  def removeAttachmentAsync(attachmentId: String, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  def removeAttachmentAsync(attachmentId: String, options: AsyncContextOptions): Unit = js.native
  def removeAttachmentAsync(
    attachmentId: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  /**
    * Asynchronously saves an item.
    *
    * When invoked, this method saves the current message as a draft and returns the item id via the callback method. 
    * In Outlook on the web or Outlook in online mode, the item is saved to the server. 
    * In Outlook in cached mode, the item is saved to the local cache.
    *
    * Since appointments have no draft state, if saveAsync is called on an appointment in compose mode, the item will be saved as a normal 
    * appointment on the user's calendar. For new appointments that have not been saved before, no invitation will be sent. 
    * Saving an existing appointment will send an update to added or removed attendees.
    *
    * **Note**: If your add-in calls saveAsync on an item in compose mode in order to get an itemId to use with EWS or the REST API, be aware that 
    * when Outlook is in cached mode, it may take some time before the item is actually synced to the server. 
    * Until the item is synced, using the itemId will return an error.
    *
    * **Note**: The following clients have different behavior for saveAsync on appointments in compose mode:
    *
    * - Outlook on Mac does not support saving a meeting. The saveAsync method fails when called from a meeting in compose mode.
    * See {@link https://support.microsoft.com/help/4505745 | Cannot save a meeting as a draft in Outlook for Mac by using Office JS API} for a workaround.
    *
    * - Outlook on the web always sends an invitation or update when saveAsync is called on an appointment in compose mode.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Message Compose
    * 
    * **Errors**:
    * 
    * - InvalidAttachmentId: The attachment identifier does not exist.
    *
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. 
    */
  /**
    * Asynchronously saves an item.
    *
    * When invoked, this method saves the current message as a draft and returns the item id via the callback method. 
    * In Outlook on the web or Outlook in online mode, the item is saved to the server. 
    * In Outlook in cached mode, the item is saved to the local cache.
    *
    * Since appointments have no draft state, if saveAsync is called on an appointment in compose mode, the item will be saved as a normal 
    * appointment on the user's calendar. For new appointments that have not been saved before, no invitation will be sent. 
    * Saving an existing appointment will send an update to added or removed attendees.
    *
    * **Note**: If your add-in calls saveAsync on an item in compose mode in order to get an itemId to use with EWS or the REST API, be aware that 
    * when Outlook is in cached mode, it may take some time before the item is actually synced to the server. 
    * Until the item is synced, using the itemId will return an error.
    *
    * **Note**: The following clients have different behavior for saveAsync on appointments in compose mode:
    *
    * - Outlook on Mac does not support saving a meeting. The saveAsync method fails when called from a meeting in compose mode.
    * See {@link https://support.microsoft.com/help/4505745 | Cannot save a meeting as a draft in Outlook for Mac by using Office JS API} for a workaround.
    *
    * - Outlook on the web always sends an invitation or update when saveAsync is called on an appointment in compose mode.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    * 
    * **Errors**:
    * 
    * - InvalidAttachmentId: The attachment identifier does not exist.
    *
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. 
    *                 If removing the attachment fails, the asyncResult.error property will contain an error code with the reason for the failure.
    */
  def saveAsync(callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]): Unit = js.native
  /**
    * Asynchronously saves an item.
    *
    * When invoked, this method saves the current message as a draft and returns the item id via the callback method. 
    * In Outlook on the web or Outlook in online mode, the item is saved to the server. 
    * In Outlook in cached mode, the item is saved to the local cache.
    *
    * Since appointments have no draft state, if saveAsync is called on an appointment in compose mode, the item will be saved as a normal 
    * appointment on the user's calendar. For new appointments that have not been saved before, no invitation will be sent. 
    * Saving an existing appointment will send an update to added or removed attendees.
    *
    * **Note**: If your add-in calls saveAsync on an item in compose mode in order to get an itemId to use with EWS or the REST API, be aware that 
    * when Outlook is in cached mode, it may take some time before the item is actually synced to the server. 
    * Until the item is synced, using the itemId will return an error.
    *
    * **Note**: The following clients have different behavior for saveAsync on appointments in compose mode:
    *
    * - Outlook on Mac does not support saving a meeting. The saveAsync method fails when called from a meeting in compose mode.
    * See {@link https://support.microsoft.com/help/4505745 | Cannot save a meeting as a draft in Outlook for Mac by using Office JS API} for a workaround.
    *
    * - Outlook on the web always sends an invitation or update when saveAsync is called on an appointment in compose mode.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Message Compose
    * 
    * **Errors**:
    * 
    * - InvalidAttachmentId: The attachment identifier does not exist.
    * 
    * @param options - An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. 
    */
  /**
    * Asynchronously saves an item.
    *
    * When invoked, this method saves the current message as a draft and returns the item id via the callback method. 
    * In Outlook on the web or Outlook in online mode, the item is saved to the server. 
    * In Outlook in cached mode, the item is saved to the local cache.
    *
    * Since appointments have no draft state, if saveAsync is called on an appointment in compose mode, the item will be saved as a normal 
    * appointment on the user's calendar. For new appointments that have not been saved before, no invitation will be sent. 
    * Saving an existing appointment will send an update to added or removed attendees.
    *
    * **Note**: If your add-in calls saveAsync on an item in compose mode in order to get an itemId to use with EWS or the REST API, be aware that 
    * when Outlook is in cached mode, it may take some time before the item is actually synced to the server. 
    * Until the item is synced, using the itemId will return an error.
    *
    * **Note**: The following clients have different behavior for saveAsync on appointments in compose mode:
    *
    * - Outlook on Mac does not support saving a meeting. The saveAsync method fails when called from a meeting in compose mode.
    * See {@link https://support.microsoft.com/help/4505745 | Cannot save a meeting as a draft in Outlook for Mac by using Office JS API} for a workaround.
    *
    * - Outlook on the web always sends an invitation or update when saveAsync is called on an appointment in compose mode.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    * 
    * **Errors**:
    * 
    * - InvalidAttachmentId: The attachment identifier does not exist.
    * 
    * @param options - An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. 
    *                 If removing the attachment fails, the asyncResult.error property will contain an error code with the reason for the failure.
    */
  def saveAsync(options: AsyncContextOptions, callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]): Unit = js.native
  /**
    * Asynchronously inserts data into the body or subject of a message.
    *
    * The setSelectedDataAsync method inserts the specified string at the cursor location in the subject or body of the item, or, if text is 
    * selected in the editor, it replaces the selected text. If the cursor is not in the body or subject field, an error is returned. 
    * After insertion, the cursor is placed at the end of the inserted content.
    *
    * [Api set: Mailbox 1.2]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Message Compose
    * 
    * **Errors**:
    * 
    * - InvalidAttachmentId: The attachment identifier does not exist.
    * 
    * @param data - The data to be inserted. Data is not to exceed 1,000,000 characters. 
    *             If more than 1,000,000 characters are passed in, an ArgumentOutOfRange exception is thrown.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    *        coercionType: If text, the current style is applied in Outlook on the web and desktop clients. 
    *        If the field is an HTML editor, only the text data is inserted, even if the data is HTML. 
    *        If html and the field supports HTML (the subject doesn't), the current style is applied in Outlook on the web and the default style is 
    *        applied in Outlook on desktop clients. If the field is a text field, an InvalidDataFormat error is returned. 
    *        If coercionType is not set, the result depends on the field: if the field is HTML then HTML is used; 
    *        if the field is text, then plain text is used.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
    */
  /**
    * Asynchronously inserts data into the body or subject of a message.
    *
    * The setSelectedDataAsync method inserts the specified string at the cursor location in the subject or body of the item, or, if text is 
    * selected in the editor, it replaces the selected text. If the cursor is not in the body or subject field, an error is returned. 
    * After insertion, the cursor is placed at the end of the inserted content.
    *
    * [Api set: Mailbox 1.2]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    * 
    * **Errors**:
    * 
    * - InvalidAttachmentId: The attachment identifier does not exist.
    * 
    * @param data - The data to be inserted. Data is not to exceed 1,000,000 characters. 
    *             If more than 1,000,000 characters are passed in, an ArgumentOutOfRange exception is thrown.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    *        coercionType: If text, the current style is applied in Outlook on the web and desktop clients. 
    *        If the field is an HTML editor, only the text data is inserted, even if the data is HTML. 
    *        If html and the field supports HTML (the subject doesn't), the current style is applied in Outlook on the web and the default style is 
    *        applied in Outlook on desktop clients.
    *        If the field is a text field, an InvalidDataFormat error is returned. 
    *        If coercionType is not set, the result depends on the field: if the field is HTML then HTML is used; 
    *        if the field is text, then plain text is used.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. 
    */
  def setSelectedDataAsync(data: String): Unit = js.native
  def setSelectedDataAsync(data: String, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  def setSelectedDataAsync(data: String, options: AsyncContextOptions with CoercionTypeOptions): Unit = js.native
  def setSelectedDataAsync(
    data: String,
    options: AsyncContextOptions with CoercionTypeOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
}

