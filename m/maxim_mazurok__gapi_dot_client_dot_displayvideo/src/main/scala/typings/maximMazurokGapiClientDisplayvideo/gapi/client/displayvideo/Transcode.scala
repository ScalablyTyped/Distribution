package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transcode extends StObject {
  
  /** The bit rate for the audio stream of the transcoded video, or the bit rate for the transcoded audio, in kilobits per second. */
  var audioBitRateKbps: js.UndefOr[String] = js.native
  
  /** The sample rate for the audio stream of the transcoded video, or the sample rate for the transcoded audio, in hertz. */
  var audioSampleRateHz: js.UndefOr[String] = js.native
  
  /** The transcoding bit rate of the transcoded video, in kilobits per second. */
  var bitRateKbps: js.UndefOr[String] = js.native
  
  /** The dimensions of the transcoded video. */
  var dimensions: js.UndefOr[Dimensions] = js.native
  
  /** The size of the transcoded file, in bytes. */
  var fileSizeBytes: js.UndefOr[String] = js.native
  
  /** The frame rate of the transcoded video, in frames per second. */
  var frameRate: js.UndefOr[Double] = js.native
  
  /** The MIME type of the transcoded file. */
  var mimeType: js.UndefOr[String] = js.native
  
  /** The name of the transcoded file. */
  var name: js.UndefOr[String] = js.native
  
  /** Indicates if the transcoding was successful. */
  var transcoded: js.UndefOr[Boolean] = js.native
}
object Transcode {
  
  @scala.inline
  def apply(): Transcode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transcode]
  }
  
  @scala.inline
  implicit class TranscodeMutableBuilder[Self <: Transcode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioBitRateKbps(value: String): Self = StObject.set(x, "audioBitRateKbps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioBitRateKbpsUndefined: Self = StObject.set(x, "audioBitRateKbps", js.undefined)
    
    @scala.inline
    def setAudioSampleRateHz(value: String): Self = StObject.set(x, "audioSampleRateHz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioSampleRateHzUndefined: Self = StObject.set(x, "audioSampleRateHz", js.undefined)
    
    @scala.inline
    def setBitRateKbps(value: String): Self = StObject.set(x, "bitRateKbps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitRateKbpsUndefined: Self = StObject.set(x, "bitRateKbps", js.undefined)
    
    @scala.inline
    def setDimensions(value: Dimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    @scala.inline
    def setFileSizeBytes(value: String): Self = StObject.set(x, "fileSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSizeBytesUndefined: Self = StObject.set(x, "fileSizeBytes", js.undefined)
    
    @scala.inline
    def setFrameRate(value: Double): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTranscoded(value: Boolean): Self = StObject.set(x, "transcoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscodedUndefined: Self = StObject.set(x, "transcoded", js.undefined)
  }
}
