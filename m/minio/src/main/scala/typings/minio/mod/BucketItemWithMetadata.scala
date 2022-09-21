package typings.minio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketItemWithMetadata
  extends StObject
     with BucketItem {
  
  var metadata: ItemBucketMetadata
}
object BucketItemWithMetadata {
  
  inline def apply(
    etag: String,
    lastModified: js.Date,
    metadata: ItemBucketMetadata,
    name: String,
    prefix: String,
    size: Double
  ): BucketItemWithMetadata = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketItemWithMetadata]
  }
  
  extension [Self <: BucketItemWithMetadata](x: Self) {
    
    inline def setMetadata(value: ItemBucketMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
