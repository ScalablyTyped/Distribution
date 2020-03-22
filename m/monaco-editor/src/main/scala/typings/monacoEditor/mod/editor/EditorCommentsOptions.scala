package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IEditorCommentsOptions>> */
trait EditorCommentsOptions extends js.Object {
  val insertSpace: Boolean
}

object EditorCommentsOptions {
  @scala.inline
  def apply(insertSpace: Boolean): EditorCommentsOptions = {
    val __obj = js.Dynamic.literal(insertSpace = insertSpace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EditorCommentsOptions]
  }
}

