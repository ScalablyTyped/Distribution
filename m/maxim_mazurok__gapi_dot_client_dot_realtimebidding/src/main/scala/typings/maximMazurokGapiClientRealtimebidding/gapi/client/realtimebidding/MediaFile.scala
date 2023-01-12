package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaFile extends StObject {
  
  /** Bitrate of the video file, in Kbps. Can be used to filter the response of the creatives.list method. */
  var bitrate: js.UndefOr[String] = js.undefined
  
  /** The MIME type of this media file. Can be used to filter the response of the creatives.list method. */
  var mimeType: js.UndefOr[String] = js.undefined
}
object MediaFile {
  
  inline def apply(): MediaFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaFile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaFile] (val x: Self) extends AnyVal {
    
    inline def setBitrate(value: String): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
