package typings.mfiles

import typings.mfiles.MFiles.MFActionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionDefinition extends js.Object {
  var ActionCreateSeparateAssignment: IActionCreateAssignment
  val ActionType: MFActionType
  def Clear(): Unit
  def Clone(): IActionDefinition
}

object IActionDefinition {
  @scala.inline
  def apply(
    ActionCreateSeparateAssignment: IActionCreateAssignment,
    ActionType: MFActionType,
    Clear: () => Unit,
    Clone: () => IActionDefinition
  ): IActionDefinition = {
    val __obj = js.Dynamic.literal(ActionCreateSeparateAssignment = ActionCreateSeparateAssignment.asInstanceOf[js.Any], ActionType = ActionType.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Clone = js.Any.fromFunction0(Clone))
  
    __obj.asInstanceOf[IActionDefinition]
  }
}

