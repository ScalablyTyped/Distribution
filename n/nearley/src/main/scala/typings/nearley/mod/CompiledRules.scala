package typings.nearley.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompiledRules extends js.Object {
  
  var Lexer: js.UndefOr[typings.nearley.mod.Lexer] = js.native
  
  var ParserRules: js.Array[ParserRule] = js.native
  
  var ParserStart: String = js.native
}
object CompiledRules {
  
  @scala.inline
  def apply(ParserRules: js.Array[ParserRule], ParserStart: String): CompiledRules = {
    val __obj = js.Dynamic.literal(ParserRules = ParserRules.asInstanceOf[js.Any], ParserStart = ParserStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledRules]
  }
  
  @scala.inline
  implicit class CompiledRulesOps[Self <: CompiledRules] (val x: Self) extends AnyVal {
    
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
    def setParserRulesVarargs(value: ParserRule*): Self = this.set("ParserRules", js.Array(value :_*))
    
    @scala.inline
    def setParserRules(value: js.Array[ParserRule]): Self = this.set("ParserRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParserStart(value: String): Self = this.set("ParserStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLexer(value: Lexer): Self = this.set("Lexer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLexer: Self = this.set("Lexer", js.undefined)
  }
}
