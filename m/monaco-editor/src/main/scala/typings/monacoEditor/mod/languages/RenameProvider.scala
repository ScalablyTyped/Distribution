package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenameProvider extends js.Object {
  var resolveRenameLocation: js.UndefOr[
    js.Function3[
      /* model */ ITextModel, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      ProviderResult[RenameLocation with Rejection]
    ]
  ] = js.native
  def provideRenameEdits(model: ITextModel, position: Position, newName: String, token: CancellationToken): ProviderResult[WorkspaceEdit with Rejection] = js.native
}

object RenameProvider {
  @scala.inline
  def apply(
    provideRenameEdits: (ITextModel, Position, String, CancellationToken) => ProviderResult[WorkspaceEdit with Rejection]
  ): RenameProvider = {
    val __obj = js.Dynamic.literal(provideRenameEdits = js.Any.fromFunction4(provideRenameEdits))
    __obj.asInstanceOf[RenameProvider]
  }
  @scala.inline
  implicit class RenameProviderOps[Self <: RenameProvider] (val x: Self) extends AnyVal {
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
    def setProvideRenameEdits(
      value: (ITextModel, Position, String, CancellationToken) => ProviderResult[WorkspaceEdit with Rejection]
    ): Self = this.set("provideRenameEdits", js.Any.fromFunction4(value))
    @scala.inline
    def setResolveRenameLocation(
      value: (/* model */ ITextModel, /* position */ Position, /* token */ CancellationToken) => ProviderResult[RenameLocation with Rejection]
    ): Self = this.set("resolveRenameLocation", js.Any.fromFunction3(value))
    @scala.inline
    def deleteResolveRenameLocation: Self = this.set("resolveRenameLocation", js.undefined)
  }
  
}

