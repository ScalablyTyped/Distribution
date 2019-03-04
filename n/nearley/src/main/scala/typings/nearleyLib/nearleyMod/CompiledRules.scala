package typings
package nearleyLib.nearleyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompiledRules extends js.Object {
  var Lexer: js.UndefOr[Lexer] = js.undefined
  var ParserRules: js.Array[ParserRule]
  var ParserStart: java.lang.String
}

object CompiledRules {
  @scala.inline
  def apply(ParserRules: js.Array[ParserRule], ParserStart: java.lang.String, Lexer: Lexer = null): CompiledRules = {
    val __obj = js.Dynamic.literal(ParserRules = ParserRules, ParserStart = ParserStart)
    if (Lexer != null) __obj.updateDynamic("Lexer")(Lexer)
    __obj.asInstanceOf[CompiledRules]
  }
}

