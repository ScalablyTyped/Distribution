package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFAssignmentType extends js.Object

@JSGlobal("MFiles.MFAssignmentType")
@js.native
object MFAssignmentType extends js.Object {
  @js.native
  sealed trait Approval
    extends mfilesLib.MFilesNs.MFAssignmentType
  
  @js.native
  sealed trait Task
    extends mfilesLib.MFilesNs.MFAssignmentType
  
  /* 1 */ val Approval: Approval with scala.Double = js.native
  /* 0 */ val Task: Task with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFAssignmentType with scala.Double] = js.native
}

