package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceTextEdit extends js.Object {
  var edit: TextEdit
  var metadata: js.UndefOr[WorkspaceEditMetadata] = js.undefined
  var modelVersionId: js.UndefOr[Double] = js.undefined
  var resource: Uri
}

object WorkspaceTextEdit {
  @scala.inline
  def apply(
    edit: TextEdit,
    resource: Uri,
    metadata: WorkspaceEditMetadata = null,
    modelVersionId: Int | Double = null
  ): WorkspaceTextEdit = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (modelVersionId != null) __obj.updateDynamic("modelVersionId")(modelVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceTextEdit]
  }
}

