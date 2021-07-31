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
  
  @scala.inline
  def apply(): PermissionChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionChange]
  }
  
  @scala.inline
  implicit class PermissionChangeMutableBuilder[Self <: PermissionChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddedPermissions(value: js.Array[Permission]): Self = StObject.set(x, "addedPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedPermissionsUndefined: Self = StObject.set(x, "addedPermissions", js.undefined)
    
    @scala.inline
    def setAddedPermissionsVarargs(value: Permission*): Self = StObject.set(x, "addedPermissions", js.Array(value :_*))
    
    @scala.inline
    def setRemovedPermissions(value: js.Array[Permission]): Self = StObject.set(x, "removedPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedPermissionsUndefined: Self = StObject.set(x, "removedPermissions", js.undefined)
    
    @scala.inline
    def setRemovedPermissionsVarargs(value: Permission*): Self = StObject.set(x, "removedPermissions", js.Array(value :_*))
  }
}
