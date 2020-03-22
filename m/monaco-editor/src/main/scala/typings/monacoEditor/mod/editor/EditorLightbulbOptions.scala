package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IEditorLightbulbOptions>> */
trait EditorLightbulbOptions extends js.Object {
  val enabled: Boolean
}

object EditorLightbulbOptions {
  @scala.inline
  def apply(enabled: Boolean): EditorLightbulbOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EditorLightbulbOptions]
  }
}

