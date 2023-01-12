package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsResource extends StObject {
  
  var schemas: SchemasResource
  
  var snapshots: SnapshotsResource
  
  var subscriptions: SubscriptionsResource
  
  var topics: TopicsResource
}
object ProjectsResource {
  
  inline def apply(
    schemas: SchemasResource,
    snapshots: SnapshotsResource,
    subscriptions: SubscriptionsResource,
    topics: TopicsResource
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(schemas = schemas.asInstanceOf[js.Any], snapshots = snapshots.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    inline def setSchemas(value: SchemasResource): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSnapshots(value: SnapshotsResource): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
    
    inline def setSubscriptions(value: SubscriptionsResource): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    inline def setTopics(value: TopicsResource): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
  }
}
