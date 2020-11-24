package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DemoteMasterContext extends js.Object {
  
  /** This is always *sql#demoteMasterContext*. */
  var kind: js.UndefOr[String] = js.native
  
  /** The name of the instance which will act as on-premises primary instance in the replication setup. */
  var masterInstanceName: js.UndefOr[String] = js.native
  
  /** Configuration specific to read-replicas replicating from the on-premises primary instance. */
  var replicaConfiguration: js.UndefOr[DemoteMasterConfiguration] = js.native
  
  /**
    * Verify GTID consistency for demote operation. Default value: *True*. Second Generation instances only. Setting this flag to false enables you to bypass GTID consistency check
    * between on-premises primary instance and Cloud SQL instance during the demotion operation but also exposes you to the risk of future replication failures. Change the value only if
    * you know the reason for the GTID divergence and are confident that doing so will not cause any replication issues.
    */
  var verifyGtidConsistency: js.UndefOr[Boolean] = js.native
}
object DemoteMasterContext {
  
  @scala.inline
  def apply(): DemoteMasterContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DemoteMasterContext]
  }
  
  @scala.inline
  implicit class DemoteMasterContextOps[Self <: DemoteMasterContext] (val x: Self) extends AnyVal {
    
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
    def setMasterInstanceName(value: String): Self = this.set("masterInstanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterInstanceName: Self = this.set("masterInstanceName", js.undefined)
    
    @scala.inline
    def setReplicaConfiguration(value: DemoteMasterConfiguration): Self = this.set("replicaConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicaConfiguration: Self = this.set("replicaConfiguration", js.undefined)
    
    @scala.inline
    def setVerifyGtidConsistency(value: Boolean): Self = this.set("verifyGtidConsistency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerifyGtidConsistency: Self = this.set("verifyGtidConsistency", js.undefined)
  }
}
