package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Call
  extends StObject
     with Entity {
  
  /**
    * A unique identifier for all the participant calls in a conference or a unique identifier for two participant calls in a
    * P2P call. This needs to be copied over from Microsoft.Graph.Call.CallChainId.
    */
  var callChainId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var callOptions: js.UndefOr[NullableOption[CallOptions]] = js.undefined
  
  // The routing information on how the call was retargeted. Read-only.
  var callRoutes: js.UndefOr[NullableOption[js.Array[CallRoute]]] = js.undefined
  
  // The callback URL on which callbacks will be delivered. Must be https.
  var callbackUri: js.UndefOr[String] = js.undefined
  
  // The chat information. Required information for joining a meeting.
  var chatInfo: js.UndefOr[NullableOption[ChatInfo]] = js.undefined
  
  // The direction of the call. The possible value are incoming or outgoing. Read-only.
  var direction: js.UndefOr[NullableOption[CallDirection]] = js.undefined
  
  var incomingContext: js.UndefOr[NullableOption[IncomingContext]] = js.undefined
  
  // The media configuration. Required.
  var mediaConfig: js.UndefOr[NullableOption[MediaConfig]] = js.undefined
  
  // Read-only. The call media state.
  var mediaState: js.UndefOr[NullableOption[CallMediaState]] = js.undefined
  
  // The meeting information that's required for joining a meeting.
  var meetingInfo: js.UndefOr[NullableOption[MeetingInfo]] = js.undefined
  
  var myParticipantId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Read-only. Nullable.
  var operations: js.UndefOr[NullableOption[js.Array[CommsOperation]]] = js.undefined
  
  // Read-only. Nullable.
  var participants: js.UndefOr[NullableOption[js.Array[Participant]]] = js.undefined
  
  var requestedModalities: js.UndefOr[NullableOption[js.Array[Modality]]] = js.undefined
  
  var resultInfo: js.UndefOr[NullableOption[ResultInfo]] = js.undefined
  
  var source: js.UndefOr[NullableOption[ParticipantInfo]] = js.undefined
  
  var state: js.UndefOr[NullableOption[CallState]] = js.undefined
  
  var subject: js.UndefOr[NullableOption[String]] = js.undefined
  
  var targets: js.UndefOr[NullableOption[js.Array[InvitationParticipantInfo]]] = js.undefined
  
  var tenantId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var toneInfo: js.UndefOr[NullableOption[ToneInfo]] = js.undefined
  
  var transcription: js.UndefOr[NullableOption[CallTranscriptionInfo]] = js.undefined
}
object Call {
  
