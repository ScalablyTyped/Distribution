package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a method to get the from value of a message in an Outlook add-in.
  * 
  * [Api set: Mailbox 1.7]
  * 
  * @remarks
  * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
  * 
  * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose</td></tr></table>
  */
@js.native
trait From extends js.Object {
  /**
    * Gets the from value of a message.
    * 
    * The getAsync method starts an asynchronous call to the Exchange server to get the from value of a message.
    * 
    * The from value of the item is provided as an {@link Office.EmailAddressDetails} in the asyncResult.value property.
    * 
    * [Api set: Mailbox 1.7]
    * 
    * @remarks
    * 
    * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    * 
    * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose</td></tr></table>
    * 
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter, asyncResult, which is an Office.AsyncResult object.
    *                  The `value` property of the result is message's from value, as an EmailAddressDetails object.
    */
  def getAsync(): scala.Unit = js.native
  def getAsync(callback: js.Function1[/* result */ AsyncResult[EmailAddressDetails], scala.Unit]): scala.Unit = js.native
  /**
    * Gets the from value of a message.
    * 
    * The getAsync method starts an asynchronous call to the Exchange server to get the from value of a message.
    * 
    * The from value of the item is provided as an {@link Office.EmailAddressDetails} in the asyncResult.value property.
    * 
    * [Api set: Mailbox 1.7]
    * 
    * @remarks
    * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    * 
    * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose</td></tr></table>
    * 
    * In addition to this signature, the method also has the following signature:
    * 
    * `getAsync(callback?: (result: Office.AsyncResult<EmailAddressDetails>) => void): void;`
    * 
    * @param options - An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter, asyncResult, which is an Office.AsyncResult object.
    *                  The `value` property of the result is message's from value, as an EmailAddressDetails object.
    */
  def getAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[EmailAddressDetails], scala.Unit]
  ): scala.Unit = js.native
}

