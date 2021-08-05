package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICodeEditorViewState
  extends StObject
     with IEditorViewState {
  
  var contributionsState: StringDictionary[js.Any]
  
  var cursorState: js.Array[ICursorState]
  
  var viewState: IViewState
}
object ICodeEditorViewState {
  
  inline def apply(
    contributionsState: StringDictionary[js.Any],
    cursorState: js.Array[ICursorState],
    viewState: IViewState
  ): ICodeEditorViewState = {
    val __obj = js.Dynamic.literal(contributionsState = contributionsState.asInstanceOf[js.Any], cursorState = cursorState.asInstanceOf[js.Any], viewState = viewState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodeEditorViewState]
  }
  
  extension [Self <: ICodeEditorViewState](x: Self) {
    
    inline def setContributionsState(value: StringDictionary[js.Any]): Self = StObject.set(x, "contributionsState", value.asInstanceOf[js.Any])
    
    inline def setCursorState(value: js.Array[ICursorState]): Self = StObject.set(x, "cursorState", value.asInstanceOf[js.Any])
    
    inline def setCursorStateVarargs(value: ICursorState*): Self = StObject.set(x, "cursorState", js.Array(value :_*))
    
    inline def setViewState(value: IViewState): Self = StObject.set(x, "viewState", value.asInstanceOf[js.Any])
  }
}
