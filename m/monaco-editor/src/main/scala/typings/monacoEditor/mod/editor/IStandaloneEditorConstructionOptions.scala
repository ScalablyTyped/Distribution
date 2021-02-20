package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStandaloneEditorConstructionOptions
  extends IEditorConstructionOptions
     with IGlobalEditorOptions {
  
  /**
    * An URL to open when Ctrl+H (Windows and Linux) or Cmd+H (OSX) is pressed in
    * the accessibility help dialog in the editor.
    *
    * Defaults to "https://go.microsoft.com/fwlink/?linkid=852450"
    */
  var accessibilityHelpUrl: js.UndefOr[String] = js.native
  
  /**
    * The initial language of the auto created model in the editor.
    * To not create automatically a model, use `model: null`.
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * The initial model associated with this code editor.
    */
  var model: js.UndefOr[ITextModel | Null] = js.native
  
  /**
    * The initial value of the auto created model in the editor.
    * To not create automatically a model, use `model: null`.
    */
  var value: js.UndefOr[String] = js.native
}
object IStandaloneEditorConstructionOptions {
  
  @scala.inline
  def apply(): IStandaloneEditorConstructionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStandaloneEditorConstructionOptions]
  }
  
  @scala.inline
  implicit class IStandaloneEditorConstructionOptionsMutableBuilder[Self <: IStandaloneEditorConstructionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityHelpUrl(value: String): Self = StObject.set(x, "accessibilityHelpUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityHelpUrlUndefined: Self = StObject.set(x, "accessibilityHelpUrl", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setModel(value: ITextModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelNull: Self = StObject.set(x, "model", null)
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
