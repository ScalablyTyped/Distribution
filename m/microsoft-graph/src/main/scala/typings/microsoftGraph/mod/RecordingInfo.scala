package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordingInfo extends StObject {
  
  // The identities of the recording initiator.
  var initiator: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // Possible values are: unknown, notRecording, recording, or failed.
  var recordingStatus: js.UndefOr[RecordingStatus] = js.undefined
}
object RecordingInfo {
  
  inline def apply(): RecordingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordingInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecordingInfo] (val x: Self) extends AnyVal {
    
    inline def setInitiator(value: NullableOption[IdentitySet]): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorNull: Self = StObject.set(x, "initiator", null)
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    inline def setRecordingStatus(value: RecordingStatus): Self = StObject.set(x, "recordingStatus", value.asInstanceOf[js.Any])
    
    inline def setRecordingStatusUndefined: Self = StObject.set(x, "recordingStatus", js.undefined)
  }
}
