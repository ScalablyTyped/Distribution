package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentSymbolProvider extends StObject {
  
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
  implicit class DocumentSymbolProviderMutableBuilder[Self <: DocumentSymbolProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setProvideDocumentSymbols(value: (ITextModel, CancellationToken) => ProviderResult[js.Array[DocumentSymbol]]): Self = StObject.set(x, "provideDocumentSymbols", js.Any.fromFunction2(value))
  }
}
