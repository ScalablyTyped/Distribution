package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends OutlookItem {
  /**
    * The collection of fileAttachment and itemAttachment attachments for the event. Navigation property. Read-only.
    * Nullable.
    */
  var attachments: js.UndefOr[js.Array[Attachment]] = js.undefined
  // The collection of attendees for the event.
  var attendees: js.UndefOr[js.Array[Attendee]] = js.undefined
  // The body of the message associated with the event. It can be in HTML or text format.
  var body: js.UndefOr[ItemBody] = js.undefined
  // The preview of the message associated with the event. It is in text format.
  var bodyPreview: js.UndefOr[String] = js.undefined
  // The calendar that contains the event. Navigation property. Read-only.
  var calendar: js.UndefOr[Calendar] = js.undefined
  // The date, time, and time zone that the event ends. By default, the end time is in UTC.
  var end: js.UndefOr[DateTimeTimeZone] = js.undefined
  // The collection of open extensions defined for the event. Read-only. Nullable.
  var extensions: js.UndefOr[js.Array[Extension]] = js.undefined
  // Set to true if the event has attachments.
  var hasAttachments: js.UndefOr[Boolean] = js.undefined
  // A unique identifier that is shared by all instances of an event across different calendars. Read-only.
  var iCalUId: js.UndefOr[String] = js.undefined
  // The importance of the event. The possible values are: low, normal, high.
  var importance: js.UndefOr[Importance] = js.undefined
  // The instances of the event. Navigation property. Read-only. Nullable.
  var instances: js.UndefOr[js.Array[Event]] = js.undefined
  // Set to true if the event lasts all day.
  var isAllDay: js.UndefOr[Boolean] = js.undefined
  // Set to true if the event has been canceled.
  var isCancelled: js.UndefOr[Boolean] = js.undefined
  // Set to true if the message sender is also the organizer.
  var isOrganizer: js.UndefOr[Boolean] = js.undefined
  // Set to true if an alert is set to remind the user of the event.
  var isReminderOn: js.UndefOr[Boolean] = js.undefined
  // The location of the event.
  var location: js.UndefOr[Location] = js.undefined
  /**
    * The locations where the event is held or attended from. The location and locations properties always correspond with
    * each other. If you update the location property, any prior locations in the locations collection would be removed and
    * replaced by the new location value.
    */
  var locations: js.UndefOr[js.Array[Location]] = js.undefined
  // The collection of multi-value extended properties defined for the event. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[js.Array[MultiValueLegacyExtendedProperty]] = js.undefined
  /**
    * A URL for an online meeting. The property is set only when an organizer specifies an event as an online meeting such as
    * a Skype meeting. Read-only.
    */
  var onlineMeetingUrl: js.UndefOr[String] = js.undefined
  // The organizer of the event.
  var organizer: js.UndefOr[Recipient] = js.undefined
  /**
    * The end time zone that was set when the event was created. A value of tzone://Microsoft/Custom indicates that a legacy
    * custom time zone was set in desktop Outlook.
    */
  var originalEndTimeZone: js.UndefOr[String] = js.undefined
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var originalStart: js.UndefOr[String] = js.undefined
  /**
    * The start time zone that was set when the event was created. A value of tzone://Microsoft/Custom indicates that a
    * legacy custom time zone was set in desktop Outlook.
    */
  var originalStartTimeZone: js.UndefOr[String] = js.undefined
  // The recurrence pattern for the event.
  var recurrence: js.UndefOr[PatternedRecurrence] = js.undefined
  // The number of minutes before the event start time that the reminder alert occurs.
  var reminderMinutesBeforeStart: js.UndefOr[Double] = js.undefined
  // Set to true if the sender would like a response when the event is accepted or declined.
  var responseRequested: js.UndefOr[Boolean] = js.undefined
  // Indicates the type of response sent in response to an event message.
  var responseStatus: js.UndefOr[ResponseStatus] = js.undefined
  // The possible values are: normal, personal, private, confidential.
  var sensitivity: js.UndefOr[Sensitivity] = js.undefined
  // The ID for the recurring series master item, if this event is part of a recurring series.
  var seriesMasterId: js.UndefOr[String] = js.undefined
  // The status to show. The possible values are: free, tentative, busy, oof, workingElsewhere, unknown.
  var showAs: js.UndefOr[FreeBusyStatus] = js.undefined
  // The collection of single-value extended properties defined for the event. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[js.Array[SingleValueLegacyExtendedProperty]] = js.undefined
  // The date, time, and time zone that the event starts. By default, the start time is in UTC.
  var start: js.UndefOr[DateTimeTimeZone] = js.undefined
  // The text of the event's subject line.
  var subject: js.UndefOr[String] = js.undefined
  // The event type. The possible values are: singleInstance, occurrence, exception, seriesMaster. Read-only.
  var `type`: js.UndefOr[EventType] = js.undefined
  /**
    * The URL to open the event in Outlook on the web.Outlook on the web opens the event in the browser if you are signed in
    * to your mailbox. Otherwise, Outlook on the web prompts you to sign in.This URL can be accessed from within an iFrame.
    */
  var webLink: js.UndefOr[String] = js.undefined
}

