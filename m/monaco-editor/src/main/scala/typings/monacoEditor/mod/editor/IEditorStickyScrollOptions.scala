package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorStrings.foldingProviderModel
import typings.monacoEditor.monacoEditorStrings.indentationModel
import typings.monacoEditor.monacoEditorStrings.outlineModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditorStickyScrollOptions extends StObject {
  
  /**
    * Model to choose for sticky scroll by default
    */
  var defaultModel: js.UndefOr[outlineModel | foldingProviderModel | indentationModel] = js.undefined
  
  /**
    * Enable the sticky scroll
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum number of sticky lines to show
    */
  var maxLineCount: js.UndefOr[Double] = js.undefined
}
object IEditorStickyScrollOptions {
  
  inline def apply(): IEditorStickyScrollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorStickyScrollOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEditorStickyScrollOptions] (val x: Self) extends AnyVal {
    
    inline def setDefaultModel(value: outlineModel | foldingProviderModel | indentationModel): Self = StObject.set(x, "defaultModel", value.asInstanceOf[js.Any])
    
    inline def setDefaultModelUndefined: Self = StObject.set(x, "defaultModel", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMaxLineCount(value: Double): Self = StObject.set(x, "maxLineCount", value.asInstanceOf[js.Any])
    
    inline def setMaxLineCountUndefined: Self = StObject.set(x, "maxLineCount", js.undefined)
  }
}
