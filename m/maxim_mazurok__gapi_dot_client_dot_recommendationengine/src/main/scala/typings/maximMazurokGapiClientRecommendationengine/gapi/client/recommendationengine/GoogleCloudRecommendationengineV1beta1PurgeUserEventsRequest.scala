package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommendationengineV1beta1PurgeUserEventsRequest extends StObject {
  
  /**
    * Required. The filter string to specify the events to be deleted. Empty string filter is not allowed. The eligible fields for filtering are: * `eventType`: UserEvent.eventType field
    * of type string. * `eventTime`: in ISO 8601 "zulu" format. * `visitorId`: field of type string. Specifying this will delete all events associated with a visitor. * `userId`: field of
    * type string. Specifying this will delete all events associated with a user. Examples: * Deleting all events in a time range: `eventTime > "2012-04-23T18:25:43.511Z" eventTime <
    * "2012-04-23T18:30:43.511Z"` * Deleting specific eventType in time range: `eventTime > "2012-04-23T18:25:43.511Z" eventType = "detail-page-view"` * Deleting all events for a specific
    * visitor: `visitorId = "visitor1024"` The filtering fields are assumed to have an implicit AND.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /** Optional. The default value is false. Override this flag to true to actually perform the purge. If the field is not set to true, a sampling of events to be deleted will be returned. */
  var force: js.UndefOr[Boolean] = js.undefined
}
object GoogleCloudRecommendationengineV1beta1PurgeUserEventsRequest {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1PurgeUserEventsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1PurgeUserEventsRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1PurgeUserEventsRequestMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1PurgeUserEventsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
  }
}
