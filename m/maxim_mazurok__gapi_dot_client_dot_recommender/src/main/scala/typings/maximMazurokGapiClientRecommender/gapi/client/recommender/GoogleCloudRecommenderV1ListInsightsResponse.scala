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
  
  @scala.inline
  def apply(): GoogleCloudRecommenderV1ListInsightsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1ListInsightsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommenderV1ListInsightsResponseMutableBuilder[Self <: GoogleCloudRecommenderV1ListInsightsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsights(value: js.Array[GoogleCloudRecommenderV1Insight]): Self = StObject.set(x, "insights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightsUndefined: Self = StObject.set(x, "insights", js.undefined)
    
    @scala.inline
    def setInsightsVarargs(value: GoogleCloudRecommenderV1Insight*): Self = StObject.set(x, "insights", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
