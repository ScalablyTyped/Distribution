package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFirebaseProjectsResponse extends StObject {
  
  /**
    * If the result list is too large to fit in a single response, then a token is returned. If the string is empty, then this response is the last page of results. This token can be used
    * in a subsequent calls to `ListFirebaseProjects` to find the next group of Projects. Page tokens are short-lived and should not be persisted.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** One page of the list of Projects that are accessible to the caller. */
  var results: js.UndefOr[js.Array[FirebaseProject]] = js.undefined
}
object ListFirebaseProjectsResponse {
  
  inline def apply(): ListFirebaseProjectsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFirebaseProjectsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFirebaseProjectsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResults(value: js.Array[FirebaseProject]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: FirebaseProject*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
