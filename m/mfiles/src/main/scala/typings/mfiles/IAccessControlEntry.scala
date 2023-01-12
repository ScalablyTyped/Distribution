package typings.mfiles

import typings.mfiles.MFiles.MFPermission
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccessControlEntry extends StObject {
  
  var ChangePermissionsPermission: MFPermission
  
  def Clone(): IAccessControlEntry
  
  var EditPermission: MFPermission
  
  var IsGroup: Boolean
  
  var ReadPermission: MFPermission
  
  var UserOrGroupID: Double
}
object IAccessControlEntry {
  
  inline def apply(
    ChangePermissionsPermission: MFPermission,
    Clone: () => IAccessControlEntry,
    EditPermission: MFPermission,
    IsGroup: Boolean,
    ReadPermission: MFPermission,
    UserOrGroupID: Double
  ): IAccessControlEntry = {
    val __obj = js.Dynamic.literal(ChangePermissionsPermission = ChangePermissionsPermission.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), EditPermission = EditPermission.asInstanceOf[js.Any], IsGroup = IsGroup.asInstanceOf[js.Any], ReadPermission = ReadPermission.asInstanceOf[js.Any], UserOrGroupID = UserOrGroupID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccessControlEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAccessControlEntry] (val x: Self) extends AnyVal {
    
    inline def setChangePermissionsPermission(value: MFPermission): Self = StObject.set(x, "ChangePermissionsPermission", value.asInstanceOf[js.Any])
    
    inline def setClone(value: () => IAccessControlEntry): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setEditPermission(value: MFPermission): Self = StObject.set(x, "EditPermission", value.asInstanceOf[js.Any])
    
    inline def setIsGroup(value: Boolean): Self = StObject.set(x, "IsGroup", value.asInstanceOf[js.Any])
    
    inline def setReadPermission(value: MFPermission): Self = StObject.set(x, "ReadPermission", value.asInstanceOf[js.Any])
    
    inline def setUserOrGroupID(value: Double): Self = StObject.set(x, "UserOrGroupID", value.asInstanceOf[js.Any])
  }
}
