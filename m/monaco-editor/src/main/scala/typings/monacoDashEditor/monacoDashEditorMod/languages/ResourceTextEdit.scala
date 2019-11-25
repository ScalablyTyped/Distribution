package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceTextEdit extends js.Object {
  var edits: js.Array[TextEdit]
  var modelVersionId: js.UndefOr[Double] = js.undefined
  var resource: Uri
}

object ResourceTextEdit {
  @scala.inline
  def apply(edits: js.Array[TextEdit], resource: Uri, modelVersionId: Int | Double = null): ResourceTextEdit = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    if (modelVersionId != null) __obj.updateDynamic("modelVersionId")(modelVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceTextEdit]
  }
}

