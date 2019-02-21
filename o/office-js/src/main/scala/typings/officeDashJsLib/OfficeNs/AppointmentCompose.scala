package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The appointment organizer mode of {@link Office.Item | Office.context.mailbox.item}.
  * 
  * **Important**: This is an internal Outlook object, not directly exposed through existing interfaces. 
  * You should treat this as a mode of Office.context.mailbox.item. Refer to the
  * {@link https://docs.microsoft.com/office/dev/add-ins/reference/objectmodel/preview-requirement-set/office.context.mailbox.item | Object Model} page for more information.
  */
@js.native
trait AppointmentCompose extends ItemCompose {
  /**
    * Gets or sets the date and time that the appointment is to end.
    *
    * The end property is an {@link Office.Time} object expressed as a Coordinated Universal Time (UTC) date and time value. 
    * You can use the convertToLocalClientTime method to convert the end property value to the client's local date and time.
    *
    * When you use the Time.setAsync method to set the end time, you should use the convertToUtcClientTime method to convert the local time on 
    * the client to UTC for the server.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Appointment Organizer</td></tr>
    * </table>
    */
  var end: Time = js.native
  /**
    * Gets or sets the locations of the appointment. The `enhancedLocation` property returns an {@link Office.EnhancedLocation} object that 
    * provides methods to get, remove, or add locations on an item.
    * 
    * [Api set: Mailbox Preview]
    * 
    * @remarks
    * 
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Appointment Organizer</td></tr>
    * </table>
    * 
    * @beta
    */
  var enhancedLocation: EnhancedLocation = js.native
  /**
    * Gets or sets the {@link Office.Location} of an appointment. The location property returns a Location object that provides methods that are 
    * used to get and set the location of the appointment.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Appointment Organizer</td></tr>
    * </table>
    */
  var location: Location = js.native
  /**
    * Provides access to the optional attendees of an event. The type of object and level of access depends on the mode of the current item. 
    * The optionalAttendees property returns an {@link Office.Recipients} object that provides methods to get or update the optional attendees 
    * for a meeting.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Appointment Organizer</td></tr>
    * </table>
    */
  var optionalAttendees: Recipients = js.native
  /**
    * Gets the organizer for the specified meeting. 
    * 
    * The organizer property returns an {@link Office.Organizer | Organizer} object that provides a method to get the organizer value.
    * 
    * [Api set: Mailbox 1.7]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Appointment Organizer</td></tr>
    * </table>
    */
  var organizer: Organizer = js.native
  /**
    * Gets or sets the recurrence pattern of an appointment.
    * 
    * The recurrence property returns a recurrence object for recurring appointments or meetings requests if an item is a series or an instance 
    * in a series. `null` is returned for single appointments and meeting requests of single appointments.
    * 
    * **Note**: Meeting requests have an itemClass value of IPM.Schedule.Meeting.Request.
    * 
    * **Note**: If the recurrence object is null, this indicates that the object is a single appointment or a meeting request of a single 
    * appointment and NOT a part of a series.
    * 
    * [Api set: Mailbox 1.7]
    * 
    * @remarks
    * 
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Appointment Organizer</td></tr>
    * </table>
    */
  var recurrence: Recurrence = js.native
  /**
    * Provides access to the required attendees of an event. The type of object and level of access depends on the mode of the current item. 
    * The requiredAttendees property returns an {@link Office.Recipients} object that provides methods to get or update the required attendees 
    * for a meeting.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Appointment Organizer</td></tr>
    * </table>
    */
  var requiredAttendees: Recipients = js.native
  /**
    * Gets or sets the date and time that the appointment is to begin.
    *
    * The start property is an {@link Office.Time} object expressed as a Coordinated Universal Time (UTC) date and time value. 
    * You can use the convertToLocalClientTime method to convert the value to the client's local date and time.
    *
    * When you use the Time.setAsync method to set the start time, you should use the convertToUtcClientTime method to convert the local time on 
    * the client to UTC for the server.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Appointment Organizer</td></tr>
    * </table>
    */
  var start: Time = js.native
  def addHandlerAsync(eventType: EventType, handler: js.Any, options: js.Any): scala.Unit = js.native
  def addHandlerAsync(
    eventType: EventType,
    handler: js.Any,
    options: js.Any,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
}

