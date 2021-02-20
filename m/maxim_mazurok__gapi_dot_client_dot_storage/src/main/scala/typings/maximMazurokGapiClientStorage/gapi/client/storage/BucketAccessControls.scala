package typings.maximMazurokGapiClientStorage.gapi.client.storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketAccessControls extends StObject {
  
  /** The list of items. */
  var items: js.UndefOr[js.Array[BucketAccessControl]] = js.native
  
  /** The kind of item this is. For lists of bucket access control entries, this is always storage#bucketAccessControls. */
  var kind: js.UndefOr[String] = js.native
}
object BucketAccessControls {
  
  @scala.inline
  def apply(): BucketAccessControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketAccessControls]
  }
  
  @scala.inline
  implicit class BucketAccessControlsMutableBuilder[Self <: BucketAccessControls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[BucketAccessControl]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: BucketAccessControl*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
