package typings.officeDashJs.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a method to get the from value of a message in an Outlook add-in.
  * 
  * [Api set: Mailbox 1.7]
  * 
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
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
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    * 
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter,
    *                             asyncResult, which is an Office.AsyncResult object.
    *                  The `value` property of the result is the item's from value, as an EmailAddressDetails object.
    */
  def getAsync(): Unit = js.native
  def getAsync(callback: js.Function1[/* asyncResult */ AsyncResult[EmailAddressDetails], Unit]): Unit = js.native
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
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    * 
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter,
    *                             asyncResult, which is an Office.AsyncResult object.
    *                  The `value` property of the result is the item's from value, as an EmailAddressDetails object.
    */
  def getAsync(options: AsyncContextOptions): Unit = js.native
  def getAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[EmailAddressDetails], Unit]
  ): Unit = js.native
}

