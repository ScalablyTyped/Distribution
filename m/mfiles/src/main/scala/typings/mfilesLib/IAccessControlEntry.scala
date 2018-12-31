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

