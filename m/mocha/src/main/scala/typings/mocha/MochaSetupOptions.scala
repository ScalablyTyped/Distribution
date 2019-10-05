package typings.mocha

import typings.mocha.Mocha.Interface
import typings.mocha.Mocha.MochaOptions
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to `mocha.setup` in the browser.
  */
trait MochaSetupOptions extends MochaOptions {
  var fullTrace: js.UndefOr[Boolean] = js.undefined
  /** @deprecated This is not used by Mocha. Use `files` instead. */
  var require: js.UndefOr[js.Array[String]] = js.undefined
}

object MochaSetupOptions {
  @scala.inline
  def apply(
    allowUncaught: js.UndefOr[Boolean] = js.undefined,
    asyncOnly: js.UndefOr[Boolean] = js.undefined,
    bail: js.UndefOr[Boolean] = js.undefined,
    delay: js.UndefOr[Boolean] = js.undefined,
    enableTimeouts: js.UndefOr[Boolean] = js.undefined,
    forbidOnly: js.UndefOr[Boolean] = js.undefined,
    forbidPending: js.UndefOr[Boolean] = js.undefined,
    fullStackTrace: js.UndefOr[Boolean] = js.undefined,
    fullTrace: js.UndefOr[Boolean] = js.undefined,
    globals: js.Array[String] = null,
    grep: String | RegExp = null,
    growl: js.UndefOr[Boolean] = js.undefined,
    hideDiff: js.UndefOr[Boolean] = js.undefined,
    ignoreLeaks: js.UndefOr[Boolean] = js.undefined,
    inlineDiffs: js.UndefOr[Boolean] = js.undefined,
    noHighlighting: js.UndefOr[Boolean] = js.undefined,
    reporter: String | typings.mocha.Mocha.ReporterConstructor = null,
    reporterOptions: js.Any = null,
    require: js.Array[String] = null,
    retries: Int | Double = null,
    slow: Int | Double = null,
    timeout: Int | Double = null,
    ui: Interface = null,
    useColors: js.UndefOr[Boolean] = js.undefined
  ): MochaSetupOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUncaught)) __obj.updateDynamic("allowUncaught")(allowUncaught)
    if (!js.isUndefined(asyncOnly)) __obj.updateDynamic("asyncOnly")(asyncOnly)
    if (!js.isUndefined(bail)) __obj.updateDynamic("bail")(bail)
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay)
    if (!js.isUndefined(enableTimeouts)) __obj.updateDynamic("enableTimeouts")(enableTimeouts)
    if (!js.isUndefined(forbidOnly)) __obj.updateDynamic("forbidOnly")(forbidOnly)
    if (!js.isUndefined(forbidPending)) __obj.updateDynamic("forbidPending")(forbidPending)
    if (!js.isUndefined(fullStackTrace)) __obj.updateDynamic("fullStackTrace")(fullStackTrace)
    if (!js.isUndefined(fullTrace)) __obj.updateDynamic("fullTrace")(fullTrace)
    if (globals != null) __obj.updateDynamic("globals")(globals)
    if (grep != null) __obj.updateDynamic("grep")(grep.asInstanceOf[js.Any])
    if (!js.isUndefined(growl)) __obj.updateDynamic("growl")(growl)
    if (!js.isUndefined(hideDiff)) __obj.updateDynamic("hideDiff")(hideDiff)
    if (!js.isUndefined(ignoreLeaks)) __obj.updateDynamic("ignoreLeaks")(ignoreLeaks)
    if (!js.isUndefined(inlineDiffs)) __obj.updateDynamic("inlineDiffs")(inlineDiffs)
    if (!js.isUndefined(noHighlighting)) __obj.updateDynamic("noHighlighting")(noHighlighting)
    if (reporter != null) __obj.updateDynamic("reporter")(reporter.asInstanceOf[js.Any])
    if (reporterOptions != null) __obj.updateDynamic("reporterOptions")(reporterOptions)
    if (require != null) __obj.updateDynamic("require")(require)
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (slow != null) __obj.updateDynamic("slow")(slow.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (ui != null) __obj.updateDynamic("ui")(ui)
    if (!js.isUndefined(useColors)) __obj.updateDynamic("useColors")(useColors)
    __obj.asInstanceOf[MochaSetupOptions]
  }
}

