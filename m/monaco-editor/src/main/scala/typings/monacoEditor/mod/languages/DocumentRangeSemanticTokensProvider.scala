package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Range
import typings.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentRangeSemanticTokensProvider extends StObject {
  
  def getLegend(): SemanticTokensLegend
  
  def provideDocumentRangeSemanticTokens(model: ITextModel, range: Range, token: CancellationToken): ProviderResult[SemanticTokens]
}
object DocumentRangeSemanticTokensProvider {
  
  inline def apply(
    getLegend: () => SemanticTokensLegend,
    provideDocumentRangeSemanticTokens: (ITextModel, Range, CancellationToken) => ProviderResult[SemanticTokens]
  ): DocumentRangeSemanticTokensProvider = {
    val __obj = js.Dynamic.literal(getLegend = js.Any.fromFunction0(getLegend), provideDocumentRangeSemanticTokens = js.Any.fromFunction3(provideDocumentRangeSemanticTokens))
    __obj.asInstanceOf[DocumentRangeSemanticTokensProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentRangeSemanticTokensProvider] (val x: Self) extends AnyVal {
    
    inline def setGetLegend(value: () => SemanticTokensLegend): Self = StObject.set(x, "getLegend", js.Any.fromFunction0(value))
    
    inline def setProvideDocumentRangeSemanticTokens(value: (ITextModel, Range, CancellationToken) => ProviderResult[SemanticTokens]): Self = StObject.set(x, "provideDocumentRangeSemanticTokens", js.Any.fromFunction3(value))
  }
}
