package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlagsListResponse extends StObject {
  
  /** List of flags. */
  var items: js.UndefOr[js.Array[Flag]] = js.undefined
  
  /** This is always `sql#flagsList`. */
  var kind: js.UndefOr[String] = js.undefined
}
object FlagsListResponse {
  
  inline def apply(): FlagsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlagsListResponse]
  }
  
  extension [Self <: FlagsListResponse](x: Self) {
    
    inline def setItems(value: js.Array[Flag]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Flag*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
