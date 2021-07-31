package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoverProvider extends StObject {
  
  /**
    * Provide a hover for the given position and document. Multiple hovers at the same
    * position will be merged by the editor. A hover can have a range which defaults
    * to the word range at the position when omitted.
    */
  def provideHover(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[Hover]
}
object HoverProvider {
  
  @scala.inline
  def apply(provideHover: (ITextModel, Position, CancellationToken) => ProviderResult[Hover]): HoverProvider = {
    val __obj = js.Dynamic.literal(provideHover = js.Any.fromFunction3(provideHover))
    __obj.asInstanceOf[HoverProvider]
  }
  
  @scala.inline
  implicit class HoverProviderMutableBuilder[Self <: HoverProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideHover(value: (ITextModel, Position, CancellationToken) => ProviderResult[Hover]): Self = StObject.set(x, "provideHover", js.Any.fromFunction3(value))
  }
}
