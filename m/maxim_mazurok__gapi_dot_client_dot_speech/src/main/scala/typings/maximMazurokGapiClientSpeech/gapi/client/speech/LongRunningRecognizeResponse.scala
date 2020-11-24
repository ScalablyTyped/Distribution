package typings.maximMazurokGapiClientSpeech.gapi.client.speech

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LongRunningRecognizeResponse extends js.Object {
  
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
  implicit class LongRunningRecognizeResponseOps[Self <: LongRunningRecognizeResponse] (val x: Self) extends AnyVal {
    
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
    def setResultsVarargs(value: SpeechRecognitionResult*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[SpeechRecognitionResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
}
