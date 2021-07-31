package typings.nightwatch.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChromeOptions extends StObject {
  
  /**
    *     List of command-line arguments to use when starting Chrome. Arguments with an associated value should be separated by a '=' sign
    * (e.g., ['start-maximized', 'user-data-dir=/tmp/temp_profile']).
    */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Path to the Chrome executable to use (on Mac OS X, this should be the actual binary, not just the app. e.g.,
    * '/Applications/Google Chrome.app/Contents/MacOS/Google Chrome')
    */
  var binary: js.UndefOr[String] = js.undefined
  
  /**
    * An address of a Chrome debugger server to connect to, in the form of <hostname/ip:port>, e.g. '127.0.0.1:38947'
    */
  var debuggerAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Default: false. If false, Chrome will be quit when ChromeDriver is killed, regardless of whether the session is quit.
    * If true, Chrome will only be quit if the session is quit (or closed). Note, if true, and the session is not quit,
    * ChromeDriver cannot clean up the temporary user data directory that the running Chrome instance is using.
    */
  var detach: js.UndefOr[Boolean] = js.undefined
  
  /**
    * List of Chrome command line switches to exclude that ChromeDriver by default passes when starting Chrome.
    * Do not prefix switches with --.
    */
  var excludeSwitches: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of Chrome extensions to install on startup. Each item in the list should be a base-64 encoded packed Chrome extension (.crx)
    */
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A dictionary with each entry consisting of the name of the preference and its value. These preferences are applied
    * to the Local State file in the user data folder.
    */
  var localState: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * Directory to store Chrome minidumps . (Supported only on Linux.)
    */
  var minidumpPath: js.UndefOr[String] = js.undefined
  
  /**
    * A dictionary with either a value for “deviceName,” or values for “deviceMetrics” and “userAgent.” Refer to Mobile Emulation for more information.
    */
  var mobileEmulation: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * An optional dictionary that specifies performance logging preferences. See below for more information.
    */
  var perfLoggingPrefs: js.UndefOr[ChromePerfLoggingPrefs] = js.undefined
  
  /**
    * A dictionary with each entry consisting of the name of the preference and its value. These preferences are only applied
    * to the user profile in use.
    */
  var prefs: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * Flag to activate W3C WebDriver API. Chromedriver (as of version 2.41 at least) simply does not support the W3C WebDriver API.
    */
  var w3c: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of window types that will appear in the list of window handles. For access to <webview> elements, include "webview" in this list.
    */
  var windowTypes: js.UndefOr[js.Array[String]] = js.undefined
}
object ChromeOptions {
  
  @scala.inline
  def apply(): ChromeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeOptions]
  }
  
  @scala.inline
  implicit class ChromeOptionsMutableBuilder[Self <: ChromeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setBinary(value: String): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    @scala.inline
    def setDebuggerAddress(value: String): Self = StObject.set(x, "debuggerAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerAddressUndefined: Self = StObject.set(x, "debuggerAddress", js.undefined)
    
    @scala.inline
    def setDetach(value: Boolean): Self = StObject.set(x, "detach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachUndefined: Self = StObject.set(x, "detach", js.undefined)
    
    @scala.inline
    def setExcludeSwitches(value: js.Array[String]): Self = StObject.set(x, "excludeSwitches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeSwitchesUndefined: Self = StObject.set(x, "excludeSwitches", js.undefined)
    
    @scala.inline
    def setExcludeSwitchesVarargs(value: String*): Self = StObject.set(x, "excludeSwitches", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setLocalState(value: Record[String, String]): Self = StObject.set(x, "localState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalStateUndefined: Self = StObject.set(x, "localState", js.undefined)
    
    @scala.inline
    def setMinidumpPath(value: String): Self = StObject.set(x, "minidumpPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinidumpPathUndefined: Self = StObject.set(x, "minidumpPath", js.undefined)
    
    @scala.inline
    def setMobileEmulation(value: Record[String, String]): Self = StObject.set(x, "mobileEmulation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileEmulationUndefined: Self = StObject.set(x, "mobileEmulation", js.undefined)
    
    @scala.inline
    def setPerfLoggingPrefs(value: ChromePerfLoggingPrefs): Self = StObject.set(x, "perfLoggingPrefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerfLoggingPrefsUndefined: Self = StObject.set(x, "perfLoggingPrefs", js.undefined)
    
    @scala.inline
    def setPrefs(value: Record[String, String]): Self = StObject.set(x, "prefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefsUndefined: Self = StObject.set(x, "prefs", js.undefined)
    
    @scala.inline
    def setW3c(value: Boolean): Self = StObject.set(x, "w3c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW3cUndefined: Self = StObject.set(x, "w3c", js.undefined)
    
    @scala.inline
    def setWindowTypes(value: js.Array[String]): Self = StObject.set(x, "windowTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowTypesUndefined: Self = StObject.set(x, "windowTypes", js.undefined)
    
    @scala.inline
    def setWindowTypesVarargs(value: String*): Self = StObject.set(x, "windowTypes", js.Array(value :_*))
  }
}
