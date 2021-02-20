package typings.nightwatch.mod

import typings.nightwatch.anon.Browser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchDesiredCapabilities extends StObject {
  
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
  implicit class NightwatchDesiredCapabilitiesMutableBuilder[Self <: NightwatchDesiredCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptSslCerts(value: Boolean): Self = StObject.set(x, "acceptSslCerts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptSslCertsUndefined: Self = StObject.set(x, "acceptSslCerts", js.undefined)
    
    @scala.inline
    def setApplicationCacheEnabled(value: Boolean): Self = StObject.set(x, "applicationCacheEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationCacheEnabledUndefined: Self = StObject.set(x, "applicationCacheEnabled", js.undefined)
    
    @scala.inline
    def setBrowserConnectionEnabled(value: Boolean): Self = StObject.set(x, "browserConnectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserConnectionEnabledUndefined: Self = StObject.set(x, "browserConnectionEnabled", js.undefined)
    
    @scala.inline
    def setBrowserName(value: String): Self = StObject.set(x, "browserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserNameUndefined: Self = StObject.set(x, "browserName", js.undefined)
    
    @scala.inline
    def setChromeOptions(value: ChromeOptions): Self = StObject.set(x, "chromeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChromeOptionsUndefined: Self = StObject.set(x, "chromeOptions", js.undefined)
    
    @scala.inline
    def setCssSelectorsEnabled(value: Boolean): Self = StObject.set(x, "cssSelectorsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssSelectorsEnabledUndefined: Self = StObject.set(x, "cssSelectorsEnabled", js.undefined)
    
    @scala.inline
    def setDatabaseEnabled(value: Boolean): Self = StObject.set(x, "databaseEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseEnabledUndefined: Self = StObject.set(x, "databaseEnabled", js.undefined)
    
    @scala.inline
    def setElementScrollBehaviour(value: Double): Self = StObject.set(x, "elementScrollBehaviour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementScrollBehaviourUndefined: Self = StObject.set(x, "elementScrollBehaviour", js.undefined)
    
    @scala.inline
    def setHandlesAlerts(value: Boolean): Self = StObject.set(x, "handlesAlerts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlesAlertsUndefined: Self = StObject.set(x, "handlesAlerts", js.undefined)
    
    @scala.inline
    def setJavascriptEnabled(value: Boolean): Self = StObject.set(x, "javascriptEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavascriptEnabledUndefined: Self = StObject.set(x, "javascriptEnabled", js.undefined)
    
    @scala.inline
    def setLocationContextEnabled(value: Boolean): Self = StObject.set(x, "locationContextEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationContextEnabledUndefined: Self = StObject.set(x, "locationContextEnabled", js.undefined)
    
    @scala.inline
    def setLoggingPrefs(value: Browser): Self = StObject.set(x, "loggingPrefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingPrefsUndefined: Self = StObject.set(x, "loggingPrefs", js.undefined)
    
    @scala.inline
    def setNativeEvents(value: Boolean): Self = StObject.set(x, "nativeEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeEventsUndefined: Self = StObject.set(x, "nativeEvents", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setRotatable(value: Boolean): Self = StObject.set(x, "rotatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotatableUndefined: Self = StObject.set(x, "rotatable", js.undefined)
    
    @scala.inline
    def setTakesScreenShot(value: Boolean): Self = StObject.set(x, "takesScreenShot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTakesScreenShotUndefined: Self = StObject.set(x, "takesScreenShot", js.undefined)
    
    @scala.inline
    def setUnexpectedAlertBehaviour(value: String): Self = StObject.set(x, "unexpectedAlertBehaviour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnexpectedAlertBehaviourUndefined: Self = StObject.set(x, "unexpectedAlertBehaviour", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setWebStorageEnabled(value: Boolean): Self = StObject.set(x, "webStorageEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebStorageEnabledUndefined: Self = StObject.set(x, "webStorageEnabled", js.undefined)
  }
}
