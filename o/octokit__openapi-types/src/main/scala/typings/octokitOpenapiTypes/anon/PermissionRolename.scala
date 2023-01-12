package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionRolename extends StObject {
  
  var permission: String
  
  /** @example admin */
  var role_name: String
  
  var user: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-collaborator'] */ js.Any
}
object PermissionRolename {
  
  inline def apply(
    permission: String,
    role_name: String,
    user: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-collaborator'] */ js.Any
  ): PermissionRolename = {
    val __obj = js.Dynamic.literal(permission = permission.asInstanceOf[js.Any], role_name = role_name.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionRolename]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PermissionRolename] (val x: Self) extends AnyVal {
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setRole_name(value: String): Self = StObject.set(x, "role_name", value.asInstanceOf[js.Any])
    
    inline def setUser(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-collaborator'] */ js.Any
    ): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
