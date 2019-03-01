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
    Clear: js.Function0[scala.Unit],
    Clone: js.Function0[IActionDefinition]
  ): IActionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ActionCreateSeparateAssignment")(ActionCreateSeparateAssignment)
    __obj.updateDynamic("ActionType")(ActionType)
    __obj.updateDynamic("Clear")(Clear)
    __obj.updateDynamic("Clone")(Clone)
    __obj.asInstanceOf[IActionDefinition]
  }
}

