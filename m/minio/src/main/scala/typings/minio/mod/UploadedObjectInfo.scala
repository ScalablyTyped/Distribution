package typings.minio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadedObjectInfo extends StObject {
  
  var etag: String
  
  var versionId: String | Null
}
object UploadedObjectInfo {
  
  inline def apply(etag: String): UploadedObjectInfo = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], versionId = null)
    __obj.asInstanceOf[UploadedObjectInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadedObjectInfo] (val x: Self) extends AnyVal {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdNull: Self = StObject.set(x, "versionId", null)
  }
}
