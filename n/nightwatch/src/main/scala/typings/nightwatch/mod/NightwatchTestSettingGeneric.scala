package typings.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchTestSettingGeneric extends js.Object {
  
  /**
    * This field will be used together with username to compute the Authorization header.
    * Like username, the value can be also an environment variable: "access_key" : "${SAUCE_ACCESS_KEY}"
    */
  var access_key: js.UndefOr[String] = js.native
  
  /**
    * Same as Selenium settings cli_args. You can override the global cli_args on a per-environment basis.
    */
  var cli_args: js.UndefOr[js.Any] = js.native
  
  /**
    * An object which will be passed to the Selenium WebDriver when a new session will be created. You can specify browser name for instance along with other capabilities.
    * Example:
    *  "desiredCapabilities" : {
    *  "browserName" : "firefox",
    *  "acceptSslCerts" : true
    * }
    * You can view the complete list of capabilities https://code.google.com/p/selenium/wiki/DesiredCapabilities.
    */
  var desiredCapabilities: js.UndefOr[NightwatchDesiredCapabilities] = js.native
  
  /**
    * Use to disable colored output in the terminal.
    */
  var disable_colors: js.UndefOr[Boolean] = js.native
  
  /**
    * End the session automatically when the test is being terminated, usually after a failed assertion.
    */
  var end_session_on_fail: js.UndefOr[Boolean] = js.native
  
  /**
    * An array of folders or file patterns to be skipped (relative to the main source folder).
    * Example: "exclude" : ["excluded-folder"] or: "exclude" : ["test-folder/ *-smoke.js"]
    */
  var exclude: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Folder or file pattern to be used when loading the tests. Files that don't match this patter will be ignored.
    * Example: "filter" : "tests/ *-smoke.js"
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * An object which will be made available within the test and can be overwritten per environment. Example:"globals" : {  "myGlobal" : "some_global" }
    */
  var globals: js.UndefOr[NightwatchTestHooks] = js.native
  
  /**
    * A url which can be used later in the tests as the main url to load. Can be useful if your tests will run on different environments, each one with a different url.
    */
  var launch_url: js.UndefOr[String] = js.native
  
  /**
    * Do not show the Base64 image data in the (verbose) log when taking screenshots.
    */
  var log_screenshot_data: js.UndefOr[Boolean] = js.native
  
  /**
    * Use to disable terminal output completely.
    */
  var output: js.UndefOr[Boolean] = js.native
  
  /**
    * Proxy requests to the selenium server. http, https, socks(v5), socks5, sock4, and pac are accepted. Uses node-proxy-agent. Example: http://user:pass@host:port
    */
  var proxy: js.UndefOr[String] = js.native
  
  /**
    * The hostname/IP on which the selenium server is accepting connections.
    */
  var selenium_host: js.UndefOr[String] = js.native
  
  /**
    * The port number on which the selenium server is accepting connections.
    */
  var selenium_port: js.UndefOr[Double] = js.native
  
  /**
    * Whether to show extended Selenium command logs.
    */
  var silent: js.UndefOr[Boolean] = js.native
  
  /**
    * Skip the rest of testcases (if any) when one testcase fails..
    */
  var skip_testcases_on_fail: js.UndefOr[Boolean] = js.native
  
  /**
    * Use xpath as the default locator strategy
    */
  var use_xpath: js.UndefOr[Boolean] = js.native
  
  /**
    * In case the selenium server requires credentials this username will be used to compute the Authorization header.
    * The value can be also an environment variable, in which case it will look like this: "username" : "${SAUCE_USERNAME}"
    */
  var username: js.UndefOr[String] = js.native
}
object NightwatchTestSettingGeneric {
  
  @scala.inline
  def apply(): NightwatchTestSettingGeneric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NightwatchTestSettingGeneric]
  }
  
  @scala.inline
  implicit class NightwatchTestSettingGenericOps[Self <: NightwatchTestSettingGeneric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccess_key(value: String): Self = this.set("access_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess_key: Self = this.set("access_key", js.undefined)
    
    @scala.inline
    def setCli_args(value: js.Any): Self = this.set("cli_args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCli_args: Self = this.set("cli_args", js.undefined)
    
    @scala.inline
    def setDesiredCapabilities(value: NightwatchDesiredCapabilities): Self = this.set("desiredCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesiredCapabilities: Self = this.set("desiredCapabilities", js.undefined)
    
    @scala.inline
    def setDisable_colors(value: Boolean): Self = this.set("disable_colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable_colors: Self = this.set("disable_colors", js.undefined)
    
    @scala.inline
    def setEnd_session_on_fail(value: Boolean): Self = this.set("end_session_on_fail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd_session_on_fail: Self = this.set("end_session_on_fail", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setGlobals(value: NightwatchTestHooks): Self = this.set("globals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobals: Self = this.set("globals", js.undefined)
    
    @scala.inline
    def setLaunch_url(value: String): Self = this.set("launch_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunch_url: Self = this.set("launch_url", js.undefined)
    
    @scala.inline
    def setLog_screenshot_data(value: Boolean): Self = this.set("log_screenshot_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog_screenshot_data: Self = this.set("log_screenshot_data", js.undefined)
    
    @scala.inline
    def setOutput(value: Boolean): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setSelenium_host(value: String): Self = this.set("selenium_host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelenium_host: Self = this.set("selenium_host", js.undefined)
    
    @scala.inline
    def setSelenium_port(value: Double): Self = this.set("selenium_port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelenium_port: Self = this.set("selenium_port", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    
    @scala.inline
    def setSkip_testcases_on_fail(value: Boolean): Self = this.set("skip_testcases_on_fail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip_testcases_on_fail: Self = this.set("skip_testcases_on_fail", js.undefined)
    
    @scala.inline
    def setUse_xpath(value: Boolean): Self = this.set("use_xpath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUse_xpath: Self = this.set("use_xpath", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
