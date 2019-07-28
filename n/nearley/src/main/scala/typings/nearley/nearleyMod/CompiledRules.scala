package typings.nearley.nearleyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompiledRules extends js.Object {
  var Lexer: js.UndefOr[typings.nearley.nearleyMod.Lexer] = js.undefined
  var ParserRules: js.Array[ParserRule]
  var ParserStart: String
}

object CompiledRules {
  @scala.inline
  def apply(ParserRules: js.Array[ParserRule], ParserStart: String, Lexer: Lexer = null): CompiledRules = {
    val __obj = js.Dynamic.literal(ParserRules = ParserRules, ParserStart = ParserStart)
    if (Lexer != null) __obj.updateDynamic("Lexer")(Lexer)
    __obj.asInstanceOf[CompiledRules]
  }
}

