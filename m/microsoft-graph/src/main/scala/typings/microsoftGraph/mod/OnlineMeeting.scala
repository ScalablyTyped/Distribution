package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnlineMeeting
  extends StObject
     with Entity {
  
  // Indicates whether attendees can turn on their camera.
  var allowAttendeeToEnableCamera: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether attendees can turn on their microphone.
  var allowAttendeeToEnableMic: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Specifies the mode of meeting chat.
  var allowMeetingChat: js.UndefOr[NullableOption[MeetingChatMode]] = js.undefined
  
  // Indicates whether Teams reactions are enabled for the meeting.
  var allowTeamworkReactions: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Specifies who can be a presenter in a meeting. Possible values are listed in the following table.
  var allowedPresenters: js.UndefOr[NullableOption[OnlineMeetingPresenters]] = js.undefined
  
  // The attendance reports of an online meeting. Read-only.
  var attendanceReports: js.UndefOr[NullableOption[js.Array[MeetingAttendanceReport]]] = js.undefined
  
  // The content stream of the attendee report of a Microsoft Teams live event. Read-only.
  var attendeeReport: js.UndefOr[NullableOption[Any]] = js.undefined
  
  // The phone access (dial-in) information for an online meeting. Read-only.
  var audioConferencing: js.UndefOr[NullableOption[AudioConferencing]] = js.undefined
  
  // Settings related to a live event.
  var broadcastSettings: js.UndefOr[NullableOption[BroadcastMeetingSettings]] = js.undefined
  
  // The chat information associated with this online meeting.
  var chatInfo: js.UndefOr[NullableOption[ChatInfo]] = js.undefined
  
  // The meeting creation time in UTC. Read-only.
  var creationDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The meeting end time in UTC.
  var endDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  var externalId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates if this is a Teams live event.
  var isBroadcast: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether to announce when callers join or leave.
  var isEntryExitAnnounced: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * The join information in the language and locale variant specified in the Accept-Language request HTTP header.
    * Read-only.
    */
  var joinInformation: js.UndefOr[NullableOption[ItemBody]] = js.undefined
  
  /**
    * Specifies the joinMeetingId, the meeting passcode, and the requirement for the passcode. Once an onlineMeeting is
    * created, the joinMeetingIdSettings cannot be modified. To make any changes to this property, the meeting needs to be
    * canceled and a new one needs to be created.
    */
  var joinMeetingIdSettings: js.UndefOr[NullableOption[JoinMeetingIdSettings]] = js.undefined
  
  // The join URL of the online meeting. Read-only.
  var joinWebUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Specifies which participants can bypass the meeting lobby.
  var lobbyBypassSettings: js.UndefOr[NullableOption[LobbyBypassSettings]] = js.undefined
  
  // The participants associated with the online meeting. This includes the organizer and the attendees.
  var participants: js.UndefOr[NullableOption[MeetingParticipants]] = js.undefined
  
  // Indicates whether to record the meeting automatically.
  var recordAutomatically: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The meeting start time in UTC.
  var startDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The subject of the online meeting.
  var subject: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The video teleconferencing ID. Read-only.
  var videoTeleconferenceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Specifies whether a watermark should be applied to a content type by the client application.
  var watermarkProtection: js.UndefOr[NullableOption[WatermarkProtectionValues]] = js.undefined
}
object OnlineMeeting {
  
