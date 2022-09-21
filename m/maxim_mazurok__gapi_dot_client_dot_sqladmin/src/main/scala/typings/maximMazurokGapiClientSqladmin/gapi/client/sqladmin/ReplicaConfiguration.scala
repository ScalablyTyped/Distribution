package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicaConfiguration extends StObject {
  
  /**
    * Specifies if the replica is the failover target. If the field is set to `true`, the replica will be designated as a failover replica. In case the primary instance fails, the replica
    * instance will be promoted as the new primary instance. Only one replica can be specified as failover target, and the replica has to be in different zone with the primary instance.
    */
  var failoverTarget: js.UndefOr[Boolean] = js.undefined
  
  /** This is always `sql#replicaConfiguration`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * MySQL specific configuration when replicating from a MySQL on-premises primary instance. Replication configuration information such as the username, password, certificates, and keys
    * are not stored in the instance metadata. The configuration information is used only to set up the replication connection and is stored by MySQL in a file named `master.info` in the
    * data directory.
    */
  var mysqlReplicaConfiguration: js.UndefOr[MySqlReplicaConfiguration] = js.undefined
}
object ReplicaConfiguration {
  
  inline def apply(): ReplicaConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaConfiguration]
  }
  
  extension [Self <: ReplicaConfiguration](x: Self) {
    
    inline def setFailoverTarget(value: Boolean): Self = StObject.set(x, "failoverTarget", value.asInstanceOf[js.Any])
    
    inline def setFailoverTargetUndefined: Self = StObject.set(x, "failoverTarget", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMysqlReplicaConfiguration(value: MySqlReplicaConfiguration): Self = StObject.set(x, "mysqlReplicaConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMysqlReplicaConfigurationUndefined: Self = StObject.set(x, "mysqlReplicaConfiguration", js.undefined)
  }
}
