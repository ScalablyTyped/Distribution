package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods to get and set the location of a meeting in an Outlook add-in.
  *
  * [Api set: Mailbox 1.1]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose 
  */
@js.native
trait Location extends js.Object {
  /**
    * Gets the location of an appointment.
    *
    * The getAsync method starts an asynchronous call to the Exchange server to get the location of an appointment. 
    * The location of the appointment is provided as a string in the asyncResult.value property.
    *
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    */
  def getAsync(callback: js.Function1[/* asyncResult */ AsyncResult[java.lang.String], scala.Unit]): scala.Unit = js.native
  /**
    * Gets the location of an appointment.
    *
    * The getAsync method starts an asynchronous call to the Exchange server to get the location of an appointment. 
    * The location of the appointment is provided as a string in the asyncResult.value property.
    *
    * @param options - An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose 
    */
  def getAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sets the location of an appointment.
    *
    * The setAsync method starts an asynchronous call to the Exchange server to set the location of an appointment. 
    * Setting the location of an appointment overwrites the current location.
    *
    * @param location - The location of the appointment. The string is limited to 255 characters.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. If setting the location fails, the asyncResult.error property will contain an error code.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose 
    * 
    * **Errors**:
    * 
    * - DataExceedsMaximumSize: The location parameter is longer than 255 characters.
    */
  def setAsync(location: java.lang.String): scala.Unit = js.native
  def setAsync(
    location: java.lang.String,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def setAsync(location: java.lang.String, options: AsyncContextOptions): scala.Unit = js.native
  def setAsync(
    location: java.lang.String,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
}

