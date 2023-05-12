package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Call
  extends StObject
     with Entity {
  
  var audioRoutingGroups: js.UndefOr[NullableOption[js.Array[AudioRoutingGroup]]] = js.undefined
  
  /**
    * A unique identifier for all the participant calls in a conference or a unique identifier for two participant calls in a
    * P2P call. This needs to be copied over from Microsoft.Graph.Call.CallChainId.
    */
  var callChainId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Contains the optional features for the call.
  var callOptions: js.UndefOr[NullableOption[CallOptions]] = js.undefined
  
  // The routing information on how the call was retargeted. Read-only.
  var callRoutes: js.UndefOr[NullableOption[js.Array[CallRoute]]] = js.undefined
  
  // The callback URL on which callbacks will be delivered. Must be https.
  var callbackUri: js.UndefOr[String] = js.undefined
  
  // The chat information. Required information for joining a meeting.
  var chatInfo: js.UndefOr[NullableOption[ChatInfo]] = js.undefined
  
  var contentSharingSessions: js.UndefOr[NullableOption[js.Array[ContentSharingSession]]] = js.undefined
  
  // The direction of the call. The possible value are incoming or outgoing. Read-only.
  var direction: js.UndefOr[NullableOption[CallDirection]] = js.undefined
  
  // Call context associated with an incoming call.
  var incomingContext: js.UndefOr[NullableOption[IncomingContext]] = js.undefined
  
  // The media configuration. Required.
  var mediaConfig: js.UndefOr[NullableOption[MediaConfig]] = js.undefined
  
  // Read-only. The call media state.
  var mediaState: js.UndefOr[NullableOption[CallMediaState]] = js.undefined
  
  // The meeting information. Required information for meeting scenarios.
  var meetingInfo: js.UndefOr[NullableOption[MeetingInfo]] = js.undefined
  
  var myParticipantId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var operations: js.UndefOr[NullableOption[js.Array[CommsOperation]]] = js.undefined
  
  var participants: js.UndefOr[NullableOption[js.Array[Participant]]] = js.undefined
  
  // The list of requested modalities. Possible values are: unknown, audio, video, videoBasedScreenSharing, data.
  var requestedModalities: js.UndefOr[NullableOption[js.Array[Modality]]] = js.undefined
  
  // The result information. For example can hold termination reason. Read-only.
  var resultInfo: js.UndefOr[NullableOption[ResultInfo]] = js.undefined
  
  // The originator of the call.
  var source: js.UndefOr[NullableOption[ParticipantInfo]] = js.undefined
  
  /**
    * The call state. Possible values are: incoming, establishing, ringing, established, hold, transferring,
    * transferAccepted, redirecting, terminating, terminated. Read-only.
    */
  var state: js.UndefOr[NullableOption[CallState]] = js.undefined
  
  // The subject of the conversation.
  var subject: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The targets of the call. Required information for creating peer to peer call.
  var targets: js.UndefOr[NullableOption[js.Array[InvitationParticipantInfo]]] = js.undefined
  
  var tenantId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var toneInfo: js.UndefOr[NullableOption[ToneInfo]] = js.undefined
  
  // The transcription information for the call. Read-only.
  var transcription: js.UndefOr[NullableOption[CallTranscriptionInfo]] = js.undefined
}
object Call {
  
