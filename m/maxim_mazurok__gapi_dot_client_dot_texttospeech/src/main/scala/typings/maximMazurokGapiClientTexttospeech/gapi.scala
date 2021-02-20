package typings.maximMazurokGapiClientTexttospeech

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientTexttospeech.anon.Accesstoken
import typings.maximMazurokGapiClientTexttospeech.anon.Alt
import typings.maximMazurokGapiClientTexttospeech.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object texttospeech {
      
      @js.native
      trait AudioConfig extends StObject {
        
        /** Required. The format of the audio byte stream. */
        var audioEncoding: js.UndefOr[String] = js.native
        
        /**
          * Optional. Input only. An identifier which selects 'audio effects' profiles that are applied on (post synthesized) text to speech. Effects are applied on top of each other in the
          * order they are given. See [audio profiles](https://cloud.google.com/text-to-speech/docs/audio-profiles) for current supported profile ids.
          */
        var effectsProfileId: js.UndefOr[js.Array[String]] = js.native
        
        /** Optional. Input only. Speaking pitch, in the range [-20.0, 20.0]. 20 means increase 20 semitones from the original pitch. -20 means decrease 20 semitones from the original pitch. */
        var pitch: js.UndefOr[Double] = js.native
        
        /**
          * Optional. The synthesis sample rate (in hertz) for this audio. When this is specified in SynthesizeSpeechRequest, if this is different from the voice's natural sample rate, then the
          * synthesizer will honor this request by converting to the desired sample rate (which might result in worse audio quality), unless the specified sample rate is not supported for the
          * encoding chosen, in which case it will fail the request and return google.rpc.Code.INVALID_ARGUMENT.
          */
        var sampleRateHertz: js.UndefOr[Double] = js.native
        
        /**
          * Optional. Input only. Speaking rate/speed, in the range [0.25, 4.0]. 1.0 is the normal native speed supported by the specific voice. 2.0 is twice as fast, and 0.5 is half as fast.
          * If unset(0.0), defaults to the native 1.0 speed. Any other values < 0.25 or > 4.0 will return an error.
          */
        var speakingRate: js.UndefOr[Double] = js.native
        
        /**
          * Optional. Input only. Volume gain (in dB) of the normal native volume supported by the specific voice, in the range [-96.0, 16.0]. If unset, or set to a value of 0.0 (dB), will play
          * at normal native signal amplitude. A value of -6.0 (dB) will play at approximately half the amplitude of the normal native signal amplitude. A value of +6.0 (dB) will play at
          * approximately twice the amplitude of the normal native signal amplitude. Strongly recommend not to exceed +10 (dB) as there's usually no effective increase in loudness for any value
          * greater than that.
          */
        var volumeGainDb: js.UndefOr[Double] = js.native
      }
      object AudioConfig {
        
        @scala.inline
        def apply(): AudioConfig = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[AudioConfig]
        }
        
        @scala.inline
        implicit class AudioConfigMutableBuilder[Self <: AudioConfig] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAudioEncoding(value: String): Self = StObject.set(x, "audioEncoding", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAudioEncodingUndefined: Self = StObject.set(x, "audioEncoding", js.undefined)
          
          @scala.inline
          def setEffectsProfileId(value: js.Array[String]): Self = StObject.set(x, "effectsProfileId", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEffectsProfileIdUndefined: Self = StObject.set(x, "effectsProfileId", js.undefined)
          
          @scala.inline
          def setEffectsProfileIdVarargs(value: String*): Self = StObject.set(x, "effectsProfileId", js.Array(value :_*))
          
          @scala.inline
          def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
          
          @scala.inline
          def setSampleRateHertz(value: Double): Self = StObject.set(x, "sampleRateHertz", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSampleRateHertzUndefined: Self = StObject.set(x, "sampleRateHertz", js.undefined)
          
          @scala.inline
          def setSpeakingRate(value: Double): Self = StObject.set(x, "speakingRate", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSpeakingRateUndefined: Self = StObject.set(x, "speakingRate", js.undefined)
          
          @scala.inline
          def setVolumeGainDb(value: Double): Self = StObject.set(x, "volumeGainDb", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setVolumeGainDbUndefined: Self = StObject.set(x, "volumeGainDb", js.undefined)
        }
      }
      
      @js.native
      trait ListVoicesResponse extends StObject {
        
        /** The list of voices. */
        var voices: js.UndefOr[js.Array[Voice]] = js.native
      }
      object ListVoicesResponse {
        
        @scala.inline
        def apply(): ListVoicesResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ListVoicesResponse]
        }
        
        @scala.inline
        implicit class ListVoicesResponseMutableBuilder[Self <: ListVoicesResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setVoices(value: js.Array[Voice]): Self = StObject.set(x, "voices", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setVoicesUndefined: Self = StObject.set(x, "voices", js.undefined)
          
          @scala.inline
          def setVoicesVarargs(value: Voice*): Self = StObject.set(x, "voices", js.Array(value :_*))
        }
      }
      
      @js.native
      trait SynthesisInput extends StObject {
        
        /**
          * The SSML document to be synthesized. The SSML document must be valid and well-formed. Otherwise the RPC will fail and return google.rpc.Code.INVALID_ARGUMENT. For more information,
          * see [SSML](https://cloud.google.com/text-to-speech/docs/ssml).
          */
        var ssml: js.UndefOr[String] = js.native
        
        /** The raw text to be synthesized. */
        var text: js.UndefOr[String] = js.native
      }
      object SynthesisInput {
        
        @scala.inline
        def apply(): SynthesisInput = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SynthesisInput]
        }
        
        @scala.inline
        implicit class SynthesisInputMutableBuilder[Self <: SynthesisInput] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setSsml(value: String): Self = StObject.set(x, "ssml", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSsmlUndefined: Self = StObject.set(x, "ssml", js.undefined)
          
          @scala.inline
          def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
        }
      }
      
      @js.native
      trait SynthesizeSpeechRequest extends StObject {
        
        /** Required. The configuration of the synthesized audio. */
        var audioConfig: js.UndefOr[AudioConfig] = js.native
        
        /** Required. The Synthesizer requires either plain text or SSML as input. */
        var input: js.UndefOr[SynthesisInput] = js.native
        
        /** Required. The desired voice of the synthesized audio. */
        var voice: js.UndefOr[VoiceSelectionParams] = js.native
      }
      object SynthesizeSpeechRequest {
        
        @scala.inline
        def apply(): SynthesizeSpeechRequest = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SynthesizeSpeechRequest]
        }
        
        @scala.inline
        implicit class SynthesizeSpeechRequestMutableBuilder[Self <: SynthesizeSpeechRequest] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAudioConfig(value: AudioConfig): Self = StObject.set(x, "audioConfig", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAudioConfigUndefined: Self = StObject.set(x, "audioConfig", js.undefined)
          
          @scala.inline
          def setInput(value: SynthesisInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
          
          @scala.inline
          def setVoice(value: VoiceSelectionParams): Self = StObject.set(x, "voice", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setVoiceUndefined: Self = StObject.set(x, "voice", js.undefined)
        }
      }
      
      @js.native
      trait SynthesizeSpeechResponse extends StObject {
        
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
        implicit class SynthesizeSpeechResponseMutableBuilder[Self <: SynthesizeSpeechResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAudioContent(value: String): Self = StObject.set(x, "audioContent", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAudioContentUndefined: Self = StObject.set(x, "audioContent", js.undefined)
        }
      }
      
      @js.native
      trait TextResource extends StObject {
        
        /** Synthesizes speech synchronously: receive results after all text input has been processed. */
        def synthesize(request: Accesstoken): Request[SynthesizeSpeechResponse] = js.native
        def synthesize(request: Alt, body: SynthesizeSpeechRequest): Request[SynthesizeSpeechResponse] = js.native
      }
      
      @js.native
      trait Voice extends StObject {
        
        /** The languages that this voice supports, expressed as [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tags (e.g. "en-US", "es-419", "cmn-tw"). */
        var languageCodes: js.UndefOr[js.Array[String]] = js.native
        
        /** The name of this voice. Each distinct voice has a unique name. */
        var name: js.UndefOr[String] = js.native
        
        /** The natural sample rate (in hertz) for this voice. */
        var naturalSampleRateHertz: js.UndefOr[Double] = js.native
        
        /** The gender of this voice. */
        var ssmlGender: js.UndefOr[String] = js.native
      }
      object Voice {
        
        @scala.inline
        def apply(): Voice = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Voice]
        }
        
        @scala.inline
        implicit class VoiceMutableBuilder[Self <: Voice] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setLanguageCodes(value: js.Array[String]): Self = StObject.set(x, "languageCodes", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLanguageCodesUndefined: Self = StObject.set(x, "languageCodes", js.undefined)
          
          @scala.inline
          def setLanguageCodesVarargs(value: String*): Self = StObject.set(x, "languageCodes", js.Array(value :_*))
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          @scala.inline
          def setNaturalSampleRateHertz(value: Double): Self = StObject.set(x, "naturalSampleRateHertz", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNaturalSampleRateHertzUndefined: Self = StObject.set(x, "naturalSampleRateHertz", js.undefined)
          
          @scala.inline
          def setSsmlGender(value: String): Self = StObject.set(x, "ssmlGender", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSsmlGenderUndefined: Self = StObject.set(x, "ssmlGender", js.undefined)
        }
      }
      
      @js.native
      trait VoiceSelectionParams extends StObject {
        
        /**
          * Required. The language (and potentially also the region) of the voice expressed as a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag, e.g. "en-US". This should
          * not include a script tag (e.g. use "cmn-cn" rather than "cmn-Hant-cn"), because the script will be inferred from the input provided in the SynthesisInput. The TTS service will use
          * this parameter to help choose an appropriate voice. Note that the TTS service may choose a voice with a slightly different language code than the one selected; it may substitute a
          * different region (e.g. using en-US rather than en-CA if there isn't a Canadian voice available), or even a different language, e.g. using "nb" (Norwegian Bokmal) instead of "no"
          * (Norwegian)".
          */
        var languageCode: js.UndefOr[String] = js.native
        
        /** The name of the voice. If not set, the service will choose a voice based on the other parameters such as language_code and gender. */
        var name: js.UndefOr[String] = js.native
        
        /**
          * The preferred gender of the voice. If not set, the service will choose a voice based on the other parameters such as language_code and name. Note that this is only a preference, not
          * requirement; if a voice of the appropriate gender is not available, the synthesizer should substitute a voice with a different gender rather than failing the request.
          */
        var ssmlGender: js.UndefOr[String] = js.native
      }
      object VoiceSelectionParams {
        
        @scala.inline
        def apply(): VoiceSelectionParams = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[VoiceSelectionParams]
        }
        
        @scala.inline
        implicit class VoiceSelectionParamsMutableBuilder[Self <: VoiceSelectionParams] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          @scala.inline
          def setSsmlGender(value: String): Self = StObject.set(x, "ssmlGender", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSsmlGenderUndefined: Self = StObject.set(x, "ssmlGender", js.undefined)
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
