package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IEditorHoverOptions>> */
trait EditorHoverOptions extends js.Object {
  val delay: Double
  val enabled: Boolean
  val sticky: Boolean
}

object EditorHoverOptions {
  @scala.inline
  def apply(delay: Double, enabled: Boolean, sticky: Boolean): EditorHoverOptions = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], sticky = sticky.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EditorHoverOptions]
  }
}

