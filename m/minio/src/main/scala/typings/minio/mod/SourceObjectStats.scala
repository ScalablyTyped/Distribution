package typings.minio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceObjectStats extends StObject {
  
  var etag: String
  
  var lastModicied: js.Date
  
  var metaData: String
  
  var size: Double
  
  var versionId: String
}
object SourceObjectStats {
  
  inline def apply(etag: String, lastModicied: js.Date, metaData: String, size: Double, versionId: String): SourceObjectStats = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], lastModicied = lastModicied.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceObjectStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceObjectStats] (val x: Self) extends AnyVal {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setLastModicied(value: js.Date): Self = StObject.set(x, "lastModicied", value.asInstanceOf[js.Any])
    
    inline def setMetaData(value: String): Self = StObject.set(x, "metaData", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
  }
}
