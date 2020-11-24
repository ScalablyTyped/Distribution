package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecommendersResource extends js.Object {
  
  var recommendations: RecommendationsResource = js.native
}
object RecommendersResource {
  
  @scala.inline
  def apply(recommendations: RecommendationsResource): RecommendersResource = {
    val __obj = js.Dynamic.literal(recommendations = recommendations.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendersResource]
  }
  
  @scala.inline
  implicit class RecommendersResourceOps[Self <: RecommendersResource] (val x: Self) extends AnyVal {
    
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
    def setRecommendations(value: RecommendationsResource): Self = this.set("recommendations", value.asInstanceOf[js.Any])
  }
}
