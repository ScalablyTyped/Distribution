package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Participant
  extends StObject
     with Entity {
  
  // Information about the participant.
  var info: js.UndefOr[ParticipantInfo] = js.undefined
  
  // true if the participant is in lobby.
  var isInLobby: js.UndefOr[Boolean] = js.undefined
  
  // true if the participant is muted (client or server muted).
  var isMuted: js.UndefOr[Boolean] = js.undefined
  
  // The list of media streams.
  var mediaStreams: js.UndefOr[NullableOption[js.Array[MediaStream]]] = js.undefined
  
  // A blob of data provided by the participant in the roster.
  var metadata: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Information about whether the participant has recording capability.
  var recordingInfo: js.UndefOr[NullableOption[RecordingInfo]] = js.undefined
}
object Participant {
  
  inline def apply(): Participant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Participant]
  }
  
  extension [Self <: Participant](x: Self) {
    
    inline def setInfo(value: ParticipantInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setIsInLobby(value: Boolean): Self = StObject.set(x, "isInLobby", value.asInstanceOf[js.Any])
    
    inline def setIsInLobbyUndefined: Self = StObject.set(x, "isInLobby", js.undefined)
    
    inline def setIsMuted(value: Boolean): Self = StObject.set(x, "isMuted", value.asInstanceOf[js.Any])
    
    inline def setIsMutedUndefined: Self = StObject.set(x, "isMuted", js.undefined)
    
    inline def setMediaStreams(value: NullableOption[js.Array[MediaStream]]): Self = StObject.set(x, "mediaStreams", value.asInstanceOf[js.Any])
    
    inline def setMediaStreamsNull: Self = StObject.set(x, "mediaStreams", null)
    
    inline def setMediaStreamsUndefined: Self = StObject.set(x, "mediaStreams", js.undefined)
    
    inline def setMediaStreamsVarargs(value: MediaStream*): Self = StObject.set(x, "mediaStreams", js.Array(value*))
    
    inline def setMetadata(value: NullableOption[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setRecordingInfo(value: NullableOption[RecordingInfo]): Self = StObject.set(x, "recordingInfo", value.asInstanceOf[js.Any])
    
    inline def setRecordingInfoNull: Self = StObject.set(x, "recordingInfo", null)
    
    inline def setRecordingInfoUndefined: Self = StObject.set(x, "recordingInfo", js.undefined)
  }
}
