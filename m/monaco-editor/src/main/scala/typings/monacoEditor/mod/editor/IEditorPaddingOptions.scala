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
  
  @scala.inline
  def apply(): IEditorPaddingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorPaddingOptions]
  }
  
  @scala.inline
  implicit class IEditorPaddingOptionsMutableBuilder[Self <: IEditorPaddingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
