package typings.maximMazurokGapiClientSpeech.gapi.client.speech

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WordInfo extends StObject {
  
  /**
    * Time offset relative to the beginning of the audio, and corresponding to the end of the spoken word. This field is only set if `enable_word_time_offsets=true` and only in the top
    * hypothesis. This is an experimental feature and the accuracy of the time offset can vary.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. A distinct integer value is assigned for every speaker within the audio. This field specifies which one of those speakers was detected to have spoken this word. Value
    * ranges from '1' to diarization_speaker_count. speaker_tag is set if enable_speaker_diarization = 'true' and only in the top alternative.
    */
  var speakerTag: js.UndefOr[Double] = js.native
  
  /**
    * Time offset relative to the beginning of the audio, and corresponding to the start of the spoken word. This field is only set if `enable_word_time_offsets=true` and only in the top
    * hypothesis. This is an experimental feature and the accuracy of the time offset can vary.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /** The word corresponding to this set of information. */
  var word: js.UndefOr[String] = js.native
}
object WordInfo {
  
  @scala.inline
  def apply(): WordInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordInfo]
  }
  
  @scala.inline
  implicit class WordInfoMutableBuilder[Self <: WordInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setSpeakerTag(value: Double): Self = StObject.set(x, "speakerTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeakerTagUndefined: Self = StObject.set(x, "speakerTag", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordUndefined: Self = StObject.set(x, "word", js.undefined)
  }
}
