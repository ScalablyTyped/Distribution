package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnlineMeeting extends Entity {
  // The phone access (dial-in) information for an online meeting. Read-only.
  var audioConferencing: js.UndefOr[AudioConferencing] = js.native
  // The chat information associated with this online meeting.
  var chatInfo: js.UndefOr[ChatInfo] = js.native
  // The meeting creation time in UTC. Read-only.
  var creationDateTime: js.UndefOr[String] = js.native
  // The meeting end time in UTC.
  var endDateTime: js.UndefOr[String] = js.native
  var externalId: js.UndefOr[String] = js.native
  /**
    * The join information in the language and locale variant specified in the Accept-Language request HTTP header.
    * Read-only.
    */
  var joinInformation: js.UndefOr[ItemBody] = js.native
  // The join URL of the online meeting. Read-only.
  var joinWebUrl: js.UndefOr[String] = js.native
  // The participants associated with the online meeting. This includes the organizer and the attendees.
  var participants: js.UndefOr[MeetingParticipants] = js.native
  // The meeting start time in UTC.
  var startDateTime: js.UndefOr[String] = js.native
  // The subject of the online meeting.
  var subject: js.UndefOr[String] = js.native
  // The video teleconferencing ID. Read-only.
  var videoTeleconferenceId: js.UndefOr[String] = js.native
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
    def setAudioConferencing(value: AudioConferencing): Self = this.set("audioConferencing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioConferencing: Self = this.set("audioConferencing", js.undefined)
    @scala.inline
    def setChatInfo(value: ChatInfo): Self = this.set("chatInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChatInfo: Self = this.set("chatInfo", js.undefined)
    @scala.inline
    def setCreationDateTime(value: String): Self = this.set("creationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDateTime: Self = this.set("creationDateTime", js.undefined)
    @scala.inline
    def setEndDateTime(value: String): Self = this.set("endDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDateTime: Self = this.set("endDateTime", js.undefined)
    @scala.inline
    def setExternalId(value: String): Self = this.set("externalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalId: Self = this.set("externalId", js.undefined)
    @scala.inline
    def setJoinInformation(value: ItemBody): Self = this.set("joinInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJoinInformation: Self = this.set("joinInformation", js.undefined)
    @scala.inline
    def setJoinWebUrl(value: String): Self = this.set("joinWebUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJoinWebUrl: Self = this.set("joinWebUrl", js.undefined)
    @scala.inline
    def setParticipants(value: MeetingParticipants): Self = this.set("participants", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParticipants: Self = this.set("participants", js.undefined)
    @scala.inline
    def setStartDateTime(value: String): Self = this.set("startDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDateTime: Self = this.set("startDateTime", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setVideoTeleconferenceId(value: String): Self = this.set("videoTeleconferenceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoTeleconferenceId: Self = this.set("videoTeleconferenceId", js.undefined)
  }
  
}

