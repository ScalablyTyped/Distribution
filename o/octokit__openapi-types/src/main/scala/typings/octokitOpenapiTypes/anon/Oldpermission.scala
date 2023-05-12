package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Oldpermission extends StObject {
  
  var old_permission: js.UndefOr[FromString] = js.undefined
  
  var permission: js.UndefOr[FromTo] = js.undefined
}
object Oldpermission {
  
  inline def apply(): Oldpermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Oldpermission]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Oldpermission] (val x: Self) extends AnyVal {
    
    inline def setOld_permission(value: FromString): Self = StObject.set(x, "old_permission", value.asInstanceOf[js.Any])
    
    inline def setOld_permissionUndefined: Self = StObject.set(x, "old_permission", js.undefined)
    
    inline def setPermission(value: FromTo): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
  }
}
