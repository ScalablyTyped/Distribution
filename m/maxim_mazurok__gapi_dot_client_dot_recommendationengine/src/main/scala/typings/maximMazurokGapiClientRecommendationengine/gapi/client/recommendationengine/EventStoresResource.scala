package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventStoresResource extends js.Object {
  
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
  implicit class EventStoresResourceOps[Self <: EventStoresResource] (val x: Self) extends AnyVal {
    
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
    def setOperations(value: OperationsResource): Self = this.set("operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacements(value: PlacementsResource): Self = this.set("placements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictionApiKeyRegistrations(value: PredictionApiKeyRegistrationsResource): Self = this.set("predictionApiKeyRegistrations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEvents(value: UserEventsResource): Self = this.set("userEvents", value.asInstanceOf[js.Any])
  }
}
