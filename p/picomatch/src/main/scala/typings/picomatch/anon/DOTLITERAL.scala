package typings.picomatch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOTLITERAL extends js.Object {
  
  var DOTS_SLASH: String = js.native
  
  var DOT_LITERAL: String = js.native
  
  var END_ANCHOR: String = js.native
  
  var NO_DOT: String = js.native
  
  var NO_DOTS: String = js.native
  
  var NO_DOTS_SLASH: String = js.native
  
  var NO_DOT_SLASH: String = js.native
  
  var ONE_CHAR: String = js.native
  
  var PLUS_LITERAL: String = js.native
  
  var QMARK: String = js.native
  
  var QMARK_LITERAL: String = js.native
  
  var QMARK_NO_DOT: String = js.native
  
  var SLASH_LITERAL: String = js.native
  
  var STAR: String = js.native
  
  var START_ANCHOR: String = js.native
}
object DOTLITERAL {
  
  @scala.inline
  def apply(
    DOTS_SLASH: String,
    DOT_LITERAL: String,
    END_ANCHOR: String,
    NO_DOT: String,
    NO_DOTS: String,
    NO_DOTS_SLASH: String,
    NO_DOT_SLASH: String,
    ONE_CHAR: String,
    PLUS_LITERAL: String,
    QMARK: String,
    QMARK_LITERAL: String,
    QMARK_NO_DOT: String,
    SLASH_LITERAL: String,
    STAR: String,
    START_ANCHOR: String
  ): DOTLITERAL = {
    val __obj = js.Dynamic.literal(DOTS_SLASH = DOTS_SLASH.asInstanceOf[js.Any], DOT_LITERAL = DOT_LITERAL.asInstanceOf[js.Any], END_ANCHOR = END_ANCHOR.asInstanceOf[js.Any], NO_DOT = NO_DOT.asInstanceOf[js.Any], NO_DOTS = NO_DOTS.asInstanceOf[js.Any], NO_DOTS_SLASH = NO_DOTS_SLASH.asInstanceOf[js.Any], NO_DOT_SLASH = NO_DOT_SLASH.asInstanceOf[js.Any], ONE_CHAR = ONE_CHAR.asInstanceOf[js.Any], PLUS_LITERAL = PLUS_LITERAL.asInstanceOf[js.Any], QMARK = QMARK.asInstanceOf[js.Any], QMARK_LITERAL = QMARK_LITERAL.asInstanceOf[js.Any], QMARK_NO_DOT = QMARK_NO_DOT.asInstanceOf[js.Any], SLASH_LITERAL = SLASH_LITERAL.asInstanceOf[js.Any], STAR = STAR.asInstanceOf[js.Any], START_ANCHOR = START_ANCHOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOTLITERAL]
  }
  
  @scala.inline
  implicit class DOTLITERALOps[Self <: DOTLITERAL] (val x: Self) extends AnyVal {
    
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
    def setDOTS_SLASH(value: String): Self = this.set("DOTS_SLASH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOT_LITERAL(value: String): Self = this.set("DOT_LITERAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEND_ANCHOR(value: String): Self = this.set("END_ANCHOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNO_DOT(value: String): Self = this.set("NO_DOT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNO_DOTS(value: String): Self = this.set("NO_DOTS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNO_DOTS_SLASH(value: String): Self = this.set("NO_DOTS_SLASH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNO_DOT_SLASH(value: String): Self = this.set("NO_DOT_SLASH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setONE_CHAR(value: String): Self = this.set("ONE_CHAR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPLUS_LITERAL(value: String): Self = this.set("PLUS_LITERAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMARK(value: String): Self = this.set("QMARK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMARK_LITERAL(value: String): Self = this.set("QMARK_LITERAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMARK_NO_DOT(value: String): Self = this.set("QMARK_NO_DOT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSLASH_LITERAL(value: String): Self = this.set("SLASH_LITERAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTAR(value: String): Self = this.set("STAR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTART_ANCHOR(value: String): Self = this.set("START_ANCHOR", value.asInstanceOf[js.Any])
  }
}
