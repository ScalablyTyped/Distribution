package typings.nearley.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParserOptions extends js.Object {
  var keepHistory: js.UndefOr[Boolean] = js.native
  var lexer: js.UndefOr[Lexer] = js.native
}

object ParserOptions {
  @scala.inline
  def apply(): ParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserOptions]
  }
  @scala.inline
  implicit class ParserOptionsOps[Self <: ParserOptions] (val x: Self) extends AnyVal {
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
    def setKeepHistory(value: Boolean): Self = this.set("keepHistory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepHistory: Self = this.set("keepHistory", js.undefined)
    @scala.inline
    def setLexer(value: Lexer): Self = this.set("lexer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLexer: Self = this.set("lexer", js.undefined)
  }
  
}

