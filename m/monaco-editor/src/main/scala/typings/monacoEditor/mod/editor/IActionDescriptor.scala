package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var contextMenuGroupId: js.UndefOr[String] = js.native
  /**
    * Control the order in the context menu group.
    */
  var contextMenuOrder: js.UndefOr[Double] = js.native
  /**
    * An unique identifier of the contributed action.
    */
  var id: String = js.native
  /**
    * The keybinding rule (condition on top of precondition).
    */
  var keybindingContext: js.UndefOr[String] = js.native
  /**
    * An array of keybindings for the action.
    */
  var keybindings: js.UndefOr[js.Array[Double]] = js.native
  /**
    * A label of the action that will be presented to the user.
    */
  var label: String = js.native
  /**
    * Precondition rule.
    */
  var precondition: js.UndefOr[String] = js.native
  /**
    * Method that will be executed when the action is triggered.
    * @param editor The editor instance is passed in as a convenience
    */
  def run(editor: ICodeEditor, args: js.Any*): Unit | js.Promise[Unit] = js.native
}

object IActionDescriptor {
  @scala.inline
  def apply(id: String, label: String, run: (ICodeEditor, /* repeated */ js.Any) => Unit | js.Promise[Unit]): IActionDescriptor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], run = js.Any.fromFunction2(run))
    __obj.asInstanceOf[IActionDescriptor]
  }
  @scala.inline
  implicit class IActionDescriptorOps[Self <: IActionDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setRun(value: (ICodeEditor, /* repeated */ js.Any) => Unit | js.Promise[Unit]): Self = this.set("run", js.Any.fromFunction2(value))
    @scala.inline
    def setContextMenuGroupId(value: String): Self = this.set("contextMenuGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenuGroupId: Self = this.set("contextMenuGroupId", js.undefined)
    @scala.inline
    def setContextMenuOrder(value: Double): Self = this.set("contextMenuOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenuOrder: Self = this.set("contextMenuOrder", js.undefined)
    @scala.inline
    def setKeybindingContext(value: String): Self = this.set("keybindingContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeybindingContext: Self = this.set("keybindingContext", js.undefined)
    @scala.inline
    def setKeybindingsVarargs(value: Double*): Self = this.set("keybindings", js.Array(value :_*))
    @scala.inline
    def setKeybindings(value: js.Array[Double]): Self = this.set("keybindings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeybindings: Self = this.set("keybindings", js.undefined)
    @scala.inline
    def setPrecondition(value: String): Self = this.set("precondition", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecondition: Self = this.set("precondition", js.undefined)
  }
  
}

