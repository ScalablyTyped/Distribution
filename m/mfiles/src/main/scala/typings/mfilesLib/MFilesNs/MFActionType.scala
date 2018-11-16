package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFActionType extends js.Object

@JSGlobal("MFiles.MFActionType")
@js.native
object MFActionType extends js.Object {
  @js.native
  sealed trait CreateAssignment
    extends mfilesLib.MFilesNs.MFActionType
  
  @js.native
  sealed trait Unknown
    extends mfilesLib.MFilesNs.MFActionType
  
  /* 1 */ val CreateAssignment: CreateAssignment with scala.Double = js.native
  /* 0 */ val Unknown: Unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFActionType with scala.Double] = js.native
}

