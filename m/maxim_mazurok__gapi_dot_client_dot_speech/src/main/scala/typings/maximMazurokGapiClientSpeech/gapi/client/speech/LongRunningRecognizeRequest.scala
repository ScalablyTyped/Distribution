package typings.maximMazurokGapiClientSpeech.gapi.client.speech

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LongRunningRecognizeRequest extends js.Object {
  
  /** Required. The audio data to be recognized. */
  var audio: js.UndefOr[RecognitionAudio] = js.native
  
  /** Required. Provides information to the recognizer that specifies how to process the request. */
  var config: js.UndefOr[RecognitionConfig] = js.native
}
object LongRunningRecognizeRequest {
  
  @scala.inline
  def apply(): LongRunningRecognizeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LongRunningRecognizeRequest]
  }
  
  @scala.inline
  implicit class LongRunningRecognizeRequestOps[Self <: LongRunningRecognizeRequest] (val x: Self) extends AnyVal {
    
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
    def setAudio(value: RecognitionAudio): Self = this.set("audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudio: Self = this.set("audio", js.undefined)
    
    @scala.inline
    def setConfig(value: RecognitionConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
  }
}
