package typings.officeJsPreview.Office

import typings.officeJsPreview.Office.MailboxEnums.RecurrenceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Recurrence` object provides methods to get and set the recurrence pattern of appointments but only get the recurrence pattern of
  * meeting requests.
  * It will have a dictionary with the following keys: `seriesTime`, `recurrenceType`, `recurrenceProperties`, and `recurrenceTimeZone` (optional).
  *
  * @remarks
  * [Api set: Mailbox 1.7]
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  *
  * **States**
  *
  * <table>
  *   <tr>
  *     <th>State</th>
  *     <th>Editable?</th>
  *     <th>Viewable?</th>
  *   </tr>
  *   <tr>
  *     <td>Appointment Organizer - Compose Series</td>
  *     <td>Yes (setAsync)</td>
  *     <td>Yes (getAsync)</td>
  *   </tr>
  *   <tr>
  *     <td>Appointment Organizer - Compose Instance</td>
  *     <td>No (setAsync returns error)</td>
  *     <td>Yes (getAsync)</td>
  *   </tr>
  *   <tr>
  *     <td>Appointment Attendee - Read Series</td>
  *     <td>No (setAsync not available)</td>
  *     <td>Yes (item.recurrence)</td>
  *   </tr>
  *   <tr>
  *     <td>Appointment Attendee - Read Instance</td>
  *     <td>No (setAsync not available)</td>
  *     <td>Yes (item.recurrence)</td>
  *   </tr>
  *   <tr>
  *     <td>Meeting Request - Read Series</td>
  *     <td>No (setAsync not available)</td>
  *     <td>Yes (item.recurrence)</td>
  *   </tr>
  *   <tr>
  *     <td>Meeting Request - Read Instance</td>
  *     <td>No (setAsync not available)</td>
  *     <td>Yes (item.recurrence)</td>
  *   </tr>
  * </table>
  */
@js.native
trait Recurrence extends StObject {
  
  /**
    * Returns the current recurrence object of an appointment series.
    *
    * This method returns the entire `Recurrence` object for the appointment series.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object. The `value` property of the result is a `Recurrence` object.
    */
  def getAsync(): Unit = js.native
  def getAsync(callback: js.Function1[/* asyncResult */ AsyncResult[this.type], Unit]): Unit = js.native
  /**
    * Returns the current recurrence object of an appointment series.
    *
    * This method returns the entire `Recurrence` object for the appointment series.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object. The `value` property of the result is a `Recurrence` object.
    */
  def getAsync(options: AsyncContextOptions): Unit = js.native
  def getAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[this.type], Unit]
  ): Unit = js.native
  
  /**
    * Gets or sets the properties of the recurring appointment series.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var recurrenceProperties: js.UndefOr[RecurrenceProperties] = js.native
  
  /**
    * Gets or sets the properties of the recurring appointment series.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var recurrenceTimeZone: js.UndefOr[RecurrenceTimeZone] = js.native
  
  /**
    * Gets or sets the type of the recurring appointment series.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var recurrenceType: RecurrenceType | String = js.native
  
  /**
    * The {@link Office.SeriesTime | SeriesTime} object enables you to manage the start and end dates of the recurring appointment series and
    * the usual start and end times of instances. **This object is not in UTC time.**
    * Instead, it is set in the time zone specified by the `recurrenceTimeZone` value or defaulted to the item's time zone.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var seriesTime: SeriesTime = js.native
  
  /**
    * Sets the recurrence pattern of an appointment series.
    *
    * **Note**: `setAsync` should only be available for series items and not instance items.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * **Errors**:
    *
    * - `InvalidEndTime`: The appointment end time is before its start time.
    *
    * @param recurrencePattern - A recurrence object.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    */
  def setAsync(recurrencePattern: Recurrence): Unit = js.native
  def setAsync(recurrencePattern: Recurrence, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  /**
    * Sets the recurrence pattern of an appointment series.
    *
    * **Note**: `setAsync` should only be available for series items and not instance items.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read/write item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * **Errors**:
    *
    * - `InvalidEndTime`: The appointment end time is before its start time.
    *
    * @param recurrencePattern - A recurrence object.
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    */
  def setAsync(recurrencePattern: Recurrence, options: AsyncContextOptions): Unit = js.native
  def setAsync(
    recurrencePattern: Recurrence,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
}
