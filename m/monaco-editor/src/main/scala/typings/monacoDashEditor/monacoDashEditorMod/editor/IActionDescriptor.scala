package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionDescriptor extends js.Object {
  /**
    * Control if the action should show up in the context menu and where.
    * The context menu of the editor has these default:
    *   navigation - The navigation group comes first in all cases.
    *   1_modification - This group comes next and contains commands that modify your code.
    *   9_cutcopypaste - The last default group with the basic editing commands.
    * You can also create your own group.
    * Defaults to null (don't show in context menu).
    */
  var contextMenuGroupId: js.UndefOr[String] = js.undefined
  /**
    * Control the order in the context menu group.
    */
  var contextMenuOrder: js.UndefOr[Double] = js.undefined
  /**
    * An unique identifier of the contributed action.
    */
  var id: String
  /**
    * The keybinding rule (condition on top of precondition).
    */
  var keybindingContext: js.UndefOr[String] = js.undefined
  /**
    * An array of keybindings for the action.
    */
  var keybindings: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * A label of the action that will be presented to the user.
    */
  var label: String
  /**
    * Precondition rule.
    */
  var precondition: js.UndefOr[String] = js.undefined
  /**
    * Method that will be executed when the action is triggered.
    * @param editor The editor instance is passed in as a convenience
    */
  def run(editor: ICodeEditor): Unit | js.Promise[Unit]
}

object IActionDescriptor {
  @scala.inline
  def apply(
    id: String,
    label: String,
    run: ICodeEditor => Unit | js.Promise[Unit],
    contextMenuGroupId: String = null,
    contextMenuOrder: Int | Double = null,
    keybindingContext: String = null,
    keybindings: js.Array[Double] = null,
    precondition: String = null
  ): IActionDescriptor = {
    val __obj = js.Dynamic.literal(id = id, label = label, run = js.Any.fromFunction1(run))
    if (contextMenuGroupId != null) __obj.updateDynamic("contextMenuGroupId")(contextMenuGroupId)
    if (contextMenuOrder != null) __obj.updateDynamic("contextMenuOrder")(contextMenuOrder.asInstanceOf[js.Any])
    if (keybindingContext != null) __obj.updateDynamic("keybindingContext")(keybindingContext)
    if (keybindings != null) __obj.updateDynamic("keybindings")(keybindings)
    if (precondition != null) __obj.updateDynamic("precondition")(precondition)
    __obj.asInstanceOf[IActionDescriptor]
  }
}

