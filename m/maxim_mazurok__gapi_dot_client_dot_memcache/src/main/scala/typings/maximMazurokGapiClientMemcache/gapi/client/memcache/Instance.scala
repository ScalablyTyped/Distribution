package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instance extends StObject {
  
  /**
    * The full name of the Google Compute Engine [network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected. If left unspecified, the `default` network will be
    * used.
    */
  var authorizedNetwork: js.UndefOr[String] = js.undefined
  
  /** Output only. The time the instance was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. Endpoint for Discovery API */
  var discoveryEndpoint: js.UndefOr[String] = js.undefined
  
  /** User provided name for the instance only used for display purposes. Cannot be more than 80 characters. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** List of messages that describe current statuses of memcached instance. */
  var instanceMessages: js.UndefOr[js.Array[InstanceMessage]] = js.undefined
  
  /** Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientMemcache.maximMazurokGapiClientMemcacheStrings.Instance & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * Output only. The full version of memcached server running on this instance. System automatically determines the full memcached version for an instance based on the input
    * MemcacheVersion. The full version format will be "memcached-1.5.16".
    */
  var memcacheFullVersion: js.UndefOr[String] = js.undefined
  
  /** Output only. List of Memcached nodes. Refer to [Node] message for more details. */
  var memcacheNodes: js.UndefOr[js.Array[Node]] = js.undefined
  
  /**
    * The major version of Memcached software. If not provided, latest supported version will be used. Currently the latest supported major version is MEMCACHE_1_5. The minor version will
    * be automatically determined by our system based on the latest supported minor version.
    */
  var memcacheVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Unique name of the resource in this scope including project and location using the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note:
    * Memcached instances are managed and addressed at regional level so location_id here refers to a GCP region; however, users may choose which zones Memcached nodes within an instances
    * should be provisioned in. Refer to [zones] field for more details.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Required. Configuration for Memcached nodes. */
  var nodeConfig: js.UndefOr[NodeConfig] = js.undefined
  
  /** Required. Number of nodes in the Memcached instance. */
  var nodeCount: js.UndefOr[Double] = js.undefined
  
  /** Optional: User defined parameters to apply to the memcached process on each node. */
  var parameters: js.UndefOr[MemcacheParameters] = js.undefined
  
  /** Output only. The state of this Memcached instance. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. The time the instance was updated. */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Zones where Memcached nodes should be provisioned in. Memcached nodes will be equally distributed across these zones. If not provided, the service will by default create nodes in
    * all zones in the region for the instance.
    */
  var zones: js.UndefOr[js.Array[String]] = js.undefined
}
object Instance {
  
  inline def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  
  extension [Self <: Instance](x: Self) {
    
    inline def setAuthorizedNetwork(value: String): Self = StObject.set(x, "authorizedNetwork", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedNetworkUndefined: Self = StObject.set(x, "authorizedNetwork", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDiscoveryEndpoint(value: String): Self = StObject.set(x, "discoveryEndpoint", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryEndpointUndefined: Self = StObject.set(x, "discoveryEndpoint", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setInstanceMessages(value: js.Array[InstanceMessage]): Self = StObject.set(x, "instanceMessages", value.asInstanceOf[js.Any])
    
    inline def setInstanceMessagesUndefined: Self = StObject.set(x, "instanceMessages", js.undefined)
    
    inline def setInstanceMessagesVarargs(value: InstanceMessage*): Self = StObject.set(x, "instanceMessages", js.Array(value :_*))
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientMemcache.maximMazurokGapiClientMemcacheStrings.Instance & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMemcacheFullVersion(value: String): Self = StObject.set(x, "memcacheFullVersion", value.asInstanceOf[js.Any])
    
    inline def setMemcacheFullVersionUndefined: Self = StObject.set(x, "memcacheFullVersion", js.undefined)
    
    inline def setMemcacheNodes(value: js.Array[Node]): Self = StObject.set(x, "memcacheNodes", value.asInstanceOf[js.Any])
    
    inline def setMemcacheNodesUndefined: Self = StObject.set(x, "memcacheNodes", js.undefined)
    
    inline def setMemcacheNodesVarargs(value: Node*): Self = StObject.set(x, "memcacheNodes", js.Array(value :_*))
    
    inline def setMemcacheVersion(value: String): Self = StObject.set(x, "memcacheVersion", value.asInstanceOf[js.Any])
    
    inline def setMemcacheVersionUndefined: Self = StObject.set(x, "memcacheVersion", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodeConfig(value: NodeConfig): Self = StObject.set(x, "nodeConfig", value.asInstanceOf[js.Any])
    
    inline def setNodeConfigUndefined: Self = StObject.set(x, "nodeConfig", js.undefined)
    
    inline def setNodeCount(value: Double): Self = StObject.set(x, "nodeCount", value.asInstanceOf[js.Any])
    
    inline def setNodeCountUndefined: Self = StObject.set(x, "nodeCount", js.undefined)
    
    inline def setParameters(value: MemcacheParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setZones(value: js.Array[String]): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
    
    inline def setZonesUndefined: Self = StObject.set(x, "zones", js.undefined)
    
    inline def setZonesVarargs(value: String*): Self = StObject.set(x, "zones", js.Array(value :_*))
  }
}
