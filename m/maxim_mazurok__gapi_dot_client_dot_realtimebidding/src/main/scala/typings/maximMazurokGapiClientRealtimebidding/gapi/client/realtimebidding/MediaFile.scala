package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaFile extends StObject {
  
  /** Bitrate of the video file, in Kbps. Can be used to filter the response of the creatives.list method. */
  var bitrate: js.UndefOr[String] = js.native
  
  /** The MIME type of this media file. Can be used to filter the response of the creatives.list method. */
  var mimeType: js.UndefOr[String] = js.native
}
object MediaFile {
  
  @scala.inline
  def apply(): MediaFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaFile]
  }
  
  @scala.inline
  implicit class MediaFileMutableBuilder[Self <: MediaFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitrate(value: String): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
