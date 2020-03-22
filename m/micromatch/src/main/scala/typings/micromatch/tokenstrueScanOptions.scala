package typings.micromatch

import typings.micromatch.micromatchBooleans.`true`
import typings.micromatch.mod.Item
import typings.micromatch.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  tokens  :true} & micromatch.micromatch.ScanOptions */
trait tokenstrueScanOptions extends js.Object {
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
  var tokens: js.UndefOr[`true` with Boolean] = js.undefined
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
  @scala.inline
  def apply(
    basename: js.UndefOr[Boolean] = js.undefined,
    bash: js.UndefOr[Boolean] = js.undefined,
    capture: js.UndefOr[Boolean] = js.undefined,
    contains: js.UndefOr[Boolean] = js.undefined,
    cwd: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    dot: js.UndefOr[Boolean] = js.undefined,
    expandRange: (/* left */ String, /* right */ String, /* options */ Options) => String = null,
    failglob: js.UndefOr[Boolean] = js.undefined,
    fastpaths: js.UndefOr[Boolean] = js.undefined,
    flags: js.UndefOr[Boolean] = js.undefined,
    format: /* returnedString */ String => String = null,
    ignore: String | js.Array[String] = null,
    keepQuotes: js.UndefOr[Boolean] = js.undefined,
    literalBrackets: js.UndefOr[Boolean] = js.undefined,
    lookbehinds: js.UndefOr[Boolean] = js.undefined,
    matchBase: js.UndefOr[Boolean] = js.undefined,
    maxLength: Int | Double = null,
    nobrace: js.UndefOr[Boolean] = js.undefined,
    nobracket: js.UndefOr[Boolean] = js.undefined,
    nocase: js.UndefOr[Boolean] = js.undefined,
    noext: js.UndefOr[Boolean] = js.undefined,
    noextglob: js.UndefOr[Boolean] = js.undefined,
    noglobstar: js.UndefOr[Boolean] = js.undefined,
    nonegate: js.UndefOr[Boolean] = js.undefined,
    noquantifiers: js.UndefOr[Boolean] = js.undefined,
    onIgnore: /* item */ Item => Unit = null,
    onMatch: /* item */ Item => Unit = null,
    onResult: /* item */ Item => Unit = null,
    parts: js.UndefOr[Boolean] = js.undefined,
    posix: js.UndefOr[Boolean] = js.undefined,
    prepend: js.UndefOr[Boolean] = js.undefined,
    regex: js.UndefOr[Boolean] = js.undefined,
    strictBrackets: js.UndefOr[Boolean] = js.undefined,
    strictSlashes: js.UndefOr[Boolean] = js.undefined,
    tokens: js.UndefOr[`true` with Boolean] = js.undefined,
    unescape: js.UndefOr[Boolean] = js.undefined,
    windows: js.UndefOr[Boolean] = js.undefined
  ): tokenstrueScanOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(basename)) __obj.updateDynamic("basename")(basename.asInstanceOf[js.Any])
    if (!js.isUndefined(bash)) __obj.updateDynamic("bash")(bash.asInstanceOf[js.Any])
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (!js.isUndefined(contains)) __obj.updateDynamic("contains")(contains.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.asInstanceOf[js.Any])
    if (expandRange != null) __obj.updateDynamic("expandRange")(js.Any.fromFunction3(expandRange))
    if (!js.isUndefined(failglob)) __obj.updateDynamic("failglob")(failglob.asInstanceOf[js.Any])
    if (!js.isUndefined(fastpaths)) __obj.updateDynamic("fastpaths")(fastpaths.asInstanceOf[js.Any])
    if (!js.isUndefined(flags)) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(keepQuotes)) __obj.updateDynamic("keepQuotes")(keepQuotes.asInstanceOf[js.Any])
    if (!js.isUndefined(literalBrackets)) __obj.updateDynamic("literalBrackets")(literalBrackets.asInstanceOf[js.Any])
    if (!js.isUndefined(lookbehinds)) __obj.updateDynamic("lookbehinds")(lookbehinds.asInstanceOf[js.Any])
    if (!js.isUndefined(matchBase)) __obj.updateDynamic("matchBase")(matchBase.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (!js.isUndefined(nobrace)) __obj.updateDynamic("nobrace")(nobrace.asInstanceOf[js.Any])
    if (!js.isUndefined(nobracket)) __obj.updateDynamic("nobracket")(nobracket.asInstanceOf[js.Any])
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase.asInstanceOf[js.Any])
    if (!js.isUndefined(noext)) __obj.updateDynamic("noext")(noext.asInstanceOf[js.Any])
    if (!js.isUndefined(noextglob)) __obj.updateDynamic("noextglob")(noextglob.asInstanceOf[js.Any])
    if (!js.isUndefined(noglobstar)) __obj.updateDynamic("noglobstar")(noglobstar.asInstanceOf[js.Any])
    if (!js.isUndefined(nonegate)) __obj.updateDynamic("nonegate")(nonegate.asInstanceOf[js.Any])
    if (!js.isUndefined(noquantifiers)) __obj.updateDynamic("noquantifiers")(noquantifiers.asInstanceOf[js.Any])
    if (onIgnore != null) __obj.updateDynamic("onIgnore")(js.Any.fromFunction1(onIgnore))
    if (onMatch != null) __obj.updateDynamic("onMatch")(js.Any.fromFunction1(onMatch))
    if (onResult != null) __obj.updateDynamic("onResult")(js.Any.fromFunction1(onResult))
    if (!js.isUndefined(parts)) __obj.updateDynamic("parts")(parts.asInstanceOf[js.Any])
    if (!js.isUndefined(posix)) __obj.updateDynamic("posix")(posix.asInstanceOf[js.Any])
    if (!js.isUndefined(prepend)) __obj.updateDynamic("prepend")(prepend.asInstanceOf[js.Any])
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (!js.isUndefined(strictBrackets)) __obj.updateDynamic("strictBrackets")(strictBrackets.asInstanceOf[js.Any])
    if (!js.isUndefined(strictSlashes)) __obj.updateDynamic("strictSlashes")(strictSlashes.asInstanceOf[js.Any])
    if (!js.isUndefined(tokens)) __obj.updateDynamic("tokens")(tokens.asInstanceOf[js.Any])
    if (!js.isUndefined(unescape)) __obj.updateDynamic("unescape")(unescape.asInstanceOf[js.Any])
    if (!js.isUndefined(windows)) __obj.updateDynamic("windows")(windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[tokenstrueScanOptions]
  }
}

