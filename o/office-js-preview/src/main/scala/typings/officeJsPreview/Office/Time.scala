package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Time` object is returned as the start or end property of an appointment in compose mode.
  *
  * @remarks
  * [Api set: Mailbox 1.1]
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
  */
@js.native
trait Time extends StObject {
  
  /**
    * Gets the start or end time of an appointment.
    *
    * The date and time is provided as a `Date` object in the `asyncResult.value` property. The value is in Coordinated Universal Time (UTC).
    * You can convert the UTC time to the local client time by using the `convertToLocalClientTime` method.
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter
    *                  of type `Office.AsyncResult`. The `value` property of the result is a `Date` object.
    */
  def getAsync(callback: js.Function1[/* asyncResult */ AsyncResult[js.Date], Unit]): Unit = js.native
  /**
    * Gets the start or end time of an appointment.
    *
    * The date and time is provided as a `Date` object in the `asyncResult.value` property. The value is in Coordinated Universal Time (UTC).
    * You can convert the UTC time to the local client time by using the `convertToLocalClientTime` method.
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param options - An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter
    *                  of type `Office.AsyncResult`. The `value` property of the result is a `Date` object.
    */
  def getAsync(options: AsyncContextOptions, callback: js.Function1[/* asyncResult */ AsyncResult[js.Date], Unit]): Unit = js.native
  
  /**
    * Sets the start or end time of an appointment.
    *
    * If the `setAsync` method is called on the start property, the `end` property will be adjusted to maintain the duration of the appointment as
    * previously set. If the `setAsync` method is called on the `end` property, the duration of the appointment will be extended to the new end time.
    *
    * The time must be in UTC; you can get the correct UTC time by using the `convertToUtcClientTime` method.
    *
    * **Important**: In the Windows client, you can't use this method to update the start or end of a recurrence.
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
    * - `InvalidEndTime`: The appointment end time is before the appointment start time.
    *
    * @param dateTime - A date-time object in Coordinated Universal Time (UTC).
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *               type `Office.AsyncResult`. If setting the date and time fails, the `asyncResult.error` property will contain an error code.
    */
  def setAsync(dateTime: js.Date): Unit = js.native
  def setAsync(dateTime: js.Date, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  /**
    * Sets the start or end time of an appointment.
    *
    * If the `setAsync` method is called on the start property, the `end` property will be adjusted to maintain the duration of the appointment as
    * previously set. If the `setAsync` method is called on the `end` property, the duration of the appointment will be extended to the new end time.
    *
    * The time must be in UTC; you can get the correct UTC time by using the `convertToUtcClientTime` method.
    *
    * **Important**: In the Windows client, you can't use this method to update the start or end of a recurrence.
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
    * - `InvalidEndTime`: The appointment end time is before the appointment start time.
    *
    * @param dateTime - A date-time object in Coordinated Universal Time (UTC).
    * @param options - An object literal that contains one or more of the following properties.
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *               type `Office.AsyncResult`. If setting the date and time fails, the `asyncResult.error` property will contain an error code.
    */
  def setAsync(dateTime: js.Date, options: AsyncContextOptions): Unit = js.native
  def setAsync(
    dateTime: js.Date,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
}
