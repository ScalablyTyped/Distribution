package typings.pa11y.mod

import typings.puppeteer.deviceDescriptorsMod.Viewport
import typings.puppeteer.mod.Browser
import typings.puppeteer.mod.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var actions: js.UndefOr[js.Array[String]] = js.undefined
  var browser: js.UndefOr[Browser] = js.undefined
  var chromeLaunchConfig: js.UndefOr[LaunchConfig] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var hideElements: js.UndefOr[String] = js.undefined
  var ignore: js.UndefOr[js.Array[String]] = js.undefined
  var ignoreUrl: js.UndefOr[Boolean] = js.undefined
  var includeNotices: js.UndefOr[Boolean] = js.undefined
  var includeWarnings: js.UndefOr[Boolean] = js.undefined
  var level: js.UndefOr[String] = js.undefined
  var log: js.UndefOr[LogConfig] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var pages: js.UndefOr[js.Array[Page]] = js.undefined
  var postData: js.UndefOr[String] = js.undefined
  var reporter: js.UndefOr[String] = js.undefined
  var rootElement: js.UndefOr[String] = js.undefined
  var rules: js.UndefOr[js.Array[String]] = js.undefined
  var runners: js.UndefOr[js.Array[String]] = js.undefined
  var screenCapture: js.UndefOr[String] = js.undefined
  var standard: js.UndefOr[AccessibilityStandard] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var userAgent: js.UndefOr[String] = js.undefined
  var viewport: js.UndefOr[Viewport] = js.undefined
  @JSName("wait")
  var wait_FOptions: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    actions: js.Array[String] = null,
    browser: Browser = null,
    chromeLaunchConfig: LaunchConfig = null,
    headers: js.Object = null,
    hideElements: String = null,
    ignore: js.Array[String] = null,
    ignoreUrl: js.UndefOr[Boolean] = js.undefined,
    includeNotices: js.UndefOr[Boolean] = js.undefined,
    includeWarnings: js.UndefOr[Boolean] = js.undefined,
    level: String = null,
    log: LogConfig = null,
    method: String = null,
    pages: js.Array[Page] = null,
    postData: String = null,
    reporter: String = null,
    rootElement: String = null,
    rules: js.Array[String] = null,
    runners: js.Array[String] = null,
    screenCapture: String = null,
    standard: AccessibilityStandard = null,
    threshold: Int | Double = null,
    timeout: Int | Double = null,
    userAgent: String = null,
    viewport: Viewport = null,
    wait: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (browser != null) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (chromeLaunchConfig != null) __obj.updateDynamic("chromeLaunchConfig")(chromeLaunchConfig.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (hideElements != null) __obj.updateDynamic("hideElements")(hideElements.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUrl)) __obj.updateDynamic("ignoreUrl")(ignoreUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNotices)) __obj.updateDynamic("includeNotices")(includeNotices.asInstanceOf[js.Any])
    if (!js.isUndefined(includeWarnings)) __obj.updateDynamic("includeWarnings")(includeWarnings.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (pages != null) __obj.updateDynamic("pages")(pages.asInstanceOf[js.Any])
    if (postData != null) __obj.updateDynamic("postData")(postData.asInstanceOf[js.Any])
    if (reporter != null) __obj.updateDynamic("reporter")(reporter.asInstanceOf[js.Any])
    if (rootElement != null) __obj.updateDynamic("rootElement")(rootElement.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (runners != null) __obj.updateDynamic("runners")(runners.asInstanceOf[js.Any])
    if (screenCapture != null) __obj.updateDynamic("screenCapture")(screenCapture.asInstanceOf[js.Any])
    if (standard != null) __obj.updateDynamic("standard")(standard.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    if (wait != null) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

