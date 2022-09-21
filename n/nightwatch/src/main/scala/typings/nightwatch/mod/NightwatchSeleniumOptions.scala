package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchSeleniumOptions extends StObject {
  
  /**
    * Time to wait (in ms) before starting to check the Webdriver server is up and running
    * @default 500
    */
  var check_process_delay: Double
  
  /**
    * Usually not required and only used if start_process is true. Specify the IP address you wish Selenium to listen on.
    */
  var host: String
  
  /**
    * The location where the selenium Selenium-debug.log file will be placed. Defaults to current directory. To disable Selenium logging, set this to false
    */
  var log_path: String | Boolean
  
  /**
    * Maximum number of ping status check attempts before returning a timeout error
    * @default 15
    */
  var max_status_poll_tries: Double
  
  /**
    * The port number Selenium will listen on.
    */
  var port: js.UndefOr[Double] = js.undefined
  
  /**
    * The location of the selenium jar file. This needs to be specified if start_process is enabled.E.g.: lib/selenium-server-standalone-2.43.0.jar
    */
  var server_path: String
  
  /**
    * Whether or not to manage the selenium process automatically.
    * @default false
    */
  var start_process: Boolean
  
  /**
    * Whether or not to automatically start the Selenium session.
    */
  var start_session: Boolean
  
  /**
    * Interval (in ms) to use between status ping checks when checking if the Webdriver server is up and running
    * @default 200
    */
  var status_poll_interval: Double
}
object NightwatchSeleniumOptions {
  
  inline def apply(
    check_process_delay: Double,
    host: String,
    log_path: String | Boolean,
    max_status_poll_tries: Double,
    server_path: String,
    start_process: Boolean,
    start_session: Boolean,
    status_poll_interval: Double
  ): NightwatchSeleniumOptions = {
    val __obj = js.Dynamic.literal(check_process_delay = check_process_delay.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], log_path = log_path.asInstanceOf[js.Any], max_status_poll_tries = max_status_poll_tries.asInstanceOf[js.Any], server_path = server_path.asInstanceOf[js.Any], start_process = start_process.asInstanceOf[js.Any], start_session = start_session.asInstanceOf[js.Any], status_poll_interval = status_poll_interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchSeleniumOptions]
  }
  
  extension [Self <: NightwatchSeleniumOptions](x: Self) {
    
    inline def setCheck_process_delay(value: Double): Self = StObject.set(x, "check_process_delay", value.asInstanceOf[js.Any])
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setLog_path(value: String | Boolean): Self = StObject.set(x, "log_path", value.asInstanceOf[js.Any])
    
    inline def setMax_status_poll_tries(value: Double): Self = StObject.set(x, "max_status_poll_tries", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setServer_path(value: String): Self = StObject.set(x, "server_path", value.asInstanceOf[js.Any])
    
    inline def setStart_process(value: Boolean): Self = StObject.set(x, "start_process", value.asInstanceOf[js.Any])
    
    inline def setStart_session(value: Boolean): Self = StObject.set(x, "start_session", value.asInstanceOf[js.Any])
    
    inline def setStatus_poll_interval(value: Double): Self = StObject.set(x, "status_poll_interval", value.asInstanceOf[js.Any])
  }
}
