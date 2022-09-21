package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationsResource extends StObject {
  
  var operations: OperationsResource
  
  var reservations: ReservationsResource
  
  var subscriptions: SubscriptionsResource
  
  var topics: TopicsResource
}
object LocationsResource {
  
  inline def apply(
    operations: OperationsResource,
    reservations: ReservationsResource,
    subscriptions: SubscriptionsResource,
    topics: TopicsResource
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any], reservations = reservations.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  extension [Self <: LocationsResource](x: Self) {
    
    inline def setOperations(value: OperationsResource): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setReservations(value: ReservationsResource): Self = StObject.set(x, "reservations", value.asInstanceOf[js.Any])
    
    inline def setSubscriptions(value: SubscriptionsResource): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    inline def setTopics(value: TopicsResource): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
  }
}
