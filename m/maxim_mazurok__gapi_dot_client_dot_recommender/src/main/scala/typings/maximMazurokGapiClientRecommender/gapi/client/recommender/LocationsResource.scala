package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationsResource extends StObject {
  
  var insightTypes: InsightTypesResource
  
  var recommenders: RecommendersResource
}
object LocationsResource {
  
  inline def apply(insightTypes: InsightTypesResource, recommenders: RecommendersResource): LocationsResource = {
    val __obj = js.Dynamic.literal(insightTypes = insightTypes.asInstanceOf[js.Any], recommenders = recommenders.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  extension [Self <: LocationsResource](x: Self) {
    
    inline def setInsightTypes(value: InsightTypesResource): Self = StObject.set(x, "insightTypes", value.asInstanceOf[js.Any])
    
    inline def setRecommenders(value: RecommendersResource): Self = StObject.set(x, "recommenders", value.asInstanceOf[js.Any])
  }
}
