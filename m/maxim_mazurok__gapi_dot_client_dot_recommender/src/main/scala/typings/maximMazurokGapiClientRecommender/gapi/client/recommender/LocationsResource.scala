package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends js.Object {
  
  var insightTypes: InsightTypesResource = js.native
  
  var recommenders: RecommendersResource = js.native
}
object LocationsResource {
  
  @scala.inline
  def apply(insightTypes: InsightTypesResource, recommenders: RecommendersResource): LocationsResource = {
    val __obj = js.Dynamic.literal(insightTypes = insightTypes.asInstanceOf[js.Any], recommenders = recommenders.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  @scala.inline
  implicit class LocationsResourceOps[Self <: LocationsResource] (val x: Self) extends AnyVal {
    
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
    def setInsightTypes(value: InsightTypesResource): Self = this.set("insightTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommenders(value: RecommendersResource): Self = this.set("recommenders", value.asInstanceOf[js.Any])
  }
}
