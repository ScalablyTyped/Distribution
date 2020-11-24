package typings.monacoEditor.mod.editor

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
  implicit class IStandaloneEditorConstructionOptionsOps[Self <: IStandaloneEditorConstructionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessibilityHelpUrl(value: String): Self = this.set("accessibilityHelpUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityHelpUrl: Self = this.set("accessibilityHelpUrl", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setModel(value: ITextModel): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setModelNull: Self = this.set("model", null)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
