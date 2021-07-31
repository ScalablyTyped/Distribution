package typings.mfiles

import typings.mfiles.MFiles.MFPermission
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccessControlEntryData extends StObject {
  
  var AttachObjectsPermission: MFPermission
  
  var ChangePermissionsPermission: MFPermission
  
  def Clone(): IAccessControlEntryData
  
  var DeletePermission: MFPermission
  
  var EditPermission: MFPermission
  
  var ReadPermission: MFPermission
  
  def SetAllPermissions(Permission: MFPermission): Unit
}
object IAccessControlEntryData {
  
  @scala.inline
  def apply(
    AttachObjectsPermission: MFPermission,
    ChangePermissionsPermission: MFPermission,
    Clone: () => IAccessControlEntryData,
    DeletePermission: MFPermission,
    EditPermission: MFPermission,
    ReadPermission: MFPermission,
    SetAllPermissions: MFPermission => Unit
  ): IAccessControlEntryData = {
    val __obj = js.Dynamic.literal(AttachObjectsPermission = AttachObjectsPermission.asInstanceOf[js.Any], ChangePermissionsPermission = ChangePermissionsPermission.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), DeletePermission = DeletePermission.asInstanceOf[js.Any], EditPermission = EditPermission.asInstanceOf[js.Any], ReadPermission = ReadPermission.asInstanceOf[js.Any], SetAllPermissions = js.Any.fromFunction1(SetAllPermissions))
    __obj.asInstanceOf[IAccessControlEntryData]
  }
  
  @scala.inline
  implicit class IAccessControlEntryDataMutableBuilder[Self <: IAccessControlEntryData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachObjectsPermission(value: MFPermission): Self = StObject.set(x, "AttachObjectsPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangePermissionsPermission(value: MFPermission): Self = StObject.set(x, "ChangePermissionsPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IAccessControlEntryData): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeletePermission(value: MFPermission): Self = StObject.set(x, "DeletePermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditPermission(value: MFPermission): Self = StObject.set(x, "EditPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPermission(value: MFPermission): Self = StObject.set(x, "ReadPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAllPermissions(value: MFPermission => Unit): Self = StObject.set(x, "SetAllPermissions", js.Any.fromFunction1(value))
  }
}
