package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchTestOptions extends NightwatchTestSettingGeneric {
  var screenshots: scala.Boolean
  var screenshotsPath: java.lang.String
}

object NightwatchTestOptions {
  @scala.inline
  def apply(
    access_key: java.lang.String,
    cli_args: js.Any,
    desiredCapabilities: NightwatchDesiredCapabilities,
    disable_colors: scala.Boolean,
    end_session_on_fail: scala.Boolean,
    exclude: js.Array[java.lang.String],
    filter: java.lang.String,
    globals: NightwatchGlobals,
    launch_url: java.lang.String,
    log_screenshot_data: scala.Boolean,
    output: scala.Boolean,
    proxy: java.lang.String,
    screenshots: scala.Boolean,
    screenshotsPath: java.lang.String,
    selenium_host: java.lang.String,
    selenium_port: scala.Double,
    silent: scala.Boolean,
    skip_testcases_on_fail: scala.Boolean,
    use_xpath: scala.Boolean,
    username: java.lang.String
  ): NightwatchTestOptions = {
    val __obj = js.Dynamic.literal(access_key = access_key, cli_args = cli_args, desiredCapabilities = desiredCapabilities, disable_colors = disable_colors, end_session_on_fail = end_session_on_fail, exclude = exclude, filter = filter, globals = globals, launch_url = launch_url, log_screenshot_data = log_screenshot_data, output = output, proxy = proxy, screenshots = screenshots, screenshotsPath = screenshotsPath, selenium_host = selenium_host, selenium_port = selenium_port, silent = silent, skip_testcases_on_fail = skip_testcases_on_fail, use_xpath = use_xpath, username = username)
  
    __obj.asInstanceOf[NightwatchTestOptions]
  }
}

