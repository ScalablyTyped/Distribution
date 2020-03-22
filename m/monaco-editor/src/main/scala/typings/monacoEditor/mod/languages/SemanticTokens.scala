package typings.monacoEditor.mod.languages

import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SemanticTokens extends js.Object {
  val data: Uint32Array
  val resultId: js.UndefOr[String] = js.undefined
}

object SemanticTokens {
  @scala.inline
  def apply(data: Uint32Array, resultId: String = null): SemanticTokens = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (resultId != null) __obj.updateDynamic("resultId")(resultId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokens]
  }
}

