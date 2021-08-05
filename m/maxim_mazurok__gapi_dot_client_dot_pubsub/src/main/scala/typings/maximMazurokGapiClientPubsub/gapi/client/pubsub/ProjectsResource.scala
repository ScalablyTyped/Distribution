package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsResource extends StObject {
  
  var snapshots: SnapshotsResource
  
  var subscriptions: SubscriptionsResource
  
  var topics: TopicsResource
}
object ProjectsResource {
  
  inline def apply(snapshots: SnapshotsResource, subscriptions: SubscriptionsResource, topics: TopicsResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(snapshots = snapshots.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  extension [Self <: ProjectsResource](x: Self) {
    
    inline def setSnapshots(value: SnapshotsResource): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
    
    inline def setSubscriptions(value: SubscriptionsResource): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    inline def setTopics(value: TopicsResource): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
  }
}
