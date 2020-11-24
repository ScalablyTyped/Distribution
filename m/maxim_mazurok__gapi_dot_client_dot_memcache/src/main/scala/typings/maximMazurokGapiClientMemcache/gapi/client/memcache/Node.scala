package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node extends js.Object {
  
  /** Output only. Hostname or IP address of the Memcached node used by the clients to connect to the Memcached server on this node. */
  var host: js.UndefOr[String] = js.native
  
  /** Output only. Identifier of the Memcached node. The node id does not include project or location like the Memcached instance name. */
  var nodeId: js.UndefOr[String] = js.native
  
  /** User defined parameters currently applied to the node. */
  var parameters: js.UndefOr[MemcacheParameters] = js.native
  
  /** Output only. The port number of the Memcached server on this node. */
  var port: js.UndefOr[Double] = js.native
  
  /** Output only. Current state of the Memcached node. */
  var state: js.UndefOr[String] = js.native
  
  /** Output only. Location (GCP Zone) for the Memcached node. */
  var zone: js.UndefOr[String] = js.native
}
object Node {
  
  @scala.inline
  def apply(): Node = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setNodeId(value: String): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeId: Self = this.set("nodeId", js.undefined)
    
    @scala.inline
    def setParameters(value: MemcacheParameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
}
