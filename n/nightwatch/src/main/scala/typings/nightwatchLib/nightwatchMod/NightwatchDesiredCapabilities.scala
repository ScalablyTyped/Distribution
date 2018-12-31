package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchDesiredCapabilities extends js.Object {
  /**
    * Whether the session should accept all SSL certs by default.
    */
  var acceptSslCerts: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the session can interact with the application cache.
    */
  var applicationCacheEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the session can query for the browser's connectivity and disable it if desired.
    */
  var browserConnectionEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the browser being used; should be one of {android|chrome|firefox|htmlunit|internet explorer|iPhone|iPad|opera|safari}.
    */
  var browserName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the session supports CSS selectors when searching for elements.
    */
  var cssSelectorsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the session can interact with database storage.
    */
  var databaseEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allows the user to specify whether elements are scrolled into the viewport for interaction to align with the top (0) or bottom (1) of the viewport.
    * The default value is to align with the top of the viewport. Supported in IE and Firefox (since 2.36)
    */
  var elementScrollBehaviour: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether the session can interact with modal popups, such as window.alert and window.confirm.
    */
  var handlesAlerts: scala.Boolean
  /**
    * Whether the session supports executing user supplied JavaScript in the context of the current page (only on HTMLUnitDriver).
    */
  var javascriptEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the session can set and query the browser's location context.
    */
  var locationContextEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A JSON object describing the logging level of different components in the browser, the driver, or any intermediary WebDriver servers.
    * Available values for most loggers are "OFF", "SEVERE", "WARNING", "INFO", "CONFIG", "FINE", "FINER", "FINEST", "ALL".
    * This produces a JSON object looking something like: {"loggingPrefs": {"driver": "INFO", "server": "OFF", "browser": "FINE"}}.
    */
  var loggingPrefs: js.UndefOr[nightwatchLib.Anon_Driver] = js.undefined
  /**
    * Whether the session is capable of generating native events when simulating user input.
    */
  var nativeEvents: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A key specifying which platform the browser should be running on. This value should be one of {WINDOWS|XP|VISTA|MAC|LINUX|UNIX|ANDROID}.
    * When requesting a new session, the client may specify ANY to indicate any available platform may be used.
    * For more information see [GridPlatforms (https://code.google.com/p/selenium/wiki/GridPlatforms)]
    */
  var platform: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the session can rotate the current page's current layout between portrait and landscape orientations (only applies to mobile platforms).
    */
  var rotatable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the session supports taking screenshots of the current page.
    */
  var takesScreenShot: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * What the browser should do with an unhandled alert before throwing out the UnhandledAlertException. Possible values are "accept", "dismiss" and "ignore"
    */
  var unexpectedAlertBehaviour: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The browser version, or the empty string if unknown.
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the session supports interactions with storage objects (http://www.w3.org/TR/2009/WD-webstorage-20091029/).
    */
  var webStorageEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

