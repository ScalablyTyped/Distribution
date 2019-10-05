package typings.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IActionCreateAssignment
import typings.mfiles.IUserOrUserGroupIDExs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ActionCreateAssignment")
@js.native
class ActionCreateAssignment () extends IActionCreateAssignment {
  /* CompleteClass */
  override var AssignedTo: IUserOrUserGroupIDExs = js.native
  /* CompleteClass */
  override var Deadline: Boolean = js.native
  /* CompleteClass */
  override var DeadlineInDays: Double = js.native
  /* CompleteClass */
  override var Description: String = js.native
  /* CompleteClass */
  override var MonitoredBy: IUserOrUserGroupIDExs = js.native
  /* CompleteClass */
  override var Title: String = js.native
  /* CompleteClass */
  override def Clone(): IActionCreateAssignment = js.native
}

@JSGlobal("MFiles.ActionCreateAssignment")
@js.native
object ActionCreateAssignment extends Instantiable0[IActionCreateAssignment]

