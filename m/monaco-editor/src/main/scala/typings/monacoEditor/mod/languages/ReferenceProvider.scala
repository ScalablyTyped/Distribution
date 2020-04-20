package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceProvider extends js.Object {
  /**
    * Provide a set of project-wide references for the given position and document.
    */
  def provideReferences(model: ITextModel, position: Position, context: ReferenceContext, token: CancellationToken): ProviderResult[js.Array[Location]]
}

object ReferenceProvider {
  @scala.inline
  def apply(
    provideReferences: (ITextModel, Position, ReferenceContext, CancellationToken) => ProviderResult[js.Array[Location]]
  ): ReferenceProvider = {
    val __obj = js.Dynamic.literal(provideReferences = js.Any.fromFunction4(provideReferences))
    __obj.asInstanceOf[ReferenceProvider]
  }
}

