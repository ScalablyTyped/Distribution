package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.CancellationToken
import typings.monacoDashEditor.monacoDashEditorMod.Position
import typings.monacoDashEditor.monacoDashEditorMod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeDefinitionProvider extends js.Object {
  /**
    * Provide the type definition of the symbol at the given position and document.
    */
  def provideTypeDefinition(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[Definition | js.Array[LocationLink]]
}

object TypeDefinitionProvider {
  @scala.inline
  def apply(
    provideTypeDefinition: (ITextModel, Position, CancellationToken) => ProviderResult[Definition | js.Array[LocationLink]]
  ): TypeDefinitionProvider = {
    val __obj = js.Dynamic.literal(provideTypeDefinition = js.Any.fromFunction3(provideTypeDefinition))
  
    __obj.asInstanceOf[TypeDefinitionProvider]
  }
}

