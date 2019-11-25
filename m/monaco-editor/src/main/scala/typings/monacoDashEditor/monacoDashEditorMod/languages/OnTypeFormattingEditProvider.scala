package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.CancellationToken
import typings.monacoDashEditor.monacoDashEditorMod.Position
import typings.monacoDashEditor.monacoDashEditorMod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnTypeFormattingEditProvider extends js.Object {
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
}

