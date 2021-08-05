package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventStoresResource extends StObject {
  
  var operations: OperationsResource
  
  var placements: PlacementsResource
  
  var predictionApiKeyRegistrations: PredictionApiKeyRegistrationsResource
  
  var userEvents: UserEventsResource
}
object EventStoresResource {
  
  inline def apply(
    operations: OperationsResource,
    placements: PlacementsResource,
    predictionApiKeyRegistrations: PredictionApiKeyRegistrationsResource,
    userEvents: UserEventsResource
  ): EventStoresResource = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any], placements = placements.asInstanceOf[js.Any], predictionApiKeyRegistrations = predictionApiKeyRegistrations.asInstanceOf[js.Any], userEvents = userEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventStoresResource]
  }
  
  extension [Self <: EventStoresResource](x: Self) {
    
    inline def setOperations(value: OperationsResource): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setPlacements(value: PlacementsResource): Self = StObject.set(x, "placements", value.asInstanceOf[js.Any])
    
    inline def setPredictionApiKeyRegistrations(value: PredictionApiKeyRegistrationsResource): Self = StObject.set(x, "predictionApiKeyRegistrations", value.asInstanceOf[js.Any])
    
    inline def setUserEvents(value: UserEventsResource): Self = StObject.set(x, "userEvents", value.asInstanceOf[js.Any])
  }
}
