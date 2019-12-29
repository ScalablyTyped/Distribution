package typings.mocha.Mocha

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MochaInstanceOptions extends MochaOptions {
  var files: js.UndefOr[js.Array[String]] = js.undefined
}

object MochaInstanceOptions {
  @scala.inline
  def apply(
    allowUncaught: js.UndefOr[Boolean] = js.undefined,
    asyncOnly: js.UndefOr[Boolean] = js.undefined,
    bail: js.UndefOr[Boolean] = js.undefined,
    delay: js.UndefOr[Boolean] = js.undefined,
    enableTimeouts: js.UndefOr[Boolean] = js.undefined,
    files: js.Array[String] = null,
    forbidOnly: js.UndefOr[Boolean] = js.undefined,
    forbidPending: js.UndefOr[Boolean] = js.undefined,
    fullStackTrace: js.UndefOr[Boolean] = js.undefined,
    globals: js.Array[String] = null,
    grep: String | RegExp = null,
    growl: js.UndefOr[Boolean] = js.undefined,
    hideDiff: js.UndefOr[Boolean] = js.undefined,
    ignoreLeaks: js.UndefOr[Boolean] = js.undefined,
    inlineDiffs: js.UndefOr[Boolean] = js.undefined,
    noHighlighting: js.UndefOr[Boolean] = js.undefined,
    reporter: String | ReporterConstructor = null,
    reporterOptions: js.Any = null,
    retries: Int | Double = null,
    slow: Int | Double = null,
    timeout: Int | Double = null,
    ui: Interface = null,
    useColors: js.UndefOr[Boolean] = js.undefined
  ): MochaInstanceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUncaught)) __obj.updateDynamic("allowUncaught")(allowUncaught.asInstanceOf[js.Any])
    if (!js.isUndefined(asyncOnly)) __obj.updateDynamic("asyncOnly")(asyncOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(bail)) __obj.updateDynamic("bail")(bail.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTimeouts)) __obj.updateDynamic("enableTimeouts")(enableTimeouts.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (!js.isUndefined(forbidOnly)) __obj.updateDynamic("forbidOnly")(forbidOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(forbidPending)) __obj.updateDynamic("forbidPending")(forbidPending.asInstanceOf[js.Any])
    if (!js.isUndefined(fullStackTrace)) __obj.updateDynamic("fullStackTrace")(fullStackTrace.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (grep != null) __obj.updateDynamic("grep")(grep.asInstanceOf[js.Any])
    if (!js.isUndefined(growl)) __obj.updateDynamic("growl")(growl.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDiff)) __obj.updateDynamic("hideDiff")(hideDiff.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreLeaks)) __obj.updateDynamic("ignoreLeaks")(ignoreLeaks.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineDiffs)) __obj.updateDynamic("inlineDiffs")(inlineDiffs.asInstanceOf[js.Any])
    if (!js.isUndefined(noHighlighting)) __obj.updateDynamic("noHighlighting")(noHighlighting.asInstanceOf[js.Any])
    if (reporter != null) __obj.updateDynamic("reporter")(reporter.asInstanceOf[js.Any])
    if (reporterOptions != null) __obj.updateDynamic("reporterOptions")(reporterOptions.asInstanceOf[js.Any])
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (slow != null) __obj.updateDynamic("slow")(slow.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (ui != null) __obj.updateDynamic("ui")(ui.asInstanceOf[js.Any])
    if (!js.isUndefined(useColors)) __obj.updateDynamic("useColors")(useColors.asInstanceOf[js.Any])
    __obj.asInstanceOf[MochaInstanceOptions]
  }
}

