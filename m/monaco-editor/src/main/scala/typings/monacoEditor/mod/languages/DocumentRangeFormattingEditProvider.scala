package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Range
import typings.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentRangeFormattingEditProvider extends js.Object {
  val displayName: js.UndefOr[String] = js.native
  /**
    * Provide formatting edits for a range in a document.
    *
    * The given range is a hint and providers can decide to format a smaller
    * or larger range. Often this is done by adjusting the start and end
    * of the range to full syntax nodes.
    */
  def provideDocumentRangeFormattingEdits(model: ITextModel, range: Range, options: FormattingOptions, token: CancellationToken): ProviderResult[js.Array[TextEdit]] = js.native
}

object DocumentRangeFormattingEditProvider {
  @scala.inline
  def apply(
    provideDocumentRangeFormattingEdits: (ITextModel, Range, FormattingOptions, CancellationToken) => ProviderResult[js.Array[TextEdit]]
  ): DocumentRangeFormattingEditProvider = {
    val __obj = js.Dynamic.literal(provideDocumentRangeFormattingEdits = js.Any.fromFunction4(provideDocumentRangeFormattingEdits))
    __obj.asInstanceOf[DocumentRangeFormattingEditProvider]
  }
  @scala.inline
  implicit class DocumentRangeFormattingEditProviderOps[Self <: DocumentRangeFormattingEditProvider] (val x: Self) extends AnyVal {
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
    def setProvideDocumentRangeFormattingEdits(
      value: (ITextModel, Range, FormattingOptions, CancellationToken) => ProviderResult[js.Array[TextEdit]]
    ): Self = this.set("provideDocumentRangeFormattingEdits", js.Any.fromFunction4(value))
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
  }
  
}

