package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Api set: Mailbox 1.1]
  *
  * @remarks
  * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
  *
  * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose</td></tr></table>
  */
@js.native
trait Recipients extends js.Object {
  /**
    * Adds a recipient list to the existing recipients for an appointment or message.
    *
    * The recipients parameter can be an array of one of the following:
    *
    * - Strings containing SMTP email addresses
    *
    * - EmailUser objects
    *
    * - EmailAddressDetails objects
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadWriteItem</td></tr>
    *
    * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose</td></tr>
    *
    * <tr><td>Errors</td><td>NumberOfRecipientsExceeded - The number of recipients exceeded 100 entries.</td></tr></table>
    * 
    * In addition to this signature, this method also has the following signatures:
    * 
    * `addAsync(recipients: (string | EmailUser | EmailAddressDetails)[]): void;`
    * 
    * `addAsync(recipients: (string | EmailUser | EmailAddressDetails)[], options: Office.AsyncContextOptions): void;`
    * 
    * `addAsync(recipients: (string | EmailUser | EmailAddressDetails)[], callback: (result: AsyncResult<void>) => void): void;`
    *
    * @param recipients The recipients to add to the recipients list.
    * @param options Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. If adding the recipients fails, the asyncResult.error property will contain an error code.
    */
  def addAsync(recipients: js.Array[java.lang.String | EmailUser | EmailAddressDetails]): scala.Unit = js.native
  /**
    * Adds a recipient list to the existing recipients for an appointment or message.
    *
    * The recipients parameter can be an array of one of the following:
    *
    * - Strings containing SMTP email addresses
    *
    * - {@link Office.EmailUser} objects
    *
    * - {@link Office.EmailAddressDetails} objects
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadWriteItem</td></tr>
    *
    * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose</td></tr>
    *
    * <tr><td>Errors</td><td>NumberOfRecipientsExceeded - The number of recipients exceeded 100 entries.</td></tr></table>
    *
    * @param recipients The recipients to add to the recipients list.
    * @param callback Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. If adding the recipients fails, the asyncResult.error property will contain an error code.
    */
  def addAsync(
    recipients: js.Array[java.lang.String | EmailUser | EmailAddressDetails],
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def addAsync(
    recipients: js.Array[java.lang.String | EmailUser | EmailAddressDetails],
    options: AsyncContextOptions
  ): scala.Unit = js.native
  def addAsync(
    recipients: js.Array[java.lang.String | EmailUser | EmailAddressDetails],
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Gets a recipient list for an appointment or message.
    *
    * When the call completes, the asyncResult.value property will contain an array of {@link Office.EmailAddressDetails} objects.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *
    * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose</td></tr></table>
    *
    * @param callback When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
    *                 The `value` property of the result is an array of EmailAddressDetails objects.
    */
  def getAsync(callback: js.Function1[/* result */ AsyncResult[js.Array[EmailAddressDetails]], scala.Unit]): scala.Unit = js.native
  /**
    * Gets a recipient list for an appointment or message.
    *
    * When the call completes, the asyncResult.value property will contain an array of {@link Office.EmailAddressDetails} objects.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *
    * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose</td></tr></table>
    * 
    * In addition to this signature, this method also has the following signature:
    * 
    * `getAsync(callback: (result: AsyncResult<Office.EmailAddressDetails[]>) => void): void;`
    *
    * @param options An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
    *                 The `value` property of the result is an array of EmailAddressDetails objects.
    */
  def getAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[js.Array[EmailAddressDetails]], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sets a recipient list for an appointment or message.
    *
    * The setAsync method overwrites the current recipient list.
    *
    * The recipients parameter can be an array of one of the following:
    *
    * - Strings containing SMTP email addresses
    *
    * - {@link Office.EmailUser} objects
    *
    * - {@link Office.EmailAddressDetails} objects
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadWriteItem</td></tr>
    *
    * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose</td></tr>
    *
    * <tr><td>Errors</td><td>NumberOfRecipientsExceeded - The number of recipients exceeded 100 entries.</td></tr></table>
    * 
    * In addition to this signature, this method also has the following signatures:
    * 
    * `setAsync(recipients: (string | EmailUser | EmailAddressDetails)[]): void;`
    * 
    * `setAsync(recipients: (string | EmailUser | EmailAddressDetails)[], options: Office.AsyncContextOptions): void;`
    * 
    * `setAsync(recipients: (string | EmailUser | EmailAddressDetails)[], callback: (result: AsyncResult<void>) => void): void;`
    *
    * @param recipients The recipients to add to the recipients list.
    * @param options Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
    *                 If setting the recipients fails the asyncResult.error property will contain a code that indicates any error that occurred 
    *                 while adding the data.
    */
  def setAsync(recipients: js.Array[java.lang.String | EmailUser | EmailAddressDetails]): scala.Unit = js.native
  /**
    * Sets a recipient list for an appointment or message.
    *
    * The setAsync method overwrites the current recipient list.
    *
    * The recipients parameter can be an array of one of the following:
    *
    * - Strings containing SMTP email addresses
    *
    * - {@link Office.EmailUser} objects
    *
    * - {@link Office.EmailAddressDetails} objects
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadWriteItem</td></tr>
    *
    * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose</td></tr>
    *
    * <tr><td>Errors</td><td>NumberOfRecipientsExceeded - The number of recipients exceeded 100 entries.</td></tr></table>
    *
    * @param recipients The recipients to add to the recipients list.
    * @param callback Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. 
    *                 If setting the recipients fails the asyncResult.error property will contain a code that indicates any error that occurred 
    *                 while adding the data.
    */
  def setAsync(
    recipients: js.Array[java.lang.String | EmailUser | EmailAddressDetails],
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def setAsync(
    recipients: js.Array[java.lang.String | EmailUser | EmailAddressDetails],
    options: AsyncContextOptions
  ): scala.Unit = js.native
  def setAsync(
    recipients: js.Array[java.lang.String | EmailUser | EmailAddressDetails],
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
}

