package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event
  extends StObject
     with OutlookItem {
  
  /**
    * True if the meeting organizer allows invitees to propose a new time when responding, false otherwise. Optional. Default
    * is true.
    */
  var allowNewTimeProposals: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * The collection of fileAttachment and itemAttachment attachments for the event. Navigation property. Read-only.
    * Nullable.
    */
  var attachments: js.UndefOr[NullableOption[js.Array[Attachment]]] = js.undefined
  
  // The collection of attendees for the event.
  var attendees: js.UndefOr[NullableOption[js.Array[Attendee]]] = js.undefined
  
  // The body of the message associated with the event. It can be in HTML or text format.
  var body: js.UndefOr[NullableOption[ItemBody]] = js.undefined
  
  // The preview of the message associated with the event. It is in text format.
  var bodyPreview: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The calendar that contains the event. Navigation property. Read-only.
  var calendar: js.UndefOr[NullableOption[Calendar]] = js.undefined
  
  // The date, time, and time zone that the event ends. By default, the end time is in UTC.
  var end: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.undefined
  
  // The collection of open extensions defined for the event. Read-only. Nullable.
  var extensions: js.UndefOr[NullableOption[js.Array[Extension]]] = js.undefined
  
  // Set to true if the event has attachments.
  var hasAttachments: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * A unique identifier for an event across calendars. This ID is different for each occurrence in a recurring series.
    * Read-only.
    */
  var iCalUId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The importance of the event. The possible values are: low, normal, high.
  var importance: js.UndefOr[NullableOption[Importance]] = js.undefined
  
  // The instances of the event. Navigation property. Read-only. Nullable.
  var instances: js.UndefOr[NullableOption[js.Array[Event]]] = js.undefined
  
  // Set to true if the event lasts all day.
  var isAllDay: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Set to true if the event has been canceled.
  var isCancelled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var isDraft: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // True if this event has online meeting information, false otherwise. Default is false. Optional.
  var isOnlineMeeting: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Set to true if the calendar owner (specified by the owner property of the calendar) is the organizer of the event
    * (specified by the organizer property of the event). This also applies if a delegate organized the event on behalf of
    * the owner.
    */
  var isOrganizer: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Set to true if an alert is set to remind the user of the event.
  var isReminderOn: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The location of the event.
  var location: js.UndefOr[NullableOption[Location]] = js.undefined
  
  /**
    * The locations where the event is held or attended from. The location and locations properties always correspond with
    * each other. If you update the location property, any prior locations in the locations collection would be removed and
    * replaced by the new location value.
    */
  var locations: js.UndefOr[NullableOption[js.Array[Location]]] = js.undefined
  
  // The collection of multi-value extended properties defined for the event. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[NullableOption[js.Array[MultiValueLegacyExtendedProperty]]] = js.undefined
  
  // Details for an attendee to join the meeting online. Read-only.
  var onlineMeeting: js.UndefOr[NullableOption[OnlineMeetingInfo]] = js.undefined
  
  /**
    * Represents the online meeting service provider. The possible values are teamsForBusiness, skypeForBusiness, and
    * skypeForConsumer. Optional.
    */
  var onlineMeetingProvider: js.UndefOr[NullableOption[OnlineMeetingProviderType]] = js.undefined
  
  /**
    * A URL for an online meeting. The property is set only when an organizer specifies an event as an online meeting such as
    * a Skype meeting. Read-only.
    */
  var onlineMeetingUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The organizer of the event.
  var organizer: js.UndefOr[NullableOption[Recipient]] = js.undefined
  
  /**
    * The end time zone that was set when the event was created. A value of tzone://Microsoft/Custom indicates that a legacy
    * custom time zone was set in desktop Outlook.
    */
  var originalEndTimeZone: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var originalStart: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The start time zone that was set when the event was created. A value of tzone://Microsoft/Custom indicates that a
    * legacy custom time zone was set in desktop Outlook.
    */
  var originalStartTimeZone: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The recurrence pattern for the event.
  var recurrence: js.UndefOr[NullableOption[PatternedRecurrence]] = js.undefined
  
  // The number of minutes before the event start time that the reminder alert occurs.
  var reminderMinutesBeforeStart: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Default is true, which represents the organizer would like an invitee to send a response to the event.
  var responseRequested: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates the type of response sent in response to an event message.
  var responseStatus: js.UndefOr[NullableOption[ResponseStatus]] = js.undefined
  
  // The possible values are: normal, personal, private, confidential.
  var sensitivity: js.UndefOr[NullableOption[Sensitivity]] = js.undefined
  
  // The ID for the recurring series master item, if this event is part of a recurring series.
  var seriesMasterId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The status to show. The possible values are: free, tentative, busy, oof, workingElsewhere, unknown.
  var showAs: js.UndefOr[NullableOption[FreeBusyStatus]] = js.undefined
  
  // The collection of single-value extended properties defined for the event. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[NullableOption[js.Array[SingleValueLegacyExtendedProperty]]] = js.undefined
  
  // The date, time, and time zone that the event starts. By default, the start time is in UTC.
  var start: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.undefined
  
  // The text of the event's subject line.
  var subject: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * A custom identifier specified by a client app for the server to avoid redundant POST operations in case of client
    * retries to create the same event. This is useful when low network connectivity causes the client to time out before
    * receiving a response from the server for the client's prior create-event request. After you set transactionId when
    * creating an event, you cannot change transactionId in a subsequent update. This property is only returned in a response
    * payload if an app has set it. Optional.
    */
  var transactionId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The event type. The possible values are: singleInstance, occurrence, exception, seriesMaster. Read-only.
  var `type`: js.UndefOr[NullableOption[EventType]] = js.undefined
  
  /**
    * The URL to open the event in Outlook on the web.Outlook on the web opens the event in the browser if you are signed in
    * to your mailbox. Otherwise, Outlook on the web prompts you to sign in.This URL cannot be accessed from within an
    * iFrame.
    */
  var webLink: js.UndefOr[NullableOption[String]] = js.undefined
}
object Event {
  
