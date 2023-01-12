package typings.nightwatch.mod

import typings.nightwatch.anon.Browser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchDesiredCapabilities extends StObject {
  
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
    * The name of the browser being used; examples: {chrome|firefox|safari|edge|internet explorer|android|iPhone|iPad|opera|brave}.
    */
  var browserName: js.UndefOr[String | Null] = js.undefined
  
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
  var loggingPrefs: js.UndefOr[Browser] = js.undefined
  
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
  
  inline def apply(): NightwatchDesiredCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NightwatchDesiredCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NightwatchDesiredCapabilities] (val x: Self) extends AnyVal {
    
    inline def setAcceptSslCerts(value: Boolean): Self = StObject.set(x, "acceptSslCerts", value.asInstanceOf[js.Any])
    
    inline def setAcceptSslCertsUndefined: Self = StObject.set(x, "acceptSslCerts", js.undefined)
    
    inline def setApplicationCacheEnabled(value: Boolean): Self = StObject.set(x, "applicationCacheEnabled", value.asInstanceOf[js.Any])
    
    inline def setApplicationCacheEnabledUndefined: Self = StObject.set(x, "applicationCacheEnabled", js.undefined)
    
    inline def setBrowserConnectionEnabled(value: Boolean): Self = StObject.set(x, "browserConnectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setBrowserConnectionEnabledUndefined: Self = StObject.set(x, "browserConnectionEnabled", js.undefined)
    
    inline def setBrowserName(value: String): Self = StObject.set(x, "browserName", value.asInstanceOf[js.Any])
    
    inline def setBrowserNameNull: Self = StObject.set(x, "browserName", null)
    
    inline def setBrowserNameUndefined: Self = StObject.set(x, "browserName", js.undefined)
    
    inline def setChromeOptions(value: ChromeOptions): Self = StObject.set(x, "chromeOptions", value.asInstanceOf[js.Any])
    
    inline def setChromeOptionsUndefined: Self = StObject.set(x, "chromeOptions", js.undefined)
    
    inline def setCssSelectorsEnabled(value: Boolean): Self = StObject.set(x, "cssSelectorsEnabled", value.asInstanceOf[js.Any])
    
    inline def setCssSelectorsEnabledUndefined: Self = StObject.set(x, "cssSelectorsEnabled", js.undefined)
    
    inline def setDatabaseEnabled(value: Boolean): Self = StObject.set(x, "databaseEnabled", value.asInstanceOf[js.Any])
    
    inline def setDatabaseEnabledUndefined: Self = StObject.set(x, "databaseEnabled", js.undefined)
    
    inline def setElementScrollBehaviour(value: Double): Self = StObject.set(x, "elementScrollBehaviour", value.asInstanceOf[js.Any])
    
    inline def setElementScrollBehaviourUndefined: Self = StObject.set(x, "elementScrollBehaviour", js.undefined)
    
    inline def setHandlesAlerts(value: Boolean): Self = StObject.set(x, "handlesAlerts", value.asInstanceOf[js.Any])
    
    inline def setHandlesAlertsUndefined: Self = StObject.set(x, "handlesAlerts", js.undefined)
    
    inline def setJavascriptEnabled(value: Boolean): Self = StObject.set(x, "javascriptEnabled", value.asInstanceOf[js.Any])
    
    inline def setJavascriptEnabledUndefined: Self = StObject.set(x, "javascriptEnabled", js.undefined)
    
    inline def setLocationContextEnabled(value: Boolean): Self = StObject.set(x, "locationContextEnabled", value.asInstanceOf[js.Any])
    
    inline def setLocationContextEnabledUndefined: Self = StObject.set(x, "locationContextEnabled", js.undefined)
    
    inline def setLoggingPrefs(value: Browser): Self = StObject.set(x, "loggingPrefs", value.asInstanceOf[js.Any])
    
    inline def setLoggingPrefsUndefined: Self = StObject.set(x, "loggingPrefs", js.undefined)
    
    inline def setNativeEvents(value: Boolean): Self = StObject.set(x, "nativeEvents", value.asInstanceOf[js.Any])
    
    inline def setNativeEventsUndefined: Self = StObject.set(x, "nativeEvents", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setRotatable(value: Boolean): Self = StObject.set(x, "rotatable", value.asInstanceOf[js.Any])
    
    inline def setRotatableUndefined: Self = StObject.set(x, "rotatable", js.undefined)
    
    inline def setTakesScreenShot(value: Boolean): Self = StObject.set(x, "takesScreenShot", value.asInstanceOf[js.Any])
    
    inline def setTakesScreenShotUndefined: Self = StObject.set(x, "takesScreenShot", js.undefined)
    
    inline def setUnexpectedAlertBehaviour(value: String): Self = StObject.set(x, "unexpectedAlertBehaviour", value.asInstanceOf[js.Any])
    
    inline def setUnexpectedAlertBehaviourUndefined: Self = StObject.set(x, "unexpectedAlertBehaviour", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWebStorageEnabled(value: Boolean): Self = StObject.set(x, "webStorageEnabled", value.asInstanceOf[js.Any])
    
    inline def setWebStorageEnabledUndefined: Self = StObject.set(x, "webStorageEnabled", js.undefined)
  }
}
