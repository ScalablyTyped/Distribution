package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationsResource extends StObject {
  
  var subscriptions: SubscriptionsResource
  
  var topics: TopicsResource
}
object LocationsResource {
  
  inline def apply(subscriptions: SubscriptionsResource, topics: TopicsResource): LocationsResource = {
    val __obj = js.Dynamic.literal(subscriptions = subscriptions.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  extension [Self <: LocationsResource](x: Self) {
    
    inline def setSubscriptions(value: SubscriptionsResource): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    inline def setTopics(value: TopicsResource): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
  }
}
