package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ActionCreateAssignment")
@js.native
class ActionCreateAssignment ()
  extends mfilesLib.IActionCreateAssignment {
  /* CompleteClass */
  override var AssignedTo: mfilesLib.IUserOrUserGroupIDExs = js.native
  /* CompleteClass */
  override var Deadline: scala.Boolean = js.native
  /* CompleteClass */
  override var DeadlineInDays: scala.Double = js.native
  /* CompleteClass */
  override var Description: java.lang.String = js.native
  /* CompleteClass */
  override var MonitoredBy: mfilesLib.IUserOrUserGroupIDExs = js.native
  /* CompleteClass */
  override var Title: java.lang.String = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IActionCreateAssignment = js.native
}

@JSGlobal("MFiles.ActionCreateAssignment")
@js.native
object ActionCreateAssignment
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IActionCreateAssignment]

