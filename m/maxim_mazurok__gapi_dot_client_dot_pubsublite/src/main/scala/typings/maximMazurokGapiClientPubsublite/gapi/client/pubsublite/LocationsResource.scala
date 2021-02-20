package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  var subscriptions: SubscriptionsResource = js.native
  
  var topics: TopicsResource = js.native
}
object LocationsResource {
  
  @scala.inline
  def apply(subscriptions: SubscriptionsResource, topics: TopicsResource): LocationsResource = {
    val __obj = js.Dynamic.literal(subscriptions = subscriptions.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  @scala.inline
  implicit class LocationsResourceMutableBuilder[Self <: LocationsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscriptions(value: SubscriptionsResource): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopics(value: TopicsResource): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
  }
}
