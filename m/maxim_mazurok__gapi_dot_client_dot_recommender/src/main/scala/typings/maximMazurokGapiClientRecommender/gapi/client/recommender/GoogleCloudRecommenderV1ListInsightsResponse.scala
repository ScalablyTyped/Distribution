package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommenderV1ListInsightsResponse extends StObject {
  
  /** The set of insights for the `parent` resource. */
  var insights: js.UndefOr[js.Array[GoogleCloudRecommenderV1Insight]] = js.undefined
  
  /** A token that can be used to request the next page of results. This field is empty if there are no additional results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudRecommenderV1ListInsightsResponse {
  
  inline def apply(): GoogleCloudRecommenderV1ListInsightsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1ListInsightsResponse]
  }
  
  extension [Self <: GoogleCloudRecommenderV1ListInsightsResponse](x: Self) {
    
    inline def setInsights(value: js.Array[GoogleCloudRecommenderV1Insight]): Self = StObject.set(x, "insights", value.asInstanceOf[js.Any])
    
    inline def setInsightsUndefined: Self = StObject.set(x, "insights", js.undefined)
    
    inline def setInsightsVarargs(value: GoogleCloudRecommenderV1Insight*): Self = StObject.set(x, "insights", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
