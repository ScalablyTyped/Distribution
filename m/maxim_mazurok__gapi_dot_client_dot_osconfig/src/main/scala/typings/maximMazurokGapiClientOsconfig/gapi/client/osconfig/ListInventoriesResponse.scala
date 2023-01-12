package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInventoriesResponse extends StObject {
  
  /** List of inventory objects. */
  var inventories: js.UndefOr[js.Array[Inventory]] = js.undefined
  
  /** The pagination token to retrieve the next page of inventory objects. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListInventoriesResponse {
  
  inline def apply(): ListInventoriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInventoriesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListInventoriesResponse] (val x: Self) extends AnyVal {
    
    inline def setInventories(value: js.Array[Inventory]): Self = StObject.set(x, "inventories", value.asInstanceOf[js.Any])
    
    inline def setInventoriesUndefined: Self = StObject.set(x, "inventories", js.undefined)
    
    inline def setInventoriesVarargs(value: Inventory*): Self = StObject.set(x, "inventories", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
