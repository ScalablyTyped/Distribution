package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.AccessControlEntryData")
@js.native
class AccessControlEntryData ()
  extends mfilesLib.IAccessControlEntryData {
  /* CompleteClass */
  override var AttachObjectsPermission: MFPermission = js.native
  /* CompleteClass */
  override var ChangePermissionsPermission: MFPermission = js.native
  /* CompleteClass */
  override var DeletePermission: MFPermission = js.native
  /* CompleteClass */
  override var EditPermission: MFPermission = js.native
  /* CompleteClass */
  override var ReadPermission: MFPermission = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IAccessControlEntryData = js.native
  /* CompleteClass */
  override def SetAllPermissions(Permission: MFPermission): scala.Unit = js.native
}

