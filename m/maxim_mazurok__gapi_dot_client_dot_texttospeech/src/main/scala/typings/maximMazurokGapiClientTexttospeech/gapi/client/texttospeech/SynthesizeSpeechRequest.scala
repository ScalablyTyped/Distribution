package typings.maximMazurokGapiClientTexttospeech.gapi.client.texttospeech

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SynthesizeSpeechRequest extends js.Object {
  
  /** Required. The configuration of the synthesized audio. */
  var audioConfig: js.UndefOr[AudioConfig] = js.native
  
  /** Required. The Synthesizer requires either plain text or SSML as input. */
  var input: js.UndefOr[SynthesisInput] = js.native
  
  /** Required. The desired voice of the synthesized audio. */
  var voice: js.UndefOr[VoiceSelectionParams] = js.native
}
object SynthesizeSpeechRequest {
  
  @scala.inline
  def apply(): SynthesizeSpeechRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynthesizeSpeechRequest]
  }
  
  @scala.inline
  implicit class SynthesizeSpeechRequestOps[Self <: SynthesizeSpeechRequest] (val x: Self) extends AnyVal {
    
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
    def setAudioConfig(value: AudioConfig): Self = this.set("audioConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioConfig: Self = this.set("audioConfig", js.undefined)
    
    @scala.inline
    def setInput(value: SynthesisInput): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setVoice(value: VoiceSelectionParams): Self = this.set("voice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoice: Self = this.set("voice", js.undefined)
  }
}
