package typings.maximMazurokGapiClientTexttospeech.gapi.client.texttospeech

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioConfig extends js.Object {
  
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
  implicit class AudioConfigOps[Self <: AudioConfig] (val x: Self) extends AnyVal {
    
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
    def setAudioEncoding(value: String): Self = this.set("audioEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioEncoding: Self = this.set("audioEncoding", js.undefined)
    
    @scala.inline
    def setEffectsProfileIdVarargs(value: String*): Self = this.set("effectsProfileId", js.Array(value :_*))
    
    @scala.inline
    def setEffectsProfileId(value: js.Array[String]): Self = this.set("effectsProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectsProfileId: Self = this.set("effectsProfileId", js.undefined)
    
    @scala.inline
    def setPitch(value: Double): Self = this.set("pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePitch: Self = this.set("pitch", js.undefined)
    
    @scala.inline
    def setSampleRateHertz(value: Double): Self = this.set("sampleRateHertz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleRateHertz: Self = this.set("sampleRateHertz", js.undefined)
    
    @scala.inline
    def setSpeakingRate(value: Double): Self = this.set("speakingRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeakingRate: Self = this.set("speakingRate", js.undefined)
    
    @scala.inline
    def setVolumeGainDb(value: Double): Self = this.set("volumeGainDb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeGainDb: Self = this.set("volumeGainDb", js.undefined)
  }
}
