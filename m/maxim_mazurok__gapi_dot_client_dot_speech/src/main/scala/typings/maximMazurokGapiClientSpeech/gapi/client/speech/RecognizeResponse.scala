package typings.maximMazurokGapiClientSpeech.gapi.client.speech

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecognizeResponse extends StObject {
  
  /** Sequential list of transcription results corresponding to sequential portions of audio. */
  var results: js.UndefOr[js.Array[SpeechRecognitionResult]] = js.undefined
  
  /** When available, billed audio seconds for the corresponding request. */
  var totalBilledTime: js.UndefOr[String] = js.undefined
}
object RecognizeResponse {
  
  inline def apply(): RecognizeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecognizeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecognizeResponse] (val x: Self) extends AnyVal {
    
    inline def setResults(value: js.Array[SpeechRecognitionResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: SpeechRecognitionResult*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setTotalBilledTime(value: String): Self = StObject.set(x, "totalBilledTime", value.asInstanceOf[js.Any])
    
    inline def setTotalBilledTimeUndefined: Self = StObject.set(x, "totalBilledTime", js.undefined)
  }
}
