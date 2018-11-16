package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFAutomaticPermissionsOperationOptions extends js.Object

@JSGlobal("MFiles.MFAutomaticPermissionsOperationOptions")
@js.native
object MFAutomaticPermissionsOperationOptions extends js.Object {
  @js.native
  sealed trait ForceActive
    extends mfilesLib.MFilesNs.MFAutomaticPermissionsOperationOptions
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFAutomaticPermissionsOperationOptions
  
  /* 1 */ val ForceActive: ForceActive with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFAutomaticPermissionsOperationOptions with scala.Double] = js.native
}

