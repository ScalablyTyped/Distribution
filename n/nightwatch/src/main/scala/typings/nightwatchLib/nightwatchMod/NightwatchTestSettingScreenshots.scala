package typings
package nightwatchLib.nightwatchMod

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
    access_key: java.lang.String,
    cli_args: js.Any,
    desiredCapabilities: NightwatchDesiredCapabilities,
    disable_colors: scala.Boolean,
    end_session_on_fail: scala.Boolean,
    exclude: js.Array[java.lang.String],
    filter: java.lang.String,
    globals: js.Any,
    launch_url: java.lang.String,
    log_screenshot_data: scala.Boolean,
    output: scala.Boolean,
    proxy: java.lang.String,
    screenshots: NightwatchScreenshotOptions,
    selenium_host: java.lang.String,
    selenium_port: scala.Double,
    silent: scala.Boolean,
    skip_testcases_on_fail: scala.Boolean,
    use_xpath: scala.Boolean,
    username: java.lang.String
  ): NightwatchTestSettingScreenshots = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("access_key")(access_key)
    __obj.updateDynamic("cli_args")(cli_args)
    __obj.updateDynamic("desiredCapabilities")(desiredCapabilities)
    __obj.updateDynamic("disable_colors")(disable_colors)
    __obj.updateDynamic("end_session_on_fail")(end_session_on_fail)
    __obj.updateDynamic("exclude")(exclude)
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("globals")(globals)
    __obj.updateDynamic("launch_url")(launch_url)
    __obj.updateDynamic("log_screenshot_data")(log_screenshot_data)
    __obj.updateDynamic("output")(output)
    __obj.updateDynamic("proxy")(proxy)
    __obj.updateDynamic("screenshots")(screenshots)
    __obj.updateDynamic("selenium_host")(selenium_host)
    __obj.updateDynamic("selenium_port")(selenium_port)
    __obj.updateDynamic("silent")(silent)
    __obj.updateDynamic("skip_testcases_on_fail")(skip_testcases_on_fail)
    __obj.updateDynamic("use_xpath")(use_xpath)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[NightwatchTestSettingScreenshots]
  }
}

