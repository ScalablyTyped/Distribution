package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents recipients of an item. Compose mode only.
  *
  * @remarks
  * [Api set: Mailbox 1.1]
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
  */
@js.native
trait Recipients extends StObject {
  
  /**
    * Adds a recipient list to the existing recipients for an appointment or message.
    *
    * The recipients parameter can be an array of one of the following:
    *
    * - Strings containing SMTP email addresses
    *
    * - {@link Office.EmailUser | EmailUser} objects
    *
    * - {@link Office.EmailAddressDetails | EmailAddressDetails} objects
    *
    * Maximum number that can be added:
    *
    * - Windows: 100 recipients.
    * **Note**: Can call API repeatedly but the maximum number of recipients in the target field on the item is 500 recipients.
    *
    * - Classic Mac UI, web browser: 100 recipients
    *
    * - New Mac UI, Android: No limit
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * **Errors**:
    *
    * - `NumberOfRecipientsExceeded`: The number of recipients exceeded 100 entries.
    *
    * @param recipients - The recipients to add to the recipients list.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                 of type `Office.AsyncResult`. If adding the recipients fails, the `asyncResult.error` property will contain an error code.
    */
  def addAsync(recipients: js.Array[String | EmailUser | EmailAddressDetails]): Unit = js.native
  def addAsync(
    recipients: js.Array[String | EmailUser | EmailAddressDetails],
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  /**
    * Adds a recipient list to the existing recipients for an appointment or message.
    *
    * The recipients parameter can be an array of one of the following:
    *
    * - Strings containing SMTP email addresses
    *
    * - {@link Office.EmailUser | EmailUser} objects
    *
    * - {@link Office.EmailAddressDetails | EmailAddressDetails} objects
    *
    * Maximum number that can be added:
    *
    * - Windows: 100 recipients.
    * **Note**: Can call API repeatedly but the maximum number of recipients in the target field on the item is 500 recipients.
    *
    * - Classic Mac UI, web browser: 100 recipients
    *
    * - New Mac UI, Android: No limit
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * **Errors**:
    *
    * - `NumberOfRecipientsExceeded`: The number of recipients exceeded 100 entries.
    *
    * @param recipients - The recipients to add to the recipients list.
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                 of type `Office.AsyncResult`. If adding the recipients fails, the `asyncResult.error` property will contain an error code.
    */
  def addAsync(recipients: js.Array[String | EmailUser | EmailAddressDetails], options: AsyncContextOptions): Unit = js.native
  def addAsync(
    recipients: js.Array[String | EmailUser | EmailAddressDetails],
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  
  /**
    * Gets a recipient list for an appointment or message.
    *
    * When the call completes, the `asyncResult.value` property will contain an array of {@link Office.EmailAddressDetails | EmailAddressDetails}
    * objects. Collection size limits:
    *
    * - Windows, classic Mac UI, web browser: 500 members
    *
    * - New Mac UI, Android: No limit
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * **Important**: In Outlook on the web and on Windows, if a user creates a new message by activating a contact's email address link from their contact
    * or profile card, your add-in's `Recipients.getAsync` call returns the contact's email address in the `displayName` property of the associated
    * `EmailAddressDetails` object instead of the contact's saved name. For more details, refer to the
    * {@link https://github.com/OfficeDev/office-js/issues/2201 | related GitHub issue}.
    * 
    * **Important**: The `getAsync` method only returns recipients resolved by the Outlook client. A resolved recipient has the following characteristics.
    * 
    * - If the recipient has a saved entry in the sender's address book, Outlook resolves the email address to the recipient's saved display name.
    * 
    * - A Teams meeting status icon appears before the recipient's name or email address.
    * 
    * - A semicolon appears after the recipient's name or email address.
    * 
    * - The recipient's name or email address is underlined or enclosed in a box.
    * 
    * To resolve an email address once it's added to a mail item, the sender must use the **Tab** key or select a suggested contact or email address from 
    * the auto-complete list.
    *
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                 of type `Office.AsyncResult`. The `value` property of the result is an array of `EmailAddressDetails` objects.
    */
  def getAsync(callback: js.Function1[/* asyncResult */ AsyncResult[js.Array[EmailAddressDetails]], Unit]): Unit = js.native
  /**
    * Gets a recipient list for an appointment or message.
    *
    * When the call completes, the `asyncResult.value` property will contain an array of {@link Office.EmailAddressDetails | EmailAddressDetails}
    * objects. Collection size limits:
    *
    * - Windows, classic Mac UI, web browser: 500 members
    *
    * - New Mac UI, Android: No limit
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    * 
    * **Important**: In Outlook on the web and on Windows, if a user creates a new message by activating a contact's email address link from their contact
    * or profile card, your add-in's `Recipients.getAsync` call returns the contact's email address in the `displayName` property of the associated
    * `EmailAddressDetails` object instead of the contact's saved name. For more details, refer to the
    * {@link https://github.com/OfficeDev/office-js/issues/2201 | related GitHub issue}.
    * 
    * **Important**: The `getAsync` method only returns recipients resolved by the Outlook client. A resolved recipient has the following characteristics.
    * 
    * - If the recipient has a saved entry in the sender's address book, Outlook resolves the email address to the recipient's saved display name.
    * 
    * - A Teams meeting status icon appears before the recipient's name or email address.
    * 
    * - A semicolon appears after the recipient's name or email address.
    * 
    * - The recipient's name or email address is underlined or enclosed in a box.
    * 
    * To resolve an email address once it's added to a mail item, the sender must use the **Tab** key or select a suggested contact or email address from 
    * the auto-complete list.
    *
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                 of type `Office.AsyncResult`. The `value` property of the result is an array of `EmailAddressDetails` objects.
    */
  def getAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[js.Array[EmailAddressDetails]], Unit]
  ): Unit = js.native
  
