package typings.maximMazurokGapiClientSpeech.gapi.client.speech

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LongRunningRecognizeResponse extends StObject {
  
  /** Original output config if present in the request. */
  var outputConfig: js.UndefOr[TranscriptOutputConfig] = js.undefined
  
  /** If the transcript output fails this field contains the relevant error. */
  var outputError: js.UndefOr[Status] = js.undefined
  
  /** Sequential list of transcription results corresponding to sequential portions of audio. */
  var results: js.UndefOr[js.Array[SpeechRecognitionResult]] = js.undefined
  
  /** When available, billed audio seconds for the corresponding request. */
  var totalBilledTime: js.UndefOr[String] = js.undefined
}
object LongRunningRecognizeResponse {
  
  inline def apply(): LongRunningRecognizeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LongRunningRecognizeResponse]
  }
  
  extension [Self <: LongRunningRecognizeResponse](x: Self) {
    
    inline def setOutputConfig(value: TranscriptOutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
    
    inline def setOutputError(value: Status): Self = StObject.set(x, "outputError", value.asInstanceOf[js.Any])
    
    inline def setOutputErrorUndefined: Self = StObject.set(x, "outputError", js.undefined)
    
    inline def setResults(value: js.Array[SpeechRecognitionResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: SpeechRecognitionResult*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setTotalBilledTime(value: String): Self = StObject.set(x, "totalBilledTime", value.asInstanceOf[js.Any])
    
    inline def setTotalBilledTimeUndefined: Self = StObject.set(x, "totalBilledTime", js.undefined)
  }
}