  inline def apply(): Call = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Call]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Call] (val x: Self) extends AnyVal {
    
    inline def setAudioRoutingGroups(value: NullableOption[js.Array[AudioRoutingGroup]]): Self = StObject.set(x, "audioRoutingGroups", value.asInstanceOf[js.Any])
    
    inline def setAudioRoutingGroupsNull: Self = StObject.set(x, "audioRoutingGroups", null)
    
    inline def setAudioRoutingGroupsUndefined: Self = StObject.set(x, "audioRoutingGroups", js.undefined)
    
    inline def setAudioRoutingGroupsVarargs(value: AudioRoutingGroup*): Self = StObject.set(x, "audioRoutingGroups", js.Array(value*))
    
    inline def setCallChainId(value: NullableOption[String]): Self = StObject.set(x, "callChainId", value.asInstanceOf[js.Any])
    
    inline def setCallChainIdNull: Self = StObject.set(x, "callChainId", null)
    
    inline def setCallChainIdUndefined: Self = StObject.set(x, "callChainId", js.undefined)
    
    inline def setCallOptions(value: NullableOption[CallOptions]): Self = StObject.set(x, "callOptions", value.asInstanceOf[js.Any])
    
    inline def setCallOptionsNull: Self = StObject.set(x, "callOptions", null)
    
    inline def setCallOptionsUndefined: Self = StObject.set(x, "callOptions", js.undefined)
    
    inline def setCallRoutes(value: NullableOption[js.Array[CallRoute]]): Self = StObject.set(x, "callRoutes", value.asInstanceOf[js.Any])
    
    inline def setCallRoutesNull: Self = StObject.set(x, "callRoutes", null)
    
    inline def setCallRoutesUndefined: Self = StObject.set(x, "callRoutes", js.undefined)
    
    inline def setCallRoutesVarargs(value: CallRoute*): Self = StObject.set(x, "callRoutes", js.Array(value*))
    
    inline def setCallbackUri(value: String): Self = StObject.set(x, "callbackUri", value.asInstanceOf[js.Any])
    
    inline def setCallbackUriUndefined: Self = StObject.set(x, "callbackUri", js.undefined)
    
    inline def setChatInfo(value: NullableOption[ChatInfo]): Self = StObject.set(x, "chatInfo", value.asInstanceOf[js.Any])
    
    inline def setChatInfoNull: Self = StObject.set(x, "chatInfo", null)
    
    inline def setChatInfoUndefined: Self = StObject.set(x, "chatInfo", js.undefined)
    
    inline def setContentSharingSessions(value: NullableOption[js.Array[ContentSharingSession]]): Self = StObject.set(x, "contentSharingSessions", value.asInstanceOf[js.Any])
    
    inline def setContentSharingSessionsNull: Self = StObject.set(x, "contentSharingSessions", null)
    
    inline def setContentSharingSessionsUndefined: Self = StObject.set(x, "contentSharingSessions", js.undefined)
    
    inline def setContentSharingSessionsVarargs(value: ContentSharingSession*): Self = StObject.set(x, "contentSharingSessions", js.Array(value*))
    
    inline def setDirection(value: NullableOption[CallDirection]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionNull: Self = StObject.set(x, "direction", null)
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setIncomingContext(value: NullableOption[IncomingContext]): Self = StObject.set(x, "incomingContext", value.asInstanceOf[js.Any])
    
    inline def setIncomingContextNull: Self = StObject.set(x, "incomingContext", null)
    
    inline def setIncomingContextUndefined: Self = StObject.set(x, "incomingContext", js.undefined)
    
    inline def setMediaConfig(value: NullableOption[MediaConfig]): Self = StObject.set(x, "mediaConfig", value.asInstanceOf[js.Any])
    
    inline def setMediaConfigNull: Self = StObject.set(x, "mediaConfig", null)
    
    inline def setMediaConfigUndefined: Self = StObject.set(x, "mediaConfig", js.undefined)
    
    inline def setMediaState(value: NullableOption[CallMediaState]): Self = StObject.set(x, "mediaState", value.asInstanceOf[js.Any])
    
    inline def setMediaStateNull: Self = StObject.set(x, "mediaState", null)
    
    inline def setMediaStateUndefined: Self = StObject.set(x, "mediaState", js.undefined)
    
    inline def setMeetingInfo(value: NullableOption[MeetingInfo]): Self = StObject.set(x, "meetingInfo", value.asInstanceOf[js.Any])
    
    inline def setMeetingInfoNull: Self = StObject.set(x, "meetingInfo", null)
    
    inline def setMeetingInfoUndefined: Self = StObject.set(x, "meetingInfo", js.undefined)
    
    inline def setMyParticipantId(value: NullableOption[String]): Self = StObject.set(x, "myParticipantId", value.asInstanceOf[js.Any])
    
    inline def setMyParticipantIdNull: Self = StObject.set(x, "myParticipantId", null)
    
    inline def setMyParticipantIdUndefined: Self = StObject.set(x, "myParticipantId", js.undefined)
    
    inline def setOperations(value: NullableOption[js.Array[CommsOperation]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsNull: Self = StObject.set(x, "operations", null)
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: CommsOperation*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setParticipants(value: NullableOption[js.Array[Participant]]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
    
    inline def setParticipantsNull: Self = StObject.set(x, "participants", null)
    
    inline def setParticipantsUndefined: Self = StObject.set(x, "participants", js.undefined)
    
    inline def setParticipantsVarargs(value: Participant*): Self = StObject.set(x, "participants", js.Array(value*))
    
    inline def setRequestedModalities(value: NullableOption[js.Array[Modality]]): Self = StObject.set(x, "requestedModalities", value.asInstanceOf[js.Any])
    
    inline def setRequestedModalitiesNull: Self = StObject.set(x, "requestedModalities", null)
    
    inline def setRequestedModalitiesUndefined: Self = StObject.set(x, "requestedModalities", js.undefined)
    
    inline def setRequestedModalitiesVarargs(value: Modality*): Self = StObject.set(x, "requestedModalities", js.Array(value*))
    
    inline def setResultInfo(value: NullableOption[ResultInfo]): Self = StObject.set(x, "resultInfo", value.asInstanceOf[js.Any])
    
    inline def setResultInfoNull: Self = StObject.set(x, "resultInfo", null)
    
    inline def setResultInfoUndefined: Self = StObject.set(x, "resultInfo", js.undefined)
    
    inline def setSource(value: NullableOption[ParticipantInfo]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setState(value: NullableOption[CallState]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSubject(value: NullableOption[String]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectNull: Self = StObject.set(x, "subject", null)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTargets(value: NullableOption[js.Array[InvitationParticipantInfo]]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsNull: Self = StObject.set(x, "targets", null)
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    inline def setTargetsVarargs(value: InvitationParticipantInfo*): Self = StObject.set(x, "targets", js.Array(value*))
    
    inline def setTenantId(value: NullableOption[String]): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    inline def setToneInfo(value: NullableOption[ToneInfo]): Self = StObject.set(x, "toneInfo", value.asInstanceOf[js.Any])
    
    inline def setToneInfoNull: Self = StObject.set(x, "toneInfo", null)
    
    inline def setToneInfoUndefined: Self = StObject.set(x, "toneInfo", js.undefined)
    
    inline def setTranscription(value: NullableOption[CallTranscriptionInfo]): Self = StObject.set(x, "transcription", value.asInstanceOf[js.Any])
    
    inline def setTranscriptionNull: Self = StObject.set(x, "transcription", null)
    
    inline def setTranscriptionUndefined: Self = StObject.set(x, "transcription", js.undefined)
  }
}
