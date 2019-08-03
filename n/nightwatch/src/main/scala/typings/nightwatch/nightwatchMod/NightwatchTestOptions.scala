package typings.nightwatch.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchTestOptions extends NightwatchTestSettingGeneric {
  var screenshots: Boolean
  var screenshotsPath: String
}

object NightwatchTestOptions {
  @scala.inline
  def apply(
    screenshots: Boolean,
    screenshotsPath: String,
    access_key: String = null,
    cli_args: js.Any = null,
    desiredCapabilities: NightwatchDesiredCapabilities = null,
    disable_colors: js.UndefOr[Boolean] = js.undefined,
    end_session_on_fail: js.UndefOr[Boolean] = js.undefined,
    exclude: js.Array[String] = null,
    filter: String = null,
    globals: NightwatchGlobals = null,
    launch_url: String = null,
    log_screenshot_data: js.UndefOr[Boolean] = js.undefined,
    output: js.UndefOr[Boolean] = js.undefined,
    proxy: String = null,
    selenium_host: String = null,
    selenium_port: Int | Double = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    skip_testcases_on_fail: js.UndefOr[Boolean] = js.undefined,
    use_xpath: js.UndefOr[Boolean] = js.undefined,
    username: String = null
  ): NightwatchTestOptions = {
    val __obj = js.Dynamic.literal(screenshots = screenshots, screenshotsPath = screenshotsPath)
    if (access_key != null) __obj.updateDynamic("access_key")(access_key)
    if (cli_args != null) __obj.updateDynamic("cli_args")(cli_args)
    if (desiredCapabilities != null) __obj.updateDynamic("desiredCapabilities")(desiredCapabilities)
    if (!js.isUndefined(disable_colors)) __obj.updateDynamic("disable_colors")(disable_colors)
    if (!js.isUndefined(end_session_on_fail)) __obj.updateDynamic("end_session_on_fail")(end_session_on_fail)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (globals != null) __obj.updateDynamic("globals")(globals)
    if (launch_url != null) __obj.updateDynamic("launch_url")(launch_url)
    if (!js.isUndefined(log_screenshot_data)) __obj.updateDynamic("log_screenshot_data")(log_screenshot_data)
    if (!js.isUndefined(output)) __obj.updateDynamic("output")(output)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (selenium_host != null) __obj.updateDynamic("selenium_host")(selenium_host)
    if (selenium_port != null) __obj.updateDynamic("selenium_port")(selenium_port.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (!js.isUndefined(skip_testcases_on_fail)) __obj.updateDynamic("skip_testcases_on_fail")(skip_testcases_on_fail)
    if (!js.isUndefined(use_xpath)) __obj.updateDynamic("use_xpath")(use_xpath)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[NightwatchTestOptions]
  }
}

