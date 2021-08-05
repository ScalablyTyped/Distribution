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
  
  inline def apply(): GdataDiffUploadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GdataDiffUploadRequest]
  }
  
  extension [Self <: GdataDiffUploadRequest](x: Self) {
    
    inline def setChecksumsInfo(value: GdataCompositeMedia): Self = StObject.set(x, "checksumsInfo", value.asInstanceOf[js.Any])
    
    inline def setChecksumsInfoUndefined: Self = StObject.set(x, "checksumsInfo", js.undefined)
    
    inline def setObjectInfo(value: GdataCompositeMedia): Self = StObject.set(x, "objectInfo", value.asInstanceOf[js.Any])
    
    inline def setObjectInfoUndefined: Self = StObject.set(x, "objectInfo", js.undefined)
    
    inline def setObjectVersion(value: String): Self = StObject.set(x, "objectVersion", value.asInstanceOf[js.Any])
    
    inline def setObjectVersionUndefined: Self = StObject.set(x, "objectVersion", js.undefined)
  }
}
