package typings.minio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketItemCopy extends StObject {
  
  var etag: String
  
  var lastModified: js.Date
}
object BucketItemCopy {
  
  inline def apply(etag: String, lastModified: js.Date): BucketItemCopy = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketItemCopy]
  }
  
  extension [Self <: BucketItemCopy](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setLastModified(value: js.Date): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
  }
}
