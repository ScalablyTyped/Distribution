package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.CancellationToken
import typings.monacoDashEditor.monacoDashEditorMod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentSymbolProvider extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * Provide symbol information for the given document.
    */
  def provideDocumentSymbols(model: ITextModel, token: CancellationToken): ProviderResult[js.Array[DocumentSymbol]]
}

object DocumentSymbolProvider {
  @scala.inline
  def apply(
    provideDocumentSymbols: (ITextModel, CancellationToken) => ProviderResult[js.Array[DocumentSymbol]],
    displayName: String = null
  ): DocumentSymbolProvider = {
    val __obj = js.Dynamic.literal(provideDocumentSymbols = js.Any.fromFunction2(provideDocumentSymbols))
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSymbolProvider]
  }
}

