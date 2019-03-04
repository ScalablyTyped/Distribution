package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchSeleniumOptions extends js.Object {
  /**
    * List of cli arguments to be passed to the Selenium process. Here you can set various options for browser drivers, such as:
    *
    * webdriver.firefox.profile: Selenium will be default create a new Firefox profile for each session.
    * If you wish to use an existing Firefox profile you can specify its name here.
    * Complete list of Firefox Driver arguments available https://code.google.com/p/selenium/wiki/FirefoxDriver.
    *
    * webdriver.chrome.driver: Nightwatch can run the tests using Chrome browser also. To enable this you have to download the ChromeDriver binary
    * (http://chromedriver.storage.googleapis.com/index.html) and specify it's location here. Also don't forget to specify chrome as the browser name in the
    * desiredCapabilities object.
    * More information can be found on the ChromeDriver website (https://sites.google.com/a/chromium.org/chromedriver/).
    *
    * webdriver.ie.driver: Nightwatch has support for Internet Explorer also. To enable this you have to download the IE Driver binary
    * (https://code.google.com/p/selenium/wiki/InternetExplorerDriver) and specify it's location here. Also don't forget to specify "internet explorer" as the browser
    * name in the desiredCapabilities object.
    */
  var cli_args: js.Any
  /**
    * Usually not required and only used if start_process is true. Specify the IP address you wish Selenium to listen on.
    */
  var host: java.lang.String
  /**
    * The location where the selenium Selenium-debug.log file will be placed. Defaults to current directory. To disable Selenium logging, set this to false
    */
  var log_path: java.lang.String | scala.Boolean
  /**
    * The port number Selenium will listen on.
    */
  var port: scala.Double
  /**
    * The location of the selenium jar file. This needs to be specified if start_process is enabled.E.g.: lib/selenium-server-standalone-2.43.0.jar
    */
  var server_path: java.lang.String
  /**
    * Whether or not to manage the selenium process automatically.
    */
  var start_process: scala.Boolean
  /**
    * Whether or not to automatically start the Selenium session.
    */
  var start_session: scala.Boolean
}

object NightwatchSeleniumOptions {
  @scala.inline
  def apply(
    cli_args: js.Any,
    host: java.lang.String,
    log_path: java.lang.String | scala.Boolean,
    port: scala.Double,
    server_path: java.lang.String,
    start_process: scala.Boolean,
    start_session: scala.Boolean
  ): NightwatchSeleniumOptions = {
    val __obj = js.Dynamic.literal(cli_args = cli_args, host = host, log_path = log_path.asInstanceOf[js.Any], port = port, server_path = server_path, start_process = start_process, start_session = start_session)
  
    __obj.asInstanceOf[NightwatchSeleniumOptions]
  }
}

