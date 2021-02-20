package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FoldingRangeProvider extends StObject {
  
  /**
    * Provides the folding ranges for a specific model.
    */
  def provideFoldingRanges(model: ITextModel, context: FoldingContext, token: CancellationToken): ProviderResult[js.Array[FoldingRange]] = js.native
}
object FoldingRangeProvider {
  
  @scala.inline
  def apply(
    provideFoldingRanges: (ITextModel, FoldingContext, CancellationToken) => ProviderResult[js.Array[FoldingRange]]
  ): FoldingRangeProvider = {
    val __obj = js.Dynamic.literal(provideFoldingRanges = js.Any.fromFunction3(provideFoldingRanges))
    __obj.asInstanceOf[FoldingRangeProvider]
  }
  
  @scala.inline
  implicit class FoldingRangeProviderMutableBuilder[Self <: FoldingRangeProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideFoldingRanges(value: (ITextModel, FoldingContext, CancellationToken) => ProviderResult[js.Array[FoldingRange]]): Self = StObject.set(x, "provideFoldingRanges", js.Any.fromFunction3(value))
  }
}
