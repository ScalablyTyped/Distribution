package typings.picomatch

import typings.picomatch.picomatchStrings.Asterisk
import typings.picomatch.picomatchStrings.AsteriskAsterisk
import typings.picomatch.picomatchStrings.`0-9`
import typings.picomatch.picomatchStrings.`A-Fa-f0-9`
import typings.picomatch.picomatchStrings.`A-Z`
import typings.picomatch.picomatchStrings.`A-Za-z0-9_`
import typings.picomatch.picomatchStrings.`a-zA-Z0-9`
import typings.picomatch.picomatchStrings.`a-zA-Z`
import typings.picomatch.picomatchStrings.`a-z_`
import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alnum extends StObject {
    
    var alnum: `a-zA-Z0-9`
    
    var alpha: `a-zA-Z`
    
    var ascii: String
    
    var blank: String
    
    var cntrl: String
    
    var digit: `0-9`
    
    var graph: String
    
    var lower: `a-z_`
    
    var print: String
    
    var punct: String
    
    var space: String
    
    var upper: `A-Z`
    
    var word: `A-Za-z0-9_`
    
    var xdigit: `A-Fa-f0-9`
  }
  object Alnum {
    
    inline def apply(): Alnum = {
      val __obj = js.Dynamic.literal(alnum = "a-zA-Z0-9", alpha = "a-zA-Z", ascii = "\\x00-\\x7F", blank = " \\t", cntrl = "\\x00-\\x1F\\x7F", digit = "0-9", graph = "\\x21-\\x7E", lower = "a-z", print = "\\x20-\\x7E ", punct = "\\-!\"#$%&'()\\*+,./:;<=>?@[\\]^_`{|}~", space = " \\t\\r\\n\\v\\f", upper = "A-Z", word = "A-Za-z0-9_", xdigit = "A-Fa-f0-9")
      __obj.asInstanceOf[Alnum]
    }
    
    extension [Self <: Alnum](x: Self) {
      
      inline def setAlnum(value: `a-zA-Z0-9`): Self = StObject.set(x, "alnum", value.asInstanceOf[js.Any])
      
      inline def setAlpha(value: `a-zA-Z`): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAscii(value: String): Self = StObject.set(x, "ascii", value.asInstanceOf[js.Any])
      
      inline def setBlank(value: String): Self = StObject.set(x, "blank", value.asInstanceOf[js.Any])
      
      inline def setCntrl(value: String): Self = StObject.set(x, "cntrl", value.asInstanceOf[js.Any])
      
      inline def setDigit(value: `0-9`): Self = StObject.set(x, "digit", value.asInstanceOf[js.Any])
      
      inline def setGraph(value: String): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      inline def setLower(value: `a-z_`): Self = StObject.set(x, "lower", value.asInstanceOf[js.Any])
      
      inline def setPrint(value: String): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
      
      inline def setPunct(value: String): Self = StObject.set(x, "punct", value.asInstanceOf[js.Any])
      
      inline def setSpace(value: String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setUpper(value: `A-Z`): Self = StObject.set(x, "upper", value.asInstanceOf[js.Any])
      
      inline def setWord(value: `A-Za-z0-9_`): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
      
      inline def setXdigit(value: `A-Fa-f0-9`): Self = StObject.set(x, "xdigit", value.asInstanceOf[js.Any])
    }
  }
  
  trait Close extends StObject {
    
    var close: String
    
    var open: String
    
    var `type`: String
  }
  object Close {
    
    inline def apply(close: String, open: String, `type`: String): Close = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Close]
    }
    
    extension [Self <: Close](x: Self) {
      
      inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DOTLITERAL extends StObject {
    
    var DOTS_SLASH: String
    
    var DOT_LITERAL: String
    
    var END_ANCHOR: String
    
    var NO_DOT: String
    
    var NO_DOTS: String
    
    var NO_DOTS_SLASH: String
    
    var NO_DOT_SLASH: String
    
    var ONE_CHAR: String
    
    var PLUS_LITERAL: String
    
    var QMARK: String
    
    var QMARK_LITERAL: String
    
    var QMARK_NO_DOT: String
    
    var SLASH_LITERAL: String
    
    var STAR: String
    
    var START_ANCHOR: String
  }
  object DOTLITERAL {
    
    inline def apply(
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
    
    extension [Self <: DOTLITERAL](x: Self) {
      
      inline def setDOTS_SLASH(value: String): Self = StObject.set(x, "DOTS_SLASH", value.asInstanceOf[js.Any])
      
      inline def setDOT_LITERAL(value: String): Self = StObject.set(x, "DOT_LITERAL", value.asInstanceOf[js.Any])
      
      inline def setEND_ANCHOR(value: String): Self = StObject.set(x, "END_ANCHOR", value.asInstanceOf[js.Any])
      
      inline def setNO_DOT(value: String): Self = StObject.set(x, "NO_DOT", value.asInstanceOf[js.Any])
      
      inline def setNO_DOTS(value: String): Self = StObject.set(x, "NO_DOTS", value.asInstanceOf[js.Any])
      
      inline def setNO_DOTS_SLASH(value: String): Self = StObject.set(x, "NO_DOTS_SLASH", value.asInstanceOf[js.Any])
      
      inline def setNO_DOT_SLASH(value: String): Self = StObject.set(x, "NO_DOT_SLASH", value.asInstanceOf[js.Any])
      
      inline def setONE_CHAR(value: String): Self = StObject.set(x, "ONE_CHAR", value.asInstanceOf[js.Any])
      
      inline def setPLUS_LITERAL(value: String): Self = StObject.set(x, "PLUS_LITERAL", value.asInstanceOf[js.Any])
      
      inline def setQMARK(value: String): Self = StObject.set(x, "QMARK", value.asInstanceOf[js.Any])
      
      inline def setQMARK_LITERAL(value: String): Self = StObject.set(x, "QMARK_LITERAL", value.asInstanceOf[js.Any])
      
      inline def setQMARK_NO_DOT(value: String): Self = StObject.set(x, "QMARK_NO_DOT", value.asInstanceOf[js.Any])
      
      inline def setSLASH_LITERAL(value: String): Self = StObject.set(x, "SLASH_LITERAL", value.asInstanceOf[js.Any])
      
      inline def setSTAR(value: String): Self = StObject.set(x, "STAR", value.asInstanceOf[js.Any])
      
      inline def setSTART_ANCHOR(value: String): Self = StObject.set(x, "START_ANCHOR", value.asInstanceOf[js.Any])
    }
  }
  
  trait DOTSSLASH extends StObject {
    
    var DOTS_SLASH: String
    
    var END_ANCHOR: String
    
    var NO_DOT: String
    
    var NO_DOTS: String
    
    var NO_DOTS_SLASH: String
    
    var NO_DOT_SLASH: String
    
    var QMARK: String
    
    var QMARK_NO_DOT: String
    
    var SLASH_LITERAL: String
    
    var STAR: String
    
    var START_ANCHOR: String
  }
  object DOTSSLASH {
    
    inline def apply(
      DOTS_SLASH: String,
      END_ANCHOR: String,
      NO_DOT: String,
      NO_DOTS: String,
      NO_DOTS_SLASH: String,
      NO_DOT_SLASH: String,
      QMARK: String,
      QMARK_NO_DOT: String,
      SLASH_LITERAL: String,
      STAR: String,
      START_ANCHOR: String
    ): DOTSSLASH = {
      val __obj = js.Dynamic.literal(DOTS_SLASH = DOTS_SLASH.asInstanceOf[js.Any], END_ANCHOR = END_ANCHOR.asInstanceOf[js.Any], NO_DOT = NO_DOT.asInstanceOf[js.Any], NO_DOTS = NO_DOTS.asInstanceOf[js.Any], NO_DOTS_SLASH = NO_DOTS_SLASH.asInstanceOf[js.Any], NO_DOT_SLASH = NO_DOT_SLASH.asInstanceOf[js.Any], QMARK = QMARK.asInstanceOf[js.Any], QMARK_NO_DOT = QMARK_NO_DOT.asInstanceOf[js.Any], SLASH_LITERAL = SLASH_LITERAL.asInstanceOf[js.Any], STAR = STAR.asInstanceOf[js.Any], START_ANCHOR = START_ANCHOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[DOTSSLASH]
    }
    
    extension [Self <: DOTSSLASH](x: Self) {
      
      inline def setDOTS_SLASH(value: String): Self = StObject.set(x, "DOTS_SLASH", value.asInstanceOf[js.Any])
      
      inline def setEND_ANCHOR(value: String): Self = StObject.set(x, "END_ANCHOR", value.asInstanceOf[js.Any])
      
      inline def setNO_DOT(value: String): Self = StObject.set(x, "NO_DOT", value.asInstanceOf[js.Any])
      
      inline def setNO_DOTS(value: String): Self = StObject.set(x, "NO_DOTS", value.asInstanceOf[js.Any])
      
      inline def setNO_DOTS_SLASH(value: String): Self = StObject.set(x, "NO_DOTS_SLASH", value.asInstanceOf[js.Any])
      
      inline def setNO_DOT_SLASH(value: String): Self = StObject.set(x, "NO_DOT_SLASH", value.asInstanceOf[js.Any])
      
      inline def setQMARK(value: String): Self = StObject.set(x, "QMARK", value.asInstanceOf[js.Any])
      
      inline def setQMARK_NO_DOT(value: String): Self = StObject.set(x, "QMARK_NO_DOT", value.asInstanceOf[js.Any])
      
      inline def setSLASH_LITERAL(value: String): Self = StObject.set(x, "SLASH_LITERAL", value.asInstanceOf[js.Any])
      
      inline def setSTAR(value: String): Self = StObject.set(x, "STAR", value.asInstanceOf[js.Any])
      
      inline def setSTART_ANCHOR(value: String): Self = StObject.set(x, "START_ANCHOR", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsMatch extends StObject {
    
    var isMatch: Boolean
    
    var `match`: js.UndefOr[Boolean | RegExpExecArray | Null] = js.undefined
    
    var output: String
  }
  object IsMatch {
    
    inline def apply(isMatch: Boolean, output: String): IsMatch = {
      val __obj = js.Dynamic.literal(isMatch = isMatch.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsMatch]
    }
    
    extension [Self <: IsMatch](x: Self) {
      
      inline def setIsMatch(value: Boolean): Self = StObject.set(x, "isMatch", value.asInstanceOf[js.Any])
      
      inline def setMatch(value: Boolean | RegExpExecArray): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchNull: Self = StObject.set(x, "match", null)
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaxLength extends StObject {
    
    var maxLength: js.UndefOr[Double] = js.undefined
  }
  object MaxLength {
    
    inline def apply(): MaxLength = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxLength]
    }
    
    extension [Self <: MaxLength](x: Self) {
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    }
  }
  
  trait STAR extends StObject {
    
    var STAR: String
  }
  object STAR {
    
    inline def apply(STAR: String): STAR = {
      val __obj = js.Dynamic.literal(STAR = STAR.asInstanceOf[js.Any])
      __obj.asInstanceOf[STAR]
    }
    
    extension [Self <: STAR](x: Self) {
      
      inline def setSTAR(value: String): Self = StObject.set(x, "STAR", value.asInstanceOf[js.Any])
    }
  }
  
  trait _empty extends StObject {
    
    @JSName("***")
    var AsteriskAsteriskAsterisk: Asterisk
    
    @JSName("**/**")
    var AsteriskAsteriskSlashAsteriskAsterisk: AsteriskAsterisk
    
    @JSName("**/**/**")
    var AsteriskAsteriskSlashAsteriskAsteriskSlashAsteriskAsterisk: AsteriskAsterisk
  }
  object _empty {
    
    inline def apply(): _empty = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("***")("*")
      __obj.updateDynamic("**/**")("**")
      __obj.updateDynamic("**/**/**")("**")
      __obj.asInstanceOf[_empty]
    }
    
    extension [Self <: _empty](x: Self) {
      
      inline def setAsteriskAsteriskAsterisk(value: Asterisk): Self = StObject.set(x, "***", value.asInstanceOf[js.Any])
      
      inline def setAsteriskAsteriskSlashAsteriskAsterisk(value: AsteriskAsterisk): Self = StObject.set(x, "**/**", value.asInstanceOf[js.Any])
      
      inline def setAsteriskAsteriskSlashAsteriskAsteriskSlashAsteriskAsterisk(value: AsteriskAsterisk): Self = StObject.set(x, "**/**/**", value.asInstanceOf[js.Any])
    }
  }
}
