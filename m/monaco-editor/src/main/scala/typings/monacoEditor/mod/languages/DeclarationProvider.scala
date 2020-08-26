package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclarationProvider extends js.Object {
  /**
    * Provide the declaration of the symbol at the given position and document.
    */
  def provideDeclaration(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[Definition | js.Array[LocationLink]] = js.native
}

object DeclarationProvider {
  @scala.inline
  def apply(
    provideDeclaration: (ITextModel, Position, CancellationToken) => ProviderResult[Definition | js.Array[LocationLink]]
  ): DeclarationProvider = {
    val __obj = js.Dynamic.literal(provideDeclaration = js.Any.fromFunction3(provideDeclaration))
    __obj.asInstanceOf[DeclarationProvider]
  }
  @scala.inline
  implicit class DeclarationProviderOps[Self <: DeclarationProvider] (val x: Self) extends AnyVal {
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
    def setProvideDeclaration(
      value: (ITextModel, Position, CancellationToken) => ProviderResult[Definition | js.Array[LocationLink]]
    ): Self = this.set("provideDeclaration", js.Any.fromFunction3(value))
  }
  
}

