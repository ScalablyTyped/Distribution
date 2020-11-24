package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1Catalog extends js.Object {
  
  /** Required. The catalog item level configuration. */
  var catalogItemLevelConfig: js.UndefOr[GoogleCloudRecommendationengineV1beta1CatalogItemLevelConfig] = js.native
  
  /** Required. The ID of the default event store. */
  var defaultEventStoreId: js.UndefOr[String] = js.native
  
  /** Required. The catalog display name. */
  var displayName: js.UndefOr[String] = js.native
  
  /** The fully qualified resource name of the catalog. */
  var name: js.UndefOr[String] = js.native
}
object GoogleCloudRecommendationengineV1beta1Catalog {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1Catalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1Catalog]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1CatalogOps[Self <: GoogleCloudRecommendationengineV1beta1Catalog] (val x: Self) extends AnyVal {
    
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
    def setCatalogItemLevelConfig(value: GoogleCloudRecommendationengineV1beta1CatalogItemLevelConfig): Self = this.set("catalogItemLevelConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogItemLevelConfig: Self = this.set("catalogItemLevelConfig", js.undefined)
    
    @scala.inline
    def setDefaultEventStoreId(value: String): Self = this.set("defaultEventStoreId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultEventStoreId: Self = this.set("defaultEventStoreId", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
