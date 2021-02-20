package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1alphaRejoinCatalogResponse extends StObject {
  
  /** Number of user events that were joined with latest catalog items. */
  var rejoinedUserEventsCount: js.UndefOr[String] = js.native
}
object GoogleCloudRecommendationengineV1alphaRejoinCatalogResponse {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1alphaRejoinCatalogResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1alphaRejoinCatalogResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1alphaRejoinCatalogResponseMutableBuilder[Self <: GoogleCloudRecommendationengineV1alphaRejoinCatalogResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRejoinedUserEventsCount(value: String): Self = StObject.set(x, "rejoinedUserEventsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejoinedUserEventsCountUndefined: Self = StObject.set(x, "rejoinedUserEventsCount", js.undefined)
  }
}
