package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Application
  * An object representing an application. Allows the developer to create, execute, show / close an application as well as listen to application events.
  */
@js.native
trait OpenFinApplication extends js.Object {
  
  /**
    * Registers an event listener on the specified event.
    */
  def addEventListener(
    `type`: OpenFinApplicationEventType,
    listener: js.Function1[
      /* event */ ApplicationBaseEvent | TrayIconClickedEvent | WindowEvent | WindowAlertRequestedEvent | WindowAuthRequested | WindowNavigationRejectedEvent | WindowEndLoadEvent, 
      Unit
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: OpenFinApplicationEventType,
    listener: js.Function1[
      /* event */ ApplicationBaseEvent | TrayIconClickedEvent | WindowEvent | WindowAlertRequestedEvent | WindowAuthRequested | WindowNavigationRejectedEvent | WindowEndLoadEvent, 
      Unit
    ],
    callback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def addEventListener(
    `type`: OpenFinApplicationEventType,
    listener: js.Function1[
      /* event */ ApplicationBaseEvent | TrayIconClickedEvent | WindowEvent | WindowAlertRequestedEvent | WindowAuthRequested | WindowNavigationRejectedEvent | WindowEndLoadEvent, 
      Unit
    ],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def addEventListener(
    `type`: OpenFinApplicationEventType,
    listener: js.Function1[
      /* event */ ApplicationBaseEvent | TrayIconClickedEvent | WindowEvent | WindowAlertRequestedEvent | WindowAuthRequested | WindowNavigationRejectedEvent | WindowEndLoadEvent, 
      Unit
    ],
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Closes the application and any child windows created by the application.
    */
  def close(): Unit = js.native
  def close(
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def close(force: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def close(
    force: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def close(force: Boolean): Unit = js.native
  def close(
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def close(force: Boolean, callback: js.Function0[Unit]): Unit = js.native
  def close(
    force: Boolean,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Retrieves an array of wrapped fin.desktop.Windows for each of the application's child windows.
    */
  def getChildWindows(): Unit = js.native
  def getChildWindows(callback: js.UndefOr[scala.Nothing], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  def getChildWindows(callback: js.Function1[/* children */ js.Array[OpenFinWindow], Unit]): Unit = js.native
  def getChildWindows(
    callback: js.Function1[/* children */ js.Array[OpenFinWindow], Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Retrieves an array of active window groups for all of the application's windows. Each group is represented as an array of wrapped fin.desktop.Windows.
    */
  def getGroups(): Unit = js.native
  def getGroups(callback: js.UndefOr[scala.Nothing], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  def getGroups(callback: js.Function1[/* groups */ js.Array[js.Array[OpenFinWindow]], Unit]): Unit = js.native
  def getGroups(
    callback: js.Function1[/* groups */ js.Array[js.Array[OpenFinWindow]], Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Retrieves information about the application.
    */
  def getInfo(): Unit = js.native
  def getInfo(callback: js.UndefOr[scala.Nothing], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  def getInfo(callback: js.Function1[/* info */ LaunchInfo, Unit]): Unit = js.native
  def getInfo(
    callback: js.Function1[/* info */ LaunchInfo, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Retrieves the JSON manifest that was used to create the application. Invokes the error callback if the application was not created from a manifest.
    */
  def getManifest(): Unit = js.native
  def getManifest(callback: js.UndefOr[scala.Nothing], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  def getManifest(callback: js.Function1[/* manifest */ js.Any, Unit]): Unit = js.native
  def getManifest(
    callback: js.Function1[/* manifest */ js.Any, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Retrieves UUID of the application that launches this application. Invokes the error callback if the application was created from a manifest.
    */
  def getParentUuid(): Unit = js.native
  def getParentUuid(callback: js.UndefOr[scala.Nothing], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  def getParentUuid(callback: js.Function1[/* uuid */ String, Unit]): Unit = js.native
  def getParentUuid(
    callback: js.Function1[/* uuid */ String, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Retrieves current configuration of application's shortcuts.
    */
  def getShortcuts(): Unit = js.native
  def getShortcuts(callback: js.UndefOr[scala.Nothing], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  def getShortcuts(callback: js.Function1[/* config */ ShortCutConfig, Unit]): Unit = js.native
  def getShortcuts(
    callback: js.Function1[/* config */ ShortCutConfig, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Retrieves information about the system tray.
    */
  def getTrayIconInfo(): Unit = js.native
  def getTrayIconInfo(callback: js.UndefOr[scala.Nothing], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  def getTrayIconInfo(callback: js.Function1[/* trayInfo */ TrayInfo, Unit]): Unit = js.native
  def getTrayIconInfo(
    callback: js.Function1[/* trayInfo */ TrayInfo, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Returns an instance of the main Window of the application
    */
  def getWindow(): OpenFinWindow = js.native
  
  /**
    * Returns the current zoom level of the application.
    */
  def getZoomLevel(): Unit = js.native
  def getZoomLevel(callback: js.UndefOr[scala.Nothing], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  def getZoomLevel(callback: js.Function1[/* level */ Double, Unit]): Unit = js.native
  def getZoomLevel(
    callback: js.Function1[/* level */ Double, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Determines if the application is currently running.
    */
  def isRunning(): Unit = js.native
  def isRunning(callback: js.UndefOr[scala.Nothing], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  def isRunning(callback: js.Function1[/* running */ Boolean, Unit]): Unit = js.native
  def isRunning(
    callback: js.Function1[/* running */ Boolean, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Registers a username and an app name for licensing purposes.
    */
  def registerUser(userName: String, appName: String): Unit = js.native
  def registerUser(
    userName: String,
    appName: String,
    callback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def registerUser(userName: String, appName: String, callback: js.Function0[Unit]): Unit = js.native
  def registerUser(
    userName: String,
    appName: String,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Removes a previously registered event listener from the specified event.
    */
  def removeEventListener(
    `type`: OpenFinApplicationEventType,
    previouslyRegisteredListener: js.Function1[
      /* event */ ApplicationBaseEvent | TrayIconClickedEvent | WindowEvent | WindowAlertRequestedEvent | WindowAuthRequested | WindowNavigationRejectedEvent | WindowEndLoadEvent, 
      _
    ]
  ): Unit = js.native
  def removeEventListener(
    `type`: OpenFinApplicationEventType,
    previouslyRegisteredListener: js.Function1[
      /* event */ ApplicationBaseEvent | TrayIconClickedEvent | WindowEvent | WindowAlertRequestedEvent | WindowAuthRequested | WindowNavigationRejectedEvent | WindowEndLoadEvent, 
      _
    ],
    callback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def removeEventListener(
    `type`: OpenFinApplicationEventType,
    previouslyRegisteredListener: js.Function1[
      /* event */ ApplicationBaseEvent | TrayIconClickedEvent | WindowEvent | WindowAlertRequestedEvent | WindowAuthRequested | WindowNavigationRejectedEvent | WindowEndLoadEvent, 
      _
    ],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def removeEventListener(
    `type`: OpenFinApplicationEventType,
    previouslyRegisteredListener: js.Function1[
      /* event */ ApplicationBaseEvent | TrayIconClickedEvent | WindowEvent | WindowAlertRequestedEvent | WindowAuthRequested | WindowNavigationRejectedEvent | WindowEndLoadEvent, 
      _
    ],
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Removes the application's icon from the tray.
    */
  def removeTrayIcon(): Unit = js.native
  def removeTrayIcon(callback: js.UndefOr[scala.Nothing], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  def removeTrayIcon(callback: js.Function0[Unit]): Unit = js.native
  def removeTrayIcon(callback: js.Function0[Unit], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Restarts the application.
    */
  def restart(): Unit = js.native
  def restart(callback: js.UndefOr[scala.Nothing], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  def restart(callback: js.Function0[Unit]): Unit = js.native
  def restart(callback: js.Function0[Unit], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Runs the application. When the application is created, run must be called.
    */
  def run(): Unit = js.native
  def run(
    callback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function2[/* reason */ String, /* errorObj */ NetworkErrorInfo, Unit]
  ): Unit = js.native
  def run(callback: js.Function1[/* successObj */ SuccessObj, Unit]): Unit = js.native
  def run(
    callback: js.Function1[/* successObj */ SuccessObj, Unit],
    errorCallback: js.Function2[/* reason */ String, /* errorObj */ NetworkErrorInfo, Unit]
  ): Unit = js.native
  
  /**
    * Tells the rvm to relaunch the main application once upon a complete shutdown
    */
  def scheduleRestart(): Unit = js.native
  def scheduleRestart(callback: js.UndefOr[scala.Nothing], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  def scheduleRestart(callback: js.Function0[Unit]): Unit = js.native
  def scheduleRestart(callback: js.Function0[Unit], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Sends a message to the RVM to upload the application's logs. On success, an object containing logId is returned.
    */
  def sendApplicationLog(): Unit = js.native
  def sendApplicationLog(callback: js.UndefOr[scala.Nothing], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  def sendApplicationLog(callback: js.Function1[/* logInfo */ applicationLogInfo, Unit]): Unit = js.native
  def sendApplicationLog(
    callback: js.Function1[/* logInfo */ applicationLogInfo, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Sets an associated username with that app for Application Log Management use
    */
  def setAppLogUsername(username: String): Unit = js.native
  def setAppLogUsername(
    username: String,
    callback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def setAppLogUsername(username: String, callback: js.Function0[Unit]): Unit = js.native
  def setAppLogUsername(
    username: String,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Sets new shortcut configuration for current application.
    * Application has to be launched with a manifest and has to have shortcut configuration (icon url, name, etc.) in its manifest to
    * be able to change shortcut states.
    */
  def setShortcuts(config: ShortCutConfig): Unit = js.native
  def setShortcuts(
    config: ShortCutConfig,
    callback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def setShortcuts(config: ShortCutConfig, callback: js.Function0[Unit]): Unit = js.native
  def setShortcuts(
    config: ShortCutConfig,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Adds a customizable icon in the system tray and notifies the application when clicked.
    */
  def setTrayIcon(iconUrl: String, listener: js.Function1[/* clickInfo */ TrayIconClickedEvent, Unit]): Unit = js.native
  def setTrayIcon(
    iconUrl: String,
    listener: js.Function1[/* clickInfo */ TrayIconClickedEvent, Unit],
    callback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def setTrayIcon(
    iconUrl: String,
    listener: js.Function1[/* clickInfo */ TrayIconClickedEvent, Unit],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def setTrayIcon(
    iconUrl: String,
    listener: js.Function1[/* clickInfo */ TrayIconClickedEvent, Unit],
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Sets the zoom level of the application. The original size is 0 and each increment above or below represents zooming 20%
    * larger or smaller to default limits of 300% and 50% of original size, respectively.
    */
  def setZoomLevel(level: Double): Unit = js.native
  def setZoomLevel(
    level: Double,
    callback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def setZoomLevel(level: Double, callback: js.Function0[Unit]): Unit = js.native
  def setZoomLevel(
    level: Double,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Closes the application by terminating its process.
    */
  def terminate(): Unit = js.native
  def terminate(callback: js.UndefOr[scala.Nothing], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  def terminate(callback: js.Function0[Unit]): Unit = js.native
  def terminate(callback: js.Function0[Unit], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * The Application's uuid
    */
  var uuid: String = js.native
  
  def wait(callback: js.UndefOr[scala.Nothing], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  def wait(callback: js.Function0[Unit]): Unit = js.native
  def wait(callback: js.Function0[Unit], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
}
