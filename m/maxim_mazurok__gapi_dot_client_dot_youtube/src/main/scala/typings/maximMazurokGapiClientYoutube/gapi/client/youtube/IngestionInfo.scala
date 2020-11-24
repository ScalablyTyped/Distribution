package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IngestionInfo extends js.Object {
  
  /**
    * The backup ingestion URL that you should use to stream video to YouTube. You have the option of simultaneously streaming the content that you are sending to the ingestionAddress to
    * this URL.
    */
  var backupIngestionAddress: js.UndefOr[String] = js.native
  
  /**
    * The primary ingestion URL that you should use to stream video to YouTube. You must stream video to this URL. Depending on which application or tool you use to encode your video
    * stream, you may need to enter the stream URL and stream name separately or you may need to concatenate them in the following format: *STREAM_URL/STREAM_NAME*
    */
  var ingestionAddress: js.UndefOr[String] = js.native
  
  /** This ingestion url may be used instead of backupIngestionAddress in order to stream via RTMPS. Not applicable to non-RTMP streams. */
  var rtmpsBackupIngestionAddress: js.UndefOr[String] = js.native
  
  /** This ingestion url may be used instead of ingestionAddress in order to stream via RTMPS. Not applicable to non-RTMP streams. */
  var rtmpsIngestionAddress: js.UndefOr[String] = js.native
  
  /** The HTTP or RTMP stream name that YouTube assigns to the video stream. */
  var streamName: js.UndefOr[String] = js.native
}
object IngestionInfo {
  
  @scala.inline
  def apply(): IngestionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngestionInfo]
  }
  
  @scala.inline
  implicit class IngestionInfoOps[Self <: IngestionInfo] (val x: Self) extends AnyVal {
    
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
    def setBackupIngestionAddress(value: String): Self = this.set("backupIngestionAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupIngestionAddress: Self = this.set("backupIngestionAddress", js.undefined)
    
    @scala.inline
    def setIngestionAddress(value: String): Self = this.set("ingestionAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIngestionAddress: Self = this.set("ingestionAddress", js.undefined)
    
    @scala.inline
    def setRtmpsBackupIngestionAddress(value: String): Self = this.set("rtmpsBackupIngestionAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtmpsBackupIngestionAddress: Self = this.set("rtmpsBackupIngestionAddress", js.undefined)
    
    @scala.inline
    def setRtmpsIngestionAddress(value: String): Self = this.set("rtmpsIngestionAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtmpsIngestionAddress: Self = this.set("rtmpsIngestionAddress", js.undefined)
    
    @scala.inline
    def setStreamName(value: String): Self = this.set("streamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamName: Self = this.set("streamName", js.undefined)
  }
}