  /**
    * Sets a recipient list for an appointment or message.
    *
    * The `setAsync` method overwrites the current recipient list.
    *
    * The recipients parameter can be an array of one of the following:
    *
    * - Strings containing SMTP email addresses
    *
    * - {@link Office.EmailUser | EmailUser} objects
    *
    * - {@link Office.EmailAddressDetails | EmailAddressDetails} objects
    *
    * Maximum number that can be set:
    *
    * - Windows: 100 recipients.
    * **Note**: Can call API repeatedly but the maximum number of recipients in the target field on the item is 500 recipients.
    *
    * - Classic Mac UI, web browser: 100 recipients
    *
    * - New Mac UI, Android: No limit
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * **Errors**:
    *
    * - `NumberOfRecipientsExceeded`: The number of recipients exceeded 100 entries.
    *
    * @param recipients - The recipients to add to the recipients list.
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`. If setting the recipients fails the `asyncResult.error` property will contain a code that
    *                 indicates any error that occurred while adding the data.
    */
  def setAsync(
    recipients: js.Array[String | EmailUser | EmailAddressDetails],
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  /**
    * Sets a recipient list for an appointment or message.
    *
    * The `setAsync` method overwrites the current recipient list.
    *
    * The recipients parameter can be an array of one of the following:
    *
    * - Strings containing SMTP email addresses
    *
    * - {@link Office.EmailUser | EmailUser} objects
    *
    * - {@link Office.EmailAddressDetails | EmailAddressDetails} objects
    *
    * Maximum number that can be set:
    *
    * - Windows: 100 recipients.
    * **Note**: Can call API repeatedly but the maximum number of recipients in the target field on the item is 500 recipients.
    *
    * - Classic Mac UI, web browser: 100 recipients
    *
    * - New Mac UI, Android: No limit
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * **Errors**:
    *
    * - `NumberOfRecipientsExceeded`: The number of recipients exceeded 100 entries.
    *
    * @param recipients - The recipients to add to the recipients list.
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`. If setting the recipients fails the `asyncResult.error` property will contain a code that
    *                 indicates any error that occurred while adding the data.
    */
  def setAsync(
    recipients: js.Array[String | EmailUser | EmailAddressDetails],
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
}
