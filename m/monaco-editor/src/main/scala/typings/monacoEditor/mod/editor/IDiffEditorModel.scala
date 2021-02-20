package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDiffEditorModel extends IEditorModel {
  
  /**
    * Modified model.
    */
  var modified: ITextModel = js.native
  
  /**
    * Original model.
    */
  var original: ITextModel = js.native
}
object IDiffEditorModel {
  
  @scala.inline
  def apply(modified: ITextModel, original: ITextModel): IDiffEditorModel = {
    val __obj = js.Dynamic.literal(modified = modified.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDiffEditorModel]
  }
  
  @scala.inline
  implicit class IDiffEditorModelMutableBuilder[Self <: IDiffEditorModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModified(value: ITextModel): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal(value: ITextModel): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
  }
}
