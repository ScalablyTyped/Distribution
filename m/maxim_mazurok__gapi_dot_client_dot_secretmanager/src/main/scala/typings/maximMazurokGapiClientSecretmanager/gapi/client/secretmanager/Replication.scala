package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Replication extends js.Object {
  
  /** The Secret will automatically be replicated without any restrictions. */
  var automatic: js.UndefOr[Automatic] = js.native
  
  /** The Secret will only be replicated into the locations specified. */
  var userManaged: js.UndefOr[UserManaged] = js.native
}
object Replication {
  
  @scala.inline
  def apply(): Replication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Replication]
  }
  
  @scala.inline
  implicit class ReplicationOps[Self <: Replication] (val x: Self) extends AnyVal {
    
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
    def setAutomatic(value: Automatic): Self = this.set("automatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomatic: Self = this.set("automatic", js.undefined)
    
    @scala.inline
    def setUserManaged(value: UserManaged): Self = this.set("userManaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserManaged: Self = this.set("userManaged", js.undefined)
  }
}
