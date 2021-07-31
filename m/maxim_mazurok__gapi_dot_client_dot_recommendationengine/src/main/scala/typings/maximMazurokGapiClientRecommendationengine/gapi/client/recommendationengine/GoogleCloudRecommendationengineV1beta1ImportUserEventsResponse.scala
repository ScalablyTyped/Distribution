package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommendationengineV1beta1ImportUserEventsResponse extends StObject {
  
  /** A sample of errors encountered while processing the request. */
  var errorSamples: js.UndefOr[js.Array[GoogleRpcStatus]] = js.undefined
  
  /** Echoes the destination for the complete errors if this field was set in the request. */
  var errorsConfig: js.UndefOr[GoogleCloudRecommendationengineV1beta1ImportErrorsConfig] = js.undefined
  
  /** Aggregated statistics of user event import status. */
  var importSummary: js.UndefOr[GoogleCloudRecommendationengineV1beta1UserEventImportSummary] = js.undefined
}
object GoogleCloudRecommendationengineV1beta1ImportUserEventsResponse {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1ImportUserEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1ImportUserEventsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1ImportUserEventsResponseMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1ImportUserEventsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorSamples(value: js.Array[GoogleRpcStatus]): Self = StObject.set(x, "errorSamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorSamplesUndefined: Self = StObject.set(x, "errorSamples", js.undefined)
    
    @scala.inline
    def setErrorSamplesVarargs(value: GoogleRpcStatus*): Self = StObject.set(x, "errorSamples", js.Array(value :_*))
    
    @scala.inline
    def setErrorsConfig(value: GoogleCloudRecommendationengineV1beta1ImportErrorsConfig): Self = StObject.set(x, "errorsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsConfigUndefined: Self = StObject.set(x, "errorsConfig", js.undefined)
    
    @scala.inline
    def setImportSummary(value: GoogleCloudRecommendationengineV1beta1UserEventImportSummary): Self = StObject.set(x, "importSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportSummaryUndefined: Self = StObject.set(x, "importSummary", js.undefined)
  }
}
