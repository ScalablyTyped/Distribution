package typings.maximMazurokGapiClientSpeech.gapi.client.speech

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpeakerDiarizationConfig extends StObject {
  
  /** If 'true', enables speaker detection for each recognized word in the top alternative of the recognition result using a speaker_tag provided in the WordInfo. */
  var enableSpeakerDiarization: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum number of speakers in the conversation. This range gives you more flexibility by allowing the system to automatically determine the correct number of speakers. If not set,
    * the default value is 6.
    */
  var maxSpeakerCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum number of speakers in the conversation. This range gives you more flexibility by allowing the system to automatically determine the correct number of speakers. If not set,
    * the default value is 2.
    */
  var minSpeakerCount: js.UndefOr[Double] = js.undefined
  
  /** Output only. Unused. */
  var speakerTag: js.UndefOr[Double] = js.undefined
}
object SpeakerDiarizationConfig {
  
  inline def apply(): SpeakerDiarizationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpeakerDiarizationConfig]
  }
  
  extension [Self <: SpeakerDiarizationConfig](x: Self) {
    
    inline def setEnableSpeakerDiarization(value: Boolean): Self = StObject.set(x, "enableSpeakerDiarization", value.asInstanceOf[js.Any])
    
    inline def setEnableSpeakerDiarizationUndefined: Self = StObject.set(x, "enableSpeakerDiarization", js.undefined)
    
    inline def setMaxSpeakerCount(value: Double): Self = StObject.set(x, "maxSpeakerCount", value.asInstanceOf[js.Any])
    
    inline def setMaxSpeakerCountUndefined: Self = StObject.set(x, "maxSpeakerCount", js.undefined)
    
    inline def setMinSpeakerCount(value: Double): Self = StObject.set(x, "minSpeakerCount", value.asInstanceOf[js.Any])
    
    inline def setMinSpeakerCountUndefined: Self = StObject.set(x, "minSpeakerCount", js.undefined)
    
    inline def setSpeakerTag(value: Double): Self = StObject.set(x, "speakerTag", value.asInstanceOf[js.Any])
    
    inline def setSpeakerTagUndefined: Self = StObject.set(x, "speakerTag", js.undefined)
  }
}
