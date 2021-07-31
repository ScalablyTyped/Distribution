package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITextModelUpdateOptions extends StObject {
  
  var indentSize: js.UndefOr[Double] = js.undefined
  
  var insertSpaces: js.UndefOr[Boolean] = js.undefined
  
  var tabSize: js.UndefOr[Double] = js.undefined
  
  var trimAutoWhitespace: js.UndefOr[Boolean] = js.undefined
}
object ITextModelUpdateOptions {
  
  @scala.inline
  def apply(): ITextModelUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextModelUpdateOptions]
  }
  
  @scala.inline
  implicit class ITextModelUpdateOptionsMutableBuilder[Self <: ITextModelUpdateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndentSize(value: Double): Self = StObject.set(x, "indentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentSizeUndefined: Self = StObject.set(x, "indentSize", js.undefined)
    
    @scala.inline
    def setInsertSpaces(value: Boolean): Self = StObject.set(x, "insertSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpacesUndefined: Self = StObject.set(x, "insertSpaces", js.undefined)
    
    @scala.inline
    def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
    
    @scala.inline
    def setTrimAutoWhitespace(value: Boolean): Self = StObject.set(x, "trimAutoWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimAutoWhitespaceUndefined: Self = StObject.set(x, "trimAutoWhitespace", js.undefined)
  }
}
