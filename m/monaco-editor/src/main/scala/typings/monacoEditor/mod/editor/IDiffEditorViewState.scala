package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDiffEditorViewState extends IEditorViewState {
  
  var modified: ICodeEditorViewState | Null = js.native
  
  var original: ICodeEditorViewState | Null = js.native
}
object IDiffEditorViewState {
  
  @scala.inline
  def apply(): IDiffEditorViewState = {
    val __obj = js.Dynamic.literal()
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
