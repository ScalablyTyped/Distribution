package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The AppointmentForm namespace is used to access the currently selected appointment.
  *
  * [Api set: Mailbox 1.0]
  *
  * @remarks
  * <table>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>Restricted</td></tr>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or Read</td></tr>
  * </table>
  */
trait AppointmentForm extends js.Object {
  /**
    * Gets an object that provides methods for manipulating the body of an item.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or Read</td></tr>
    * </table>
    */
  var body: java.lang.String
  /**
    * Gets or sets the date and time that the appointment is to end.
    *
    * The end property is expressed as a Coordinated Universal Time (UTC) date and time value. You can use the convertToLocalClientTime method to 
    * convert the end property value to the client's local date and time.
    *
    * *Read mode*
    *
    * The end property returns a Date object.
    *
    * *Compose mode*
    *
    * The end property returns a Time object.
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
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or Read</td></tr>
    * </table>
    */
  var end: stdLib.Date
  /**
    * Gets or sets the location of an appointment.
    *
    * *Read mode*
    *
    * The location property returns a string that contains the location of the appointment.
    *
    * *Compose mode*
    *
    * The location property returns a Location object that provides methods that are used to get and set the location of the appointment.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or Read</td></tr>
    * </table>
    */
  var location: java.lang.String
  /**
    * Provides access to the optional attendees of an event. The type of object and level of access depends on the mode of the current item.
    *
    * *Read mode*
    *
    * The optionalAttendees property returns an array that contains an EmailAddressDetails object for each optional attendee to the meeting.
    *
    * *Compose mode*
    *
    * The optionalAttendees property returns a Recipients object that provides methods to get or update the optional attendees for a meeting.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or Read</td></tr>
    * </table>
    */
  var optionalAttendees: js.Array[java.lang.String] | js.Array[EmailAddressDetails]
  /**
    * Provides access to the required attendees of an event. The type of object and level of access depends on the mode of the current item.
    *
    * *Read mode*
    *
    * The requiredAttendees property returns an array that contains an EmailAddressDetails object for each required attendee to the meeting.
    *
    * *Compose mode*
    *
    * The requiredAttendees property returns a Recipients object that provides methods to get or update the required attendees for a meeting.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or Read</td></tr>
    * </table>
    */
  var requiredAttendees: js.Array[java.lang.String] | js.Array[EmailAddressDetails]
  var resources: js.Array[java.lang.String]
  /**
    * Gets or sets the date and time that the appointment is to begin.
    *
    * The start property is expressed as a Coordinated Universal Time (UTC) date and time value. You can use the convertToLocalClientTime method 
    * to convert the value to the client's local date and time.
    *
    * *Read mode*
    *
    * The start property returns a Date object.
    *
    * *Compose mode*
    *
    * The start property returns a Time object.
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
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or Read</td></tr>
    * </table>
    */
  var start: stdLib.Date
  /**
    * Gets or sets the description that appears in the subject field of an item.
    *
    * The subject property gets or sets the entire subject of the item, as sent by the email server.
    *
    * *Read mode*
    *
    * The subject property returns a string. Use the normalizedSubject property to get the subject minus any leading prefixes such as RE: and FW:.
    *
    * *Compose mode*
    *
    * The subject property returns a Subject object that provides methods to get and set the subject.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    *
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or Read</td></tr>
    * </table>
    */
  var subject: java.lang.String
}

