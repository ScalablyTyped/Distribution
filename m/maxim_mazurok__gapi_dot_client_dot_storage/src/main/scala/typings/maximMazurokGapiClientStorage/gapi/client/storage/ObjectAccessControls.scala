package typings.maximMazurokGapiClientStorage.gapi.client.storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectAccessControls extends StObject {
  
  /** The list of items. */
  var items: js.UndefOr[js.Array[ObjectAccessControl]] = js.undefined
  
  /** The kind of item this is. For lists of object access control entries, this is always storage#objectAccessControls. */
  var kind: js.UndefOr[String] = js.undefined
}
object ObjectAccessControls {
  
  inline def apply(): ObjectAccessControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectAccessControls]
  }
  
  extension [Self <: ObjectAccessControls](x: Self) {
    
    inline def setItems(value: js.Array[ObjectAccessControl]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ObjectAccessControl*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
