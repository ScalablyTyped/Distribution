package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommenderV1ListRecommendationsResponse extends StObject {
  
  /** A token that can be used to request the next page of results. This field is empty if there are no additional results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The set of recommendations for the `parent` resource. */
  var recommendations: js.UndefOr[js.Array[GoogleCloudRecommenderV1Recommendation]] = js.undefined
}
object GoogleCloudRecommenderV1ListRecommendationsResponse {
  
  inline def apply(): GoogleCloudRecommenderV1ListRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1ListRecommendationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudRecommenderV1ListRecommendationsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRecommendations(value: js.Array[GoogleCloudRecommenderV1Recommendation]): Self = StObject.set(x, "recommendations", value.asInstanceOf[js.Any])
    
    inline def setRecommendationsUndefined: Self = StObject.set(x, "recommendations", js.undefined)
    
    inline def setRecommendationsVarargs(value: GoogleCloudRecommenderV1Recommendation*): Self = StObject.set(x, "recommendations", js.Array(value*))
  }
}
