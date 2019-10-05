package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.CancellationToken
import typings.monacoDashEditor.monacoDashEditorMod.Position
import typings.monacoDashEditor.monacoDashEditorMod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImplementationProvider extends js.Object {
  /**
    * Provide the implementation of the symbol at the given position and document.
    */
  def provideImplementation(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[Definition | js.Array[LocationLink]]
}

object ImplementationProvider {
  @scala.inline
  def apply(
    provideImplementation: (ITextModel, Position, CancellationToken) => ProviderResult[Definition | js.Array[LocationLink]]
  ): ImplementationProvider = {
    val __obj = js.Dynamic.literal(provideImplementation = js.Any.fromFunction3(provideImplementation))
  
    __obj.asInstanceOf[ImplementationProvider]
  }
}

