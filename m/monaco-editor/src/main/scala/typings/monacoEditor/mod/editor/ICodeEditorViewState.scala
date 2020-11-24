package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICodeEditorViewState extends IEditorViewState {
  
  var contributionsState: StringDictionary[js.Any] = js.native
  
  var cursorState: js.Array[ICursorState] = js.native
  
  var viewState: IViewState = js.native
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
  
  @scala.inline
  implicit class ICodeEditorViewStateOps[Self <: ICodeEditorViewState] (val x: Self) extends AnyVal {
    
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
    def setContributionsState(value: StringDictionary[js.Any]): Self = this.set("contributionsState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorStateVarargs(value: ICursorState*): Self = this.set("cursorState", js.Array(value :_*))
    
    @scala.inline
    def setCursorState(value: js.Array[ICursorState]): Self = this.set("cursorState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewState(value: IViewState): Self = this.set("viewState", value.asInstanceOf[js.Any])
  }
}
