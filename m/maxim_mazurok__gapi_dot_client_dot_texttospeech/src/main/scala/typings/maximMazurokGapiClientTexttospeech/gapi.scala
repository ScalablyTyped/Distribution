package typings.maximMazurokGapiClientTexttospeech

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientTexttospeech.anon.Accesstoken
import typings.maximMazurokGapiClientTexttospeech.anon.Alt
import typings.maximMazurokGapiClientTexttospeech.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object texttospeech {
      
      trait AudioConfig extends StObject {
        
        /** Required. The format of the audio byte stream. */
        var audioEncoding: js.UndefOr[String] = js.undefined
        
        /**
          * Optional. Input only. An identifier which selects 'audio effects' profiles that are applied on (post synthesized) text to speech. Effects are applied on top of each other in the
          * order they are given. See [audio profiles](https://cloud.google.com/text-to-speech/docs/audio-profiles) for current supported profile ids.
          */
        var effectsProfileId: js.UndefOr[js.Array[String]] = js.undefined
        
        /** Optional. Input only. Speaking pitch, in the range [-20.0, 20.0]. 20 means increase 20 semitones from the original pitch. -20 means decrease 20 semitones from the original pitch. */
        var pitch: js.UndefOr[Double] = js.undefined
        
        /**
          * Optional. The synthesis sample rate (in hertz) for this audio. When this is specified in SynthesizeSpeechRequest, if this is different from the voice's natural sample rate, then the
          * synthesizer will honor this request by converting to the desired sample rate (which might result in worse audio quality), unless the specified sample rate is not supported for the
          * encoding chosen, in which case it will fail the request and return google.rpc.Code.INVALID_ARGUMENT.
          */
        var sampleRateHertz: js.UndefOr[Double] = js.undefined
        
        /**
          * Optional. Input only. Speaking rate/speed, in the range [0.25, 4.0]. 1.0 is the normal native speed supported by the specific voice. 2.0 is twice as fast, and 0.5 is half as fast.
          * If unset(0.0), defaults to the native 1.0 speed. Any other values < 0.25 or > 4.0 will return an error.
          */
        var speakingRate: js.UndefOr[Double] = js.undefined
        
        /**
          * Optional. Input only. Volume gain (in dB) of the normal native volume supported by the specific voice, in the range [-96.0, 16.0]. If unset, or set to a value of 0.0 (dB), will play
          * at normal native signal amplitude. A value of -6.0 (dB) will play at approximately half the amplitude of the normal native signal amplitude. A value of +6.0 (dB) will play at
          * approximately twice the amplitude of the normal native signal amplitude. Strongly recommend not to exceed +10 (dB) as there's usually no effective increase in loudness for any value
          * greater than that.
          */
        var volumeGainDb: js.UndefOr[Double] = js.undefined
      }
      object AudioConfig {
        
        inline def apply(): AudioConfig = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[AudioConfig]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: AudioConfig] (val x: Self) extends AnyVal {
          
          inline def setAudioEncoding(value: String): Self = StObject.set(x, "audioEncoding", value.asInstanceOf[js.Any])
          
          inline def setAudioEncodingUndefined: Self = StObject.set(x, "audioEncoding", js.undefined)
          
          inline def setEffectsProfileId(value: js.Array[String]): Self = StObject.set(x, "effectsProfileId", value.asInstanceOf[js.Any])
          
          inline def setEffectsProfileIdUndefined: Self = StObject.set(x, "effectsProfileId", js.undefined)
          
          inline def setEffectsProfileIdVarargs(value: String*): Self = StObject.set(x, "effectsProfileId", js.Array(value*))
          
          inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
          
          inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
          
          inline def setSampleRateHertz(value: Double): Self = StObject.set(x, "sampleRateHertz", value.asInstanceOf[js.Any])
          
          inline def setSampleRateHertzUndefined: Self = StObject.set(x, "sampleRateHertz", js.undefined)
          
          inline def setSpeakingRate(value: Double): Self = StObject.set(x, "speakingRate", value.asInstanceOf[js.Any])
          
          inline def setSpeakingRateUndefined: Self = StObject.set(x, "speakingRate", js.undefined)
          
          inline def setVolumeGainDb(value: Double): Self = StObject.set(x, "volumeGainDb", value.asInstanceOf[js.Any])
          
          inline def setVolumeGainDbUndefined: Self = StObject.set(x, "volumeGainDb", js.undefined)
        }
      }
      
      trait CustomVoiceParams extends StObject {
        
        /** Required. The name of the AutoML model that synthesizes the custom voice. */
        var model: js.UndefOr[String] = js.undefined
        
        /** Optional. The usage of the synthesized audio to be reported. */
        var reportedUsage: js.UndefOr[String] = js.undefined
      }
      object CustomVoiceParams {
        
        inline def apply(): CustomVoiceParams = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[CustomVoiceParams]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: CustomVoiceParams] (val x: Self) extends AnyVal {
          
          inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
          
          inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
          
          inline def setReportedUsage(value: String): Self = StObject.set(x, "reportedUsage", value.asInstanceOf[js.Any])
          
          inline def setReportedUsageUndefined: Self = StObject.set(x, "reportedUsage", js.undefined)
        }
      }
      
      trait ListVoicesResponse extends StObject {
        
        /** The list of voices. */
        var voices: js.UndefOr[js.Array[Voice]] = js.undefined
      }
      object ListVoicesResponse {
        
        inline def apply(): ListVoicesResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ListVoicesResponse]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: ListVoicesResponse] (val x: Self) extends AnyVal {
          
          inline def setVoices(value: js.Array[Voice]): Self = StObject.set(x, "voices", value.asInstanceOf[js.Any])
          
          inline def setVoicesUndefined: Self = StObject.set(x, "voices", js.undefined)
          
          inline def setVoicesVarargs(value: Voice*): Self = StObject.set(x, "voices", js.Array(value*))
        }
      }
      
      trait SynthesisInput extends StObject {
        
        /**
          * The SSML document to be synthesized. The SSML document must be valid and well-formed. Otherwise the RPC will fail and return google.rpc.Code.INVALID_ARGUMENT. For more information,
          * see [SSML](https://cloud.google.com/text-to-speech/docs/ssml).
          */
        var ssml: js.UndefOr[String] = js.undefined
        
        /** The raw text to be synthesized. */
        var text: js.UndefOr[String] = js.undefined
      }
      object SynthesisInput {
        
        inline def apply(): SynthesisInput = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SynthesisInput]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: SynthesisInput] (val x: Self) extends AnyVal {
          
          inline def setSsml(value: String): Self = StObject.set(x, "ssml", value.asInstanceOf[js.Any])
          
          inline def setSsmlUndefined: Self = StObject.set(x, "ssml", js.undefined)
          
          inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
          
          inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
        }
      }
      
      trait SynthesizeSpeechRequest extends StObject {
        
        /** Required. The configuration of the synthesized audio. */
        var audioConfig: js.UndefOr[AudioConfig] = js.undefined
        
        /** Required. The Synthesizer requires either plain text or SSML as input. */
        var input: js.UndefOr[SynthesisInput] = js.undefined
        
        /** Required. The desired voice of the synthesized audio. */
        var voice: js.UndefOr[VoiceSelectionParams] = js.undefined
      }
      object SynthesizeSpeechRequest {
        
        inline def apply(): SynthesizeSpeechRequest = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SynthesizeSpeechRequest]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: SynthesizeSpeechRequest] (val x: Self) extends AnyVal {
          
          inline def setAudioConfig(value: AudioConfig): Self = StObject.set(x, "audioConfig", value.asInstanceOf[js.Any])
          
          inline def setAudioConfigUndefined: Self = StObject.set(x, "audioConfig", js.undefined)
          
          inline def setInput(value: SynthesisInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
          
          inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
          
          inline def setVoice(value: VoiceSelectionParams): Self = StObject.set(x, "voice", value.asInstanceOf[js.Any])
          
          inline def setVoiceUndefined: Self = StObject.set(x, "voice", js.undefined)
        }
      }
      
      trait SynthesizeSpeechResponse extends StObject {
        
        /**
          * The audio data bytes encoded as specified in the request, including the header for encodings that are wrapped in containers (e.g. MP3, OGG_OPUS). For LINEAR16 audio, we include the
          * WAV header. Note: as with all bytes fields, protobuffers use a pure binary representation, whereas JSON representations use base64.
          */
        var audioContent: js.UndefOr[String] = js.undefined
      }
      object SynthesizeSpeechResponse {
        
        inline def apply(): SynthesizeSpeechResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SynthesizeSpeechResponse]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: SynthesizeSpeechResponse] (val x: Self) extends AnyVal {
          
          inline def setAudioContent(value: String): Self = StObject.set(x, "audioContent", value.asInstanceOf[js.Any])
          
          inline def setAudioContentUndefined: Self = StObject.set(x, "audioContent", js.undefined)
        }
      }
      
      @js.native
      trait TextResource extends StObject {
        
        /** Synthesizes speech synchronously: receive results after all text input has been processed. */
        def synthesize(request: Accesstoken): Request[SynthesizeSpeechResponse] = js.native
        def synthesize(request: Alt, body: SynthesizeSpeechRequest): Request[SynthesizeSpeechResponse] = js.native
      }
      
      trait Voice extends StObject {
        
        /** The languages that this voice supports, expressed as [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags (e.g. "en-US", "es-419", "cmn-tw"). */
        var languageCodes: js.UndefOr[js.Array[String]] = js.undefined
        
        /** The name of this voice. Each distinct voice has a unique name. */
        var name: js.UndefOr[String] = js.undefined
        
        /** The natural sample rate (in hertz) for this voice. */
        var naturalSampleRateHertz: js.UndefOr[Double] = js.undefined
        
        /** The gender of this voice. */
        var ssmlGender: js.UndefOr[String] = js.undefined
      }
      object Voice {
        
        inline def apply(): Voice = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Voice]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: Voice] (val x: Self) extends AnyVal {
          
          inline def setLanguageCodes(value: js.Array[String]): Self = StObject.set(x, "languageCodes", value.asInstanceOf[js.Any])
          
          inline def setLanguageCodesUndefined: Self = StObject.set(x, "languageCodes", js.undefined)
          
          inline def setLanguageCodesVarargs(value: String*): Self = StObject.set(x, "languageCodes", js.Array(value*))
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          inline def setNaturalSampleRateHertz(value: Double): Self = StObject.set(x, "naturalSampleRateHertz", value.asInstanceOf[js.Any])
          
          inline def setNaturalSampleRateHertzUndefined: Self = StObject.set(x, "naturalSampleRateHertz", js.undefined)
          
          inline def setSsmlGender(value: String): Self = StObject.set(x, "ssmlGender", value.asInstanceOf[js.Any])
          
          inline def setSsmlGenderUndefined: Self = StObject.set(x, "ssmlGender", js.undefined)
        }
      }
      
      trait VoiceSelectionParams extends StObject {
        
        /** The configuration for a custom voice. If [CustomVoiceParams.model] is set, the service will choose the custom voice matching the specified configuration. */
        var customVoice: js.UndefOr[CustomVoiceParams] = js.undefined
        
        /**
          * Required. The language (and potentially also the region) of the voice expressed as a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag, e.g. "en-US". This should
          * not include a script tag (e.g. use "cmn-cn" rather than "cmn-Hant-cn"), because the script will be inferred from the input provided in the SynthesisInput. The TTS service will use
          * this parameter to help choose an appropriate voice. Note that the TTS service may choose a voice with a slightly different language code than the one selected; it may substitute a
          * different region (e.g. using en-US rather than en-CA if there isn't a Canadian voice available), or even a different language, e.g. using "nb" (Norwegian Bokmal) instead of "no"
          * (Norwegian)".
          */
        var languageCode: js.UndefOr[String] = js.undefined
        
        /** The name of the voice. If not set, the service will choose a voice based on the other parameters such as language_code and gender. */
        var name: js.UndefOr[String] = js.undefined
        
        /**
          * The preferred gender of the voice. If not set, the service will choose a voice based on the other parameters such as language_code and name. Note that this is only a preference, not
          * requirement; if a voice of the appropriate gender is not available, the synthesizer should substitute a voice with a different gender rather than failing the request.
          */
        var ssmlGender: js.UndefOr[String] = js.undefined
      }
      object VoiceSelectionParams {
        
        inline def apply(): VoiceSelectionParams = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[VoiceSelectionParams]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: VoiceSelectionParams] (val x: Self) extends AnyVal {
          
          inline def setCustomVoice(value: CustomVoiceParams): Self = StObject.set(x, "customVoice", value.asInstanceOf[js.Any])
          
          inline def setCustomVoiceUndefined: Self = StObject.set(x, "customVoice", js.undefined)
          
          inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
          
          inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          inline def setSsmlGender(value: String): Self = StObject.set(x, "ssmlGender", value.asInstanceOf[js.Any])
          
          inline def setSsmlGenderUndefined: Self = StObject.set(x, "ssmlGender", js.undefined)
        }
      }
      
      @js.native
      trait VoicesResource extends StObject {
        
        /** Returns a list of Voice supported for synthesis. */
        def list(): Request[ListVoicesResponse] = js.native
        def list(request: Callback): Request[ListVoicesResponse] = js.native
      }
    }
  }
}
