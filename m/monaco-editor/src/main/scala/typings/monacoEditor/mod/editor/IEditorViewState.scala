package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.monacoEditor.mod.editor.ICodeEditorViewState
  - typings.monacoEditor.mod.editor.IDiffEditorViewState
*/
trait IEditorViewState extends StObject
object IEditorViewState {
  
  inline def ICodeEditorViewState(
    contributionsState: StringDictionary[Any],
    cursorState: js.Array[ICursorState],
    viewState: IViewState
  ): typings.monacoEditor.mod.editor.ICodeEditorViewState = {
    val __obj = js.Dynamic.literal(contributionsState = contributionsState.asInstanceOf[js.Any], cursorState = cursorState.asInstanceOf[js.Any], viewState = viewState.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.monacoEditor.mod.editor.ICodeEditorViewState]
  }
  
  inline def IDiffEditorViewState(): typings.monacoEditor.mod.editor.IDiffEditorViewState = {
    val __obj = js.Dynamic.literal(modified = null, original = null)
    __obj.asInstanceOf[typings.monacoEditor.mod.editor.IDiffEditorViewState]
  }
}
