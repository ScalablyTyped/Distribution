package typings.officeJsPreview.Office

import typings.officeJsPreview.Office.MailboxEnums.ItemType
import typings.officeJsPreview.anon.AsyncContextOptionsisInli
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The appointment organizer mode of {@link Office.Item | Office.context.mailbox.item}.
  *
  * **Important**: This is an internal Outlook object, not directly exposed through existing interfaces.
  * You should treat this as a mode of `Office.context.mailbox.item`. Refer to the
  * {@link https://docs.microsoft.com/office/dev/add-ins/reference/objectmodel/preview-requirement-set/office.context.mailbox.item | Object Model} page for more information.
  *
  * Parent interfaces:
  *
  * - {@link Office.ItemCompose | ItemCompose}
  *
  * - {@link Office.Appointment | Appointment}
  */
@js.native
trait AppointmentCompose extends Item {
  
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
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
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
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    *        `isInline`: If true, indicates that the attachment will be shown inline in the message body,
    *                    and should not be displayed in the attachment list.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                             of type `Office.AsyncResult`.
    *                 On success, the attachment identifier will be provided in the `asyncResult.value` property.
    *                 If uploading the attachment fails, the `asyncResult` object will contain
    *                 an `Error` object that provides a description of the error.
    */
  def addFileAttachmentAsync(uri: String, attachmentName: String): Unit = js.native
  def addFileAttachmentAsync(
    uri: String,
    attachmentName: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]
  ): Unit = js.native
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
    * The `addFileAttachmentFromBase64Async` method uploads the file from the base64 encoding and attaches it to the item in the compose form.
    * This method returns the attachment identifier in the `asyncResult.value` object.
    *
    * You can subsequently use the identifier with the `removeAttachmentAsync` method to remove the attachment in the same session.
    *
    * **Note**: If you're using a data URL API (e.g., `readAsDataURL`), you need to strip out the data URL prefix then send the rest of the string to this API.
    * For example, if the full string is represented by `data:image/svg+xml;base64,<rest of base64 string>`, remove `data:image/svg+xml;base64,`.
    *
    * [Api set: Mailbox 1.8]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    *
    * **Errors**:
    *
    * - `AttachmentSizeExceeded`: The attachment is larger than allowed.
    *
    * - `FileTypeNotSupported`: The attachment has an extension that is not allowed.
    *
    * - `NumberOfAttachmentsExceeded`: The message or appointment has too many attachments.
    *
    * @param base64File - The base64 encoded content of an image or file to be added to an email or event.
    * @param attachmentName - The name of the attachment that is shown while the attachment is uploading. The maximum length is 255 characters.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    *        `isInline`: If true, indicates that the attachment will be shown inline in the message body
    *                    and should not be displayed in the attachment list.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                             of type `Office.AsyncResult`.
    *                  On success, the attachment identifier will be provided in the `asyncResult.value` property.
    *                  If uploading the attachment fails, the `asyncResult` object will contain
    *                  an `Error` object that provides a description of the error.
    */
  def addFileAttachmentFromBase64Async(base64File: String, attachmentName: String): Unit = js.native
  def addFileAttachmentFromBase64Async(
    base64File: String,
    attachmentName: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]
  ): Unit = js.native
  def addFileAttachmentFromBase64Async(base64File: String, attachmentName: String, options: AsyncContextOptionsisInli): Unit = js.native
  def addFileAttachmentFromBase64Async(
    base64File: String,
    attachmentName: String,
    options: AsyncContextOptionsisInli,
    callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]
  ): Unit = js.native
  
  def addHandlerAsync(eventType: String, handler: js.Any): Unit = js.native
  def addHandlerAsync(
    eventType: String,
    handler: js.Any,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def addHandlerAsync(eventType: String, handler: js.Any, options: AsyncContextOptions): Unit = js.native
  def addHandlerAsync(
    eventType: String,
    handler: js.Any,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  /**
    * Adds an event handler for a supported event. **Note**: Events are available only with task pane.
    *
    * Refer to the Item object model {@link https://docs.microsoft.com/office/dev/add-ins/reference/objectmodel/preview-requirement-set/office.context.mailbox.item#events | events section} for supported events.
    *
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    *
    * @param eventType - The event that should invoke the handler.
    * @param handler - The function to handle the event. The function must accept a single parameter, which is an object literal.
    *                The type property on the parameter will match the `eventType` parameter passed to `addHandlerAsync`.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    */
  def addHandlerAsync(eventType: EventType, handler: js.Any): Unit = js.native
  def addHandlerAsync(
    eventType: EventType,
    handler: js.Any,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def addHandlerAsync(eventType: EventType, handler: js.Any, options: AsyncContextOptions): Unit = js.native
  def addHandlerAsync(
    eventType: EventType,
    handler: js.Any,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  
  /**
    * Adds an Exchange item, such as a message, as an attachment to the message or appointment.
    *
    * The `addItemAttachmentAsync` method attaches the item with the specified Exchange identifier to the item in the compose form.
    * If you specify a callback method, the method is called with one parameter, `asyncResult`, which contains either the attachment identifier or
    * a code that indicates any error that occurred while attaching the item.
    * You can use the `options` parameter to pass state information to the callback method, if needed.
    *
    * You can subsequently use the identifier with the `removeAttachmentAsync` method to remove the attachment in the same session.
    *
    * If your Office Add-in is running in Outlook on the web, the `addItemAttachmentAsync` method can attach items to items other than the item that
    * you are editing; however, this is not supported and is not recommended.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    *
    * **Errors**:
    *
    * - `NumberOfAttachmentsExceeded`: The message or appointment has too many attachments.
    *
    * @param itemId - The Exchange identifier of the item to attach. The maximum length is 100 characters.
    * @param attachmentName - The name of the attachment that is shown while the attachment is uploading. The maximum length is 255 characters.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of
    *                             type `Office.AsyncResult`.
    *                 On success, the attachment identifier will be provided in the `asyncResult.value` property.
    *                 If adding the attachment fails, the `asyncResult` object will contain
    *                 an `Error` object that provides a description of the error.
    */
  def addItemAttachmentAsync(itemId: js.Any, attachmentName: String): Unit = js.native
  def addItemAttachmentAsync(
    itemId: js.Any,
    attachmentName: String,
    options: js.UndefOr[scala.Nothing],
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
    * Gets an object that provides methods for manipulating the body of an item.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    */
  var body: Body = js.native
  
  /**
    * Gets an object that provides methods for managing the item's categories.
    *
    * [Api set: Mailbox 1.8]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    */
  var categories: Categories = js.native
  
  /**
    * Closes the current item that is being composed
    *
    * The behaviors of the `close` method depends on the current state of the item being composed.
    * If the item has unsaved changes, the client prompts the user to save, discard, or close the action.
    *
    * In the Outlook desktop client, if the message is an inline reply, the `close` method has no effect.
    *
    * **Note**: In Outlook on the web, if the item is an appointment and it has previously been saved using `saveAsync`, the user is prompted to save,
    * discard, or cancel even if no changes have occurred since the item was last saved.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `Restricted`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    */
  def close(): Unit = js.native
  
  /**
    * Disables the Outlook client signature.
    *
    * For Windows and Mac rich clients, this API sets the signature under the "New Message" and "Replies/Forwards" sections
    * for the sending account to "(none)", effectively disabling the signature.
    * For Outlook on the web, the API should disable the signature option for new mails, replies, and forwards.
    * If the signature is selected, this API call should disable it.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    *
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    *
    * @beta
    */
  def disableClientSignatureAsync(): Unit = js.native
  def disableClientSignatureAsync(
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def disableClientSignatureAsync(options: AsyncContextOptions): Unit = js.native
  def disableClientSignatureAsync(options: AsyncContextOptions, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  
  /**
    * Gets or sets the date and time that the appointment is to end.
    *
    * The `end` property is a {@link Office.Time | Time} object expressed as a Coordinated Universal Time (UTC) date and time value.
    * You can use the `convertToLocalClientTime` method to convert the `end` property value to the client's local date and time.
    *
    * When you use the `Time.setAsync` method to set the end time, you should use the `convertToUtcClientTime` method to convert the local time on
    * the client to UTC for the server.
    *
    * **Important**: In the Windows client, you can't use this property to update the end of a recurrence.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    */
  var end: Time = js.native
  
  /**
    * Gets or sets the locations of the appointment. The `enhancedLocation` property returns an {@link Office.EnhancedLocation | EnhancedLocation}
    * object that provides methods to get, remove, or add locations on an item.
    *
    * [Api set: Mailbox 1.8]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    */
  var enhancedLocation: EnhancedLocation = js.native
  
  /**
    * Gets an attachment from a message or appointment and returns it as an `AttachmentContent` object.
    *
    * The `getAttachmentContentAsync` method gets the attachment with the specified identifier from the item. As a best practice, you should use
    * the identifier to retrieve an attachment in the same session that the attachmentIds were retrieved with the `getAttachmentsAsync` or
    * `item.attachments` call. In Outlook on the web and mobile devices, the attachment identifier is valid only within the same session.
    * A session is over when the user closes the app, or if the user starts composing an inline form then subsequently pops out the form to
    * continue in a separate window.
    *
    * [Api set: Mailbox 1.8]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    *
    * **Errors**:
    *
    * - `AttachmentTypeNotSupported`: The attachment type isn't supported. Unsupported types include embedded images in Rich Text Format,
    *                               or item attachment types other than email or calendar items (such as a contact or task item).
    *
    * - `InvalidAttachmentId`: The attachment identifier does not exist.
    *
    * @param attachmentId - The identifier of the attachment you want to get.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object. If the call fails, the `asyncResult.error` property will contain
    *                an error code with the reason for the failure.
    */
  def getAttachmentContentAsync(attachmentId: String): Unit = js.native
  def getAttachmentContentAsync(
    attachmentId: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* asyncResult */ AsyncResult[AttachmentContent], Unit]
  ): Unit = js.native
  def getAttachmentContentAsync(attachmentId: String, options: AsyncContextOptions): Unit = js.native
  def getAttachmentContentAsync(
    attachmentId: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[AttachmentContent], Unit]
  ): Unit = js.native
  
  /**
    * Gets the item's attachments as an array.
    *
    * [Api set: Mailbox 1.8]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    *
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`. If the call fails, the `asyncResult.error` property will contain an error code with the reason for
    *                 the failure.
    */
  def getAttachmentsAsync(): Unit = js.native
  def getAttachmentsAsync(
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* asyncResult */ AsyncResult[js.Array[AttachmentDetailsCompose]], Unit]
  ): Unit = js.native
  def getAttachmentsAsync(options: AsyncContextOptions): Unit = js.native
  def getAttachmentsAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[js.Array[AttachmentDetailsCompose]], Unit]
  ): Unit = js.native
  
  /**
    * Gets initialization data passed when the add-in is activated by an actionable message.
    *
    * **Note**: This method is only supported by Outlook 2016 or later on Windows (Click-to-Run versions greater than 16.0.8413.1000)
    * and Outlook on the web for Office 365.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    *
    * More information on {@link https://docs.microsoft.com/outlook/actionable-messages/invoke-add-in-from-actionable-message | actionable messages}.
    *
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                             of type `Office.AsyncResult`.
    *                 On success, the initialization data is provided in the `asyncResult.value` property as a string.
    *                 If there is no initialization context, the `asyncResult` object will contain
    *                 an `Error` object with its `code` property set to 9020 and its `name` property set to `GenericResponseError`.
    *
    * @beta
    */
  def getInitializationContextAsync(): Unit = js.native
  def getInitializationContextAsync(
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]
  ): Unit = js.native
  def getInitializationContextAsync(options: AsyncContextOptions): Unit = js.native
  def getInitializationContextAsync(options: AsyncContextOptions, callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]): Unit = js.native
  
  /**
    * Asynchronously gets the ID of a saved item.
    *
    * When invoked, this method returns the item ID via the callback method.
    *
    * **Note**: If your add-in calls `getItemIdAsync` on an item in compose mode (e.g., to get an `itemId` to use with EWS or the REST API),
    * be aware that when Outlook is in cached mode, it may take some time before the item is synced to the server.
    * Until the item is synced, the `itemId` is not recognized and using it returns an error.
    *
    * [Api set: Mailbox 1.8]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    *
    * **Errors**:
    *
    * - `ItemNotSaved`: The id can't be retrieved until the item is saved.
    *
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                   of type `Office.AsyncResult`.
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
    * [Api set: Mailbox 1.8]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    *
    * **Errors**:
    *
    * - `ItemNotSaved`: The id can't be retrieved until the item is saved.
    *
    * @param options - An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                   of type `Office.AsyncResult`.
    */
  def getItemIdAsync(options: AsyncContextOptions, callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]): Unit = js.native
  
  def getSelectedDataAsync(coercionType: String, callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]): Unit = js.native
  def getSelectedDataAsync(
    coercionType: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[_], Unit]
  ): Unit = js.native
  /**
    * Asynchronously returns selected data from the subject or body of a message.
    *
    * If there is no selection but the cursor is in the body or subject, the method returns an empty string for the selected data.
    * If a field other than the body or subject is selected, the method returns the `InvalidSelection` error.
    *
    * To access the selected data from the callback method, call `asyncResult.value.data`.
    * To access the `source` property that the selection comes from, call `asyncResult.value.sourceProperty`, which will be either `body` or `subject`.
    *
    * [Api set: Mailbox 1.2]
    *
    * @returns
    * The selected data as a string with format determined by `coercionType`.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    *
    * @param coercionType - Requests a format for the data. If `Text`, the method returns the plain text as a string, removing any HTML tags present.
    *                     If `HTML`, the method returns the selected text, whether it is plaintext or HTML.
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                   of type `Office.AsyncResult`.
    */
  def getSelectedDataAsync(coercionType: CoercionType, callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]): Unit = js.native
  /**
    * Asynchronously returns selected data from the subject or body of a message.
    *
    * If there is no selection but the cursor is in the body or subject, the method returns an empty string for the selected data.
    * If a field other than the body or subject is selected, the method returns the `InvalidSelection` error.
    *
    * To access the selected data from the callback method, call `asyncResult.value.data`.
    * To access the `source` property that the selection comes from, call `asyncResult.value.sourceProperty`, which will be either `body` or `subject`.
    *
    * [Api set: Mailbox 1.2]
    *
    * @returns
    * The selected data as a string with format determined by `coercionType`.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    *
    * @param coercionType - Requests a format for the data. If `Text`, the method returns the plain text as a string, removing any HTML tags present.
    *                     If `HTML`, the method returns the selected text, whether it is plaintext or HTML.
    * @param options - An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                  of type `Office.AsyncResult`.
    */
  def getSelectedDataAsync(
    coercionType: CoercionType,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[_], Unit]
  ): Unit = js.native
  
  /**
    * Gets the properties of an appointment or message in a shared folder, calendar, or mailbox.
    *
    * For more information around using this API, see the
    * {@link https://docs.microsoft.com/office/dev/add-ins/outlook/delegate-access | delegate access} article.
    *
    * **Note**: This method is not supported in Outlook on iOS or Android.
    *
    * [Api set: Mailbox 1.8]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    *
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of
    *                 type `Office.AsyncResult`.
    *                 The `value` property of the result is the properties of the shared item.
    */
  def getSharedPropertiesAsync(callback: js.Function1[/* asyncResult */ AsyncResult[SharedProperties], Unit]): Unit = js.native
  /**
    * Gets the properties of an appointment or message in a shared folder, calendar, or mailbox.
    *
    * For more information around using this API, see the
    * {@link https://docs.microsoft.com/office/dev/add-ins/outlook/delegate-access | delegate access} article.
    *
    * **Note**: This method is not supported in Outlook on iOS or Android.
    *
    * [Api set: Mailbox 1.8]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    *
    * @param options - An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`.
    *                 The `value` property of the result is the properties of the shared item.
    */
  def getSharedPropertiesAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[SharedProperties], Unit]
  ): Unit = js.native
  
  /**
    * Gets or sets the {@link Office.IsAllDayEvent} property of an appointment.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    *
    * @beta
    */
  var isAllDayEvent: IsAllDayEvent = js.native
  
  /**
    * Gets if the client signature is enabled.
    *
    * For Windows and Mac rich clients, the API call should return `true` if the default signature for new messages, replies, or forwards is set
    * to a template for the sending Outlook account.
    * For Outlook on the web, the API call should return `true` if the signature is enabled for compose types `newMail`, `reply`, or `forward`.
    * If the settings are set to "(none)" in Mac or Windows rich clients or disabled in Outlook on the Web, the API call should return `false`.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    *
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                   type `Office.AsyncResult`.
    *
    * @beta
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
    * [Api set: Mailbox Preview]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    *
    * @param options - An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                   type `Office.AsyncResult`.
    *
    * @beta
    */
  def isClientSignatureEnabledAsync(options: AsyncContextOptions, callback: js.Function1[/* asyncResult */ AsyncResult[Boolean], Unit]): Unit = js.native
  
  /**
    * Gets the type of item that an instance represents.
    *
    * The `itemType` property returns one of the `ItemType` enumeration values, indicating whether the `item` object instance is a message or an appointment.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    */
  var itemType: ItemType | String = js.native
  
  /**
    * Asynchronously loads custom properties for this add-in on the selected item.
    *
    * Custom properties are stored as key/value pairs on a per-app, per-item basis.
    * This method returns a `CustomProperties` object in the callback, which provides methods to access the custom properties specific to the
    * current item and the current add-in. Custom properties are not encrypted on the item, so this should not be used as secure storage.
    *
    * The custom properties are provided as a `CustomProperties` object in the `asyncResult.value` property.
    * This object can be used to get, set, and remove custom properties from the item and save changes to the custom property set back to
    * the server.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    *
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`.
    * @param userContext - Optional. Developers can provide any object they wish to access in the callback function.
    *                    This object can be accessed by the `asyncResult.asyncContext` property in the callback function.
    */
  def loadCustomPropertiesAsync(callback: js.Function1[/* asyncResult */ AsyncResult[CustomProperties], Unit]): Unit = js.native
  def loadCustomPropertiesAsync(callback: js.Function1[/* asyncResult */ AsyncResult[CustomProperties], Unit], userContext: js.Any): Unit = js.native
  
  /**
    * Gets or sets the location of an appointment. The `location` property returns a {@link Office.Location | Location} object that provides methods that are
    * used to get and set the location of the appointment.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    */
  var location: Location = js.native
  
  /**
    * Gets the notification messages for an item.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    */
  var notificationMessages: NotificationMessages = js.native
  
  /**
    * Provides access to the optional attendees of an event. The type of object and level of access depend on the mode of the current item.
    *
    * The `optionalAttendees` property returns a `Recipients` object that provides methods to get or update the
    * optional attendees for a meeting. However, depending on the client/platform (i.e., Windows, Mac, etc.), limits may apply on how many
    * recipients you can get or update. See the {@link Office.Recipients | Recipients} object for more details.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    */
  var optionalAttendees: Recipients = js.native
  
  /**
    * Gets the organizer for the specified meeting.
    *
    * The `organizer` property returns an {@link Office.Organizer | Organizer} object that provides a method to get the organizer value.
    *
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    */
  var organizer: Organizer = js.native
  
  /**
    * Gets or sets the recurrence pattern of an appointment.
    *
    * The `recurrence` property returns a recurrence object for recurring appointments or meetings requests if an item is a series or an instance
    * in a series. `null` is returned for single appointments and meeting requests of single appointments.
    *
    * **Note**: Meeting requests have an `itemClass` value of `IPM.Schedule.Meeting.Request`.
    *
    * **Note**: If the recurrence object is null, this indicates that the object is a single appointment or a meeting request of a single
    * appointment and NOT a part of a series.
    *
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    */
  var recurrence: Recurrence = js.native
  
  /**
    * Removes an attachment from a message or appointment.
    *
    * The `removeAttachmentAsync` method removes the attachment with the specified identifier from the item.
    * As a best practice, you should use the attachment identifier to remove an attachment only if the same mail app has added that attachment
    * in the same session. In Outlook on the web and mobile devices, the attachment identifier is valid only within the same session.
    * A session is over when the user closes the app, or if the user starts composing an inline form then subsequently pops out the form to
    * continue in a separate window.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    *
    * **Errors**:
    *
    * - `InvalidAttachmentId`: The attachment identifier does not exist.
    *
    * @param attachmentId - The identifier of the attachment to remove.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                             type `Office.AsyncResult`.
    *                 If removing the attachment fails, the `asyncResult.error` property will contain an error code with the reason for the failure.
    */
  def removeAttachmentAsync(attachmentId: String): Unit = js.native
  def removeAttachmentAsync(
    attachmentId: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def removeAttachmentAsync(attachmentId: String, options: AsyncContextOptions): Unit = js.native
  def removeAttachmentAsync(
    attachmentId: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  
  def removeHandlerAsync(eventType: String): Unit = js.native
  def removeHandlerAsync(
    eventType: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def removeHandlerAsync(eventType: String, options: AsyncContextOptions): Unit = js.native
  def removeHandlerAsync(
    eventType: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  /**
    * Removes the event handlers for a supported event type. **Note**: Events are available only with task pane.
    *
    * Refer to the Item object model {@link https://docs.microsoft.com/office/dev/add-ins/reference/objectmodel/preview-requirement-set/office.context.mailbox.item#events | events section} for supported events.
    *
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    *
    * @param eventType - The event that should revoke the handler.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    */
  def removeHandlerAsync(eventType: EventType): Unit = js.native
  def removeHandlerAsync(
    eventType: EventType,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def removeHandlerAsync(eventType: EventType, options: AsyncContextOptions): Unit = js.native
  def removeHandlerAsync(
    eventType: EventType,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  
  /**
    * Provides access to the required attendees of an event. The type of object and level of access depend on the mode of the current item.
    *
    * The `requiredAttendees` property returns a `Recipients` object that provides methods to get or update the
    * required attendees for a meeting. However, depending on the client/platform (i.e., Windows, Mac, etc.), limits may apply on how many
    * recipients you can get or update. See the {@link Office.Recipients | Recipients} object for more details.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    */
  var requiredAttendees: Recipients = js.native
  
  /**
    * Asynchronously saves an item.
    *
    * When invoked, this method saves the current message as a draft and returns the item ID via the callback method.
    * In Outlook on the web or Outlook in online mode, the item is saved to the server. In Outlook in cached mode, the item is saved to the local cache.
    *
    * Since appointments have no draft state, if `saveAsync` is called on an appointment in compose mode, the item will be saved as a normal
    * appointment on the user's calendar. For new appointments that have not been saved before, no invitation will be sent.
    * Saving an existing appointment will send an update to added or removed attendees.
    *
    * **Note**: If your add-in calls `saveAsync` on an item in compose mode in order to get an item ID to use with EWS or the REST API, be aware that
    * when Outlook is in cached mode, it may take some time before the item is actually synced to the server.
    * Until the item is synced, using the item ID will return an error.
    *
    * **Note**: In Outlook on Mac, only build 16.35.308 or later supports saving a meeting.
    * Otherwise, the `saveAsync` method fails when called from a meeting in compose mode.
    * For a workaround, see {@link https://support.microsoft.com/help/4505745 | Cannot save a meeting as a draft in Outlook for Mac by using Office JS API}.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    *
    * **Errors**:
    *
    * - `InvalidAttachmentId`: The attachment identifier does not exist.
    *
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of
    *                   type `Office.AsyncResult`.
    */
  def saveAsync(callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]): Unit = js.native
  /**
    * Asynchronously saves an item.
    *
    * When invoked, this method saves the current message as a draft and returns the item ID via the callback method.
    * In Outlook on the web or Outlook in online mode, the item is saved to the server.
    * In Outlook in cached mode, the item is saved to the local cache.
    *
    * Since appointments have no draft state, if `saveAsync` is called on an appointment in compose mode, the item will be saved as a normal
    * appointment on the user's calendar. For new appointments that have not been saved before, no invitation will be sent.
    * Saving an existing appointment will send an update to added or removed attendees.
    *
    * **Note**: If your add-in calls `saveAsync` on an item in compose mode in order to get an item ID to use with EWS or the REST API, be aware
    * that when Outlook is in cached mode, it may take some time before the item is actually synced to the server.
    * Until the item is synced, using the item ID will return an error.
    *
    * **Note**: In Outlook on Mac, only build 16.35.308 or later supports saving a meeting.
    * Otherwise, the `saveAsync` method fails when called from a meeting in compose mode.
    * For a workaround, see {@link https://support.microsoft.com/help/4505745 | Cannot save a meeting as a draft in Outlook for Mac by using Office JS API}.
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    *
    * **Errors**:
    *
    * - `InvalidAttachmentId`: The attachment identifier does not exist.
    *
    * @param options - An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                   type `Office.AsyncResult`.
    */
  def saveAsync(options: AsyncContextOptions, callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]): Unit = js.native
  
  /**
    * Gets or sets the {@link Office.Sensitivity | sensitivity} of an appointment.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    *
    * @beta
    */
  var sensitivity: Sensitivity = js.native
  
  /**
    * Gets the id of the series that an instance belongs to.
    *
    * In Outlook on the web and desktop clients, the `seriesId` property returns the Exchange Web Services (EWS) ID of the parent (series) item
    * that this item belongs to. However, on iOS and Android, the seriesId returns the REST ID of the parent item.
    *
    * **Note**: The identifier returned by the `seriesId` property is the same as the Exchange Web Services item identifier.
    * The `seriesId` property is not identical to the Outlook IDs used by the Outlook REST API.
    * Before making REST API calls using this value, it should be converted using `Office.context.mailbox.convertToRestId`.
    * For more details, see {@link https://docs.microsoft.com/office/dev/add-ins/outlook/use-rest-api | Use the Outlook REST APIs from an Outlook add-in}.
    *
    * The `seriesId` property returns `null` for items that do not have parent items such as single appointments, series items, or meeting requests
    * and returns `undefined` for any other items that are not meeting requests.
    *
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    */
  var seriesId: String = js.native
  
  /**
    * Manages the {@link Office.SessionData | SessionData} of an item in Compose mode.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    *
    * @beta
    */
  var sessionData: SessionData = js.native
  
  /**
    * Asynchronously inserts data into the body or subject of a message.
    *
    * The `setSelectedDataAsync` method inserts the specified string at the cursor location in the subject or body of the item, or, if text is
    * selected in the editor, it replaces the selected text. If the cursor is not in the body or subject field, an error is returned.
    * After insertion, the cursor is placed at the end of the inserted content.
    *
    * [Api set: Mailbox 1.2]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    *
    * **Errors**:
    *
    * - `InvalidAttachmentId`: The attachment identifier does not exist.
    *
    * @param data - The data to be inserted. Data is not to exceed 1,000,000 characters.
    *             If more than 1,000,000 characters are passed in, an `ArgumentOutOfRange` exception is thrown.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    *        `coercionType`: If text, the current style is applied in Outlook on the web and Windows.
    *                      If the field is an HTML editor, only the text data is inserted, even if the data is HTML.
    *                      If html and the field supports HTML (the subject doesn't), the current style is applied in Outlook on the web and the
    *                      default style is applied in Outlook on desktop clients.
    *                      If the field is a text field, an `InvalidDataFormat` error is returned.
    *                      If `coercionType` is not set, the result depends on the field: if the field is HTML then HTML is used;
    *                      if the field is text, then plain text is used.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`.
    */
  def setSelectedDataAsync(data: String): Unit = js.native
  def setSelectedDataAsync(data: String, options: AsyncContextOptions with CoercionTypeOptions): Unit = js.native
  def setSelectedDataAsync(
    data: String,
    options: AsyncContextOptions with CoercionTypeOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def setSelectedDataAsync(
    data: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  
  /**
    * Gets or sets the date and time that the appointment is to begin.
    *
    * The `start` property is a {@link Office.Time | Time} object expressed as a Coordinated Universal Time (UTC) date and time value.
    * You can use the `convertToLocalClientTime` method to convert the value to the client's local date and time.
    *
    * When you use the `Time.setAsync` method to set the start time, you should use the `convertToUtcClientTime` method to convert the local time on
    * the client to UTC for the server.
    *
    * **Important**: In the Windows client, you can't use this property to update the start of a recurrence.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    */
  var start: Time = js.native
  
  /**
    * Gets or sets the description that appears in the subject field of an item.
    *
    * The `subject` property gets or sets the entire subject of the item, as sent by the email server.
    *
    * The `subject` property returns a `Subject` object that provides methods to get and set the subject.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Appointment Organizer
    */
  var subject: Subject = js.native
}
