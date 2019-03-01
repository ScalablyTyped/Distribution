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
    Clone: js.Function0[IAccessControlEntryData],
    DeletePermission: mfilesLib.MFilesNs.MFPermission,
    EditPermission: mfilesLib.MFilesNs.MFPermission,
    ReadPermission: mfilesLib.MFilesNs.MFPermission,
    SetAllPermissions: js.Function1[mfilesLib.MFilesNs.MFPermission, scala.Unit]
  ): IAccessControlEntryData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AttachObjectsPermission")(AttachObjectsPermission)
    __obj.updateDynamic("ChangePermissionsPermission")(ChangePermissionsPermission)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("DeletePermission")(DeletePermission)
    __obj.updateDynamic("EditPermission")(EditPermission)
    __obj.updateDynamic("ReadPermission")(ReadPermission)
    __obj.updateDynamic("SetAllPermissions")(SetAllPermissions)
    __obj.asInstanceOf[IAccessControlEntryData]
  }
}