  @scala.inline
  def apply(): Event = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowNewTimeProposals(value: NullableOption[Boolean]): Self = StObject.set(x, "allowNewTimeProposals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNewTimeProposalsNull: Self = StObject.set(x, "allowNewTimeProposals", null)
    
    @scala.inline
    def setAllowNewTimeProposalsUndefined: Self = StObject.set(x, "allowNewTimeProposals", js.undefined)
    
    @scala.inline
    def setAttachments(value: NullableOption[js.Array[Attachment]]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsNull: Self = StObject.set(x, "attachments", null)
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    @scala.inline
    def setAttendees(value: NullableOption[js.Array[Attendee]]): Self = StObject.set(x, "attendees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttendeesNull: Self = StObject.set(x, "attendees", null)
    
    @scala.inline
    def setAttendeesUndefined: Self = StObject.set(x, "attendees", js.undefined)
    
    @scala.inline
    def setAttendeesVarargs(value: Attendee*): Self = StObject.set(x, "attendees", js.Array(value :_*))
    
    @scala.inline
    def setBody(value: NullableOption[ItemBody]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyNull: Self = StObject.set(x, "body", null)
    
    @scala.inline
    def setBodyPreview(value: NullableOption[String]): Self = StObject.set(x, "bodyPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyPreviewNull: Self = StObject.set(x, "bodyPreview", null)
    
    @scala.inline
    def setBodyPreviewUndefined: Self = StObject.set(x, "bodyPreview", js.undefined)
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setCalendar(value: NullableOption[Calendar]): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarNull: Self = StObject.set(x, "calendar", null)
    
    @scala.inline
    def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    @scala.inline
    def setEnd(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndNull: Self = StObject.set(x, "end", null)
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setExtensions(value: NullableOption[js.Array[Extension]]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsNull: Self = StObject.set(x, "extensions", null)
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setHasAttachments(value: NullableOption[Boolean]): Self = StObject.set(x, "hasAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAttachmentsNull: Self = StObject.set(x, "hasAttachments", null)
    
    @scala.inline
    def setHasAttachmentsUndefined: Self = StObject.set(x, "hasAttachments", js.undefined)
    
    @scala.inline
    def setICalUId(value: NullableOption[String]): Self = StObject.set(x, "iCalUId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setICalUIdNull: Self = StObject.set(x, "iCalUId", null)
    
    @scala.inline
    def setICalUIdUndefined: Self = StObject.set(x, "iCalUId", js.undefined)
    
    @scala.inline
    def setImportance(value: NullableOption[Importance]): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportanceNull: Self = StObject.set(x, "importance", null)
    
    @scala.inline
    def setImportanceUndefined: Self = StObject.set(x, "importance", js.undefined)
    
    @scala.inline
    def setInstances(value: NullableOption[js.Array[Event]]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesNull: Self = StObject.set(x, "instances", null)
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: Event*): Self = StObject.set(x, "instances", js.Array(value :_*))
    
    @scala.inline
    def setIsAllDay(value: NullableOption[Boolean]): Self = StObject.set(x, "isAllDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAllDayNull: Self = StObject.set(x, "isAllDay", null)
    
    @scala.inline
    def setIsAllDayUndefined: Self = StObject.set(x, "isAllDay", js.undefined)
    
    @scala.inline
    def setIsCancelled(value: NullableOption[Boolean]): Self = StObject.set(x, "isCancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCancelledNull: Self = StObject.set(x, "isCancelled", null)
    
    @scala.inline
    def setIsCancelledUndefined: Self = StObject.set(x, "isCancelled", js.undefined)
    
    @scala.inline
    def setIsDraft(value: NullableOption[Boolean]): Self = StObject.set(x, "isDraft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDraftNull: Self = StObject.set(x, "isDraft", null)
    
    @scala.inline
    def setIsDraftUndefined: Self = StObject.set(x, "isDraft", js.undefined)
    
    @scala.inline
    def setIsOnlineMeeting(value: NullableOption[Boolean]): Self = StObject.set(x, "isOnlineMeeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOnlineMeetingNull: Self = StObject.set(x, "isOnlineMeeting", null)
    
    @scala.inline
    def setIsOnlineMeetingUndefined: Self = StObject.set(x, "isOnlineMeeting", js.undefined)
    
    @scala.inline
    def setIsOrganizer(value: NullableOption[Boolean]): Self = StObject.set(x, "isOrganizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOrganizerNull: Self = StObject.set(x, "isOrganizer", null)
    
    @scala.inline
    def setIsOrganizerUndefined: Self = StObject.set(x, "isOrganizer", js.undefined)
    
    @scala.inline
    def setIsReminderOn(value: NullableOption[Boolean]): Self = StObject.set(x, "isReminderOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReminderOnNull: Self = StObject.set(x, "isReminderOn", null)
    
    @scala.inline
    def setIsReminderOnUndefined: Self = StObject.set(x, "isReminderOn", js.undefined)
    
    @scala.inline
    def setLocation(value: NullableOption[Location]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationNull: Self = StObject.set(x, "location", null)
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setLocations(value: NullableOption[js.Array[Location]]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsNull: Self = StObject.set(x, "locations", null)
    
    @scala.inline
    def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    @scala.inline
    def setLocationsVarargs(value: Location*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    @scala.inline
    def setMultiValueExtendedProperties(value: NullableOption[js.Array[MultiValueLegacyExtendedProperty]]): Self = StObject.set(x, "multiValueExtendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValueExtendedPropertiesNull: Self = StObject.set(x, "multiValueExtendedProperties", null)
    
    @scala.inline
    def setMultiValueExtendedPropertiesUndefined: Self = StObject.set(x, "multiValueExtendedProperties", js.undefined)
    
    @scala.inline
    def setMultiValueExtendedPropertiesVarargs(value: MultiValueLegacyExtendedProperty*): Self = StObject.set(x, "multiValueExtendedProperties", js.Array(value :_*))
    
    @scala.inline
    def setOnlineMeeting(value: NullableOption[OnlineMeetingInfo]): Self = StObject.set(x, "onlineMeeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlineMeetingNull: Self = StObject.set(x, "onlineMeeting", null)
    
    @scala.inline
    def setOnlineMeetingProvider(value: NullableOption[OnlineMeetingProviderType]): Self = StObject.set(x, "onlineMeetingProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlineMeetingProviderNull: Self = StObject.set(x, "onlineMeetingProvider", null)
    
    @scala.inline
    def setOnlineMeetingProviderUndefined: Self = StObject.set(x, "onlineMeetingProvider", js.undefined)
    
    @scala.inline
    def setOnlineMeetingUndefined: Self = StObject.set(x, "onlineMeeting", js.undefined)
    
    @scala.inline
    def setOnlineMeetingUrl(value: NullableOption[String]): Self = StObject.set(x, "onlineMeetingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlineMeetingUrlNull: Self = StObject.set(x, "onlineMeetingUrl", null)
    
    @scala.inline
    def setOnlineMeetingUrlUndefined: Self = StObject.set(x, "onlineMeetingUrl", js.undefined)
    
    @scala.inline
    def setOrganizer(value: NullableOption[Recipient]): Self = StObject.set(x, "organizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizerNull: Self = StObject.set(x, "organizer", null)
    
    @scala.inline
    def setOrganizerUndefined: Self = StObject.set(x, "organizer", js.undefined)
    
    @scala.inline
    def setOriginalEndTimeZone(value: NullableOption[String]): Self = StObject.set(x, "originalEndTimeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEndTimeZoneNull: Self = StObject.set(x, "originalEndTimeZone", null)
    
    @scala.inline
    def setOriginalEndTimeZoneUndefined: Self = StObject.set(x, "originalEndTimeZone", js.undefined)
    
    @scala.inline
    def setOriginalStart(value: NullableOption[String]): Self = StObject.set(x, "originalStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalStartNull: Self = StObject.set(x, "originalStart", null)
    
    @scala.inline
    def setOriginalStartTimeZone(value: NullableOption[String]): Self = StObject.set(x, "originalStartTimeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalStartTimeZoneNull: Self = StObject.set(x, "originalStartTimeZone", null)
    
    @scala.inline
    def setOriginalStartTimeZoneUndefined: Self = StObject.set(x, "originalStartTimeZone", js.undefined)
    
    @scala.inline
    def setOriginalStartUndefined: Self = StObject.set(x, "originalStart", js.undefined)
    
    @scala.inline
    def setRecurrence(value: NullableOption[PatternedRecurrence]): Self = StObject.set(x, "recurrence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurrenceNull: Self = StObject.set(x, "recurrence", null)
    
    @scala.inline
    def setRecurrenceUndefined: Self = StObject.set(x, "recurrence", js.undefined)
    
    @scala.inline
    def setReminderMinutesBeforeStart(value: NullableOption[Double]): Self = StObject.set(x, "reminderMinutesBeforeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReminderMinutesBeforeStartNull: Self = StObject.set(x, "reminderMinutesBeforeStart", null)
    
    @scala.inline
    def setReminderMinutesBeforeStartUndefined: Self = StObject.set(x, "reminderMinutesBeforeStart", js.undefined)
    
    @scala.inline
    def setResponseRequested(value: NullableOption[Boolean]): Self = StObject.set(x, "responseRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseRequestedNull: Self = StObject.set(x, "responseRequested", null)
    
    @scala.inline
    def setResponseRequestedUndefined: Self = StObject.set(x, "responseRequested", js.undefined)
    
    @scala.inline
    def setResponseStatus(value: NullableOption[ResponseStatus]): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseStatusNull: Self = StObject.set(x, "responseStatus", null)
    
    @scala.inline
    def setResponseStatusUndefined: Self = StObject.set(x, "responseStatus", js.undefined)
    
    @scala.inline
    def setSensitivity(value: NullableOption[Sensitivity]): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensitivityNull: Self = StObject.set(x, "sensitivity", null)
    
    @scala.inline
    def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
    
    @scala.inline
    def setSeriesMasterId(value: NullableOption[String]): Self = StObject.set(x, "seriesMasterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesMasterIdNull: Self = StObject.set(x, "seriesMasterId", null)
    
    @scala.inline
    def setSeriesMasterIdUndefined: Self = StObject.set(x, "seriesMasterId", js.undefined)
    
    @scala.inline
    def setShowAs(value: NullableOption[FreeBusyStatus]): Self = StObject.set(x, "showAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAsNull: Self = StObject.set(x, "showAs", null)
    
    @scala.inline
    def setShowAsUndefined: Self = StObject.set(x, "showAs", js.undefined)
    
    @scala.inline
    def setSingleValueExtendedProperties(value: NullableOption[js.Array[SingleValueLegacyExtendedProperty]]): Self = StObject.set(x, "singleValueExtendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleValueExtendedPropertiesNull: Self = StObject.set(x, "singleValueExtendedProperties", null)
    
    @scala.inline
    def setSingleValueExtendedPropertiesUndefined: Self = StObject.set(x, "singleValueExtendedProperties", js.undefined)
    
    @scala.inline
    def setSingleValueExtendedPropertiesVarargs(value: SingleValueLegacyExtendedProperty*): Self = StObject.set(x, "singleValueExtendedProperties", js.Array(value :_*))
    
    @scala.inline
    def setStart(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartNull: Self = StObject.set(x, "start", null)
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setSubject(value: NullableOption[String]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectNull: Self = StObject.set(x, "subject", null)
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setTransactionId(value: NullableOption[String]): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIdNull: Self = StObject.set(x, "transactionId", null)
    
    @scala.inline
    def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
    
    @scala.inline
    def setType(value: NullableOption[EventType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWebLink(value: NullableOption[String]): Self = StObject.set(x, "webLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebLinkNull: Self = StObject.set(x, "webLink", null)
    
    @scala.inline
    def setWebLinkUndefined: Self = StObject.set(x, "webLink", js.undefined)
  }
}
