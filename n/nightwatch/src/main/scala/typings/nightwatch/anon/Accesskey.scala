package typings.nightwatch.anon

import typings.nightwatch.mod.TimeoutOptions
import typings.nightwatch.nightwatchBooleans.`false`
import typings.nightwatch.nightwatchStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accesskey extends StObject {
  
  /**
    * This field will be used together with username to compute the Authorization header.
    *
    * Like username, the value can be also an environment variable:
    * "access_key" : "${SAUCE_ACCESS_KEY}"
    *
    * @default none
    */
  var access_key: String
  
  /**
    * Configures the ChromeDriver to launch Chrome on Android via adb.
    */
  var android_chrome: js.UndefOr[`false`] = js.undefined
  
  /**
    * Time to wait (in ms) before starting to check the Webdriver server is up and running.
    *
    * @default 100
    */
  var check_process_delay: Double
  
  /**
    * Sets the path to the Chrome binary to use.
    * On Mac OS X, this path should reference the actual Chrome executable,
    * not just the application binary (e.g. "/Applications/Google Chrome.app/Contents/MacOS/Google Chrome").
    */
  var chrome_binary: js.UndefOr[_empty] = js.undefined
  
  /**
    * Sets the path to Chrome's log file. This path should exist on the machine that will launch Chrome.
    */
  var chrome_log_file: js.UndefOr[_empty] = js.undefined
  
  /**
    * List of cli arguments to be passed to the Webdriver process. This varies for each Webdriver implementation.
    *
    * @default none
    */
  var cli_args: Any
  
  /**
    * Needed sometimes when using a Selenium Server. The prefix to be added to to all requests (e.g. /wd/hub).
    */
  var default_path_prefix: String
  
  /**
    * Sets the path to the Edge binary to use. This path should exist on the machine that will launch Edge.
    */
  var edge_binary: js.UndefOr[_empty] = js.undefined
  
  /**
    * Sets the path to the Edge binary to use.
    */
  var edge_log_file: js.UndefOr[_empty] = js.undefined
  
  /**
    * Sets the binary to use. The binary may be specified as the path to a Firefox executable or a desired release Channel. This path should exist on the machine that will launch Firefox.
    */
  var firefox_binary: js.UndefOr[_empty] = js.undefined
  
  /**
    * Sets the path to an existing profile to use as a template for new browser sessions.
    * This profile will be copied for each new session - changes will not be applied to the profile itself.
    */
  var firefox_profile: js.UndefOr[_empty] = js.undefined
  
  /**
    * Only needed when the Webdriver service is running on a different machine.
    */
  var host: String
  
  /**
    * The location where the Webdriver service log file output.log file will be placed. Defaults to current directory.
    * To disable Webdriver logging, set this to false.
    * @default none
    */
  var log_path: String | Boolean
  
  /**
    * Maximum number of ping status check attempts when checking if the Webdriver server is up and running before returning a timeout error.
    *
    * @default 5
    */
  var max_status_poll_tries: Double
  
  /**
    * The port number on which the Webdriver service will listen and/or on which Nightwatch will attempt to connect.
    */
  var port: Double
  
  /**
    * The entire time (in ms) to wait for the Node.js process to be created and running (default is 2 min), including spawning the child process and checking the status.
    *
    * @default 120000
    */
  var process_create_timeout: Double
  
  /**
    * Proxy requests to the Webdriver (or Selenium) service. http, https, socks(v5), socks5, sock4, and pac are accepted. Uses node-proxy-agent.
    *
    * @example http://user:pass@host:port
    * @default none
    */
  var proxy: String
  
  /**
    * Only useful if start_process is enabled.
    * @default none
    */
  var server_path: String
  
  /**
    * Should be set to true if connecting to a remote (cloud) service via HTTPS. Also don't forget to set port to 443.
    */
  var ssl: Boolean
  
  /**
    * When this is enabled, the Webdriver server is run in background in a child process and started/stopped automatically.
    * Nightwatch includes support for managing Chromedriver, Geckodriver (Firefox), Safaridriver, and Selenium Server. Please refer to the Install Webdriver section for details.
    * @default false
    */
  var start_process: Boolean
  
  /**
    * Interval (in ms) to use between status ping checks when checking if the Webdriver server is up and running.
    *
    * @default 100
    */
  var status_poll_interval: Double
  
  /**
    * Requests to the Webdriver service will timeout in timeout miliseconds; a retry will happen retry_attempts number of times.
    *
    * @example {timeout: 15000, retry_attempts: 5}
    */
  var timeout_options: TimeoutOptions
  
  /**
    * Some Webdriver implementations (Safari, Edge) support both the W3C Webdriver API as well as the legacy JSON Wire (Selenium) API.
    *
    * @default false
    */
  var use_legacy_jsonwire: Boolean
  
  /**
    * Usually only needed for cloud testing Selenium services. In case the server requires credentials this username will be used to compute the Authorization header.
    *
    * The value can be also an environment variable, in which case it will look like this:
    * "username" : "${SAUCE_USERNAME}"
    *
    * @default none
    */
  var username: String
}
object Accesskey {
  
