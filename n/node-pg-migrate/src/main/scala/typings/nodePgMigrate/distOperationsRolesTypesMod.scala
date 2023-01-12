package typings.nodePgMigrate

import typings.nodePgMigrate.distOperationsGeneralTypesMod.IfExistsOption
import typings.nodePgMigrate.distOperationsGeneralTypesMod.Name
import typings.nodePgMigrate.distOperationsGeneralTypesMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsRolesTypesMod {
  
  type AlterRole = js.Function2[/* roleName */ Name, /* roleOptions */ RoleOptions, String | js.Array[String]]
  
  @js.native
  trait CreateRole extends CreateRoleFn {
    
    def reverse(roleName: Name): String | js.Array[String] = js.native
    def reverse(roleName: Name, roleOptions: RoleOptions & IfExistsOption): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: CreateRoleFn = js.native
  }
  
  type CreateRoleFn = js.Function2[
    /* roleName */ Name, 
    /* roleOptions */ js.UndefOr[RoleOptions & IfExistsOption], 
    String | js.Array[String]
  ]
  
  type DropRole = js.Function2[
    /* roleName */ Name, 
    /* options */ js.UndefOr[IfExistsOption], 
    String | js.Array[String]
  ]
  
  @js.native
  trait RenameRole extends RenameRoleFn {
    
    def reverse(oldRoleName: Name, newRoleName: Name): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: RenameRoleFn = js.native
  }
  
  type RenameRoleFn = js.Function2[/* oldRoleName */ Name, /* newRoleName */ Name, String | js.Array[String]]
  
  trait RoleOptions extends StObject {
    
    var admin: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var bypassrls: js.UndefOr[Boolean] = js.undefined
    
    var createdb: js.UndefOr[Boolean] = js.undefined
    
    var createrole: js.UndefOr[Boolean] = js.undefined
    
    var encrypted: js.UndefOr[Boolean] = js.undefined
    
    var inRole: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var inherit: js.UndefOr[Boolean] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var login: js.UndefOr[Boolean] = js.undefined
    
    var password: js.UndefOr[Value] = js.undefined
    
    var replication: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var superuser: js.UndefOr[Boolean] = js.undefined
    
    var valid: js.UndefOr[Value] = js.undefined
  }
  object RoleOptions {
    
    inline def apply(): RoleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoleOptions] (val x: Self) extends AnyVal {
      
      inline def setAdmin(value: String | js.Array[String]): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
      
      inline def setAdminUndefined: Self = StObject.set(x, "admin", js.undefined)
      
      inline def setAdminVarargs(value: String*): Self = StObject.set(x, "admin", js.Array(value*))
      
      inline def setBypassrls(value: Boolean): Self = StObject.set(x, "bypassrls", value.asInstanceOf[js.Any])
      
      inline def setBypassrlsUndefined: Self = StObject.set(x, "bypassrls", js.undefined)
      
      inline def setCreatedb(value: Boolean): Self = StObject.set(x, "createdb", value.asInstanceOf[js.Any])
      
      inline def setCreatedbUndefined: Self = StObject.set(x, "createdb", js.undefined)
      
      inline def setCreaterole(value: Boolean): Self = StObject.set(x, "createrole", value.asInstanceOf[js.Any])
      
      inline def setCreateroleUndefined: Self = StObject.set(x, "createrole", js.undefined)
      
      inline def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
      inline def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
      
      inline def setInRole(value: String | js.Array[String]): Self = StObject.set(x, "inRole", value.asInstanceOf[js.Any])
      
      inline def setInRoleUndefined: Self = StObject.set(x, "inRole", js.undefined)
      
      inline def setInRoleVarargs(value: String*): Self = StObject.set(x, "inRole", js.Array(value*))
      
      inline def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
      
      inline def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setLogin(value: Boolean): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
      
      inline def setLoginUndefined: Self = StObject.set(x, "login", js.undefined)
      
      inline def setPassword(value: Value): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordNull: Self = StObject.set(x, "password", null)
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPasswordVarargs(value: Any*): Self = StObject.set(x, "password", js.Array(value*))
      
      inline def setReplication(value: Boolean): Self = StObject.set(x, "replication", value.asInstanceOf[js.Any])
      
      inline def setReplicationUndefined: Self = StObject.set(x, "replication", js.undefined)
      
      inline def setRole(value: String | js.Array[String]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setRoleVarargs(value: String*): Self = StObject.set(x, "role", js.Array(value*))
      
      inline def setSuperuser(value: Boolean): Self = StObject.set(x, "superuser", value.asInstanceOf[js.Any])
      
      inline def setSuperuserUndefined: Self = StObject.set(x, "superuser", js.undefined)
      
      inline def setValid(value: Value): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidNull: Self = StObject.set(x, "valid", null)
      
      inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
      
      inline def setValidVarargs(value: Any*): Self = StObject.set(x, "valid", js.Array(value*))
    }
  }
}
