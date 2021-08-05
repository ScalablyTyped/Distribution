package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TiersListResponse extends StObject {
  
  /** List of tiers. */
  var items: js.UndefOr[js.Array[Tier]] = js.undefined
  
  /** This is always *sql#tiersList*. */
  var kind: js.UndefOr[String] = js.undefined
}
object TiersListResponse {
  
  inline def apply(): TiersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TiersListResponse]
  }
  
  extension [Self <: TiersListResponse](x: Self) {
    
    inline def setItems(value: js.Array[Tier]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Tier*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
