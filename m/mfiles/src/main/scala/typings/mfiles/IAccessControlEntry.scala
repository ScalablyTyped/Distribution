package typings.mfiles

import typings.mfiles.MFiles.MFPermission
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAccessControlEntry extends StObject {
  
  var ChangePermissionsPermission: MFPermission = js.native
  
  def Clone(): IAccessControlEntry = js.native
  
  var EditPermission: MFPermission = js.native
  
  var IsGroup: Boolean = js.native
  
  var ReadPermission: MFPermission = js.native
  
  var UserOrGroupID: Double = js.native
}
object IAccessControlEntry {
  
  @scala.inline
  def apply(
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
  implicit class IAccessControlEntryMutableBuilder[Self <: IAccessControlEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangePermissionsPermission(value: MFPermission): Self = StObject.set(x, "ChangePermissionsPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IAccessControlEntry): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEditPermission(value: MFPermission): Self = StObject.set(x, "EditPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGroup(value: Boolean): Self = StObject.set(x, "IsGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPermission(value: MFPermission): Self = StObject.set(x, "ReadPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserOrGroupID(value: Double): Self = StObject.set(x, "UserOrGroupID", value.asInstanceOf[js.Any])
  }
}
