package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends Entity {
  
  /**
    * A unique identifier for all the participant calls in a conference or a unique identifier for two participant calls in a
    * P2P call. This needs to be copied over from Microsoft.Graph.Call.CallChainId.
    */
  var callChainId: js.UndefOr[NullableOption[String]] = js.native
  
  var callOptions: js.UndefOr[NullableOption[CallOptions]] = js.native
  
  // The routing information on how the call was retargeted. Read-only.
  var callRoutes: js.UndefOr[NullableOption[js.Array[CallRoute]]] = js.native
  
  // The callback URL on which callbacks will be delivered. Must be https.
  var callbackUri: js.UndefOr[String] = js.native
  
  // The chat information. Required information for joining a meeting.
  var chatInfo: js.UndefOr[NullableOption[ChatInfo]] = js.native
  
  // The direction of the call. The possible value are incoming or outgoing. Read-only.
  var direction: js.UndefOr[NullableOption[CallDirection]] = js.native
  
  var incomingContext: js.UndefOr[NullableOption[IncomingContext]] = js.native
  
  // The media configuration. Required.
  var mediaConfig: js.UndefOr[NullableOption[MediaConfig]] = js.native
  
  // Read-only. The call media state.
  var mediaState: js.UndefOr[NullableOption[CallMediaState]] = js.native
  
  // The meeting information that's required for joining a meeting.
  var meetingInfo: js.UndefOr[NullableOption[MeetingInfo]] = js.native
  
  var myParticipantId: js.UndefOr[NullableOption[String]] = js.native
  
  // Read-only. Nullable.
  var operations: js.UndefOr[NullableOption[js.Array[CommsOperation]]] = js.native
  
  // Read-only. Nullable.
  var participants: js.UndefOr[NullableOption[js.Array[Participant]]] = js.native
  
  var requestedModalities: js.UndefOr[NullableOption[js.Array[Modality]]] = js.native
  
  var resultInfo: js.UndefOr[NullableOption[ResultInfo]] = js.native
  
  var source: js.UndefOr[NullableOption[ParticipantInfo]] = js.native
  
  var state: js.UndefOr[NullableOption[CallState]] = js.native
  
  var subject: js.UndefOr[NullableOption[String]] = js.native
  
  var targets: js.UndefOr[NullableOption[js.Array[InvitationParticipantInfo]]] = js.native
  
  var tenantId: js.UndefOr[NullableOption[String]] = js.native
  
  var toneInfo: js.UndefOr[NullableOption[ToneInfo]] = js.native
  
  var transcription: js.UndefOr[NullableOption[CallTranscriptionInfo]] = js.native
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
    def setCallChainId(value: NullableOption[String]): Self = this.set("callChainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallChainId: Self = this.set("callChainId", js.undefined)
    
    @scala.inline
    def setCallChainIdNull: Self = this.set("callChainId", null)
    
    @scala.inline
    def setCallOptions(value: NullableOption[CallOptions]): Self = this.set("callOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallOptions: Self = this.set("callOptions", js.undefined)
    
    @scala.inline
    def setCallOptionsNull: Self = this.set("callOptions", null)
    
    @scala.inline
    def setCallRoutesVarargs(value: CallRoute*): Self = this.set("callRoutes", js.Array(value :_*))
    
    @scala.inline
    def setCallRoutes(value: NullableOption[js.Array[CallRoute]]): Self = this.set("callRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallRoutes: Self = this.set("callRoutes", js.undefined)
    
    @scala.inline
    def setCallRoutesNull: Self = this.set("callRoutes", null)
    
    @scala.inline
    def setCallbackUri(value: String): Self = this.set("callbackUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbackUri: Self = this.set("callbackUri", js.undefined)
    
    @scala.inline
    def setChatInfo(value: NullableOption[ChatInfo]): Self = this.set("chatInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChatInfo: Self = this.set("chatInfo", js.undefined)
    
    @scala.inline
    def setChatInfoNull: Self = this.set("chatInfo", null)
    
    @scala.inline
    def setDirection(value: NullableOption[CallDirection]): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDirectionNull: Self = this.set("direction", null)
    
    @scala.inline
    def setIncomingContext(value: NullableOption[IncomingContext]): Self = this.set("incomingContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncomingContext: Self = this.set("incomingContext", js.undefined)
    
    @scala.inline
    def setIncomingContextNull: Self = this.set("incomingContext", null)
    
    @scala.inline
    def setMediaConfig(value: NullableOption[MediaConfig]): Self = this.set("mediaConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaConfig: Self = this.set("mediaConfig", js.undefined)
    
    @scala.inline
    def setMediaConfigNull: Self = this.set("mediaConfig", null)
    
    @scala.inline
    def setMediaState(value: NullableOption[CallMediaState]): Self = this.set("mediaState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaState: Self = this.set("mediaState", js.undefined)
    
    @scala.inline
    def setMediaStateNull: Self = this.set("mediaState", null)
    
    @scala.inline
    def setMeetingInfo(value: NullableOption[MeetingInfo]): Self = this.set("meetingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeetingInfo: Self = this.set("meetingInfo", js.undefined)
    
    @scala.inline
    def setMeetingInfoNull: Self = this.set("meetingInfo", null)
    
    @scala.inline
    def setMyParticipantId(value: NullableOption[String]): Self = this.set("myParticipantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMyParticipantId: Self = this.set("myParticipantId", js.undefined)
    
    @scala.inline
    def setMyParticipantIdNull: Self = this.set("myParticipantId", null)
    
    @scala.inline
    def setOperationsVarargs(value: CommsOperation*): Self = this.set("operations", js.Array(value :_*))
    
    @scala.inline
    def setOperations(value: NullableOption[js.Array[CommsOperation]]): Self = this.set("operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperations: Self = this.set("operations", js.undefined)
    
    @scala.inline
    def setOperationsNull: Self = this.set("operations", null)
    
    @scala.inline
    def setParticipantsVarargs(value: Participant*): Self = this.set("participants", js.Array(value :_*))
    
    @scala.inline
    def setParticipants(value: NullableOption[js.Array[Participant]]): Self = this.set("participants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParticipants: Self = this.set("participants", js.undefined)
    
    @scala.inline
    def setParticipantsNull: Self = this.set("participants", null)
    
    @scala.inline
    def setRequestedModalitiesVarargs(value: Modality*): Self = this.set("requestedModalities", js.Array(value :_*))
    
    @scala.inline
    def setRequestedModalities(value: NullableOption[js.Array[Modality]]): Self = this.set("requestedModalities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedModalities: Self = this.set("requestedModalities", js.undefined)
    
    @scala.inline
    def setRequestedModalitiesNull: Self = this.set("requestedModalities", null)
    
    @scala.inline
    def setResultInfo(value: NullableOption[ResultInfo]): Self = this.set("resultInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultInfo: Self = this.set("resultInfo", js.undefined)
    
    @scala.inline
    def setResultInfoNull: Self = this.set("resultInfo", null)
    
    @scala.inline
    def setSource(value: NullableOption[ParticipantInfo]): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSourceNull: Self = this.set("source", null)
    
    @scala.inline
    def setState(value: NullableOption[CallState]): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStateNull: Self = this.set("state", null)
    
    @scala.inline
    def setSubject(value: NullableOption[String]): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setSubjectNull: Self = this.set("subject", null)
    
    @scala.inline
    def setTargetsVarargs(value: InvitationParticipantInfo*): Self = this.set("targets", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: NullableOption[js.Array[InvitationParticipantInfo]]): Self = this.set("targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
    
    @scala.inline
    def setTargetsNull: Self = this.set("targets", null)
    
    @scala.inline
    def setTenantId(value: NullableOption[String]): Self = this.set("tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenantId: Self = this.set("tenantId", js.undefined)
    
    @scala.inline
    def setTenantIdNull: Self = this.set("tenantId", null)
    
    @scala.inline
    def setToneInfo(value: NullableOption[ToneInfo]): Self = this.set("toneInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToneInfo: Self = this.set("toneInfo", js.undefined)
    
    @scala.inline
    def setToneInfoNull: Self = this.set("toneInfo", null)
    
    @scala.inline
    def setTranscription(value: NullableOption[CallTranscriptionInfo]): Self = this.set("transcription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranscription: Self = this.set("transcription", js.undefined)
    
    @scala.inline
    def setTranscriptionNull: Self = this.set("transcription", null)
  }
}
