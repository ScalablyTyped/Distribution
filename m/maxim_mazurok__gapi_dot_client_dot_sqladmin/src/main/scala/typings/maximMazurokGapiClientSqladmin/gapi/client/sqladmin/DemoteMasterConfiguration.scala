package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DemoteMasterConfiguration extends js.Object {
  
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
  implicit class DemoteMasterConfigurationOps[Self <: DemoteMasterConfiguration] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMysqlReplicaConfiguration(value: DemoteMasterMySqlReplicaConfiguration): Self = this.set("mysqlReplicaConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMysqlReplicaConfiguration: Self = this.set("mysqlReplicaConfiguration", js.undefined)
  }
}
