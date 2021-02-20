package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReferenceProvider extends StObject {
  
  /**
    * Provide a set of project-wide references for the given position and document.
    */
  def provideReferences(model: ITextModel, position: Position, context: ReferenceContext, token: CancellationToken): ProviderResult[js.Array[Location]] = js.native
}
object ReferenceProvider {
  
  @scala.inline
  def apply(
    provideReferences: (ITextModel, Position, ReferenceContext, CancellationToken) => ProviderResult[js.Array[Location]]
  ): ReferenceProvider = {
    val __obj = js.Dynamic.literal(provideReferences = js.Any.fromFunction4(provideReferences))
    __obj.asInstanceOf[ReferenceProvider]
  }
  
  @scala.inline
  implicit class ReferenceProviderMutableBuilder[Self <: ReferenceProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideReferences(
      value: (ITextModel, Position, ReferenceContext, CancellationToken) => ProviderResult[js.Array[Location]]
    ): Self = StObject.set(x, "provideReferences", js.Any.fromFunction4(value))
  }
}
