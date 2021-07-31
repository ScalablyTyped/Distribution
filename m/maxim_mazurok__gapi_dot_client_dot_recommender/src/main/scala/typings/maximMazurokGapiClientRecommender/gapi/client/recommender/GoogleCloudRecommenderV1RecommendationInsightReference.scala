package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommenderV1RecommendationInsightReference extends StObject {
  
  /** Insight resource name, e.g. projects/[PROJECT_NUMBER]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]/insights/[INSIGHT_ID] */
  var insight: js.UndefOr[String] = js.undefined
}
object GoogleCloudRecommenderV1RecommendationInsightReference {
  
  @scala.inline
  def apply(): GoogleCloudRecommenderV1RecommendationInsightReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1RecommendationInsightReference]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommenderV1RecommendationInsightReferenceMutableBuilder[Self <: GoogleCloudRecommenderV1RecommendationInsightReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsight(value: String): Self = StObject.set(x, "insight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightUndefined: Self = StObject.set(x, "insight", js.undefined)
  }
}
