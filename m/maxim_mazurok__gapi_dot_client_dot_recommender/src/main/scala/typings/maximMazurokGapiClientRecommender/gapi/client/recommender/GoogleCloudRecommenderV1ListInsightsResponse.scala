package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommenderV1ListInsightsResponse extends js.Object {
  
  /** The set of insights for the `parent` resource. */
  var insights: js.UndefOr[js.Array[GoogleCloudRecommenderV1Insight]] = js.native
  
  /** A token that can be used to request the next page of results. This field is empty if there are no additional results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleCloudRecommenderV1ListInsightsResponse {
  
  @scala.inline
  def apply(): GoogleCloudRecommenderV1ListInsightsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1ListInsightsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommenderV1ListInsightsResponseOps[Self <: GoogleCloudRecommenderV1ListInsightsResponse] (val x: Self) extends AnyVal {
    
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
    def setInsightsVarargs(value: GoogleCloudRecommenderV1Insight*): Self = this.set("insights", js.Array(value :_*))
    
    @scala.inline
    def setInsights(value: js.Array[GoogleCloudRecommenderV1Insight]): Self = this.set("insights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsights: Self = this.set("insights", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
