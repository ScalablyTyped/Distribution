package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlEntryData extends js.Object {
  var AttachObjectsPermission: mfilesLib.MFilesNs.MFPermission
  var ChangePermissionsPermission: mfilesLib.MFilesNs.MFPermission
  var DeletePermission: mfilesLib.MFilesNs.MFPermission
  var EditPermission: mfilesLib.MFilesNs.MFPermission
  var ReadPermission: mfilesLib.MFilesNs.MFPermission
  def Clone(): IAccessControlEntryData
  def SetAllPermissions(Permission: mfilesLib.MFilesNs.MFPermission): scala.Unit
}

object IAccessControlEntryData {
  @scala.inline
  def apply(
    AttachObjectsPermission: mfilesLib.MFilesNs.MFPermission,
    ChangePermissionsPermission: mfilesLib.MFilesNs.MFPermission,
    Clone: () => IAccessControlEntryData,
    DeletePermission: mfilesLib.MFilesNs.MFPermission,
    EditPermission: mfilesLib.MFilesNs.MFPermission,
    ReadPermission: mfilesLib.MFilesNs.MFPermission,
    SetAllPermissions: mfilesLib.MFilesNs.MFPermission => scala.Unit
  ): IAccessControlEntryData = {
    val __obj = js.Dynamic.literal(AttachObjectsPermission = AttachObjectsPermission, ChangePermissionsPermission = ChangePermissionsPermission, Clone = js.Any.fromFunction0(Clone), DeletePermission = DeletePermission, EditPermission = EditPermission, ReadPermission = ReadPermission, SetAllPermissions = js.Any.fromFunction1(SetAllPermissions))
  
    __obj.asInstanceOf[IAccessControlEntryData]
  }
}

