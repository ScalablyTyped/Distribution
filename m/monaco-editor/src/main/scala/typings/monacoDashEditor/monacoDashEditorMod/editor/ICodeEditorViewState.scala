package typings.monacoDashEditor.monacoDashEditorMod.editor

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICodeEditorViewState extends IEditorViewState {
  var contributionsState: StringDictionary[js.Any]
  var cursorState: js.Array[ICursorState]
  var viewState: IViewState
}

object ICodeEditorViewState {
  @scala.inline
  def apply(
    contributionsState: StringDictionary[js.Any],
    cursorState: js.Array[ICursorState],
    viewState: IViewState
  ): ICodeEditorViewState = {
    val __obj = js.Dynamic.literal(contributionsState = contributionsState.asInstanceOf[js.Any], cursorState = cursorState.asInstanceOf[js.Any], viewState = viewState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICodeEditorViewState]
  }
}

