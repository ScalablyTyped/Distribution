package typings.micromatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanOptions extends Options {
  /**
    * When `true`, the returned object will include an array of strings representing each path "segment" in the scanned glob pattern.
    * This is automatically enabled when `options.tokens` is `true`.
    *
    * @default false
    */
  var parts: js.UndefOr[Boolean] = js.undefined
  /**
    * When `true`, the returned object will include an array of `tokens` (objects), representing each path "segment" in the scanned glob pattern.
    *
    * @default false
    */
  var tokens: js.UndefOr[Boolean] = js.undefined
}

object ScanOptions {
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
    maxLength: js.UndefOr[Double] = js.undefined,
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
    tokens: js.UndefOr[Boolean] = js.undefined,
    unescape: js.UndefOr[Boolean] = js.undefined,
    windows: js.UndefOr[Boolean] = js.undefined
  ): ScanOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(basename)) __obj.updateDynamic("basename")(basename.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bash)) __obj.updateDynamic("bash")(bash.get.asInstanceOf[js.Any])
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture.get.asInstanceOf[js.Any])
    if (!js.isUndefined(contains)) __obj.updateDynamic("contains")(contains.get.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.get.asInstanceOf[js.Any])
    if (expandRange != null) __obj.updateDynamic("expandRange")(js.Any.fromFunction3(expandRange))
    if (!js.isUndefined(failglob)) __obj.updateDynamic("failglob")(failglob.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fastpaths)) __obj.updateDynamic("fastpaths")(fastpaths.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flags)) __obj.updateDynamic("flags")(flags.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(keepQuotes)) __obj.updateDynamic("keepQuotes")(keepQuotes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(literalBrackets)) __obj.updateDynamic("literalBrackets")(literalBrackets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lookbehinds)) __obj.updateDynamic("lookbehinds")(lookbehinds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(matchBase)) __obj.updateDynamic("matchBase")(matchBase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nobrace)) __obj.updateDynamic("nobrace")(nobrace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nobracket)) __obj.updateDynamic("nobracket")(nobracket.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noext)) __obj.updateDynamic("noext")(noext.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noextglob)) __obj.updateDynamic("noextglob")(noextglob.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noglobstar)) __obj.updateDynamic("noglobstar")(noglobstar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nonegate)) __obj.updateDynamic("nonegate")(nonegate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noquantifiers)) __obj.updateDynamic("noquantifiers")(noquantifiers.get.asInstanceOf[js.Any])
    if (onIgnore != null) __obj.updateDynamic("onIgnore")(js.Any.fromFunction1(onIgnore))
    if (onMatch != null) __obj.updateDynamic("onMatch")(js.Any.fromFunction1(onMatch))
    if (onResult != null) __obj.updateDynamic("onResult")(js.Any.fromFunction1(onResult))
    if (!js.isUndefined(parts)) __obj.updateDynamic("parts")(parts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(posix)) __obj.updateDynamic("posix")(posix.get.asInstanceOf[js.Any])
    if (!js.isUndefined(prepend)) __obj.updateDynamic("prepend")(prepend.get.asInstanceOf[js.Any])
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strictBrackets)) __obj.updateDynamic("strictBrackets")(strictBrackets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strictSlashes)) __obj.updateDynamic("strictSlashes")(strictSlashes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tokens)) __obj.updateDynamic("tokens")(tokens.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unescape)) __obj.updateDynamic("unescape")(unescape.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windows)) __obj.updateDynamic("windows")(windows.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanOptions]
  }
}

