package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnTypeFormattingEditProvider extends js.Object {
  
  var autoFormatTriggerCharacters: js.Array[String] = js.native
  
  /**
    * Provide formatting edits after a character has been typed.
    *
    * The given position and character should hint to the provider
    * what range the position to expand to, like find the matching `{`
    * when `}` has been entered.
    */
  def provideOnTypeFormattingEdits(
    model: ITextModel,
    position: Position,
    ch: String,
    options: FormattingOptions,
    token: CancellationToken
  ): ProviderResult[js.Array[TextEdit]] = js.native
}
object OnTypeFormattingEditProvider {
  
  @scala.inline
  def apply(
    autoFormatTriggerCharacters: js.Array[String],
    provideOnTypeFormattingEdits: (ITextModel, Position, String, FormattingOptions, CancellationToken) => ProviderResult[js.Array[TextEdit]]
  ): OnTypeFormattingEditProvider = {
    val __obj = js.Dynamic.literal(autoFormatTriggerCharacters = autoFormatTriggerCharacters.asInstanceOf[js.Any], provideOnTypeFormattingEdits = js.Any.fromFunction5(provideOnTypeFormattingEdits))
    __obj.asInstanceOf[OnTypeFormattingEditProvider]
  }
  
  @scala.inline
  implicit class OnTypeFormattingEditProviderOps[Self <: OnTypeFormattingEditProvider] (val x: Self) extends AnyVal {
    
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
    def setAutoFormatTriggerCharactersVarargs(value: String*): Self = this.set("autoFormatTriggerCharacters", js.Array(value :_*))
    
    @scala.inline
    def setAutoFormatTriggerCharacters(value: js.Array[String]): Self = this.set("autoFormatTriggerCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvideOnTypeFormattingEdits(
      value: (ITextModel, Position, String, FormattingOptions, CancellationToken) => ProviderResult[js.Array[TextEdit]]
    ): Self = this.set("provideOnTypeFormattingEdits", js.Any.fromFunction5(value))
  }
}
