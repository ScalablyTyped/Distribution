package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transcode extends js.Object {
  
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
  implicit class TranscodeOps[Self <: Transcode] (val x: Self) extends AnyVal {
    
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
    def setAudioBitRateKbps(value: String): Self = this.set("audioBitRateKbps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioBitRateKbps: Self = this.set("audioBitRateKbps", js.undefined)
    
    @scala.inline
    def setAudioSampleRateHz(value: String): Self = this.set("audioSampleRateHz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioSampleRateHz: Self = this.set("audioSampleRateHz", js.undefined)
    
    @scala.inline
    def setBitRateKbps(value: String): Self = this.set("bitRateKbps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitRateKbps: Self = this.set("bitRateKbps", js.undefined)
    
    @scala.inline
    def setDimensions(value: Dimensions): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    
    @scala.inline
    def setFileSizeBytes(value: String): Self = this.set("fileSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSizeBytes: Self = this.set("fileSizeBytes", js.undefined)
    
    @scala.inline
    def setFrameRate(value: Double): Self = this.set("frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameRate: Self = this.set("frameRate", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTranscoded(value: Boolean): Self = this.set("transcoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranscoded: Self = this.set("transcoded", js.undefined)
  }
}
