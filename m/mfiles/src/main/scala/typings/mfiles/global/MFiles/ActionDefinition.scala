package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IActionCreateAssignment
import typings.mfiles.IActionDefinition
import typings.mfiles.MFiles.MFActionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ActionDefinition")
@js.native
class ActionDefinition () extends IActionDefinition {
  /* CompleteClass */
  override var ActionCreateSeparateAssignment: IActionCreateAssignment = js.native
  /* CompleteClass */
  override val ActionType: MFActionType = js.native
  /* CompleteClass */
  override def Clear(): Unit = js.native
  /* CompleteClass */
  override def Clone(): IActionDefinition = js.native
}

@JSGlobal("MFiles.ActionDefinition")
@js.native
object ActionDefinition extends Instantiable0[IActionDefinition]

