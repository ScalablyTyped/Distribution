package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.CancellationToken
import typings.monacoDashEditor.monacoDashEditorMod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentFormattingEditProvider extends js.Object {
  val displayName: js.UndefOr[String] = js.undefined
  /**
    * Provide formatting edits for a whole document.
    */
  def provideDocumentFormattingEdits(model: ITextModel, options: FormattingOptions, token: CancellationToken): ProviderResult[js.Array[TextEdit]]
}

object DocumentFormattingEditProvider {
  @scala.inline
  def apply(
    provideDocumentFormattingEdits: (ITextModel, FormattingOptions, CancellationToken) => ProviderResult[js.Array[TextEdit]],
    displayName: String = null
  ): DocumentFormattingEditProvider = {
    val __obj = js.Dynamic.literal(provideDocumentFormattingEdits = js.Any.fromFunction3(provideDocumentFormattingEdits))
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    __obj.asInstanceOf[DocumentFormattingEditProvider]
  }
}

