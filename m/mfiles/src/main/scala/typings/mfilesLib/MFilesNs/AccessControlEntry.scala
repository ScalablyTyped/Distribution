package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.AccessControlEntry")
@js.native
class AccessControlEntry ()
  extends mfilesLib.IAccessControlEntry {
  /* CompleteClass */
  override var ChangePermissionsPermission: MFPermission = js.native
  /* CompleteClass */
  override var EditPermission: MFPermission = js.native
  /* CompleteClass */
  override var IsGroup: scala.Boolean = js.native
  /* CompleteClass */
  override var ReadPermission: MFPermission = js.native
  /* CompleteClass */
  override var UserOrGroupID: scala.Double = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IAccessControlEntry = js.native
}

