package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatabasesResponse extends StObject {
  
  /** Databases that matched the request. */
  var databases: js.UndefOr[js.Array[Database]] = js.undefined
  
  /** `next_page_token` can be sent in a subsequent ListDatabases call to fetch more of the matching databases. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListDatabasesResponse {
  
  inline def apply(): ListDatabasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatabasesResponse]
  }
  
  extension [Self <: ListDatabasesResponse](x: Self) {
    
    inline def setDatabases(value: js.Array[Database]): Self = StObject.set(x, "databases", value.asInstanceOf[js.Any])
    
    inline def setDatabasesUndefined: Self = StObject.set(x, "databases", js.undefined)
    
    inline def setDatabasesVarargs(value: Database*): Self = StObject.set(x, "databases", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
