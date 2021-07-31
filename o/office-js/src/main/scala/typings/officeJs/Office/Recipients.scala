package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents recipients of an item. Compose mode only.
  * 
  * [Api set: Mailbox 1.1]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
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
    * - Mac, web browser: 100 recipients
    *
    * - Other: No limit
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    * 
    * **Errors**:
    * 
    * - `NumberOfRecipientsExceeded`: The number of recipients exceeded 100 entries.
    * 
    * @param recipients - The recipients to add to the recipients list.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                 of type `Office.AsyncResult`. If adding the recipients fails, the `asyncResult.error` property will contain an error code.
    */
  def addAsync(recipients: js.Array[String | EmailUser | EmailAddressDetails]): Unit = js.native
  def addAsync(
    recipients: js.Array[String | EmailUser | EmailAddressDetails],
    options: Unit,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
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
    * - Windows, Mac, web browser: 500 members
    *
    * - Other: No limit
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
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
    * - Windows, Mac, web browser: 500 members
    *
    * - Other: No limit
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    * 
    * @param options - An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
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
    * - Windows, Mac, web browser: 100 recipients
    *
    * - Other: No limit
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
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
    * - Windows, Mac, web browser: 100 recipients
    *
    * - Other: No limit
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    * 
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    * 
    * **Errors**:
    * 
    * - `NumberOfRecipientsExceeded`: The number of recipients exceeded 100 entries.
    * 
    * @param recipients - The recipients to add to the recipients list.
    * @param options - An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
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
