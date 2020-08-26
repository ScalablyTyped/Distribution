package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HoverProvider extends js.Object {
  /**
    * Provide a hover for the given position and document. Multiple hovers at the same
    * position will be merged by the editor. A hover can have a range which defaults
    * to the word range at the position when omitted.
    */
  def provideHover(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[Hover] = js.native
}

object HoverProvider {
  @scala.inline
  def apply(provideHover: (ITextModel, Position, CancellationToken) => ProviderResult[Hover]): HoverProvider = {
    val __obj = js.Dynamic.literal(provideHover = js.Any.fromFunction3(provideHover))
    __obj.asInstanceOf[HoverProvider]
  }
  @scala.inline
  implicit class HoverProviderOps[Self <: HoverProvider] (val x: Self) extends AnyVal {
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
    def setProvideHover(value: (ITextModel, Position, CancellationToken) => ProviderResult[Hover]): Self = this.set("provideHover", js.Any.fromFunction3(value))
  }
  
}

