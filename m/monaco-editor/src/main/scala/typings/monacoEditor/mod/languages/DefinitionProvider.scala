package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.editor.ITextModel
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

