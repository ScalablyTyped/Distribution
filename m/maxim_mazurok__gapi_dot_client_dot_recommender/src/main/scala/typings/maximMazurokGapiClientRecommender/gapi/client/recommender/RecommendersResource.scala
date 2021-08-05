package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendersResource extends StObject {
  
  var recommendations: RecommendationsResource
}
object RecommendersResource {
  
  inline def apply(recommendations: RecommendationsResource): RecommendersResource = {
    val __obj = js.Dynamic.literal(recommendations = recommendations.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendersResource]
  }
  
  extension [Self <: RecommendersResource](x: Self) {
    
    inline def setRecommendations(value: RecommendationsResource): Self = StObject.set(x, "recommendations", value.asInstanceOf[js.Any])
  }
}
