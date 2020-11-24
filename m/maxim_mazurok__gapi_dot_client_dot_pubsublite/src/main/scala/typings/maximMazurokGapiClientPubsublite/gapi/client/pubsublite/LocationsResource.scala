package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends js.Object {
  
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
  implicit class LocationsResourceOps[Self <: LocationsResource] (val x: Self) extends AnyVal {
    
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
    def setSubscriptions(value: SubscriptionsResource): Self = this.set("subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopics(value: TopicsResource): Self = this.set("topics", value.asInstanceOf[js.Any])
  }
}
