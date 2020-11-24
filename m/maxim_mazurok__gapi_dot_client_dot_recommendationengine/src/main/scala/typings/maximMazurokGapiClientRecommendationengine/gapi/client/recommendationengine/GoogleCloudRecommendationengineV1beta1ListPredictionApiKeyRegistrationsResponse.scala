package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse extends js.Object {
  
  /** If empty, the list is complete. If nonempty, pass the token to the next request's `ListPredictionApiKeysRegistrationsRequest.pageToken`. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of registered API keys. */
  var predictionApiKeyRegistrations: js.UndefOr[js.Array[GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration]] = js.native
}
object GoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponseOps[Self <: GoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setPredictionApiKeyRegistrationsVarargs(value: GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration*): Self = this.set("predictionApiKeyRegistrations", js.Array(value :_*))
    
    @scala.inline
    def setPredictionApiKeyRegistrations(value: js.Array[GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration]): Self = this.set("predictionApiKeyRegistrations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredictionApiKeyRegistrations: Self = this.set("predictionApiKeyRegistrations", js.undefined)
  }
}