  @scala.inline
  def apply(): Call = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Call]
  }
  
  @scala.inline
  implicit class CallMutableBuilder[Self <: Call] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallChainId(value: NullableOption[String]): Self = StObject.set(x, "callChainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallChainIdNull: Self = StObject.set(x, "callChainId", null)
    
    @scala.inline
    def setCallChainIdUndefined: Self = StObject.set(x, "callChainId", js.undefined)
    
    @scala.inline
    def setCallOptions(value: NullableOption[CallOptions]): Self = StObject.set(x, "callOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallOptionsNull: Self = StObject.set(x, "callOptions", null)
    
    @scala.inline
    def setCallOptionsUndefined: Self = StObject.set(x, "callOptions", js.undefined)
    
    @scala.inline
    def setCallRoutes(value: NullableOption[js.Array[CallRoute]]): Self = StObject.set(x, "callRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallRoutesNull: Self = StObject.set(x, "callRoutes", null)
    
    @scala.inline
    def setCallRoutesUndefined: Self = StObject.set(x, "callRoutes", js.undefined)
    
    @scala.inline
    def setCallRoutesVarargs(value: CallRoute*): Self = StObject.set(x, "callRoutes", js.Array(value :_*))
    
    @scala.inline
    def setCallbackUri(value: String): Self = StObject.set(x, "callbackUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUriUndefined: Self = StObject.set(x, "callbackUri", js.undefined)
    
    @scala.inline
    def setChatInfo(value: NullableOption[ChatInfo]): Self = StObject.set(x, "chatInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChatInfoNull: Self = StObject.set(x, "chatInfo", null)
    
    @scala.inline
    def setChatInfoUndefined: Self = StObject.set(x, "chatInfo", js.undefined)
    
    @scala.inline
    def setDirection(value: NullableOption[CallDirection]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionNull: Self = StObject.set(x, "direction", null)
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setIncomingContext(value: NullableOption[IncomingContext]): Self = StObject.set(x, "incomingContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncomingContextNull: Self = StObject.set(x, "incomingContext", null)
    
    @scala.inline
    def setIncomingContextUndefined: Self = StObject.set(x, "incomingContext", js.undefined)
    
    @scala.inline
    def setMediaConfig(value: NullableOption[MediaConfig]): Self = StObject.set(x, "mediaConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaConfigNull: Self = StObject.set(x, "mediaConfig", null)
    
    @scala.inline
    def setMediaConfigUndefined: Self = StObject.set(x, "mediaConfig", js.undefined)
    
    @scala.inline
    def setMediaState(value: NullableOption[CallMediaState]): Self = StObject.set(x, "mediaState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaStateNull: Self = StObject.set(x, "mediaState", null)
    
    @scala.inline
    def setMediaStateUndefined: Self = StObject.set(x, "mediaState", js.undefined)
    
    @scala.inline
    def setMeetingInfo(value: NullableOption[MeetingInfo]): Self = StObject.set(x, "meetingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeetingInfoNull: Self = StObject.set(x, "meetingInfo", null)
    
    @scala.inline
    def setMeetingInfoUndefined: Self = StObject.set(x, "meetingInfo", js.undefined)
    
    @scala.inline
    def setMyParticipantId(value: NullableOption[String]): Self = StObject.set(x, "myParticipantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMyParticipantIdNull: Self = StObject.set(x, "myParticipantId", null)
    
    @scala.inline
    def setMyParticipantIdUndefined: Self = StObject.set(x, "myParticipantId", js.undefined)
    
    @scala.inline
    def setOperations(value: NullableOption[js.Array[CommsOperation]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsNull: Self = StObject.set(x, "operations", null)
    
    @scala.inline
    def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    @scala.inline
    def setOperationsVarargs(value: CommsOperation*): Self = StObject.set(x, "operations", js.Array(value :_*))
    
    @scala.inline
    def setParticipants(value: NullableOption[js.Array[Participant]]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantsNull: Self = StObject.set(x, "participants", null)
    
    @scala.inline
    def setParticipantsUndefined: Self = StObject.set(x, "participants", js.undefined)
    
    @scala.inline
    def setParticipantsVarargs(value: Participant*): Self = StObject.set(x, "participants", js.Array(value :_*))
    
    @scala.inline
    def setRequestedModalities(value: NullableOption[js.Array[Modality]]): Self = StObject.set(x, "requestedModalities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedModalitiesNull: Self = StObject.set(x, "requestedModalities", null)
    
    @scala.inline
    def setRequestedModalitiesUndefined: Self = StObject.set(x, "requestedModalities", js.undefined)
    
    @scala.inline
    def setRequestedModalitiesVarargs(value: Modality*): Self = StObject.set(x, "requestedModalities", js.Array(value :_*))
    
    @scala.inline
    def setResultInfo(value: NullableOption[ResultInfo]): Self = StObject.set(x, "resultInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultInfoNull: Self = StObject.set(x, "resultInfo", null)
    
    @scala.inline
    def setResultInfoUndefined: Self = StObject.set(x, "resultInfo", js.undefined)
    
    @scala.inline
    def setSource(value: NullableOption[ParticipantInfo]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNull: Self = StObject.set(x, "source", null)
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setState(value: NullableOption[CallState]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateNull: Self = StObject.set(x, "state", null)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setSubject(value: NullableOption[String]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectNull: Self = StObject.set(x, "subject", null)
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setTargets(value: NullableOption[js.Array[InvitationParticipantInfo]]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsNull: Self = StObject.set(x, "targets", null)
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: InvitationParticipantInfo*): Self = StObject.set(x, "targets", js.Array(value :_*))
    
    @scala.inline
    def setTenantId(value: NullableOption[String]): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
    
    @scala.inline
    def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    @scala.inline
    def setToneInfo(value: NullableOption[ToneInfo]): Self = StObject.set(x, "toneInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToneInfoNull: Self = StObject.set(x, "toneInfo", null)
    
    @scala.inline
    def setToneInfoUndefined: Self = StObject.set(x, "toneInfo", js.undefined)
    
    @scala.inline
    def setTranscription(value: NullableOption[CallTranscriptionInfo]): Self = StObject.set(x, "transcription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscriptionNull: Self = StObject.set(x, "transcription", null)
    
    @scala.inline
    def setTranscriptionUndefined: Self = StObject.set(x, "transcription", js.undefined)
  }
}
