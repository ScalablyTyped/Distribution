package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestionInfo extends StObject {
  
  /**
    * The backup ingestion URL that you should use to stream video to YouTube. You have the option of simultaneously streaming the content that you are sending to the ingestionAddress to
    * this URL.
    */
  var backupIngestionAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The primary ingestion URL that you should use to stream video to YouTube. You must stream video to this URL. Depending on which application or tool you use to encode your video
    * stream, you may need to enter the stream URL and stream name separately or you may need to concatenate them in the following format: *STREAM_URL/STREAM_NAME*
    */
  var ingestionAddress: js.UndefOr[String] = js.undefined
  
  /** This ingestion url may be used instead of backupIngestionAddress in order to stream via RTMPS. Not applicable to non-RTMP streams. */
  var rtmpsBackupIngestionAddress: js.UndefOr[String] = js.undefined
  
  /** This ingestion url may be used instead of ingestionAddress in order to stream via RTMPS. Not applicable to non-RTMP streams. */
  var rtmpsIngestionAddress: js.UndefOr[String] = js.undefined
  
  /** The HTTP or RTMP stream name that YouTube assigns to the video stream. */
  var streamName: js.UndefOr[String] = js.undefined
}
object IngestionInfo {
  
  @scala.inline
  def apply(): IngestionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngestionInfo]
  }
  
  @scala.inline
  implicit class IngestionInfoMutableBuilder[Self <: IngestionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupIngestionAddress(value: String): Self = StObject.set(x, "backupIngestionAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupIngestionAddressUndefined: Self = StObject.set(x, "backupIngestionAddress", js.undefined)
    
    @scala.inline
    def setIngestionAddress(value: String): Self = StObject.set(x, "ingestionAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngestionAddressUndefined: Self = StObject.set(x, "ingestionAddress", js.undefined)
    
    @scala.inline
    def setRtmpsBackupIngestionAddress(value: String): Self = StObject.set(x, "rtmpsBackupIngestionAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtmpsBackupIngestionAddressUndefined: Self = StObject.set(x, "rtmpsBackupIngestionAddress", js.undefined)
    
    @scala.inline
    def setRtmpsIngestionAddress(value: String): Self = StObject.set(x, "rtmpsIngestionAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtmpsIngestionAddressUndefined: Self = StObject.set(x, "rtmpsIngestionAddress", js.undefined)
    
    @scala.inline
    def setStreamName(value: String): Self = StObject.set(x, "streamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamNameUndefined: Self = StObject.set(x, "streamName", js.undefined)
  }
}
