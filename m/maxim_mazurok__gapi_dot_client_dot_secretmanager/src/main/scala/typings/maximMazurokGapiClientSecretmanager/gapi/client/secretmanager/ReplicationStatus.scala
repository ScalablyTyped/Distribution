package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationStatus extends js.Object {
  
  /** Describes the replication status of a SecretVersion with automatic replication. Only populated if the parent Secret has an automatic replication policy. */
  var automatic: js.UndefOr[AutomaticStatus] = js.native
  
  /** Describes the replication status of a SecretVersion with user-managed replication. Only populated if the parent Secret has a user-managed replication policy. */
  var userManaged: js.UndefOr[UserManagedStatus] = js.native
}
object ReplicationStatus {
  
  @scala.inline
  def apply(): ReplicationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationStatus]
  }
  
  @scala.inline
  implicit class ReplicationStatusOps[Self <: ReplicationStatus] (val x: Self) extends AnyVal {
    
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
    def setAutomatic(value: AutomaticStatus): Self = this.set("automatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomatic: Self = this.set("automatic", js.undefined)
    
    @scala.inline
    def setUserManaged(value: UserManagedStatus): Self = this.set("userManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserManaged: Self = this.set("userManaged", js.undefined)
  }
}
