package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.editor.IMarkerData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeAction extends js.Object {
  var command: js.UndefOr[Command] = js.undefined
  var diagnostics: js.UndefOr[js.Array[IMarkerData]] = js.undefined
  var edit: js.UndefOr[WorkspaceEdit] = js.undefined
  var isPreferred: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var title: String
}

object CodeAction {
  @scala.inline
  def apply(
    title: String,
    command: Command = null,
    diagnostics: js.Array[IMarkerData] = null,
    edit: WorkspaceEdit = null,
    isPreferred: js.UndefOr[Boolean] = js.undefined,
    kind: String = null
  ): CodeAction = {
    val __obj = js.Dynamic.literal(title = title)
    if (command != null) __obj.updateDynamic("command")(command)
    if (diagnostics != null) __obj.updateDynamic("diagnostics")(diagnostics)
    if (edit != null) __obj.updateDynamic("edit")(edit)
    if (!js.isUndefined(isPreferred)) __obj.updateDynamic("isPreferred")(isPreferred)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[CodeAction]
  }
}

