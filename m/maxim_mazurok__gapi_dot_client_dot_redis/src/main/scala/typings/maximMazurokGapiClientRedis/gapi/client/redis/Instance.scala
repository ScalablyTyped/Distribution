package typings.maximMazurokGapiClientRedis.gapi.client.redis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instance extends StObject {
  
  /**
    * Optional. If specified, at least one node will be provisioned in this zone in addition to the zone specified in location_id. Only applicable to standard tier. If provided, it must
    * be a different zone from the one provided in [location_id]. Additional nodes beyond the first 2 will be placed in zones selected by the service.
    */
  var alternativeLocationId: js.UndefOr[String] = js.undefined
  
  /** Optional. Indicates whether OSS Redis AUTH is enabled for the instance. If set to "true" AUTH is enabled on the instance. Default value is "false" meaning AUTH is disabled. */
  var authEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. The full name of the Google Compute Engine [network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected. If left unspecified, the `default` network
    * will be used.
    */
  var authorizedNetwork: js.UndefOr[String] = js.undefined
  
  /** Optional. The network connect mode of the Redis instance. If not provided, the connect mode defaults to DIRECT_PEERING. */
  var connectMode: js.UndefOr[String] = js.undefined
  
  /** Output only. The time the instance was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The current zone where the Redis primary node is located. In basic tier, this will always be the same as [location_id]. In standard tier, this can be the zone of any
    * node in the instance.
    */
  var currentLocationId: js.UndefOr[String] = js.undefined
  
  /** Optional. The KMS key reference that the customer provides when trying to create the instance. */
  var customerManagedKey: js.UndefOr[String] = js.undefined
  
  /** An arbitrary and optional user-provided name for the instance. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. Hostname or IP address of the exposed Redis endpoint used by clients to connect to the service. */
  var host: js.UndefOr[String] = js.undefined
  
  /** Resource labels to represent user provided metadata */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /**
    * Optional. The zone where the instance will be provisioned. If not provided, the service will choose a zone from the specified region for the instance. For standard tier, additional
    * nodes will be added across multiple zones for protection against zonal failures. If specified, at least one node will be provisioned in this zone.
    */
  var locationId: js.UndefOr[String] = js.undefined
  
  /** Optional. The maintenance policy for the instance. If not provided, maintenance events can be performed at any time. */
  var maintenancePolicy: js.UndefOr[MaintenancePolicy] = js.undefined
  
  /** Output only. Date and time of upcoming maintenance events which have been scheduled. */
  var maintenanceSchedule: js.UndefOr[MaintenanceSchedule] = js.undefined
  
  /** Required. Redis memory size in GiB. */
  var memorySizeGb: js.UndefOr[Double] = js.undefined
  
  /**
    * Required. Unique name of the resource in this scope including project and location using the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note:
    * Redis instances are managed and addressed at regional level so location_id here refers to a GCP region; however, users may choose which specific zone (or collection of zones for
    * cross-zone instances) an instance should be provisioned in. Refer to location_id and alternative_location_id fields for more details.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. Info per node. */
  var nodes: js.UndefOr[js.Array[NodeInfo]] = js.undefined
  
  /** Optional. Persistence configuration parameters */
  var persistenceConfig: js.UndefOr[PersistenceConfig] = js.undefined
  
  /**
    * Output only. Cloud IAM identity used by import / export operations to transfer data to/from Cloud Storage. Format is "serviceAccount:". The value may change over time for a given
    * instance so should be checked before each import/export operation.
    */
  var persistenceIamIdentity: js.UndefOr[String] = js.undefined
  
  /** Output only. The port number of the exposed Redis endpoint. */
  var port: js.UndefOr[Double] = js.undefined
  
  /**
    * Output only. Hostname or IP address of the exposed readonly Redis endpoint. Standard tier only. Targets all healthy replica nodes in instance. Replication is asynchronous and
    * replica nodes will exhibit some lag behind the primary. Write requests must target 'host'.
    */
  var readEndpoint: js.UndefOr[String] = js.undefined
  
  /** Output only. The port number of the exposed readonly redis endpoint. Standard tier only. Write requests should target 'port'. */
  var readEndpointPort: js.UndefOr[Double] = js.undefined
  
  /** Optional. Read replicas mode for the instance. Defaults to READ_REPLICAS_DISABLED. */
  var readReplicasMode: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Redis configuration parameters, according to http://redis.io/topics/config. Currently, the only supported parameters are: Redis version 3.2 and newer: * maxmemory-policy *
    * notify-keyspace-events Redis version 4.0 and newer: * activedefrag * lfu-decay-time * lfu-log-factor * maxmemory-gb Redis version 5.0 and newer: * stream-node-max-bytes *
    * stream-node-max-entries
    */
  var redisConfigs: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /**
    * Optional. The version of Redis software. If not provided, latest supported version will be used. Currently, the supported values are: * `REDIS_3_2` for Redis 3.2 compatibility *
    * `REDIS_4_0` for Redis 4.0 compatibility (default) * `REDIS_5_0` for Redis 5.0 compatibility * `REDIS_6_X` for Redis 6.x compatibility
    */
  var redisVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The number of replica nodes. The valid range for the Standard Tier with read replicas enabled is [1-5] and defaults to 2. If read replicas are not enabled for a Standard
    * Tier instance, the only valid value is 1 and the default is 1. The valid value for basic tier is 0 and the default is also 0.
    */
  var replicaCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. For DIRECT_PEERING mode, the CIDR range of internal addresses that are reserved for this instance. Range must be unique and non-overlapping with existing subnets in an
    * authorized network. For PRIVATE_SERVICE_ACCESS mode, the name of one allocated IP address ranges associated with this private service access connection. If not provided, the service
    * will choose an unused /29 block, for example, 10.0.0.0/29 or 192.168.0.0/29. For READ_REPLICAS_ENABLED the default block size is /28.
    */
  var reservedIpRange: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Additional IP range for node placement. Required when enabling read replicas on an existing instance. For DIRECT_PEERING mode value must be a CIDR range of size /28, or
    * "auto". For PRIVATE_SERVICE_ACCESS mode value must be the name of an allocated address range associated with the private service access connection, or "auto".
    */
  var secondaryIpRange: js.UndefOr[String] = js.undefined
  
  /** Output only. List of server CA certificates for the instance. */
  var serverCaCerts: js.UndefOr[js.Array[TlsCertificate]] = js.undefined
  
  /** Output only. The current state of this instance. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. Additional information about the current status of this instance, if available. */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /** Optional. reasons that causes instance in "SUSPENDED" state. */
  var suspensionReasons: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. The service tier of the instance. */
  var tier: js.UndefOr[String] = js.undefined
  
  /** Optional. The TLS mode of the Redis instance. If not provided, TLS is disabled for the instance. */
  var transitEncryptionMode: js.UndefOr[String] = js.undefined
}
object Instance {
  
  inline def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  
  extension [Self <: Instance](x: Self) {
    
    inline def setAlternativeLocationId(value: String): Self = StObject.set(x, "alternativeLocationId", value.asInstanceOf[js.Any])
    
    inline def setAlternativeLocationIdUndefined: Self = StObject.set(x, "alternativeLocationId", js.undefined)
    
    inline def setAuthEnabled(value: Boolean): Self = StObject.set(x, "authEnabled", value.asInstanceOf[js.Any])
    
    inline def setAuthEnabledUndefined: Self = StObject.set(x, "authEnabled", js.undefined)
    
    inline def setAuthorizedNetwork(value: String): Self = StObject.set(x, "authorizedNetwork", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedNetworkUndefined: Self = StObject.set(x, "authorizedNetwork", js.undefined)
    
    inline def setConnectMode(value: String): Self = StObject.set(x, "connectMode", value.asInstanceOf[js.Any])
    
    inline def setConnectModeUndefined: Self = StObject.set(x, "connectMode", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCurrentLocationId(value: String): Self = StObject.set(x, "currentLocationId", value.asInstanceOf[js.Any])
    
    inline def setCurrentLocationIdUndefined: Self = StObject.set(x, "currentLocationId", js.undefined)
    
    inline def setCustomerManagedKey(value: String): Self = StObject.set(x, "customerManagedKey", value.asInstanceOf[js.Any])
    
    inline def setCustomerManagedKeyUndefined: Self = StObject.set(x, "customerManagedKey", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    inline def setMaintenancePolicy(value: MaintenancePolicy): Self = StObject.set(x, "maintenancePolicy", value.asInstanceOf[js.Any])
    
    inline def setMaintenancePolicyUndefined: Self = StObject.set(x, "maintenancePolicy", js.undefined)
    
    inline def setMaintenanceSchedule(value: MaintenanceSchedule): Self = StObject.set(x, "maintenanceSchedule", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceScheduleUndefined: Self = StObject.set(x, "maintenanceSchedule", js.undefined)
    
    inline def setMemorySizeGb(value: Double): Self = StObject.set(x, "memorySizeGb", value.asInstanceOf[js.Any])
    
    inline def setMemorySizeGbUndefined: Self = StObject.set(x, "memorySizeGb", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodes(value: js.Array[NodeInfo]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: NodeInfo*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setPersistenceConfig(value: PersistenceConfig): Self = StObject.set(x, "persistenceConfig", value.asInstanceOf[js.Any])
    
    inline def setPersistenceConfigUndefined: Self = StObject.set(x, "persistenceConfig", js.undefined)
    
    inline def setPersistenceIamIdentity(value: String): Self = StObject.set(x, "persistenceIamIdentity", value.asInstanceOf[js.Any])
    
    inline def setPersistenceIamIdentityUndefined: Self = StObject.set(x, "persistenceIamIdentity", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setReadEndpoint(value: String): Self = StObject.set(x, "readEndpoint", value.asInstanceOf[js.Any])
    
    inline def setReadEndpointPort(value: Double): Self = StObject.set(x, "readEndpointPort", value.asInstanceOf[js.Any])
    
    inline def setReadEndpointPortUndefined: Self = StObject.set(x, "readEndpointPort", js.undefined)
    
    inline def setReadEndpointUndefined: Self = StObject.set(x, "readEndpoint", js.undefined)
    
    inline def setReadReplicasMode(value: String): Self = StObject.set(x, "readReplicasMode", value.asInstanceOf[js.Any])
    
    inline def setReadReplicasModeUndefined: Self = StObject.set(x, "readReplicasMode", js.undefined)
    
    inline def setRedisConfigs(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "redisConfigs", value.asInstanceOf[js.Any])
    
    inline def setRedisConfigsUndefined: Self = StObject.set(x, "redisConfigs", js.undefined)
    
    inline def setRedisVersion(value: String): Self = StObject.set(x, "redisVersion", value.asInstanceOf[js.Any])
    
    inline def setRedisVersionUndefined: Self = StObject.set(x, "redisVersion", js.undefined)
    
    inline def setReplicaCount(value: Double): Self = StObject.set(x, "replicaCount", value.asInstanceOf[js.Any])
    
    inline def setReplicaCountUndefined: Self = StObject.set(x, "replicaCount", js.undefined)
    
    inline def setReservedIpRange(value: String): Self = StObject.set(x, "reservedIpRange", value.asInstanceOf[js.Any])
    
    inline def setReservedIpRangeUndefined: Self = StObject.set(x, "reservedIpRange", js.undefined)
    
    inline def setSecondaryIpRange(value: String): Self = StObject.set(x, "secondaryIpRange", value.asInstanceOf[js.Any])
    
    inline def setSecondaryIpRangeUndefined: Self = StObject.set(x, "secondaryIpRange", js.undefined)
    
    inline def setServerCaCerts(value: js.Array[TlsCertificate]): Self = StObject.set(x, "serverCaCerts", value.asInstanceOf[js.Any])
    
    inline def setServerCaCertsUndefined: Self = StObject.set(x, "serverCaCerts", js.undefined)
    
    inline def setServerCaCertsVarargs(value: TlsCertificate*): Self = StObject.set(x, "serverCaCerts", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setSuspensionReasons(value: js.Array[String]): Self = StObject.set(x, "suspensionReasons", value.asInstanceOf[js.Any])
    
    inline def setSuspensionReasonsUndefined: Self = StObject.set(x, "suspensionReasons", js.undefined)
    
    inline def setSuspensionReasonsVarargs(value: String*): Self = StObject.set(x, "suspensionReasons", js.Array(value*))
    
    inline def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
    
    inline def setTransitEncryptionMode(value: String): Self = StObject.set(x, "transitEncryptionMode", value.asInstanceOf[js.Any])
    
    inline def setTransitEncryptionModeUndefined: Self = StObject.set(x, "transitEncryptionMode", js.undefined)
  }
}
