package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.CancellationToken
import typings.monacoDashEditor.monacoDashEditorMod.Position
import typings.monacoDashEditor.monacoDashEditorMod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinitionProvider extends js.Object {
  /**
    * Provide the definition of the symbol at the given position and document.
    */
  def provideDefinition(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[Definition | js.Array[LocationLink]]
}

object DefinitionProvider {
  @scala.inline
  def apply(
    provideDefinition: (ITextModel, Position, CancellationToken) => ProviderResult[Definition | js.Array[LocationLink]]
  ): DefinitionProvider = {
    val __obj = js.Dynamic.literal(provideDefinition = js.Any.fromFunction3(provideDefinition))
  
    __obj.asInstanceOf[DefinitionProvider]
  }
}

