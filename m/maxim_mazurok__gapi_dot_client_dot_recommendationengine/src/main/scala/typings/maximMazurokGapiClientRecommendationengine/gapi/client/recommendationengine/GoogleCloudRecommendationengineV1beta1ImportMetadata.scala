package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1ImportMetadata extends js.Object {
  
  /** Operation create time. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Count of entries that encountered errors while processing. */
  var failureCount: js.UndefOr[String] = js.native
  
  /** Name of the operation. */
  var operationName: js.UndefOr[String] = js.native
  
  /** Id of the request / operation. This is parroting back the requestId that was passed in the request. */
  var requestId: js.UndefOr[String] = js.native
  
  /** Count of entries that were processed successfully. */
  var successCount: js.UndefOr[String] = js.native
  
  /** Operation last update time. If the operation is done, this is also the finish time. */
  var updateTime: js.UndefOr[String] = js.native
}
object GoogleCloudRecommendationengineV1beta1ImportMetadata {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1ImportMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1ImportMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1ImportMetadataOps[Self <: GoogleCloudRecommendationengineV1beta1ImportMetadata] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setFailureCount(value: String): Self = this.set("failureCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureCount: Self = this.set("failureCount", js.undefined)
    
    @scala.inline
    def setOperationName(value: String): Self = this.set("operationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationName: Self = this.set("operationName", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
    
    @scala.inline
    def setSuccessCount(value: String): Self = this.set("successCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessCount: Self = this.set("successCount", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
