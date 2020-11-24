package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1ImportUserEventsResponse extends js.Object {
  
  /** A sample of errors encountered while processing the request. */
  var errorSamples: js.UndefOr[js.Array[GoogleRpcStatus]] = js.native
  
  /** Echoes the destination for the complete errors if this field was set in the request. */
  var errorsConfig: js.UndefOr[GoogleCloudRecommendationengineV1beta1ImportErrorsConfig] = js.native
  
  /** Aggregated statistics of user event import status. */
  var importSummary: js.UndefOr[GoogleCloudRecommendationengineV1beta1UserEventImportSummary] = js.native
}
object GoogleCloudRecommendationengineV1beta1ImportUserEventsResponse {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1ImportUserEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1ImportUserEventsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1ImportUserEventsResponseOps[Self <: GoogleCloudRecommendationengineV1beta1ImportUserEventsResponse] (val x: Self) extends AnyVal {
    
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
    def setErrorSamplesVarargs(value: GoogleRpcStatus*): Self = this.set("errorSamples", js.Array(value :_*))
    
    @scala.inline
    def setErrorSamples(value: js.Array[GoogleRpcStatus]): Self = this.set("errorSamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorSamples: Self = this.set("errorSamples", js.undefined)
    
    @scala.inline
    def setErrorsConfig(value: GoogleCloudRecommendationengineV1beta1ImportErrorsConfig): Self = this.set("errorsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorsConfig: Self = this.set("errorsConfig", js.undefined)
    
    @scala.inline
    def setImportSummary(value: GoogleCloudRecommendationengineV1beta1UserEventImportSummary): Self = this.set("importSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportSummary: Self = this.set("importSummary", js.undefined)
  }
}
