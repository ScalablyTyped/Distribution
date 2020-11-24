package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1InputConfig extends js.Object {
  
  /** BigQuery input source. */
  var bigQuerySource: js.UndefOr[GoogleCloudRecommendationengineV1beta1BigQuerySource] = js.native
  
  /** The Inline source for the input content for Catalog items. */
  var catalogInlineSource: js.UndefOr[GoogleCloudRecommendationengineV1beta1CatalogInlineSource] = js.native
  
  /** Google Cloud Storage location for the input content. */
  var gcsSource: js.UndefOr[GoogleCloudRecommendationengineV1beta1GcsSource] = js.native
  
  /** The Inline source for the input content for UserEvents. */
  var userEventInlineSource: js.UndefOr[GoogleCloudRecommendationengineV1beta1UserEventInlineSource] = js.native
}
object GoogleCloudRecommendationengineV1beta1InputConfig {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1InputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1InputConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1InputConfigOps[Self <: GoogleCloudRecommendationengineV1beta1InputConfig] (val x: Self) extends AnyVal {
    
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
    def setBigQuerySource(value: GoogleCloudRecommendationengineV1beta1BigQuerySource): Self = this.set("bigQuerySource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBigQuerySource: Self = this.set("bigQuerySource", js.undefined)
    
    @scala.inline
    def setCatalogInlineSource(value: GoogleCloudRecommendationengineV1beta1CatalogInlineSource): Self = this.set("catalogInlineSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogInlineSource: Self = this.set("catalogInlineSource", js.undefined)
    
    @scala.inline
    def setGcsSource(value: GoogleCloudRecommendationengineV1beta1GcsSource): Self = this.set("gcsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsSource: Self = this.set("gcsSource", js.undefined)
    
    @scala.inline
    def setUserEventInlineSource(value: GoogleCloudRecommendationengineV1beta1UserEventInlineSource): Self = this.set("userEventInlineSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserEventInlineSource: Self = this.set("userEventInlineSource", js.undefined)
  }
}
