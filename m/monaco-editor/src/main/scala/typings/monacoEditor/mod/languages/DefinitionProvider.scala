package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefinitionProvider extends js.Object {
  /**
    * Provide the definition of the symbol at the given position and document.
    */
  def provideDefinition(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[Definition | js.Array[LocationLink]] = js.native
}

object DefinitionProvider {
  @scala.inline
  def apply(
    provideDefinition: (ITextModel, Position, CancellationToken) => ProviderResult[Definition | js.Array[LocationLink]]
  ): DefinitionProvider = {
    val __obj = js.Dynamic.literal(provideDefinition = js.Any.fromFunction3(provideDefinition))
    __obj.asInstanceOf[DefinitionProvider]
  }
  @scala.inline
  implicit class DefinitionProviderOps[Self <: DefinitionProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProvideDefinition(
      value: (ITextModel, Position, CancellationToken) => ProviderResult[Definition | js.Array[LocationLink]]
    ): Self = this.set("provideDefinition", js.Any.fromFunction3(value))
  }
  
}

