package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommendationengineV1beta1CatalogItemLevelConfig extends StObject {
  
  /** Optional. Level of the catalog at which events are uploaded. See https://cloud.google.com/recommendations-ai/docs/catalog#catalog-levels for more details. */
  var eventItemLevel: js.UndefOr[String] = js.undefined
  
  /** Optional. Level of the catalog at which predictions are made. See https://cloud.google.com/recommendations-ai/docs/catalog#catalog-levels for more details. */
  var predictItemLevel: js.UndefOr[String] = js.undefined
}
object GoogleCloudRecommendationengineV1beta1CatalogItemLevelConfig {
  
  inline def apply(): GoogleCloudRecommendationengineV1beta1CatalogItemLevelConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1CatalogItemLevelConfig]
  }
  
  extension [Self <: GoogleCloudRecommendationengineV1beta1CatalogItemLevelConfig](x: Self) {
    
    inline def setEventItemLevel(value: String): Self = StObject.set(x, "eventItemLevel", value.asInstanceOf[js.Any])
    
    inline def setEventItemLevelUndefined: Self = StObject.set(x, "eventItemLevel", js.undefined)
    
    inline def setPredictItemLevel(value: String): Self = StObject.set(x, "predictItemLevel", value.asInstanceOf[js.Any])
    
    inline def setPredictItemLevelUndefined: Self = StObject.set(x, "predictItemLevel", js.undefined)
  }
}
