package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration extends js.Object {
  
  /** The API key. */
  var apiKey: js.UndefOr[String] = js.native
}
object GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistrationOps[Self <: GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration] (val x: Self) extends AnyVal {
    
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiKey: Self = this.set("apiKey", js.undefined)
  }
}
