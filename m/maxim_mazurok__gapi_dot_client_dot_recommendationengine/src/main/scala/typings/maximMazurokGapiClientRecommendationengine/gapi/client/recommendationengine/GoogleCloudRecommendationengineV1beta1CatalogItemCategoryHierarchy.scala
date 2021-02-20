package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy extends StObject {
  
  /**
    * Required. Catalog item categories. Each category should be a UTF-8 encoded string with a length limit of 2 KiB. Note that the order in the list denotes the specificity (from least
    * to most specific).
    */
  var categories: js.UndefOr[js.Array[String]] = js.native
}
object GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchyMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
  }
}
