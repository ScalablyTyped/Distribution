package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1CatalogItemLevelConfig extends js.Object {
  
  /** Optional. Level of the catalog at which events are uploaded. See https://cloud.google.com/recommendations-ai/docs/catalog#catalog-levels for more details. */
  var eventItemLevel: js.UndefOr[String] = js.native
  
  /** Optional. Level of the catalog at which predictions are made. See https://cloud.google.com/recommendations-ai/docs/catalog#catalog-levels for more details. */
  var predictItemLevel: js.UndefOr[String] = js.native
}
object GoogleCloudRecommendationengineV1beta1CatalogItemLevelConfig {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1CatalogItemLevelConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1CatalogItemLevelConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1CatalogItemLevelConfigOps[Self <: GoogleCloudRecommendationengineV1beta1CatalogItemLevelConfig] (val x: Self) extends AnyVal {
    
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
    def setEventItemLevel(value: String): Self = this.set("eventItemLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventItemLevel: Self = this.set("eventItemLevel", js.undefined)
    
    @scala.inline
    def setPredictItemLevel(value: String): Self = this.set("predictItemLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredictItemLevel: Self = this.set("predictItemLevel", js.undefined)
  }
}
