package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeDefinitionProvider extends js.Object {
  /**
    * Provide the type definition of the symbol at the given position and document.
    */
  def provideTypeDefinition(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[Definition | js.Array[LocationLink]] = js.native
}

object TypeDefinitionProvider {
  @scala.inline
  def apply(
    provideTypeDefinition: (ITextModel, Position, CancellationToken) => ProviderResult[Definition | js.Array[LocationLink]]
  ): TypeDefinitionProvider = {
    val __obj = js.Dynamic.literal(provideTypeDefinition = js.Any.fromFunction3(provideTypeDefinition))
    __obj.asInstanceOf[TypeDefinitionProvider]
  }
  @scala.inline
  implicit class TypeDefinitionProviderOps[Self <: TypeDefinitionProvider] (val x: Self) extends AnyVal {
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
    def setProvideTypeDefinition(
      value: (ITextModel, Position, CancellationToken) => ProviderResult[Definition | js.Array[LocationLink]]
    ): Self = this.set("provideTypeDefinition", js.Any.fromFunction3(value))
  }
  
}