object Event {
  @scala.inline
  def apply(
    attachments: js.Array[Attachment] = null,
    attendees: js.Array[Attendee] = null,
    body: ItemBody = null,
    bodyPreview: String = null,
    calendar: Calendar = null,
    categories: js.Array[String] = null,
    changeKey: String = null,
    createdDateTime: String = null,
    end: DateTimeTimeZone = null,
    extensions: js.Array[Extension] = null,
    hasAttachments: js.UndefOr[Boolean] = js.undefined,
    iCalUId: String = null,
    id: String = null,
    importance: Importance = null,
    instances: js.Array[Event] = null,
    isAllDay: js.UndefOr[Boolean] = js.undefined,
    isCancelled: js.UndefOr[Boolean] = js.undefined,
    isOrganizer: js.UndefOr[Boolean] = js.undefined,
    isReminderOn: js.UndefOr[Boolean] = js.undefined,
    lastModifiedDateTime: String = null,
    location: Location = null,
    locations: js.Array[Location] = null,
    multiValueExtendedProperties: js.Array[MultiValueLegacyExtendedProperty] = null,
    onlineMeetingUrl: String = null,
    organizer: Recipient = null,
    originalEndTimeZone: String = null,
    originalStart: String = null,
    originalStartTimeZone: String = null,
    recurrence: PatternedRecurrence = null,
    reminderMinutesBeforeStart: Int | Double = null,
    responseRequested: js.UndefOr[Boolean] = js.undefined,
    responseStatus: ResponseStatus = null,
    sensitivity: Sensitivity = null,
    seriesMasterId: String = null,
    showAs: FreeBusyStatus = null,
    singleValueExtendedProperties: js.Array[SingleValueLegacyExtendedProperty] = null,
    start: DateTimeTimeZone = null,
    subject: String = null,
    `type`: EventType = null,
    webLink: String = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (attendees != null) __obj.updateDynamic("attendees")(attendees.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (bodyPreview != null) __obj.updateDynamic("bodyPreview")(bodyPreview.asInstanceOf[js.Any])
    if (calendar != null) __obj.updateDynamic("calendar")(calendar.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (changeKey != null) __obj.updateDynamic("changeKey")(changeKey.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(hasAttachments)) __obj.updateDynamic("hasAttachments")(hasAttachments.asInstanceOf[js.Any])
    if (iCalUId != null) __obj.updateDynamic("iCalUId")(iCalUId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (importance != null) __obj.updateDynamic("importance")(importance.asInstanceOf[js.Any])
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    if (!js.isUndefined(isAllDay)) __obj.updateDynamic("isAllDay")(isAllDay.asInstanceOf[js.Any])
    if (!js.isUndefined(isCancelled)) __obj.updateDynamic("isCancelled")(isCancelled.asInstanceOf[js.Any])
    if (!js.isUndefined(isOrganizer)) __obj.updateDynamic("isOrganizer")(isOrganizer.asInstanceOf[js.Any])
    if (!js.isUndefined(isReminderOn)) __obj.updateDynamic("isReminderOn")(isReminderOn.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (multiValueExtendedProperties != null) __obj.updateDynamic("multiValueExtendedProperties")(multiValueExtendedProperties.asInstanceOf[js.Any])
    if (onlineMeetingUrl != null) __obj.updateDynamic("onlineMeetingUrl")(onlineMeetingUrl.asInstanceOf[js.Any])
    if (organizer != null) __obj.updateDynamic("organizer")(organizer.asInstanceOf[js.Any])
    if (originalEndTimeZone != null) __obj.updateDynamic("originalEndTimeZone")(originalEndTimeZone.asInstanceOf[js.Any])
    if (originalStart != null) __obj.updateDynamic("originalStart")(originalStart.asInstanceOf[js.Any])
    if (originalStartTimeZone != null) __obj.updateDynamic("originalStartTimeZone")(originalStartTimeZone.asInstanceOf[js.Any])
    if (recurrence != null) __obj.updateDynamic("recurrence")(recurrence.asInstanceOf[js.Any])
    if (reminderMinutesBeforeStart != null) __obj.updateDynamic("reminderMinutesBeforeStart")(reminderMinutesBeforeStart.asInstanceOf[js.Any])
    if (!js.isUndefined(responseRequested)) __obj.updateDynamic("responseRequested")(responseRequested.asInstanceOf[js.Any])
    if (responseStatus != null) __obj.updateDynamic("responseStatus")(responseStatus.asInstanceOf[js.Any])
    if (sensitivity != null) __obj.updateDynamic("sensitivity")(sensitivity.asInstanceOf[js.Any])
    if (seriesMasterId != null) __obj.updateDynamic("seriesMasterId")(seriesMasterId.asInstanceOf[js.Any])
    if (showAs != null) __obj.updateDynamic("showAs")(showAs.asInstanceOf[js.Any])
    if (singleValueExtendedProperties != null) __obj.updateDynamic("singleValueExtendedProperties")(singleValueExtendedProperties.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (webLink != null) __obj.updateDynamic("webLink")(webLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

