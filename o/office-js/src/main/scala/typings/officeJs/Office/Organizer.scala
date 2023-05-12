package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the appointment organizer, even if an alias or a delegate was used to create the appointment.
  * This object provides a method to get the organizer value of an appointment in an Outlook add-in.
  *
  * @remarks
  * [Api set: Mailbox 1.7]
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
  */
@js.native
trait Organizer extends StObject {
  
  /**
    * Gets the organizer value of an appointment as an {@link Office.EmailAddressDetails | EmailAddressDetails} object
    * in the `asyncResult.value` property.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    * 
    * **Important**: A `recipientType` property value isn't returned by the getAsync method.
    * The appointment organizer is always a user whose email address is on the Exchange server.
    *
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                  `asyncResult`, which is an `AsyncResult` object. The `value` property of the result is the appointment's organizer value,
    *                  as an `EmailAddressDetails` object.
    */
  def getAsync(): Unit = js.native
  def getAsync(callback: js.Function1[/* asyncResult */ AsyncResult[EmailAddressDetails], Unit]): Unit = js.native
  /**
    * Gets the organizer value of an appointment as an {@link Office.EmailAddressDetails | EmailAddressDetails} object
    * in the `asyncResult.value` property.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * **Important**: A `recipientType` property value isn't returned by the getAsync method.
    * The appointment organizer is always a user whose email address is on the Exchange server.
    * 
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                  `asyncResult`, which is an `AsyncResult` object. The `value` property of the result is the appointment's organizer value,
    *                  as an `EmailAddressDetails` object.
    */
  def getAsync(options: AsyncContextOptions): Unit = js.native
  def getAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[EmailAddressDetails], Unit]
  ): Unit = js.native
}
