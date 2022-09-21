package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event
  extends StObject
     with OutlookItem {
  
  /**
    * true if the meeting organizer allows invitees to propose a new time when responding; otherwise, false. Optional.
    * Default is true.
    */
  var allowNewTimeProposals: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * The collection of FileAttachment, ItemAttachment, and referenceAttachment attachments for the event. Navigation
    * property. Read-only. Nullable.
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
  
  // The collection of open extensions defined for the event. Nullable.
  var extensions: js.UndefOr[NullableOption[js.Array[Extension]]] = js.undefined
  
  // Set to true if the event has attachments.
  var hasAttachments: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * When set to true, each attendee only sees themselves in the meeting request and meeting Tracking list. Default is
    * false.
    */
  var hideAttendees: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * A unique identifier for an event across calendars. This ID is different for each occurrence in a recurring series.
    * Read-only.
    */
  var iCalUId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var importance: js.UndefOr[NullableOption[Importance]] = js.undefined
  
  /**
    * The occurrences of a recurring series, if the event is a series master. This property includes occurrences that are
    * part of the recurrence pattern, and exceptions that have been modified, but does not include occurrences that have been
    * cancelled from the series. Navigation property. Read-only. Nullable.
    */
  var instances: js.UndefOr[NullableOption[js.Array[Event]]] = js.undefined
  
  var isAllDay: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var isCancelled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var isDraft: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var isOnlineMeeting: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var isOrganizer: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var isReminderOn: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var location: js.UndefOr[NullableOption[Location]] = js.undefined
  
  var locations: js.UndefOr[NullableOption[js.Array[Location]]] = js.undefined
  
  // The collection of multi-value extended properties defined for the event. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[NullableOption[js.Array[MultiValueLegacyExtendedProperty]]] = js.undefined
  
  var onlineMeeting: js.UndefOr[NullableOption[OnlineMeetingInfo]] = js.undefined
  
  var onlineMeetingProvider: js.UndefOr[NullableOption[OnlineMeetingProviderType]] = js.undefined
  
  var onlineMeetingUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  var organizer: js.UndefOr[NullableOption[Recipient]] = js.undefined
  
  var originalEndTimeZone: js.UndefOr[NullableOption[String]] = js.undefined
  
  var originalStart: js.UndefOr[NullableOption[String]] = js.undefined
  
  var originalStartTimeZone: js.UndefOr[NullableOption[String]] = js.undefined
  
  var recurrence: js.UndefOr[NullableOption[PatternedRecurrence]] = js.undefined
  
  var reminderMinutesBeforeStart: js.UndefOr[NullableOption[Double]] = js.undefined
  
  var responseRequested: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var responseStatus: js.UndefOr[NullableOption[ResponseStatus]] = js.undefined
  
  var sensitivity: js.UndefOr[NullableOption[Sensitivity]] = js.undefined
  
  var seriesMasterId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var showAs: js.UndefOr[NullableOption[FreeBusyStatus]] = js.undefined
  
  // The collection of single-value extended properties defined for the event. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[NullableOption[js.Array[SingleValueLegacyExtendedProperty]]] = js.undefined
  
  var start: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.undefined
  
  var subject: js.UndefOr[NullableOption[String]] = js.undefined
  
  var transactionId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var `type`: js.UndefOr[NullableOption[EventType]] = js.undefined
  
  var webLink: js.UndefOr[NullableOption[String]] = js.undefined
}
object Event {
  
  inline def apply(): Event = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setAllowNewTimeProposals(value: NullableOption[Boolean]): Self = StObject.set(x, "allowNewTimeProposals", value.asInstanceOf[js.Any])
    
    inline def setAllowNewTimeProposalsNull: Self = StObject.set(x, "allowNewTimeProposals", null)
    
    inline def setAllowNewTimeProposalsUndefined: Self = StObject.set(x, "allowNewTimeProposals", js.undefined)
    
