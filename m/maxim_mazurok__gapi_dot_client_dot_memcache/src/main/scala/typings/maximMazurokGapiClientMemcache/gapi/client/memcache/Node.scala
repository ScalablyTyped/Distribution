package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  /** Output only. Hostname or IP address of the Memcached node used by the clients to connect to the Memcached server on this node. */
  var host: js.UndefOr[String] = js.undefined
  
  /** Output only. Identifier of the Memcached node. The node id does not include project or location like the Memcached instance name. */
  var nodeId: js.UndefOr[String] = js.undefined
  
  /** User defined parameters currently applied to the node. */
  var parameters: js.UndefOr[MemcacheParameters] = js.undefined
  
  /** Output only. The port number of the Memcached server on this node. */
  var port: js.UndefOr[Double] = js.undefined
  
  /** Output only. Current state of the Memcached node. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. Location (GCP Zone) for the Memcached node. */
  var zone: js.UndefOr[String] = js.undefined
}
object Node {
  
  inline def apply(): Node = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setNodeId(value: String): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    inline def setParameters(value: MemcacheParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
