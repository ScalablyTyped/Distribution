package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceFileEdit extends js.Object {
  var metadata: js.UndefOr[WorkspaceEditMetadata] = js.undefined
  var newUri: js.UndefOr[Uri] = js.undefined
  var oldUri: js.UndefOr[Uri] = js.undefined
  var options: js.UndefOr[WorkspaceFileEditOptions] = js.undefined
}

object WorkspaceFileEdit {
  @scala.inline
  def apply(
    metadata: WorkspaceEditMetadata = null,
    newUri: Uri = null,
    oldUri: Uri = null,
    options: WorkspaceFileEditOptions = null
  ): WorkspaceFileEdit = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (newUri != null) __obj.updateDynamic("newUri")(newUri.asInstanceOf[js.Any])
    if (oldUri != null) __obj.updateDynamic("oldUri")(oldUri.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceFileEdit]
  }
}

