package typings.naverWhale.whale.tts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeakOptions extends js.Object {
  
  /** Optional. The TTS event types that you are interested in listening to. If missing, all event types may be sent. */
  var desiredEventTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional.
    * If true, enqueues this utterance if TTS is already in progress. If false (the default), interrupts any current speech and flushes the speech queue before speaking this new utterance.
    */
  var enqueue: js.UndefOr[Boolean] = js.native
  
  /** Optional. The extension ID of the speech engine to use, if known. */
  var extensionId: js.UndefOr[String] = js.native
  
  /**
    * Optional. Gender of voice for synthesized speech.
    * One of: "male", or "female"
    */
  var gender: js.UndefOr[String] = js.native
  
  /** Optional. The language to be used for synthesis, in the form language-region. Examples: 'en', 'en-US', 'en-GB', 'zh-CN'. */
  var lang: js.UndefOr[String] = js.native
  
  /**
    * Optional. This function is called with events that occur in the process of speaking the utterance.
    * @param event The update event from the text-to-speech engine indicating the status of this utterance.
    */
  var onEvent: js.UndefOr[js.Function1[/* event */ typings.chrome.chrome.tts.TtsEvent, Unit]] = js.native
  
  /**
    * Optional.
    * Speaking pitch between 0 and 2 inclusive, with 0 being lowest and 2 being highest. 1.0 corresponds to a voice's default pitch.
    */
  var pitch: js.UndefOr[Double] = js.native
  
  /**
    * Optional.
    * Speaking rate relative to the default rate for this voice. 1.0 is the default rate, normally around 180 to 220 words per minute. 2.0 is twice as fast, and 0.5 is half as fast. Values below 0.1 or above 10.0 are strictly disallowed, but many voices will constrain the minimum and maximum rates further—for example a particular voice may not actually speak faster than 3 times normal even if you specify a value larger than 3.0.
    */
  var rate: js.UndefOr[Double] = js.native
  
  /** Optional. The TTS event types the voice must support. */
  var requiredEventTypes: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional. The name of the voice to use for synthesis. If empty, uses any available voice. */
  var voiceName: js.UndefOr[String] = js.native
  
  /** Optional. Speaking volume between 0 and 1 inclusive, with 0 being lowest and 1 being highest, with a default of 1.0. */
  var volume: js.UndefOr[Double] = js.native
}
object SpeakOptions {
  
  @scala.inline
  def apply(): SpeakOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpeakOptions]
  }
  
  @scala.inline
  implicit class SpeakOptionsOps[Self <: SpeakOptions] (val x: Self) extends AnyVal {
    
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
    def setDesiredEventTypesVarargs(value: String*): Self = this.set("desiredEventTypes", js.Array(value :_*))
    
    @scala.inline
    def setDesiredEventTypes(value: js.Array[String]): Self = this.set("desiredEventTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesiredEventTypes: Self = this.set("desiredEventTypes", js.undefined)
    
    @scala.inline
    def setEnqueue(value: Boolean): Self = this.set("enqueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnqueue: Self = this.set("enqueue", js.undefined)
    
    @scala.inline
    def setExtensionId(value: String): Self = this.set("extensionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionId: Self = this.set("extensionId", js.undefined)
    
    @scala.inline
    def setGender(value: String): Self = this.set("gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setOnEvent(value: /* event */ typings.chrome.chrome.tts.TtsEvent => Unit): Self = this.set("onEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEvent: Self = this.set("onEvent", js.undefined)
    
    @scala.inline
    def setPitch(value: Double): Self = this.set("pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePitch: Self = this.set("pitch", js.undefined)
    
    @scala.inline
    def setRate(value: Double): Self = this.set("rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRate: Self = this.set("rate", js.undefined)
    
    @scala.inline
    def setRequiredEventTypesVarargs(value: String*): Self = this.set("requiredEventTypes", js.Array(value :_*))
    
    @scala.inline
    def setRequiredEventTypes(value: js.Array[String]): Self = this.set("requiredEventTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredEventTypes: Self = this.set("requiredEventTypes", js.undefined)
    
    @scala.inline
    def setVoiceName(value: String): Self = this.set("voiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoiceName: Self = this.set("voiceName", js.undefined)
    
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
  }
}
