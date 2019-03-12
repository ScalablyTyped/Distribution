package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionDefinition extends js.Object {
  var ActionCreateSeparateAssignment: IActionCreateAssignment
  val ActionType: mfilesLib.MFilesNs.MFActionType
  def Clear(): scala.Unit
  def Clone(): IActionDefinition
}

object IActionDefinition {
  @scala.inline
  def apply(
    ActionCreateSeparateAssignment: IActionCreateAssignment,
    ActionType: mfilesLib.MFilesNs.MFActionType,
    Clear: () => scala.Unit,
    Clone: () => IActionDefinition
  ): IActionDefinition = {
    val __obj = js.Dynamic.literal(ActionCreateSeparateAssignment = ActionCreateSeparateAssignment, ActionType = ActionType, Clear = js.Any.fromFunction0(Clear), Clone = js.Any.fromFunction0(Clone))
  
    __obj.asInstanceOf[IActionDefinition]
  }
}

