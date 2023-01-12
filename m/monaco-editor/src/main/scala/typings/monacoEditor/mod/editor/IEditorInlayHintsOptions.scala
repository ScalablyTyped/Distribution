package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorStrings.off
import typings.monacoEditor.monacoEditorStrings.offUnlessPressed
import typings.monacoEditor.monacoEditorStrings.on
import typings.monacoEditor.monacoEditorStrings.onUnlessPressed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditorInlayHintsOptions extends StObject {
  
  /**
    * Enable the inline hints.
    * Defaults to true.
    */
  var enabled: js.UndefOr[on | off | offUnlessPressed | onUnlessPressed] = js.undefined
  
  /**
    * Font family of inline hints.
    * Defaults to editor font family.
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  
  /**
    * Font size of inline hints.
    * Default to 90% of the editor font size.
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Enables the padding around the inlay hint.
    * Defaults to false.
    */
  var padding: js.UndefOr[Boolean] = js.undefined
}
object IEditorInlayHintsOptions {
  
  inline def apply(): IEditorInlayHintsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorInlayHintsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEditorInlayHintsOptions] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: on | off | offUnlessPressed | onUnlessPressed): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setPadding(value: Boolean): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
