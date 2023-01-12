package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSavedQueriesResponse extends StObject {
  
  /** Page token to retrieve the next page of results in the list. If this is empty, then there are no more saved queries to list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** List of saved queries. */
  var savedQueries: js.UndefOr[js.Array[SavedQuery]] = js.undefined
}
object ListSavedQueriesResponse {
  
  inline def apply(): ListSavedQueriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSavedQueriesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSavedQueriesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSavedQueries(value: js.Array[SavedQuery]): Self = StObject.set(x, "savedQueries", value.asInstanceOf[js.Any])
    
    inline def setSavedQueriesUndefined: Self = StObject.set(x, "savedQueries", js.undefined)
    
    inline def setSavedQueriesVarargs(value: SavedQuery*): Self = StObject.set(x, "savedQueries", js.Array(value*))
  }
}
