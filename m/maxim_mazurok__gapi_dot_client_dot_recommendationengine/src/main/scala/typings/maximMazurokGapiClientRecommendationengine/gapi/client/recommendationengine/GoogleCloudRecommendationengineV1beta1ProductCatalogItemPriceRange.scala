package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRange extends StObject {
  
  /** Required. The maximum product price. */
  var max: js.UndefOr[Double] = js.undefined
  
  /** Required. The minimum product price. */
  var min: js.UndefOr[Double] = js.undefined
}
object GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRange {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRange]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
