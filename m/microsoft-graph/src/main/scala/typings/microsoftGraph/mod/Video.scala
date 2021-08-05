package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Video extends StObject {
  
  // Number of audio bits per sample.
  var audioBitsPerSample: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Number of audio channels.
  var audioChannels: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Name of the audio format (AAC, MP3, etc.).
  var audioFormat: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Number of audio samples per second.
  var audioSamplesPerSecond: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Bit rate of the video in bits per second.
  var bitrate: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Duration of the file in milliseconds.
  var duration: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // 'Four character code' name of the video format.
  var fourCC: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Frame rate of the video.
  var frameRate: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Height of the video, in pixels.
  var height: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Width of the video, in pixels.
  var width: js.UndefOr[NullableOption[Double]] = js.undefined
}
object Video {
  
  inline def apply(): Video = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Video]
  }
  
  extension [Self <: Video](x: Self) {
    
    inline def setAudioBitsPerSample(value: NullableOption[Double]): Self = StObject.set(x, "audioBitsPerSample", value.asInstanceOf[js.Any])
    
    inline def setAudioBitsPerSampleNull: Self = StObject.set(x, "audioBitsPerSample", null)
    
    inline def setAudioBitsPerSampleUndefined: Self = StObject.set(x, "audioBitsPerSample", js.undefined)
    
    inline def setAudioChannels(value: NullableOption[Double]): Self = StObject.set(x, "audioChannels", value.asInstanceOf[js.Any])
    
    inline def setAudioChannelsNull: Self = StObject.set(x, "audioChannels", null)
    
    inline def setAudioChannelsUndefined: Self = StObject.set(x, "audioChannels", js.undefined)
    
    inline def setAudioFormat(value: NullableOption[String]): Self = StObject.set(x, "audioFormat", value.asInstanceOf[js.Any])
    
    inline def setAudioFormatNull: Self = StObject.set(x, "audioFormat", null)
    
    inline def setAudioFormatUndefined: Self = StObject.set(x, "audioFormat", js.undefined)
    
    inline def setAudioSamplesPerSecond(value: NullableOption[Double]): Self = StObject.set(x, "audioSamplesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setAudioSamplesPerSecondNull: Self = StObject.set(x, "audioSamplesPerSecond", null)
    
    inline def setAudioSamplesPerSecondUndefined: Self = StObject.set(x, "audioSamplesPerSecond", js.undefined)
    
    inline def setBitrate(value: NullableOption[Double]): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateNull: Self = StObject.set(x, "bitrate", null)
    
    inline def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
    
    inline def setDuration(value: NullableOption[Double]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setFourCC(value: NullableOption[String]): Self = StObject.set(x, "fourCC", value.asInstanceOf[js.Any])
    
    inline def setFourCCNull: Self = StObject.set(x, "fourCC", null)
    
    inline def setFourCCUndefined: Self = StObject.set(x, "fourCC", js.undefined)
    
    inline def setFrameRate(value: NullableOption[Double]): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    inline def setFrameRateNull: Self = StObject.set(x, "frameRate", null)
    
    inline def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    inline def setHeight(value: NullableOption[Double]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightNull: Self = StObject.set(x, "height", null)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: NullableOption[Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
