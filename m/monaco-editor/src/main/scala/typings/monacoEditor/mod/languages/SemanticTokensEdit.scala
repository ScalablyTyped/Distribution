package typings.monacoEditor.mod.languages

import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SemanticTokensEdit extends js.Object {
  val data: js.UndefOr[Uint32Array] = js.undefined
  val deleteCount: Double
  val start: Double
}

object SemanticTokensEdit {
  @scala.inline
  def apply(deleteCount: Double, start: Double, data: Uint32Array = null): SemanticTokensEdit = {
    val __obj = js.Dynamic.literal(deleteCount = deleteCount.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensEdit]
  }
}

