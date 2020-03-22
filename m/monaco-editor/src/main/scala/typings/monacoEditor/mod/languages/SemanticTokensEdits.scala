package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SemanticTokensEdits extends js.Object {
  val edits: js.Array[SemanticTokensEdit]
  val resultId: js.UndefOr[String] = js.undefined
}

object SemanticTokensEdits {
  @scala.inline
  def apply(edits: js.Array[SemanticTokensEdit], resultId: String = null): SemanticTokensEdits = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any])
    if (resultId != null) __obj.updateDynamic("resultId")(resultId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensEdits]
  }
}

