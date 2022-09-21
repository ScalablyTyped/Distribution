package typings.picomatch

import typings.picomatch.anon.Close
import typings.picomatch.anon.IsMatch
import typings.picomatch.anon.MaxLength
import typings.picomatch.anon.STAR
import typings.picomatch.anon._empty
import typings.picomatch.parseMod.ParseState
import typings.picomatch.picomatchBooleans.`false`
import typings.picomatch.picomatchBooleans.`true`
import typings.picomatch.scanMod.Options
import typings.picomatch.scanMod.State
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object picomatchMod {
  
  /**
    * Creates a matcher function from one or more glob patterns. The
    * returned function takes a string to match as its first argument,
    * and returns true if the string is a match. The returned matcher
    * function also takes a boolean as the second argument that, when true,
    * returns an object with additional information.
    *
    * ```js
    * const picomatch = require('picomatch');
    * // picomatch(glob[, options]);
    *
    * const isMatch = picomatch('*.!(*a)');
    * console.log(isMatch('a.a')); //=> false
    * console.log(isMatch('a.b')); //=> true
    * ```
    * @param glob One or more glob patterns.
    * @return Returns a matcher function.
    * @api public
    */
  inline def apply[T /* <: `true` | `false` */](glob: Glob): Matcher | MatcherWithState = ^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any]).asInstanceOf[Matcher | MatcherWithState]
  inline def apply[T /* <: `true` | `false` */](glob: Glob, options: Unit, returnState: T): Matcher | MatcherWithState = (^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnState.asInstanceOf[js.Any])).asInstanceOf[Matcher | MatcherWithState]
  inline def apply[T /* <: `true` | `false` */](glob: Glob, options: PicomatchOptions): Matcher | MatcherWithState = (^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Matcher | MatcherWithState]
  inline def apply[T /* <: `true` | `false` */](glob: Glob, options: PicomatchOptions, returnState: T): Matcher | MatcherWithState = (^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnState.asInstanceOf[js.Any])).asInstanceOf[Matcher | MatcherWithState]
  
  @JSImport("picomatch/lib/picomatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compileRe(state: ParseState): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("compileRe")(state.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  inline def compileRe(state: ParseState, options: Unit, returnOutput: Boolean): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("compileRe")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnOutput.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  inline def compileRe(state: ParseState, options: Unit, returnOutput: Boolean, returnState: Boolean): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("compileRe")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnOutput.asInstanceOf[js.Any], returnState.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  inline def compileRe(state: ParseState, options: Unit, returnOutput: Unit, returnState: Boolean): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("compileRe")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnOutput.asInstanceOf[js.Any], returnState.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  inline def compileRe(state: ParseState, options: PicomatchOptions): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("compileRe")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  inline def compileRe(state: ParseState, options: PicomatchOptions, returnOutput: Boolean): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("compileRe")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnOutput.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  inline def compileRe(state: ParseState, options: PicomatchOptions, returnOutput: Boolean, returnState: Boolean): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("compileRe")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnOutput.asInstanceOf[js.Any], returnState.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  inline def compileRe(state: ParseState, options: PicomatchOptions, returnOutput: Unit, returnState: Boolean): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("compileRe")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnOutput.asInstanceOf[js.Any], returnState.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  
  object constants {
    
    @JSImport("picomatch/lib/picomatch", "constants")
    @js.native
    val ^ : js.Any = js.native
    
    // Digits
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_0")
    @js.native
    def CHAR_0: Double = js.native
    inline def CHAR_0_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_0")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_9")
    @js.native
    def CHAR_9: Double = js.native
    inline def CHAR_9_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_9")(x.asInstanceOf[js.Any])
    
    // Non-alphabetic chars.
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_AMPERSAND")
    @js.native
    def CHAR_AMPERSAND: Double = js.native
    inline def CHAR_AMPERSAND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_AMPERSAND")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_ASTERISK")
    @js.native
    def CHAR_ASTERISK: Double = js.native
    inline def CHAR_ASTERISK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_ASTERISK")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_AT")
    @js.native
    def CHAR_AT: Double = js.native
    inline def CHAR_AT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_AT")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_BACKWARD_SLASH")
    @js.native
    def CHAR_BACKWARD_SLASH: Double = js.native
    inline def CHAR_BACKWARD_SLASH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_BACKWARD_SLASH")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_CARRIAGE_RETURN")
    @js.native
    def CHAR_CARRIAGE_RETURN: Double = js.native
    inline def CHAR_CARRIAGE_RETURN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_CARRIAGE_RETURN")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_CIRCUMFLEX_ACCENT")
    @js.native
    def CHAR_CIRCUMFLEX_ACCENT: Double = js.native
    inline def CHAR_CIRCUMFLEX_ACCENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_CIRCUMFLEX_ACCENT")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_COLON")
    @js.native
    def CHAR_COLON: Double = js.native
    inline def CHAR_COLON_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_COLON")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_COMMA")
    @js.native
    def CHAR_COMMA: Double = js.native
    inline def CHAR_COMMA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_COMMA")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_DOT")
    @js.native
    def CHAR_DOT: Double = js.native
    inline def CHAR_DOT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_DOT")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_DOUBLE_QUOTE")
    @js.native
    def CHAR_DOUBLE_QUOTE: Double = js.native
    inline def CHAR_DOUBLE_QUOTE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_DOUBLE_QUOTE")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_EQUAL")
    @js.native
    def CHAR_EQUAL: Double = js.native
    inline def CHAR_EQUAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_EQUAL")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_EXCLAMATION_MARK")
    @js.native
    def CHAR_EXCLAMATION_MARK: Double = js.native
    inline def CHAR_EXCLAMATION_MARK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_EXCLAMATION_MARK")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_FORM_FEED")
    @js.native
    def CHAR_FORM_FEED: Double = js.native
    inline def CHAR_FORM_FEED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_FORM_FEED")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_FORWARD_SLASH")
    @js.native
    def CHAR_FORWARD_SLASH: Double = js.native
    inline def CHAR_FORWARD_SLASH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_FORWARD_SLASH")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_GRAVE_ACCENT")
    @js.native
    def CHAR_GRAVE_ACCENT: Double = js.native
    inline def CHAR_GRAVE_ACCENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_GRAVE_ACCENT")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_HASH")
    @js.native
    def CHAR_HASH: Double = js.native
    inline def CHAR_HASH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_HASH")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_HYPHEN_MINUS")
    @js.native
    def CHAR_HYPHEN_MINUS: Double = js.native
    inline def CHAR_HYPHEN_MINUS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_HYPHEN_MINUS")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_LEFT_ANGLE_BRACKET")
    @js.native
    def CHAR_LEFT_ANGLE_BRACKET: Double = js.native
    inline def CHAR_LEFT_ANGLE_BRACKET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_LEFT_ANGLE_BRACKET")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_LEFT_CURLY_BRACE")
    @js.native
    def CHAR_LEFT_CURLY_BRACE: Double = js.native
    inline def CHAR_LEFT_CURLY_BRACE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_LEFT_CURLY_BRACE")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_LEFT_PARENTHESES")
    @js.native
    def CHAR_LEFT_PARENTHESES: Double = js.native
    inline def CHAR_LEFT_PARENTHESES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_LEFT_PARENTHESES")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_LEFT_SQUARE_BRACKET")
    @js.native
    def CHAR_LEFT_SQUARE_BRACKET: Double = js.native
    inline def CHAR_LEFT_SQUARE_BRACKET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_LEFT_SQUARE_BRACKET")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_LINE_FEED")
    @js.native
    def CHAR_LINE_FEED: Double = js.native
    inline def CHAR_LINE_FEED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_LINE_FEED")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_LOWERCASE_A")
    @js.native
    def CHAR_LOWERCASE_A: Double = js.native
    inline def CHAR_LOWERCASE_A_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_LOWERCASE_A")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_LOWERCASE_Z")
    @js.native
    def CHAR_LOWERCASE_Z: Double = js.native
    inline def CHAR_LOWERCASE_Z_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_LOWERCASE_Z")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_NO_BREAK_SPACE")
    @js.native
    def CHAR_NO_BREAK_SPACE: Double = js.native
    inline def CHAR_NO_BREAK_SPACE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_NO_BREAK_SPACE")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_PERCENT")
    @js.native
    def CHAR_PERCENT: Double = js.native
    inline def CHAR_PERCENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_PERCENT")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_PLUS")
    @js.native
    def CHAR_PLUS: Double = js.native
    inline def CHAR_PLUS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_PLUS")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_QUESTION_MARK")
    @js.native
    def CHAR_QUESTION_MARK: Double = js.native
    inline def CHAR_QUESTION_MARK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_QUESTION_MARK")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_RIGHT_ANGLE_BRACKET")
    @js.native
    def CHAR_RIGHT_ANGLE_BRACKET: Double = js.native
    inline def CHAR_RIGHT_ANGLE_BRACKET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_RIGHT_ANGLE_BRACKET")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_RIGHT_CURLY_BRACE")
    @js.native
    def CHAR_RIGHT_CURLY_BRACE: Double = js.native
    inline def CHAR_RIGHT_CURLY_BRACE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_RIGHT_CURLY_BRACE")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_RIGHT_PARENTHESES")
    @js.native
    def CHAR_RIGHT_PARENTHESES: Double = js.native
    inline def CHAR_RIGHT_PARENTHESES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_RIGHT_PARENTHESES")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_RIGHT_SQUARE_BRACKET")
    @js.native
    def CHAR_RIGHT_SQUARE_BRACKET: Double = js.native
    inline def CHAR_RIGHT_SQUARE_BRACKET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_RIGHT_SQUARE_BRACKET")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_SEMICOLON")
    @js.native
    def CHAR_SEMICOLON: Double = js.native
    inline def CHAR_SEMICOLON_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_SEMICOLON")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_SINGLE_QUOTE")
    @js.native
    def CHAR_SINGLE_QUOTE: Double = js.native
    inline def CHAR_SINGLE_QUOTE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_SINGLE_QUOTE")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_SPACE")
    @js.native
    def CHAR_SPACE: Double = js.native
    inline def CHAR_SPACE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_SPACE")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_TAB")
    @js.native
    def CHAR_TAB: Double = js.native
    inline def CHAR_TAB_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_TAB")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_UNDERSCORE")
    @js.native
    def CHAR_UNDERSCORE: Double = js.native
    inline def CHAR_UNDERSCORE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_UNDERSCORE")(x.asInstanceOf[js.Any])
    
    // Alphabet chars.
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_UPPERCASE_A")
    @js.native
    def CHAR_UPPERCASE_A: Double = js.native
    inline def CHAR_UPPERCASE_A_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_UPPERCASE_A")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_UPPERCASE_Z")
    @js.native
    def CHAR_UPPERCASE_Z: Double = js.native
    inline def CHAR_UPPERCASE_Z_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_UPPERCASE_Z")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_VERTICAL_LINE")
    @js.native
    def CHAR_VERTICAL_LINE: Double = js.native
    inline def CHAR_VERTICAL_LINE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_VERTICAL_LINE")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.CHAR_ZERO_WIDTH_NOBREAK_SPACE")
    @js.native
    def CHAR_ZERO_WIDTH_NOBREAK_SPACE: Double = js.native
    inline def CHAR_ZERO_WIDTH_NOBREAK_SPACE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHAR_ZERO_WIDTH_NOBREAK_SPACE")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.MAX_LENGTH")
    @js.native
    def MAX_LENGTH: Double = js.native
    inline def MAX_LENGTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_LENGTH")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.POSIX_REGEX_SOURCE")
    @js.native
    def POSIX_REGEX_SOURCE: /* import warning: importer.ImportType#apply Failed type conversion: typeof POSIX_REGEX_SOURCE */ js.Any = js.native
    inline def POSIX_REGEX_SOURCE_=(
      x: /* import warning: importer.ImportType#apply Failed type conversion: typeof POSIX_REGEX_SOURCE */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSIX_REGEX_SOURCE")(x.asInstanceOf[js.Any])
    
    // regular expressions
    @JSImport("picomatch/lib/picomatch", "constants.REGEX_BACKSLASH")
    @js.native
    def REGEX_BACKSLASH: js.RegExp = js.native
    inline def REGEX_BACKSLASH_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REGEX_BACKSLASH")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.REGEX_NON_SPECIAL_CHARS")
    @js.native
    def REGEX_NON_SPECIAL_CHARS: js.RegExp = js.native
    inline def REGEX_NON_SPECIAL_CHARS_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REGEX_NON_SPECIAL_CHARS")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.REGEX_REMOVE_BACKSLASH")
    @js.native
    def REGEX_REMOVE_BACKSLASH: js.RegExp = js.native
    inline def REGEX_REMOVE_BACKSLASH_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REGEX_REMOVE_BACKSLASH")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.REGEX_SPECIAL_CHARS")
    @js.native
    def REGEX_SPECIAL_CHARS: js.RegExp = js.native
    inline def REGEX_SPECIAL_CHARS_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REGEX_SPECIAL_CHARS")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.REGEX_SPECIAL_CHARS_BACKREF")
    @js.native
    def REGEX_SPECIAL_CHARS_BACKREF: js.RegExp = js.native
    inline def REGEX_SPECIAL_CHARS_BACKREF_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REGEX_SPECIAL_CHARS_BACKREF")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.REGEX_SPECIAL_CHARS_GLOBAL")
    @js.native
    def REGEX_SPECIAL_CHARS_GLOBAL: js.RegExp = js.native
    inline def REGEX_SPECIAL_CHARS_GLOBAL_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REGEX_SPECIAL_CHARS_GLOBAL")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.REPLACEMENTS")
    @js.native
    def REPLACEMENTS: _empty = js.native
    inline def REPLACEMENTS_=(x: _empty): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REPLACEMENTS")(x.asInstanceOf[js.Any])
    
    @JSImport("picomatch/lib/picomatch", "constants.SEP")
    @js.native
    def SEP: String = js.native
    inline def SEP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEP")(x.asInstanceOf[js.Any])
    
    inline def extGlobChars(chars: STAR): Record[String, Close] = ^.asInstanceOf[js.Dynamic].applyDynamic("extGlobChars")(chars.asInstanceOf[js.Any]).asInstanceOf[Record[String, Close]]
    
    inline def globChars[T /* <: Boolean */](win32: T): /* import warning: importer.ImportType#apply Failed type conversion: typeof POSIX_CHARS */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("globChars")(win32.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: typeof POSIX_CHARS */ js.Any]
  }
  
  inline def isMatch(str: String, patterns: Glob): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(str.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMatch(str: String, patterns: Glob, options: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(str.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMatch(str: js.Array[String], patterns: Glob): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(str.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMatch(str: js.Array[String], patterns: Glob, options: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatch")(str.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def makeRe(input: String): ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(input.asInstanceOf[js.Any]).asInstanceOf[ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ]]
  inline def makeRe(input: String, options: Unit, returnOutput: Boolean): ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnOutput.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ]]
  inline def makeRe(input: String, options: Unit, returnOutput: Boolean, returnState: Boolean): ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnOutput.asInstanceOf[js.Any], returnState.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ]]
  inline def makeRe(input: String, options: Unit, returnOutput: Unit, returnState: Boolean): ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnOutput.asInstanceOf[js.Any], returnState.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ]]
  inline def makeRe(input: String, options: PicomatchOptions): ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ]]
  inline def makeRe(input: String, options: PicomatchOptions, returnOutput: Boolean): ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnOutput.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ]]
  inline def makeRe(input: String, options: PicomatchOptions, returnOutput: Boolean, returnState: Boolean): ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnOutput.asInstanceOf[js.Any], returnState.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ]]
  inline def makeRe(input: String, options: PicomatchOptions, returnOutput: Unit, returnState: Boolean): ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], returnOutput.asInstanceOf[js.Any], returnState.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    js.Function4[
      /* state */ ParseState, 
      /* options */ js.UndefOr[PicomatchOptions], 
      /* returnOutput */ js.UndefOr[Boolean], 
      /* returnState */ js.UndefOr[Boolean], 
      js.RegExp
    ]
  ]]
  
  inline def matchBase(input: String, glob: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchBase")(input.asInstanceOf[js.Any], glob.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchBase(input: String, glob: String, options: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchBase")(input.asInstanceOf[js.Any], glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchBase(input: String, glob: String, options: js.Object, posix: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchBase")(input.asInstanceOf[js.Any], glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any], posix.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchBase(input: String, glob: String, options: Unit, posix: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchBase")(input.asInstanceOf[js.Any], glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any], posix.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchBase(input: String, glob: js.RegExp): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchBase")(input.asInstanceOf[js.Any], glob.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchBase(input: String, glob: js.RegExp, options: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchBase")(input.asInstanceOf[js.Any], glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchBase(input: String, glob: js.RegExp, options: js.Object, posix: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchBase")(input.asInstanceOf[js.Any], glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any], posix.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matchBase(input: String, glob: js.RegExp, options: Unit, posix: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchBase")(input.asInstanceOf[js.Any], glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any], posix.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parse(pattern: String): ParseState = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(pattern.asInstanceOf[js.Any]).asInstanceOf[ParseState]
  inline def parse(pattern: String, options: MaxLength): ParseState = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParseState]
  inline def parse(pattern: js.Array[String]): js.Array[ParseState] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[ParseState]]
  inline def parse(pattern: js.Array[String], options: MaxLength): js.Array[ParseState] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[ParseState]]
  inline def parse(pattern: Glob): ParseState | js.Array[ParseState] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(pattern.asInstanceOf[js.Any]).asInstanceOf[ParseState | js.Array[ParseState]]
  inline def parse(pattern: Glob, options: MaxLength): ParseState | js.Array[ParseState] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParseState | js.Array[ParseState]]
  
  @JSImport("picomatch/lib/picomatch", "scan")
  @js.native
  val scan: js.Function2[/* input */ String, /* options */ js.UndefOr[Options], State] = js.native
  
  inline def test(input: String, regex: js.RegExp): IsMatch = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(input.asInstanceOf[js.Any], regex.asInstanceOf[js.Any])).asInstanceOf[IsMatch]
  inline def test(input: String, regex: js.RegExp, options: Unit, test: js.Object): IsMatch = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(input.asInstanceOf[js.Any], regex.asInstanceOf[js.Any], options.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[IsMatch]
  inline def test(input: String, regex: js.RegExp, options: PicomatchOptions): IsMatch = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(input.asInstanceOf[js.Any], regex.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IsMatch]
  inline def test(input: String, regex: js.RegExp, options: PicomatchOptions, test: js.Object): IsMatch = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(input.asInstanceOf[js.Any], regex.asInstanceOf[js.Any], options.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[IsMatch]
  
  inline def toRegex(source: String): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("toRegex")(source.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  inline def toRegex(source: String, options: ToRegexOptions): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("toRegex")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  inline def toRegex(source: js.RegExp): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("toRegex")(source.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  inline def toRegex(source: js.RegExp, options: ToRegexOptions): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("toRegex")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  
  type Glob = String | js.Array[String]
  
  type Matcher = js.Function1[/* test */ String, Boolean]
  
  @js.native
  trait MatcherWithState extends Matcher {
    
    var state: ParseState = js.native
  }
  
  trait PicomatchOptions extends StObject {
    
    /**
      * If set, then patterns without slashes will be matched against the basename of the path if it contains slashes.
      * For example, `a?b` would match the path `/xyz/123/acb`, but not `/xyz/acb/123`.
      */
    var basename: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Follow bash matching rules more strictly - disallows backslashes as escape characters, and treats single stars as globstars (`**`).
      */
    var bash: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Return regex matches in supporting methods.
      */
    var capture: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allows glob to match any part of the given string(s).
      */
    var contains: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Current working directory. Used by `picomatch.split()`
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * Debug regular expressions when an error is thrown.
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable dotfile matching. By default, dotfiles are ignored unless a `.` is explicitly defined in the pattern, or `options.dot` is true
      */
    var dot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom function for expanding ranges in brace patterns, such as `{a..z}`.
      * The function receives the range values as two arguments, and it must return a string to be used in the generated regex.
      * It's recommended that returned strings be wrapped in parentheses.
      */
    var expandRange: js.UndefOr[js.Function2[/* a */ String, /* b */ String, String]] = js.undefined
    
    /**
      * Throws an error if no matches are found. Based on the bash option of the same name.
      */
    var failglob: js.UndefOr[Boolean] = js.undefined
    
    /**
      * To speed up processing, full parsing is skipped for a handful common glob patterns. Disable this behavior by setting this option to `false`.
      */
    var fastpaths: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Regex flags to use in the generated regex. If defined, the `nocase` option will be overridden.
      */
    var flags: js.UndefOr[String] = js.undefined
    
    /**
      * Custom function for formatting the returned string. This is useful for removing leading slashes, converting Windows paths to Posix paths, etc.
      */
    var format: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
    
    /**
      * One or more glob patterns for excluding strings that should not be matched from the result.
      */
    var ignore: js.UndefOr[Glob] = js.undefined
    
    /**
      * Retain quotes in the generated regex, since quotes may also be used as an alternative to backslashes.
      */
    var keepQuotes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When `true`, brackets in the glob pattern will be escaped so that only literal brackets will be matched.
      */
    var literalBrackets: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Support regex positive and negative lookbehinds. Note that you must be using Node 8.1.10 or higher to enable regex lookbehinds.
      */
    var lookbehinds: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Alias for `basename`
      */
    var matchBase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Limit the max length of the input string. An error is thrown if the input string is longer than this value.
      */
    var maxLength: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable brace matching, so that `{a,b}` and `{1..3}` would be treated as literal characters.
      */
    var nobrace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable brace matching, so that `{a,b}` and `{1..3}` would be treated as literal characters.
      */
    var nobracket: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Make matching case-insensitive. Equivalent to the regex `i` flag. Note that this option is overridden by the `flags` option.
      */
    var nocase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated use `nounique` instead.
      * This option will be removed in a future major release. By default duplicates are removed.
      * Disable uniquification by setting this option to false.
      */
    var nodupes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Alias for `noextglob`
      */
    var noext: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable support for matching with extglobs (like `+(a\|b)`)
      */
    var noextglob: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable support for matching nested directories with globstars (`**`)
      */
    var noglobstar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable support for negating with leading `!`
      */
    var nonegate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable support for regex quantifiers (like `a{1,2}`) and treat them as brace patterns to be expanded.
      */
    var noquantifiers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function to be called on ignored items.
      */
    var onIgnore: js.UndefOr[js.Function1[/* result */ Result, Unit]] = js.undefined
    
    /**
      * Function to be called on matched items.
      */
    var onMatch: js.UndefOr[js.Function1[/* result */ Result, Unit]] = js.undefined
    
    /**
      * Function to be called on all items, regardless of whether or not they are matched or ignored.
      */
    var onResult: js.UndefOr[js.Function1[/* result */ Result, Unit]] = js.undefined
    
    /**
      * Support POSIX character classes ("posix brackets").
      */
    var posix: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Convert all slashes in file paths to forward slashes. This does not convert slashes in the glob pattern itself
      */
    var posixSlashes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Convert all slashes in file paths to forward slashes. This does not convert slashes in the glob pattern itself
      */
    var prepend: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use regular expression rules for `+` (instead of matching literal `+`), and for stars that follow closing parentheses or brackets (as in `)*` and `]*`).
      */
    var regex: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Throw an error if brackets, braces, or parens are imbalanced.
      */
    var strictBrackets: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When true, picomatch won't match trailing slashes with single stars.
      */
    var strictSlashes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Remove backslashes preceding escaped characters in the glob pattern. By default, backslashes are retained.
      */
    var unescape: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Alias for `posixSlashes`, for backwards compatibility.
      */
    var unixify: js.UndefOr[Boolean] = js.undefined
  }
  object PicomatchOptions {
    
    inline def apply(): PicomatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PicomatchOptions]
    }
    
    extension [Self <: PicomatchOptions](x: Self) {
      
      inline def setBasename(value: Boolean): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setBash(value: Boolean): Self = StObject.set(x, "bash", value.asInstanceOf[js.Any])
      
      inline def setBashUndefined: Self = StObject.set(x, "bash", js.undefined)
      
      inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setContains(value: Boolean): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setExpandRange(value: (/* a */ String, /* b */ String) => String): Self = StObject.set(x, "expandRange", js.Any.fromFunction2(value))
      
      inline def setExpandRangeUndefined: Self = StObject.set(x, "expandRange", js.undefined)
      
      inline def setFailglob(value: Boolean): Self = StObject.set(x, "failglob", value.asInstanceOf[js.Any])
      
      inline def setFailglobUndefined: Self = StObject.set(x, "failglob", js.undefined)
      
      inline def setFastpaths(value: Boolean): Self = StObject.set(x, "fastpaths", value.asInstanceOf[js.Any])
      
      inline def setFastpathsUndefined: Self = StObject.set(x, "fastpaths", js.undefined)
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setFormat(value: /* str */ String => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIgnore(value: Glob): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setKeepQuotes(value: Boolean): Self = StObject.set(x, "keepQuotes", value.asInstanceOf[js.Any])
      
      inline def setKeepQuotesUndefined: Self = StObject.set(x, "keepQuotes", js.undefined)
      
      inline def setLiteralBrackets(value: Boolean): Self = StObject.set(x, "literalBrackets", value.asInstanceOf[js.Any])
      
      inline def setLiteralBracketsUndefined: Self = StObject.set(x, "literalBrackets", js.undefined)
      
      inline def setLookbehinds(value: Boolean): Self = StObject.set(x, "lookbehinds", value.asInstanceOf[js.Any])
      
      inline def setLookbehindsUndefined: Self = StObject.set(x, "lookbehinds", js.undefined)
      
      inline def setMatchBase(value: Boolean): Self = StObject.set(x, "matchBase", value.asInstanceOf[js.Any])
      
      inline def setMatchBaseUndefined: Self = StObject.set(x, "matchBase", js.undefined)
      
      inline def setMaxLength(value: Boolean): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setNobrace(value: Boolean): Self = StObject.set(x, "nobrace", value.asInstanceOf[js.Any])
      
      inline def setNobraceUndefined: Self = StObject.set(x, "nobrace", js.undefined)
      
      inline def setNobracket(value: Boolean): Self = StObject.set(x, "nobracket", value.asInstanceOf[js.Any])
      
      inline def setNobracketUndefined: Self = StObject.set(x, "nobracket", js.undefined)
      
      inline def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      inline def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
      
      inline def setNodupes(value: Boolean): Self = StObject.set(x, "nodupes", value.asInstanceOf[js.Any])
      
      inline def setNodupesUndefined: Self = StObject.set(x, "nodupes", js.undefined)
      
      inline def setNoext(value: Boolean): Self = StObject.set(x, "noext", value.asInstanceOf[js.Any])
      
      inline def setNoextUndefined: Self = StObject.set(x, "noext", js.undefined)
      
      inline def setNoextglob(value: Boolean): Self = StObject.set(x, "noextglob", value.asInstanceOf[js.Any])
      
      inline def setNoextglobUndefined: Self = StObject.set(x, "noextglob", js.undefined)
      
      inline def setNoglobstar(value: Boolean): Self = StObject.set(x, "noglobstar", value.asInstanceOf[js.Any])
      
      inline def setNoglobstarUndefined: Self = StObject.set(x, "noglobstar", js.undefined)
      
      inline def setNonegate(value: Boolean): Self = StObject.set(x, "nonegate", value.asInstanceOf[js.Any])
      
      inline def setNonegateUndefined: Self = StObject.set(x, "nonegate", js.undefined)
      
      inline def setNoquantifiers(value: Boolean): Self = StObject.set(x, "noquantifiers", value.asInstanceOf[js.Any])
      
      inline def setNoquantifiersUndefined: Self = StObject.set(x, "noquantifiers", js.undefined)
      
      inline def setOnIgnore(value: /* result */ Result => Unit): Self = StObject.set(x, "onIgnore", js.Any.fromFunction1(value))
      
      inline def setOnIgnoreUndefined: Self = StObject.set(x, "onIgnore", js.undefined)
      
      inline def setOnMatch(value: /* result */ Result => Unit): Self = StObject.set(x, "onMatch", js.Any.fromFunction1(value))
      
      inline def setOnMatchUndefined: Self = StObject.set(x, "onMatch", js.undefined)
      
      inline def setOnResult(value: /* result */ Result => Unit): Self = StObject.set(x, "onResult", js.Any.fromFunction1(value))
      
      inline def setOnResultUndefined: Self = StObject.set(x, "onResult", js.undefined)
      
      inline def setPosix(value: Boolean): Self = StObject.set(x, "posix", value.asInstanceOf[js.Any])
      
      inline def setPosixSlashes(value: Boolean): Self = StObject.set(x, "posixSlashes", value.asInstanceOf[js.Any])
      
      inline def setPosixSlashesUndefined: Self = StObject.set(x, "posixSlashes", js.undefined)
      
      inline def setPosixUndefined: Self = StObject.set(x, "posix", js.undefined)
      
      inline def setPrepend(value: Boolean): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
      
      inline def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
      
      inline def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
      
      inline def setStrictBrackets(value: Boolean): Self = StObject.set(x, "strictBrackets", value.asInstanceOf[js.Any])
      
      inline def setStrictBracketsUndefined: Self = StObject.set(x, "strictBrackets", js.undefined)
      
      inline def setStrictSlashes(value: Boolean): Self = StObject.set(x, "strictSlashes", value.asInstanceOf[js.Any])
      
      inline def setStrictSlashesUndefined: Self = StObject.set(x, "strictSlashes", js.undefined)
      
      inline def setUnescape(value: Boolean): Self = StObject.set(x, "unescape", value.asInstanceOf[js.Any])
      
      inline def setUnescapeUndefined: Self = StObject.set(x, "unescape", js.undefined)
      
      inline def setUnixify(value: Boolean): Self = StObject.set(x, "unixify", value.asInstanceOf[js.Any])
      
      inline def setUnixifyUndefined: Self = StObject.set(x, "unixify", js.undefined)
    }
  }
  
  trait Result extends StObject {
    
    var glob: String
    
    var input: String
    
    var isMatch: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.picomatch/lib/picomatch.PicomatchOptions | undefined, test : {} | undefined): picomatch.anon.IsMatch>['isMatch'] */ js.Any
    
    var `match`: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.picomatch/lib/picomatch.PicomatchOptions | undefined, test : {} | undefined): picomatch.anon.IsMatch>['match'] */ js.Any
    
    var output: String
    
    var posix: Boolean
    
    var regex: js.RegExp
    
    var state: Any
  }
  object Result {
    
    inline def apply(
      glob: String,
      input: String,
      isMatch: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.picomatch/lib/picomatch.PicomatchOptions | undefined, test : {} | undefined): picomatch.anon.IsMatch>['isMatch'] */ js.Any,
      `match`: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.picomatch/lib/picomatch.PicomatchOptions | undefined, test : {} | undefined): picomatch.anon.IsMatch>['match'] */ js.Any,
      output: String,
      posix: Boolean,
      regex: js.RegExp,
      state: Any
    ): Result = {
      val __obj = js.Dynamic.literal(glob = glob.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], isMatch = isMatch.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], posix = posix.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setGlob(value: String): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setIsMatch(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.picomatch/lib/picomatch.PicomatchOptions | undefined, test : {} | undefined): picomatch.anon.IsMatch>['isMatch'] */ js.Any
      ): Self = StObject.set(x, "isMatch", value.asInstanceOf[js.Any])
      
      inline def setMatch(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.picomatch/lib/picomatch.PicomatchOptions | undefined, test : {} | undefined): picomatch.anon.IsMatch>['match'] */ js.Any
      ): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setPosix(value: Boolean): Self = StObject.set(x, "posix", value.asInstanceOf[js.Any])
      
      inline def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<picomatch.picomatch/lib/picomatch.PicomatchOptions, 'flags' | 'nocase' | 'debug'> */
  trait ToRegexOptions extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var flags: js.UndefOr[String] = js.undefined
    
    var nocase: js.UndefOr[Boolean] = js.undefined
  }
  object ToRegexOptions {
    
    inline def apply(): ToRegexOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToRegexOptions]
    }
    
    extension [Self <: ToRegexOptions](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      inline def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
    }
  }
}
