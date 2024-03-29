package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceReference extends StObject {
  
  /**
    * The resource type of a child collection that the annotated field references. This is useful for annotating the `parent` field that doesn't have a fixed resource type. Example:
    * message ListLogEntriesRequest { string parent = 1 [(google.api.resource_reference) = { child_type: "logging.googleapis.com/LogEntry" }; }
    */
  var childType: js.UndefOr[String] = js.undefined
  
  /**
    * The resource type that the annotated field references. Example: message Subscription { string topic = 2 [(google.api.resource_reference) = { type: "pubsub.googleapis.com/Topic" }];
    * } Occasionally, a field may reference an arbitrary resource. In this case, APIs use the special value * in their resource reference. Example: message GetIamPolicyRequest { string
    * resource = 2 [(google.api.resource_reference) = { type: "*" }]; }
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object ResourceReference {
  
  inline def apply(): ResourceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceReference] (val x: Self) extends AnyVal {
    
    inline def setChildType(value: String): Self = StObject.set(x, "childType", value.asInstanceOf[js.Any])
    
    inline def setChildTypeUndefined: Self = StObject.set(x, "childType", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
