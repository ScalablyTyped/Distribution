package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Call extends Entity {
  var callbackUri: js.UndefOr[String] = js.undefined
  var chatInfo: js.UndefOr[ChatInfo] = js.undefined
  var direction: js.UndefOr[CallDirection] = js.undefined
  var mediaConfig: js.UndefOr[MediaConfig] = js.undefined
  var mediaState: js.UndefOr[CallMediaState] = js.undefined
  var meetingInfo: js.UndefOr[MeetingInfo] = js.undefined
  var myParticipantId: js.UndefOr[String] = js.undefined
  var operations: js.UndefOr[js.Array[CommsOperation]] = js.undefined
  var participants: js.UndefOr[js.Array[Participant]] = js.undefined
  var requestedModalities: js.UndefOr[js.Array[Modality]] = js.undefined
  var resultInfo: js.UndefOr[ResultInfo] = js.undefined
  var source: js.UndefOr[ParticipantInfo] = js.undefined
  var state: js.UndefOr[CallState] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
  var targets: js.UndefOr[js.Array[ParticipantInfo]] = js.undefined
  var tenantId: js.UndefOr[String] = js.undefined
  var toneInfo: js.UndefOr[ToneInfo] = js.undefined
}

object Call {
  @scala.inline
  def apply(
    callbackUri: String = null,
    chatInfo: ChatInfo = null,
    direction: CallDirection = null,
    id: String = null,
    mediaConfig: MediaConfig = null,
    mediaState: CallMediaState = null,
    meetingInfo: MeetingInfo = null,
    myParticipantId: String = null,
    operations: js.Array[CommsOperation] = null,
    participants: js.Array[Participant] = null,
    requestedModalities: js.Array[Modality] = null,
    resultInfo: ResultInfo = null,
    source: ParticipantInfo = null,
    state: CallState = null,
    subject: String = null,
    targets: js.Array[ParticipantInfo] = null,
    tenantId: String = null,
    toneInfo: ToneInfo = null
  ): Call = {
    val __obj = js.Dynamic.literal()
    if (callbackUri != null) __obj.updateDynamic("callbackUri")(callbackUri.asInstanceOf[js.Any])
    if (chatInfo != null) __obj.updateDynamic("chatInfo")(chatInfo.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (mediaConfig != null) __obj.updateDynamic("mediaConfig")(mediaConfig.asInstanceOf[js.Any])
    if (mediaState != null) __obj.updateDynamic("mediaState")(mediaState.asInstanceOf[js.Any])
    if (meetingInfo != null) __obj.updateDynamic("meetingInfo")(meetingInfo.asInstanceOf[js.Any])
    if (myParticipantId != null) __obj.updateDynamic("myParticipantId")(myParticipantId.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    if (participants != null) __obj.updateDynamic("participants")(participants.asInstanceOf[js.Any])
    if (requestedModalities != null) __obj.updateDynamic("requestedModalities")(requestedModalities.asInstanceOf[js.Any])
    if (resultInfo != null) __obj.updateDynamic("resultInfo")(resultInfo.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    if (tenantId != null) __obj.updateDynamic("tenantId")(tenantId.asInstanceOf[js.Any])
    if (toneInfo != null) __obj.updateDynamic("toneInfo")(toneInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Call]
  }
}

