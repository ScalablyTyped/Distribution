package typings.openfin.applicationMod

import typings.openfin.baseMod.EmitterBase
import typings.openfin.eventsApplicationMod.ApplicationEvents
import typings.openfin.identityMod.Identity
import typings.openfin.viewViewMod.View
import typings.openfin.windowWindowMod.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin/_v2/api/application/application", "Application")
@js.native
class Application protected () extends EmitterBase[ApplicationEvents] {
  def this(wire: typings.openfin.transportMod.default, identity: Identity) = this()
  
  var _close: js.Any = js.native
  
  var _manifestUrl: js.UndefOr[String] = js.native
  
  var _run: js.Any = js.native
  
  def close(): js.Promise[Unit] = js.native
  def close(force: Boolean): js.Promise[Unit] = js.native
  
  /**
    * Retrieves an array of wrapped fin.Windows for each of the application’s child windows.
    * @return {Promise.Array.<_Window>}
    * @tutorial Application.getChildWindows
    */
  def getChildWindows(): js.Promise[js.Array[Window]] = js.native
  
  /**
    * Retrieves an array of active window groups for all of the application's windows. Each group is
    * represented as an array of wrapped fin.Windows.
    * @return {Promise.Array.Array.<_Window>}
    * @tutorial Application.getGroups
    */
  def getGroups(): js.Promise[js.Array[js.Array[Window]]] = js.native
  
  /**
    * Retrieves information about the application.
    * @return {Promise.<ApplicationInfo>}
    * @tutorial Application.getInfo
    */
  def getInfo(): js.Promise[ApplicationInfo] = js.native
  
  /**
    * Retrieves the JSON manifest that was used to create the application. Invokes the error callback
    * if the application was not created from a manifest.
    * @return {Promise.<any>}
    * @tutorial Application.getManifest
    */
  def getManifest(): js.Promise[_] = js.native
  
  /**
    * Retrieves UUID of the application that launches this application. Invokes the error callback
    * if the application was created from a manifest.
    * @return {Promise.<string>}
    * @tutorial Application.getParentUuid
    */
  def getParentUuid(): js.Promise[String] = js.native
  
  /**
    * Retrieves current application's shortcut configuration.
    * @return {Promise.<ShortCutConfig>}
    * @tutorial Application.getShortcuts
    */
  def getShortcuts(): js.Promise[ShortCutConfig] = js.native
  
  /**
    * @summary Retrieves information about the system tray.
    * @desc The only information currently returned is the position and dimensions.
    * @return {Promise.<TrayInfo>}
    * @tutorial Application.getTrayIconInfo
    */
  def getTrayIconInfo(): js.Promise[TrayInfo] = js.native
  
  /**
    * Retrieves current application's views.
    * @experimental
    * @return {Promise.Array.<View>}
    * @tutorial Application.getViews
    */
  def getViews(): js.Promise[js.Array[View]] = js.native
  
  /**
    * Returns an instance of the main Window of the application
    * @return {Promise.<_Window>}
    * @tutorial Application.getWindow
    */
  def getWindow(): js.Promise[Window] = js.native
  
  /**
    * Returns the current zoom level of the application.
    * @return {Promise.<number>}
    * @tutorial Application.getZoomLevel
    */
  def getZoomLevel(): js.Promise[Double] = js.native
  
  /**
    * Adds a listener to the end of the listeners array for the specified event.
    * @param { string | symbol } eventType  - The type of the event.
    * @param { Function } listener - Called whenever an event of the specified type occurs.
    * @param { SubOptions } [options] - Option to support event timestamps.
    * @return {Promise.<this>}
    * @function addListener
    * @memberof Application
    * @instance
    * @tutorial Application.EventEmitter
    */
  /**
    * Adds a listener to the end of the listeners array for the specified event.
    * @param { string | symbol } eventType  - The type of the event.
    * @param { Function } listener - Called whenever an event of the specified type occurs.
    * @param { SubOptions } [options] - Option to support event timestamps.
    * @return {Promise.<this>}
    * @function on
    * @memberof Application
    * @instance
    * @tutorial Application.EventEmitter
    */
  /**
    * Adds a one time listener for the event. The listener is invoked only the first time the event is fired, after which it is removed.
    * @param { string | symbol } eventType  - The type of the event.
    * @param { Function } listener - The callback function.
    * @param { SubOptions } [options] - Option to support event timestamps.
    * @return {Promise.<this>}
    * @function once
    * @memberof Application
    * @instance
    * @tutorial Application.EventEmitter
    */
  /**
    * Adds a listener to the beginning of the listeners array for the specified event.
    * @param { string | symbol } eventType  - The type of the event.
    * @param { Function } listener - The callback function.
    * @param { SubOptions } [options] - Option to support event timestamps.
    * @return {Promise.<this>}
    * @function prependListener
    * @memberof Application
    * @instance
    * @tutorial Application.EventEmitter
    */
  /**
    * Adds a one time listener for the event. The listener is invoked only the first time the event is fired, after which it is removed.
    * The listener is added to the beginning of the listeners array.
    * @param { string | symbol } eventType  - The type of the event.
    * @param { Function } listener - The callback function.
    * @param { SubOptions } [options] - Option to support event timestamps.
    * @return {Promise.<this>}
    * @function prependOnceListener
    * @memberof Application
    * @instance
    * @tutorial Application.EventEmitter
    */
  /**
    * Remove a listener from the listener array for the specified event.
    * Caution: Calling this method changes the array indices in the listener array behind the listener.
    * @param { string | symbol } eventType  - The type of the event.
    * @param { Function } listener - The callback function.
    * @param { SubOptions } [options] - Option to support event timestamps.
    * @return {Promise.<this>}
    * @function removeListener
    * @memberof Application
    * @instance
    * @tutorial Application.EventEmitter
    */
  /**
    * Removes all listeners, or those of the specified event.
    * @param { string | symbol } [eventType]  - The type of the event.
    * @return {Promise.<this>}
    * @function removeAllListeners
    * @memberof Application
    * @instance
    * @tutorial Application.EventEmitter
    */
  /**
    * Determines if the application is currently running.
    * @return {Promise.<boolean>}
    * @tutorial Application.isRunning
    */
  def isRunning(): js.Promise[Boolean] = js.native
  
