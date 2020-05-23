package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the appointment organizer, even if an alias or a delegate was used to create the appointment.
  * This object provides a method to get the organizer value of an appointment in an Outlook add-in.
  *
  * [Api set: Mailbox 1.7]
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
  */
@js.native
trait Organizer extends js.Object {
  /**
    * Gets the organizer value of an appointment as an {@link Office.EmailAddressDetails | EmailAddressDetails} object in the asyncResult.value property.
    *
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                  `asyncResult`, which is an `AsyncResult` object. The `value` property of the result is the appointment's organizer value,
    *                  as an `EmailAddressDetails` object.
    */
  def getAsync(): Unit = js.native
  def getAsync(callback: js.Function1[/* asyncResult */ AsyncResult[EmailAddressDetails], Unit]): Unit = js.native
  /**
    * Gets the organizer value of an appointment as an {@link Office.EmailAddressDetails | EmailAddressDetails} object
    * in the `asyncResult.value` property.
    *
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param options - An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback method.
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                  `asyncResult`, which is an `AsyncResult` object. The `value` property of the result is the appointment's organizer value,
    *                  as an `EmailAddressDetails` object.
    */
  def getAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[EmailAddressDetails], Unit]
  ): Unit = js.native
}

