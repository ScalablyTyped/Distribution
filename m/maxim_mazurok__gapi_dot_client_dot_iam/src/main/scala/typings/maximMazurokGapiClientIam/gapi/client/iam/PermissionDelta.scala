package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionDelta extends StObject {
  
  /** Added permissions. */
  var addedPermissions: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Removed permissions. */
  var removedPermissions: js.UndefOr[js.Array[String]] = js.undefined
}
object PermissionDelta {
  
  @scala.inline
  def apply(): PermissionDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionDelta]
  }
  
  @scala.inline
  implicit class PermissionDeltaMutableBuilder[Self <: PermissionDelta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddedPermissions(value: js.Array[String]): Self = StObject.set(x, "addedPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedPermissionsUndefined: Self = StObject.set(x, "addedPermissions", js.undefined)
    
    @scala.inline
    def setAddedPermissionsVarargs(value: String*): Self = StObject.set(x, "addedPermissions", js.Array(value :_*))
    
    @scala.inline
    def setRemovedPermissions(value: js.Array[String]): Self = StObject.set(x, "removedPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedPermissionsUndefined: Self = StObject.set(x, "removedPermissions", js.undefined)
    
    @scala.inline
    def setRemovedPermissionsVarargs(value: String*): Self = StObject.set(x, "removedPermissions", js.Array(value :_*))
  }
}
