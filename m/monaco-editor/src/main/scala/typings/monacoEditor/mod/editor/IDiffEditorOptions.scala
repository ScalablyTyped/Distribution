package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDiffEditorOptions
  extends StObject
     with IEditorOptions
     with IDiffEditorBaseOptions {
  
  /**
    * Is the diff editor inside another editor
    * Defaults to false
    */
  var isInEmbeddedEditor: js.UndefOr[Boolean] = js.undefined
}
object IDiffEditorOptions {
  
  inline def apply(): IDiffEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDiffEditorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDiffEditorOptions] (val x: Self) extends AnyVal {
    
    inline def setIsInEmbeddedEditor(value: Boolean): Self = StObject.set(x, "isInEmbeddedEditor", value.asInstanceOf[js.Any])
    
    inline def setIsInEmbeddedEditorUndefined: Self = StObject.set(x, "isInEmbeddedEditor", js.undefined)
  }
}
