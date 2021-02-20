package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1ImportMetadata extends StObject {
  
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
  implicit class GoogleCloudRecommendationengineV1beta1ImportMetadataMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1ImportMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setFailureCount(value: String): Self = StObject.set(x, "failureCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCountUndefined: Self = StObject.set(x, "failureCount", js.undefined)
    
    @scala.inline
    def setOperationName(value: String): Self = StObject.set(x, "operationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationNameUndefined: Self = StObject.set(x, "operationName", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    @scala.inline
    def setSuccessCount(value: String): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessCountUndefined: Self = StObject.set(x, "successCount", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
