package typings.picomatch.anon

import typings.std.Record
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CHAR0 extends js.Object {
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
  @scala.inline
  def apply(
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
}

