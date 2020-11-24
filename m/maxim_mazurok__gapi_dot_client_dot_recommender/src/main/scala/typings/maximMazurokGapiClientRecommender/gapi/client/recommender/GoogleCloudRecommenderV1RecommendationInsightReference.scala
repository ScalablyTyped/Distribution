package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommenderV1RecommendationInsightReference extends js.Object {
  
  /** Insight resource name, e.g. projects/[PROJECT_NUMBER]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]/insights/[INSIGHT_ID] */
  var insight: js.UndefOr[String] = js.native
}
object GoogleCloudRecommenderV1RecommendationInsightReference {
  
  @scala.inline
  def apply(): GoogleCloudRecommenderV1RecommendationInsightReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1RecommendationInsightReference]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommenderV1RecommendationInsightReferenceOps[Self <: GoogleCloudRecommenderV1RecommendationInsightReference] (val x: Self) extends AnyVal {
    
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
    def setInsight(value: String): Self = this.set("insight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsight: Self = this.set("insight", js.undefined)
  }
}
