package typings.microsoftGraph.mod

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
  implicit class OnlineMeetingOps[Self <: OnlineMeeting] (val x: Self) extends AnyVal {
    
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
    def setAllowedPresenters(value: NullableOption[OnlineMeetingPresenters]): Self = this.set("allowedPresenters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedPresenters: Self = this.set("allowedPresenters", js.undefined)
    
    @scala.inline
    def setAllowedPresentersNull: Self = this.set("allowedPresenters", null)
    
    @scala.inline
    def setAudioConferencing(value: NullableOption[AudioConferencing]): Self = this.set("audioConferencing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioConferencing: Self = this.set("audioConferencing", js.undefined)
    
    @scala.inline
    def setAudioConferencingNull: Self = this.set("audioConferencing", null)
    
    @scala.inline
    def setChatInfo(value: NullableOption[ChatInfo]): Self = this.set("chatInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChatInfo: Self = this.set("chatInfo", js.undefined)
    
    @scala.inline
    def setChatInfoNull: Self = this.set("chatInfo", null)
    
    @scala.inline
    def setCreationDateTime(value: NullableOption[String]): Self = this.set("creationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDateTime: Self = this.set("creationDateTime", js.undefined)
    
    @scala.inline
    def setCreationDateTimeNull: Self = this.set("creationDateTime", null)
    
    @scala.inline
    def setEndDateTime(value: NullableOption[String]): Self = this.set("endDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDateTime: Self = this.set("endDateTime", js.undefined)
    
    @scala.inline
    def setEndDateTimeNull: Self = this.set("endDateTime", null)
    
    @scala.inline
    def setExternalId(value: NullableOption[String]): Self = this.set("externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalId: Self = this.set("externalId", js.undefined)
    
    @scala.inline
    def setExternalIdNull: Self = this.set("externalId", null)
    
    @scala.inline
    def setIsEntryExitAnnounced(value: NullableOption[Boolean]): Self = this.set("isEntryExitAnnounced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEntryExitAnnounced: Self = this.set("isEntryExitAnnounced", js.undefined)
    
    @scala.inline
    def setIsEntryExitAnnouncedNull: Self = this.set("isEntryExitAnnounced", null)
    
    @scala.inline
    def setJoinInformation(value: NullableOption[ItemBody]): Self = this.set("joinInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinInformation: Self = this.set("joinInformation", js.undefined)
    
    @scala.inline
    def setJoinInformationNull: Self = this.set("joinInformation", null)
    
    @scala.inline
    def setJoinWebUrl(value: NullableOption[String]): Self = this.set("joinWebUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinWebUrl: Self = this.set("joinWebUrl", js.undefined)
    
    @scala.inline
    def setJoinWebUrlNull: Self = this.set("joinWebUrl", null)
    
    @scala.inline
    def setLobbyBypassSettings(value: NullableOption[LobbyBypassSettings]): Self = this.set("lobbyBypassSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLobbyBypassSettings: Self = this.set("lobbyBypassSettings", js.undefined)
    
    @scala.inline
    def setLobbyBypassSettingsNull: Self = this.set("lobbyBypassSettings", null)
    
    @scala.inline
    def setParticipants(value: NullableOption[MeetingParticipants]): Self = this.set("participants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParticipants: Self = this.set("participants", js.undefined)
    
    @scala.inline
    def setParticipantsNull: Self = this.set("participants", null)
    
    @scala.inline
    def setStartDateTime(value: NullableOption[String]): Self = this.set("startDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDateTime: Self = this.set("startDateTime", js.undefined)
    
    @scala.inline
    def setStartDateTimeNull: Self = this.set("startDateTime", null)
    
    @scala.inline
    def setSubject(value: NullableOption[String]): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setSubjectNull: Self = this.set("subject", null)
    
    @scala.inline
    def setVideoTeleconferenceId(value: NullableOption[String]): Self = this.set("videoTeleconferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoTeleconferenceId: Self = this.set("videoTeleconferenceId", js.undefined)
    
    @scala.inline
    def setVideoTeleconferenceIdNull: Self = this.set("videoTeleconferenceId", null)
  }
}
