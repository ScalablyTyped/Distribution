package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoldingRangeProvider extends StObject {
  
  /**
    * Provides the folding ranges for a specific model.
    */
  def provideFoldingRanges(model: ITextModel, context: FoldingContext, token: CancellationToken): ProviderResult[js.Array[FoldingRange]]
}
object FoldingRangeProvider {
  
  inline def apply(
    provideFoldingRanges: (ITextModel, FoldingContext, CancellationToken) => ProviderResult[js.Array[FoldingRange]]
  ): FoldingRangeProvider = {
    val __obj = js.Dynamic.literal(provideFoldingRanges = js.Any.fromFunction3(provideFoldingRanges))
    __obj.asInstanceOf[FoldingRangeProvider]
  }
  
  extension [Self <: FoldingRangeProvider](x: Self) {
    
    inline def setProvideFoldingRanges(value: (ITextModel, FoldingContext, CancellationToken) => ProviderResult[js.Array[FoldingRange]]): Self = StObject.set(x, "provideFoldingRanges", js.Any.fromFunction3(value))
  }
}
