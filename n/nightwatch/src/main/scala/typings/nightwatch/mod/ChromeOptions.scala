package typings.nightwatch.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromeOptions extends js.Object {
  /**
    *     List of command-line arguments to use when starting Chrome. Arguments with an associated value should be separated by a '=' sign
    * (e.g., ['start-maximized', 'user-data-dir=/tmp/temp_profile']).
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  /**
    * Path to the Chrome executable to use (on Mac OS X, this should be the actual binary, not just the app. e.g.,
    * '/Applications/Google Chrome.app/Contents/MacOS/Google Chrome')
    */
  var binary: js.UndefOr[String] = js.native
  /**
    * An address of a Chrome debugger server to connect to, in the form of <hostname/ip:port>, e.g. '127.0.0.1:38947'
    */
  var debuggerAddress: js.UndefOr[String] = js.native
  /**
    * Default: false. If false, Chrome will be quit when ChromeDriver is killed, regardless of whether the session is quit.
    * If true, Chrome will only be quit if the session is quit (or closed). Note, if true, and the session is not quit,
    * ChromeDriver cannot clean up the temporary user data directory that the running Chrome instance is using.
    */
  var detach: js.UndefOr[Boolean] = js.native
  /**
    * List of Chrome command line switches to exclude that ChromeDriver by default passes when starting Chrome.
    * Do not prefix switches with --.
    */
  var excludeSwitches: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of Chrome extensions to install on startup. Each item in the list should be a base-64 encoded packed Chrome extension (.crx)
    */
  var extensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * A dictionary with each entry consisting of the name of the preference and its value. These preferences are applied
    * to the Local State file in the user data folder.
    */
  var localState: js.UndefOr[Record[String, String]] = js.native
  /**
    * Directory to store Chrome minidumps . (Supported only on Linux.)
    */
  var minidumpPath: js.UndefOr[String] = js.native
  /**
    * A dictionary with either a value for “deviceName,” or values for “deviceMetrics” and “userAgent.” Refer to Mobile Emulation for more information.
    */
  var mobileEmulation: js.UndefOr[Record[String, String]] = js.native
  /**
    * An optional dictionary that specifies performance logging preferences. See below for more information.
    */
  var perfLoggingPrefs: js.UndefOr[ChromePerfLoggingPrefs] = js.native
  /**
    * A dictionary with each entry consisting of the name of the preference and its value. These preferences are only applied
    * to the user profile in use.
    */
  var prefs: js.UndefOr[Record[String, String]] = js.native
  /**
    * Flag to activate W3C WebDriver API. Chromedriver (as of version 2.41 at least) simply does not support the W3C WebDriver API.
    */
  var w3c: js.UndefOr[Boolean] = js.native
  /**
    * A list of window types that will appear in the list of window handles. For access to <webview> elements, include "webview" in this list.
    */
  var windowTypes: js.UndefOr[js.Array[String]] = js.native
}

object ChromeOptions {
  @scala.inline
  def apply(): ChromeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeOptions]
  }
  @scala.inline
  implicit class ChromeOptionsOps[Self <: ChromeOptions] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setBinary(value: String): Self = this.set("binary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    @scala.inline
    def setDebuggerAddress(value: String): Self = this.set("debuggerAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebuggerAddress: Self = this.set("debuggerAddress", js.undefined)
    @scala.inline
    def setDetach(value: Boolean): Self = this.set("detach", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetach: Self = this.set("detach", js.undefined)
    @scala.inline
    def setExcludeSwitchesVarargs(value: String*): Self = this.set("excludeSwitches", js.Array(value :_*))
    @scala.inline
    def setExcludeSwitches(value: js.Array[String]): Self = this.set("excludeSwitches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeSwitches: Self = this.set("excludeSwitches", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setLocalState(value: Record[String, String]): Self = this.set("localState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalState: Self = this.set("localState", js.undefined)
    @scala.inline
    def setMinidumpPath(value: String): Self = this.set("minidumpPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinidumpPath: Self = this.set("minidumpPath", js.undefined)
    @scala.inline
    def setMobileEmulation(value: Record[String, String]): Self = this.set("mobileEmulation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobileEmulation: Self = this.set("mobileEmulation", js.undefined)
    @scala.inline
    def setPerfLoggingPrefs(value: ChromePerfLoggingPrefs): Self = this.set("perfLoggingPrefs", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerfLoggingPrefs: Self = this.set("perfLoggingPrefs", js.undefined)
    @scala.inline
    def setPrefs(value: Record[String, String]): Self = this.set("prefs", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefs: Self = this.set("prefs", js.undefined)
    @scala.inline
    def setW3c(value: Boolean): Self = this.set("w3c", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteW3c: Self = this.set("w3c", js.undefined)
    @scala.inline
    def setWindowTypesVarargs(value: String*): Self = this.set("windowTypes", js.Array(value :_*))
    @scala.inline
    def setWindowTypes(value: js.Array[String]): Self = this.set("windowTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowTypes: Self = this.set("windowTypes", js.undefined)
  }
  
}

