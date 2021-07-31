package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchTestSettingGeneric extends StObject {
  
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
  var globals: js.UndefOr[NightwatchTestHooks] = js.undefined
  
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
  def apply(): NightwatchTestSettingGeneric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NightwatchTestSettingGeneric]
  }
  
  @scala.inline
  implicit class NightwatchTestSettingGenericMutableBuilder[Self <: NightwatchTestSettingGeneric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess_key(value: String): Self = StObject.set(x, "access_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccess_keyUndefined: Self = StObject.set(x, "access_key", js.undefined)
    
    @scala.inline
    def setCli_args(value: js.Any): Self = StObject.set(x, "cli_args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCli_argsUndefined: Self = StObject.set(x, "cli_args", js.undefined)
    
    @scala.inline
    def setDesiredCapabilities(value: NightwatchDesiredCapabilities): Self = StObject.set(x, "desiredCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredCapabilitiesUndefined: Self = StObject.set(x, "desiredCapabilities", js.undefined)
    
    @scala.inline
    def setDisable_colors(value: Boolean): Self = StObject.set(x, "disable_colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisable_colorsUndefined: Self = StObject.set(x, "disable_colors", js.undefined)
    
    @scala.inline
    def setEnd_session_on_fail(value: Boolean): Self = StObject.set(x, "end_session_on_fail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_session_on_failUndefined: Self = StObject.set(x, "end_session_on_fail", js.undefined)
    
    @scala.inline
    def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setGlobals(value: NightwatchTestHooks): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
    
    @scala.inline
    def setLaunch_url(value: String): Self = StObject.set(x, "launch_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunch_urlUndefined: Self = StObject.set(x, "launch_url", js.undefined)
    
    @scala.inline
    def setLog_screenshot_data(value: Boolean): Self = StObject.set(x, "log_screenshot_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog_screenshot_dataUndefined: Self = StObject.set(x, "log_screenshot_data", js.undefined)
    
    @scala.inline
    def setOutput(value: Boolean): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    @scala.inline
    def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    @scala.inline
    def setSelenium_host(value: String): Self = StObject.set(x, "selenium_host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelenium_hostUndefined: Self = StObject.set(x, "selenium_host", js.undefined)
    
    @scala.inline
    def setSelenium_port(value: Double): Self = StObject.set(x, "selenium_port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelenium_portUndefined: Self = StObject.set(x, "selenium_port", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setSkip_testcases_on_fail(value: Boolean): Self = StObject.set(x, "skip_testcases_on_fail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkip_testcases_on_failUndefined: Self = StObject.set(x, "skip_testcases_on_fail", js.undefined)
    
    @scala.inline
    def setUse_xpath(value: Boolean): Self = StObject.set(x, "use_xpath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse_xpathUndefined: Self = StObject.set(x, "use_xpath", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