  inline def apply(): OnlineMeeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnlineMeeting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnlineMeeting] (val x: Self) extends AnyVal {
    
    inline def setAllowAttendeeToEnableCamera(value: NullableOption[Boolean]): Self = StObject.set(x, "allowAttendeeToEnableCamera", value.asInstanceOf[js.Any])
    
    inline def setAllowAttendeeToEnableCameraNull: Self = StObject.set(x, "allowAttendeeToEnableCamera", null)
    
    inline def setAllowAttendeeToEnableCameraUndefined: Self = StObject.set(x, "allowAttendeeToEnableCamera", js.undefined)
    
    inline def setAllowAttendeeToEnableMic(value: NullableOption[Boolean]): Self = StObject.set(x, "allowAttendeeToEnableMic", value.asInstanceOf[js.Any])
    
    inline def setAllowAttendeeToEnableMicNull: Self = StObject.set(x, "allowAttendeeToEnableMic", null)
    
    inline def setAllowAttendeeToEnableMicUndefined: Self = StObject.set(x, "allowAttendeeToEnableMic", js.undefined)
    
    inline def setAllowMeetingChat(value: NullableOption[MeetingChatMode]): Self = StObject.set(x, "allowMeetingChat", value.asInstanceOf[js.Any])
    
    inline def setAllowMeetingChatNull: Self = StObject.set(x, "allowMeetingChat", null)
    
    inline def setAllowMeetingChatUndefined: Self = StObject.set(x, "allowMeetingChat", js.undefined)
    
    inline def setAllowTeamworkReactions(value: NullableOption[Boolean]): Self = StObject.set(x, "allowTeamworkReactions", value.asInstanceOf[js.Any])
    
    inline def setAllowTeamworkReactionsNull: Self = StObject.set(x, "allowTeamworkReactions", null)
    
    inline def setAllowTeamworkReactionsUndefined: Self = StObject.set(x, "allowTeamworkReactions", js.undefined)
    
    inline def setAllowedPresenters(value: NullableOption[OnlineMeetingPresenters]): Self = StObject.set(x, "allowedPresenters", value.asInstanceOf[js.Any])
    
    inline def setAllowedPresentersNull: Self = StObject.set(x, "allowedPresenters", null)
    
    inline def setAllowedPresentersUndefined: Self = StObject.set(x, "allowedPresenters", js.undefined)
    
    inline def setAttendanceReports(value: NullableOption[js.Array[MeetingAttendanceReport]]): Self = StObject.set(x, "attendanceReports", value.asInstanceOf[js.Any])
    
    inline def setAttendanceReportsNull: Self = StObject.set(x, "attendanceReports", null)
    
    inline def setAttendanceReportsUndefined: Self = StObject.set(x, "attendanceReports", js.undefined)
    
    inline def setAttendanceReportsVarargs(value: MeetingAttendanceReport*): Self = StObject.set(x, "attendanceReports", js.Array(value*))
    
    inline def setAttendeeReport(value: NullableOption[Any]): Self = StObject.set(x, "attendeeReport", value.asInstanceOf[js.Any])
    
    inline def setAttendeeReportNull: Self = StObject.set(x, "attendeeReport", null)
    
    inline def setAttendeeReportUndefined: Self = StObject.set(x, "attendeeReport", js.undefined)
    
    inline def setAudioConferencing(value: NullableOption[AudioConferencing]): Self = StObject.set(x, "audioConferencing", value.asInstanceOf[js.Any])
    
    inline def setAudioConferencingNull: Self = StObject.set(x, "audioConferencing", null)
    
    inline def setAudioConferencingUndefined: Self = StObject.set(x, "audioConferencing", js.undefined)
    
    inline def setBroadcastSettings(value: NullableOption[BroadcastMeetingSettings]): Self = StObject.set(x, "broadcastSettings", value.asInstanceOf[js.Any])
    
    inline def setBroadcastSettingsNull: Self = StObject.set(x, "broadcastSettings", null)
    
    inline def setBroadcastSettingsUndefined: Self = StObject.set(x, "broadcastSettings", js.undefined)
    
    inline def setChatInfo(value: NullableOption[ChatInfo]): Self = StObject.set(x, "chatInfo", value.asInstanceOf[js.Any])
    
    inline def setChatInfoNull: Self = StObject.set(x, "chatInfo", null)
    
    inline def setChatInfoUndefined: Self = StObject.set(x, "chatInfo", js.undefined)
    
    inline def setCreationDateTime(value: NullableOption[String]): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeNull: Self = StObject.set(x, "creationDateTime", null)
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setEndDateTime(value: NullableOption[String]): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeNull: Self = StObject.set(x, "endDateTime", null)
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    inline def setExternalId(value: NullableOption[String]): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdNull: Self = StObject.set(x, "externalId", null)
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setIsBroadcast(value: NullableOption[Boolean]): Self = StObject.set(x, "isBroadcast", value.asInstanceOf[js.Any])
    
    inline def setIsBroadcastNull: Self = StObject.set(x, "isBroadcast", null)
    
    inline def setIsBroadcastUndefined: Self = StObject.set(x, "isBroadcast", js.undefined)
    
    inline def setIsEntryExitAnnounced(value: NullableOption[Boolean]): Self = StObject.set(x, "isEntryExitAnnounced", value.asInstanceOf[js.Any])
    
    inline def setIsEntryExitAnnouncedNull: Self = StObject.set(x, "isEntryExitAnnounced", null)
    
    inline def setIsEntryExitAnnouncedUndefined: Self = StObject.set(x, "isEntryExitAnnounced", js.undefined)
    
    inline def setJoinInformation(value: NullableOption[ItemBody]): Self = StObject.set(x, "joinInformation", value.asInstanceOf[js.Any])
    
    inline def setJoinInformationNull: Self = StObject.set(x, "joinInformation", null)
    
    inline def setJoinInformationUndefined: Self = StObject.set(x, "joinInformation", js.undefined)
    
    inline def setJoinMeetingIdSettings(value: NullableOption[JoinMeetingIdSettings]): Self = StObject.set(x, "joinMeetingIdSettings", value.asInstanceOf[js.Any])
    
    inline def setJoinMeetingIdSettingsNull: Self = StObject.set(x, "joinMeetingIdSettings", null)
    
    inline def setJoinMeetingIdSettingsUndefined: Self = StObject.set(x, "joinMeetingIdSettings", js.undefined)
    
    inline def setJoinWebUrl(value: NullableOption[String]): Self = StObject.set(x, "joinWebUrl", value.asInstanceOf[js.Any])
    
    inline def setJoinWebUrlNull: Self = StObject.set(x, "joinWebUrl", null)
    
    inline def setJoinWebUrlUndefined: Self = StObject.set(x, "joinWebUrl", js.undefined)
    
    inline def setLobbyBypassSettings(value: NullableOption[LobbyBypassSettings]): Self = StObject.set(x, "lobbyBypassSettings", value.asInstanceOf[js.Any])
    
    inline def setLobbyBypassSettingsNull: Self = StObject.set(x, "lobbyBypassSettings", null)
    
    inline def setLobbyBypassSettingsUndefined: Self = StObject.set(x, "lobbyBypassSettings", js.undefined)
    
    inline def setParticipants(value: NullableOption[MeetingParticipants]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
    
    inline def setParticipantsNull: Self = StObject.set(x, "participants", null)
    
    inline def setParticipantsUndefined: Self = StObject.set(x, "participants", js.undefined)
    
    inline def setRecordAutomatically(value: NullableOption[Boolean]): Self = StObject.set(x, "recordAutomatically", value.asInstanceOf[js.Any])
    
    inline def setRecordAutomaticallyNull: Self = StObject.set(x, "recordAutomatically", null)
    
    inline def setRecordAutomaticallyUndefined: Self = StObject.set(x, "recordAutomatically", js.undefined)
    
    inline def setStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    inline def setSubject(value: NullableOption[String]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectNull: Self = StObject.set(x, "subject", null)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setVideoTeleconferenceId(value: NullableOption[String]): Self = StObject.set(x, "videoTeleconferenceId", value.asInstanceOf[js.Any])
    
    inline def setVideoTeleconferenceIdNull: Self = StObject.set(x, "videoTeleconferenceId", null)
    
    inline def setVideoTeleconferenceIdUndefined: Self = StObject.set(x, "videoTeleconferenceId", js.undefined)
    
    inline def setWatermarkProtection(value: NullableOption[WatermarkProtectionValues]): Self = StObject.set(x, "watermarkProtection", value.asInstanceOf[js.Any])
    
    inline def setWatermarkProtectionNull: Self = StObject.set(x, "watermarkProtection", null)
    
    inline def setWatermarkProtectionUndefined: Self = StObject.set(x, "watermarkProtection", js.undefined)
  }
}
