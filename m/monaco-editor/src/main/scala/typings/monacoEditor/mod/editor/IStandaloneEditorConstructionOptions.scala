package typings.monacoEditor.mod.editor

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStandaloneEditorConstructionOptions
  extends StObject
     with IEditorConstructionOptions
     with IGlobalEditorOptions {
  
  /**
    * An URL to open when Ctrl+H (Windows and Linux) or Cmd+H (OSX) is pressed in
    * the accessibility help dialog in the editor.
    *
    * Defaults to "https://go.microsoft.com/fwlink/?linkid=852450"
    */
  var accessibilityHelpUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Container element to use for ARIA messages.
    * Defaults to document.body.
    */
  var ariaContainerElement: js.UndefOr[HTMLElement] = js.undefined
  
  /**
    * The initial language of the auto created model in the editor.
    * To not automatically create a model, use `model: null`.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * The initial model associated with this code editor.
    */
  var model: js.UndefOr[ITextModel | Null] = js.undefined
  
  /**
    * The initial value of the auto created model in the editor.
    * To not automatically create a model, use `model: null`.
    */
  var value: js.UndefOr[String] = js.undefined
}
object IStandaloneEditorConstructionOptions {
  
  inline def apply(): IStandaloneEditorConstructionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStandaloneEditorConstructionOptions]
  }
  
  extension [Self <: IStandaloneEditorConstructionOptions](x: Self) {
    
    inline def setAccessibilityHelpUrl(value: String): Self = StObject.set(x, "accessibilityHelpUrl", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityHelpUrlUndefined: Self = StObject.set(x, "accessibilityHelpUrl", js.undefined)
    
    inline def setAriaContainerElement(value: HTMLElement): Self = StObject.set(x, "ariaContainerElement", value.asInstanceOf[js.Any])
    
    inline def setAriaContainerElementUndefined: Self = StObject.set(x, "ariaContainerElement", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setModel(value: ITextModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