    inline def setAttachments(value: NullableOption[js.Array[Attachment]]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsNull: Self = StObject.set(x, "attachments", null)
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setAttendees(value: NullableOption[js.Array[Attendee]]): Self = StObject.set(x, "attendees", value.asInstanceOf[js.Any])
    
    inline def setAttendeesNull: Self = StObject.set(x, "attendees", null)
    
    inline def setAttendeesUndefined: Self = StObject.set(x, "attendees", js.undefined)
    
    inline def setAttendeesVarargs(value: Attendee*): Self = StObject.set(x, "attendees", js.Array(value*))
    
    inline def setBody(value: NullableOption[ItemBody]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyPreview(value: NullableOption[String]): Self = StObject.set(x, "bodyPreview", value.asInstanceOf[js.Any])
    
    inline def setBodyPreviewNull: Self = StObject.set(x, "bodyPreview", null)
    
    inline def setBodyPreviewUndefined: Self = StObject.set(x, "bodyPreview", js.undefined)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCalendar(value: NullableOption[Calendar]): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setCalendarNull: Self = StObject.set(x, "calendar", null)
    
    inline def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    inline def setEnd(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndNull: Self = StObject.set(x, "end", null)
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setExtensions(value: NullableOption[js.Array[Extension]]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsNull: Self = StObject.set(x, "extensions", null)
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setHasAttachments(value: NullableOption[Boolean]): Self = StObject.set(x, "hasAttachments", value.asInstanceOf[js.Any])
    
    inline def setHasAttachmentsNull: Self = StObject.set(x, "hasAttachments", null)
    
    inline def setHasAttachmentsUndefined: Self = StObject.set(x, "hasAttachments", js.undefined)
    
    inline def setHideAttendees(value: NullableOption[Boolean]): Self = StObject.set(x, "hideAttendees", value.asInstanceOf[js.Any])
    
    inline def setHideAttendeesNull: Self = StObject.set(x, "hideAttendees", null)
    
    inline def setHideAttendeesUndefined: Self = StObject.set(x, "hideAttendees", js.undefined)
    
    inline def setICalUId(value: NullableOption[String]): Self = StObject.set(x, "iCalUId", value.asInstanceOf[js.Any])
    
    inline def setICalUIdNull: Self = StObject.set(x, "iCalUId", null)
    
    inline def setICalUIdUndefined: Self = StObject.set(x, "iCalUId", js.undefined)
    
    inline def setImportance(value: NullableOption[Importance]): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
    
    inline def setImportanceNull: Self = StObject.set(x, "importance", null)
    
    inline def setImportanceUndefined: Self = StObject.set(x, "importance", js.undefined)
    
    inline def setInstances(value: NullableOption[js.Array[Event]]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesNull: Self = StObject.set(x, "instances", null)
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: Event*): Self = StObject.set(x, "instances", js.Array(value*))
    
    inline def setIsAllDay(value: NullableOption[Boolean]): Self = StObject.set(x, "isAllDay", value.asInstanceOf[js.Any])
    
    inline def setIsAllDayNull: Self = StObject.set(x, "isAllDay", null)
    
    inline def setIsAllDayUndefined: Self = StObject.set(x, "isAllDay", js.undefined)
    
    inline def setIsCancelled(value: NullableOption[Boolean]): Self = StObject.set(x, "isCancelled", value.asInstanceOf[js.Any])
    
    inline def setIsCancelledNull: Self = StObject.set(x, "isCancelled", null)
    
    inline def setIsCancelledUndefined: Self = StObject.set(x, "isCancelled", js.undefined)
    
    inline def setIsDraft(value: NullableOption[Boolean]): Self = StObject.set(x, "isDraft", value.asInstanceOf[js.Any])
    
    inline def setIsDraftNull: Self = StObject.set(x, "isDraft", null)
    
    inline def setIsDraftUndefined: Self = StObject.set(x, "isDraft", js.undefined)
    
    inline def setIsOnlineMeeting(value: NullableOption[Boolean]): Self = StObject.set(x, "isOnlineMeeting", value.asInstanceOf[js.Any])
    
    inline def setIsOnlineMeetingNull: Self = StObject.set(x, "isOnlineMeeting", null)
    
    inline def setIsOnlineMeetingUndefined: Self = StObject.set(x, "isOnlineMeeting", js.undefined)
    
    inline def setIsOrganizer(value: NullableOption[Boolean]): Self = StObject.set(x, "isOrganizer", value.asInstanceOf[js.Any])
    
    inline def setIsOrganizerNull: Self = StObject.set(x, "isOrganizer", null)
    
    inline def setIsOrganizerUndefined: Self = StObject.set(x, "isOrganizer", js.undefined)
    
    inline def setIsReminderOn(value: NullableOption[Boolean]): Self = StObject.set(x, "isReminderOn", value.asInstanceOf[js.Any])
    
    inline def setIsReminderOnNull: Self = StObject.set(x, "isReminderOn", null)
    
    inline def setIsReminderOnUndefined: Self = StObject.set(x, "isReminderOn", js.undefined)
    
    inline def setLocation(value: NullableOption[Location]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocations(value: NullableOption[js.Array[Location]]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsNull: Self = StObject.set(x, "locations", null)
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: Location*): Self = StObject.set(x, "locations", js.Array(value*))
    
    inline def setMultiValueExtendedProperties(value: NullableOption[js.Array[MultiValueLegacyExtendedProperty]]): Self = StObject.set(x, "multiValueExtendedProperties", value.asInstanceOf[js.Any])
    
    inline def setMultiValueExtendedPropertiesNull: Self = StObject.set(x, "multiValueExtendedProperties", null)
    
    inline def setMultiValueExtendedPropertiesUndefined: Self = StObject.set(x, "multiValueExtendedProperties", js.undefined)
    
    inline def setMultiValueExtendedPropertiesVarargs(value: MultiValueLegacyExtendedProperty*): Self = StObject.set(x, "multiValueExtendedProperties", js.Array(value*))
    
    inline def setOnlineMeeting(value: NullableOption[OnlineMeetingInfo]): Self = StObject.set(x, "onlineMeeting", value.asInstanceOf[js.Any])
    
    inline def setOnlineMeetingNull: Self = StObject.set(x, "onlineMeeting", null)
    
    inline def setOnlineMeetingProvider(value: NullableOption[OnlineMeetingProviderType]): Self = StObject.set(x, "onlineMeetingProvider", value.asInstanceOf[js.Any])
    
    inline def setOnlineMeetingProviderNull: Self = StObject.set(x, "onlineMeetingProvider", null)
    
    inline def setOnlineMeetingProviderUndefined: Self = StObject.set(x, "onlineMeetingProvider", js.undefined)
    
    inline def setOnlineMeetingUndefined: Self = StObject.set(x, "onlineMeeting", js.undefined)
    
    inline def setOnlineMeetingUrl(value: NullableOption[String]): Self = StObject.set(x, "onlineMeetingUrl", value.asInstanceOf[js.Any])
    
    inline def setOnlineMeetingUrlNull: Self = StObject.set(x, "onlineMeetingUrl", null)
    
    inline def setOnlineMeetingUrlUndefined: Self = StObject.set(x, "onlineMeetingUrl", js.undefined)
    
    inline def setOrganizer(value: NullableOption[Recipient]): Self = StObject.set(x, "organizer", value.asInstanceOf[js.Any])
    
    inline def setOrganizerNull: Self = StObject.set(x, "organizer", null)
    
    inline def setOrganizerUndefined: Self = StObject.set(x, "organizer", js.undefined)
    
    inline def setOriginalEndTimeZone(value: NullableOption[String]): Self = StObject.set(x, "originalEndTimeZone", value.asInstanceOf[js.Any])
    
    inline def setOriginalEndTimeZoneNull: Self = StObject.set(x, "originalEndTimeZone", null)
    
    inline def setOriginalEndTimeZoneUndefined: Self = StObject.set(x, "originalEndTimeZone", js.undefined)
    
    inline def setOriginalStart(value: NullableOption[String]): Self = StObject.set(x, "originalStart", value.asInstanceOf[js.Any])
    
    inline def setOriginalStartNull: Self = StObject.set(x, "originalStart", null)
    
    inline def setOriginalStartTimeZone(value: NullableOption[String]): Self = StObject.set(x, "originalStartTimeZone", value.asInstanceOf[js.Any])
    
    inline def setOriginalStartTimeZoneNull: Self = StObject.set(x, "originalStartTimeZone", null)
    
    inline def setOriginalStartTimeZoneUndefined: Self = StObject.set(x, "originalStartTimeZone", js.undefined)
    
    inline def setOriginalStartUndefined: Self = StObject.set(x, "originalStart", js.undefined)
    
    inline def setRecurrence(value: NullableOption[PatternedRecurrence]): Self = StObject.set(x, "recurrence", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceNull: Self = StObject.set(x, "recurrence", null)
    
    inline def setRecurrenceUndefined: Self = StObject.set(x, "recurrence", js.undefined)
    
    inline def setReminderMinutesBeforeStart(value: NullableOption[Double]): Self = StObject.set(x, "reminderMinutesBeforeStart", value.asInstanceOf[js.Any])
    
    inline def setReminderMinutesBeforeStartNull: Self = StObject.set(x, "reminderMinutesBeforeStart", null)
    
    inline def setReminderMinutesBeforeStartUndefined: Self = StObject.set(x, "reminderMinutesBeforeStart", js.undefined)
    
    inline def setResponseRequested(value: NullableOption[Boolean]): Self = StObject.set(x, "responseRequested", value.asInstanceOf[js.Any])
    
    inline def setResponseRequestedNull: Self = StObject.set(x, "responseRequested", null)
    
    inline def setResponseRequestedUndefined: Self = StObject.set(x, "responseRequested", js.undefined)
    
    inline def setResponseStatus(value: NullableOption[ResponseStatus]): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
    
    inline def setResponseStatusNull: Self = StObject.set(x, "responseStatus", null)
    
    inline def setResponseStatusUndefined: Self = StObject.set(x, "responseStatus", js.undefined)
    
    inline def setSensitivity(value: NullableOption[Sensitivity]): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
    
    inline def setSensitivityNull: Self = StObject.set(x, "sensitivity", null)
    
    inline def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
    
    inline def setSeriesMasterId(value: NullableOption[String]): Self = StObject.set(x, "seriesMasterId", value.asInstanceOf[js.Any])
    
    inline def setSeriesMasterIdNull: Self = StObject.set(x, "seriesMasterId", null)
    
    inline def setSeriesMasterIdUndefined: Self = StObject.set(x, "seriesMasterId", js.undefined)
    
    inline def setShowAs(value: NullableOption[FreeBusyStatus]): Self = StObject.set(x, "showAs", value.asInstanceOf[js.Any])
    
    inline def setShowAsNull: Self = StObject.set(x, "showAs", null)
    
    inline def setShowAsUndefined: Self = StObject.set(x, "showAs", js.undefined)
    
    inline def setSingleValueExtendedProperties(value: NullableOption[js.Array[SingleValueLegacyExtendedProperty]]): Self = StObject.set(x, "singleValueExtendedProperties", value.asInstanceOf[js.Any])
    
    inline def setSingleValueExtendedPropertiesNull: Self = StObject.set(x, "singleValueExtendedProperties", null)
    
    inline def setSingleValueExtendedPropertiesUndefined: Self = StObject.set(x, "singleValueExtendedProperties", js.undefined)
    
    inline def setSingleValueExtendedPropertiesVarargs(value: SingleValueLegacyExtendedProperty*): Self = StObject.set(x, "singleValueExtendedProperties", js.Array(value*))
    
    inline def setStart(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartNull: Self = StObject.set(x, "start", null)
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setSubject(value: NullableOption[String]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectNull: Self = StObject.set(x, "subject", null)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTransactionId(value: NullableOption[String]): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdNull: Self = StObject.set(x, "transactionId", null)
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
    
    inline def setType(value: NullableOption[EventType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWebLink(value: NullableOption[String]): Self = StObject.set(x, "webLink", value.asInstanceOf[js.Any])
    
    inline def setWebLinkNull: Self = StObject.set(x, "webLink", null)
    
    inline def setWebLinkUndefined: Self = StObject.set(x, "webLink", js.undefined)
  }
}
