package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFPermission extends js.Object

@JSGlobal("MFiles.MFPermission")
@js.native
object MFPermission extends js.Object {
  @js.native
  sealed trait Allow
    extends mfilesLib.MFilesNs.MFPermission
  
  @js.native
  sealed trait Deny
    extends mfilesLib.MFilesNs.MFPermission
  
  @js.native
  sealed trait NotSet
    extends mfilesLib.MFilesNs.MFPermission
  
  /* 1 */ val Allow: Allow with scala.Double = js.native
  /* 0 */ val Deny: Deny with scala.Double = js.native
  /* 2 */ val NotSet: NotSet with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFPermission with scala.Double] = js.native
}

