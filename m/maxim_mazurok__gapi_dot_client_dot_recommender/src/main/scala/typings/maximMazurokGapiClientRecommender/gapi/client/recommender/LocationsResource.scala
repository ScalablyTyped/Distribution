package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
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
  implicit class LocationsResourceMutableBuilder[Self <: LocationsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsightTypes(value: InsightTypesResource): Self = StObject.set(x, "insightTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommenders(value: RecommendersResource): Self = StObject.set(x, "recommenders", value.asInstanceOf[js.Any])
  }
}
