package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The appointment organizer mode of {@link Office.Item | Office.context.mailbox.item}.
  * 
  * Important: This is an internal Outlook object, not directly exposed through existing interfaces. 
  * You should treat this as a mode of `Office.context.mailbox.item`. Refer to the Object Model pages for more information.
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
    * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *
    * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Appointment Organizer</td></tr></table>
    */
  var end: Time = js.native
  /**
    * Gets or sets the {@link Office.Location} of an appointment. The location property returns a Location object that provides methods that are 
    * used to get and set the location of the appointment.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *
    * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Appointment Organizer</td></tr></table>
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
    * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *
    * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Appointment Organizer</td></tr></table>
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
    * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *
    * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Appointment Organizer</td></tr></table>
    */
  var organizer: Organizer = js.native
  /**
    * Provides access to the required attendees of an event. The type of object and level of access depends on the mode of the current item. 
    * The requiredAttendees property returns an {@link Office.Recipients} object that provides methods to get or update the required attendees 
    * for a meeting.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *
    * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Appointment Organizer</td></tr></table>
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
    * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *
    * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Appointment Organizer</td></tr></table>
    */
  var start: Time = js.native
}

