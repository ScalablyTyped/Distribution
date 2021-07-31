package typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GdataDiffUploadRequest extends StObject {
  
  /** gdata */
  var checksumsInfo: js.UndefOr[GdataCompositeMedia] = js.undefined
  
  /** gdata */
  var objectInfo: js.UndefOr[GdataCompositeMedia] = js.undefined
  
  /** gdata */
  var objectVersion: js.UndefOr[String] = js.undefined
}
object GdataDiffUploadRequest {
  
  @scala.inline
  def apply(): GdataDiffUploadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GdataDiffUploadRequest]
  }
  
  @scala.inline
  implicit class GdataDiffUploadRequestMutableBuilder[Self <: GdataDiffUploadRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecksumsInfo(value: GdataCompositeMedia): Self = StObject.set(x, "checksumsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksumsInfoUndefined: Self = StObject.set(x, "checksumsInfo", js.undefined)
    
    @scala.inline
    def setObjectInfo(value: GdataCompositeMedia): Self = StObject.set(x, "objectInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectInfoUndefined: Self = StObject.set(x, "objectInfo", js.undefined)
    
    @scala.inline
    def setObjectVersion(value: String): Self = StObject.set(x, "objectVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectVersionUndefined: Self = StObject.set(x, "objectVersion", js.undefined)
  }
}
