package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventStoresResource extends StObject {
  
  var operations: OperationsResource = js.native
  
  var placements: PlacementsResource = js.native
  
  var predictionApiKeyRegistrations: PredictionApiKeyRegistrationsResource = js.native
  
  var userEvents: UserEventsResource = js.native
}
object EventStoresResource {
  
  @scala.inline
  def apply(
    operations: OperationsResource,
    placements: PlacementsResource,
    predictionApiKeyRegistrations: PredictionApiKeyRegistrationsResource,
    userEvents: UserEventsResource
  ): EventStoresResource = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any], placements = placements.asInstanceOf[js.Any], predictionApiKeyRegistrations = predictionApiKeyRegistrations.asInstanceOf[js.Any], userEvents = userEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventStoresResource]
  }
  
  @scala.inline
  implicit class EventStoresResourceMutableBuilder[Self <: EventStoresResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperations(value: OperationsResource): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacements(value: PlacementsResource): Self = StObject.set(x, "placements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictionApiKeyRegistrations(value: PredictionApiKeyRegistrationsResource): Self = StObject.set(x, "predictionApiKeyRegistrations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEvents(value: UserEventsResource): Self = StObject.set(x, "userEvents", value.asInstanceOf[js.Any])
  }
}
