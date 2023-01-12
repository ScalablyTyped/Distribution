package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkedEditingRangeProvider extends StObject {
  
  /**
    * Provide a list of ranges that can be edited together.
    */
  def provideLinkedEditingRanges(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[LinkedEditingRanges]
}
object LinkedEditingRangeProvider {
  
  inline def apply(
    provideLinkedEditingRanges: (ITextModel, Position, CancellationToken) => ProviderResult[LinkedEditingRanges]
  ): LinkedEditingRangeProvider = {
    val __obj = js.Dynamic.literal(provideLinkedEditingRanges = js.Any.fromFunction3(provideLinkedEditingRanges))
    __obj.asInstanceOf[LinkedEditingRangeProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkedEditingRangeProvider] (val x: Self) extends AnyVal {
    
    inline def setProvideLinkedEditingRanges(value: (ITextModel, Position, CancellationToken) => ProviderResult[LinkedEditingRanges]): Self = StObject.set(x, "provideLinkedEditingRanges", js.Any.fromFunction3(value))
  }
}
