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

