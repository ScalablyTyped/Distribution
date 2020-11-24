package typings.maximMazurokGapiClientSpeech.gapi.client.speech

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeechRecognitionResult extends js.Object {
  
  /**
    * May contain one or more recognition hypotheses (up to the maximum specified in `max_alternatives`). These alternatives are ordered in terms of accuracy, with the top (first)
    * alternative being the most probable, as ranked by the recognizer.
    */
  var alternatives: js.UndefOr[js.Array[SpeechRecognitionAlternative]] = js.native
  
  /**
    * For multi-channel audio, this is the channel number corresponding to the recognized result for the audio from that channel. For audio_channel_count = N, its output values can range
    * from '1' to 'N'.
    */
  var channelTag: js.UndefOr[Double] = js.native
}
object SpeechRecognitionResult {
  
  @scala.inline
  def apply(): SpeechRecognitionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpeechRecognitionResult]
  }
  
  @scala.inline
  implicit class SpeechRecognitionResultOps[Self <: SpeechRecognitionResult] (val x: Self) extends AnyVal {
    
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
    def setAlternativesVarargs(value: SpeechRecognitionAlternative*): Self = this.set("alternatives", js.Array(value :_*))
    
    @scala.inline
    def setAlternatives(value: js.Array[SpeechRecognitionAlternative]): Self = this.set("alternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternatives: Self = this.set("alternatives", js.undefined)
    
    @scala.inline
    def setChannelTag(value: Double): Self = this.set("channelTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelTag: Self = this.set("channelTag", js.undefined)
  }
}
