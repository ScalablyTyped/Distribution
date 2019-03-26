package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The message read mode of {@link Office.Item | Office.context.mailbox.item}.
  * 
  * **Important**: This is an internal Outlook object, not directly exposed through existing interfaces. 
  * You should treat this as a mode of Office.context.mailbox.item. Refer to the
  * {@link https://docs.microsoft.com/office/dev/add-ins/reference/objectmodel/preview-requirement-set/office.context.mailbox.item | Object Model} page for more information.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- officeDashJsDashPreviewLib.OfficeNs.ItemRead because var conflicts: body, itemType, notificationMessages, seriesId. Inlined attachments, itemClass, itemId, normalizedSubject, subject, displayReplyAllForm, displayReplyAllForm, displayReplyAllForm, displayReplyAllForm, displayReplyForm, displayReplyForm, displayReplyForm, displayReplyForm, getEntities, getEntitiesByType, getFilteredEntitiesByName, getRegExMatches, getRegExMatchesByName, getSelectedEntities, getSelectedRegExMatches */ @js.native
trait MessageRead extends Message {
  /**
    * Gets the item's attachments as an array.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Message Read</td></tr>
    * </table>
    * 
    * **Note**: Certain types of files are blocked by Outlook due to potential security issues and are therefore not returned. 
    * For more information, see 
    * {@link https://support.office.com/article/Blocked-attachments-in-Outlook-434752E1-02D3-4E90-9124-8B81E49A8519 | Blocked attachments in Outlook}.
    *
    */
  var attachments: js.Array[AttachmentDetails] = js.native
  /**
    * Provides access to the Cc (carbon copy) recipients of a message. The type of object and level of access depends on the mode of the 
    * current item.
    *
    * The cc property returns an array that contains an EmailAddressDetails object for each recipient listed on the Cc line of the message. 
    * The collection is limited to a maximum of 100 members.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Message Read</td></tr>
    * </table>
    */
  var cc: js.Array[EmailAddressDetails] = js.native
  /**
    * Gets the date and time that an item was created.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Message Read</td></tr>
    * </table>
    */
  var dateTimeCreated: stdLib.Date = js.native
  /**
    * Gets the date and time that an item was last modified.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Message Read</td></tr>
    * </table>
    *
    * **Note**: This member is not supported in Outlook for iOS or Outlook for Android.
    */
  var dateTimeModified: stdLib.Date = js.native
  /**
    * Gets the email address of the sender of a message.
    *
    * The from and sender properties represent the same person unless the message is sent by a delegate. 
    * In that case, the from property represents the delegator, and the sender property represents the delegate.
    *
    * **Note**: The recipientType property of the EmailAddressDetails object in the from property is undefined.
    * 
    * The from property returns an EmailAddressDetails object.
    * 
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Message Read</td></tr>
    * </table>
    */
  var from: EmailAddressDetails = js.native
  /**
    * Gets the internet headers of a message.
    * 
    * The internetHeaders property returns an InternetHeaders object that provides methods to manage the internet headers on the message.
    *
    * [Api set: Mailbox Preview]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Message Read</td></tr>
    * </table>
    * 
    * @beta
    */
  var internetHeaders: InternetHeaders = js.native
  /**
    * Gets the Internet message identifier for an email message.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Message Read</td></tr>
    * </table>
    */
  var internetMessageId: java.lang.String = js.native
  /**
    * Gets the Exchange Web Services item class of the selected item.
    * 
    * You can create custom message classes that extends a default message class, for example, a custom appointment message class 
    * IPM.Appointment.Contoso.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    * 
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Message Read</td></tr>
    * </table>
  		 
    * The itemClass property specifies the message class of the selected item. 
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
    *     <td>IPM.Appointment,IPM.Appointment.Occurrence</td>
    *   </tr>
    *   <tr>
    *     <td>Message items</td>
    *     <td>These include email messages that have the default message class IPM.Note, and meeting requests, responses, and cancellations, that use IPM.Schedule.Meeting as the base message class.</td>
    *     <td>IPM.Note,IPM.Schedule.Meeting.Request,IPM.Schedule.Meeting.Neg,IPM.Schedule.Meeting.Pos,IPM.Schedule.Meeting.Tent,IPM.Schedule.Meeting.Canceled</td>
    *   </tr>
    * </table>
    * 
    */
  var itemClass: java.lang.String = js.native
  /**
    * Gets the Exchange Web Services item identifier for the current item.
    *
    * The itemId property is not available in compose mode. 
    * If an item identifier is required, the saveAsync method can be used to save the item to the store, which will return the item identifier 
    * in the asyncResult.value parameter in the callback function.
    *
    * **Note**: The identifier returned by the itemId property is the same as the Exchange Web Services item identifier. 
    * The itemId property is not identical to the Outlook Entry ID or the ID used by the Outlook REST API. 
    * Before making REST API calls using this value, it should be converted using Office.context.mailbox.convertToRestId. 
    * For more details, see {@link https://docs.microsoft.com/outlook/add-ins/use-rest-api#get-the-item-id | Use the Outlook REST APIs from an Outlook add-in}.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Message Read</td></tr>
    * </table>
    */
  var itemId: java.lang.String = js.native
  /**
    * Gets the subject of an item, with all prefixes removed (including RE: and FWD:).
    *
    * The normalizedSubject property gets the subject of the item, with any standard prefixes (such as RE: and FW:) that are added by 
    * email programs. 
    * To get the subject of the item with the prefixes intact, use the subject property.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Message Read</td></tr>
    * </table>
    */
  var normalizedSubject: java.lang.String = js.native
  /**
    * Gets the recurrence pattern of an appointment. Gets the recurrence pattern of a meeting request. 
    * Read and compose modes for appointment items. Read mode for meeting request items.
    * 
    * The recurrence property returns a recurrence object for recurring appointments or meetings requests if an item is a series or an instance 
    * in a series. `null` is returned for single appointments and meeting requests of single appointments. 
    * `undefined` is returned for messages that are not meeting requests.
    * 
    * **Note**: Meeting requests have an itemClass value of IPM.Schedule.Meeting.Request.
    * 
    * **Note**: If the recurrence object is null, this indicates that the object is a single appointment or a meeting request of a single appointment 
    * and NOT a part of a series.
    * 
    * [Api set: Mailbox 1.7]
    * 
    * @remarks
    * 
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Message Read</td></tr>
    * </table>
    */
  var recurrence: Recurrence = js.native
  /**
    * Gets the email address of the sender of an email message.
    *
    * The from and sender properties represent the same person unless the message is sent by a delegate. 
    * In that case, the from property represents the delegator, and the sender property represents the delegate.
    *
    * **Note**: The recipientType property of the EmailAddressDetails object in the sender property is undefined.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Message Read</td></tr>
    * </table>
    */
  var sender: EmailAddressDetails = js.native
  /**
    * Gets the description that appears in the subject field of an item.
    *
    * The subject property gets or sets the entire subject of the item, as sent by the email server.
    *
    * The subject property returns a string. Use the normalizedSubject property to get the subject minus any leading prefixes such as RE: and FW:.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Message Read</td></tr>
    * </table>
    */
  var subject: java.lang.String = js.native
  /**
    * Provides access to the recipients on the To line of a message. The type of object and level of access depends on the mode of the 
    * current item.
    *
    * The to property returns an array that contains an EmailAddressDetails object for each recipient listed on the To line of the message. 
    * The collection is limited to a maximum of 100 members.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Message Read</td></tr>
    * </table>
    */
  var to: js.Array[EmailAddressDetails] = js.native
  /**
    * Displays a reply form that includes the sender and all recipients of the selected message or the organizer and all attendees of the 
    * selected appointment.
    *
    * In Outlook Web App, the reply form is displayed as a pop-out form in the 3-column view and a pop-up form in the 2- or 1-column view.
    *
    * If any of the string parameters exceed their limits, displayReplyAllForm throws an exception.
    *
    * When attachments are specified in the formData.attachments parameter, Outlook and Outlook Web App attempt to download all attachments and 
    * attach them to the reply form. If any attachments fail to be added, an error is shown in the form UI. 
    * If this isn't possible, then no error message is thrown.
    *
    * **Note**: This method is not supported in Outlook for iOS or Outlook for Android.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Message Read</td></tr>
    * </table>
    *
    * @param formData - A string that contains text and HTML and that represents the body of the reply form. The string is limited to 32 KB
    *                   OR an {@link Office.ReplyFormData} object that contains body or attachment data and a callback function.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter, 
    *                asyncResult, which is an Office.AsyncResult object.
    */
  /**
    * Displays a reply form that includes the sender and all recipients of the selected message or the organizer and all attendees of the 
    * selected appointment.
    *
    * In Outlook Web App, the reply form is displayed as a pop-out form in the 3-column view and a pop-up form in the 2- or 1-column view.
    *
    * If any of the string parameters exceed their limits, displayReplyAllForm throws an exception.
    *
    * When attachments are specified in the formData.attachments parameter, Outlook and Outlook Web App attempt to download all attachments and 
    * attach them to the reply form. If any attachments fail to be added, an error is shown in the form UI. 
    * If this isn't possible, then no error message is thrown.
    *
    * **Note**: This method is not supported in Outlook for iOS or Outlook for Android.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Read</td></tr>
    * </table>
    *
    * @param formData - A string that contains text and HTML and that represents the body of the reply form. The string is limited to 32 KB
    *                   OR an {@link Office.ReplyFormData} object that contains body or attachment data and a callback function.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter, 
    *                asyncResult, which is an Office.AsyncResult object.
    */
  def displayReplyAllForm(formData: java.lang.String): scala.Unit = js.native
  def displayReplyAllForm(
    formData: java.lang.String,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def displayReplyAllForm(formData: ReplyFormData): scala.Unit = js.native
  def displayReplyAllForm(
    formData: ReplyFormData,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Displays a reply form that includes only the sender of the selected message or the organizer of the selected appointment.
    *
    * In Outlook Web App, the reply form is displayed as a pop-out form in the 3-column view and a pop-up form in the 2- or 1-column view.
    *
    * If any of the string parameters exceed their limits, displayReplyForm throws an exception.
    *
    * When attachments are specified in the formData.attachments parameter, Outlook and Outlook Web App attempt to download all attachments and 
    * attach them to the reply form. If any attachments fail to be added, an error is shown in the form UI. 
    * If this isn't possible, then no error message is thrown.
    *
    * **Note**: This method is not supported in Outlook for iOS or Outlook for Android.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Message Read</td></tr>
    * </table>
    *
    * @param formData - A string that contains text and HTML and that represents the body of the reply form. The string is limited to 32 KB
    *                   OR an {@link Office.ReplyFormData} object that contains body or attachment data and a callback function.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter, 
    *                asyncResult, which is an Office.AsyncResult object.
    */
  /**
    * Displays a reply form that includes only the sender of the selected message or the organizer of the selected appointment.
    *
    * In Outlook Web App, the reply form is displayed as a pop-out form in the 3-column view and a pop-up form in the 2- or 1-column view.
    *
    * If any of the string parameters exceed their limits, displayReplyForm throws an exception.
    *
    * When attachments are specified in the formData.attachments parameter, Outlook and Outlook Web App attempt to download all attachments and 
    * attach them to the reply form. If any attachments fail to be added, an error is shown in the form UI. 
    * If this isn't possible, then no error message is thrown.
    *
    * **Note**: This method is not supported in Outlook for iOS or Outlook for Android.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Read/td></tr>
    * </table>
    *
    * @param formData - A string that contains text and HTML and that represents the body of the reply form. The string is limited to 32 KB
    *                   OR an {@link Office.ReplyFormData} object that contains body or attachment data and a callback function.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter, 
    *                asyncResult, which is an Office.AsyncResult object.
    */
  def displayReplyForm(formData: java.lang.String): scala.Unit = js.native
  def displayReplyForm(
    formData: java.lang.String,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def displayReplyForm(formData: ReplyFormData): scala.Unit = js.native
  def displayReplyForm(
    formData: ReplyFormData,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Gets the entities found in the selected item's body.
    *
    * **Note**: This method is not supported in Outlook for iOS or Outlook for Android.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Message Read</td></tr>
    * </table>
    */
  /**
    * Gets the entities found in the selected item's body.
    *
    * **Note**: This method is not supported in Outlook for iOS or Outlook for Android.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Read</td></tr>
    * </table>
    */
  def getEntities(): Entities = js.native
  /**
    * Gets an array of all the entities of the specified entity type found in the selected item's body.
    *
    * **Note**: This method is not supported in Outlook for iOS or Outlook for Android.
    *
    * [Api set: Mailbox 1.0]
    *
    * @param entityType - One of the EntityType enumeration values.
    * 
    * @returns
    * If the value passed in entityType is not a valid member of the EntityType enumeration, the method returns null. 
    * If no entities of the specified type are present in the item's body, the method returns an empty array. 
    * Otherwise, the type of the objects in the returned array depends on the type of entity requested in the entityType parameter.
    *
    * @remarks
    * 
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>Restricted</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Message Read</td></tr>
    * </table>
    * 
    * While the minimum permission level to use this method is Restricted, some entity types require ReadItem to access, as specified in the 
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
  /**
    * Gets an array of all the entities of the specified entity type found in the selected item's body.
    *
    * **Note**: This method is not supported in Outlook for iOS or Outlook for Android.
    *
    * [Api set: Mailbox 1.0]
    * 
    * @param entityType - One of the EntityType enumeration values.
    *
    * @returns
    * If the value passed in entityType is not a valid member of the EntityType enumeration, the method returns null. 
    * If no entities of the specified type are present in the item's body, the method returns an empty array. 
    * Otherwise, the type of the objects in the returned array depends on the type of entity requested in the entityType parameter.
    *
    * @remarks
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>Restricted</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Read</td></tr>
    </table>
    * 
    * While the minimum permission level to use this method is Restricted, some entity types require ReadItem to access, as specified in the 
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
  def getEntitiesByType(entityType: officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.EntityType): js.Array[java.lang.String | Contact | MeetingSuggestion | PhoneNumber | TaskSuggestion] = js.native
  /**
    * Returns well-known entities in the selected item that pass the named filter defined in the manifest XML file.
    *
    * The getFilteredEntitiesByName method returns the entities that match the regular expression defined in the ItemHasKnownEntity rule element 
    * in the manifest XML file with the specified FilterName element value.
    *
    * **Note**: This method is not supported in Outlook for iOS or Outlook for Android.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Message Read</td></tr>
    * </table>
    *
    * @param name - The name of the ItemHasKnownEntity rule element that defines the filter to match.
    * @returns If there is no ItemHasKnownEntity element in the manifest with a FilterName element value that matches the name parameter, 
    * the method returns null. 
    * If the name parameter does match an ItemHasKnownEntity element in the manifest, but there are no entities in the current item that match, 
    * the method return an empty array.
    */
  /**
    * Returns well-known entities in the selected item that pass the named filter defined in the manifest XML file.
    *
    * The getFilteredEntitiesByName method returns the entities that match the regular expression defined in the ItemHasKnownEntity rule element 
    * in the manifest XML file with the specified FilterName element value.
    *
    * **Note**: This method is not supported in Outlook for iOS or Outlook for Android.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Read</td></tr>
    * </table>
    *
    * @param name - The name of the ItemHasKnownEntity rule element that defines the filter to match.
    * @returns If there is no ItemHasKnownEntity element in the manifest with a FilterName element value that matches the name parameter, 
    * the method returns null. 
    * If the name parameter does match an ItemHasKnownEntity element in the manifest, but there are no entities in the current item that match, 
    * the method return an empty array.
    */
  def getFilteredEntitiesByName(name: java.lang.String): js.Array[java.lang.String | Contact | MeetingSuggestion | PhoneNumber | TaskSuggestion] = js.native
  /**
    * Returns string values in the selected item that match the regular expressions defined in the manifest XML file.
    *
    * The getRegExMatches method returns the strings that match the regular expression defined in each ItemHasRegularExpressionMatch or 
    * ItemHasKnownEntity rule element in the manifest XML file. 
    * For an ItemHasRegularExpressionMatch rule, a matching string has to occur in the property of the item that is specified by that rule. 
    * The PropertyName simple type defines the supported properties.
    *
    * If you specify an ItemHasRegularExpressionMatch rule on the body property of an item, the regular expression should further filter the body 
    * and should not attempt to return the entire body of the item. 
    * Using a regular expression such as .* to obtain the entire body of an item does not always return the expected results. 
    * Instead, use the Body.getAsync method to retrieve the entire body.
    *
    * **Note**: This method is not supported in Outlook for iOS or Outlook for Android.
    *
    * [Api set: Mailbox 1.0]
    *
    * @returns
    * An object that contains arrays of strings that match the regular expressions defined in the manifest XML file. 
    * The name of each array is equal to the corresponding value of the RegExName attribute of the matching ItemHasRegularExpressionMatch rule 
    * or the FilterName attribute of the matching ItemHasKnownEntity rule.
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Message Read</td></tr>
    * </table>
    */
  /**
    * Returns string values in the selected item that match the regular expressions defined in the manifest XML file.
    *
    * The getRegExMatches method returns the strings that match the regular expression defined in each ItemHasRegularExpressionMatch or 
    * ItemHasKnownEntity rule element in the manifest XML file. 
    * For an ItemHasRegularExpressionMatch rule, a matching string has to occur in the property of the item that is specified by that rule. 
    * The PropertyName simple type defines the supported properties.
    *
    * If you specify an ItemHasRegularExpressionMatch rule on the body property of an item, the regular expression should further filter the body 
    * and should not attempt to return the entire body of the item. 
    * Using a regular expression such as .* to obtain the entire body of an item does not always return the expected results. 
    * Instead, use the Body.getAsync method to retrieve the entire body.
    *
    * **Note**: This method is not supported in Outlook for iOS or Outlook for Android.
    *
    * [Api set: Mailbox 1.0]
    *
    * @returns
    * An object that contains arrays of strings that match the regular expressions defined in the manifest XML file. 
    * The name of each array is equal to the corresponding value of the RegExName attribute of the matching ItemHasRegularExpressionMatch rule 
    * or the FilterName attribute of the matching ItemHasKnownEntity rule.
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Read</td></tr>
    * </table>
    */
  def getRegExMatches(): js.Any = js.native
  /**
    * Returns string values in the selected item that match the named regular expression defined in the manifest XML file.
    *
    * The getRegExMatchesByName method returns the strings that match the regular expression defined in the ItemHasRegularExpressionMatch rule 
    * element in the manifest XML file with the specified RegExName element value.
    *
    * If you specify an ItemHasRegularExpressionMatch rule on the body property of an item, the regular expression should further filter the body 
    * and should not attempt to return the entire body of the item. 
    * Using a regular expression such as .* to obtain the entire body of an item does not always return the expected results.
    *
    * **Note**: This method is not supported in Outlook for iOS or Outlook for Android.
    *
    * [Api set: Mailbox 1.0]
    *
    * @returns
    * An array that contains the strings that match the regular expression defined in the manifest XML file.
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Message Read</td></tr>
    * </table>
    *
    * @param name - The name of the ItemHasRegularExpressionMatch rule element that defines the filter to match.
    */
  /**
    * Returns string values in the selected item that match the named regular expression defined in the manifest XML file.
    *
    * The getRegExMatchesByName method returns the strings that match the regular expression defined in the ItemHasRegularExpressionMatch rule 
    * element in the manifest XML file with the specified RegExName element value.
    *
    * If you specify an ItemHasRegularExpressionMatch rule on the body property of an item, the regular expression should further filter the body 
    * and should not attempt to return the entire body of the item. 
    * Using a regular expression such as .* to obtain the entire body of an item does not always return the expected results.
    *
    * **Note**: This method is not supported in Outlook for iOS or Outlook for Android.
    *
    * [Api set: Mailbox 1.0]
    *
    * @returns
    * An array that contains the strings that match the regular expression defined in the manifest XML file.
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Read</td></tr>
    * </table>
    *
    * @param name - The name of the ItemHasRegularExpressionMatch rule element that defines the filter to match.
    */
  def getRegExMatchesByName(name: java.lang.String): js.Array[java.lang.String] = js.native
  /**
    * Gets the entities found in a highlighted match a user has selected. Highlighted matches apply to contextual add-ins.
    *
    * **Note**: This method is not supported in Outlook for iOS or Outlook for Android.
    *
    * [Api set: Mailbox 1.6]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Message Read</td></tr>
    * </table>
    *
    * @param name - The name of the ItemHasRegularExpressionMatch rule element that defines the filter to match.
    */
  /**
    * Gets the entities found in a highlighted match a user has selected. Highlighted matches apply to contextual add-ins.
    *
    * **Note**: This method is not supported in Outlook for iOS or Outlook for Android.
    *
    * [Api set: Mailbox 1.6]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Read</td></tr>
    * </table>
    *
    * @param name - The name of the ItemHasRegularExpressionMatch rule element that defines the filter to match.
    */
  def getSelectedEntities(): Entities = js.native
  /**
    * Returns string values in a highlighted match that match the regular expressions defined in the manifest XML file. 
    * Highlighted matches apply to contextual add-ins.
    *
    * The getSelectedRegExMatches method returns the strings that match the regular expression defined in each ItemHasRegularExpressionMatch or 
    * ItemHasKnownEntity rule element in the manifest XML file. 
    * For an ItemHasRegularExpressionMatch rule, a matching string has to occur in the property of the item that is specified by that rule. 
    * The PropertyName simple type defines the supported properties.
    *
    * If you specify an ItemHasRegularExpressionMatch rule on the body property of an item, the regular expression should further filter the body 
    * and should not attempt to return the entire body of the item. 
    * Using a regular expression such as .* to obtain the entire body of an item does not always return the expected results. 
    * Instead, use the Body.getAsync method to retrieve the entire body.
    *
    * **Note**: This method is not supported in Outlook for iOS or Outlook for Android.
    *
    * [Api set: Mailbox 1.6]
    *
    * @returns
    * An object that contains arrays of strings that match the regular expressions defined in the manifest XML file. 
    * The name of each array is equal to the corresponding value of the RegExName attribute of the matching ItemHasRegularExpressionMatch rule or 
    * the FilterName attribute of the matching ItemHasKnownEntity rule.
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Message Read</td></tr>
    * </table>
    */
  /**
    * Returns string values in a highlighted match that match the regular expressions defined in the manifest XML file. 
    * Highlighted matches apply to contextual add-ins.
    *
    * The getSelectedRegExMatches method returns the strings that match the regular expression defined in each ItemHasRegularExpressionMatch or 
    * ItemHasKnownEntity rule element in the manifest XML file. For an ItemHasRegularExpressionMatch rule, a matching string has to occur in the property of the item that is specified by that rule. The PropertyName simple type defines the supported properties.
    *
    * If you specify an ItemHasRegularExpressionMatch rule on the body property of an item, the regular expression should further filter the body 
    * and should not attempt to return the entire body of the item. 
    * Using a regular expression such as .* to obtain the entire body of an item does not always return the expected results. 
    * Instead, use the Body.getAsync method to retrieve the entire body.
    *
    * **Note**: This method is not supported in Outlook for iOS or Outlook for Android.
    *
    * [Api set: Mailbox 1.6]
    *
    * @returns
    * An object that contains arrays of strings that match the regular expressions defined in the manifest XML file. 
    * The name of each array is equal to the corresponding value of the RegExName attribute of the matching ItemHasRegularExpressionMatch rule 
    * or the FilterName attribute of the matching ItemHasKnownEntity rule.
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Read</td></tr>
    * </table>
    */
  def getSelectedRegExMatches(): js.Any = js.native
}

