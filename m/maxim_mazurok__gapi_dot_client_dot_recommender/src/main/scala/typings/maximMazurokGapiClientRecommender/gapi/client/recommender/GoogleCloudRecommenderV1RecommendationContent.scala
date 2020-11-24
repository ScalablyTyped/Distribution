package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommenderV1RecommendationContent extends js.Object {
  
  /** Operations to one or more Google Cloud resources grouped in such a way that, all operations within one group are expected to be performed atomically and in an order. */
  var operationGroups: js.UndefOr[js.Array[GoogleCloudRecommenderV1OperationGroup]] = js.native
}
object GoogleCloudRecommenderV1RecommendationContent {
  
  @scala.inline
  def apply(): GoogleCloudRecommenderV1RecommendationContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1RecommendationContent]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommenderV1RecommendationContentOps[Self <: GoogleCloudRecommenderV1RecommendationContent] (val x: Self) extends AnyVal {
    
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
    def setOperationGroupsVarargs(value: GoogleCloudRecommenderV1OperationGroup*): Self = this.set("operationGroups", js.Array(value :_*))
    
    @scala.inline
    def setOperationGroups(value: js.Array[GoogleCloudRecommenderV1OperationGroup]): Self = this.set("operationGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationGroups: Self = this.set("operationGroups", js.undefined)
  }
}
