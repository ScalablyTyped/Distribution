package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionChange extends StObject {
  
  /** The set of permissions added by this change. */
  var addedPermissions: js.UndefOr[js.Array[Permission]] = js.undefined
  
  /** The set of permissions removed by this change. */
  var removedPermissions: js.UndefOr[js.Array[Permission]] = js.undefined
}
object PermissionChange {
  
  inline def apply(): PermissionChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionChange]
  }
  
  extension [Self <: PermissionChange](x: Self) {
    
    inline def setAddedPermissions(value: js.Array[Permission]): Self = StObject.set(x, "addedPermissions", value.asInstanceOf[js.Any])
    
    inline def setAddedPermissionsUndefined: Self = StObject.set(x, "addedPermissions", js.undefined)
    
    inline def setAddedPermissionsVarargs(value: Permission*): Self = StObject.set(x, "addedPermissions", js.Array(value :_*))
    
    inline def setRemovedPermissions(value: js.Array[Permission]): Self = StObject.set(x, "removedPermissions", value.asInstanceOf[js.Any])
    
    inline def setRemovedPermissionsUndefined: Self = StObject.set(x, "removedPermissions", js.undefined)
    
    inline def setRemovedPermissionsVarargs(value: Permission*): Self = StObject.set(x, "removedPermissions", js.Array(value :_*))
  }
}
