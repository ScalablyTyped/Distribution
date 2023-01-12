package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.IDisposable
import typings.monacoEditor.mod.IEvent
import typings.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoldingRangeProvider extends StObject {
  
  /**
    * An optional event to signal that the folding ranges from this provider have changed.
    */
  var onDidChange: js.UndefOr[IEvent[this.type]] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FoldingRangeProvider] (val x: Self) extends AnyVal {
    
    inline def setOnDidChange(
      value: (/* listener */ js.Function1[FoldingRangeProvider, Any], /* thisArg */ js.UndefOr[Any]) => IDisposable
    ): Self = StObject.set(x, "onDidChange", js.Any.fromFunction2(value))
    
    inline def setOnDidChangeUndefined: Self = StObject.set(x, "onDidChange", js.undefined)
    
    inline def setProvideFoldingRanges(value: (ITextModel, FoldingContext, CancellationToken) => ProviderResult[js.Array[FoldingRange]]): Self = StObject.set(x, "provideFoldingRanges", js.Any.fromFunction3(value))
  }
}
