package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentSymbolProvider extends js.Object {
  var displayName: js.UndefOr[String] = js.native
  /**
    * Provide symbol information for the given document.
    */
  def provideDocumentSymbols(model: ITextModel, token: CancellationToken): ProviderResult[js.Array[DocumentSymbol]] = js.native
}

object DocumentSymbolProvider {
  @scala.inline
  def apply(
    provideDocumentSymbols: (ITextModel, CancellationToken) => ProviderResult[js.Array[DocumentSymbol]]
  ): DocumentSymbolProvider = {
    val __obj = js.Dynamic.literal(provideDocumentSymbols = js.Any.fromFunction2(provideDocumentSymbols))
    __obj.asInstanceOf[DocumentSymbolProvider]
  }
  @scala.inline
  implicit class DocumentSymbolProviderOps[Self <: DocumentSymbolProvider] (val x: Self) extends AnyVal {
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
    def setProvideDocumentSymbols(value: (ITextModel, CancellationToken) => ProviderResult[js.Array[DocumentSymbol]]): Self = this.set("provideDocumentSymbols", js.Any.fromFunction2(value))
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
  }
  
}

