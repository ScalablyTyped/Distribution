package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionRangeProvider extends StObject {
  
  /**
    * Provide ranges that should be selected from the given position.
    */
  def provideSelectionRanges(model: ITextModel, positions: js.Array[Position], token: CancellationToken): ProviderResult[js.Array[js.Array[SelectionRange]]]
}
object SelectionRangeProvider {
  
  @scala.inline
  def apply(
    provideSelectionRanges: (ITextModel, js.Array[Position], CancellationToken) => ProviderResult[js.Array[js.Array[SelectionRange]]]
  ): SelectionRangeProvider = {
    val __obj = js.Dynamic.literal(provideSelectionRanges = js.Any.fromFunction3(provideSelectionRanges))
    __obj.asInstanceOf[SelectionRangeProvider]
  }
  
  @scala.inline
  implicit class SelectionRangeProviderMutableBuilder[Self <: SelectionRangeProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideSelectionRanges(
      value: (ITextModel, js.Array[Position], CancellationToken) => ProviderResult[js.Array[js.Array[SelectionRange]]]
    ): Self = StObject.set(x, "provideSelectionRanges", js.Any.fromFunction3(value))
  }
}
