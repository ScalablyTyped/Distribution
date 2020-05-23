package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.editor.IMarkerData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeAction extends js.Object {
  var command: js.UndefOr[Command] = js.undefined
  var diagnostics: js.UndefOr[js.Array[IMarkerData]] = js.undefined
  var disabled: js.UndefOr[String] = js.undefined
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
    disabled: String = null,
    edit: WorkspaceEdit = null,
    isPreferred: js.UndefOr[Boolean] = js.undefined,
    kind: String = null
  ): CodeAction = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (diagnostics != null) __obj.updateDynamic("diagnostics")(diagnostics.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (edit != null) __obj.updateDynamic("edit")(edit.asInstanceOf[js.Any])
    if (!js.isUndefined(isPreferred)) __obj.updateDynamic("isPreferred")(isPreferred.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeAction]
  }
}

