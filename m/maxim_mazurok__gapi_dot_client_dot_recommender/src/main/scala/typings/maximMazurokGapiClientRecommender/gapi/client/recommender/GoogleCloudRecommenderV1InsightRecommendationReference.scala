package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommenderV1InsightRecommendationReference extends StObject {
  
  /** Recommendation resource name, e.g. projects/[PROJECT_NUMBER]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]/recommendations/[RECOMMENDATION_ID] */
  var recommendation: js.UndefOr[String] = js.undefined
}
object GoogleCloudRecommenderV1InsightRecommendationReference {
  
  inline def apply(): GoogleCloudRecommenderV1InsightRecommendationReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1InsightRecommendationReference]
  }
  
  extension [Self <: GoogleCloudRecommenderV1InsightRecommendationReference](x: Self) {
    
    inline def setRecommendation(value: String): Self = StObject.set(x, "recommendation", value.asInstanceOf[js.Any])
    
    inline def setRecommendationUndefined: Self = StObject.set(x, "recommendation", js.undefined)
  }
}
