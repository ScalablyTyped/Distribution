package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnlineMeeting extends Entity {
  
  // Specifies who can be a presenter in a meeting. Possible values are listed in the following table.
  var allowedPresenters: js.UndefOr[NullableOption[OnlineMeetingPresenters]] = js.native
  
  // The phone access (dial-in) information for an online meeting. Read-only.
  var audioConferencing: js.UndefOr[NullableOption[AudioConferencing]] = js.native
  
  // The chat information associated with this online meeting.
  var chatInfo: js.UndefOr[NullableOption[ChatInfo]] = js.native
  
  // The meeting creation time in UTC. Read-only.
  var creationDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // The meeting end time in UTC.
  var endDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  var externalId: js.UndefOr[NullableOption[String]] = js.native
  
  // Whether or not to announce when callers join or leave.
  var isEntryExitAnnounced: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * The join information in the language and locale variant specified in the Accept-Language request HTTP header.
    * Read-only.
    */
  var joinInformation: js.UndefOr[NullableOption[ItemBody]] = js.native
  
  // The join URL of the online meeting. Read-only.
  var joinWebUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // Specifies which participants can bypass the meeting lobby.
  var lobbyBypassSettings: js.UndefOr[NullableOption[LobbyBypassSettings]] = js.native
  
  // The participants associated with the online meeting. This includes the organizer and the attendees.
  var participants: js.UndefOr[NullableOption[MeetingParticipants]] = js.native
  
  // The meeting start time in UTC.
  var startDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // The subject of the online meeting.
  var subject: js.UndefOr[NullableOption[String]] = js.native
  
  // The video teleconferencing ID. Read-only.
  var videoTeleconferenceId: js.UndefOr[NullableOption[String]] = js.native
}
object OnlineMeeting {
  
  @scala.inline
  def apply(): OnlineMeeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnlineMeeting]
  }
  
  @scala.inline
  implicit class OnlineMeetingMutableBuilder[Self <: OnlineMeeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedPresenters(value: NullableOption[OnlineMeetingPresenters]): Self = StObject.set(x, "allowedPresenters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedPresentersNull: Self = StObject.set(x, "allowedPresenters", null)
    
    @scala.inline
    def setAllowedPresentersUndefined: Self = StObject.set(x, "allowedPresenters", js.undefined)
    
    @scala.inline
    def setAudioConferencing(value: NullableOption[AudioConferencing]): Self = StObject.set(x, "audioConferencing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioConferencingNull: Self = StObject.set(x, "audioConferencing", null)
    
    @scala.inline
    def setAudioConferencingUndefined: Self = StObject.set(x, "audioConferencing", js.undefined)
    
    @scala.inline
    def setChatInfo(value: NullableOption[ChatInfo]): Self = StObject.set(x, "chatInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChatInfoNull: Self = StObject.set(x, "chatInfo", null)
    
    @scala.inline
    def setChatInfoUndefined: Self = StObject.set(x, "chatInfo", js.undefined)
    
    @scala.inline
    def setCreationDateTime(value: NullableOption[String]): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateTimeNull: Self = StObject.set(x, "creationDateTime", null)
    
    @scala.inline
    def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    @scala.inline
    def setEndDateTime(value: NullableOption[String]): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateTimeNull: Self = StObject.set(x, "endDateTime", null)
    
    @scala.inline
    def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    @scala.inline
    def setExternalId(value: NullableOption[String]): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIdNull: Self = StObject.set(x, "externalId", null)
    
    @scala.inline
    def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    @scala.inline
    def setIsEntryExitAnnounced(value: NullableOption[Boolean]): Self = StObject.set(x, "isEntryExitAnnounced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEntryExitAnnouncedNull: Self = StObject.set(x, "isEntryExitAnnounced", null)
    
    @scala.inline
    def setIsEntryExitAnnouncedUndefined: Self = StObject.set(x, "isEntryExitAnnounced", js.undefined)
    
    @scala.inline
    def setJoinInformation(value: NullableOption[ItemBody]): Self = StObject.set(x, "joinInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinInformationNull: Self = StObject.set(x, "joinInformation", null)
    
    @scala.inline
    def setJoinInformationUndefined: Self = StObject.set(x, "joinInformation", js.undefined)
    
    @scala.inline
    def setJoinWebUrl(value: NullableOption[String]): Self = StObject.set(x, "joinWebUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinWebUrlNull: Self = StObject.set(x, "joinWebUrl", null)
    
    @scala.inline
    def setJoinWebUrlUndefined: Self = StObject.set(x, "joinWebUrl", js.undefined)
    
    @scala.inline
    def setLobbyBypassSettings(value: NullableOption[LobbyBypassSettings]): Self = StObject.set(x, "lobbyBypassSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLobbyBypassSettingsNull: Self = StObject.set(x, "lobbyBypassSettings", null)
    
    @scala.inline
    def setLobbyBypassSettingsUndefined: Self = StObject.set(x, "lobbyBypassSettings", js.undefined)
    
    @scala.inline
    def setParticipants(value: NullableOption[MeetingParticipants]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantsNull: Self = StObject.set(x, "participants", null)
    
    @scala.inline
    def setParticipantsUndefined: Self = StObject.set(x, "participants", js.undefined)
    
    @scala.inline
    def setStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    @scala.inline
    def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    @scala.inline
    def setSubject(value: NullableOption[String]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectNull: Self = StObject.set(x, "subject", null)
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setVideoTeleconferenceId(value: NullableOption[String]): Self = StObject.set(x, "videoTeleconferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoTeleconferenceIdNull: Self = StObject.set(x, "videoTeleconferenceId", null)
    
    @scala.inline
    def setVideoTeleconferenceIdUndefined: Self = StObject.set(x, "videoTeleconferenceId", js.undefined)
  }
}
