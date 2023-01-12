package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInventorySourcesResponse extends StObject {
  
  /** The list of inventory sources. This list will be absent if empty. */
  var inventorySources: js.UndefOr[js.Array[InventorySource]] = js.undefined
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListInventorySources` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListInventorySourcesResponse {
  
  inline def apply(): ListInventorySourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInventorySourcesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListInventorySourcesResponse] (val x: Self) extends AnyVal {
    
    inline def setInventorySources(value: js.Array[InventorySource]): Self = StObject.set(x, "inventorySources", value.asInstanceOf[js.Any])
    
    inline def setInventorySourcesUndefined: Self = StObject.set(x, "inventorySources", js.undefined)
    
    inline def setInventorySourcesVarargs(value: InventorySource*): Self = StObject.set(x, "inventorySources", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
