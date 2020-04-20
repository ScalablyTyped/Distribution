package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.monacoEditor.mod.editor.ICodeEditorViewState
  - typings.monacoEditor.mod.editor.IDiffEditorViewState
*/
trait IEditorViewState extends js.Object

object IEditorViewState {
  @scala.inline
  def ICodeEditorViewState(
    contributionsState: StringDictionary[js.Any],
    cursorState: js.Array[ICursorState],
    viewState: IViewState
  ): IEditorViewState = {
    val __obj = js.Dynamic.literal(contributionsState = contributionsState.asInstanceOf[js.Any], cursorState = cursorState.asInstanceOf[js.Any], viewState = viewState.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorViewState]
  }
  @scala.inline
  def IDiffEditorViewState(modified: ICodeEditorViewState = null, original: ICodeEditorViewState = null): IEditorViewState = {
    val __obj = js.Dynamic.literal()
    if (modified != null) __obj.updateDynamic("modified")(modified.asInstanceOf[js.Any])
    if (original != null) __obj.updateDynamic("original")(original.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorViewState]
  }
}

