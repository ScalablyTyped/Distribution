package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IEditorParameterHintOptions>> */
@js.native
trait InternalParameterHintOptions extends js.Object {
  val cycle: Boolean = js.native
  val enabled: Boolean = js.native
}

object InternalParameterHintOptions {
  @scala.inline
  def apply(cycle: Boolean, enabled: Boolean): InternalParameterHintOptions = {
    val __obj = js.Dynamic.literal(cycle = cycle.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalParameterHintOptions]
  }
  @scala.inline
  implicit class InternalParameterHintOptionsOps[Self <: InternalParameterHintOptions] (val x: Self) extends AnyVal {
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
    def setCycle(value: Boolean): Self = this.set("cycle", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
  }
  
}

