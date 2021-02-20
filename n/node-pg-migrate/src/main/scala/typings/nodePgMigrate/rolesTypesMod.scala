package typings.nodePgMigrate

import typings.nodePgMigrate.anon.ReverseCreateRoleFn
import typings.nodePgMigrate.anon.ReverseRenameRoleFn
import typings.nodePgMigrate.generalTypesMod.IfExistsOption
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.generalTypesMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rolesTypesMod {
  
  type AlterRole = js.Function2[/* roleName */ Name, /* roleOptions */ RoleOptions, String | js.Array[String]]
  
  type CreateRole = CreateRoleFn with ReverseCreateRoleFn
  
  type CreateRoleFn = js.Function2[
    /* roleName */ Name, 
    /* roleOptions */ js.UndefOr[RoleOptions with IfExistsOption], 
    String | js.Array[String]
  ]
  
  type DropRole = js.Function2[
    /* roleName */ Name, 
    /* options */ js.UndefOr[IfExistsOption], 
    String | js.Array[String]
  ]
  
  type RenameRole = RenameRoleFn with ReverseRenameRoleFn
  
  type RenameRoleFn = js.Function2[/* oldRoleName */ Name, /* newRoleName */ Name, String | js.Array[String]]
  
  @js.native
  trait RoleOptions extends StObject {
    
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
    implicit class RoleOptionsMutableBuilder[Self <: RoleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdmin(value: String | js.Array[String]): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdminUndefined: Self = StObject.set(x, "admin", js.undefined)
      
      @scala.inline
      def setAdminVarargs(value: String*): Self = StObject.set(x, "admin", js.Array(value :_*))
      
      @scala.inline
      def setBypassrls(value: Boolean): Self = StObject.set(x, "bypassrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBypassrlsUndefined: Self = StObject.set(x, "bypassrls", js.undefined)
      
      @scala.inline
      def setCreatedb(value: Boolean): Self = StObject.set(x, "createdb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedbUndefined: Self = StObject.set(x, "createdb", js.undefined)
      
      @scala.inline
      def setCreaterole(value: Boolean): Self = StObject.set(x, "createrole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateroleUndefined: Self = StObject.set(x, "createrole", js.undefined)
      
      @scala.inline
      def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
      
      @scala.inline
      def setInRole(value: String | js.Array[String]): Self = StObject.set(x, "inRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInRoleUndefined: Self = StObject.set(x, "inRole", js.undefined)
      
      @scala.inline
      def setInRoleVarargs(value: String*): Self = StObject.set(x, "inRole", js.Array(value :_*))
      
      @scala.inline
      def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setLogin(value: Boolean): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoginUndefined: Self = StObject.set(x, "login", js.undefined)
      
      @scala.inline
      def setPassword(value: Value): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordNull: Self = StObject.set(x, "password", null)
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPasswordVarargs(
        value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value */ js.Object)*
      ): Self = StObject.set(x, "password", js.Array(value :_*))
      
      @scala.inline
      def setReplication(value: Boolean): Self = StObject.set(x, "replication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationUndefined: Self = StObject.set(x, "replication", js.undefined)
      
      @scala.inline
      def setRole(value: String | js.Array[String]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setRoleVarargs(value: String*): Self = StObject.set(x, "role", js.Array(value :_*))
      
      @scala.inline
      def setSuperuser(value: Boolean): Self = StObject.set(x, "superuser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuperuserUndefined: Self = StObject.set(x, "superuser", js.undefined)
      
      @scala.inline
      def setValid(value: Value): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidNull: Self = StObject.set(x, "valid", null)
      
      @scala.inline
      def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
      
      @scala.inline
      def setValidVarargs(
        value: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value */ js.Object)*
      ): Self = StObject.set(x, "valid", js.Array(value :_*))
    }
  }
}
