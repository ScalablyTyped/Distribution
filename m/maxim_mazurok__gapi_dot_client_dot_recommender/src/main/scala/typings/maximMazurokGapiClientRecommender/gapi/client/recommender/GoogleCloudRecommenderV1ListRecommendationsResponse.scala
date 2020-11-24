package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommenderV1ListRecommendationsResponse extends js.Object {
  
  /** A token that can be used to request the next page of results. This field is empty if there are no additional results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The set of recommendations for the `parent` resource. */
  var recommendations: js.UndefOr[js.Array[GoogleCloudRecommenderV1Recommendation]] = js.native
}
object GoogleCloudRecommenderV1ListRecommendationsResponse {
  
  @scala.inline
  def apply(): GoogleCloudRecommenderV1ListRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1ListRecommendationsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommenderV1ListRecommendationsResponseOps[Self <: GoogleCloudRecommenderV1ListRecommendationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setRecommendationsVarargs(value: GoogleCloudRecommenderV1Recommendation*): Self = this.set("recommendations", js.Array(value :_*))
    
    @scala.inline
    def setRecommendations(value: js.Array[GoogleCloudRecommenderV1Recommendation]): Self = this.set("recommendations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommendations: Self = this.set("recommendations", js.undefined)
  }
}
