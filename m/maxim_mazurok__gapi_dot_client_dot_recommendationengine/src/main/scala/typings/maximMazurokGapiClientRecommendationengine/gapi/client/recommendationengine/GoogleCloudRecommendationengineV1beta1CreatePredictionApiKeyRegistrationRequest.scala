package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1CreatePredictionApiKeyRegistrationRequest extends StObject {
  
  /** Required. The prediction API key registration. */
  var predictionApiKeyRegistration: js.UndefOr[GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration] = js.native
}
object GoogleCloudRecommendationengineV1beta1CreatePredictionApiKeyRegistrationRequest {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1CreatePredictionApiKeyRegistrationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1CreatePredictionApiKeyRegistrationRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1CreatePredictionApiKeyRegistrationRequestMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1CreatePredictionApiKeyRegistrationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPredictionApiKeyRegistration(value: GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration): Self = StObject.set(x, "predictionApiKeyRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictionApiKeyRegistrationUndefined: Self = StObject.set(x, "predictionApiKeyRegistration", js.undefined)
  }
}
