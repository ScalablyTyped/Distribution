package typings.obsStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OBSStatus extends StObject {
  
  var recording: Boolean
  
  var recordingPaused: Boolean
  
  var replaybuffer: Boolean
  
  var streaming: Boolean
  
  var virtualcam: Boolean
}
object OBSStatus {
  
  inline def apply(
    recording: Boolean,
    recordingPaused: Boolean,
    replaybuffer: Boolean,
    streaming: Boolean,
    virtualcam: Boolean
  ): OBSStatus = {
    val __obj = js.Dynamic.literal(recording = recording.asInstanceOf[js.Any], recordingPaused = recordingPaused.asInstanceOf[js.Any], replaybuffer = replaybuffer.asInstanceOf[js.Any], streaming = streaming.asInstanceOf[js.Any], virtualcam = virtualcam.asInstanceOf[js.Any])
    __obj.asInstanceOf[OBSStatus]
  }
  
  extension [Self <: OBSStatus](x: Self) {
    
    inline def setRecording(value: Boolean): Self = StObject.set(x, "recording", value.asInstanceOf[js.Any])
    
    inline def setRecordingPaused(value: Boolean): Self = StObject.set(x, "recordingPaused", value.asInstanceOf[js.Any])
    
    inline def setReplaybuffer(value: Boolean): Self = StObject.set(x, "replaybuffer", value.asInstanceOf[js.Any])
    
    inline def setStreaming(value: Boolean): Self = StObject.set(x, "streaming", value.asInstanceOf[js.Any])
    
    inline def setVirtualcam(value: Boolean): Self = StObject.set(x, "virtualcam", value.asInstanceOf[js.Any])
  }
}
