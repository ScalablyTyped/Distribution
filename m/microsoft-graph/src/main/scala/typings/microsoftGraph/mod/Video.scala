package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Video extends StObject {
  
  // Number of audio bits per sample.
  var audioBitsPerSample: js.UndefOr[NullableOption[Double]] = js.native
  
  // Number of audio channels.
  var audioChannels: js.UndefOr[NullableOption[Double]] = js.native
  
  // Name of the audio format (AAC, MP3, etc.).
  var audioFormat: js.UndefOr[NullableOption[String]] = js.native
  
  // Number of audio samples per second.
  var audioSamplesPerSecond: js.UndefOr[NullableOption[Double]] = js.native
  
  // Bit rate of the video in bits per second.
  var bitrate: js.UndefOr[NullableOption[Double]] = js.native
  
  // Duration of the file in milliseconds.
  var duration: js.UndefOr[NullableOption[Double]] = js.native
  
  // 'Four character code' name of the video format.
  var fourCC: js.UndefOr[NullableOption[String]] = js.native
  
  // Frame rate of the video.
  var frameRate: js.UndefOr[NullableOption[Double]] = js.native
  
  // Height of the video, in pixels.
  var height: js.UndefOr[NullableOption[Double]] = js.native
  
  // Width of the video, in pixels.
  var width: js.UndefOr[NullableOption[Double]] = js.native
}
object Video {
  
  @scala.inline
  def apply(): Video = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Video]
  }
  
  @scala.inline
  implicit class VideoMutableBuilder[Self <: Video] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioBitsPerSample(value: NullableOption[Double]): Self = StObject.set(x, "audioBitsPerSample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioBitsPerSampleNull: Self = StObject.set(x, "audioBitsPerSample", null)
    
    @scala.inline
    def setAudioBitsPerSampleUndefined: Self = StObject.set(x, "audioBitsPerSample", js.undefined)
    
    @scala.inline
    def setAudioChannels(value: NullableOption[Double]): Self = StObject.set(x, "audioChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioChannelsNull: Self = StObject.set(x, "audioChannels", null)
    
    @scala.inline
    def setAudioChannelsUndefined: Self = StObject.set(x, "audioChannels", js.undefined)
    
    @scala.inline
    def setAudioFormat(value: NullableOption[String]): Self = StObject.set(x, "audioFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioFormatNull: Self = StObject.set(x, "audioFormat", null)
    
    @scala.inline
    def setAudioFormatUndefined: Self = StObject.set(x, "audioFormat", js.undefined)
    
    @scala.inline
    def setAudioSamplesPerSecond(value: NullableOption[Double]): Self = StObject.set(x, "audioSamplesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioSamplesPerSecondNull: Self = StObject.set(x, "audioSamplesPerSecond", null)
    
    @scala.inline
    def setAudioSamplesPerSecondUndefined: Self = StObject.set(x, "audioSamplesPerSecond", js.undefined)
    
    @scala.inline
    def setBitrate(value: NullableOption[Double]): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitrateNull: Self = StObject.set(x, "bitrate", null)
    
    @scala.inline
    def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
    
    @scala.inline
    def setDuration(value: NullableOption[Double]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationNull: Self = StObject.set(x, "duration", null)
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setFourCC(value: NullableOption[String]): Self = StObject.set(x, "fourCC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFourCCNull: Self = StObject.set(x, "fourCC", null)
    
    @scala.inline
    def setFourCCUndefined: Self = StObject.set(x, "fourCC", js.undefined)
    
    @scala.inline
    def setFrameRate(value: NullableOption[Double]): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameRateNull: Self = StObject.set(x, "frameRate", null)
    
    @scala.inline
    def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    @scala.inline
    def setHeight(value: NullableOption[Double]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightNull: Self = StObject.set(x, "height", null)
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: NullableOption[Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthNull: Self = StObject.set(x, "width", null)
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
