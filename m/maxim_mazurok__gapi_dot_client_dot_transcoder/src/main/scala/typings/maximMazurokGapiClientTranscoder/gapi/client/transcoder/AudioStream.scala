package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioStream extends StObject {
  
  /** Required. Audio bitrate in bits per second. Must be between 1 and 10,000,000. */
  var bitrateBps: js.UndefOr[Double] = js.undefined
  
  /** Number of audio channels. Must be between 1 and 6. The default is 2. */
  var channelCount: js.UndefOr[Double] = js.undefined
  
  /**
    * A list of channel names specifying layout of the audio channels. This only affects the metadata embedded in the container headers, if supported by the specified format. The default
    * is `["fl", "fr"]`. Supported channel names: - 'fl' - Front left channel - 'fr' - Front right channel - 'sl' - Side left channel - 'sr' - Side right channel - 'fc' - Front center
    * channel - 'lfe' - Low frequency
    */
  var channelLayout: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The codec for this audio stream. The default is `"aac"`. Supported audio codecs: - 'aac' - 'aac-he' - 'aac-he-v2' - 'mp3' - 'ac3' - 'eac3' */
  var codec: js.UndefOr[String] = js.undefined
  
  /** The mapping for the `Job.edit_list` atoms with audio `EditAtom.inputs`. */
  var mapping: js.UndefOr[js.Array[AudioAtom]] = js.undefined
  
  /** The audio sample rate in Hertz. The default is 48000 Hertz. */
  var sampleRateHertz: js.UndefOr[Double] = js.undefined
}
object AudioStream {
  
  @scala.inline
  def apply(): AudioStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioStream]
  }
  
  @scala.inline
  implicit class AudioStreamMutableBuilder[Self <: AudioStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitrateBps(value: Double): Self = StObject.set(x, "bitrateBps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitrateBpsUndefined: Self = StObject.set(x, "bitrateBps", js.undefined)
    
    @scala.inline
    def setChannelCount(value: Double): Self = StObject.set(x, "channelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelCountUndefined: Self = StObject.set(x, "channelCount", js.undefined)
    
    @scala.inline
    def setChannelLayout(value: js.Array[String]): Self = StObject.set(x, "channelLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelLayoutUndefined: Self = StObject.set(x, "channelLayout", js.undefined)
    
    @scala.inline
    def setChannelLayoutVarargs(value: String*): Self = StObject.set(x, "channelLayout", js.Array(value :_*))
    
    @scala.inline
    def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
    
    @scala.inline
    def setMapping(value: js.Array[AudioAtom]): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    @scala.inline
    def setMappingVarargs(value: AudioAtom*): Self = StObject.set(x, "mapping", js.Array(value :_*))
    
    @scala.inline
    def setSampleRateHertz(value: Double): Self = StObject.set(x, "sampleRateHertz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateHertzUndefined: Self = StObject.set(x, "sampleRateHertz", js.undefined)
  }
}
