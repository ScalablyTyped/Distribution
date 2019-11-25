package typings.nightwatch.nightwatchMod

import typings.nightwatch.Anon_Browser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchDesiredCapabilities extends js.Object {
  /**
    * Whether the session should accept all SSL certs by default.
    */
  var acceptSslCerts: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the session can interact with the application cache.
    */
  var applicationCacheEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the session can query for the browser's connectivity and disable it if desired.
    */
  var browserConnectionEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the browser being used; should be one of {android|chrome|firefox|htmlunit|internet explorer|iPhone|iPad|opera|safari}.
    */
  var browserName: js.UndefOr[String] = js.undefined
  /**
    * This is a list of all the Chrome-specific desired capabilities.
    */
  var chromeOptions: js.UndefOr[ChromeOptions] = js.undefined
  /**
    * Whether the session supports CSS selectors when searching for elements.
    */
  var cssSelectorsEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the session can interact with database storage.
    */
  var databaseEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Allows the user to specify whether elements are scrolled into the viewport for interaction to align with the top (0) or bottom (1) of the viewport.
    * The default value is to align with the top of the viewport. Supported in IE and Firefox (since 2.36)
    */
  var elementScrollBehaviour: js.UndefOr[Double] = js.undefined
  /**
    * Whether the session can interact with modal popups, such as window.alert and window.confirm.
    */
  var handlesAlerts: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the session supports executing user supplied JavaScript in the context of the current page (only on HTMLUnitDriver).
    */
  var javascriptEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the session can set and query the browser's location context.
    */
  var locationContextEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * A JSON object describing the logging level of different components in the browser, the driver, or any intermediary WebDriver servers.
    * Available values for most loggers are "OFF", "SEVERE", "WARNING", "INFO", "CONFIG", "FINE", "FINER", "FINEST", "ALL".
    * This produces a JSON object looking something like: {"loggingPrefs": {"driver": "INFO", "server": "OFF", "browser": "FINE"}}.
    */
  var loggingPrefs: js.UndefOr[Anon_Browser] = js.undefined
  /**
    * Whether the session is capable of generating native events when simulating user input.
    */
  var nativeEvents: js.UndefOr[Boolean] = js.undefined
  /**
    * A key specifying which platform the browser should be running on. This value should be one of {WINDOWS|XP|VISTA|MAC|LINUX|UNIX|ANDROID}.
    * When requesting a new session, the client may specify ANY to indicate any available platform may be used.
    * For more information see [GridPlatforms (https://code.google.com/p/selenium/wiki/GridPlatforms)]
    */
  var platform: js.UndefOr[String] = js.undefined
  /**
    * Whether the session can rotate the current page's current layout between portrait and landscape orientations (only applies to mobile platforms).
    */
  var rotatable: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the session supports taking screenshots of the current page.
    */
  var takesScreenShot: js.UndefOr[Boolean] = js.undefined
  /**
    * What the browser should do with an unhandled alert before throwing out the UnhandledAlertException. Possible values are "accept", "dismiss" and "ignore"
    */
  var unexpectedAlertBehaviour: js.UndefOr[String] = js.undefined
  /**
    * The browser version, or the empty string if unknown.
    */
  var version: js.UndefOr[String] = js.undefined
  /**
    * Whether the session supports interactions with storage objects (http://www.w3.org/TR/2009/WD-webstorage-20091029/).
    */
  var webStorageEnabled: js.UndefOr[Boolean] = js.undefined
}

object NightwatchDesiredCapabilities {
  @scala.inline
  def apply(
    acceptSslCerts: js.UndefOr[Boolean] = js.undefined,
    applicationCacheEnabled: js.UndefOr[Boolean] = js.undefined,
    browserConnectionEnabled: js.UndefOr[Boolean] = js.undefined,
    browserName: String = null,
    chromeOptions: ChromeOptions = null,
    cssSelectorsEnabled: js.UndefOr[Boolean] = js.undefined,
    databaseEnabled: js.UndefOr[Boolean] = js.undefined,
    elementScrollBehaviour: Int | Double = null,
    handlesAlerts: js.UndefOr[Boolean] = js.undefined,
    javascriptEnabled: js.UndefOr[Boolean] = js.undefined,
    locationContextEnabled: js.UndefOr[Boolean] = js.undefined,
    loggingPrefs: Anon_Browser = null,
    nativeEvents: js.UndefOr[Boolean] = js.undefined,
    platform: String = null,
    rotatable: js.UndefOr[Boolean] = js.undefined,
    takesScreenShot: js.UndefOr[Boolean] = js.undefined,
    unexpectedAlertBehaviour: String = null,
    version: String = null,
    webStorageEnabled: js.UndefOr[Boolean] = js.undefined
  ): NightwatchDesiredCapabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptSslCerts)) __obj.updateDynamic("acceptSslCerts")(acceptSslCerts.asInstanceOf[js.Any])
    if (!js.isUndefined(applicationCacheEnabled)) __obj.updateDynamic("applicationCacheEnabled")(applicationCacheEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(browserConnectionEnabled)) __obj.updateDynamic("browserConnectionEnabled")(browserConnectionEnabled.asInstanceOf[js.Any])
    if (browserName != null) __obj.updateDynamic("browserName")(browserName.asInstanceOf[js.Any])
    if (chromeOptions != null) __obj.updateDynamic("chromeOptions")(chromeOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(cssSelectorsEnabled)) __obj.updateDynamic("cssSelectorsEnabled")(cssSelectorsEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(databaseEnabled)) __obj.updateDynamic("databaseEnabled")(databaseEnabled.asInstanceOf[js.Any])
    if (elementScrollBehaviour != null) __obj.updateDynamic("elementScrollBehaviour")(elementScrollBehaviour.asInstanceOf[js.Any])
    if (!js.isUndefined(handlesAlerts)) __obj.updateDynamic("handlesAlerts")(handlesAlerts.asInstanceOf[js.Any])
    if (!js.isUndefined(javascriptEnabled)) __obj.updateDynamic("javascriptEnabled")(javascriptEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(locationContextEnabled)) __obj.updateDynamic("locationContextEnabled")(locationContextEnabled.asInstanceOf[js.Any])
    if (loggingPrefs != null) __obj.updateDynamic("loggingPrefs")(loggingPrefs.asInstanceOf[js.Any])
    if (!js.isUndefined(nativeEvents)) __obj.updateDynamic("nativeEvents")(nativeEvents.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (!js.isUndefined(rotatable)) __obj.updateDynamic("rotatable")(rotatable.asInstanceOf[js.Any])
    if (!js.isUndefined(takesScreenShot)) __obj.updateDynamic("takesScreenShot")(takesScreenShot.asInstanceOf[js.Any])
    if (unexpectedAlertBehaviour != null) __obj.updateDynamic("unexpectedAlertBehaviour")(unexpectedAlertBehaviour.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(webStorageEnabled)) __obj.updateDynamic("webStorageEnabled")(webStorageEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchDesiredCapabilities]
  }
}

