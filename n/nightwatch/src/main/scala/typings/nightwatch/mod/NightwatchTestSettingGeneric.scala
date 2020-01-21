package typings.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchTestSettingGeneric extends js.Object {
  /**
    * This field will be used together with username to compute the Authorization header.
    * Like username, the value can be also an environment variable: "access_key" : "${SAUCE_ACCESS_KEY}"
    */
  var access_key: js.UndefOr[String] = js.undefined
  /**
    * Same as Selenium settings cli_args. You can override the global cli_args on a per-environment basis.
    */
  var cli_args: js.UndefOr[js.Any] = js.undefined
  /**
    * An object which will be passed to the Selenium WebDriver when a new session will be created. You can specify browser name for instance along with other capabilities.
    * Example:
    *  "desiredCapabilities" : {
    *  "browserName" : "firefox",
    *  "acceptSslCerts" : true
    * }
    * You can view the complete list of capabilities https://code.google.com/p/selenium/wiki/DesiredCapabilities.
    */
  var desiredCapabilities: js.UndefOr[NightwatchDesiredCapabilities] = js.undefined
  /**
    * Use to disable colored output in the terminal.
    */
  var disable_colors: js.UndefOr[Boolean] = js.undefined
  /**
    * End the session automatically when the test is being terminated, usually after a failed assertion.
    */
  var end_session_on_fail: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of folders or file patterns to be skipped (relative to the main source folder).
    * Example: "exclude" : ["excluded-folder"] or: "exclude" : ["test-folder/ *-smoke.js"]
    */
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Folder or file pattern to be used when loading the tests. Files that don't match this patter will be ignored.
    * Example: "filter" : "tests/ *-smoke.js"
    */
  var filter: js.UndefOr[String] = js.undefined
  /**
    * An object which will be made available within the test and can be overwritten per environment. Example:"globals" : {  "myGlobal" : "some_global" }
    */
  var globals: js.UndefOr[NightwatchGlobals] = js.undefined
  /**
    * A url which can be used later in the tests as the main url to load. Can be useful if your tests will run on different environments, each one with a different url.
    */
  var launch_url: js.UndefOr[String] = js.undefined
  /**
    * Do not show the Base64 image data in the (verbose) log when taking screenshots.
    */
  var log_screenshot_data: js.UndefOr[Boolean] = js.undefined
  /**
    * Use to disable terminal output completely.
    */
  var output: js.UndefOr[Boolean] = js.undefined
  /**
    * Proxy requests to the selenium server. http, https, socks(v5), socks5, sock4, and pac are accepted. Uses node-proxy-agent. Example: http://user:pass@host:port
    */
  var proxy: js.UndefOr[String] = js.undefined
  /**
    * The hostname/IP on which the selenium server is accepting connections.
    */
  var selenium_host: js.UndefOr[String] = js.undefined
  /**
    * The port number on which the selenium server is accepting connections.
    */
  var selenium_port: js.UndefOr[Double] = js.undefined
  /**
    * Whether to show extended Selenium command logs.
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * Skip the rest of testcases (if any) when one testcase fails..
    */
  var skip_testcases_on_fail: js.UndefOr[Boolean] = js.undefined
  /**
    * Use xpath as the default locator strategy
    */
  var use_xpath: js.UndefOr[Boolean] = js.undefined
  /**
    * In case the selenium server requires credentials this username will be used to compute the Authorization header.
    * The value can be also an environment variable, in which case it will look like this: "username" : "${SAUCE_USERNAME}"
    */
  var username: js.UndefOr[String] = js.undefined
}

object NightwatchTestSettingGeneric {
  @scala.inline
  def apply(
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
  ): NightwatchTestSettingGeneric = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[NightwatchTestSettingGeneric]
  }
}

