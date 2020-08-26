package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends OutlookItem {
  var allowNewTimeProposals: js.UndefOr[Boolean] = js.native
  /**
    * The collection of fileAttachment and itemAttachment attachments for the event. Navigation property. Read-only.
    * Nullable.
    */
  var attachments: js.UndefOr[js.Array[Attachment]] = js.native
  // The collection of attendees for the event.
  var attendees: js.UndefOr[js.Array[Attendee]] = js.native
  // The body of the message associated with the event. It can be in HTML or text format.
  var body: js.UndefOr[ItemBody] = js.native
  // The preview of the message associated with the event. It is in text format.
  var bodyPreview: js.UndefOr[String] = js.native
  // The calendar that contains the event. Navigation property. Read-only.
  var calendar: js.UndefOr[Calendar] = js.native
  // The date, time, and time zone that the event ends. By default, the end time is in UTC.
  var end: js.UndefOr[DateTimeTimeZone] = js.native
  // The collection of open extensions defined for the event. Read-only. Nullable.
  var extensions: js.UndefOr[js.Array[Extension]] = js.native
  // Set to true if the event has attachments.
  var hasAttachments: js.UndefOr[Boolean] = js.native
  // A unique identifier that is shared by all instances of an event across different calendars. Read-only.
  var iCalUId: js.UndefOr[String] = js.native
  // The importance of the event. The possible values are: low, normal, high.
  var importance: js.UndefOr[Importance] = js.native
  // The instances of the event. Navigation property. Read-only. Nullable.
  var instances: js.UndefOr[js.Array[Event]] = js.native
  // Set to true if the event lasts all day.
  var isAllDay: js.UndefOr[Boolean] = js.native
  // Set to true if the event has been canceled.
  var isCancelled: js.UndefOr[Boolean] = js.native
  // True if this event has online meeting information, false otherwise. Default is false. Optional.
  var isOnlineMeeting: js.UndefOr[Boolean] = js.native
  /**
    * Set to true if the calendar owner (specified by the owner property of the calendar) is the organizer of the event
    * (specified by the organizer property of the event). This also applies if a delegate organized the event on behalf of
    * the owner.
    */
  var isOrganizer: js.UndefOr[Boolean] = js.native
  // Set to true if an alert is set to remind the user of the event.
  var isReminderOn: js.UndefOr[Boolean] = js.native
  // The location of the event.
  var location: js.UndefOr[Location] = js.native
  /**
    * The locations where the event is held or attended from. The location and locations properties always correspond with
    * each other. If you update the location property, any prior locations in the locations collection would be removed and
    * replaced by the new location value.
    */
  var locations: js.UndefOr[js.Array[Location]] = js.native
  // The collection of multi-value extended properties defined for the event. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[js.Array[MultiValueLegacyExtendedProperty]] = js.native
  // Details for an attendee to join the meeting online. Read-only.
  var onlineMeeting: js.UndefOr[OnlineMeetingInfo] = js.native
  /**
    * Represents the online meeting service provider. The possible values are teamsForBusiness, skypeForBusiness, and
    * skypeForConsumer. Optional.
    */
  var onlineMeetingProvider: js.UndefOr[OnlineMeetingProviderType] = js.native
  /**
    * A URL for an online meeting. The property is set only when an organizer specifies an event as an online meeting such as
    * a Skype meeting. Read-only.
    */
  var onlineMeetingUrl: js.UndefOr[String] = js.native
  // The organizer of the event.
  var organizer: js.UndefOr[Recipient] = js.native
  /**
    * The end time zone that was set when the event was created. A value of tzone://Microsoft/Custom indicates that a legacy
    * custom time zone was set in desktop Outlook.
    */
  var originalEndTimeZone: js.UndefOr[String] = js.native
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var originalStart: js.UndefOr[String] = js.native
  /**
    * The start time zone that was set when the event was created. A value of tzone://Microsoft/Custom indicates that a
    * legacy custom time zone was set in desktop Outlook.
    */
  var originalStartTimeZone: js.UndefOr[String] = js.native
  // The recurrence pattern for the event.
  var recurrence: js.UndefOr[PatternedRecurrence] = js.native
  // The number of minutes before the event start time that the reminder alert occurs.
  var reminderMinutesBeforeStart: js.UndefOr[Double] = js.native
  // Set to true if the sender would like a response when the event is accepted or declined.
  var responseRequested: js.UndefOr[Boolean] = js.native
  // Indicates the type of response sent in response to an event message.
  var responseStatus: js.UndefOr[ResponseStatus] = js.native
  // The possible values are: normal, personal, private, confidential.
  var sensitivity: js.UndefOr[Sensitivity] = js.native
  // The ID for the recurring series master item, if this event is part of a recurring series.
  var seriesMasterId: js.UndefOr[String] = js.native
  // The status to show. The possible values are: free, tentative, busy, oof, workingElsewhere, unknown.
  var showAs: js.UndefOr[FreeBusyStatus] = js.native
  // The collection of single-value extended properties defined for the event. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[js.Array[SingleValueLegacyExtendedProperty]] = js.native
  // The date, time, and time zone that the event starts. By default, the start time is in UTC.
  var start: js.UndefOr[DateTimeTimeZone] = js.native
  // The text of the event's subject line.
  var subject: js.UndefOr[String] = js.native
  // The event type. The possible values are: singleInstance, occurrence, exception, seriesMaster. Read-only.
  var `type`: js.UndefOr[EventType] = js.native
  /**
    * The URL to open the event in Outlook on the web.Outlook on the web opens the event in the browser if you are signed in
    * to your mailbox. Otherwise, Outlook on the web prompts you to sign in.This URL can be accessed from within an iFrame.
    */
  var webLink: js.UndefOr[String] = js.native
}

