package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Call extends Entity {
  /**
    * A unique identifier for all the participant calls in a conference or a unique identifier for two participant calls in a
    * P2P call. This needs to be copied over from Microsoft.Graph.Call.CallChainId.
    */
  var callChainId: js.UndefOr[String] = js.native
  var callOptions: js.UndefOr[CallOptions] = js.native
  // The routing information on how the call was retargeted. Read-only.
  var callRoutes: js.UndefOr[js.Array[CallRoute]] = js.native
  // The callback URL on which callbacks will be delivered. Must be https.
  var callbackUri: js.UndefOr[String] = js.native
  // The chat information. Required information for joining a meeting.
  var chatInfo: js.UndefOr[ChatInfo] = js.native
  // The direction of the call. The possible value are incoming or outgoing. Read-only.
  var direction: js.UndefOr[CallDirection] = js.native
  var incomingContext: js.UndefOr[IncomingContext] = js.native
  // The media configuration. Required.
  var mediaConfig: js.UndefOr[MediaConfig] = js.native
  // Read-only. The call media state.
  var mediaState: js.UndefOr[CallMediaState] = js.native
  // The meeting information that's required for joining a meeting.
  var meetingInfo: js.UndefOr[MeetingInfo] = js.native
  // Read-only.
  var myParticipantId: js.UndefOr[String] = js.native
  // Read-only. Nullable.
  var operations: js.UndefOr[js.Array[CommsOperation]] = js.native
  // Read-only. Nullable.
  var participants: js.UndefOr[js.Array[Participant]] = js.native
  // The list of requested modalities. Possible values are: unknown, audio, video, videoBasedScreenSharing, data.
  var requestedModalities: js.UndefOr[js.Array[Modality]] = js.native
  // The result information. For example can hold termination reason. Read-only.
  var resultInfo: js.UndefOr[ResultInfo] = js.native
  // The originator of the call.
  var source: js.UndefOr[ParticipantInfo] = js.native
  /**
    * The call state. Possible values are: incoming, establishing, ringing, established, hold, transferring,
    * transferAccepted, redirecting, terminating, terminated. Read-only.
    */
  var state: js.UndefOr[CallState] = js.native
  // The subject of the conversation.
  var subject: js.UndefOr[String] = js.native
  // The targets of the call. Required information for creating peer to peer call.
  var targets: js.UndefOr[js.Array[InvitationParticipantInfo]] = js.native
  var tenantId: js.UndefOr[String] = js.native
  var toneInfo: js.UndefOr[ToneInfo] = js.native
}

object Call {
  @scala.inline
  def apply(): Call = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Call]
  }
  @scala.inline
  implicit class CallOps[Self <: Call] (val x: Self) extends AnyVal {
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
    def setCallChainId(value: String): Self = this.set("callChainId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallChainId: Self = this.set("callChainId", js.undefined)
    @scala.inline
    def setCallOptions(value: CallOptions): Self = this.set("callOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallOptions: Self = this.set("callOptions", js.undefined)
    @scala.inline
    def setCallRoutesVarargs(value: CallRoute*): Self = this.set("callRoutes", js.Array(value :_*))
    @scala.inline
    def setCallRoutes(value: js.Array[CallRoute]): Self = this.set("callRoutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallRoutes: Self = this.set("callRoutes", js.undefined)
    @scala.inline
    def setCallbackUri(value: String): Self = this.set("callbackUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbackUri: Self = this.set("callbackUri", js.undefined)
    @scala.inline
    def setChatInfo(value: ChatInfo): Self = this.set("chatInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChatInfo: Self = this.set("chatInfo", js.undefined)
    @scala.inline
    def setDirection(value: CallDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setIncomingContext(value: IncomingContext): Self = this.set("incomingContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncomingContext: Self = this.set("incomingContext", js.undefined)
    @scala.inline
    def setMediaConfig(value: MediaConfig): Self = this.set("mediaConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaConfig: Self = this.set("mediaConfig", js.undefined)
    @scala.inline
    def setMediaState(value: CallMediaState): Self = this.set("mediaState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaState: Self = this.set("mediaState", js.undefined)
    @scala.inline
    def setMeetingInfo(value: MeetingInfo): Self = this.set("meetingInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeetingInfo: Self = this.set("meetingInfo", js.undefined)
    @scala.inline
    def setMyParticipantId(value: String): Self = this.set("myParticipantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMyParticipantId: Self = this.set("myParticipantId", js.undefined)
    @scala.inline
    def setOperationsVarargs(value: CommsOperation*): Self = this.set("operations", js.Array(value :_*))
    @scala.inline
    def setOperations(value: js.Array[CommsOperation]): Self = this.set("operations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperations: Self = this.set("operations", js.undefined)
    @scala.inline
    def setParticipantsVarargs(value: Participant*): Self = this.set("participants", js.Array(value :_*))
    @scala.inline
    def setParticipants(value: js.Array[Participant]): Self = this.set("participants", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParticipants: Self = this.set("participants", js.undefined)
    @scala.inline
    def setRequestedModalitiesVarargs(value: Modality*): Self = this.set("requestedModalities", js.Array(value :_*))
    @scala.inline
    def setRequestedModalities(value: js.Array[Modality]): Self = this.set("requestedModalities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestedModalities: Self = this.set("requestedModalities", js.undefined)
    @scala.inline
    def setResultInfo(value: ResultInfo): Self = this.set("resultInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultInfo: Self = this.set("resultInfo", js.undefined)
    @scala.inline
    def setSource(value: ParticipantInfo): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setState(value: CallState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setTargetsVarargs(value: InvitationParticipantInfo*): Self = this.set("targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: js.Array[InvitationParticipantInfo]): Self = this.set("targets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
    @scala.inline
    def setTenantId(value: String): Self = this.set("tenantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTenantId: Self = this.set("tenantId", js.undefined)
    @scala.inline
    def setToneInfo(value: ToneInfo): Self = this.set("toneInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToneInfo: Self = this.set("toneInfo", js.undefined)
  }
  
}

