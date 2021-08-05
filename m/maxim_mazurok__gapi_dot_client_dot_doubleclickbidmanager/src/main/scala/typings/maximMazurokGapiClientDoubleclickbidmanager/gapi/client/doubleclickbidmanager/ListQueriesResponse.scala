package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListQueriesResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "doubleclickbidmanager#listQueriesResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Next page's pagination token if one exists. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Retrieved queries. */
  var queries: js.UndefOr[js.Array[Query]] = js.undefined
}
object ListQueriesResponse {
  
  inline def apply(): ListQueriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueriesResponse]
  }
  
  extension [Self <: ListQueriesResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setQueries(value: js.Array[Query]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    inline def setQueriesVarargs(value: Query*): Self = StObject.set(x, "queries", js.Array(value :_*))
  }
}
