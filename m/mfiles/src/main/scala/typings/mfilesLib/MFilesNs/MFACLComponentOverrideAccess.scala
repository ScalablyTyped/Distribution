package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFACLComponentOverrideAccess extends js.Object

@JSGlobal("MFiles.MFACLComponentOverrideAccess")
@js.native
object MFACLComponentOverrideAccess extends js.Object {
  @js.native
  sealed trait Granted
    extends mfilesLib.MFilesNs.MFACLComponentOverrideAccess
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFACLComponentOverrideAccess
  
  /* 1 */ val Granted: Granted with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFACLComponentOverrideAccess with scala.Double] = js.native
}

