package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommendationengineV1beta1Catalog extends StObject {
  
  /** Required. The catalog item level configuration. */
  var catalogItemLevelConfig: js.UndefOr[GoogleCloudRecommendationengineV1beta1CatalogItemLevelConfig] = js.undefined
  
  /** Required. The ID of the default event store. */
  var defaultEventStoreId: js.UndefOr[String] = js.undefined
  
  /** Required. The catalog display name. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The fully qualified resource name of the catalog. */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleCloudRecommendationengineV1beta1Catalog {
  
  inline def apply(): GoogleCloudRecommendationengineV1beta1Catalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1Catalog]
  }
  
  extension [Self <: GoogleCloudRecommendationengineV1beta1Catalog](x: Self) {
    
    inline def setCatalogItemLevelConfig(value: GoogleCloudRecommendationengineV1beta1CatalogItemLevelConfig): Self = StObject.set(x, "catalogItemLevelConfig", value.asInstanceOf[js.Any])
    
    inline def setCatalogItemLevelConfigUndefined: Self = StObject.set(x, "catalogItemLevelConfig", js.undefined)
    
    inline def setDefaultEventStoreId(value: String): Self = StObject.set(x, "defaultEventStoreId", value.asInstanceOf[js.Any])
    
    inline def setDefaultEventStoreIdUndefined: Self = StObject.set(x, "defaultEventStoreId", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
