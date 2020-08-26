package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorStrings.always
import typings.monacoEditor.monacoEditorStrings.multiline
import typings.monacoEditor.monacoEditorStrings.never
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IEditorFindOptions>> */
@js.native
trait EditorFindOptions extends js.Object {
  val addExtraSpaceOnTop: Boolean = js.native
  val autoFindInSelection: never | always | multiline = js.native
  val seedSearchStringFromSelection: Boolean = js.native
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
  @scala.inline
  implicit class EditorFindOptionsOps[Self <: EditorFindOptions] (val x: Self) extends AnyVal {
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
    def setAddExtraSpaceOnTop(value: Boolean): Self = this.set("addExtraSpaceOnTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoFindInSelection(value: never | always | multiline): Self = this.set("autoFindInSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeedSearchStringFromSelection(value: Boolean): Self = this.set("seedSearchStringFromSelection", value.asInstanceOf[js.Any])
  }
  
}

