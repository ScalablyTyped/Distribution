package typings.nightwatch.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchTestSettingScreenshots extends NightwatchTestSettingGeneric {
  /**
    * Selenium generates screenshots when command errors occur. With on_failure set to true, also generates screenshots for failing or erroring tests. These are saved on the disk.
    * Since v0.7.5 you can disable screenshots for command errors by setting "on_error" to false.
    * Example:
    * "screenshots" : {
    *      "enabled" : true,
    *      "on_failure" : true,
    *      "on_error" : false,
    *      "path" : ""
    * }
    */
  var screenshots: NightwatchScreenshotOptions
}

object NightwatchTestSettingScreenshots {
  @scala.inline
  def apply(
    access_key: String,
    cli_args: js.Any,
    desiredCapabilities: NightwatchDesiredCapabilities,
    disable_colors: Boolean,
    end_session_on_fail: Boolean,
    exclude: js.Array[String],
    filter: String,
    globals: NightwatchGlobals,
    launch_url: String,
    log_screenshot_data: Boolean,
    output: Boolean,
    proxy: String,
    screenshots: NightwatchScreenshotOptions,
    selenium_host: String,
    selenium_port: Double,
    silent: Boolean,
    skip_testcases_on_fail: Boolean,
    use_xpath: Boolean,
    username: String
  ): NightwatchTestSettingScreenshots = {
    val __obj = js.Dynamic.literal(access_key = access_key, cli_args = cli_args, desiredCapabilities = desiredCapabilities, disable_colors = disable_colors, end_session_on_fail = end_session_on_fail, exclude = exclude, filter = filter, globals = globals, launch_url = launch_url, log_screenshot_data = log_screenshot_data, output = output, proxy = proxy, screenshots = screenshots, selenium_host = selenium_host, selenium_port = selenium_port, silent = silent, skip_testcases_on_fail = skip_testcases_on_fail, use_xpath = use_xpath, username = username)
  
    __obj.asInstanceOf[NightwatchTestSettingScreenshots]
  }
}

