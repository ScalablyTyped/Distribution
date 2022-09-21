package typings.minio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncompleteUploadedBucketItem extends StObject {
  
  var key: String
  
  var size: Double
  
  var uploadId: String
}
object IncompleteUploadedBucketItem {
  
  inline def apply(key: String, size: Double, uploadId: String): IncompleteUploadedBucketItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncompleteUploadedBucketItem]
  }
  
  extension [Self <: IncompleteUploadedBucketItem](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
  }
}
