package typings.maximMazurokGapiClientStorage.gapi.client.storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketAccessControls extends StObject {
  
  /** The list of items. */
  var items: js.UndefOr[js.Array[BucketAccessControl]] = js.undefined
  
  /** The kind of item this is. For lists of bucket access control entries, this is always storage#bucketAccessControls. */
  var kind: js.UndefOr[String] = js.undefined
}
object BucketAccessControls {
  
  inline def apply(): BucketAccessControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketAccessControls]
  }
  
  extension [Self <: BucketAccessControls](x: Self) {
    
    inline def setItems(value: js.Array[BucketAccessControl]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: BucketAccessControl*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
