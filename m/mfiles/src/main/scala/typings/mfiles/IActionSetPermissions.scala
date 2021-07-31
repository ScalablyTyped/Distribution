package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IActionSetPermissions extends StObject {
  
  def Clone(): IActionSetPermissions
  
  var DiscardsAutomaticPermissions: Boolean
  
  var Permissions: IAccessControlList
}
object IActionSetPermissions {
  
  @scala.inline
  def apply(
    Clone: () => IActionSetPermissions,
    DiscardsAutomaticPermissions: Boolean,
    Permissions: IAccessControlList
  ): IActionSetPermissions = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), DiscardsAutomaticPermissions = DiscardsAutomaticPermissions.asInstanceOf[js.Any], Permissions = Permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionSetPermissions]
  }
  
  @scala.inline
  implicit class IActionSetPermissionsMutableBuilder[Self <: IActionSetPermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IActionSetPermissions): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDiscardsAutomaticPermissions(value: Boolean): Self = StObject.set(x, "DiscardsAutomaticPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: IAccessControlList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
  }
}
