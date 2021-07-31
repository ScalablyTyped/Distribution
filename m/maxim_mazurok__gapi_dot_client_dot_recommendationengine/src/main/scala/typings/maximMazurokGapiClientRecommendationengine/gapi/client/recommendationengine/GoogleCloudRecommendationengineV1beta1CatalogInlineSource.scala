package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommendationengineV1beta1CatalogInlineSource extends StObject {
  
  /** Optional. A list of catalog items to update/create. Recommended max of 10k items. */
  var catalogItems: js.UndefOr[js.Array[GoogleCloudRecommendationengineV1beta1CatalogItem]] = js.undefined
}
object GoogleCloudRecommendationengineV1beta1CatalogInlineSource {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1CatalogInlineSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1CatalogInlineSource]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1CatalogInlineSourceMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1CatalogInlineSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogItems(value: js.Array[GoogleCloudRecommendationengineV1beta1CatalogItem]): Self = StObject.set(x, "catalogItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogItemsUndefined: Self = StObject.set(x, "catalogItems", js.undefined)
    
    @scala.inline
    def setCatalogItemsVarargs(value: GoogleCloudRecommendationengineV1beta1CatalogItem*): Self = StObject.set(x, "catalogItems", js.Array(value :_*))
  }
}
