package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentHighlightProvider extends js.Object {
  /**
    * Provide a set of document highlights, like all occurrences of a variable or
    * all exit-points of a function.
    */
  def provideDocumentHighlights(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[js.Array[DocumentHighlight]] = js.native
}

object DocumentHighlightProvider {
  @scala.inline
  def apply(
    provideDocumentHighlights: (ITextModel, Position, CancellationToken) => ProviderResult[js.Array[DocumentHighlight]]
  ): DocumentHighlightProvider = {
    val __obj = js.Dynamic.literal(provideDocumentHighlights = js.Any.fromFunction3(provideDocumentHighlights))
    __obj.asInstanceOf[DocumentHighlightProvider]
  }
  @scala.inline
  implicit class DocumentHighlightProviderOps[Self <: DocumentHighlightProvider] (val x: Self) extends AnyVal {
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
    def setProvideDocumentHighlights(value: (ITextModel, Position, CancellationToken) => ProviderResult[js.Array[DocumentHighlight]]): Self = this.set("provideDocumentHighlights", js.Any.fromFunction3(value))
  }
  
}

