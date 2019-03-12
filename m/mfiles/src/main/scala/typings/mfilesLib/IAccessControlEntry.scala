package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlEntry extends js.Object {
  var ChangePermissionsPermission: mfilesLib.MFilesNs.MFPermission
  var EditPermission: mfilesLib.MFilesNs.MFPermission
  var IsGroup: scala.Boolean
  var ReadPermission: mfilesLib.MFilesNs.MFPermission
  var UserOrGroupID: scala.Double
  def Clone(): IAccessControlEntry
}

object IAccessControlEntry {
  @scala.inline
  def apply(
    ChangePermissionsPermission: mfilesLib.MFilesNs.MFPermission,
    Clone: () => IAccessControlEntry,
    EditPermission: mfilesLib.MFilesNs.MFPermission,
    IsGroup: scala.Boolean,
    ReadPermission: mfilesLib.MFilesNs.MFPermission,
    UserOrGroupID: scala.Double
  ): IAccessControlEntry = {
    val __obj = js.Dynamic.literal(ChangePermissionsPermission = ChangePermissionsPermission, Clone = js.Any.fromFunction0(Clone), EditPermission = EditPermission, IsGroup = IsGroup, ReadPermission = ReadPermission, UserOrGroupID = UserOrGroupID)
  
    __obj.asInstanceOf[IAccessControlEntry]
  }
}

