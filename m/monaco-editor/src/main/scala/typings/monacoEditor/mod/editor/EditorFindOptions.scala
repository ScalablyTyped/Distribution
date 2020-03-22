package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorStrings.always
import typings.monacoEditor.monacoEditorStrings.multiline
import typings.monacoEditor.monacoEditorStrings.never
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IEditorFindOptions>> */
trait EditorFindOptions extends js.Object {
  val addExtraSpaceOnTop: Boolean
  val autoFindInSelection: never | always | multiline
  val seedSearchStringFromSelection: Boolean
}

object EditorFindOptions {
  @scala.inline
  def apply(
    addExtraSpaceOnTop: Boolean,
    autoFindInSelection: never | always | multiline,
    seedSearchStringFromSelection: Boolean
  ): EditorFindOptions = {
    val __obj = js.Dynamic.literal(addExtraSpaceOnTop = addExtraSpaceOnTop.asInstanceOf[js.Any], autoFindInSelection = autoFindInSelection.asInstanceOf[js.Any], seedSearchStringFromSelection = seedSearchStringFromSelection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EditorFindOptions]
  }
}

