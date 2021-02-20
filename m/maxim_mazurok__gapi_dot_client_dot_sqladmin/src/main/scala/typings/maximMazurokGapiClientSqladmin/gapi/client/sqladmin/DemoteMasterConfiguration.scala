package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DemoteMasterConfiguration extends StObject {
  
  /** This is always *sql#demoteMasterConfiguration*. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * MySQL specific configuration when replicating from a MySQL on-premises primary instance. Replication configuration information such as the username, password, certificates, and keys
    * are not stored in the instance metadata. The configuration information is used only to set up the replication connection and is stored by MySQL in a file named *master.info* in the
    * data directory.
    */
  var mysqlReplicaConfiguration: js.UndefOr[DemoteMasterMySqlReplicaConfiguration] = js.native
}
object DemoteMasterConfiguration {
  
  @scala.inline
  def apply(): DemoteMasterConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DemoteMasterConfiguration]
  }
  
  @scala.inline
  implicit class DemoteMasterConfigurationMutableBuilder[Self <: DemoteMasterConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMysqlReplicaConfiguration(value: DemoteMasterMySqlReplicaConfiguration): Self = StObject.set(x, "mysqlReplicaConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMysqlReplicaConfigurationUndefined: Self = StObject.set(x, "mysqlReplicaConfiguration", js.undefined)
  }
}
