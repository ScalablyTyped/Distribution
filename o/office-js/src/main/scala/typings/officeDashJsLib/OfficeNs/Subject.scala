package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods to get and set the subject of an appointment or message in an Outlook add-in.
  *
  * [Api set: Mailbox 1.1]
  *
  * @remarks
  * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
  *
  * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose</td></tr></table>
  */
@js.native
trait Subject extends js.Object {
  /**
    * Gets the subject of an appointment or message.
    * 
    * The getAsync method starts an asynchronous call to the Exchange server to get the subject of an appointment or message.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *
    * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose</td></tr></table>
    *
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of type Office.AsyncResult.
    *                  The `value` property of the result is the subject of the item.
    */
  def getAsync(callback: js.Function1[/* result */ AsyncResult[java.lang.String], scala.Unit]): scala.Unit = js.native
  /**
    * Gets the subject of an appointment or message.
    *
    * The getAsync method starts an asynchronous call to the Exchange server to get the subject of an appointment or message.
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
    * `getAsync(callback: (result: Office.AsyncResult<string>) => void): void;`
    *
    * @param options - An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
    *                 The `value` property of the result is the subject of the item.
    */
  def getAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sets the subject of an appointment or message.
    *
    * The setAsync method starts an asynchronous call to the Exchange server to set the subject of an appointment or message. 
    * Setting the subject overwrites the current subject, but leaves any prefixes, such as "Fwd:" or "Re:" in place.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *
    * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose</td></tr>
    *
    * <tr><td>Errors</td><td>DataExceedsMaximumSize - The subject parameter is longer than 255 characters.</td></tr></table>
    *
    * @param subject - The subject of the appointment or message. The string is limited to 255 characters.
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. If setting the subject fails, the asyncResult.error property will contain an error code.
    */
  def setAsync(data: java.lang.String, callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]): scala.Unit = js.native
  /**
    * Sets the subject of an appointment or message.
    *
    * The setAsync method starts an asynchronous call to the Exchange server to set the subject of an appointment or message. 
    * Setting the subject overwrites the current subject, but leaves any prefixes, such as "Fwd:" or "Re:" in place.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *
    * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose</td></tr>
    *
    * <tr><td>Errors</td><td>DataExceedsMaximumSize - The subject parameter is longer than 255 characters.</td></tr></table>
    * 
    * In addition to this signature, this method also has the following signatures:
    * 
    * `setAsync(subject: string): void;`
    * 
    * `setAsync(subject: string, options: Office.AsyncContextOptions): void;`
    * 
    * `setAsync(subject: string, callback: (result: Office.AsyncResult<void>) => void): void;`
    *
    * @param subject - The subject of the appointment or message. The string is limited to 255 characters.
    * @param options - An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. If setting the subject fails, the asyncResult.error property will contain an error code.
    */
  /**
    * Sets the subject of an appointment or message.
    *
    * The setAsync method starts an asynchronous call to the Exchange server to set the subject of an appointment or message. 
    * Setting the subject overwrites the current subject, but leaves any prefixes, such as "Fwd:" or "Re:" in place.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *
    * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose</td></tr>
    *
    * <tr><td>Errors</td><td>DataExceedsMaximumSize - The subject parameter is longer than 255 characters.</td></tr></table>
    *
    * @param subject - The subject of the appointment or message. The string is limited to 255 characters.
    */
  def setAsync(subject: java.lang.String): scala.Unit = js.native
  /**
    * Sets the subject of an appointment or message.
    *
    * The setAsync method starts an asynchronous call to the Exchange server to set the subject of an appointment or message. 
    * Setting the subject overwrites the current subject, but leaves any prefixes, such as "Fwd:" or "Re:" in place.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *
    * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose</td></tr>
    *
    * <tr><td>Errors</td><td>DataExceedsMaximumSize - The subject parameter is longer than 255 characters.</td></tr></table>
    *
    * @param subject - The subject of the appointment or message. The string is limited to 255 characters.
    * @param options - An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    */
  def setAsync(subject: java.lang.String, options: AsyncContextOptions): scala.Unit = js.native
  def setAsync(
    subject: java.lang.String,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
}

