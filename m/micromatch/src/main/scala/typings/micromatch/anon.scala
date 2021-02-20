package typings.micromatch

import typings.micromatch.micromatchBooleans.`true`
import typings.micromatch.mod.Item
import typings.micromatch.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined {  parts :true} & micromatch.micromatch.ScanOptions */
  @js.native
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
    var basename: js.UndefOr[Boolean] = js.native
    
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
    var bash: js.UndefOr[Boolean] = js.native
    
    /**
      * Return regex matches in supporting methods.
      *
      * @default undefined
      */
    var capture: js.UndefOr[Boolean] = js.native
    
    /**
      * Allows glob to match any part of the given string(s).
      *
      * @default undefined
      */
    var contains: js.UndefOr[Boolean] = js.native
    
    /**
      * Current working directory. Used by `picomatch.split()`
      *
      * @default process.cwd()
      */
    var cwd: js.UndefOr[String] = js.native
    
    /**
      * Debug regular expressions when an error is thrown.
      *
      * @default undefined
      */
    var debug: js.UndefOr[Boolean] = js.native
    
    /**
      * Match dotfiles. Otherwise dotfiles are ignored unless a `.` is explicitly defined in the pattern.
      *
      * @default false
      */
    var dot: js.UndefOr[Boolean] = js.native
    
    /**
      * Custom function for expanding ranges in brace patterns, such as `{a..z}`.
      * The function receives the range values as two arguments, and it must return a string to be used in the generated regex.
      * It's recommended that returned strings be wrapped in parentheses. This option is overridden by the expandBrace option.
      *
      * @default undefined
      */
    var expandRange: js.UndefOr[
        js.Function3[/* left */ String, /* right */ String, /* options */ Options, String]
      ] = js.native
    
    /**
      * Similar to the `--failglob` behavior in Bash, throws an error when no matches are found.
      *
      * @default false
      */
    var failglob: js.UndefOr[Boolean] = js.native
    
    /**
      * To speed up processing, full parsing is skipped for a handful common glob patterns. Disable this behavior by setting this option to false.
      *
      * @default true
      */
    var fastpaths: js.UndefOr[Boolean] = js.native
    
    /**
      * Regex flags to use in the generated regex. If defined, the `nocase` option will be overridden.
      *
      * @default undefined
      */
    var flags: js.UndefOr[Boolean] = js.native
    
    /**
      * Custom function for formatting the returned string. This is useful for removing leading slashes, converting Windows paths to Posix paths, etc.
      *
      * @default undefined
      */
    var format: js.UndefOr[js.Function1[/* returnedString */ String, String]] = js.native
    
    /**
      * One or more glob patterns for excluding strings that should not be matched from the result.
      *
      * @default undefined
      */
    var ignore: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * Retain quotes in the generated regex, since quotes may also be used as an alternative to backslashes.
      *
      * @default false
      */
    var keepQuotes: js.UndefOr[Boolean] = js.native
    
    /**
      * When `true`, brackets in the glob pattern will be escaped so that only literal brackets will be matched.
      *
      * @default undefined
      */
    var literalBrackets: js.UndefOr[Boolean] = js.native
    
    /**
      * Support regex positive and negative lookbehinds. Note that you must be using Node 8.1.10 or higher to enable regex lookbehinds.
      *
      * @default true
      */
    var lookbehinds: js.UndefOr[Boolean] = js.native
    
    /**
      * Alias for `basename`.
      *
      * @default false
      */
    var matchBase: js.UndefOr[Boolean] = js.native
    
    /**
      * Limit the max length of the input string. An error is thrown if the input string is longer than this value.
      *
      * @default 65536
      */
    var maxLength: js.UndefOr[Double] = js.native
    
    /**
      * Disable brace matching, so that `{a,b}` and `{1..3}` would be treated as literal characters.
      *
      * @default false
      */
    var nobrace: js.UndefOr[Boolean] = js.native
    
    /**
      * Disable matching with regex brackets.
      *
      * @default undefined
      */
    var nobracket: js.UndefOr[Boolean] = js.native
    
    /**
      * Perform case-insensitive matching. Equivalent to the regex `i` flag.
      * Note that this option is ignored when the `flags` option is defined.
      *
      * @default false
      */
    var nocase: js.UndefOr[Boolean] = js.native
    
    /**
      * Alias for `noextglob`
      *
      * @default false
      */
    var noext: js.UndefOr[Boolean] = js.native
    
    /**
      * Disable support for matching with extglobs (like `+(a|b)`)
      *
      * @default false
      */
    var noextglob: js.UndefOr[Boolean] = js.native
    
    /**
      * Disable matching with globstars (`**`).
      *
      * @default undefined
      */
    var noglobstar: js.UndefOr[Boolean] = js.native
    
    /**
      * Disallow negation (`!`) patterns, and treat leading `!` as a literal character to match.
      *
      * @default undefined
      */
    var nonegate: js.UndefOr[Boolean] = js.native
    
    /**
      * Disable support for regex quantifiers (like `a{1,2}`) and treat them as brace patterns to be expanded.
      *
      * @default false
      */
    var noquantifiers: js.UndefOr[Boolean] = js.native
    
    /**
      * Function to be called on ignored items.
      *
      * @default undefined
      */
    var onIgnore: js.UndefOr[js.Function1[/* item */ Item, Unit]] = js.native
    
    /**
      * Function to be called on matched items.
      *
      * @default undefined
      */
    var onMatch: js.UndefOr[js.Function1[/* item */ Item, Unit]] = js.native
    
    /**
      * Function to be called on all items, regardless of whether or not they are matched or ignored.
      *
      * @default undefined
      */
    var onResult: js.UndefOr[js.Function1[/* item */ Item, Unit]] = js.native
    
    /**
      * When `true`, the returned object will include an array of strings representing each path "segment" in the scanned glob pattern.
      * This is automatically enabled when `options.tokens` is `true`.
      *
      * @default false
      */
    var parts: `true` with js.UndefOr[Boolean] = js.native
    
    /**
      * Support POSIX character classes ("posix brackets").
      *
      * @default false
      */
    var posix: js.UndefOr[Boolean] = js.native
    
    /**
      * String to prepend to the generated regex used for matching.
      *
      * @default undefined
      */
    var prepend: js.UndefOr[Boolean] = js.native
    
    /**
      * Use regular expression rules for `+` (instead of matching literal `+`), and for stars that follow closing parentheses or brackets (as in `)*` and `]*`).
      *
      * @default false
      */
    var regex: js.UndefOr[Boolean] = js.native
    
    /**
      * Throw an error if brackets, braces, or parens are imbalanced.
      *
      * @default undefined
      */
    var strictBrackets: js.UndefOr[Boolean] = js.native
    
    /**
      * When true, picomatch won't match trailing slashes with single stars.
      *
      * @default undefined
      */
    var strictSlashes: js.UndefOr[Boolean] = js.native
    
    /**
      * When `true`, the returned object will include an array of `tokens` (objects), representing each path "segment" in the scanned glob pattern.
      *
      * @default false
      */
    var tokens: js.UndefOr[Boolean] = js.native
    
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
    var unescape: js.UndefOr[Boolean] = js.native
    
    /**
      * Convert all slashes in file paths to forward slashes. This does not convert slashes in the glob pattern itself
      *
      * @default undefined
      */
    var windows: js.UndefOr[Boolean] = js.native
  }
  object partstrueScanOptions {
    
    @scala.inline
    def apply(parts: `true` with js.UndefOr[Boolean]): partstrueScanOptions = {
      val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
      __obj.asInstanceOf[partstrueScanOptions]
    }
    
    @scala.inline
    implicit class partstrueScanOptionsMutableBuilder[Self <: partstrueScanOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasename(value: Boolean): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      @scala.inline
      def setBash(value: Boolean): Self = StObject.set(x, "bash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBashUndefined: Self = StObject.set(x, "bash", js.undefined)
      
      @scala.inline
      def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setContains(value: Boolean): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      @scala.inline
      def setExpandRange(value: (/* left */ String, /* right */ String, /* options */ Options) => String): Self = StObject.set(x, "expandRange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setExpandRangeUndefined: Self = StObject.set(x, "expandRange", js.undefined)
      
      @scala.inline
      def setFailglob(value: Boolean): Self = StObject.set(x, "failglob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailglobUndefined: Self = StObject.set(x, "failglob", js.undefined)
      
      @scala.inline
      def setFastpaths(value: Boolean): Self = StObject.set(x, "fastpaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFastpathsUndefined: Self = StObject.set(x, "fastpaths", js.undefined)
      
      @scala.inline
      def setFlags(value: Boolean): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setFormat(value: /* returnedString */ String => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setIgnore(value: String | js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setKeepQuotes(value: Boolean): Self = StObject.set(x, "keepQuotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepQuotesUndefined: Self = StObject.set(x, "keepQuotes", js.undefined)
      
      @scala.inline
      def setLiteralBrackets(value: Boolean): Self = StObject.set(x, "literalBrackets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiteralBracketsUndefined: Self = StObject.set(x, "literalBrackets", js.undefined)
      
      @scala.inline
      def setLookbehinds(value: Boolean): Self = StObject.set(x, "lookbehinds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookbehindsUndefined: Self = StObject.set(x, "lookbehinds", js.undefined)
      
      @scala.inline
      def setMatchBase(value: Boolean): Self = StObject.set(x, "matchBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchBaseUndefined: Self = StObject.set(x, "matchBase", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setNobrace(value: Boolean): Self = StObject.set(x, "nobrace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNobraceUndefined: Self = StObject.set(x, "nobrace", js.undefined)
      
      @scala.inline
      def setNobracket(value: Boolean): Self = StObject.set(x, "nobracket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNobracketUndefined: Self = StObject.set(x, "nobracket", js.undefined)
      
      @scala.inline
      def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
      
      @scala.inline
      def setNoext(value: Boolean): Self = StObject.set(x, "noext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoextUndefined: Self = StObject.set(x, "noext", js.undefined)
      
      @scala.inline
      def setNoextglob(value: Boolean): Self = StObject.set(x, "noextglob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoextglobUndefined: Self = StObject.set(x, "noextglob", js.undefined)
      
      @scala.inline
      def setNoglobstar(value: Boolean): Self = StObject.set(x, "noglobstar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoglobstarUndefined: Self = StObject.set(x, "noglobstar", js.undefined)
      
      @scala.inline
      def setNonegate(value: Boolean): Self = StObject.set(x, "nonegate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonegateUndefined: Self = StObject.set(x, "nonegate", js.undefined)
      
      @scala.inline
      def setNoquantifiers(value: Boolean): Self = StObject.set(x, "noquantifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoquantifiersUndefined: Self = StObject.set(x, "noquantifiers", js.undefined)
      
      @scala.inline
      def setOnIgnore(value: /* item */ Item => Unit): Self = StObject.set(x, "onIgnore", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnIgnoreUndefined: Self = StObject.set(x, "onIgnore", js.undefined)
      
      @scala.inline
      def setOnMatch(value: /* item */ Item => Unit): Self = StObject.set(x, "onMatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMatchUndefined: Self = StObject.set(x, "onMatch", js.undefined)
      
      @scala.inline
      def setOnResult(value: /* item */ Item => Unit): Self = StObject.set(x, "onResult", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResultUndefined: Self = StObject.set(x, "onResult", js.undefined)
      
      @scala.inline
      def setParts(value: `true` with js.UndefOr[Boolean]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosix(value: Boolean): Self = StObject.set(x, "posix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosixUndefined: Self = StObject.set(x, "posix", js.undefined)
      
      @scala.inline
      def setPrepend(value: Boolean): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
      
      @scala.inline
      def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
      
      @scala.inline
      def setStrictBrackets(value: Boolean): Self = StObject.set(x, "strictBrackets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictBracketsUndefined: Self = StObject.set(x, "strictBrackets", js.undefined)
      
      @scala.inline
      def setStrictSlashes(value: Boolean): Self = StObject.set(x, "strictSlashes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictSlashesUndefined: Self = StObject.set(x, "strictSlashes", js.undefined)
      
      @scala.inline
      def setTokens(value: Boolean): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
      
      @scala.inline
      def setUnescape(value: Boolean): Self = StObject.set(x, "unescape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnescapeUndefined: Self = StObject.set(x, "unescape", js.undefined)
      
      @scala.inline
      def setWindows(value: Boolean): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowsUndefined: Self = StObject.set(x, "windows", js.undefined)
    }
  }
  
  /* Inlined {  tokens :true} & micromatch.micromatch.ScanOptions */
  @js.native
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
    var basename: js.UndefOr[Boolean] = js.native
    
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
    var bash: js.UndefOr[Boolean] = js.native
    
    /**
      * Return regex matches in supporting methods.
      *
      * @default undefined
      */
    var capture: js.UndefOr[Boolean] = js.native
    
    /**
      * Allows glob to match any part of the given string(s).
      *
      * @default undefined
      */
    var contains: js.UndefOr[Boolean] = js.native
    
    /**
      * Current working directory. Used by `picomatch.split()`
      *
      * @default process.cwd()
      */
    var cwd: js.UndefOr[String] = js.native
    
    /**
      * Debug regular expressions when an error is thrown.
      *
      * @default undefined
      */
    var debug: js.UndefOr[Boolean] = js.native
    
    /**
      * Match dotfiles. Otherwise dotfiles are ignored unless a `.` is explicitly defined in the pattern.
      *
      * @default false
      */
    var dot: js.UndefOr[Boolean] = js.native
    
    /**
      * Custom function for expanding ranges in brace patterns, such as `{a..z}`.
      * The function receives the range values as two arguments, and it must return a string to be used in the generated regex.
      * It's recommended that returned strings be wrapped in parentheses. This option is overridden by the expandBrace option.
      *
      * @default undefined
      */
    var expandRange: js.UndefOr[
        js.Function3[/* left */ String, /* right */ String, /* options */ Options, String]
      ] = js.native
    
    /**
      * Similar to the `--failglob` behavior in Bash, throws an error when no matches are found.
      *
      * @default false
      */
    var failglob: js.UndefOr[Boolean] = js.native
    
    /**
      * To speed up processing, full parsing is skipped for a handful common glob patterns. Disable this behavior by setting this option to false.
      *
      * @default true
      */
    var fastpaths: js.UndefOr[Boolean] = js.native
    
    /**
      * Regex flags to use in the generated regex. If defined, the `nocase` option will be overridden.
      *
      * @default undefined
      */
    var flags: js.UndefOr[Boolean] = js.native
    
    /**
      * Custom function for formatting the returned string. This is useful for removing leading slashes, converting Windows paths to Posix paths, etc.
      *
      * @default undefined
      */
    var format: js.UndefOr[js.Function1[/* returnedString */ String, String]] = js.native
    
    /**
      * One or more glob patterns for excluding strings that should not be matched from the result.
      *
      * @default undefined
      */
    var ignore: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * Retain quotes in the generated regex, since quotes may also be used as an alternative to backslashes.
      *
      * @default false
      */
    var keepQuotes: js.UndefOr[Boolean] = js.native
    
    /**
      * When `true`, brackets in the glob pattern will be escaped so that only literal brackets will be matched.
      *
      * @default undefined
      */
    var literalBrackets: js.UndefOr[Boolean] = js.native
    
    /**
      * Support regex positive and negative lookbehinds. Note that you must be using Node 8.1.10 or higher to enable regex lookbehinds.
      *
      * @default true
      */
    var lookbehinds: js.UndefOr[Boolean] = js.native
    
    /**
      * Alias for `basename`.
      *
      * @default false
      */
    var matchBase: js.UndefOr[Boolean] = js.native
    
    /**
      * Limit the max length of the input string. An error is thrown if the input string is longer than this value.
      *
      * @default 65536
      */
    var maxLength: js.UndefOr[Double] = js.native
    
    /**
      * Disable brace matching, so that `{a,b}` and `{1..3}` would be treated as literal characters.
      *
      * @default false
      */
    var nobrace: js.UndefOr[Boolean] = js.native
    
    /**
      * Disable matching with regex brackets.
      *
      * @default undefined
      */
    var nobracket: js.UndefOr[Boolean] = js.native
    
    /**
      * Perform case-insensitive matching. Equivalent to the regex `i` flag.
      * Note that this option is ignored when the `flags` option is defined.
      *
      * @default false
      */
    var nocase: js.UndefOr[Boolean] = js.native
    
    /**
      * Alias for `noextglob`
      *
      * @default false
      */
    var noext: js.UndefOr[Boolean] = js.native
    
    /**
      * Disable support for matching with extglobs (like `+(a|b)`)
      *
      * @default false
      */
    var noextglob: js.UndefOr[Boolean] = js.native
    
    /**
      * Disable matching with globstars (`**`).
      *
      * @default undefined
      */
    var noglobstar: js.UndefOr[Boolean] = js.native
    
    /**
      * Disallow negation (`!`) patterns, and treat leading `!` as a literal character to match.
      *
      * @default undefined
      */
    var nonegate: js.UndefOr[Boolean] = js.native
    
    /**
      * Disable support for regex quantifiers (like `a{1,2}`) and treat them as brace patterns to be expanded.
      *
      * @default false
      */
    var noquantifiers: js.UndefOr[Boolean] = js.native
    
    /**
      * Function to be called on ignored items.
      *
      * @default undefined
      */
    var onIgnore: js.UndefOr[js.Function1[/* item */ Item, Unit]] = js.native
    
    /**
      * Function to be called on matched items.
      *
      * @default undefined
      */
    var onMatch: js.UndefOr[js.Function1[/* item */ Item, Unit]] = js.native
    
    /**
      * Function to be called on all items, regardless of whether or not they are matched or ignored.
      *
      * @default undefined
      */
    var onResult: js.UndefOr[js.Function1[/* item */ Item, Unit]] = js.native
    
    /**
      * When `true`, the returned object will include an array of strings representing each path "segment" in the scanned glob pattern.
      * This is automatically enabled when `options.tokens` is `true`.
      *
      * @default false
      */
    var parts: js.UndefOr[Boolean] = js.native
    
    /**
      * Support POSIX character classes ("posix brackets").
      *
      * @default false
      */
    var posix: js.UndefOr[Boolean] = js.native
    
    /**
      * String to prepend to the generated regex used for matching.
      *
      * @default undefined
      */
    var prepend: js.UndefOr[Boolean] = js.native
    
    /**
      * Use regular expression rules for `+` (instead of matching literal `+`), and for stars that follow closing parentheses or brackets (as in `)*` and `]*`).
      *
      * @default false
      */
    var regex: js.UndefOr[Boolean] = js.native
    
    /**
      * Throw an error if brackets, braces, or parens are imbalanced.
      *
      * @default undefined
      */
    var strictBrackets: js.UndefOr[Boolean] = js.native
    
    /**
      * When true, picomatch won't match trailing slashes with single stars.
      *
      * @default undefined
      */
    var strictSlashes: js.UndefOr[Boolean] = js.native
    
    /**
      * When `true`, the returned object will include an array of `tokens` (objects), representing each path "segment" in the scanned glob pattern.
      *
      * @default false
      */
    var tokens: `true` with js.UndefOr[Boolean] = js.native
    
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
    var unescape: js.UndefOr[Boolean] = js.native
    
    /**
      * Convert all slashes in file paths to forward slashes. This does not convert slashes in the glob pattern itself
      *
      * @default undefined
      */
    var windows: js.UndefOr[Boolean] = js.native
  }
  object tokenstrueScanOptions {
    
    @scala.inline
    def apply(tokens: `true` with js.UndefOr[Boolean]): tokenstrueScanOptions = {
      val __obj = js.Dynamic.literal(tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[tokenstrueScanOptions]
    }
    
    @scala.inline
    implicit class tokenstrueScanOptionsMutableBuilder[Self <: tokenstrueScanOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasename(value: Boolean): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      @scala.inline
      def setBash(value: Boolean): Self = StObject.set(x, "bash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBashUndefined: Self = StObject.set(x, "bash", js.undefined)
      
      @scala.inline
      def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setContains(value: Boolean): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      @scala.inline
      def setExpandRange(value: (/* left */ String, /* right */ String, /* options */ Options) => String): Self = StObject.set(x, "expandRange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setExpandRangeUndefined: Self = StObject.set(x, "expandRange", js.undefined)
      
      @scala.inline
      def setFailglob(value: Boolean): Self = StObject.set(x, "failglob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailglobUndefined: Self = StObject.set(x, "failglob", js.undefined)
      
      @scala.inline
      def setFastpaths(value: Boolean): Self = StObject.set(x, "fastpaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFastpathsUndefined: Self = StObject.set(x, "fastpaths", js.undefined)
      
      @scala.inline
      def setFlags(value: Boolean): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setFormat(value: /* returnedString */ String => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setIgnore(value: String | js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setKeepQuotes(value: Boolean): Self = StObject.set(x, "keepQuotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepQuotesUndefined: Self = StObject.set(x, "keepQuotes", js.undefined)
      
      @scala.inline
      def setLiteralBrackets(value: Boolean): Self = StObject.set(x, "literalBrackets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiteralBracketsUndefined: Self = StObject.set(x, "literalBrackets", js.undefined)
      
      @scala.inline
      def setLookbehinds(value: Boolean): Self = StObject.set(x, "lookbehinds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookbehindsUndefined: Self = StObject.set(x, "lookbehinds", js.undefined)
      
      @scala.inline
      def setMatchBase(value: Boolean): Self = StObject.set(x, "matchBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchBaseUndefined: Self = StObject.set(x, "matchBase", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setNobrace(value: Boolean): Self = StObject.set(x, "nobrace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNobraceUndefined: Self = StObject.set(x, "nobrace", js.undefined)
      
      @scala.inline
      def setNobracket(value: Boolean): Self = StObject.set(x, "nobracket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNobracketUndefined: Self = StObject.set(x, "nobracket", js.undefined)
      
      @scala.inline
      def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
      
      @scala.inline
      def setNoext(value: Boolean): Self = StObject.set(x, "noext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoextUndefined: Self = StObject.set(x, "noext", js.undefined)
      
      @scala.inline
      def setNoextglob(value: Boolean): Self = StObject.set(x, "noextglob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoextglobUndefined: Self = StObject.set(x, "noextglob", js.undefined)
      
      @scala.inline
      def setNoglobstar(value: Boolean): Self = StObject.set(x, "noglobstar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoglobstarUndefined: Self = StObject.set(x, "noglobstar", js.undefined)
      
      @scala.inline
      def setNonegate(value: Boolean): Self = StObject.set(x, "nonegate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonegateUndefined: Self = StObject.set(x, "nonegate", js.undefined)
      
      @scala.inline
      def setNoquantifiers(value: Boolean): Self = StObject.set(x, "noquantifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoquantifiersUndefined: Self = StObject.set(x, "noquantifiers", js.undefined)
      
      @scala.inline
      def setOnIgnore(value: /* item */ Item => Unit): Self = StObject.set(x, "onIgnore", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnIgnoreUndefined: Self = StObject.set(x, "onIgnore", js.undefined)
      
      @scala.inline
      def setOnMatch(value: /* item */ Item => Unit): Self = StObject.set(x, "onMatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMatchUndefined: Self = StObject.set(x, "onMatch", js.undefined)
      
      @scala.inline
      def setOnResult(value: /* item */ Item => Unit): Self = StObject.set(x, "onResult", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResultUndefined: Self = StObject.set(x, "onResult", js.undefined)
      
      @scala.inline
      def setParts(value: Boolean): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
      
      @scala.inline
      def setPosix(value: Boolean): Self = StObject.set(x, "posix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosixUndefined: Self = StObject.set(x, "posix", js.undefined)
      
      @scala.inline
      def setPrepend(value: Boolean): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
      
      @scala.inline
      def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
      
      @scala.inline
      def setStrictBrackets(value: Boolean): Self = StObject.set(x, "strictBrackets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictBracketsUndefined: Self = StObject.set(x, "strictBrackets", js.undefined)
      
      @scala.inline
      def setStrictSlashes(value: Boolean): Self = StObject.set(x, "strictSlashes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictSlashesUndefined: Self = StObject.set(x, "strictSlashes", js.undefined)
      
      @scala.inline
      def setTokens(value: `true` with js.UndefOr[Boolean]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnescape(value: Boolean): Self = StObject.set(x, "unescape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnescapeUndefined: Self = StObject.set(x, "unescape", js.undefined)
      
      @scala.inline
      def setWindows(value: Boolean): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowsUndefined: Self = StObject.set(x, "windows", js.undefined)
    }
  }
}
