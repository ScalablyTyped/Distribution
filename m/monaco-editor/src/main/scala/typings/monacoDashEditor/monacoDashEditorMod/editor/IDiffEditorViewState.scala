package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDiffEditorViewState extends IEditorViewState {
  var modified: ICodeEditorViewState | Null
  var original: ICodeEditorViewState | Null
}

object IDiffEditorViewState {
  @scala.inline
  def apply(modified: ICodeEditorViewState = null, original: ICodeEditorViewState = null): IDiffEditorViewState = {
    val __obj = js.Dynamic.literal()
    if (modified != null) __obj.updateDynamic("modified")(modified)
    if (original != null) __obj.updateDynamic("original")(original)
    __obj.asInstanceOf[IDiffEditorViewState]
  }
}

