package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionsFromAdminPull extends StObject {
  
  var permissions: FromAdminPull
}
object PermissionsFromAdminPull {
  
  inline def apply(permissions: FromAdminPull): PermissionsFromAdminPull = {
    val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionsFromAdminPull]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PermissionsFromAdminPull] (val x: Self) extends AnyVal {
    
    inline def setPermissions(value: FromAdminPull): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
  }
}
