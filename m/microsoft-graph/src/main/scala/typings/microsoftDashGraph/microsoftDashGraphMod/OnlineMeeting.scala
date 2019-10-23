package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnlineMeeting extends Entity {
  var audioConferencing: js.UndefOr[AudioConferencing] = js.undefined
  var chatInfo: js.UndefOr[ChatInfo] = js.undefined
  var creationDateTime: js.UndefOr[String] = js.undefined
  var endDateTime: js.UndefOr[String] = js.undefined
  var joinUrl: js.UndefOr[String] = js.undefined
  var participants: js.UndefOr[MeetingParticipants] = js.undefined
  var startDateTime: js.UndefOr[String] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
  var videoTeleconferenceId: js.UndefOr[String] = js.undefined
}

object OnlineMeeting {
  @scala.inline
  def apply(
    audioConferencing: AudioConferencing = null,
    chatInfo: ChatInfo = null,
    creationDateTime: String = null,
    endDateTime: String = null,
    id: String = null,
    joinUrl: String = null,
    participants: MeetingParticipants = null,
    startDateTime: String = null,
    subject: String = null,
    videoTeleconferenceId: String = null
  ): OnlineMeeting = {
    val __obj = js.Dynamic.literal()
    if (audioConferencing != null) __obj.updateDynamic("audioConferencing")(audioConferencing)
    if (chatInfo != null) __obj.updateDynamic("chatInfo")(chatInfo)
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime)
    if (endDateTime != null) __obj.updateDynamic("endDateTime")(endDateTime)
    if (id != null) __obj.updateDynamic("id")(id)
    if (joinUrl != null) __obj.updateDynamic("joinUrl")(joinUrl)
    if (participants != null) __obj.updateDynamic("participants")(participants)
    if (startDateTime != null) __obj.updateDynamic("startDateTime")(startDateTime)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (videoTeleconferenceId != null) __obj.updateDynamic("videoTeleconferenceId")(videoTeleconferenceId)
    __obj.asInstanceOf[OnlineMeeting]
  }
}

