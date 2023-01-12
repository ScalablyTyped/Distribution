package typings.naverWhale.whale

import typings.chrome.chrome.events.Event
import typings.chrome.chrome.tts.TtsEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Text to Speech Engine
////////////////////
/**
  * Use the chrome.ttsEngine API to implement a text-to-speech(TTS) engine using an extension. If your extension registers using this API, it will receive events containing an utterance to be spoken and other parameters when any extension or Chrome App uses the tts API to generate speech. Your extension can then use any available web technology to synthesize and output the speech, and send events back to the calling function to report the status.
  * Permissions:  "ttsEngine"
  * @since Chrome 14.
  */
object ttsEngine {
  
  trait SpeakOptions extends StObject {
    
    /**
      * Optional. Gender of voice for synthesized speech.
      * One of: "male", or "female"
      */
    var gender: js.UndefOr[String] = js.undefined
    
    /** Optional. The language to be used for synthesis, in the form language-region. Examples: 'en', 'en-US', 'en-GB', 'zh-CN'. */
    var lang: js.UndefOr[String] = js.undefined
    
    /** Optional. Speaking pitch between 0 and 2 inclusive, with 0 being lowest and 2 being highest. 1.0 corresponds to this voice's default pitch. */
    var pitch: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional.
      * Speaking rate relative to the default rate for this voice. 1.0 is the default rate, normally around 180 to 220 words per minute. 2.0 is twice as fast, and 0.5 is half as fast. This value is guaranteed to be between 0.1 and 10.0, inclusive. When a voice does not support this full range of rates, don't return an error. Instead, clip the rate to the range the voice supports.
      */
    var rate: js.UndefOr[Double] = js.undefined
    
    /** Optional. The name of the voice to use for synthesis. */
    var voiceName: js.UndefOr[String] = js.undefined
    
    /** Optional. Speaking volume between 0 and 1 inclusive, with 0 being lowest and 1 being highest, with a default of 1.0. */
    var volume: js.UndefOr[Double] = js.undefined
  }
  object SpeakOptions {
    
    inline def apply(): SpeakOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpeakOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpeakOptions] (val x: Self) extends AnyVal {
      
      inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
      
      inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
      
      inline def setVoiceName(value: String): Self = StObject.set(x, "voiceName", value.asInstanceOf[js.Any])
      
      inline def setVoiceNameUndefined: Self = StObject.set(x, "voiceName", js.undefined)
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    }
  }
  
  type TtsEngineSpeakEvent = Event[
    js.Function3[
      /* utterance */ String, 
      /* options */ typings.chrome.chrome.ttsEngine.SpeakOptions, 
      /* sendTtsEvent */ js.Function1[/* event */ TtsEvent, Unit], 
      Unit
    ]
  ]
}
