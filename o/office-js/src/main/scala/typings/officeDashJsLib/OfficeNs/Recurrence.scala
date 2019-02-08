package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The recurrence object provides methods to get and set the recurrence pattern of appointments but only get the recurrence pattern of 
  * meeting requests. 
  * It will have a dictionary with the following keys: seriesTime, recurrenceType, recurrenceProperties, and recurrenceTimeZone (optional).
  * 
  * [Api set: Mailbox 1.7]
  * 
  * @remarks
  * 
  * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
  * 
  * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or read</td></tr></table>
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
trait Recurrence extends js.Object {
  /**
    * Gets or sets the properties of the recurring appointment series.
    * 
    * [Api set: Mailbox 1.7]
    * 
    * @remarks
    * 
    * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    * 
    * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or read</td></tr></table>
    */
  var recurrenceProperties: RecurrenceProperties = js.native
  /**
    * Gets or sets the properties of the recurring appointment series.
    * 
    * [Api set: Mailbox 1.7]
    * 
    * @remarks
    * 
    * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    * 
    * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or read</td></tr></table>
    */
  var recurrenceTimeZone: RecurrenceTimeZone = js.native
  /**
    * Gets or sets the type of the recurring appointment series.
    * 
    * [Api set: Mailbox 1.7]
    * 
    * @remarks
    * 
    * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    * 
    * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or read</td></tr></table>
    */
  var recurrenceType: officeDashJsLib.OfficeNs.MailboxEnumsNs.RecurrenceType = js.native
  /**
    * The {@link Office.SeriesTime} object enables you to manage the start and end dates of the recurring appointment series and the usual start 
    * and end times of instances. **This object is not in UTC time.** 
    * Instead, it is set in the time zone specified by the recurrenceTimeZone value or defaulted to the item's time zone.
    * 
    * [Api set: Mailbox 1.7]
    * 
    * @remarks
    * 
    * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    * 
    * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or read</td></tr></table>
    */
  var seriesTime: SeriesTime = js.native
  /**
    * Returns the current recurrence object of an appointment series.
    * 
    * This method returns the entire recurrence object for the appointment series.
    * 
    * [Api set: Mailbox 1.7]
    * 
    * @remarks
    * 
    * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    * 
    * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or read</td></tr></table>
    * 
    * In addition to this signature, this method also has the following signature:
    * 
    * `getAsync(callback?: (result: Office.AsyncResult<Recurrence>) => void): void;`
    * 
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter, 
    *                asyncResult, which is an Office.AsyncResult object.
    *                 The `value` property of the result is a Recurrence object.
    */
  def getAsync(): scala.Unit = js.native
  def getAsync(callback: js.Function1[/* result */ AsyncResult[this.type], scala.Unit]): scala.Unit = js.native
  def getAsync(options: AsyncContextOptions): scala.Unit = js.native
  def getAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[this.type], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sets the recurrence pattern of an appointment series.
    * 
    * **Note**: setAsync should only be available for series items and not instance items.
    * 
    * [Api set: Mailbox 1.7]
    * 
    * @remarks
    * 
    * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadWriteItem</td></tr>
    * 
    * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose</td></tr>
    * 
    * <tr><td>Errors</td><td>InvalidEndTime - The appointment end time is before its start time.</td></tr></table>
    * 
    * In addition to this signature, this method also has the following signature:
    * 
    * `setAsync(recurrencePattern: Recurrence, callback?: (result: Office.AsyncResult<void>) => void): void;`
    * 
    * @param recurrencePattern - A recurrence object.
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter, 
    *                asyncResult, which is an Office.AsyncResult object.
    */
  def setAsync(recurrencePattern: Recurrence): scala.Unit = js.native
  def setAsync(
    recurrencePattern: Recurrence,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def setAsync(recurrencePattern: Recurrence, options: AsyncContextOptions): scala.Unit = js.native
  def setAsync(
    recurrencePattern: Recurrence,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
}

