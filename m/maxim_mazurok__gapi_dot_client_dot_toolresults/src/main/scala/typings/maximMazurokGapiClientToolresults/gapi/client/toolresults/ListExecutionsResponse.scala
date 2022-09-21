package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExecutionsResponse extends StObject {
  
  /** Executions. Always set. */
  var executions: js.UndefOr[js.Array[Execution]] = js.undefined
  
  /** A continuation token to resume the query at the next item. Will only be set if there are more Executions to fetch. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListExecutionsResponse {
  
  inline def apply(): ListExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExecutionsResponse]
  }
  
  extension [Self <: ListExecutionsResponse](x: Self) {
    
    inline def setExecutions(value: js.Array[Execution]): Self = StObject.set(x, "executions", value.asInstanceOf[js.Any])
    
    inline def setExecutionsUndefined: Self = StObject.set(x, "executions", js.undefined)
    
    inline def setExecutionsVarargs(value: Execution*): Self = StObject.set(x, "executions", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
