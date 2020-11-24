package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1PurgeUserEventsMetadata extends js.Object {
  
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
  implicit class GoogleCloudRecommendationengineV1beta1PurgeUserEventsMetadataOps[Self <: GoogleCloudRecommendationengineV1beta1PurgeUserEventsMetadata] (val x: Self) extends AnyVal {
    
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
    def setOperationName(value: String): Self = this.set("operationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationName: Self = this.set("operationName", js.undefined)
  }
}
