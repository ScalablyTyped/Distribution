package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The appointment attendee mode of {@link Office.Item | Office.context.mailbox.item}.
     * 
     * Important: This is an internal Outlook object, not directly exposed through existing interfaces. 
     * You should treat this as a mode of 'Office.context.mailbox.item'. Refer to the Object Model pages for more information.
     */
@js.native
trait AppointmentRead extends ItemRead {
  /**
           * Gets the date and time that the appointment is to end.
           *
           * The end property is a Date object expressed as a Coordinated Universal Time (UTC) date and time value. 
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
           * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Appointment Attendee</td></tr></table>
           */
  var end: stdLib.Date = js.native
  /**
           * Gets the location of an appointment.
           *
           * The location property returns a string that contains the location of the appointment.
           *
           * [Api set: Mailbox 1.0]
           *
           * @remarks
           *
           * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
           *
           * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Appointment Attendee</td></tr></table>
           */
  var location: java.lang.String = js.native
  /**
           * Provides access to the optional attendees of an event. The type of object and level of access depends on the mode of the current item.
           *
           * The optionalAttendees property returns an array that contains an {@link Office.EmailAddressDetails} object for each optional attendee to 
           * the meeting.
           *
           * [Api set: Mailbox 1.0]
           *
           * @remarks
           *
           * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
           *
           * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Appointment Attendee</td></tr></table>
           */
  var optionalAttendees: js.Array[EmailAddressDetails] = js.native
  /**
           * Gets the email address of the meeting organizer for a specified meeting.
           *
           * [Api set: Mailbox 1.0]
           *
           * @remarks
           *
           * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
           *
           * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Appointment Attendee</td></tr></table>
           */
  var organizer: EmailAddressDetails = js.native
  /**
           * Provides access to the required attendees of an event. The type of object and level of access depends on the mode of the current item.
           *
           * The requiredAttendees property returns an array that contains an {@link Office.EmailAddressDetails} object for each required attendee to 
           * the meeting.
           *
           * [Api set: Mailbox 1.0]
           *
           * @remarks
           *
           * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
           *
           * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Appointment Attendee</td></tr></table>
           */
  var requiredAttendees: js.Array[EmailAddressDetails] = js.native
  /**
           * Gets the date and time that the appointment is to begin.
           *
           * The start property is a Date object expressed as a Coordinated Universal Time (UTC) date and time value. 
           * You can use the convertToLocalClientTime method to convert the value to the client's local date and time.
           *
           * [Api set: Mailbox 1.0]
           *
           * @remarks
           *
           * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
           *
           * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Appointment Attendee</td></tr></table>
           */
  var start: stdLib.Date = js.native
}

