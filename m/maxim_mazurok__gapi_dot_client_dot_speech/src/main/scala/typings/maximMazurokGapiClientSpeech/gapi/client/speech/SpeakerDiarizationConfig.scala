package typings.maximMazurokGapiClientSpeech.gapi.client.speech

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeakerDiarizationConfig extends js.Object {
  
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
  implicit class SpeakerDiarizationConfigOps[Self <: SpeakerDiarizationConfig] (val x: Self) extends AnyVal {
    
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
    def setEnableSpeakerDiarization(value: Boolean): Self = this.set("enableSpeakerDiarization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSpeakerDiarization: Self = this.set("enableSpeakerDiarization", js.undefined)
    
    @scala.inline
    def setMaxSpeakerCount(value: Double): Self = this.set("maxSpeakerCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSpeakerCount: Self = this.set("maxSpeakerCount", js.undefined)
    
    @scala.inline
    def setMinSpeakerCount(value: Double): Self = this.set("minSpeakerCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSpeakerCount: Self = this.set("minSpeakerCount", js.undefined)
    
    @scala.inline
    def setSpeakerTag(value: Double): Self = this.set("speakerTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeakerTag: Self = this.set("speakerTag", js.undefined)
  }
}
