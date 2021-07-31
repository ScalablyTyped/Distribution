package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnTypeFormattingEditProvider extends StObject {
  
  var autoFormatTriggerCharacters: js.Array[String]
  
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
  ): ProviderResult[js.Array[TextEdit]]
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
  implicit class OnTypeFormattingEditProviderMutableBuilder[Self <: OnTypeFormattingEditProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFormatTriggerCharacters(value: js.Array[String]): Self = StObject.set(x, "autoFormatTriggerCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFormatTriggerCharactersVarargs(value: String*): Self = StObject.set(x, "autoFormatTriggerCharacters", js.Array(value :_*))
    
    @scala.inline
    def setProvideOnTypeFormattingEdits(
      value: (ITextModel, Position, String, FormattingOptions, CancellationToken) => ProviderResult[js.Array[TextEdit]]
    ): Self = StObject.set(x, "provideOnTypeFormattingEdits", js.Any.fromFunction5(value))
  }
}
