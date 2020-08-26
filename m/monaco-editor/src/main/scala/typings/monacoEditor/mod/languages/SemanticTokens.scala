package typings.monacoEditor.mod.languages

import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SemanticTokens extends js.Object {
  val data: Uint32Array = js.native
  val resultId: js.UndefOr[String] = js.native
}

object SemanticTokens {
  @scala.inline
  def apply(data: Uint32Array): SemanticTokens = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokens]
  }
  @scala.inline
  implicit class SemanticTokensOps[Self <: SemanticTokens] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: Uint32Array): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultId(value: String): Self = this.set("resultId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultId: Self = this.set("resultId", js.undefined)
  }
  
}

