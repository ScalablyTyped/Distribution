package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDiffEditorViewState
  extends StObject
     with IEditorViewState {
  
  var modified: ICodeEditorViewState | Null
  
  var original: ICodeEditorViewState | Null
}
object IDiffEditorViewState {
  
  @scala.inline
  def apply(): IDiffEditorViewState = {
    val __obj = js.Dynamic.literal(modified = null, original = null)
    __obj.asInstanceOf[IDiffEditorViewState]
  }
  
  @scala.inline
  implicit class IDiffEditorViewStateMutableBuilder[Self <: IDiffEditorViewState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModified(value: ICodeEditorViewState): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedNull: Self = StObject.set(x, "modified", null)
    
    @scala.inline
    def setOriginal(value: ICodeEditorViewState): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalNull: Self = StObject.set(x, "original", null)
  }
}
