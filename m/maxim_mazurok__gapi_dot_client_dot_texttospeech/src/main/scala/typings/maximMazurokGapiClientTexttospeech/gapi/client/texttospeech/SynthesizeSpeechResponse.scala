package typings.maximMazurokGapiClientTexttospeech.gapi.client.texttospeech

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SynthesizeSpeechResponse extends js.Object {
  
  /**
    * The audio data bytes encoded as specified in the request, including the header for encodings that are wrapped in containers (e.g. MP3, OGG_OPUS). For LINEAR16 audio, we include the
    * WAV header. Note: as with all bytes fields, protobuffers use a pure binary representation, whereas JSON representations use base64.
    */
  var audioContent: js.UndefOr[String] = js.native
}
object SynthesizeSpeechResponse {
  
  @scala.inline
  def apply(): SynthesizeSpeechResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynthesizeSpeechResponse]
  }
  
  @scala.inline
  implicit class SynthesizeSpeechResponseOps[Self <: SynthesizeSpeechResponse] (val x: Self) extends AnyVal {
    
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
    def setAudioContent(value: String): Self = this.set("audioContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioContent: Self = this.set("audioContent", js.undefined)
  }
}