  /**
    * Closes the application and any child windows created by the application.
    * Cleans the application from state so it is no longer found in getAllApplications.
    * @param { boolean } [force = false] Close will be prevented from closing when force is false and
    *  ‘close-requested’ has been subscribed to for application’s main window.
    * @return {Promise.<boolean>}
    * @tutorial Application.quit
    */
  def quit(): js.Promise[Unit] = js.native
  def quit(force: Boolean): js.Promise[Unit] = js.native
  
  /**
    * Manually registers a user with the licensing service. The only data sent by this call is userName and appName.
    * @param { string } userName - username to be passed to the RVM.
    * @param { string } appName - app name to be passed to the RVM.
    * @return {Promise.<void>}
    * @tutorial Application.registerUser
    */
  def registerUser(userName: String, appName: String): js.Promise[Unit] = js.native
  
  /**
    * Removes the application’s icon from the tray.
    * @return {Promise.<void>}
    * @tutorial Application.removeTrayIcon
    */
  def removeTrayIcon(): js.Promise[Unit] = js.native
  
  /**
    * Restarts the application.
    * @return {Promise.<void>}
    * @tutorial Application.restart
    */
  def restart(): js.Promise[Unit] = js.native
  
  /**
    * DEPRECATED method to run the application.
    * Needed when starting application via {@link Application.create}, but NOT needed when starting via {@link Application.start}.
    * @return {Promise.<void>}
    * @tutorial Application.run
    * @ignore
    */
  def run(): js.Promise[Unit] = js.native
  
  /**
    * Instructs the RVM to schedule one restart of the application.
    * @return {Promise.<void>}
    * @tutorial Application.scheduleRestart
    */
  def scheduleRestart(): js.Promise[Unit] = js.native
  
  /**
    * Sends a message to the RVM to upload the application's logs. On success,
    * an object containing logId is returned.
    * @return {Promise.<LogInfo>}
    * @tutorial Application.sendApplicationLog
    */
  def sendApplicationLog(): js.Promise[LogInfo] = js.native
  
  /**
    * Sets a username to correlate with App Log Management.
    * @param { string } username Username to correlate with App's Log.
    * @return {Promise.<void>}
    * @tutorial Application.setAppLogUsername
    */
  def setAppLogUsername(username: String): js.Promise[Unit] = js.native
  
  /**
    * Sets the query string in all shortcuts for this app. Requires RVM 5.5+.
    * @param { string } queryString The new query string for this app's shortcuts.
    * @return {Promise.<void>}
    * @tutorial Application.setShortcutQueryParams
    */
  def setShortcutQueryParams(queryString: String): js.Promise[Unit] = js.native
  
  /**
    * Sets new application's shortcut configuration. Windows only.
    * @param { ShortCutConfig } config New application's shortcut configuration.
    * @param { boolean } [config.desktop] - Enable/disable desktop shortcut.
    * @param { boolean } [config.startMenu] - Enable/disable start menu shortcut.
    * @param { boolean } [config.systemStartup] - Enable/disable system startup shortcut.
    * @return {Promise.<void>}
    * @tutorial Application.setShortcuts
    */
  def setShortcuts(config: ShortCutConfig): js.Promise[Unit] = js.native
  
  /**
    * Adds a customizable icon in the system tray.  To listen for a click on the icon use the `tray-icon-clicked` event.
    * @param { string } icon Image URL or base64 encoded string to be used as the icon
    * @return {Promise.<void>}
    * @tutorial Application.setTrayIcon
    */
  def setTrayIcon(icon: String): js.Promise[Unit] = js.native
  
  /**
    * Sets the zoom level of the application. The original size is 0 and each increment above or below represents zooming 20%
    * larger or smaller to default limits of 300% and 50% of original size, respectively.
    * @param { number } level The zoom level
    * @return {Promise.<void>}
    * @tutorial Application.setZoomLevel
    */
  def setZoomLevel(level: Double): js.Promise[Unit] = js.native
  
  /**
    * Closes the application by terminating its process.
    * @return {Promise.<void>}
    * @tutorial Application.terminate
    */
  def terminate(): js.Promise[Unit] = js.native
  
  var window: js.Any = js.native
  
  var windowListFromIdentityList: js.Any = js.native
}
