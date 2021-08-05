package typings.picomatch

import typings.picomatch.picomatchStrings.Asterisk
import typings.picomatch.picomatchStrings.AsteriskAsterisk
import typings.picomatch.picomatchStrings.SpaceBackslasht
import typings.picomatch.picomatchStrings.SpaceBackslashtBackslashrBackslashnBackslashvBackslashf
import typings.picomatch.picomatchStrings.`0-9`
import typings.picomatch.picomatchStrings.`A-Fa-f0-9`
import typings.picomatch.picomatchStrings.`A-Z`
import typings.picomatch.picomatchStrings.`A-Za-z0-9_`
import typings.picomatch.picomatchStrings.`Backslash-ExclamationmarkQuotationmarkNumbersign$PercentsignAmpersandApostropheLeftparenthesisRightparenthesisBackslashAsteriskPlussignCommaDotSlashColonSemicolonLessthansignEqualssignGreaterthansignQuestionmark@[Backslash]^_GraveaccentLeftcurlybracketVerticallineRightcurlybracketTilde`
import typings.picomatch.picomatchStrings.`Backslashx00-Backslashx1FBackslashx7F`
import typings.picomatch.picomatchStrings.`Backslashx00-Backslashx7F`
import typings.picomatch.picomatchStrings.`Backslashx20-Backslashx7E `
import typings.picomatch.picomatchStrings.`Backslashx21-Backslashx7E`
import typings.picomatch.picomatchStrings.`a-zA-Z0-9`
import typings.picomatch.picomatchStrings.`a-zA-Z`
import typings.picomatch.picomatchStrings.`a-z_`
import typings.std.Record
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alnum extends StObject {
    
    var alnum: `a-zA-Z0-9`
    
    var alpha: `a-zA-Z`
    
    var ascii: `Backslashx00-Backslashx7F`
    
    var blank: SpaceBackslasht
    
    var cntrl: `Backslashx00-Backslashx1FBackslashx7F`
    
    var digit: `0-9`
    
    var graph: `Backslashx21-Backslashx7E`
    
    var lower: `a-z_`
    
    var print: `Backslashx20-Backslashx7E `
    
    var punct: `Backslash-ExclamationmarkQuotationmarkNumbersign$PercentsignAmpersandApostropheLeftparenthesisRightparenthesisBackslashAsteriskPlussignCommaDotSlashColonSemicolonLessthansignEqualssignGreaterthansignQuestionmark@[Backslash]^_GraveaccentLeftcurlybracketVerticallineRightcurlybracketTilde`
    
    var space: SpaceBackslashtBackslashrBackslashnBackslashvBackslashf
    
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
      
      inline def setAscii(value: `Backslashx00-Backslashx7F`): Self = StObject.set(x, "ascii", value.asInstanceOf[js.Any])
      
      inline def setBlank(value: SpaceBackslasht): Self = StObject.set(x, "blank", value.asInstanceOf[js.Any])
      
      inline def setCntrl(value: `Backslashx00-Backslashx1FBackslashx7F`): Self = StObject.set(x, "cntrl", value.asInstanceOf[js.Any])
      
      inline def setDigit(value: `0-9`): Self = StObject.set(x, "digit", value.asInstanceOf[js.Any])
      
      inline def setGraph(value: `Backslashx21-Backslashx7E`): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      inline def setLower(value: `a-z_`): Self = StObject.set(x, "lower", value.asInstanceOf[js.Any])
      
      inline def setPrint(value: `Backslashx20-Backslashx7E `): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
      
      inline def setPunct(
        value: `Backslash-ExclamationmarkQuotationmarkNumbersign$PercentsignAmpersandApostropheLeftparenthesisRightparenthesisBackslashAsteriskPlussignCommaDotSlashColonSemicolonLessthansignEqualssignGreaterthansignQuestionmark@[Backslash]^_GraveaccentLeftcurlybracketVerticallineRightcurlybracketTilde`
      ): Self = StObject.set(x, "punct", value.asInstanceOf[js.Any])
      
      inline def setSpace(value: SpaceBackslashtBackslashrBackslashnBackslashvBackslashf): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setUpper(value: `A-Z`): Self = StObject.set(x, "upper", value.asInstanceOf[js.Any])
      
      inline def setWord(value: `A-Za-z0-9_`): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
      
      inline def setXdigit(value: `A-Fa-f0-9`): Self = StObject.set(x, "xdigit", value.asInstanceOf[js.Any])
    }
  }
  
  trait CHAR0 extends StObject {
    
    // Digits
    var CHAR_0: Double
    
    var CHAR_9: Double
    
    // Non-alphabetic chars.
    var CHAR_AMPERSAND: Double
    
    var CHAR_ASTERISK: Double
    
    var CHAR_AT: Double
    
    var CHAR_BACKWARD_SLASH: Double
    
    var CHAR_CARRIAGE_RETURN: Double
    
    var CHAR_CIRCUMFLEX_ACCENT: Double
    
    var CHAR_COLON: Double
    
    var CHAR_COMMA: Double
    
    var CHAR_DOT: Double
    
    var CHAR_DOUBLE_QUOTE: Double
    
    var CHAR_EQUAL: Double
    
    var CHAR_EXCLAMATION_MARK: Double
    
    var CHAR_FORM_FEED: Double
    
    var CHAR_FORWARD_SLASH: Double
    
    var CHAR_GRAVE_ACCENT: Double
    
    var CHAR_HASH: Double
    
    var CHAR_HYPHEN_MINUS: Double
    
    var CHAR_LEFT_ANGLE_BRACKET: Double
    
    var CHAR_LEFT_CURLY_BRACE: Double
    
    var CHAR_LEFT_PARENTHESES: Double
    
    var CHAR_LEFT_SQUARE_BRACKET: Double
    
    var CHAR_LINE_FEED: Double
    
    var CHAR_LOWERCASE_A: Double
    
    var CHAR_LOWERCASE_Z: Double
    
    var CHAR_NO_BREAK_SPACE: Double
    
    var CHAR_PERCENT: Double
    
    var CHAR_PLUS: Double
    
    var CHAR_QUESTION_MARK: Double
    
    var CHAR_RIGHT_ANGLE_BRACKET: Double
    
    var CHAR_RIGHT_CURLY_BRACE: Double
    
    var CHAR_RIGHT_PARENTHESES: Double
    
    var CHAR_RIGHT_SQUARE_BRACKET: Double
    
    var CHAR_SEMICOLON: Double
    
    var CHAR_SINGLE_QUOTE: Double
    
    var CHAR_SPACE: Double
    
    var CHAR_TAB: Double
    
    var CHAR_UNDERSCORE: Double
    
    // Alphabet chars.
    var CHAR_UPPERCASE_A: Double
    
    var CHAR_UPPERCASE_Z: Double
    
    var CHAR_VERTICAL_LINE: Double
    
    var CHAR_ZERO_WIDTH_NOBREAK_SPACE: Double
    
    var MAX_LENGTH: Double
    
    // regular expressions
    var REGEX_BACKSLASH: RegExp
    
    var REGEX_NON_SPECIAL_CHARS: RegExp
    
    var REGEX_REMOVE_BACKSLASH: RegExp
    
    var REGEX_SPECIAL_CHARS: RegExp
    
    var REGEX_SPECIAL_CHARS_BACKREF: RegExp
    
    var REGEX_SPECIAL_CHARS_GLOBAL: RegExp
    
    var REPLACEMENTS: _empty
    
    var SEP: String
    
    def extGlobChars(chars: STAR): Record[String, Close]
    
    def globChars[T /* <: Boolean */](win32: T): /* import warning: importer.ImportType#apply Failed type conversion: typeof POSIX_CHARS */ js.Any
  }
  object CHAR0 {
    
    inline def apply(
      CHAR_0: Double,
      CHAR_9: Double,
      CHAR_AMPERSAND: Double,
      CHAR_ASTERISK: Double,
      CHAR_AT: Double,
      CHAR_BACKWARD_SLASH: Double,
      CHAR_CARRIAGE_RETURN: Double,
      CHAR_CIRCUMFLEX_ACCENT: Double,
      CHAR_COLON: Double,
      CHAR_COMMA: Double,
      CHAR_DOT: Double,
      CHAR_DOUBLE_QUOTE: Double,
      CHAR_EQUAL: Double,
      CHAR_EXCLAMATION_MARK: Double,
      CHAR_FORM_FEED: Double,
      CHAR_FORWARD_SLASH: Double,
      CHAR_GRAVE_ACCENT: Double,
      CHAR_HASH: Double,
      CHAR_HYPHEN_MINUS: Double,
      CHAR_LEFT_ANGLE_BRACKET: Double,
      CHAR_LEFT_CURLY_BRACE: Double,
      CHAR_LEFT_PARENTHESES: Double,
      CHAR_LEFT_SQUARE_BRACKET: Double,
      CHAR_LINE_FEED: Double,
      CHAR_LOWERCASE_A: Double,
      CHAR_LOWERCASE_Z: Double,
      CHAR_NO_BREAK_SPACE: Double,
      CHAR_PERCENT: Double,
      CHAR_PLUS: Double,
      CHAR_QUESTION_MARK: Double,
      CHAR_RIGHT_ANGLE_BRACKET: Double,
      CHAR_RIGHT_CURLY_BRACE: Double,
      CHAR_RIGHT_PARENTHESES: Double,
      CHAR_RIGHT_SQUARE_BRACKET: Double,
      CHAR_SEMICOLON: Double,
      CHAR_SINGLE_QUOTE: Double,
      CHAR_SPACE: Double,
      CHAR_TAB: Double,
      CHAR_UNDERSCORE: Double,
      CHAR_UPPERCASE_A: Double,
      CHAR_UPPERCASE_Z: Double,
      CHAR_VERTICAL_LINE: Double,
      CHAR_ZERO_WIDTH_NOBREAK_SPACE: Double,
      MAX_LENGTH: Double,
      REGEX_BACKSLASH: RegExp,
      REGEX_NON_SPECIAL_CHARS: RegExp,
      REGEX_REMOVE_BACKSLASH: RegExp,
      REGEX_SPECIAL_CHARS: RegExp,
      REGEX_SPECIAL_CHARS_BACKREF: RegExp,
      REGEX_SPECIAL_CHARS_GLOBAL: RegExp,
      REPLACEMENTS: _empty,
      SEP: String,
      extGlobChars: STAR => Record[String, Close],
      globChars: js.Any => /* import warning: importer.ImportType#apply Failed type conversion: typeof POSIX_CHARS */ js.Any
    ): CHAR0 = {
      val __obj = js.Dynamic.literal(CHAR_0 = CHAR_0.asInstanceOf[js.Any], CHAR_9 = CHAR_9.asInstanceOf[js.Any], CHAR_AMPERSAND = CHAR_AMPERSAND.asInstanceOf[js.Any], CHAR_ASTERISK = CHAR_ASTERISK.asInstanceOf[js.Any], CHAR_AT = CHAR_AT.asInstanceOf[js.Any], CHAR_BACKWARD_SLASH = CHAR_BACKWARD_SLASH.asInstanceOf[js.Any], CHAR_CARRIAGE_RETURN = CHAR_CARRIAGE_RETURN.asInstanceOf[js.Any], CHAR_CIRCUMFLEX_ACCENT = CHAR_CIRCUMFLEX_ACCENT.asInstanceOf[js.Any], CHAR_COLON = CHAR_COLON.asInstanceOf[js.Any], CHAR_COMMA = CHAR_COMMA.asInstanceOf[js.Any], CHAR_DOT = CHAR_DOT.asInstanceOf[js.Any], CHAR_DOUBLE_QUOTE = CHAR_DOUBLE_QUOTE.asInstanceOf[js.Any], CHAR_EQUAL = CHAR_EQUAL.asInstanceOf[js.Any], CHAR_EXCLAMATION_MARK = CHAR_EXCLAMATION_MARK.asInstanceOf[js.Any], CHAR_FORM_FEED = CHAR_FORM_FEED.asInstanceOf[js.Any], CHAR_FORWARD_SLASH = CHAR_FORWARD_SLASH.asInstanceOf[js.Any], CHAR_GRAVE_ACCENT = CHAR_GRAVE_ACCENT.asInstanceOf[js.Any], CHAR_HASH = CHAR_HASH.asInstanceOf[js.Any], CHAR_HYPHEN_MINUS = CHAR_HYPHEN_MINUS.asInstanceOf[js.Any], CHAR_LEFT_ANGLE_BRACKET = CHAR_LEFT_ANGLE_BRACKET.asInstanceOf[js.Any], CHAR_LEFT_CURLY_BRACE = CHAR_LEFT_CURLY_BRACE.asInstanceOf[js.Any], CHAR_LEFT_PARENTHESES = CHAR_LEFT_PARENTHESES.asInstanceOf[js.Any], CHAR_LEFT_SQUARE_BRACKET = CHAR_LEFT_SQUARE_BRACKET.asInstanceOf[js.Any], CHAR_LINE_FEED = CHAR_LINE_FEED.asInstanceOf[js.Any], CHAR_LOWERCASE_A = CHAR_LOWERCASE_A.asInstanceOf[js.Any], CHAR_LOWERCASE_Z = CHAR_LOWERCASE_Z.asInstanceOf[js.Any], CHAR_NO_BREAK_SPACE = CHAR_NO_BREAK_SPACE.asInstanceOf[js.Any], CHAR_PERCENT = CHAR_PERCENT.asInstanceOf[js.Any], CHAR_PLUS = CHAR_PLUS.asInstanceOf[js.Any], CHAR_QUESTION_MARK = CHAR_QUESTION_MARK.asInstanceOf[js.Any], CHAR_RIGHT_ANGLE_BRACKET = CHAR_RIGHT_ANGLE_BRACKET.asInstanceOf[js.Any], CHAR_RIGHT_CURLY_BRACE = CHAR_RIGHT_CURLY_BRACE.asInstanceOf[js.Any], CHAR_RIGHT_PARENTHESES = CHAR_RIGHT_PARENTHESES.asInstanceOf[js.Any], CHAR_RIGHT_SQUARE_BRACKET = CHAR_RIGHT_SQUARE_BRACKET.asInstanceOf[js.Any], CHAR_SEMICOLON = CHAR_SEMICOLON.asInstanceOf[js.Any], CHAR_SINGLE_QUOTE = CHAR_SINGLE_QUOTE.asInstanceOf[js.Any], CHAR_SPACE = CHAR_SPACE.asInstanceOf[js.Any], CHAR_TAB = CHAR_TAB.asInstanceOf[js.Any], CHAR_UNDERSCORE = CHAR_UNDERSCORE.asInstanceOf[js.Any], CHAR_UPPERCASE_A = CHAR_UPPERCASE_A.asInstanceOf[js.Any], CHAR_UPPERCASE_Z = CHAR_UPPERCASE_Z.asInstanceOf[js.Any], CHAR_VERTICAL_LINE = CHAR_VERTICAL_LINE.asInstanceOf[js.Any], CHAR_ZERO_WIDTH_NOBREAK_SPACE = CHAR_ZERO_WIDTH_NOBREAK_SPACE.asInstanceOf[js.Any], MAX_LENGTH = MAX_LENGTH.asInstanceOf[js.Any], REGEX_BACKSLASH = REGEX_BACKSLASH.asInstanceOf[js.Any], REGEX_NON_SPECIAL_CHARS = REGEX_NON_SPECIAL_CHARS.asInstanceOf[js.Any], REGEX_REMOVE_BACKSLASH = REGEX_REMOVE_BACKSLASH.asInstanceOf[js.Any], REGEX_SPECIAL_CHARS = REGEX_SPECIAL_CHARS.asInstanceOf[js.Any], REGEX_SPECIAL_CHARS_BACKREF = REGEX_SPECIAL_CHARS_BACKREF.asInstanceOf[js.Any], REGEX_SPECIAL_CHARS_GLOBAL = REGEX_SPECIAL_CHARS_GLOBAL.asInstanceOf[js.Any], REPLACEMENTS = REPLACEMENTS.asInstanceOf[js.Any], SEP = SEP.asInstanceOf[js.Any], extGlobChars = js.Any.fromFunction1(extGlobChars), globChars = js.Any.fromFunction1(globChars))
      __obj.asInstanceOf[CHAR0]
    }
    
    extension [Self <: CHAR0](x: Self) {
      
      inline def setCHAR_0(value: Double): Self = StObject.set(x, "CHAR_0", value.asInstanceOf[js.Any])
      
      inline def setCHAR_9(value: Double): Self = StObject.set(x, "CHAR_9", value.asInstanceOf[js.Any])
      
      inline def setCHAR_AMPERSAND(value: Double): Self = StObject.set(x, "CHAR_AMPERSAND", value.asInstanceOf[js.Any])
      
      inline def setCHAR_ASTERISK(value: Double): Self = StObject.set(x, "CHAR_ASTERISK", value.asInstanceOf[js.Any])
      
      inline def setCHAR_AT(value: Double): Self = StObject.set(x, "CHAR_AT", value.asInstanceOf[js.Any])
      
      inline def setCHAR_BACKWARD_SLASH(value: Double): Self = StObject.set(x, "CHAR_BACKWARD_SLASH", value.asInstanceOf[js.Any])
      
      inline def setCHAR_CARRIAGE_RETURN(value: Double): Self = StObject.set(x, "CHAR_CARRIAGE_RETURN", value.asInstanceOf[js.Any])
      
      inline def setCHAR_CIRCUMFLEX_ACCENT(value: Double): Self = StObject.set(x, "CHAR_CIRCUMFLEX_ACCENT", value.asInstanceOf[js.Any])
      
      inline def setCHAR_COLON(value: Double): Self = StObject.set(x, "CHAR_COLON", value.asInstanceOf[js.Any])
      
      inline def setCHAR_COMMA(value: Double): Self = StObject.set(x, "CHAR_COMMA", value.asInstanceOf[js.Any])
      
      inline def setCHAR_DOT(value: Double): Self = StObject.set(x, "CHAR_DOT", value.asInstanceOf[js.Any])
      
      inline def setCHAR_DOUBLE_QUOTE(value: Double): Self = StObject.set(x, "CHAR_DOUBLE_QUOTE", value.asInstanceOf[js.Any])
      
      inline def setCHAR_EQUAL(value: Double): Self = StObject.set(x, "CHAR_EQUAL", value.asInstanceOf[js.Any])
      
      inline def setCHAR_EXCLAMATION_MARK(value: Double): Self = StObject.set(x, "CHAR_EXCLAMATION_MARK", value.asInstanceOf[js.Any])
      
      inline def setCHAR_FORM_FEED(value: Double): Self = StObject.set(x, "CHAR_FORM_FEED", value.asInstanceOf[js.Any])
      
      inline def setCHAR_FORWARD_SLASH(value: Double): Self = StObject.set(x, "CHAR_FORWARD_SLASH", value.asInstanceOf[js.Any])
      
      inline def setCHAR_GRAVE_ACCENT(value: Double): Self = StObject.set(x, "CHAR_GRAVE_ACCENT", value.asInstanceOf[js.Any])
      
      inline def setCHAR_HASH(value: Double): Self = StObject.set(x, "CHAR_HASH", value.asInstanceOf[js.Any])
      
      inline def setCHAR_HYPHEN_MINUS(value: Double): Self = StObject.set(x, "CHAR_HYPHEN_MINUS", value.asInstanceOf[js.Any])
      
      inline def setCHAR_LEFT_ANGLE_BRACKET(value: Double): Self = StObject.set(x, "CHAR_LEFT_ANGLE_BRACKET", value.asInstanceOf[js.Any])
      
      inline def setCHAR_LEFT_CURLY_BRACE(value: Double): Self = StObject.set(x, "CHAR_LEFT_CURLY_BRACE", value.asInstanceOf[js.Any])
      
      inline def setCHAR_LEFT_PARENTHESES(value: Double): Self = StObject.set(x, "CHAR_LEFT_PARENTHESES", value.asInstanceOf[js.Any])
      
      inline def setCHAR_LEFT_SQUARE_BRACKET(value: Double): Self = StObject.set(x, "CHAR_LEFT_SQUARE_BRACKET", value.asInstanceOf[js.Any])
      
      inline def setCHAR_LINE_FEED(value: Double): Self = StObject.set(x, "CHAR_LINE_FEED", value.asInstanceOf[js.Any])
      
      inline def setCHAR_LOWERCASE_A(value: Double): Self = StObject.set(x, "CHAR_LOWERCASE_A", value.asInstanceOf[js.Any])
      
      inline def setCHAR_LOWERCASE_Z(value: Double): Self = StObject.set(x, "CHAR_LOWERCASE_Z", value.asInstanceOf[js.Any])
      
      inline def setCHAR_NO_BREAK_SPACE(value: Double): Self = StObject.set(x, "CHAR_NO_BREAK_SPACE", value.asInstanceOf[js.Any])
      
      inline def setCHAR_PERCENT(value: Double): Self = StObject.set(x, "CHAR_PERCENT", value.asInstanceOf[js.Any])
      
      inline def setCHAR_PLUS(value: Double): Self = StObject.set(x, "CHAR_PLUS", value.asInstanceOf[js.Any])
      
      inline def setCHAR_QUESTION_MARK(value: Double): Self = StObject.set(x, "CHAR_QUESTION_MARK", value.asInstanceOf[js.Any])
      
      inline def setCHAR_RIGHT_ANGLE_BRACKET(value: Double): Self = StObject.set(x, "CHAR_RIGHT_ANGLE_BRACKET", value.asInstanceOf[js.Any])
      
      inline def setCHAR_RIGHT_CURLY_BRACE(value: Double): Self = StObject.set(x, "CHAR_RIGHT_CURLY_BRACE", value.asInstanceOf[js.Any])
      
      inline def setCHAR_RIGHT_PARENTHESES(value: Double): Self = StObject.set(x, "CHAR_RIGHT_PARENTHESES", value.asInstanceOf[js.Any])
      
      inline def setCHAR_RIGHT_SQUARE_BRACKET(value: Double): Self = StObject.set(x, "CHAR_RIGHT_SQUARE_BRACKET", value.asInstanceOf[js.Any])
      
      inline def setCHAR_SEMICOLON(value: Double): Self = StObject.set(x, "CHAR_SEMICOLON", value.asInstanceOf[js.Any])
      
      inline def setCHAR_SINGLE_QUOTE(value: Double): Self = StObject.set(x, "CHAR_SINGLE_QUOTE", value.asInstanceOf[js.Any])
      
      inline def setCHAR_SPACE(value: Double): Self = StObject.set(x, "CHAR_SPACE", value.asInstanceOf[js.Any])
      
      inline def setCHAR_TAB(value: Double): Self = StObject.set(x, "CHAR_TAB", value.asInstanceOf[js.Any])
      
      inline def setCHAR_UNDERSCORE(value: Double): Self = StObject.set(x, "CHAR_UNDERSCORE", value.asInstanceOf[js.Any])
      
      inline def setCHAR_UPPERCASE_A(value: Double): Self = StObject.set(x, "CHAR_UPPERCASE_A", value.asInstanceOf[js.Any])
      
      inline def setCHAR_UPPERCASE_Z(value: Double): Self = StObject.set(x, "CHAR_UPPERCASE_Z", value.asInstanceOf[js.Any])
      
      inline def setCHAR_VERTICAL_LINE(value: Double): Self = StObject.set(x, "CHAR_VERTICAL_LINE", value.asInstanceOf[js.Any])
      
      inline def setCHAR_ZERO_WIDTH_NOBREAK_SPACE(value: Double): Self = StObject.set(x, "CHAR_ZERO_WIDTH_NOBREAK_SPACE", value.asInstanceOf[js.Any])
      
      inline def setExtGlobChars(value: STAR => Record[String, Close]): Self = StObject.set(x, "extGlobChars", js.Any.fromFunction1(value))
      
      inline def setGlobChars(
        value: js.Any => /* import warning: importer.ImportType#apply Failed type conversion: typeof POSIX_CHARS */ js.Any
      ): Self = StObject.set(x, "globChars", js.Any.fromFunction1(value))
      
      inline def setMAX_LENGTH(value: Double): Self = StObject.set(x, "MAX_LENGTH", value.asInstanceOf[js.Any])
      
      inline def setREGEX_BACKSLASH(value: RegExp): Self = StObject.set(x, "REGEX_BACKSLASH", value.asInstanceOf[js.Any])
      
      inline def setREGEX_NON_SPECIAL_CHARS(value: RegExp): Self = StObject.set(x, "REGEX_NON_SPECIAL_CHARS", value.asInstanceOf[js.Any])
      
      inline def setREGEX_REMOVE_BACKSLASH(value: RegExp): Self = StObject.set(x, "REGEX_REMOVE_BACKSLASH", value.asInstanceOf[js.Any])
      
      inline def setREGEX_SPECIAL_CHARS(value: RegExp): Self = StObject.set(x, "REGEX_SPECIAL_CHARS", value.asInstanceOf[js.Any])
      
      inline def setREGEX_SPECIAL_CHARS_BACKREF(value: RegExp): Self = StObject.set(x, "REGEX_SPECIAL_CHARS_BACKREF", value.asInstanceOf[js.Any])
      
      inline def setREGEX_SPECIAL_CHARS_GLOBAL(value: RegExp): Self = StObject.set(x, "REGEX_SPECIAL_CHARS_GLOBAL", value.asInstanceOf[js.Any])
      
      inline def setREPLACEMENTS(value: _empty): Self = StObject.set(x, "REPLACEMENTS", value.asInstanceOf[js.Any])
      
      inline def setSEP(value: String): Self = StObject.set(x, "SEP", value.asInstanceOf[js.Any])
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
  object DOTSSLASH {
    
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
    ): DOTSSLASH = {
      val __obj = js.Dynamic.literal(DOTS_SLASH = DOTS_SLASH.asInstanceOf[js.Any], DOT_LITERAL = DOT_LITERAL.asInstanceOf[js.Any], END_ANCHOR = END_ANCHOR.asInstanceOf[js.Any], NO_DOT = NO_DOT.asInstanceOf[js.Any], NO_DOTS = NO_DOTS.asInstanceOf[js.Any], NO_DOTS_SLASH = NO_DOTS_SLASH.asInstanceOf[js.Any], NO_DOT_SLASH = NO_DOT_SLASH.asInstanceOf[js.Any], ONE_CHAR = ONE_CHAR.asInstanceOf[js.Any], PLUS_LITERAL = PLUS_LITERAL.asInstanceOf[js.Any], QMARK = QMARK.asInstanceOf[js.Any], QMARK_LITERAL = QMARK_LITERAL.asInstanceOf[js.Any], QMARK_NO_DOT = QMARK_NO_DOT.asInstanceOf[js.Any], SLASH_LITERAL = SLASH_LITERAL.asInstanceOf[js.Any], STAR = STAR.asInstanceOf[js.Any], START_ANCHOR = START_ANCHOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[DOTSSLASH]
    }
    
    extension [Self <: DOTSSLASH](x: Self) {
      
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
  
  trait Debug extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var flags: js.UndefOr[String] = js.undefined
    
    var nocase: js.UndefOr[Boolean] = js.undefined
  }
  object Debug {
    
    inline def apply(): Debug = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Debug]
    }
    
    extension [Self <: Debug](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      inline def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
    }
  }
  
  trait IsMatch extends StObject {
    
    var isMatch: Boolean
    
    var `match`: Boolean
    
    var output: js.Any
  }
  object IsMatch {
    
    inline def apply(isMatch: Boolean, `match`: Boolean, output: js.Any): IsMatch = {
      val __obj = js.Dynamic.literal(isMatch = isMatch.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsMatch]
    }
    
    extension [Self <: IsMatch](x: Self) {
      
      inline def setIsMatch(value: Boolean): Self = StObject.set(x, "isMatch", value.asInstanceOf[js.Any])
      
      inline def setMatch(value: Boolean): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: js.Any): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaxLength extends StObject {
    
    var maxLength: Double
  }
  object MaxLength {
    
    inline def apply(maxLength: Double): MaxLength = {
      val __obj = js.Dynamic.literal(maxLength = maxLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxLength]
    }
    
    extension [Self <: MaxLength](x: Self) {
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
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
