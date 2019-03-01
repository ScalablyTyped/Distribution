package typings
package mochaLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to Mocha.
  */
trait MochaOptions extends js.Object {
  var allowUncaught: js.UndefOr[scala.Boolean] = js.undefined
  var asyncOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** bail on the first test failure. */
  var bail: js.UndefOr[scala.Boolean] = js.undefined
  var delay: js.UndefOr[scala.Boolean] = js.undefined
  var enableTimeouts: js.UndefOr[scala.Boolean] = js.undefined
  var forbidOnly: js.UndefOr[scala.Boolean] = js.undefined
  var forbidPending: js.UndefOr[scala.Boolean] = js.undefined
  /** display the full stack trace on failure. */
  var fullStackTrace: js.UndefOr[scala.Boolean] = js.undefined
  /** Array of accepted globals. */
  var globals: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** string or regexp to filter tests with. */
  var grep: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
  /** Enable growl support. */
  var growl: js.UndefOr[scala.Boolean] = js.undefined
  /** Do not show diffs at all. */
  var hideDiff: js.UndefOr[scala.Boolean] = js.undefined
  /** ignore global leaks. */
  var ignoreLeaks: js.UndefOr[scala.Boolean] = js.undefined
  /** Use inline diffs rather than +/-. */
  var inlineDiffs: js.UndefOr[scala.Boolean] = js.undefined
  var noHighlighting: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Reporter constructor, built-in reporter name, or reporter module path. Defaults to
    * `"spec"`.
    */
  var reporter: js.UndefOr[java.lang.String | ReporterConstructor] = js.undefined
  /** Options to pass to the reporter. */
  var reporterOptions: js.UndefOr[js.Any] = js.undefined
  /** number of times to retry failed tests. */
  var retries: js.UndefOr[scala.Double] = js.undefined
  /** milliseconds to wait before considering a test slow. */
  var slow: js.UndefOr[scala.Double] = js.undefined
  /** timeout in milliseconds. */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /** Test interfaces ("bdd", "tdd", "exports", etc.). */
  var ui: js.UndefOr[Interface] = js.undefined
  /** Emit color output. */
  var useColors: js.UndefOr[scala.Boolean] = js.undefined
}

object MochaOptions {
  @scala.inline
  def apply(
    allowUncaught: js.UndefOr[scala.Boolean] = js.undefined,
    asyncOnly: js.UndefOr[scala.Boolean] = js.undefined,
    bail: js.UndefOr[scala.Boolean] = js.undefined,
    delay: js.UndefOr[scala.Boolean] = js.undefined,
    enableTimeouts: js.UndefOr[scala.Boolean] = js.undefined,
    forbidOnly: js.UndefOr[scala.Boolean] = js.undefined,
    forbidPending: js.UndefOr[scala.Boolean] = js.undefined,
    fullStackTrace: js.UndefOr[scala.Boolean] = js.undefined,
    globals: js.Array[java.lang.String] = null,
    grep: java.lang.String | stdLib.RegExp = null,
    growl: js.UndefOr[scala.Boolean] = js.undefined,
    hideDiff: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreLeaks: js.UndefOr[scala.Boolean] = js.undefined,
    inlineDiffs: js.UndefOr[scala.Boolean] = js.undefined,
    noHighlighting: js.UndefOr[scala.Boolean] = js.undefined,
    reporter: java.lang.String | ReporterConstructor = null,
    reporterOptions: js.Any = null,
    retries: scala.Int | scala.Double = null,
    slow: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null,
    ui: Interface = null,
    useColors: js.UndefOr[scala.Boolean] = js.undefined
  ): MochaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUncaught)) __obj.updateDynamic("allowUncaught")(allowUncaught)
    if (!js.isUndefined(asyncOnly)) __obj.updateDynamic("asyncOnly")(asyncOnly)
    if (!js.isUndefined(bail)) __obj.updateDynamic("bail")(bail)
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay)
    if (!js.isUndefined(enableTimeouts)) __obj.updateDynamic("enableTimeouts")(enableTimeouts)
    if (!js.isUndefined(forbidOnly)) __obj.updateDynamic("forbidOnly")(forbidOnly)
    if (!js.isUndefined(forbidPending)) __obj.updateDynamic("forbidPending")(forbidPending)
    if (!js.isUndefined(fullStackTrace)) __obj.updateDynamic("fullStackTrace")(fullStackTrace)
    if (globals != null) __obj.updateDynamic("globals")(globals)
    if (grep != null) __obj.updateDynamic("grep")(grep.asInstanceOf[js.Any])
    if (!js.isUndefined(growl)) __obj.updateDynamic("growl")(growl)
    if (!js.isUndefined(hideDiff)) __obj.updateDynamic("hideDiff")(hideDiff)
    if (!js.isUndefined(ignoreLeaks)) __obj.updateDynamic("ignoreLeaks")(ignoreLeaks)
    if (!js.isUndefined(inlineDiffs)) __obj.updateDynamic("inlineDiffs")(inlineDiffs)
    if (!js.isUndefined(noHighlighting)) __obj.updateDynamic("noHighlighting")(noHighlighting)
    if (reporter != null) __obj.updateDynamic("reporter")(reporter.asInstanceOf[js.Any])
    if (reporterOptions != null) __obj.updateDynamic("reporterOptions")(reporterOptions)
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (slow != null) __obj.updateDynamic("slow")(slow.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (ui != null) __obj.updateDynamic("ui")(ui)
    if (!js.isUndefined(useColors)) __obj.updateDynamic("useColors")(useColors)
    __obj.asInstanceOf[MochaOptions]
  }
}

