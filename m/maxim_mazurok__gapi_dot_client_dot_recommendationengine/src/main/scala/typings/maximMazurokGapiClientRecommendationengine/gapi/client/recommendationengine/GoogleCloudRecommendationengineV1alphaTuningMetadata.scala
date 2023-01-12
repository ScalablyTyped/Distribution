package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommendationengineV1alphaTuningMetadata extends StObject {
  
  /**
    * The resource name of the recommendation model that this tune applies to. Format:
    * projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/eventStores/{event_store_id}/recommendationModels/{recommendation_model_id}
    */
  var recommendationModel: js.UndefOr[String] = js.undefined
}
object GoogleCloudRecommendationengineV1alphaTuningMetadata {
  
  inline def apply(): GoogleCloudRecommendationengineV1alphaTuningMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1alphaTuningMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudRecommendationengineV1alphaTuningMetadata] (val x: Self) extends AnyVal {
    
    inline def setRecommendationModel(value: String): Self = StObject.set(x, "recommendationModel", value.asInstanceOf[js.Any])
    
    inline def setRecommendationModelUndefined: Self = StObject.set(x, "recommendationModel", js.undefined)
  }
}
