package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DemoteMasterConfiguration extends StObject {
  
  /** This is always `sql#demoteMasterConfiguration`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * MySQL specific configuration when replicating from a MySQL on-premises primary instance. Replication configuration information such as the username, password, certificates, and keys
    * are not stored in the instance metadata. The configuration information is used only to set up the replication connection and is stored by MySQL in a file named `master.info` in the
    * data directory.
    */
  var mysqlReplicaConfiguration: js.UndefOr[DemoteMasterMySqlReplicaConfiguration] = js.undefined
}
object DemoteMasterConfiguration {
  
  inline def apply(): DemoteMasterConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DemoteMasterConfiguration]
  }
  
  extension [Self <: DemoteMasterConfiguration](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMysqlReplicaConfiguration(value: DemoteMasterMySqlReplicaConfiguration): Self = StObject.set(x, "mysqlReplicaConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMysqlReplicaConfigurationUndefined: Self = StObject.set(x, "mysqlReplicaConfiguration", js.undefined)
  }
}
