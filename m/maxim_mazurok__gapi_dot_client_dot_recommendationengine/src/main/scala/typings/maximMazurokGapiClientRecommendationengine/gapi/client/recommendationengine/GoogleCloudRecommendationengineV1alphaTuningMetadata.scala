package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1alphaTuningMetadata extends js.Object {
  
  /**
    * The resource name of the recommendation model that this tune applies to. Format:
    * projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/eventStores/{event_store_id}/recommendationModels/{recommendation_model_id}
    */
  var recommendationModel: js.UndefOr[String] = js.native
}
object GoogleCloudRecommendationengineV1alphaTuningMetadata {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1alphaTuningMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1alphaTuningMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1alphaTuningMetadataOps[Self <: GoogleCloudRecommendationengineV1alphaTuningMetadata] (val x: Self) extends AnyVal {
    
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
    def setRecommendationModel(value: String): Self = this.set("recommendationModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommendationModel: Self = this.set("recommendationModel", js.undefined)
  }
}
