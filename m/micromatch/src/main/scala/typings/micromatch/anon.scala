package typings.micromatch

import typings.micromatch.micromatchBooleans.`true`
import typings.micromatch.mod.Item
import typings.micromatch.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined {  parts :true} & micromatch.micromatch.ScanOptions */
  trait partstrueScanOptions extends StObject {
    
    /**
      * Allow glob patterns without slashes to match a file path based on its basename. Same behavior as [minimatch](https://github.com/isaacs/minimatch) option `matchBase`.
      *
      * @default false
      *
      * @example
      * ```js
      * mm(['a/b.js', 'a/c.md'], '*.js');
      * //=> []
      *
      * mm(['a/b.js', 'a/c.md'], '*.js', {matchBase: true});
      * //=> ['a/b.js']
      * ```
      */
    var basename: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enabled by default, this option enforces bash-like behavior with stars immediately following a bracket expression.
      * Bash bracket expressions are similar to regex character classes, but unlike regex, a star following a bracket expression **does not repeat the bracketed characters**.
      * Instead, the star is treated the same as an other star.
      *
      * @default true
      *
      * @example
      * ```js
      * var files = ['abc', 'ajz'];
      * console.log(mm(files, '[a-c]*'));
      * //=> ['abc', 'ajz']
      *
      * console.log(mm(files, '[a-c]*', {bash: false}));
      * ```
      */
    var bash: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Return regex matches in supporting methods.
      *
      * @default undefined
      */
    var capture: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allows glob to match any part of the given string(s).
      *
      * @default undefined
      */
    var contains: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Current working directory. Used by `picomatch.split()`
      *
      * @default process.cwd()
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * Debug regular expressions when an error is thrown.
      *
      * @default undefined
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Match dotfiles. Otherwise dotfiles are ignored unless a `.` is explicitly defined in the pattern.
      *
      * @default false
      */
    var dot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom function for expanding ranges in brace patterns, such as `{a..z}`.
      * The function receives the range values as two arguments, and it must return a string to be used in the generated regex.
      * It's recommended that returned strings be wrapped in parentheses. This option is overridden by the expandBrace option.
      *
      * @default undefined
      */
    var expandRange: js.UndefOr[
        js.Function3[/* left */ String, /* right */ String, /* options */ Options, String]
      ] = js.undefined
    
    /**
      * Similar to the `--failglob` behavior in Bash, throws an error when no matches are found.
      *
      * @default false
      */
    var failglob: js.UndefOr[Boolean] = js.undefined
    
    /**
      * To speed up processing, full parsing is skipped for a handful common glob patterns. Disable this behavior by setting this option to false.
      *
      * @default true
      */
    var fastpaths: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Regex flags to use in the generated regex. If defined, the `nocase` option will be overridden.
      *
      * @default undefined
      */
    var flags: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom function for formatting the returned string. This is useful for removing leading slashes, converting Windows paths to Posix paths, etc.
      *
      * @default undefined
      */
    var format: js.UndefOr[js.Function1[/* returnedString */ String, String]] = js.undefined
    
    /**
      * One or more glob patterns for excluding strings that should not be matched from the result.
      *
      * @default undefined
      */
    var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Retain quotes in the generated regex, since quotes may also be used as an alternative to backslashes.
      *
      * @default false
      */
    var keepQuotes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When `true`, brackets in the glob pattern will be escaped so that only literal brackets will be matched.
      *
      * @default undefined
      */
    var literalBrackets: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Support regex positive and negative lookbehinds. Note that you must be using Node 8.1.10 or higher to enable regex lookbehinds.
      *
      * @default true
      */
    var lookbehinds: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Alias for `basename`.
      *
      * @default false
      */
    var matchBase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Limit the max length of the input string. An error is thrown if the input string is longer than this value.
      *
      * @default 65536
      */
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Disable brace matching, so that `{a,b}` and `{1..3}` would be treated as literal characters.
      *
      * @default false
      */
    var nobrace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable matching with regex brackets.
      *
      * @default undefined
      */
    var nobracket: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Perform case-insensitive matching. Equivalent to the regex `i` flag.
      * Note that this option is ignored when the `flags` option is defined.
      *
      * @default false
      */
    var nocase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Alias for `noextglob`
      *
      * @default false
      */
    var noext: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable support for matching with extglobs (like `+(a|b)`)
      *
      * @default false
      */
    var noextglob: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable matching with globstars (`**`).
      *
      * @default undefined
      */
    var noglobstar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disallow negation (`!`) patterns, and treat leading `!` as a literal character to match.
      *
      * @default undefined
      */
    var nonegate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable support for regex quantifiers (like `a{1,2}`) and treat them as brace patterns to be expanded.
      *
      * @default false
      */
    var noquantifiers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function to be called on ignored items.
      *
      * @default undefined
      */
    var onIgnore: js.UndefOr[js.Function1[/* item */ Item, Unit]] = js.undefined
    
    /**
      * Function to be called on matched items.
      *
      * @default undefined
      */
    var onMatch: js.UndefOr[js.Function1[/* item */ Item, Unit]] = js.undefined
    
    /**
      * Function to be called on all items, regardless of whether or not they are matched or ignored.
      *
      * @default undefined
      */
    var onResult: js.UndefOr[js.Function1[/* item */ Item, Unit]] = js.undefined
    
    /**
      * When `true`, the returned object will include an array of strings representing each path "segment" in the scanned glob pattern.
      * This is automatically enabled when `options.tokens` is `true`.
      *
      * @default false
      */
    var parts: `true`
    
    /**
      * Support POSIX character classes ("posix brackets").
      *
      * @default false
      */
    var posix: js.UndefOr[Boolean] = js.undefined
    
    /**
      * String to prepend to the generated regex used for matching.
      *
      * @default undefined
      */
    var prepend: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use regular expression rules for `+` (instead of matching literal `+`), and for stars that follow closing parentheses or brackets (as in `)*` and `]*`).
      *
      * @default false
      */
    var regex: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Throw an error if brackets, braces, or parens are imbalanced.
      *
      * @default undefined
      */
    var strictBrackets: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When true, picomatch won't match trailing slashes with single stars.
      *
      * @default undefined
      */
    var strictSlashes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When `true`, the returned object will include an array of `tokens` (objects), representing each path "segment" in the scanned glob pattern.
      *
      * @default false
      */
    var tokens: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Remove backslashes from returned matches.
      *
      * @default undefined
      *
      * @example
      * In this example we want to match a literal `*`:
      *
      * ```js
      * mm.match(['abc', 'a\\*c'], 'a\\*c');
      * //=> ['a\\*c']
      *
      * mm.match(['abc', 'a\\*c'], 'a\\*c', {unescape: true});
      * //=> ['a*c']
      * ```
      */
    var unescape: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Convert all slashes in file paths to forward slashes. This does not convert slashes in the glob pattern itself
      *
      * @default undefined
      */
    var windows: js.UndefOr[Boolean] = js.undefined
  }
  object partstrueScanOptions {
    
    inline def apply(): partstrueScanOptions = {
      val __obj = js.Dynamic.literal(parts = true)
      __obj.asInstanceOf[partstrueScanOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: partstrueScanOptions] (val x: Self) extends AnyVal {
      
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
      
      inline def setExpandRange(value: (/* left */ String, /* right */ String, /* options */ Options) => String): Self = StObject.set(x, "expandRange", js.Any.fromFunction3(value))
      
      inline def setExpandRangeUndefined: Self = StObject.set(x, "expandRange", js.undefined)
      
      inline def setFailglob(value: Boolean): Self = StObject.set(x, "failglob", value.asInstanceOf[js.Any])
      
      inline def setFailglobUndefined: Self = StObject.set(x, "failglob", js.undefined)
      
      inline def setFastpaths(value: Boolean): Self = StObject.set(x, "fastpaths", value.asInstanceOf[js.Any])
      
      inline def setFastpathsUndefined: Self = StObject.set(x, "fastpaths", js.undefined)
      
      inline def setFlags(value: Boolean): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setFormat(value: /* returnedString */ String => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIgnore(value: String | js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
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
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setNobrace(value: Boolean): Self = StObject.set(x, "nobrace", value.asInstanceOf[js.Any])
      
      inline def setNobraceUndefined: Self = StObject.set(x, "nobrace", js.undefined)
      
      inline def setNobracket(value: Boolean): Self = StObject.set(x, "nobracket", value.asInstanceOf[js.Any])
      
      inline def setNobracketUndefined: Self = StObject.set(x, "nobracket", js.undefined)
      
      inline def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      inline def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
      
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
      
      inline def setOnIgnore(value: /* item */ Item => Unit): Self = StObject.set(x, "onIgnore", js.Any.fromFunction1(value))
      
      inline def setOnIgnoreUndefined: Self = StObject.set(x, "onIgnore", js.undefined)
      
      inline def setOnMatch(value: /* item */ Item => Unit): Self = StObject.set(x, "onMatch", js.Any.fromFunction1(value))
      
      inline def setOnMatchUndefined: Self = StObject.set(x, "onMatch", js.undefined)
      
      inline def setOnResult(value: /* item */ Item => Unit): Self = StObject.set(x, "onResult", js.Any.fromFunction1(value))
      
      inline def setOnResultUndefined: Self = StObject.set(x, "onResult", js.undefined)
      
      inline def setParts(value: `true`): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setPosix(value: Boolean): Self = StObject.set(x, "posix", value.asInstanceOf[js.Any])
      
      inline def setPosixUndefined: Self = StObject.set(x, "posix", js.undefined)
      
      inline def setPrepend(value: Boolean): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
      
      inline def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
      
      inline def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
      
      inline def setStrictBrackets(value: Boolean): Self = StObject.set(x, "strictBrackets", value.asInstanceOf[js.Any])
      
      inline def setStrictBracketsUndefined: Self = StObject.set(x, "strictBrackets", js.undefined)
      
      inline def setStrictSlashes(value: Boolean): Self = StObject.set(x, "strictSlashes", value.asInstanceOf[js.Any])
      
      inline def setStrictSlashesUndefined: Self = StObject.set(x, "strictSlashes", js.undefined)
      
      inline def setTokens(value: Boolean): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
      
      inline def setUnescape(value: Boolean): Self = StObject.set(x, "unescape", value.asInstanceOf[js.Any])
      
      inline def setUnescapeUndefined: Self = StObject.set(x, "unescape", js.undefined)
      
      inline def setWindows(value: Boolean): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
      
      inline def setWindowsUndefined: Self = StObject.set(x, "windows", js.undefined)
    }
  }
  
  /* Inlined {  tokens :true} & micromatch.micromatch.ScanOptions */
  trait tokenstrueScanOptions extends StObject {
    
    /**
      * Allow glob patterns without slashes to match a file path based on its basename. Same behavior as [minimatch](https://github.com/isaacs/minimatch) option `matchBase`.
      *
      * @default false
      *
      * @example
      * ```js
      * mm(['a/b.js', 'a/c.md'], '*.js');
      * //=> []
      *
      * mm(['a/b.js', 'a/c.md'], '*.js', {matchBase: true});
      * //=> ['a/b.js']
      * ```
      */
    var basename: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enabled by default, this option enforces bash-like behavior with stars immediately following a bracket expression.
      * Bash bracket expressions are similar to regex character classes, but unlike regex, a star following a bracket expression **does not repeat the bracketed characters**.
      * Instead, the star is treated the same as an other star.
      *
      * @default true
      *
      * @example
      * ```js
      * var files = ['abc', 'ajz'];
      * console.log(mm(files, '[a-c]*'));
      * //=> ['abc', 'ajz']
      *
      * console.log(mm(files, '[a-c]*', {bash: false}));
      * ```
      */
    var bash: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Return regex matches in supporting methods.
      *
      * @default undefined
      */
    var capture: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allows glob to match any part of the given string(s).
      *
      * @default undefined
      */
    var contains: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Current working directory. Used by `picomatch.split()`
      *
      * @default process.cwd()
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * Debug regular expressions when an error is thrown.
      *
      * @default undefined
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Match dotfiles. Otherwise dotfiles are ignored unless a `.` is explicitly defined in the pattern.
      *
      * @default false
      */
    var dot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom function for expanding ranges in brace patterns, such as `{a..z}`.
      * The function receives the range values as two arguments, and it must return a string to be used in the generated regex.
      * It's recommended that returned strings be wrapped in parentheses. This option is overridden by the expandBrace option.
      *
      * @default undefined
      */
    var expandRange: js.UndefOr[
        js.Function3[/* left */ String, /* right */ String, /* options */ Options, String]
      ] = js.undefined
    
    /**
      * Similar to the `--failglob` behavior in Bash, throws an error when no matches are found.
      *
      * @default false
      */
    var failglob: js.UndefOr[Boolean] = js.undefined
    
    /**
      * To speed up processing, full parsing is skipped for a handful common glob patterns. Disable this behavior by setting this option to false.
      *
      * @default true
      */
    var fastpaths: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Regex flags to use in the generated regex. If defined, the `nocase` option will be overridden.
      *
      * @default undefined
      */
    var flags: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom function for formatting the returned string. This is useful for removing leading slashes, converting Windows paths to Posix paths, etc.
      *
      * @default undefined
      */
    var format: js.UndefOr[js.Function1[/* returnedString */ String, String]] = js.undefined
    
    /**
      * One or more glob patterns for excluding strings that should not be matched from the result.
      *
      * @default undefined
      */
    var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Retain quotes in the generated regex, since quotes may also be used as an alternative to backslashes.
      *
      * @default false
      */
    var keepQuotes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When `true`, brackets in the glob pattern will be escaped so that only literal brackets will be matched.
      *
      * @default undefined
      */
    var literalBrackets: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Support regex positive and negative lookbehinds. Note that you must be using Node 8.1.10 or higher to enable regex lookbehinds.
      *
      * @default true
      */
    var lookbehinds: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Alias for `basename`.
      *
      * @default false
      */
    var matchBase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Limit the max length of the input string. An error is thrown if the input string is longer than this value.
      *
      * @default 65536
      */
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Disable brace matching, so that `{a,b}` and `{1..3}` would be treated as literal characters.
      *
      * @default false
      */
    var nobrace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable matching with regex brackets.
      *
      * @default undefined
      */
    var nobracket: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Perform case-insensitive matching. Equivalent to the regex `i` flag.
      * Note that this option is ignored when the `flags` option is defined.
      *
      * @default false
      */
    var nocase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Alias for `noextglob`
      *
      * @default false
      */
    var noext: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable support for matching with extglobs (like `+(a|b)`)
      *
      * @default false
      */
    var noextglob: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable matching with globstars (`**`).
      *
      * @default undefined
      */
    var noglobstar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disallow negation (`!`) patterns, and treat leading `!` as a literal character to match.
      *
      * @default undefined
      */
    var nonegate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable support for regex quantifiers (like `a{1,2}`) and treat them as brace patterns to be expanded.
      *
      * @default false
      */
    var noquantifiers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function to be called on ignored items.
      *
      * @default undefined
      */
    var onIgnore: js.UndefOr[js.Function1[/* item */ Item, Unit]] = js.undefined
    
    /**
      * Function to be called on matched items.
      *
      * @default undefined
      */
    var onMatch: js.UndefOr[js.Function1[/* item */ Item, Unit]] = js.undefined
    
    /**
      * Function to be called on all items, regardless of whether or not they are matched or ignored.
      *
      * @default undefined
      */
    var onResult: js.UndefOr[js.Function1[/* item */ Item, Unit]] = js.undefined
    
    /**
      * When `true`, the returned object will include an array of strings representing each path "segment" in the scanned glob pattern.
      * This is automatically enabled when `options.tokens` is `true`.
      *
      * @default false
      */
    var parts: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Support POSIX character classes ("posix brackets").
      *
      * @default false
      */
    var posix: js.UndefOr[Boolean] = js.undefined
    
    /**
      * String to prepend to the generated regex used for matching.
      *
      * @default undefined
      */
    var prepend: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use regular expression rules for `+` (instead of matching literal `+`), and for stars that follow closing parentheses or brackets (as in `)*` and `]*`).
      *
      * @default false
      */
    var regex: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Throw an error if brackets, braces, or parens are imbalanced.
      *
      * @default undefined
      */
    var strictBrackets: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When true, picomatch won't match trailing slashes with single stars.
      *
      * @default undefined
      */
    var strictSlashes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When `true`, the returned object will include an array of `tokens` (objects), representing each path "segment" in the scanned glob pattern.
      *
      * @default false
      */
    var tokens: `true`
    
    /**
      * Remove backslashes from returned matches.
      *
      * @default undefined
      *
      * @example
      * In this example we want to match a literal `*`:
      *
      * ```js
      * mm.match(['abc', 'a\\*c'], 'a\\*c');
      * //=> ['a\\*c']
      *
      * mm.match(['abc', 'a\\*c'], 'a\\*c', {unescape: true});
      * //=> ['a*c']
      * ```
      */
    var unescape: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Convert all slashes in file paths to forward slashes. This does not convert slashes in the glob pattern itself
      *
      * @default undefined
      */
    var windows: js.UndefOr[Boolean] = js.undefined
  }
  object tokenstrueScanOptions {
    
    inline def apply(): tokenstrueScanOptions = {
      val __obj = js.Dynamic.literal(tokens = true)
      __obj.asInstanceOf[tokenstrueScanOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: tokenstrueScanOptions] (val x: Self) extends AnyVal {
      
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
      
      inline def setExpandRange(value: (/* left */ String, /* right */ String, /* options */ Options) => String): Self = StObject.set(x, "expandRange", js.Any.fromFunction3(value))
      
      inline def setExpandRangeUndefined: Self = StObject.set(x, "expandRange", js.undefined)
      
      inline def setFailglob(value: Boolean): Self = StObject.set(x, "failglob", value.asInstanceOf[js.Any])
      
      inline def setFailglobUndefined: Self = StObject.set(x, "failglob", js.undefined)
      
      inline def setFastpaths(value: Boolean): Self = StObject.set(x, "fastpaths", value.asInstanceOf[js.Any])
      
      inline def setFastpathsUndefined: Self = StObject.set(x, "fastpaths", js.undefined)
      
      inline def setFlags(value: Boolean): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setFormat(value: /* returnedString */ String => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIgnore(value: String | js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
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
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setNobrace(value: Boolean): Self = StObject.set(x, "nobrace", value.asInstanceOf[js.Any])
      
      inline def setNobraceUndefined: Self = StObject.set(x, "nobrace", js.undefined)
      
      inline def setNobracket(value: Boolean): Self = StObject.set(x, "nobracket", value.asInstanceOf[js.Any])
      
      inline def setNobracketUndefined: Self = StObject.set(x, "nobracket", js.undefined)
      
      inline def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      inline def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
      
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
      
      inline def setOnIgnore(value: /* item */ Item => Unit): Self = StObject.set(x, "onIgnore", js.Any.fromFunction1(value))
      
      inline def setOnIgnoreUndefined: Self = StObject.set(x, "onIgnore", js.undefined)
      
      inline def setOnMatch(value: /* item */ Item => Unit): Self = StObject.set(x, "onMatch", js.Any.fromFunction1(value))
      
      inline def setOnMatchUndefined: Self = StObject.set(x, "onMatch", js.undefined)
      
      inline def setOnResult(value: /* item */ Item => Unit): Self = StObject.set(x, "onResult", js.Any.fromFunction1(value))
      
      inline def setOnResultUndefined: Self = StObject.set(x, "onResult", js.undefined)
      
      inline def setParts(value: Boolean): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
      
      inline def setPosix(value: Boolean): Self = StObject.set(x, "posix", value.asInstanceOf[js.Any])
      
      inline def setPosixUndefined: Self = StObject.set(x, "posix", js.undefined)
      
      inline def setPrepend(value: Boolean): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
      
      inline def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
      
      inline def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
      
      inline def setStrictBrackets(value: Boolean): Self = StObject.set(x, "strictBrackets", value.asInstanceOf[js.Any])
      
      inline def setStrictBracketsUndefined: Self = StObject.set(x, "strictBrackets", js.undefined)
      
      inline def setStrictSlashes(value: Boolean): Self = StObject.set(x, "strictSlashes", value.asInstanceOf[js.Any])
      
      inline def setStrictSlashesUndefined: Self = StObject.set(x, "strictSlashes", js.undefined)
      
      inline def setTokens(value: `true`): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setUnescape(value: Boolean): Self = StObject.set(x, "unescape", value.asInstanceOf[js.Any])
      
      inline def setUnescapeUndefined: Self = StObject.set(x, "unescape", js.undefined)
      
      inline def setWindows(value: Boolean): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
      
      inline def setWindowsUndefined: Self = StObject.set(x, "windows", js.undefined)
    }
  }
}
