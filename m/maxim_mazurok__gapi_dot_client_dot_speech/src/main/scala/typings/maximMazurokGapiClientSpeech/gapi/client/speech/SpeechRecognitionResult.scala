package typings.maximMazurokGapiClientSpeech.gapi.client.speech

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeechRecognitionResult extends StObject {
  
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
  implicit class SpeechRecognitionResultMutableBuilder[Self <: SpeechRecognitionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternatives(value: js.Array[SpeechRecognitionAlternative]): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativesUndefined: Self = StObject.set(x, "alternatives", js.undefined)
    
    @scala.inline
    def setAlternativesVarargs(value: SpeechRecognitionAlternative*): Self = StObject.set(x, "alternatives", js.Array(value :_*))
    
    @scala.inline
    def setChannelTag(value: Double): Self = StObject.set(x, "channelTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelTagUndefined: Self = StObject.set(x, "channelTag", js.undefined)
  }
}
