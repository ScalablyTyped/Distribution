package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1ListCatalogItemsResponse extends js.Object {
  
  /** The catalog items. */
  var catalogItems: js.UndefOr[js.Array[GoogleCloudRecommendationengineV1beta1CatalogItem]] = js.native
  
  /** If empty, the list is complete. If nonempty, the token to pass to the next request's ListCatalogItemRequest.page_token. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleCloudRecommendationengineV1beta1ListCatalogItemsResponse {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1ListCatalogItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1ListCatalogItemsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1ListCatalogItemsResponseOps[Self <: GoogleCloudRecommendationengineV1beta1ListCatalogItemsResponse] (val x: Self) extends AnyVal {
    
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
    def setCatalogItemsVarargs(value: GoogleCloudRecommendationengineV1beta1CatalogItem*): Self = this.set("catalogItems", js.Array(value :_*))
    
    @scala.inline
    def setCatalogItems(value: js.Array[GoogleCloudRecommendationengineV1beta1CatalogItem]): Self = this.set("catalogItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogItems: Self = this.set("catalogItems", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
