package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchTestSettingGeneric extends js.Object {
  /**
    * This field will be used together with username to compute the Authorization header.
    * Like username, the value can be also an environment variable: "access_key" : "${SAUCE_ACCESS_KEY}"
    */
  var access_key: java.lang.String
  /**
    * Same as Selenium settings cli_args. You can override the global cli_args on a per-environment basis.
    */
  var cli_args: js.Any
  /**
    * An object which will be passed to the Selenium WebDriver when a new session will be created. You can specify browser name for instance along with other capabilities.
    * Example:
    *  "desiredCapabilities" : {
    *  "browserName" : "firefox",
    *  "acceptSslCerts" : true
    * }
    * You can view the complete list of capabilities https://code.google.com/p/selenium/wiki/DesiredCapabilities.
    */
  var desiredCapabilities: NightwatchDesiredCapabilities
  /**
    * Use to disable colored output in the terminal.
    */
  var disable_colors: scala.Boolean
  /**
    * End the session automatically when the test is being terminated, usually after a failed assertion.
    */
  var end_session_on_fail: scala.Boolean
  /**
    * An array of folders or file patterns to be skipped (relative to the main source folder).
    * Example: "exclude" : ["excluded-folder"] or: "exclude" : ["test-folder/ *-smoke.js"]
    */
  var exclude: js.Array[java.lang.String]
  /**
    * Folder or file pattern to be used when loading the tests. Files that don't match this patter will be ignored.
    * Example: "filter" : "tests/ *-smoke.js"
    */
  var filter: java.lang.String
  /**
    * An object which will be made available within the test and can be overwritten per environment. Example:"globals" : {  "myGlobal" : "some_global" }
    */
  var globals: js.Any
  /**
    * A url which can be used later in the tests as the main url to load. Can be useful if your tests will run on different environments, each one with a different url.
    */
  var launch_url: java.lang.String
  /**
    * Do not show the Base64 image data in the (verbose) log when taking screenshots.
    */
  var log_screenshot_data: scala.Boolean
  /**
    * Use to disable terminal output completely.
    */
  var output: scala.Boolean
  /**
    * Proxy requests to the selenium server. http, https, socks(v5), socks5, sock4, and pac are accepted. Uses node-proxy-agent. Example: http://user:pass@host:port
    */
  var proxy: java.lang.String
  /**
    * The hostname/IP on which the selenium server is accepting connections.
    */
  var selenium_host: java.lang.String
  /**
    * The port number on which the selenium server is accepting connections.
    */
  var selenium_port: scala.Double
  /**
    * Whether to show extended Selenium command logs.
    */
  var silent: scala.Boolean
  /**
    * Skip the rest of testcases (if any) when one testcase fails..
    */
  var skip_testcases_on_fail: scala.Boolean
  /**
    * Use xpath as the default locator strategy
    */
  var use_xpath: scala.Boolean
  /**
    * In case the selenium server requires credentials this username will be used to compute the Authorization header.
    * The value can be also an environment variable, in which case it will look like this: "username" : "${SAUCE_USERNAME}"
    */
  var username: java.lang.String
}

object NightwatchTestSettingGeneric {
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
    selenium_host: java.lang.String,
    selenium_port: scala.Double,
    silent: scala.Boolean,
    skip_testcases_on_fail: scala.Boolean,
    use_xpath: scala.Boolean,
    username: java.lang.String
  ): NightwatchTestSettingGeneric = {
    val __obj = js.Dynamic.literal(access_key = access_key, cli_args = cli_args, desiredCapabilities = desiredCapabilities, disable_colors = disable_colors, end_session_on_fail = end_session_on_fail, exclude = exclude, filter = filter, globals = globals, launch_url = launch_url, log_screenshot_data = log_screenshot_data, output = output, proxy = proxy, selenium_host = selenium_host, selenium_port = selenium_port, silent = silent, skip_testcases_on_fail = skip_testcases_on_fail, use_xpath = use_xpath, username = username)
  
    __obj.asInstanceOf[NightwatchTestSettingGeneric]
  }
}

