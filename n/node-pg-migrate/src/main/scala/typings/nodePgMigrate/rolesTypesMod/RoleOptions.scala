package typings.nodePgMigrate.rolesTypesMod

import typings.nodePgMigrate.generalTypesMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoleOptions extends js.Object {
  
  var admin: js.UndefOr[String | js.Array[String]] = js.native
  
  var bypassrls: js.UndefOr[Boolean] = js.native
  
  var createdb: js.UndefOr[Boolean] = js.native
  
  var createrole: js.UndefOr[Boolean] = js.native
  
  var encrypted: js.UndefOr[Boolean] = js.native
  
  var inRole: js.UndefOr[String | js.Array[String]] = js.native
  
  var inherit: js.UndefOr[Boolean] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var login: js.UndefOr[Boolean] = js.native
  
  var password: js.UndefOr[Value] = js.native
  
  var replication: js.UndefOr[Boolean] = js.native
  
  var role: js.UndefOr[String | js.Array[String]] = js.native
  
  var superuser: js.UndefOr[Boolean] = js.native
  
  var valid: js.UndefOr[Value] = js.native
}
object RoleOptions {
  
  @scala.inline
  def apply(): RoleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleOptions]
  }
  
  @scala.inline
  implicit class RoleOptionsOps[Self <: RoleOptions] (val x: Self) extends AnyVal {
    
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
    def setAdminVarargs(value: String*): Self = this.set("admin", js.Array(value :_*))
    
    @scala.inline
    def setAdmin(value: String | js.Array[String]): Self = this.set("admin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdmin: Self = this.set("admin", js.undefined)
    
    @scala.inline
    def setBypassrls(value: Boolean): Self = this.set("bypassrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBypassrls: Self = this.set("bypassrls", js.undefined)
    
    @scala.inline
    def setCreatedb(value: Boolean): Self = this.set("createdb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedb: Self = this.set("createdb", js.undefined)
    
    @scala.inline
    def setCreaterole(value: Boolean): Self = this.set("createrole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreaterole: Self = this.set("createrole", js.undefined)
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncrypted: Self = this.set("encrypted", js.undefined)
    
    @scala.inline
    def setInRoleVarargs(value: String*): Self = this.set("inRole", js.Array(value :_*))
    
    @scala.inline
    def setInRole(value: String | js.Array[String]): Self = this.set("inRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInRole: Self = this.set("inRole", js.undefined)
    
    @scala.inline
    def setInherit(value: Boolean): Self = this.set("inherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInherit: Self = this.set("inherit", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setLogin(value: Boolean): Self = this.set("login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogin: Self = this.set("login", js.undefined)
    
    @scala.inline
    def setPasswordVarargs(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value */ js.Object)*
    ): Self = this.set("password", js.Array(value :_*))
    
    @scala.inline
    def setPassword(value: Value): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPasswordNull: Self = this.set("password", null)
    
    @scala.inline
    def setReplication(value: Boolean): Self = this.set("replication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplication: Self = this.set("replication", js.undefined)
    
    @scala.inline
    def setRoleVarargs(value: String*): Self = this.set("role", js.Array(value :_*))
    
    @scala.inline
    def setRole(value: String | js.Array[String]): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setSuperuser(value: Boolean): Self = this.set("superuser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuperuser: Self = this.set("superuser", js.undefined)
    
    @scala.inline
    def setValidVarargs(
      value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value */ js.Object)*
    ): Self = this.set("valid", js.Array(value :_*))
    
    @scala.inline
    def setValid(value: Value): Self = this.set("valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValid: Self = this.set("valid", js.undefined)
    
    @scala.inline
    def setValidNull: Self = this.set("valid", null)
  }
}
