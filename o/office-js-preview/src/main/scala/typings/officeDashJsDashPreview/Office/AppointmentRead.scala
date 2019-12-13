package typings.officeDashJsDashPreview.Office

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The appointment attendee mode of {@link Office.Item | Office.context.mailbox.item}.
  * 
  * **Important**: This is an internal Outlook object, not directly exposed through existing interfaces. 
  * You should treat this as a mode of Office.context.mailbox.item. Refer to the
  * {@link https://docs.microsoft.com/office/dev/add-ins/reference/objectmodel/preview-requirement-set/office.context.mailbox.item | Object Model} page for more information.
  */
@js.native
trait AppointmentRead extends ItemRead {
  /**
    * Gets the date and time that an item was created.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Appointment Attendee
    */
  var dateTimeCreated: Date = js.native
  /**
    * Gets the date and time that an item was last modified.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Appointment Attendee
    *
    * **Note**: This member is not supported in Outlook on iOS or Android.
    */
  var dateTimeModified: Date = js.native
  /**
    * Gets the date and time that the appointment is to end.
    *
    * The end property is a Date object expressed as a Coordinated Universal Time (UTC) date and time value. 
    * You can use the convertToLocalClientTime method to convert the end property value to the client's local date and time.
    *
    * When you use the Time.setAsync method to set the end time, you should use the convertToUtcClientTime method to convert the local time on 
    * the client to UTC for the server.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Appointment Attendee
    */
  var end: Date = js.native
  /**
    * Gets the locations of an appointment.
    *
    * The enhancedLocation property returns an {@link Office.EnhancedLocation | EnhancedLocation} object that allows you to get the set of locations
    * (each represented by a {@link Office.LocationDetails | LocationDetails} object) associated with the appointment.
    * 
    * [Api set: Mailbox 1.8]
    * 
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Appointment Attendee
    */
  var enhancedLocation: EnhancedLocation = js.native
  /**
    * Gets the location of an appointment.
    *
    * The location property returns a string that contains the location of the appointment.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Appointment Attendee
    */
  var location: String = js.native
  /**
    * Provides access to the optional attendees of an event. The type of object and level of access depends on the mode of the current item.
    *
    * The optionalAttendees property returns an array that contains an {@link Office.EmailAddressDetails | EmailAddressDetails} object for each optional attendee to 
    * the meeting. By default, the collection is limited to a maximum of 100 members. However, on Windows and Mac, you can get 500 members maximum.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Appointment Attendee
    */
  var optionalAttendees: js.Array[EmailAddressDetails] = js.native
  /**
    * Gets the email address of the meeting organizer for a specified meeting.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Appointment Attendee
    */
  var organizer: EmailAddressDetails = js.native
  /**
    * Gets the recurrence pattern of an appointment. Gets the recurrence pattern of a meeting request.
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
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Appointment Attendee
    */
  var recurrence: Recurrence = js.native
  /**
    * Provides access to the required attendees of an event. The type of object and level of access depends on the mode of the current item.
    *
    * The requiredAttendees property returns an array that contains an {@link Office.EmailAddressDetails | EmailAddressDetails} object for each required attendee to 
    * the meeting. By default, the collection is limited to a maximum of 100 members. However, on Windows and Mac, you can get 500 members maximum.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Appointment Attendee
    */
  var requiredAttendees: js.Array[EmailAddressDetails] = js.native
  /**
    * Gets the date and time that the appointment is to begin.
    *
    * The start property is a Date object expressed as a Coordinated Universal Time (UTC) date and time value. 
    * You can use the convertToLocalClientTime method to convert the value to the client's local date and time.
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Appointment Attendee
    */
  var start: Date = js.native
}

