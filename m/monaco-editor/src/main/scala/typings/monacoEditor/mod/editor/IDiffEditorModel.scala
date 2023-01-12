package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDiffEditorModel
  extends StObject
     with IEditorModel {
  
  /**
    * Modified model.
    */
  var modified: ITextModel
  
  /**
    * Original model.
    */
  var original: ITextModel
}
object IDiffEditorModel {
  
  inline def apply(modified: ITextModel, original: ITextModel): IDiffEditorModel = {
    val __obj = js.Dynamic.literal(modified = modified.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDiffEditorModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDiffEditorModel] (val x: Self) extends AnyVal {
    
    inline def setModified(value: ITextModel): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    inline def setOriginal(value: ITextModel): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
  }
}
