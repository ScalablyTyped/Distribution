package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1CreatePredictionApiKeyRegistrationRequest extends js.Object {
  
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
  implicit class GoogleCloudRecommendationengineV1beta1CreatePredictionApiKeyRegistrationRequestOps[Self <: GoogleCloudRecommendationengineV1beta1CreatePredictionApiKeyRegistrationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPredictionApiKeyRegistration(value: GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration): Self = this.set("predictionApiKeyRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredictionApiKeyRegistration: Self = this.set("predictionApiKeyRegistration", js.undefined)
  }
}
