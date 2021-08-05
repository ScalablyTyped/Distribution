package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabasesListResponse extends StObject {
  
  /** List of database resources in the instance. */
  var items: js.UndefOr[js.Array[Database]] = js.undefined
  
  /** This is always *sql#databasesList*. */
  var kind: js.UndefOr[String] = js.undefined
}
object DatabasesListResponse {
  
  inline def apply(): DatabasesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabasesListResponse]
  }
  
  extension [Self <: DatabasesListResponse](x: Self) {
    
    inline def setItems(value: js.Array[Database]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Database*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
