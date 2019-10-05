package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.CancellationToken
import typings.monacoDashEditor.monacoDashEditorMod.Position
import typings.monacoDashEditor.monacoDashEditorMod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentHighlightProvider extends js.Object {
  /**
    * Provide a set of document highlights, like all occurrences of a variable or
    * all exit-points of a function.
    */
  def provideDocumentHighlights(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[js.Array[DocumentHighlight]]
}

object DocumentHighlightProvider {
  @scala.inline
  def apply(
    provideDocumentHighlights: (ITextModel, Position, CancellationToken) => ProviderResult[js.Array[DocumentHighlight]]
  ): DocumentHighlightProvider = {
    val __obj = js.Dynamic.literal(provideDocumentHighlights = js.Any.fromFunction3(provideDocumentHighlights))
  
    __obj.asInstanceOf[DocumentHighlightProvider]
  }
}

