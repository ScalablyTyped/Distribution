package typings.maximMazurokGapiClientSpeech.gapi.client.speech

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LongRunningRecognizeRequest extends StObject {
  
  /** Required. The audio data to be recognized. */
  var audio: js.UndefOr[RecognitionAudio] = js.undefined
  
  /** Required. Provides information to the recognizer that specifies how to process the request. */
  var config: js.UndefOr[RecognitionConfig] = js.undefined
}
object LongRunningRecognizeRequest {
  
  inline def apply(): LongRunningRecognizeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LongRunningRecognizeRequest]
  }
  
  extension [Self <: LongRunningRecognizeRequest](x: Self) {
    
    inline def setAudio(value: RecognitionAudio): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setConfig(value: RecognitionConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
  }
}
