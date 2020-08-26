package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IEditorHoverOptions>> */
@js.native
trait EditorHoverOptions extends js.Object {
  val delay: Double = js.native
  val enabled: Boolean = js.native
  val sticky: Boolean = js.native
}

object EditorHoverOptions {
  @scala.inline
  def apply(delay: Double, enabled: Boolean, sticky: Boolean): EditorHoverOptions = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], sticky = sticky.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorHoverOptions]
  }
  @scala.inline
  implicit class EditorHoverOptionsOps[Self <: EditorHoverOptions] (val x: Self) extends AnyVal {
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setSticky(value: Boolean): Self = this.set("sticky", value.asInstanceOf[js.Any])
  }
  
}

