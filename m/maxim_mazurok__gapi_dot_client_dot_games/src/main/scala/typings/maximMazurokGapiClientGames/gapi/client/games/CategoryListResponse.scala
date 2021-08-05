package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoryListResponse extends StObject {
  
  /** The list of categories with usage data. */
  var items: js.UndefOr[js.Array[Category]] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#categoryListResponse`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Token corresponding to the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object CategoryListResponse {
  
  inline def apply(): CategoryListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoryListResponse]
  }
  
  extension [Self <: CategoryListResponse](x: Self) {
    
    inline def setItems(value: js.Array[Category]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Category*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
