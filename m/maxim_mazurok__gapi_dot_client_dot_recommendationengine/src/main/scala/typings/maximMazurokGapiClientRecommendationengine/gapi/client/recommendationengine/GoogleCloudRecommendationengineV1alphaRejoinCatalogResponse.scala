package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommendationengineV1alphaRejoinCatalogResponse extends StObject {
  
  /** Number of user events that were joined with latest catalog items. */
  var rejoinedUserEventsCount: js.UndefOr[String] = js.undefined
}
object GoogleCloudRecommendationengineV1alphaRejoinCatalogResponse {
  
  inline def apply(): GoogleCloudRecommendationengineV1alphaRejoinCatalogResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1alphaRejoinCatalogResponse]
  }
  
  extension [Self <: GoogleCloudRecommendationengineV1alphaRejoinCatalogResponse](x: Self) {
    
    inline def setRejoinedUserEventsCount(value: String): Self = StObject.set(x, "rejoinedUserEventsCount", value.asInstanceOf[js.Any])
    
    inline def setRejoinedUserEventsCountUndefined: Self = StObject.set(x, "rejoinedUserEventsCount", js.undefined)
  }
}
