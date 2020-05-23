package typings.picomatch

import typings.picomatch.anon.Alnum
import typings.picomatch.anon.Close
import typings.picomatch.anon.DOTLITERAL
import typings.picomatch.anon.DOTSSLASH
import typings.picomatch.anon.STAR
import typings.picomatch.anon._empty
import typings.std.Record
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("picomatch/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  // Digits
  var CHAR_0: Double = js.native
  var CHAR_9: Double = js.native
  // Non-alphabetic chars.
  var CHAR_AMPERSAND: Double = js.native
  var CHAR_ASTERISK: Double = js.native
  var CHAR_AT: Double = js.native
  var CHAR_BACKWARD_SLASH: Double = js.native
  var CHAR_CARRIAGE_RETURN: Double = js.native
  var CHAR_CIRCUMFLEX_ACCENT: Double = js.native
  var CHAR_COLON: Double = js.native
  var CHAR_COMMA: Double = js.native
  var CHAR_DOT: Double = js.native
  var CHAR_DOUBLE_QUOTE: Double = js.native
  var CHAR_EQUAL: Double = js.native
  var CHAR_EXCLAMATION_MARK: Double = js.native
  var CHAR_FORM_FEED: Double = js.native
  var CHAR_FORWARD_SLASH: Double = js.native
  var CHAR_GRAVE_ACCENT: Double = js.native
  var CHAR_HASH: Double = js.native
  var CHAR_HYPHEN_MINUS: Double = js.native
  var CHAR_LEFT_ANGLE_BRACKET: Double = js.native
  var CHAR_LEFT_CURLY_BRACE: Double = js.native
  var CHAR_LEFT_PARENTHESES: Double = js.native
  var CHAR_LEFT_SQUARE_BRACKET: Double = js.native
  var CHAR_LINE_FEED: Double = js.native
  var CHAR_LOWERCASE_A: Double = js.native
  var CHAR_LOWERCASE_Z: Double = js.native
  var CHAR_NO_BREAK_SPACE: Double = js.native
  var CHAR_PERCENT: Double = js.native
  var CHAR_PLUS: Double = js.native
  var CHAR_QUESTION_MARK: Double = js.native
  var CHAR_RIGHT_ANGLE_BRACKET: Double = js.native
  var CHAR_RIGHT_CURLY_BRACE: Double = js.native
  var CHAR_RIGHT_PARENTHESES: Double = js.native
  var CHAR_RIGHT_SQUARE_BRACKET: Double = js.native
  var CHAR_SEMICOLON: Double = js.native
  var CHAR_SINGLE_QUOTE: Double = js.native
  var CHAR_SPACE: Double = js.native
  var CHAR_TAB: Double = js.native
  var CHAR_UNDERSCORE: Double = js.native
  // Alphabet chars.
  var CHAR_UPPERCASE_A: Double = js.native
  var CHAR_UPPERCASE_Z: Double = js.native
  var CHAR_VERTICAL_LINE: Double = js.native
  var CHAR_ZERO_WIDTH_NOBREAK_SPACE: Double = js.native
  var MAX_LENGTH: Double = js.native
  var POSIX_REGEX_SOURCE: Alnum = js.native
  // regular expressions
  var REGEX_BACKSLASH: RegExp = js.native
  var REGEX_NON_SPECIAL_CHARS: RegExp = js.native
  var REGEX_REMOVE_BACKSLASH: RegExp = js.native
  var REGEX_SPECIAL_CHARS: RegExp = js.native
  var REGEX_SPECIAL_CHARS_BACKREF: RegExp = js.native
  var REGEX_SPECIAL_CHARS_GLOBAL: RegExp = js.native
  var REPLACEMENTS: _empty = js.native
  var SEP: String = js.native
  def extGlobChars(chars: STAR): Record[String, Close] = js.native
  def globChars[T /* <: Boolean */](win32: T): DOTSSLASH | DOTLITERAL = js.native
}

