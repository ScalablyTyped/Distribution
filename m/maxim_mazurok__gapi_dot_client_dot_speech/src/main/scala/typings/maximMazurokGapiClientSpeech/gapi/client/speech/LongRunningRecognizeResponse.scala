package typings.maximMazurokGapiClientSpeech.gapi.client.speech

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LongRunningRecognizeResponse extends StObject {
  
  /** Sequential list of transcription results corresponding to sequential portions of audio. */
  var results: js.UndefOr[js.Array[SpeechRecognitionResult]] = js.native
}
object LongRunningRecognizeResponse {
  
  @scala.inline
  def apply(): LongRunningRecognizeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LongRunningRecognizeResponse]
  }
  
  @scala.inline
  implicit class LongRunningRecognizeResponseMutableBuilder[Self <: LongRunningRecognizeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResults(value: js.Array[SpeechRecognitionResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: SpeechRecognitionResult*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
