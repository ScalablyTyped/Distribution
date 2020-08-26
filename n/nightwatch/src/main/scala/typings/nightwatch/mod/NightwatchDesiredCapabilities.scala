package typings.nightwatch.mod

import typings.nightwatch.anon.Browser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NightwatchDesiredCapabilities extends js.Object {
  /**
    * Whether the session should accept all SSL certs by default.
    */
  var acceptSslCerts: js.UndefOr[Boolean] = js.native
  /**
    * Whether the session can interact with the application cache.
    */
  var applicationCacheEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the session can query for the browser's connectivity and disable it if desired.
    */
  var browserConnectionEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The name of the browser being used; should be one of {android|chrome|firefox|htmlunit|internet explorer|iPhone|iPad|opera|safari}.
    */
  var browserName: js.UndefOr[String] = js.native
  /**
    * This is a list of all the Chrome-specific desired capabilities.
    */
  var chromeOptions: js.UndefOr[ChromeOptions] = js.native
  /**
    * Whether the session supports CSS selectors when searching for elements.
    */
  var cssSelectorsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the session can interact with database storage.
    */
  var databaseEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Allows the user to specify whether elements are scrolled into the viewport for interaction to align with the top (0) or bottom (1) of the viewport.
    * The default value is to align with the top of the viewport. Supported in IE and Firefox (since 2.36)
    */
  var elementScrollBehaviour: js.UndefOr[Double] = js.native
  /**
    * Whether the session can interact with modal popups, such as window.alert and window.confirm.
    */
  var handlesAlerts: js.UndefOr[Boolean] = js.native
  /**
    * Whether the session supports executing user supplied JavaScript in the context of the current page (only on HTMLUnitDriver).
    */
  var javascriptEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the session can set and query the browser's location context.
    */
  var locationContextEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A JSON object describing the logging level of different components in the browser, the driver, or any intermediary WebDriver servers.
    * Available values for most loggers are "OFF", "SEVERE", "WARNING", "INFO", "CONFIG", "FINE", "FINER", "FINEST", "ALL".
    * This produces a JSON object looking something like: {"loggingPrefs": {"driver": "INFO", "server": "OFF", "browser": "FINE"}}.
    */
  var loggingPrefs: js.UndefOr[Browser] = js.native
  /**
    * Whether the session is capable of generating native events when simulating user input.
    */
  var nativeEvents: js.UndefOr[Boolean] = js.native
  /**
    * A key specifying which platform the browser should be running on. This value should be one of {WINDOWS|XP|VISTA|MAC|LINUX|UNIX|ANDROID}.
    * When requesting a new session, the client may specify ANY to indicate any available platform may be used.
    * For more information see [GridPlatforms (https://code.google.com/p/selenium/wiki/GridPlatforms)]
    */
  var platform: js.UndefOr[String] = js.native
  /**
    * Whether the session can rotate the current page's current layout between portrait and landscape orientations (only applies to mobile platforms).
    */
  var rotatable: js.UndefOr[Boolean] = js.native
  /**
    * Whether the session supports taking screenshots of the current page.
    */
  var takesScreenShot: js.UndefOr[Boolean] = js.native
  /**
    * What the browser should do with an unhandled alert before throwing out the UnhandledAlertException. Possible values are "accept", "dismiss" and "ignore"
    */
  var unexpectedAlertBehaviour: js.UndefOr[String] = js.native
  /**
    * The browser version, or the empty string if unknown.
    */
  var version: js.UndefOr[String] = js.native
  /**
    * Whether the session supports interactions with storage objects (http://www.w3.org/TR/2009/WD-webstorage-20091029/).
    */
  var webStorageEnabled: js.UndefOr[Boolean] = js.native
}

object NightwatchDesiredCapabilities {
  @scala.inline
  def apply(): NightwatchDesiredCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NightwatchDesiredCapabilities]
  }
  @scala.inline
  implicit class NightwatchDesiredCapabilitiesOps[Self <: NightwatchDesiredCapabilities] (val x: Self) extends AnyVal {
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
    def setAcceptSslCerts(value: Boolean): Self = this.set("acceptSslCerts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptSslCerts: Self = this.set("acceptSslCerts", js.undefined)
    @scala.inline
    def setApplicationCacheEnabled(value: Boolean): Self = this.set("applicationCacheEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationCacheEnabled: Self = this.set("applicationCacheEnabled", js.undefined)
    @scala.inline
    def setBrowserConnectionEnabled(value: Boolean): Self = this.set("browserConnectionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserConnectionEnabled: Self = this.set("browserConnectionEnabled", js.undefined)
    @scala.inline
    def setBrowserName(value: String): Self = this.set("browserName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserName: Self = this.set("browserName", js.undefined)
    @scala.inline
    def setChromeOptions(value: ChromeOptions): Self = this.set("chromeOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChromeOptions: Self = this.set("chromeOptions", js.undefined)
    @scala.inline
    def setCssSelectorsEnabled(value: Boolean): Self = this.set("cssSelectorsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssSelectorsEnabled: Self = this.set("cssSelectorsEnabled", js.undefined)
    @scala.inline
    def setDatabaseEnabled(value: Boolean): Self = this.set("databaseEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabaseEnabled: Self = this.set("databaseEnabled", js.undefined)
    @scala.inline
    def setElementScrollBehaviour(value: Double): Self = this.set("elementScrollBehaviour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementScrollBehaviour: Self = this.set("elementScrollBehaviour", js.undefined)
    @scala.inline
    def setHandlesAlerts(value: Boolean): Self = this.set("handlesAlerts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandlesAlerts: Self = this.set("handlesAlerts", js.undefined)
    @scala.inline
    def setJavascriptEnabled(value: Boolean): Self = this.set("javascriptEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJavascriptEnabled: Self = this.set("javascriptEnabled", js.undefined)
    @scala.inline
    def setLocationContextEnabled(value: Boolean): Self = this.set("locationContextEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationContextEnabled: Self = this.set("locationContextEnabled", js.undefined)
    @scala.inline
    def setLoggingPrefs(value: Browser): Self = this.set("loggingPrefs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingPrefs: Self = this.set("loggingPrefs", js.undefined)
    @scala.inline
    def setNativeEvents(value: Boolean): Self = this.set("nativeEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNativeEvents: Self = this.set("nativeEvents", js.undefined)
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setRotatable(value: Boolean): Self = this.set("rotatable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotatable: Self = this.set("rotatable", js.undefined)
    @scala.inline
    def setTakesScreenShot(value: Boolean): Self = this.set("takesScreenShot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTakesScreenShot: Self = this.set("takesScreenShot", js.undefined)
    @scala.inline
    def setUnexpectedAlertBehaviour(value: String): Self = this.set("unexpectedAlertBehaviour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnexpectedAlertBehaviour: Self = this.set("unexpectedAlertBehaviour", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setWebStorageEnabled(value: Boolean): Self = this.set("webStorageEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebStorageEnabled: Self = this.set("webStorageEnabled", js.undefined)
  }
  
}

