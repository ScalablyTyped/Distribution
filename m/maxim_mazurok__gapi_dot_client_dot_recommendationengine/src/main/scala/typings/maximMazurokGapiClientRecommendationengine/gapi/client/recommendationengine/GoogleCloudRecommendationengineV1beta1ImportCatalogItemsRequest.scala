package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1ImportCatalogItemsRequest extends StObject {
  
  /** Optional. The desired location of errors incurred during the Import. */
  var errorsConfig: js.UndefOr[GoogleCloudRecommendationengineV1beta1ImportErrorsConfig] = js.native
  
  /** Required. The desired input location of the data. */
  var inputConfig: js.UndefOr[GoogleCloudRecommendationengineV1beta1InputConfig] = js.native
  
  /**
    * Optional. Unique identifier provided by client, within the ancestor dataset scope. Ensures idempotency and used for request deduplication. Server-generated if unspecified. Up to 128
    * characters long. This is returned as google.longrunning.Operation.name in the response.
    */
  var requestId: js.UndefOr[String] = js.native
  
  /** Optional. Indicates which fields in the provided imported 'items' to update. If not set, will by default update all fields. */
  var updateMask: js.UndefOr[String] = js.native
}
object GoogleCloudRecommendationengineV1beta1ImportCatalogItemsRequest {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1ImportCatalogItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1ImportCatalogItemsRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1ImportCatalogItemsRequestMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1ImportCatalogItemsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorsConfig(value: GoogleCloudRecommendationengineV1beta1ImportErrorsConfig): Self = StObject.set(x, "errorsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsConfigUndefined: Self = StObject.set(x, "errorsConfig", js.undefined)
    
    @scala.inline
    def setInputConfig(value: GoogleCloudRecommendationengineV1beta1InputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
