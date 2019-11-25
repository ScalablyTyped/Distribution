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
    val __obj = js.Dynamic.literal(screenshots = screenshots.asInstanceOf[js.Any], screenshotsPath = screenshotsPath.asInstanceOf[js.Any])
    if (access_key != null) __obj.updateDynamic("access_key")(access_key.asInstanceOf[js.Any])
    if (cli_args != null) __obj.updateDynamic("cli_args")(cli_args.asInstanceOf[js.Any])
    if (desiredCapabilities != null) __obj.updateDynamic("desiredCapabilities")(desiredCapabilities.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_colors)) __obj.updateDynamic("disable_colors")(disable_colors.asInstanceOf[js.Any])
    if (!js.isUndefined(end_session_on_fail)) __obj.updateDynamic("end_session_on_fail")(end_session_on_fail.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (launch_url != null) __obj.updateDynamic("launch_url")(launch_url.asInstanceOf[js.Any])
    if (!js.isUndefined(log_screenshot_data)) __obj.updateDynamic("log_screenshot_data")(log_screenshot_data.asInstanceOf[js.Any])
    if (!js.isUndefined(output)) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (selenium_host != null) __obj.updateDynamic("selenium_host")(selenium_host.asInstanceOf[js.Any])
    if (selenium_port != null) __obj.updateDynamic("selenium_port")(selenium_port.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (!js.isUndefined(skip_testcases_on_fail)) __obj.updateDynamic("skip_testcases_on_fail")(skip_testcases_on_fail.asInstanceOf[js.Any])
    if (!js.isUndefined(use_xpath)) __obj.updateDynamic("use_xpath")(use_xpath.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchTestOptions]
  }
}

