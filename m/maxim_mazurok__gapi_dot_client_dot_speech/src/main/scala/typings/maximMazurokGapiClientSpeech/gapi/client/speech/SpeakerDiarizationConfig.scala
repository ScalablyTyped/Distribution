package typings.maximMazurokGapiClientSpeech.gapi.client.speech

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeakerDiarizationConfig extends StObject {
  
  /** If 'true', enables speaker detection for each recognized word in the top alternative of the recognition result using a speaker_tag provided in the WordInfo. */
  var enableSpeakerDiarization: js.UndefOr[Boolean] = js.native
  
  /**
    * Maximum number of speakers in the conversation. This range gives you more flexibility by allowing the system to automatically determine the correct number of speakers. If not set,
    * the default value is 6.
    */
  var maxSpeakerCount: js.UndefOr[Double] = js.native
  
  /**
    * Minimum number of speakers in the conversation. This range gives you more flexibility by allowing the system to automatically determine the correct number of speakers. If not set,
    * the default value is 2.
    */
  var minSpeakerCount: js.UndefOr[Double] = js.native
  
  /** Output only. Unused. */
  var speakerTag: js.UndefOr[Double] = js.native
}
object SpeakerDiarizationConfig {
  
  @scala.inline
  def apply(): SpeakerDiarizationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpeakerDiarizationConfig]
  }
  
  @scala.inline
  implicit class SpeakerDiarizationConfigMutableBuilder[Self <: SpeakerDiarizationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableSpeakerDiarization(value: Boolean): Self = StObject.set(x, "enableSpeakerDiarization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSpeakerDiarizationUndefined: Self = StObject.set(x, "enableSpeakerDiarization", js.undefined)
    
    @scala.inline
    def setMaxSpeakerCount(value: Double): Self = StObject.set(x, "maxSpeakerCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSpeakerCountUndefined: Self = StObject.set(x, "maxSpeakerCount", js.undefined)
    
    @scala.inline
    def setMinSpeakerCount(value: Double): Self = StObject.set(x, "minSpeakerCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSpeakerCountUndefined: Self = StObject.set(x, "minSpeakerCount", js.undefined)
    
    @scala.inline
    def setSpeakerTag(value: Double): Self = StObject.set(x, "speakerTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeakerTagUndefined: Self = StObject.set(x, "speakerTag", js.undefined)
  }
}
