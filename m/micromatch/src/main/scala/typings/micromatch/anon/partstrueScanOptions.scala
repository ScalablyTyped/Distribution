package typings.micromatch.anon

import typings.micromatch.micromatchBooleans.`true`
import typings.micromatch.mod.Item
import typings.micromatch.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  parts :true} & micromatch.micromatch.ScanOptions */
@js.native
trait partstrueScanOptions extends js.Object {
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
  implicit class partstrueScanOptionsOps[Self <: partstrueScanOptions] (val x: Self) extends AnyVal {
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
    def setParts(value: `true` with js.UndefOr[Boolean]): Self = this.set("parts", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasename(value: Boolean): Self = this.set("basename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasename: Self = this.set("basename", js.undefined)
    @scala.inline
    def setBash(value: Boolean): Self = this.set("bash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBash: Self = this.set("bash", js.undefined)
    @scala.inline
    def setCapture(value: Boolean): Self = this.set("capture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    @scala.inline
    def setContains(value: Boolean): Self = this.set("contains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDot(value: Boolean): Self = this.set("dot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDot: Self = this.set("dot", js.undefined)
    @scala.inline
    def setExpandRange(value: (/* left */ String, /* right */ String, /* options */ Options) => String): Self = this.set("expandRange", js.Any.fromFunction3(value))
    @scala.inline
    def deleteExpandRange: Self = this.set("expandRange", js.undefined)
    @scala.inline
    def setFailglob(value: Boolean): Self = this.set("failglob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailglob: Self = this.set("failglob", js.undefined)
    @scala.inline
    def setFastpaths(value: Boolean): Self = this.set("fastpaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFastpaths: Self = this.set("fastpaths", js.undefined)
    @scala.inline
    def setFlags(value: Boolean): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    @scala.inline
    def setFormat(value: /* returnedString */ String => String): Self = this.set("format", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: String | js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setKeepQuotes(value: Boolean): Self = this.set("keepQuotes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepQuotes: Self = this.set("keepQuotes", js.undefined)
    @scala.inline
    def setLiteralBrackets(value: Boolean): Self = this.set("literalBrackets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiteralBrackets: Self = this.set("literalBrackets", js.undefined)
    @scala.inline
    def setLookbehinds(value: Boolean): Self = this.set("lookbehinds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLookbehinds: Self = this.set("lookbehinds", js.undefined)
    @scala.inline
    def setMatchBase(value: Boolean): Self = this.set("matchBase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchBase: Self = this.set("matchBase", js.undefined)
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setNobrace(value: Boolean): Self = this.set("nobrace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNobrace: Self = this.set("nobrace", js.undefined)
    @scala.inline
    def setNobracket(value: Boolean): Self = this.set("nobracket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNobracket: Self = this.set("nobracket", js.undefined)
    @scala.inline
    def setNocase(value: Boolean): Self = this.set("nocase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNocase: Self = this.set("nocase", js.undefined)
    @scala.inline
    def setNoext(value: Boolean): Self = this.set("noext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoext: Self = this.set("noext", js.undefined)
    @scala.inline
    def setNoextglob(value: Boolean): Self = this.set("noextglob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoextglob: Self = this.set("noextglob", js.undefined)
    @scala.inline
    def setNoglobstar(value: Boolean): Self = this.set("noglobstar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoglobstar: Self = this.set("noglobstar", js.undefined)
    @scala.inline
    def setNonegate(value: Boolean): Self = this.set("nonegate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonegate: Self = this.set("nonegate", js.undefined)
    @scala.inline
    def setNoquantifiers(value: Boolean): Self = this.set("noquantifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoquantifiers: Self = this.set("noquantifiers", js.undefined)
    @scala.inline
    def setOnIgnore(value: /* item */ Item => Unit): Self = this.set("onIgnore", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIgnore: Self = this.set("onIgnore", js.undefined)
    @scala.inline
    def setOnMatch(value: /* item */ Item => Unit): Self = this.set("onMatch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMatch: Self = this.set("onMatch", js.undefined)
    @scala.inline
    def setOnResult(value: /* item */ Item => Unit): Self = this.set("onResult", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResult: Self = this.set("onResult", js.undefined)
    @scala.inline
    def setPosix(value: Boolean): Self = this.set("posix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosix: Self = this.set("posix", js.undefined)
    @scala.inline
    def setPrepend(value: Boolean): Self = this.set("prepend", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrepend: Self = this.set("prepend", js.undefined)
    @scala.inline
    def setRegex(value: Boolean): Self = this.set("regex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
    @scala.inline
    def setStrictBrackets(value: Boolean): Self = this.set("strictBrackets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictBrackets: Self = this.set("strictBrackets", js.undefined)
    @scala.inline
    def setStrictSlashes(value: Boolean): Self = this.set("strictSlashes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictSlashes: Self = this.set("strictSlashes", js.undefined)
    @scala.inline
    def setTokens(value: Boolean): Self = this.set("tokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokens: Self = this.set("tokens", js.undefined)
    @scala.inline
    def setUnescape(value: Boolean): Self = this.set("unescape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnescape: Self = this.set("unescape", js.undefined)
    @scala.inline
    def setWindows(value: Boolean): Self = this.set("windows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindows: Self = this.set("windows", js.undefined)
  }
  
}

