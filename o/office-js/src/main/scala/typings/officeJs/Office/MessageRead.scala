package typings.officeJs.Office

import typings.officeJs.Office.MailboxEnums.EntityType
import typings.officeJs.Office.MailboxEnums.ItemType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The message read mode of {@link Office.Item | Office.context.mailbox.item}.
  *
  * **Important**: This is an internal Outlook object, not directly exposed through existing interfaces.
  * You should treat this as a mode of `Office.context.mailbox.item`. For more information, refer to the
  * {@link https://learn.microsoft.com/javascript/api/requirement-sets/outlook/requirement-set-1.12/office.context.mailbox.item | Object Model} page.
  *
  * Parent interfaces:
  *
  * - {@link Office.ItemRead | ItemRead}
  *
  * - {@link Office.Message | Message}
  */
@js.native
trait MessageRead
  extends StObject
     with Item {
  
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
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    *
    * @param eventType - The event that should invoke the handler.
    * @param handler - The function to handle the event. The function must accept a single parameter, which is an object literal.
    *                The `type` property on the parameter will match the eventType `parameter` passed to `addHandlerAsync`.
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
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    *
    * @param eventType - The event that should invoke the handler.
    * @param handler - The function to handle the event. The function must accept a single parameter, which is an object literal.
    *                The `type` property on the parameter will match the eventType `parameter` passed to `addHandlerAsync`.
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
    * Gets the item's attachments as an array.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    *
    * **Note**: Certain types of files are blocked by Outlook due to potential security issues and are therefore not returned.
    * For more information, see
    * {@link https://support.microsoft.com/office/434752e1-02d3-4e90-9124-8b81e49a8519 | Blocked attachments in Outlook}.
    *
    */
  var attachments: js.Array[AttachmentDetails] = js.native
  
  /**
    * Gets an object that provides methods for manipulating the body of an item.
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    */
  var body: Body = js.native
  
  /**
    * Gets an object that provides methods for managing the item's categories.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    */
  var categories: Categories = js.native
  
  /**
    * Provides access to the Cc (carbon copy) recipients of a message. The type of object and level of access depend on the mode of the
    * current item.
    *
    * The `cc` property returns an array that contains an {@link Office.EmailAddressDetails | EmailAddressDetails} object for
    * each recipient listed on the **Cc** line of the message. Collection size limits:
    *
    * - Windows: 500 members
    *
    * - Classic Mac UI: 100 members
    *
    * - Web browser: 20 members
    *
    * - New Mac UI, Android: No limit
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    */
  var cc: js.Array[EmailAddressDetails] = js.native
  
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
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    */
  var conversationId: String = js.native
  
  /**
    * Gets the date and time that an item was created.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    */
  var dateTimeCreated: js.Date = js.native
  
  /**
    * Gets the date and time that an item was last modified.
    *
    * **Note**: This member is not supported in Outlook on iOS or Android.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    */
  var dateTimeModified: js.Date = js.native
  
  /**
    * Displays a reply form that includes either the sender and all recipients of the selected message or the organizer and all attendees of the
    * selected appointment.
    *
    * In Outlook on the web, the reply form is displayed as a pop-out form in the 3-column view and a pop-up form in the 2-column or 1-column view.
    *
    * If any of the string parameters exceed their limits, `displayReplyAllForm` throws an exception.
    *
    * When attachments are specified in the `formData.attachments` parameter, Outlook attempts to download all attachments and attach them to the
    * reply form. If any attachments fail to be added, an error is shown in the form UI. If this isn't possible, then no error message is thrown.
    *
    * **Note**: This method is not supported in Outlook on iOS or Android.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    *
    * @param formData - A string that contains text and HTML and that represents the body of the reply form. The string is limited to 32 KB
    *                   OR a {@link Office.ReplyFormData | ReplyFormData} object that contains body or attachment data and a callback function.
    */
  def displayReplyAllForm(formData: String): Unit = js.native
  def displayReplyAllForm(formData: ReplyFormData): Unit = js.native
  
  /**
    * Displays a reply form that includes either the sender and all recipients of the selected message or the organizer and all attendees of the
    * selected appointment.
    *
    * In Outlook on the web, the reply form is displayed as a pop-out form in the 3-column view and a pop-up form in the 2-column or 1-column view.
    *
    * If any of the string parameters exceed their limits, `displayReplyAllFormAsync` throws an exception.
    *
    * When attachments are specified in the `formData.attachments` parameter, Outlook attempts to download all attachments and attach them to the
    * reply form. If any attachments fail to be added, an error is shown in the form UI. If this isn't possible, then no error message is thrown.
    *
    * **Note**: This method is not supported in Outlook on iOS or Android.
    *
    * @remarks
    * [Api set: Mailbox 1.9]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    *
    * @param formData - A string that contains text and HTML and that represents the body of the reply form. The string is limited to 32 KB
    *                   OR a {@link Office.ReplyFormData | ReplyFormData} object that contains body or attachment data and a callback function.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    */
  def displayReplyAllFormAsync(formData: String): Unit = js.native
  def displayReplyAllFormAsync(formData: String, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  /**
    * Displays a reply form that includes either the sender and all recipients of the selected message or the organizer and all attendees of the
    * selected appointment.
    *
    * In Outlook on the web, the reply form is displayed as a pop-out form in the 3-column view and a pop-up form in the 2-column or 1-column view.
    *
    * If any of the string parameters exceed their limits, `displayReplyAllFormAsync` throws an exception.
    *
    * When attachments are specified in the `formData.attachments` parameter, Outlook attempts to download all attachments and attach them to the
    * reply form. If any attachments fail to be added, an error is shown in the form UI. If this isn't possible, then no error message is thrown.
    *
    * **Note**: This method is not supported in Outlook on iOS or Android.
    *
    * @remarks
    * [Api set: Mailbox 1.9]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    *
    * @param formData - A string that contains text and HTML and that represents the body of the reply form. The string is limited to 32 KB
    *                   OR a {@link Office.ReplyFormData | ReplyFormData} object that contains body or attachment data and a callback function.
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    */
  def displayReplyAllFormAsync(formData: String, options: AsyncContextOptions): Unit = js.native
  def displayReplyAllFormAsync(
    formData: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def displayReplyAllFormAsync(formData: ReplyFormData): Unit = js.native
  def displayReplyAllFormAsync(formData: ReplyFormData, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  def displayReplyAllFormAsync(formData: ReplyFormData, options: AsyncContextOptions): Unit = js.native
  def displayReplyAllFormAsync(
    formData: ReplyFormData,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  
  /**
    * Displays a reply form that includes only the sender of the selected message or the organizer of the selected appointment.
    *
    * In Outlook on the web, the reply form is displayed as a pop-out form in the 3-column view and a pop-up form in the 2-column or 1-column view.
    *
    * If any of the string parameters exceed their limits, `displayReplyForm` throws an exception.
    *
    * When attachments are specified in the `formData.attachments` parameter, Outlook attempts to download all attachments and attach them to the
    * reply form. If any attachments fail to be added, an error is shown in the form UI. If this isn't possible, then no error message is thrown.
    *
    * **Note**: This method is not supported in Outlook on iOS or Android.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    *
    * @param formData - A string that contains text and HTML and that represents the body of the reply form. The string is limited to 32 KB
    *                   OR a {@link Office.ReplyFormData | ReplyFormData} object that contains body or attachment data and a callback function.
    */
  def displayReplyForm(formData: String): Unit = js.native
  def displayReplyForm(formData: ReplyFormData): Unit = js.native
  
  /**
    * Displays a reply form that includes only the sender of the selected message or the organizer of the selected appointment.
    *
    * In Outlook on the web, the reply form is displayed as a pop-out form in the 3-column view and a pop-up form in the 2-column or 1-column view.
    *
    * If any of the string parameters exceed their limits, `displayReplyFormAsync` throws an exception.
    *
    * When attachments are specified in the `formData.attachments` parameter, Outlook attempts to download all attachments and attach them to the
    * reply form. If any attachments fail to be added, an error is shown in the form UI. If this isn't possible, then no error message is thrown.
    *
    * **Note**: This method is not supported in Outlook on iOS or Android.
    *
    * @remarks
    * [Api set: Mailbox 1.9]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    *
    * @param formData - A string that contains text and HTML and that represents the body of the reply form. The string is limited to 32 KB
    *                   OR a {@link Office.ReplyFormData | ReplyFormData} object that contains body or attachment data and a callback function.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    */
  def displayReplyFormAsync(formData: String): Unit = js.native
  def displayReplyFormAsync(formData: String, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  /**
    * Displays a reply form that includes only the sender of the selected message or the organizer of the selected appointment.
    *
    * In Outlook on the web, the reply form is displayed as a pop-out form in the 3-column view and a pop-up form in the 2-column or 1-column view.
    *
    * If any of the string parameters exceed their limits, `displayReplyFormAsync` throws an exception.
    *
    * When attachments are specified in the `formData.attachments` parameter, Outlook attempts to download all attachments and attach them to the
    * reply form. If any attachments fail to be added, an error is shown in the form UI. If this isn't possible, then no error message is thrown.
    *
    * **Note**: This method is not supported in Outlook on iOS or Android.
    *
    * @remarks
    * [Api set: Mailbox 1.9]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    *
    * @param formData - A string that contains text and HTML and that represents the body of the reply form. The string is limited to 32 KB
    *                   OR a {@link Office.ReplyFormData | ReplyFormData} object that contains body or attachment data and a callback function.
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    */
  def displayReplyFormAsync(formData: String, options: AsyncContextOptions): Unit = js.native
  def displayReplyFormAsync(
    formData: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  def displayReplyFormAsync(formData: ReplyFormData): Unit = js.native
  def displayReplyFormAsync(formData: ReplyFormData, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  def displayReplyFormAsync(formData: ReplyFormData, options: AsyncContextOptions): Unit = js.native
  def displayReplyFormAsync(
    formData: ReplyFormData,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  
  /**
    * Gets the date and time that the appointment is to end.
    *
    * The `end` property is a `Date` object expressed as a Coordinated Universal Time (UTC) date and time value.
    * You can use the `convertToLocalClientTime` method to convert the `end` property value to the client's local date and time.
    *
    * When you use the `Time.setAsync` method to set the end time, you should use the `convertToUtcClientTime` method to convert the local time on
    * the client to UTC for the server.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    */
  var end: js.Date = js.native
  
  /**
    * Gets the email address of the sender of a message.
    *
    * The `from` and `sender` properties represent the same person unless the message is sent by a delegate.
    * In that case, the `from` property represents the delegator, and the `sender` property represents the delegate.
    *
    * **Note**: The `recipientType` property of the `EmailAddressDetails` object in the `from` property is undefined.
    *
    * The `from` property returns an `EmailAddressDetails` object.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    */
  var from: EmailAddressDetails = js.native
  
  /**
    * Gets all the internet headers for the message as a string.
    *
    * To learn more, see
    * {@link https://learn.microsoft.com/office/dev/add-ins/outlook/internet-headers | Get and set internet headers on a message in an Outlook add-in}.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    *
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    *                On success, the internet headers data is provided in the `asyncResult.value` property as a string.
    *                Refer to {@link https://tools.ietf.org/html/rfc2183 | RFC 2183} for the formatting information of the returned string value.
    *                If the call fails, the `asyncResult.error` property will contain an error code with the reason for the failure.
    */
  def getAllInternetHeadersAsync(): Unit = js.native
  def getAllInternetHeadersAsync(callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]): Unit = js.native
  /**
    * Gets all the internet headers for the message as a string.
    *
    * To learn more, see
    * {@link https://learn.microsoft.com/office/dev/add-ins/outlook/internet-headers | Get and set internet headers on a message in an Outlook add-in}.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    *
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    *                On success, the internet headers data is provided in the `asyncResult.value` property as a string.
    *                Refer to {@link https://tools.ietf.org/html/rfc2183 | RFC 2183} for the formatting information of the returned string value.
    *                If the call fails, the `asyncResult.error` property will contain an error code with the reason for the failure.
    */
  def getAllInternetHeadersAsync(options: AsyncContextOptions): Unit = js.native
  def getAllInternetHeadersAsync(options: AsyncContextOptions, callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]): Unit = js.native
  
  /**
    * Gets an attachment from a message or appointment and returns it as an `AttachmentContent` object.
    *
    * The `getAttachmentContentAsync` method gets the attachment with the specified identifier from the item. As a best practice, you should get
    * the attachment's identifier from an {@link Office.MessageRead.attachments | item.attachments} call, then in the same session, use that identifier
    * to retrieve the attachment. In Outlook on the web and mobile devices, the attachment identifier is valid only within the same session.
    * A session is over when the user closes the app, or if the user starts composing an inline form then subsequently pops out the form to
    * continue in a separate window.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
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
    * the attachment's identifier from an {@link Office.MessageRead.attachments | item.attachments} call, then in the same session, use that identifier
    * to retrieve the attachment. In Outlook on the web and mobile devices, the attachment identifier is valid only within the same session.
    * A session is over when the user closes the app, or if the user starts composing an inline form then subsequently pops out the form to
    * continue in a separate window.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
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
    * Gets the entities found in the selected item's body.
    *
    * **Note**: This method is not supported in Outlook on iOS or Android.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    */
  def getEntities(): Entities = js.native
  
  def getEntitiesByType(entityType: String): js.Array[String | Contact | MeetingSuggestion | PhoneNumber | TaskSuggestion] = js.native
  /**
    * Gets an array of all the entities of the specified entity type found in the selected item's body.
    *
    * **Note**: This method is not supported in Outlook on iOS or Android.
    *
    * @returns
    * If the value passed in `entityType` is not a valid member of the `EntityType` enumeration, the method returns `null`.
    * If no entities of the specified type are present in the item's body, the method returns an empty array.
    * Otherwise, the type of the objects in the returned array depends on the type of entity requested in the `entityType` parameter.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `Restricted`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    *
    * @param entityType - One of the `EntityType` enumeration values.
    *
    * While the minimum permission level to use this method is `Restricted`, some entity types require `ReadItem` to access, as specified in the
    * following table.
    *
    * <table>
    *   <tr>
    *     <th>Value of entityType</th>
    *     <th>Type of objects in returned array</th>
    *     <th>Required Permission Level</th>
    *   </tr>
    *   <tr>
    *     <td>Address</td>
    *     <td>String</td>
    *     <td>Restricted</td>
    *   </tr>
    *   <tr>
    *     <td>Contact</td>
    *     <td>Contact</td>
    *     <td>ReadItem</td>
    *   </tr>
    *   <tr>
    *     <td>EmailAddress</td>
    *     <td>String</td>
    *     <td>ReadItem</td>
    *   </tr>
    *   <tr>
    *     <td>MeetingSuggestion</td>
    *     <td>MeetingSuggestion</td>
    *     <td>ReadItem</td>
    *   </tr>
    *   <tr>
    *     <td>PhoneNumber</td>
    *     <td>PhoneNumber</td>
    *     <td>Restricted</td>
    *   </tr>
    *   <tr>
    *     <td>TaskSuggestion</td>
    *     <td>TaskSuggestion</td>
    *     <td>ReadItem</td>
    *   </tr>
    *   <tr>
    *     <td>URL</td>
    *     <td>String</td>
    *     <td>Restricted</td>
    *   </tr>
    * </table>
    */
  def getEntitiesByType(entityType: EntityType): js.Array[String | Contact | MeetingSuggestion | PhoneNumber | TaskSuggestion] = js.native
  
  /**
    * Returns well-known entities in the selected item that pass the named filter defined in the manifest XML file.
    *
    * The `getFilteredEntitiesByName` method returns the entities that match the regular expression defined in the `ItemHasKnownEntity` rule element
    * in the manifest XML file with the specified `FilterName` element value.
    *
    * **Note**: This method is not supported in Outlook on iOS or Android.
    *
    * @returns If there is no `ItemHasKnownEntity` element in the manifest with a `FilterName` element value that matches the `name` parameter,
    * the method returns `null`.
    * If the `name` parameter does match an `ItemHasKnownEntity` element in the manifest, but there are no entities in the current item that match,
    * the method return an empty array.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    *
    * @param name - The name of the `ItemHasKnownEntity` rule element that defines the filter to match.
    */
  def getFilteredEntitiesByName(name: String): js.Array[String | Contact | MeetingSuggestion | PhoneNumber | TaskSuggestion] = js.native
  
  /**
    * Gets initialization data passed when the add-in is {@link https://learn.microsoft.com/outlook/actionable-messages/invoke-add-in | activated by an actionable message}.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    *
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                             of type `Office.AsyncResult`.
    *                 On success, the initialization context data is provided in the `asyncResult.value` property as a string.
    *                 If there is no initialization context, the `asyncResult` object will contain
    *                 an `Error` object with its `code` property set to 9020 and its `name` property set to `GenericResponseError`.
    */
  def getInitializationContextAsync(): Unit = js.native
  def getInitializationContextAsync(callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]): Unit = js.native
  /**
    * Gets initialization data passed when the add-in is {@link https://learn.microsoft.com/outlook/actionable-messages/invoke-add-in | activated by an actionable message}.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    *
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                             of type `Office.AsyncResult`.
    *                 On success, the initialization context data is provided in the `asyncResult.value` property as a string.
    *                 If there is no initialization context, the `asyncResult` object will contain
    *                 an `Error` object with its `code` property set to 9020 and its `name` property set to `GenericResponseError`.
    */
  def getInitializationContextAsync(options: AsyncContextOptions): Unit = js.native
  def getInitializationContextAsync(options: AsyncContextOptions, callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]): Unit = js.native
  
  /**
    * Returns string values in the selected item that match the regular expressions defined in the manifest XML file.
    *
    * The `getRegExMatches` method returns the strings that match the regular expression defined in each `ItemHasRegularExpressionMatch` or
    * `ItemHasKnownEntity` rule element in the manifest XML file.
    * For an `ItemHasRegularExpressionMatch` rule, a matching string has to occur in the property of the item that is specified by that rule.
    * The `PropertyName` simple type defines the supported properties.
    *
    * If you specify an `ItemHasRegularExpressionMatch` rule on the body property of an item, the regular expression should further filter
    * the body and should not attempt to return the entire body of the item.
    * Using a regular expression such as .* to obtain the entire body of an item does not always return the expected results.
    * Instead, use the `Body.getAsync` method to retrieve the entire body.
    *
    * **Note**: This method is not supported in Outlook on iOS or Android.
    *
    * @returns
    * An object that contains arrays of strings that match the regular expressions defined in the manifest XML file.
    * The name of each array is equal to the corresponding value of the `RegExName` attribute of the matching `ItemHasRegularExpressionMatch` rule
    * or the `FilterName` attribute of the matching `ItemHasKnownEntity` rule.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    */
  def getRegExMatches(): Any = js.native
  
  /**
    * Returns string values in the selected item that match the named regular expression defined in the manifest XML file.
    *
    * The `getRegExMatchesByName` method returns the strings that match the regular expression defined in the
    * `ItemHasRegularExpressionMatch` rule element in the manifest XML file with the specified `RegExName` element value.
    *
    * If you specify an `ItemHasRegularExpressionMatch` rule on the body property of an item, the regular expression should further filter
    * the body and should not attempt to return the entire body of the item.
    * Using a regular expression such as .* to obtain the entire body of an item does not always return the expected results.
    *
    * **Note**: This method is not supported in Outlook on iOS or Android.
    *
    * @returns
    * An array that contains the strings that match the regular expression defined in the manifest XML file.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    *
    * @param name - The name of the `ItemHasRegularExpressionMatch` rule element that defines the filter to match.
    */
  def getRegExMatchesByName(name: String): js.Array[String] = js.native
  
  /**
    * Gets the entities found in a highlighted match a user has selected. Highlighted matches apply to contextual add-ins.
    *
    * **Note**: This method is not supported in Outlook on iOS or Android.
    *
    * @remarks
    * [Api set: Mailbox 1.6]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    *
    * @param name - The name of the `ItemHasRegularExpressionMatch` rule element that defines the filter to match.
    */
  def getSelectedEntities(): Entities = js.native
  
  /**
    * Returns string values in a highlighted match that match the regular expressions defined in the manifest XML file.
    * Highlighted matches apply to contextual add-ins.
    *
    * The `getSelectedRegExMatches` method returns the strings that match the regular expression defined in
    * each `ItemHasRegularExpressionMatch` or `ItemHasKnownEntity` rule element in the manifest XML file.
    * For an `ItemHasRegularExpressionMatch` rule, a matching string has to occur in the property of the item that is specified by that rule.
    * The `PropertyName` simple type defines the supported properties.
    *
    * If you specify an `ItemHasRegularExpressionMatch` rule on the body property of an item, the regular expression should further filter the body
    * and should not attempt to return the entire body of the item.
    * Using a regular expression such as .* to obtain the entire body of an item does not always return the expected results.
    * Instead, use the `Body.getAsync` method to retrieve the entire body.
    *
    * **Note**: This method is not supported in Outlook on iOS or Android.
    *
    * @returns
    * An object that contains arrays of strings that match the regular expressions defined in the manifest XML file.
    * The name of each array is equal to the corresponding value of the `RegExName` attribute of the matching `ItemHasRegularExpressionMatch` rule or
    * the `FilterName` attribute of the matching `ItemHasKnownEntity` rule.
    *
    * @remarks
    * [Api set: Mailbox 1.6]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    */
  def getSelectedRegExMatches(): Any = js.native
  
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
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
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
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
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
    * Gets the internet message identifier for an email message.
    *
    * **Important**: In the **Sent Items** folder, the `internetMessageId` may not be available yet on recently sent items. In that case,
    * consider using {@link https://learn.microsoft.com/office/dev/add-ins/outlook/web-services | Exchange Web Services} to get this
    * {@link https://learn.microsoft.com/exchange/client-developer/web-service-reference/internetmessageid | property from the server}.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    */
  var internetMessageId: String = js.native
  
  /**
    * Gets the Exchange Web Services item class of the selected item.
    *
    * You can create custom message classes that extends a default message class, for example, a custom appointment message class
    * `IPM.Appointment.Contoso`.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    *
    * The `itemClass` property specifies the message class of the selected item.
    * The following are the default message classes for the message or appointment item.
    *
    * <table>
    *   <tr>
    *     <th>Type</th>
    *     <th>Description</th>
    *     <th>Item Class</th>
    *   </tr>
    *   <tr>
    *     <td>Appointment items</td>
    *     <td>These are calendar items of the item class IPM.Appointment or IPM.Appointment.Occurrence.</td>
    *     <td>IPM.Appointment, IPM.Appointment.Occurrence</td>
    *   </tr>
    *   <tr>
    *     <td>Message items</td>
    *     <td>These include email messages that have the default message class IPM.Note, and meeting requests, responses, and cancellations, that use IPM.Schedule.Meeting as the base message class.</td>
    *     <td>IPM.Note, IPM.Schedule.Meeting.Request, IPM.Schedule.Meeting.Neg, IPM.Schedule.Meeting.Pos, IPM.Schedule.Meeting.Tent, IPM.Schedule.Meeting.Canceled</td>
    *   </tr>
    * </table>
    *
    */
  var itemClass: String = js.native
  
  /**
    * Gets the {@link https://learn.microsoft.com/exchange/client-developer/exchange-web-services/ews-identifiers-in-exchange | Exchange Web Services item identifier}
    * for the current item.
    *
    * The `itemId` property is not available in compose mode.
    * If an item identifier is required, the `saveAsync` method can be used to save the item to the store, which will return the item identifier
    * in the `asyncResult.value` parameter in the callback function.
    *
    * **Note**: The identifier returned by the `itemId` property is the same as the
    * {@link https://learn.microsoft.com/exchange/client-developer/exchange-web-services/ews-identifiers-in-exchange | Exchange Web Services item identifier}.
    * The `itemId` property is not identical to the Outlook Entry ID or the ID used by the Outlook REST API.
    * Before making REST API calls using this value, it should be converted using `Office.context.mailbox.convertToRestId`.
    * For more details, see {@link https://learn.microsoft.com/office/dev/add-ins/outlook/use-rest-api#get-the-item-id | Use the Outlook REST APIs from an Outlook add-in}.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    */
  var itemId: String = js.native
  
  /**
    * Gets the type of item that an instance represents.
    *
    * The `itemType` property returns one of the `ItemType` enumeration values, indicating whether the item object instance is a message or
    * an appointment.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
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
    * This object can be used to get, set, and remove custom properties from the item and save changes to the custom property set back to the server.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    *
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`.
    * @param userContext - Optional. Developers can provide any object they wish to access in the callback function.
    *                    This object can be accessed by the `asyncResult.asyncContext` property in the callback function.
    */
  def loadCustomPropertiesAsync(callback: js.Function1[/* asyncResult */ AsyncResult[CustomProperties], Unit]): Unit = js.native
  def loadCustomPropertiesAsync(callback: js.Function1[/* asyncResult */ AsyncResult[CustomProperties], Unit], userContext: Any): Unit = js.native
  
  /**
    * Gets the location of a meeting request.
    *
    * The `location` property returns a string that contains the location of the appointment.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    */
  var location: String = js.native
  
  /**
    * Gets the subject of an item, with all prefixes removed (including RE: and FWD:).
    *
    * The `normalizedSubject` property gets the subject of the item, with any standard prefixes (such as RE: and FW:) that are added by
    * email programs. To get the subject of the item with the prefixes intact, use the `subject` property.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    */
  var normalizedSubject: String = js.native
  
  /**
    * Gets the notification messages for an item.
    *
    * @remarks
    * [Api set: Mailbox 1.3]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    */
  var notificationMessages: NotificationMessages = js.native
  
  /**
    * Gets the recurrence pattern of an appointment. Gets the recurrence pattern of a meeting request.
    * Read and compose modes for appointment items. Read mode for meeting request items.
    *
    * The `recurrence` property returns a `Recurrence` object for recurring appointments or meetings requests if an item is a series or an instance
    * in a series. `null` is returned for single appointments and meeting requests of single appointments.
    * `undefined` is returned for messages that are not meeting requests.
    *
    * **Note**: Meeting requests have an itemClass value of `IPM.Schedule.Meeting.Request`.
    *
    * **Note**: If the `recurrence` object is null, this indicates that the object is a single appointment or a meeting request of a single appointment
    * and NOT a part of a series.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    */
  var recurrence: Recurrence = js.native
  
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
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
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
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
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
    * Gets the email address of the sender of an email message.
    *
    * The `from` and `sender` properties represent the same person unless the message is sent by a delegate.
    * In that case, the `from` property represents the delegator, and the `sender` property represents the delegate.
    *
    * **Note**: The `recipientType` property of the `EmailAddressDetails` object in the `sender` property is undefined.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    */
  var sender: EmailAddressDetails = js.native
  
  /**
    * Gets the ID of the series that an instance belongs to.
    *
    * In Outlook on the web and desktop clients, the `seriesId` returns the Exchange Web Services (EWS) ID of the parent (series) item
    * that this item belongs to. However, on iOS and Android, the `seriesId` returns the REST ID of the parent item.
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
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    */
  var seriesId: String = js.native
  
  /**
    * Gets the date and time that the appointment is to begin.
    *
    * The `start` property is a `Date` object expressed as a Coordinated Universal Time (UTC) date and time value.
    * You can use the `convertToLocalClientTime` method to convert the value to the client's local date and time.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    */
  var start: js.Date = js.native
  
  /**
    * Gets the description that appears in the subject field of an item.
    *
    * The `subject` property gets or sets the entire subject of the item, as sent by the email server.
    *
    * The `subject` property returns a string. Use the `normalizedSubject` property to get the subject minus any leading prefixes such as RE: and FW:.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    */
  var subject: String = js.native
  
  /**
    * Provides access to the recipients on the **To** line of a message. The type of object and level of access depend on the mode of the
    * current item.
    *
    * The `to` property returns an array that contains an {@link Office.EmailAddressDetails | EmailAddressDetails} object for
    * each recipient listed on the **To** line of the message. Collection size limits:
    *
    * - Windows: 500 members
    *
    * - Classic Mac UI: 100 members
    *
    * - Web browser: 20 members
    *
    * - New Mac UI, Android: No limit
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Message Read
    */
  var to: js.Array[EmailAddressDetails] = js.native
}
