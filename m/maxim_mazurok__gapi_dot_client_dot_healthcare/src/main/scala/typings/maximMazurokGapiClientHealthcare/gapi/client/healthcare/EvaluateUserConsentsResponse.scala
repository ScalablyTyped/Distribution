package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluateUserConsentsResponse extends StObject {
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. This token is valid for 72 hours after it is created. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The consent evaluation result for each `data_id`. */
  var results: js.UndefOr[js.Array[Result]] = js.undefined
}
object EvaluateUserConsentsResponse {
  
  inline def apply(): EvaluateUserConsentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluateUserConsentsResponse]
  }
  
  extension [Self <: EvaluateUserConsentsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResults(value: js.Array[Result]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: Result*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
