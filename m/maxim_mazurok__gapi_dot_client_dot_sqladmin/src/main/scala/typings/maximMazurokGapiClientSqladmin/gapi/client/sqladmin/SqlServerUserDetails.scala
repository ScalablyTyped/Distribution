package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlServerUserDetails extends js.Object {
  
  /** If the user has been disabled */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /** The server roles for this user */
  var serverRoles: js.UndefOr[js.Array[String]] = js.native
}
object SqlServerUserDetails {
  
  @scala.inline
  def apply(): SqlServerUserDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlServerUserDetails]
  }
  
  @scala.inline
  implicit class SqlServerUserDetailsOps[Self <: SqlServerUserDetails] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setServerRolesVarargs(value: String*): Self = this.set("serverRoles", js.Array(value :_*))
    
    @scala.inline
    def setServerRoles(value: js.Array[String]): Self = this.set("serverRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerRoles: Self = this.set("serverRoles", js.undefined)
  }
}
