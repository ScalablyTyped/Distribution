package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transcode extends StObject {
  
  /** The bit rate for the audio stream of the transcoded video, or the bit rate for the transcoded audio, in kilobits per second. */
  var audioBitRateKbps: js.UndefOr[String] = js.undefined
  
  /** The sample rate for the audio stream of the transcoded video, or the sample rate for the transcoded audio, in hertz. */
  var audioSampleRateHz: js.UndefOr[String] = js.undefined
  
  /** The transcoding bit rate of the transcoded video, in kilobits per second. */
  var bitRateKbps: js.UndefOr[String] = js.undefined
  
  /** The dimensions of the transcoded video. */
  var dimensions: js.UndefOr[Dimensions] = js.undefined
  
  /** The size of the transcoded file, in bytes. */
  var fileSizeBytes: js.UndefOr[String] = js.undefined
  
  /** The frame rate of the transcoded video, in frames per second. */
  var frameRate: js.UndefOr[Double] = js.undefined
  
  /** The MIME type of the transcoded file. */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /** The name of the transcoded file. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Indicates if the transcoding was successful. */
  var transcoded: js.UndefOr[Boolean] = js.undefined
}
object Transcode {
  
  inline def apply(): Transcode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transcode]
  }
  
  extension [Self <: Transcode](x: Self) {
    
    inline def setAudioBitRateKbps(value: String): Self = StObject.set(x, "audioBitRateKbps", value.asInstanceOf[js.Any])
    
    inline def setAudioBitRateKbpsUndefined: Self = StObject.set(x, "audioBitRateKbps", js.undefined)
    
    inline def setAudioSampleRateHz(value: String): Self = StObject.set(x, "audioSampleRateHz", value.asInstanceOf[js.Any])
    
    inline def setAudioSampleRateHzUndefined: Self = StObject.set(x, "audioSampleRateHz", js.undefined)
    
    inline def setBitRateKbps(value: String): Self = StObject.set(x, "bitRateKbps", value.asInstanceOf[js.Any])
    
    inline def setBitRateKbpsUndefined: Self = StObject.set(x, "bitRateKbps", js.undefined)
    
    inline def setDimensions(value: Dimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setFileSizeBytes(value: String): Self = StObject.set(x, "fileSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setFileSizeBytesUndefined: Self = StObject.set(x, "fileSizeBytes", js.undefined)
    
    inline def setFrameRate(value: Double): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    inline def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTranscoded(value: Boolean): Self = StObject.set(x, "transcoded", value.asInstanceOf[js.Any])
    
    inline def setTranscodedUndefined: Self = StObject.set(x, "transcoded", js.undefined)
  }
}
