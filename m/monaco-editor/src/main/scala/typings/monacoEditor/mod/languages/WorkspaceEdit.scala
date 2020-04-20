package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceEdit extends js.Object {
  var edits: js.Array[WorkspaceTextEdit | WorkspaceFileEdit]
}

object WorkspaceEdit {
  @scala.inline
  def apply(edits: js.Array[WorkspaceTextEdit | WorkspaceFileEdit]): WorkspaceEdit = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceEdit]
  }
}

