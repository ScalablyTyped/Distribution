package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditorPaddingOptions extends StObject {
  
  /**
    * Spacing between bottom edge of editor and last line.
    */
  var bottom: js.UndefOr[Double] = js.undefined
  
  /**
    * Spacing between top edge of editor and first line.
    */
  var top: js.UndefOr[Double] = js.undefined
}
object IEditorPaddingOptions {
  
  inline def apply(): IEditorPaddingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorPaddingOptions]
  }
  
  extension [Self <: IEditorPaddingOptions](x: Self) {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
