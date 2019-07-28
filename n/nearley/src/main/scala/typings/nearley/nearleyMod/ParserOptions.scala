package typings.nearley.nearleyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends js.Object {
  var keepHistory: js.UndefOr[Boolean] = js.undefined
  var lexer: js.UndefOr[Lexer] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(keepHistory: js.UndefOr[Boolean] = js.undefined, lexer: Lexer = null): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepHistory)) __obj.updateDynamic("keepHistory")(keepHistory)
    if (lexer != null) __obj.updateDynamic("lexer")(lexer)
    __obj.asInstanceOf[ParserOptions]
  }
}

