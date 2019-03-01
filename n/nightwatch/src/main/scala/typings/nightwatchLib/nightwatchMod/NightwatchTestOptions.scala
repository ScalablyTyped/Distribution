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
    globals: js.Any,
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
    __obj.updateDynamic("screenshotsPath")(screenshotsPath)
    __obj.updateDynamic("selenium_host")(selenium_host)
    __obj.updateDynamic("selenium_port")(selenium_port)
    __obj.updateDynamic("silent")(silent)
    __obj.updateDynamic("skip_testcases_on_fail")(skip_testcases_on_fail)
    __obj.updateDynamic("use_xpath")(use_xpath)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[NightwatchTestOptions]
  }
}

