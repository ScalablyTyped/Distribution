package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1UserEventImportSummary extends js.Object {
  
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
  implicit class GoogleCloudRecommendationengineV1beta1UserEventImportSummaryOps[Self <: GoogleCloudRecommendationengineV1beta1UserEventImportSummary] (val x: Self) extends AnyVal {
    
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
    def setJoinedEventsCount(value: String): Self = this.set("joinedEventsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinedEventsCount: Self = this.set("joinedEventsCount", js.undefined)
    
    @scala.inline
    def setUnjoinedEventsCount(value: String): Self = this.set("unjoinedEventsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnjoinedEventsCount: Self = this.set("unjoinedEventsCount", js.undefined)
  }
}
