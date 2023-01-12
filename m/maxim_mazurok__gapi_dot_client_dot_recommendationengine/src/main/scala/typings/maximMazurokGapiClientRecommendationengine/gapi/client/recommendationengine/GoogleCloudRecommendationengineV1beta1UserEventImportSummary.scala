package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommendationengineV1beta1UserEventImportSummary extends StObject {
  
  /** Count of user events imported with complete existing catalog information. */
  var joinedEventsCount: js.UndefOr[String] = js.undefined
  
  /** Count of user events imported, but with catalog information not found in the imported catalog. */
  var unjoinedEventsCount: js.UndefOr[String] = js.undefined
}
object GoogleCloudRecommendationengineV1beta1UserEventImportSummary {
  
  inline def apply(): GoogleCloudRecommendationengineV1beta1UserEventImportSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1UserEventImportSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1UserEventImportSummary] (val x: Self) extends AnyVal {
    
    inline def setJoinedEventsCount(value: String): Self = StObject.set(x, "joinedEventsCount", value.asInstanceOf[js.Any])
    
    inline def setJoinedEventsCountUndefined: Self = StObject.set(x, "joinedEventsCount", js.undefined)
    
    inline def setUnjoinedEventsCount(value: String): Self = StObject.set(x, "unjoinedEventsCount", value.asInstanceOf[js.Any])
    
    inline def setUnjoinedEventsCountUndefined: Self = StObject.set(x, "unjoinedEventsCount", js.undefined)
  }
}
