package typings
package nwDotJsLib.nwNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends js.Object {
  /**
    * Get the filtered command line arguments when starting the app.
    */
  var argv: js.Array[java.lang.String] = js.native
  /**
    * Get the application's data path in user's directory.
    */
  var dataPath: java.lang.String = js.native
  /**
    * Get a list of patterns of filtered command line arguments used by `App.argv`.
    */
  var filteredArgv: js.Array[js.Object] = js.native
  /**
    * Get all the command line arguments when starting the app.
    */
  var fullArgv: js.Array[java.lang.String] = js.native
  /**
    * Get the json object of the manifest file.
    */
  var manifest: js.Any = js.native
  /**
    * Add an entry to the whitelist used for controlling cross-origin access.
    *
    * @param sourceOrigin {string} The source origin. e.g. https://github.com/
    * @param destinationProtocol {string} The destination protocol where the sourceOrigin can access to. e.g. app
    * @param destinationHost {string} The destination host where the sourceOrigin can access to. e.g. myapp
    * @param allowDestinationSubdomains {Boolean} If set to true, the sourceOrigin is allowed to access subdomains of
    */
  def addOriginAccessWhitelistEntry(
    sourceOrigin: java.lang.String,
    destinationProtocol: java.lang.String,
    destinationHost: java.lang.String,
    allowDestinationSubdomains: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Clear the HTTP cache in memory and the one on disk. This method call is synchronized.
    */
  def clearCache(): scala.Unit = js.native
  /**
    * Send the `close` event to all windows of current app.
    */
  def closeAllWindows(): scala.Unit = js.native
  /**
    * Crash the browser process to test the Crash dump feature.
    */
  def crashBrowser(): scala.Unit = js.native
  /**
    * Crash the renderer process to test the Crash dump feature.
    */
  def crashRenderer(): scala.Unit = js.native
  /**
    * Query the proxy to be used for loading `url` in DOM.
    *
    * @param url {string} the URL to query for proxy
    * @returns {string} Proxy config that is in the same format used in PAC (e.g. "DIRECT", "PROXY localhost:8080").
    */
  def getProxyForURL(url: java.lang.String): java.lang.String = js.native
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  /**
    * Emitted when users opened a file with your app.
    *
    * @param event {string} Event name
    * @param listener {Function(args?)} The callback that handles the `open` event.
    * - (optional) args {string} the full command line of the program.
    */
  @JSName("on")
  def on_open(
    event: nwDotJsLib.nwDotJsLibStrings.open,
    listener: js.Function1[/* args */ js.UndefOr[java.lang.String], _]
  ): this.type = js.native
  /**
    * This event is sent when the user clicks the dock icon for an already running application. This is a Mac specific feature.
    *
    * @param event {string} Event name
    * @param listener {Function} The callback that handles the `reopen` event.
    */
  @JSName("on")
  def on_reopen(event: nwDotJsLib.nwDotJsLibStrings.reopen, listener: js.Function0[_]): this.type = js.native
  /**
    * Quit current app.
    */
  def quit(): scala.Unit = js.native
  /**
    * Register a global keyboard shortcut (also known as system-wide hot key) to the system.
    *
    * @param shortcut {Shortcut} the Shortcut object to register.
    */
  def registerGlobalHotKey(shortcut: Shortcut): scala.Unit = js.native
  /**
    * Remove an entry from the whitelist used for controlling cross-origin access.
    *
    * @param sourceOrigin {string} The source origin. e.g. https://github.com/
    * @param destinationProtocol {string} The destination protocol where the sourceOrigin can access to. e.g. app
    * @param destinationHost {string} The destination host where the sourceOrigin can access to. e.g. myapp
    * @param allowDestinationSubdomains {Boolean} If set to true, the sourceOrigin is allowed to access subdomains of
    */
  def removeOriginAccessWhitelistEntry(
    sourceOrigin: java.lang.String,
    destinationProtocol: java.lang.String,
    destinationHost: java.lang.String,
    allowDestinationSubdomains: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Set the proxy config which the web engine will be used to request network resources.
    *
    * @param config {string} Proxy rules
    */
  def setProxyConfig(config: java.lang.String): scala.Unit = js.native
  /**
    * Unregisters a global keyboard shortcut.
    *
    * @param shortcut {Shortcut} the Shortcut object to register.
    */
  def unregisterGlobalHotKey(shortcut: Shortcut): scala.Unit = js.native
}

