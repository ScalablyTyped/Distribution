package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instance extends js.Object {
  
  /**
    * The full name of the Google Compute Engine [network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected. If left unspecified, the `default` network will be
    * used.
    */
  var authorizedNetwork: js.UndefOr[String] = js.native
  
  /** Output only. The time the instance was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. Endpoint for Discovery API */
  var discoveryEndpoint: js.UndefOr[String] = js.native
  
  /** User provided name for the instance only used for display purposes. Cannot be more than 80 characters. */
  var displayName: js.UndefOr[String] = js.native
  
  /** List of messages that describe current statuses of memcached instance. */
  var instanceMessages: js.UndefOr[js.Array[InstanceMessage]] = js.native
  
  /** Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientMemcache.maximMazurokGapiClientMemcacheStrings.Instance with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Output only. The full version of memcached server running on this instance. System automatically determines the full memcached version for an instance based on the input
    * MemcacheVersion. The full version format will be "memcached-1.5.16".
    */
  var memcacheFullVersion: js.UndefOr[String] = js.native
  
  /** Output only. List of Memcached nodes. Refer to [Node] message for more details. */
  var memcacheNodes: js.UndefOr[js.Array[Node]] = js.native
  
  /**
    * The major version of Memcached software. If not provided, latest supported version will be used. Currently the latest supported major version is MEMCACHE_1_5. The minor version will
    * be automatically determined by our system based on the latest supported minor version.
    */
  var memcacheVersion: js.UndefOr[String] = js.native
  
  /**
    * Required. Unique name of the resource in this scope including project and location using the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note:
    * Memcached instances are managed and addressed at regional level so location_id here refers to a GCP region; however, users may choose which zones Memcached nodes within an instances
    * should be provisioned in. Refer to [zones] field for more details.
    */
  var name: js.UndefOr[String] = js.native
  
  /** Required. Configuration for Memcached nodes. */
  var nodeConfig: js.UndefOr[NodeConfig] = js.native
  
  /** Required. Number of nodes in the Memcached instance. */
  var nodeCount: js.UndefOr[Double] = js.native
  
  /** Optional: User defined parameters to apply to the memcached process on each node. */
  var parameters: js.UndefOr[MemcacheParameters] = js.native
  
  /** Output only. The state of this Memcached instance. */
  var state: js.UndefOr[String] = js.native
  
  /** Output only. The time the instance was updated. */
  var updateTime: js.UndefOr[String] = js.native
  
  /**
    * Zones where Memcached nodes should be provisioned in. Memcached nodes will be equally distributed across these zones. If not provided, the service will by default create nodes in
    * all zones in the region for the instance.
    */
  var zones: js.UndefOr[js.Array[String]] = js.native
}
object Instance {
  
  @scala.inline
  def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
    
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
    def setAuthorizedNetwork(value: String): Self = this.set("authorizedNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizedNetwork: Self = this.set("authorizedNetwork", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDiscoveryEndpoint(value: String): Self = this.set("discoveryEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscoveryEndpoint: Self = this.set("discoveryEndpoint", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setInstanceMessagesVarargs(value: InstanceMessage*): Self = this.set("instanceMessages", js.Array(value :_*))
    
    @scala.inline
    def setInstanceMessages(value: js.Array[InstanceMessage]): Self = this.set("instanceMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceMessages: Self = this.set("instanceMessages", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientMemcache.maximMazurokGapiClientMemcacheStrings.Instance with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setMemcacheFullVersion(value: String): Self = this.set("memcacheFullVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemcacheFullVersion: Self = this.set("memcacheFullVersion", js.undefined)
    
    @scala.inline
    def setMemcacheNodesVarargs(value: Node*): Self = this.set("memcacheNodes", js.Array(value :_*))
    
    @scala.inline
    def setMemcacheNodes(value: js.Array[Node]): Self = this.set("memcacheNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemcacheNodes: Self = this.set("memcacheNodes", js.undefined)
    
    @scala.inline
    def setMemcacheVersion(value: String): Self = this.set("memcacheVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemcacheVersion: Self = this.set("memcacheVersion", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNodeConfig(value: NodeConfig): Self = this.set("nodeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeConfig: Self = this.set("nodeConfig", js.undefined)
    
    @scala.inline
    def setNodeCount(value: Double): Self = this.set("nodeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeCount: Self = this.set("nodeCount", js.undefined)
    
    @scala.inline
    def setParameters(value: MemcacheParameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    
    @scala.inline
    def setZonesVarargs(value: String*): Self = this.set("zones", js.Array(value :_*))
    
    @scala.inline
    def setZones(value: js.Array[String]): Self = this.set("zones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZones: Self = this.set("zones", js.undefined)
  }
}
