package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentSymbolProvider extends StObject {
  
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Provide symbol information for the given document.
    */
  def provideDocumentSymbols(model: ITextModel, token: CancellationToken): ProviderResult[js.Array[DocumentSymbol]]
}
object DocumentSymbolProvider {
  
  inline def apply(
    provideDocumentSymbols: (ITextModel, CancellationToken) => ProviderResult[js.Array[DocumentSymbol]]
  ): DocumentSymbolProvider = {
    val __obj = js.Dynamic.literal(provideDocumentSymbols = js.Any.fromFunction2(provideDocumentSymbols))
    __obj.asInstanceOf[DocumentSymbolProvider]
  }
  
  extension [Self <: DocumentSymbolProvider](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setProvideDocumentSymbols(value: (ITextModel, CancellationToken) => ProviderResult[js.Array[DocumentSymbol]]): Self = StObject.set(x, "provideDocumentSymbols", js.Any.fromFunction2(value))
  }
}
