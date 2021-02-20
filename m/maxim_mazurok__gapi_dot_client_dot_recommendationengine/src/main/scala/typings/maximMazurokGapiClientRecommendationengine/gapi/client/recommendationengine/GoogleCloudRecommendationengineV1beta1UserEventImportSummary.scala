package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1UserEventImportSummary extends StObject {
  
  /** Count of user events imported with complete existing catalog information. */
  var joinedEventsCount: js.UndefOr[String] = js.native
  
  /** Count of user events imported, but with catalog information not found in the imported catalog. */
  var unjoinedEventsCount: js.UndefOr[String] = js.native
}
object GoogleCloudRecommendationengineV1beta1UserEventImportSummary {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1UserEventImportSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1UserEventImportSummary]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1UserEventImportSummaryMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1UserEventImportSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJoinedEventsCount(value: String): Self = StObject.set(x, "joinedEventsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinedEventsCountUndefined: Self = StObject.set(x, "joinedEventsCount", js.undefined)
    
    @scala.inline
    def setUnjoinedEventsCount(value: String): Self = StObject.set(x, "unjoinedEventsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnjoinedEventsCountUndefined: Self = StObject.set(x, "unjoinedEventsCount", js.undefined)
  }
}
