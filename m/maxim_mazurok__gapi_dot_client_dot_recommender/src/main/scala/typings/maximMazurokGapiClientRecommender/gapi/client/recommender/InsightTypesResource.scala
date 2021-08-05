package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightTypesResource extends StObject {
  
  var insights: InsightsResource
}
object InsightTypesResource {
  
  inline def apply(insights: InsightsResource): InsightTypesResource = {
    val __obj = js.Dynamic.literal(insights = insights.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightTypesResource]
  }
  
  extension [Self <: InsightTypesResource](x: Self) {
    
    inline def setInsights(value: InsightsResource): Self = StObject.set(x, "insights", value.asInstanceOf[js.Any])
  }
}
