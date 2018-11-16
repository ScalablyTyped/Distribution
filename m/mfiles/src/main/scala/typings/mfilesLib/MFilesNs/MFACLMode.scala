package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFACLMode extends js.Object

@JSGlobal("MFiles.MFACLMode")
@js.native
object MFACLMode extends js.Object {
  @js.native
  sealed trait AutomaticPermissionsWithComponents
    extends mfilesLib.MFilesNs.MFACLMode
  
  @js.native
  sealed trait Simple
    extends mfilesLib.MFilesNs.MFACLMode
  
  /* 1 */ val AutomaticPermissionsWithComponents: AutomaticPermissionsWithComponents with scala.Double = js.native
  /* 0 */ val Simple: Simple with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFACLMode with scala.Double] = js.native
}

