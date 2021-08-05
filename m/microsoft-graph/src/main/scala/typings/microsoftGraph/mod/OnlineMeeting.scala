package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnlineMeeting
  extends StObject
     with Entity {
  
  // Specifies who can be a presenter in a meeting. Possible values are listed in the following table.
  var allowedPresenters: js.UndefOr[NullableOption[OnlineMeetingPresenters]] = js.undefined
  
  // The phone access (dial-in) information for an online meeting. Read-only.
  var audioConferencing: js.UndefOr[NullableOption[AudioConferencing]] = js.undefined
  
  // The chat information associated with this online meeting.
  var chatInfo: js.UndefOr[NullableOption[ChatInfo]] = js.undefined
  
  // The meeting creation time in UTC. Read-only.
  var creationDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The meeting end time in UTC.
  var endDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  var externalId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Whether or not to announce when callers join or leave.
  var isEntryExitAnnounced: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * The join information in the language and locale variant specified in the Accept-Language request HTTP header.
    * Read-only.
    */
  var joinInformation: js.UndefOr[NullableOption[ItemBody]] = js.undefined
  
  // The join URL of the online meeting. Read-only.
  var joinWebUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Specifies which participants can bypass the meeting lobby.
  var lobbyBypassSettings: js.UndefOr[NullableOption[LobbyBypassSettings]] = js.undefined
  
  // The participants associated with the online meeting. This includes the organizer and the attendees.
  var participants: js.UndefOr[NullableOption[MeetingParticipants]] = js.undefined
  
  // The meeting start time in UTC.
  var startDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The subject of the online meeting.
  var subject: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The video teleconferencing ID. Read-only.
  var videoTeleconferenceId: js.UndefOr[NullableOption[String]] = js.undefined
}
object OnlineMeeting {
  
  inline def apply(): OnlineMeeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnlineMeeting]
  }
  
  extension [Self <: OnlineMeeting](x: Self) {
    
    inline def setAllowedPresenters(value: NullableOption[OnlineMeetingPresenters]): Self = StObject.set(x, "allowedPresenters", value.asInstanceOf[js.Any])
    
    inline def setAllowedPresentersNull: Self = StObject.set(x, "allowedPresenters", null)
    
    inline def setAllowedPresentersUndefined: Self = StObject.set(x, "allowedPresenters", js.undefined)
    
    inline def setAudioConferencing(value: NullableOption[AudioConferencing]): Self = StObject.set(x, "audioConferencing", value.asInstanceOf[js.Any])
    
    inline def setAudioConferencingNull: Self = StObject.set(x, "audioConferencing", null)
    
    inline def setAudioConferencingUndefined: Self = StObject.set(x, "audioConferencing", js.undefined)
    
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
    
    inline def setIsEntryExitAnnounced(value: NullableOption[Boolean]): Self = StObject.set(x, "isEntryExitAnnounced", value.asInstanceOf[js.Any])
    
    inline def setIsEntryExitAnnouncedNull: Self = StObject.set(x, "isEntryExitAnnounced", null)
    
    inline def setIsEntryExitAnnouncedUndefined: Self = StObject.set(x, "isEntryExitAnnounced", js.undefined)
    
    inline def setJoinInformation(value: NullableOption[ItemBody]): Self = StObject.set(x, "joinInformation", value.asInstanceOf[js.Any])
    
    inline def setJoinInformationNull: Self = StObject.set(x, "joinInformation", null)
    
    inline def setJoinInformationUndefined: Self = StObject.set(x, "joinInformation", js.undefined)
    
    inline def setJoinWebUrl(value: NullableOption[String]): Self = StObject.set(x, "joinWebUrl", value.asInstanceOf[js.Any])
    
    inline def setJoinWebUrlNull: Self = StObject.set(x, "joinWebUrl", null)
    
    inline def setJoinWebUrlUndefined: Self = StObject.set(x, "joinWebUrl", js.undefined)
    
    inline def setLobbyBypassSettings(value: NullableOption[LobbyBypassSettings]): Self = StObject.set(x, "lobbyBypassSettings", value.asInstanceOf[js.Any])
    
    inline def setLobbyBypassSettingsNull: Self = StObject.set(x, "lobbyBypassSettings", null)
    
    inline def setLobbyBypassSettingsUndefined: Self = StObject.set(x, "lobbyBypassSettings", js.undefined)
    
    inline def setParticipants(value: NullableOption[MeetingParticipants]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
    
    inline def setParticipantsNull: Self = StObject.set(x, "participants", null)
    
    inline def setParticipantsUndefined: Self = StObject.set(x, "participants", js.undefined)
    
    inline def setStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    inline def setSubject(value: NullableOption[String]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectNull: Self = StObject.set(x, "subject", null)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setVideoTeleconferenceId(value: NullableOption[String]): Self = StObject.set(x, "videoTeleconferenceId", value.asInstanceOf[js.Any])
    
    inline def setVideoTeleconferenceIdNull: Self = StObject.set(x, "videoTeleconferenceId", null)
    
    inline def setVideoTeleconferenceIdUndefined: Self = StObject.set(x, "videoTeleconferenceId", js.undefined)
  }
}
