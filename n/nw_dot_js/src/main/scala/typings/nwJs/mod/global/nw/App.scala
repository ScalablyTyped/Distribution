package typings.nwJs.mod.global.nw

import org.scalablytyped.runtime.TopLevel
import typings.nwJs.nwJsStrings.open
import typings.nwJs.nwJsStrings.reopen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait App extends js.Object {
  
  /**
    * Add an entry to the whitelist used for controlling cross-origin access.
    *
    * @param sourceOrigin {string} The source origin. e.g. https://github.com/
    * @param destinationProtocol {string} The destination protocol where the sourceOrigin can access to. e.g. app
    * @param destinationHost {string} The destination host where the sourceOrigin can access to. e.g. myapp
    * @param allowDestinationSubdomains {Boolean} If set to true, the sourceOrigin is allowed to access subdomains of
    */
  def addOriginAccessWhitelistEntry(
    sourceOrigin: String,
    destinationProtocol: String,
    destinationHost: String,
    allowDestinationSubdomains: Boolean
  ): Unit = js.native
  
  /**
    * Get the filtered command line arguments when starting the app.
    */
  var argv: js.Array[String] = js.native
  
  /**
    * Clear the HTTP cache in memory and the one on disk. This method call is synchronized.
    */
  def clearCache(): Unit = js.native
  
  /**
    * Send the `close` event to all windows of current app.
    */
  def closeAllWindows(): Unit = js.native
  
  /**
    * Crash the browser process to test the Crash dump feature.
    */
  def crashBrowser(): Unit = js.native
  
  /**
    * Crash the renderer process to test the Crash dump feature.
    */
  def crashRenderer(): Unit = js.native
  
  /**
    * Get the application's data path in user's directory.
    */
  var dataPath: String = js.native
  
  /**
    * Get a list of patterns of filtered command line arguments used by `App.argv`.
    */
  var filteredArgv: js.Array[js.Object] = js.native
  
  /**
    * Get all the command line arguments when starting the app.
    */
  var fullArgv: js.Array[String] = js.native
  
  /**
    * Query the proxy to be used for loading `url` in DOM.
    *
    * @param url {string} the URL to query for proxy
    * @returns {string} Proxy config that is in the same format used in PAC (e.g. "DIRECT", "PROXY localhost:8080").
    */
  def getProxyForURL(url: String): String = js.native
  
  /**
    * Get the json object of the manifest file.
    */
  var manifest: js.Any = js.native
  
  def on(event: String, listener: js.Function): this.type = js.native
  /**
    * Emitted when users opened a file with your app.
    *
    * @param event {string} Event name
    * @param listener {Function(args?)} The callback that handles the `open` event.
    * - (optional) args {string} the full command line of the program.
    */
  @JSName("on")
  def on_open(event: open, listener: js.Function1[/* args */ js.UndefOr[String], _]): this.type = js.native
  /**
    * This event is sent when the user clicks the dock icon for an already running application. This is a Mac specific feature.
    *
    * @param event {string} Event name
    * @param listener {Function} The callback that handles the `reopen` event.
    */
  @JSName("on")
  def on_reopen(event: reopen, listener: js.Function0[_]): this.type = js.native
  
  /**
    * Quit current app.
    */
  def quit(): Unit = js.native
  
  /**
    * Register a global keyboard shortcut (also known as system-wide hot key) to the system.
    *
    * @param shortcut {Shortcut} the Shortcut object to register.
    */
  def registerGlobalHotKey(shortcut: Shortcut): Unit = js.native
  
  /**
    * Remove an entry from the whitelist used for controlling cross-origin access.
    *
    * @param sourceOrigin {string} The source origin. e.g. https://github.com/
    * @param destinationProtocol {string} The destination protocol where the sourceOrigin can access to. e.g. app
    * @param destinationHost {string} The destination host where the sourceOrigin can access to. e.g. myapp
    * @param allowDestinationSubdomains {Boolean} If set to true, the sourceOrigin is allowed to access subdomains of
    */
  def removeOriginAccessWhitelistEntry(
    sourceOrigin: String,
    destinationProtocol: String,
    destinationHost: String,
    allowDestinationSubdomains: Boolean
  ): Unit = js.native
  
  /**
    * Set the proxy config which the web engine will be used to request network resources.
    *
    * @param config {string} Proxy rules
    */
  def setProxyConfig(config: String): Unit = js.native
  
  /**
    * Unregisters a global keyboard shortcut.
    *
    * @param shortcut {Shortcut} the Shortcut object to register.
    */
  def unregisterGlobalHotKey(shortcut: Shortcut): Unit = js.native
}
@JSGlobal("nw.App")
@js.native
object App extends TopLevel[App]
