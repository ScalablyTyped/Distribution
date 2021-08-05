package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1SuggestTrialsRequest extends StObject {
  
  /**
    * Required. The identifier of the client that is requesting the suggestion. If multiple SuggestTrialsRequests have the same `client_id`, the service will return the identical
    * suggested trial if the trial is pending, and provide a new trial if the last suggested trial was completed.
    */
  var clientId: js.UndefOr[String] = js.undefined
  
  /** Required. The number of suggestions requested. */
  var suggestionCount: js.UndefOr[Double] = js.undefined
}
object GoogleCloudMlV1SuggestTrialsRequest {
  
  inline def apply(): GoogleCloudMlV1SuggestTrialsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1SuggestTrialsRequest]
  }
  
  extension [Self <: GoogleCloudMlV1SuggestTrialsRequest](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setSuggestionCount(value: Double): Self = StObject.set(x, "suggestionCount", value.asInstanceOf[js.Any])
    
    inline def setSuggestionCountUndefined: Self = StObject.set(x, "suggestionCount", js.undefined)
  }
}
