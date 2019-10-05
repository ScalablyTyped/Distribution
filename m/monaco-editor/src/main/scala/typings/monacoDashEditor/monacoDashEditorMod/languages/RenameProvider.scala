package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.CancellationToken
import typings.monacoDashEditor.monacoDashEditorMod.Position
import typings.monacoDashEditor.monacoDashEditorMod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameProvider extends js.Object {
  var resolveRenameLocation: js.UndefOr[
    js.Function3[
      /* model */ ITextModel, 
      /* position */ Position, 
      /* token */ CancellationToken, 
      ProviderResult[RenameLocation with Rejection]
    ]
  ] = js.undefined
  def provideRenameEdits(model: ITextModel, position: Position, newName: String, token: CancellationToken): ProviderResult[WorkspaceEdit with Rejection]
}

object RenameProvider {
  @scala.inline
  def apply(
    provideRenameEdits: (ITextModel, Position, String, CancellationToken) => ProviderResult[WorkspaceEdit with Rejection],
    resolveRenameLocation: (/* model */ ITextModel, /* position */ Position, /* token */ CancellationToken) => ProviderResult[RenameLocation with Rejection] = null
  ): RenameProvider = {
    val __obj = js.Dynamic.literal(provideRenameEdits = js.Any.fromFunction4(provideRenameEdits))
    if (resolveRenameLocation != null) __obj.updateDynamic("resolveRenameLocation")(js.Any.fromFunction3(resolveRenameLocation))
    __obj.asInstanceOf[RenameProvider]
  }
}

