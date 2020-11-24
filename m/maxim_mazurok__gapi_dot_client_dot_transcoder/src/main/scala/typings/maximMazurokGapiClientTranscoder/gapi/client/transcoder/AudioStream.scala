package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioStream extends js.Object {
  
  /** Required. Audio bitrate in bits per second. Must be between 1 and 10,000,000. */
  var bitrateBps: js.UndefOr[Double] = js.native
  
  /** Number of audio channels. Must be between 1 and 6. The default is 2. */
  var channelCount: js.UndefOr[Double] = js.native
  
  /**
    * A list of channel names specifying layout of the audio channels. This only affects the metadata embedded in the container headers, if supported by the specified format. The default
    * is `["fl", "fr"]`. Supported channel names: - 'fl' - Front left channel - 'fr' - Front right channel - 'sl' - Side left channel - 'sr' - Side right channel - 'fc' - Front center
    * channel - 'lfe' - Low frequency
    */
  var channelLayout: js.UndefOr[js.Array[String]] = js.native
  
  /** The codec for this audio stream. The default is `"aac"`. Supported audio codecs: - 'aac' - 'aac-he' - 'aac-he-v2' - 'mp3' - 'ac3' - 'eac3' */
  var codec: js.UndefOr[String] = js.native
  
  /** The mapping for the `Job.edit_list` atoms with audio `EditAtom.inputs`. */
  var mapping: js.UndefOr[js.Array[AudioAtom]] = js.native
  
  /** The audio sample rate in Hertz. The default is 48000 Hertz. */
  var sampleRateHertz: js.UndefOr[Double] = js.native
}
object AudioStream {
  
  @scala.inline
  def apply(): AudioStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioStream]
  }
  
  @scala.inline
  implicit class AudioStreamOps[Self <: AudioStream] (val x: Self) extends AnyVal {
    
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
    def setBitrateBps(value: Double): Self = this.set("bitrateBps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitrateBps: Self = this.set("bitrateBps", js.undefined)
    
    @scala.inline
    def setChannelCount(value: Double): Self = this.set("channelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelCount: Self = this.set("channelCount", js.undefined)
    
    @scala.inline
    def setChannelLayoutVarargs(value: String*): Self = this.set("channelLayout", js.Array(value :_*))
    
    @scala.inline
    def setChannelLayout(value: js.Array[String]): Self = this.set("channelLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelLayout: Self = this.set("channelLayout", js.undefined)
    
    @scala.inline
    def setCodec(value: String): Self = this.set("codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodec: Self = this.set("codec", js.undefined)
    
    @scala.inline
    def setMappingVarargs(value: AudioAtom*): Self = this.set("mapping", js.Array(value :_*))
    
    @scala.inline
    def setMapping(value: js.Array[AudioAtom]): Self = this.set("mapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapping: Self = this.set("mapping", js.undefined)
    
    @scala.inline
    def setSampleRateHertz(value: Double): Self = this.set("sampleRateHertz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleRateHertz: Self = this.set("sampleRateHertz", js.undefined)
  }
}
