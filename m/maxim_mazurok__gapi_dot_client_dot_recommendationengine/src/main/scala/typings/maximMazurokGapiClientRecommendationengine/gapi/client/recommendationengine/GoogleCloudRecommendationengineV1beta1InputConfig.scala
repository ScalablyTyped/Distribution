package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommendationengineV1beta1InputConfig extends StObject {
  
  /** BigQuery input source. */
  var bigQuerySource: js.UndefOr[GoogleCloudRecommendationengineV1beta1BigQuerySource] = js.undefined
  
  /** The Inline source for the input content for Catalog items. */
  var catalogInlineSource: js.UndefOr[GoogleCloudRecommendationengineV1beta1CatalogInlineSource] = js.undefined
  
  /** Google Cloud Storage location for the input content. */
  var gcsSource: js.UndefOr[GoogleCloudRecommendationengineV1beta1GcsSource] = js.undefined
  
  /** The Inline source for the input content for UserEvents. */
  var userEventInlineSource: js.UndefOr[GoogleCloudRecommendationengineV1beta1UserEventInlineSource] = js.undefined
}
object GoogleCloudRecommendationengineV1beta1InputConfig {
  
  inline def apply(): GoogleCloudRecommendationengineV1beta1InputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1InputConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1InputConfig] (val x: Self) extends AnyVal {
    
    inline def setBigQuerySource(value: GoogleCloudRecommendationengineV1beta1BigQuerySource): Self = StObject.set(x, "bigQuerySource", value.asInstanceOf[js.Any])
    
    inline def setBigQuerySourceUndefined: Self = StObject.set(x, "bigQuerySource", js.undefined)
    
    inline def setCatalogInlineSource(value: GoogleCloudRecommendationengineV1beta1CatalogInlineSource): Self = StObject.set(x, "catalogInlineSource", value.asInstanceOf[js.Any])
    
    inline def setCatalogInlineSourceUndefined: Self = StObject.set(x, "catalogInlineSource", js.undefined)
    
    inline def setGcsSource(value: GoogleCloudRecommendationengineV1beta1GcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
    
    inline def setUserEventInlineSource(value: GoogleCloudRecommendationengineV1beta1UserEventInlineSource): Self = StObject.set(x, "userEventInlineSource", value.asInstanceOf[js.Any])
    
    inline def setUserEventInlineSourceUndefined: Self = StObject.set(x, "userEventInlineSource", js.undefined)
  }
}