object Event {
  @scala.inline
  def apply(): Event = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowNewTimeProposals(value: Boolean): Self = this.set("allowNewTimeProposals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowNewTimeProposals: Self = this.set("allowNewTimeProposals", js.undefined)
    @scala.inline
    def setAttachmentsVarargs(value: Attachment*): Self = this.set("attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: js.Array[Attachment]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    @scala.inline
    def setAttendeesVarargs(value: Attendee*): Self = this.set("attendees", js.Array(value :_*))
    @scala.inline
    def setAttendees(value: js.Array[Attendee]): Self = this.set("attendees", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttendees: Self = this.set("attendees", js.undefined)
    @scala.inline
    def setBody(value: ItemBody): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setBodyPreview(value: String): Self = this.set("bodyPreview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyPreview: Self = this.set("bodyPreview", js.undefined)
    @scala.inline
    def setCalendar(value: Calendar): Self = this.set("calendar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendar: Self = this.set("calendar", js.undefined)
    @scala.inline
    def setEnd(value: DateTimeTimeZone): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[Extension]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setHasAttachments(value: Boolean): Self = this.set("hasAttachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasAttachments: Self = this.set("hasAttachments", js.undefined)
    @scala.inline
    def setICalUId(value: String): Self = this.set("iCalUId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteICalUId: Self = this.set("iCalUId", js.undefined)
    @scala.inline
    def setImportance(value: Importance): Self = this.set("importance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportance: Self = this.set("importance", js.undefined)
    @scala.inline
    def setInstancesVarargs(value: Event*): Self = this.set("instances", js.Array(value :_*))
    @scala.inline
    def setInstances(value: js.Array[Event]): Self = this.set("instances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstances: Self = this.set("instances", js.undefined)
    @scala.inline
    def setIsAllDay(value: Boolean): Self = this.set("isAllDay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAllDay: Self = this.set("isAllDay", js.undefined)
    @scala.inline
    def setIsCancelled(value: Boolean): Self = this.set("isCancelled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCancelled: Self = this.set("isCancelled", js.undefined)
    @scala.inline
    def setIsOnlineMeeting(value: Boolean): Self = this.set("isOnlineMeeting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOnlineMeeting: Self = this.set("isOnlineMeeting", js.undefined)
    @scala.inline
    def setIsOrganizer(value: Boolean): Self = this.set("isOrganizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOrganizer: Self = this.set("isOrganizer", js.undefined)
    @scala.inline
    def setIsReminderOn(value: Boolean): Self = this.set("isReminderOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsReminderOn: Self = this.set("isReminderOn", js.undefined)
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setLocationsVarargs(value: Location*): Self = this.set("locations", js.Array(value :_*))
    @scala.inline
    def setLocations(value: js.Array[Location]): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    @scala.inline
    def setMultiValueExtendedPropertiesVarargs(value: MultiValueLegacyExtendedProperty*): Self = this.set("multiValueExtendedProperties", js.Array(value :_*))
    @scala.inline
    def setMultiValueExtendedProperties(value: js.Array[MultiValueLegacyExtendedProperty]): Self = this.set("multiValueExtendedProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiValueExtendedProperties: Self = this.set("multiValueExtendedProperties", js.undefined)
    @scala.inline
    def setOnlineMeeting(value: OnlineMeetingInfo): Self = this.set("onlineMeeting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlineMeeting: Self = this.set("onlineMeeting", js.undefined)
    @scala.inline
    def setOnlineMeetingProvider(value: OnlineMeetingProviderType): Self = this.set("onlineMeetingProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlineMeetingProvider: Self = this.set("onlineMeetingProvider", js.undefined)
    @scala.inline
    def setOnlineMeetingUrl(value: String): Self = this.set("onlineMeetingUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlineMeetingUrl: Self = this.set("onlineMeetingUrl", js.undefined)
    @scala.inline
    def setOrganizer(value: Recipient): Self = this.set("organizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizer: Self = this.set("organizer", js.undefined)
    @scala.inline
    def setOriginalEndTimeZone(value: String): Self = this.set("originalEndTimeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalEndTimeZone: Self = this.set("originalEndTimeZone", js.undefined)
    @scala.inline
    def setOriginalStart(value: String): Self = this.set("originalStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalStart: Self = this.set("originalStart", js.undefined)
    @scala.inline
    def setOriginalStartTimeZone(value: String): Self = this.set("originalStartTimeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalStartTimeZone: Self = this.set("originalStartTimeZone", js.undefined)
    @scala.inline
    def setRecurrence(value: PatternedRecurrence): Self = this.set("recurrence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurrence: Self = this.set("recurrence", js.undefined)
    @scala.inline
    def setReminderMinutesBeforeStart(value: Double): Self = this.set("reminderMinutesBeforeStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReminderMinutesBeforeStart: Self = this.set("reminderMinutesBeforeStart", js.undefined)
    @scala.inline
    def setResponseRequested(value: Boolean): Self = this.set("responseRequested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseRequested: Self = this.set("responseRequested", js.undefined)
    @scala.inline
    def setResponseStatus(value: ResponseStatus): Self = this.set("responseStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseStatus: Self = this.set("responseStatus", js.undefined)
    @scala.inline
    def setSensitivity(value: Sensitivity): Self = this.set("sensitivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSensitivity: Self = this.set("sensitivity", js.undefined)
    @scala.inline
    def setSeriesMasterId(value: String): Self = this.set("seriesMasterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeriesMasterId: Self = this.set("seriesMasterId", js.undefined)
    @scala.inline
    def setShowAs(value: FreeBusyStatus): Self = this.set("showAs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAs: Self = this.set("showAs", js.undefined)
    @scala.inline
    def setSingleValueExtendedPropertiesVarargs(value: SingleValueLegacyExtendedProperty*): Self = this.set("singleValueExtendedProperties", js.Array(value :_*))
    @scala.inline
    def setSingleValueExtendedProperties(value: js.Array[SingleValueLegacyExtendedProperty]): Self = this.set("singleValueExtendedProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleValueExtendedProperties: Self = this.set("singleValueExtendedProperties", js.undefined)
    @scala.inline
    def setStart(value: DateTimeTimeZone): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setType(value: EventType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWebLink(value: String): Self = this.set("webLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebLink: Self = this.set("webLink", js.undefined)
  }
  
}

