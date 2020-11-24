package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightTypesResource extends js.Object {
  
  var insights: InsightsResource = js.native
}
object InsightTypesResource {
  
  @scala.inline
  def apply(insights: InsightsResource): InsightTypesResource = {
    val __obj = js.Dynamic.literal(insights = insights.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightTypesResource]
  }
  
  @scala.inline
  implicit class InsightTypesResourceOps[Self <: InsightTypesResource] (val x: Self) extends AnyVal {
    
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
    def setInsights(value: InsightsResource): Self = this.set("insights", value.asInstanceOf[js.Any])
  }
}
