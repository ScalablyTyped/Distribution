package typings.nightwatch.nightwatchMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOptions extends js.Object {
  /**
    * 	List of command-line arguments to use when starting Chrome. Arguments with an associated value should be separated by a '=' sign
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
    * A list of window types that will appear in the list of window handles. For access to <webview> elements, include "webview" in this list.
    */
  var windowTypes: js.UndefOr[js.Array[String]] = js.undefined
}

object ChromeOptions {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    binary: String = null,
    debuggerAddress: String = null,
    detach: js.UndefOr[Boolean] = js.undefined,
    excludeSwitches: js.Array[String] = null,
    extensions: js.Array[String] = null,
    localState: Record[String, String] = null,
    minidumpPath: String = null,
    mobileEmulation: Record[String, String] = null,
    perfLoggingPrefs: ChromePerfLoggingPrefs = null,
    prefs: Record[String, String] = null,
    windowTypes: js.Array[String] = null
  ): ChromeOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    if (binary != null) __obj.updateDynamic("binary")(binary)
    if (debuggerAddress != null) __obj.updateDynamic("debuggerAddress")(debuggerAddress)
    if (!js.isUndefined(detach)) __obj.updateDynamic("detach")(detach)
    if (excludeSwitches != null) __obj.updateDynamic("excludeSwitches")(excludeSwitches)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (localState != null) __obj.updateDynamic("localState")(localState)
    if (minidumpPath != null) __obj.updateDynamic("minidumpPath")(minidumpPath)
    if (mobileEmulation != null) __obj.updateDynamic("mobileEmulation")(mobileEmulation)
    if (perfLoggingPrefs != null) __obj.updateDynamic("perfLoggingPrefs")(perfLoggingPrefs)
    if (prefs != null) __obj.updateDynamic("prefs")(prefs)
    if (windowTypes != null) __obj.updateDynamic("windowTypes")(windowTypes)
    __obj.asInstanceOf[ChromeOptions]
  }
}

