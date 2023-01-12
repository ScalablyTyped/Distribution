package typings.minio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemBucketMetadataList extends StObject {
  
  var Items: js.Array[MetadataItem]
}
object ItemBucketMetadataList {
  
  inline def apply(Items: js.Array[MetadataItem]): ItemBucketMetadataList = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemBucketMetadataList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemBucketMetadataList] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[MetadataItem]): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: MetadataItem*): Self = StObject.set(x, "Items", js.Array(value*))
  }
}
