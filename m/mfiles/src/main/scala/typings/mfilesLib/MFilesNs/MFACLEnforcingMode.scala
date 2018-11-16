package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFACLEnforcingMode extends js.Object

@JSGlobal("MFiles.MFACLEnforcingMode")
@js.native
object MFACLEnforcingMode extends js.Object {
  @js.native
  sealed trait Automatic
    extends mfilesLib.MFilesNs.MFACLEnforcingMode
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFACLEnforcingMode
  
  @js.native
  sealed trait Provided
    extends mfilesLib.MFilesNs.MFACLEnforcingMode
  
  @js.native
  sealed trait ResetToDefault
    extends mfilesLib.MFilesNs.MFACLEnforcingMode
  
  /* 0 */ val Automatic: Automatic with scala.Double = js.native
  /* 3 */ val None: None with scala.Double = js.native
  /* 1 */ val Provided: Provided with scala.Double = js.native
  /* 2 */ val ResetToDefault: ResetToDefault with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFACLEnforcingMode with scala.Double] = js.native
}

