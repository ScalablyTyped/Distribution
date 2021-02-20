package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1PurgeUserEventsMetadata extends StObject {
  
  /** Operation create time. */
  var createTime: js.UndefOr[String] = js.native
  
  /** The ID of the request / operation. */
  var operationName: js.UndefOr[String] = js.native
}
object GoogleCloudRecommendationengineV1beta1PurgeUserEventsMetadata {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1PurgeUserEventsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1PurgeUserEventsMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1PurgeUserEventsMetadataMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1PurgeUserEventsMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setOperationName(value: String): Self = StObject.set(x, "operationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationNameUndefined: Self = StObject.set(x, "operationName", js.undefined)
  }
}
