package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse extends StObject {
  
  /** If empty, the list is complete. If nonempty, pass the token to the next request's `ListPredictionApiKeysRegistrationsRequest.pageToken`. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of registered API keys. */
  var predictionApiKeyRegistrations: js.UndefOr[js.Array[GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration]] = js.undefined
}
object GoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse {
  
  inline def apply(): GoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPredictionApiKeyRegistrations(value: js.Array[GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration]): Self = StObject.set(x, "predictionApiKeyRegistrations", value.asInstanceOf[js.Any])
    
    inline def setPredictionApiKeyRegistrationsUndefined: Self = StObject.set(x, "predictionApiKeyRegistrations", js.undefined)
    
    inline def setPredictionApiKeyRegistrationsVarargs(value: GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration*): Self = StObject.set(x, "predictionApiKeyRegistrations", js.Array(value*))
  }
}
