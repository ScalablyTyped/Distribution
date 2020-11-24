package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1ImportCatalogItemsRequest extends js.Object {
  
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
  implicit class GoogleCloudRecommendationengineV1beta1ImportCatalogItemsRequestOps[Self <: GoogleCloudRecommendationengineV1beta1ImportCatalogItemsRequest] (val x: Self) extends AnyVal {
    
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
    def setErrorsConfig(value: GoogleCloudRecommendationengineV1beta1ImportErrorsConfig): Self = this.set("errorsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorsConfig: Self = this.set("errorsConfig", js.undefined)
    
    @scala.inline
    def setInputConfig(value: GoogleCloudRecommendationengineV1beta1InputConfig): Self = this.set("inputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputConfig: Self = this.set("inputConfig", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
}