  inline def apply(
    access_key: String,
    check_process_delay: Double,
    cli_args: Any,
    default_path_prefix: String,
    host: String,
    log_path: String | Boolean,
    max_status_poll_tries: Double,
    port: Double,
    process_create_timeout: Double,
    proxy: String,
    server_path: String,
    ssl: Boolean,
    start_process: Boolean,
    status_poll_interval: Double,
    timeout_options: TimeoutOptions,
    use_legacy_jsonwire: Boolean,
    username: String
  ): Accesskey = {
    val __obj = js.Dynamic.literal(access_key = access_key.asInstanceOf[js.Any], check_process_delay = check_process_delay.asInstanceOf[js.Any], cli_args = cli_args.asInstanceOf[js.Any], default_path_prefix = default_path_prefix.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], log_path = log_path.asInstanceOf[js.Any], max_status_poll_tries = max_status_poll_tries.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], process_create_timeout = process_create_timeout.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any], server_path = server_path.asInstanceOf[js.Any], ssl = ssl.asInstanceOf[js.Any], start_process = start_process.asInstanceOf[js.Any], status_poll_interval = status_poll_interval.asInstanceOf[js.Any], timeout_options = timeout_options.asInstanceOf[js.Any], use_legacy_jsonwire = use_legacy_jsonwire.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accesskey]
  }
  
  extension [Self <: Accesskey](x: Self) {
    
    inline def setAccess_key(value: String): Self = StObject.set(x, "access_key", value.asInstanceOf[js.Any])
    
    inline def setAndroid_chrome(value: `false`): Self = StObject.set(x, "android_chrome", value.asInstanceOf[js.Any])
    
    inline def setAndroid_chromeUndefined: Self = StObject.set(x, "android_chrome", js.undefined)
    
    inline def setCheck_process_delay(value: Double): Self = StObject.set(x, "check_process_delay", value.asInstanceOf[js.Any])
    
    inline def setChrome_binary(value: _empty): Self = StObject.set(x, "chrome_binary", value.asInstanceOf[js.Any])
    
    inline def setChrome_binaryUndefined: Self = StObject.set(x, "chrome_binary", js.undefined)
    
    inline def setChrome_log_file(value: _empty): Self = StObject.set(x, "chrome_log_file", value.asInstanceOf[js.Any])
    
    inline def setChrome_log_fileUndefined: Self = StObject.set(x, "chrome_log_file", js.undefined)
    
    inline def setCli_args(value: Any): Self = StObject.set(x, "cli_args", value.asInstanceOf[js.Any])
    
    inline def setDefault_path_prefix(value: String): Self = StObject.set(x, "default_path_prefix", value.asInstanceOf[js.Any])
    
    inline def setEdge_binary(value: _empty): Self = StObject.set(x, "edge_binary", value.asInstanceOf[js.Any])
    
    inline def setEdge_binaryUndefined: Self = StObject.set(x, "edge_binary", js.undefined)
    
    inline def setEdge_log_file(value: _empty): Self = StObject.set(x, "edge_log_file", value.asInstanceOf[js.Any])
    
    inline def setEdge_log_fileUndefined: Self = StObject.set(x, "edge_log_file", js.undefined)
    
    inline def setFirefox_binary(value: _empty): Self = StObject.set(x, "firefox_binary", value.asInstanceOf[js.Any])
    
    inline def setFirefox_binaryUndefined: Self = StObject.set(x, "firefox_binary", js.undefined)
    
    inline def setFirefox_profile(value: _empty): Self = StObject.set(x, "firefox_profile", value.asInstanceOf[js.Any])
    
    inline def setFirefox_profileUndefined: Self = StObject.set(x, "firefox_profile", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setLog_path(value: String | Boolean): Self = StObject.set(x, "log_path", value.asInstanceOf[js.Any])
    
    inline def setMax_status_poll_tries(value: Double): Self = StObject.set(x, "max_status_poll_tries", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setProcess_create_timeout(value: Double): Self = StObject.set(x, "process_create_timeout", value.asInstanceOf[js.Any])
    
    inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setServer_path(value: String): Self = StObject.set(x, "server_path", value.asInstanceOf[js.Any])
    
    inline def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    inline def setStart_process(value: Boolean): Self = StObject.set(x, "start_process", value.asInstanceOf[js.Any])
    
    inline def setStatus_poll_interval(value: Double): Self = StObject.set(x, "status_poll_interval", value.asInstanceOf[js.Any])
    
    inline def setTimeout_options(value: TimeoutOptions): Self = StObject.set(x, "timeout_options", value.asInstanceOf[js.Any])
    
    inline def setUse_legacy_jsonwire(value: Boolean): Self = StObject.set(x, "use_legacy_jsonwire", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
