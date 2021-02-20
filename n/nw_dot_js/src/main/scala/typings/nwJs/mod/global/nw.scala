package typings.nwJs.mod.global

import typings.node.eventsMod.EventEmitter
import typings.nwJs.mod.global.NWJSHelpers.CreateMacBuiltinOption
import typings.nwJs.mod.global.NWJSHelpers.MenuItemOption
import typings.nwJs.mod.global.NWJSHelpers.MenuOption
import typings.nwJs.mod.global.NWJSHelpers.ShortcutOption
import typings.nwJs.mod.global.NWJSHelpers.TrayOption
import typings.nwJs.mod.global.NWJSHelpers.WindowOpenOption
import typings.nwJs.mod.global.NWJSHelpers.clip
import typings.nwJs.mod.global.NWJSHelpers.screen
import typings.nwJs.mod.global.NWJSHelpers.win
import typings.nwJs.nwJsStrings.`click `
import typings.nwJs.nwJsStrings.`displayAdded `
import typings.nwJs.nwJsStrings.`displayRemoved `
import typings.nwJs.nwJsStrings.active
import typings.nwJs.nwJsStrings.click
import typings.nwJs.nwJsStrings.displayBoundsChanged
import typings.nwJs.nwJsStrings.failed
import typings.nwJs.nwJsStrings.open
import typings.nwJs.nwJsStrings.reopen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nw {
  
  @JSGlobal("nw")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait App extends StObject {
    
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
  def App: App = js.native
  @scala.inline
  def App_=(x: App): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("App")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Clipboard extends StObject {
    
    /**
      * Get the clipboard object.
      *
      * @returns {Clipboard} the clipboard object.
      */
    def get(): clip = js.native
  }
  object Clipboard {
    
    @JSGlobal("nw.Clipboard")
    @js.native
    val ^ : Clipboard = js.native
    
    @scala.inline
    implicit class ClipboardMutableBuilder[Self <: Clipboard] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: () => clip): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    }
  }
  
  /* Menu: http://docs.nwjs.io/en/latest/References/Menu/ */
  /**
    * `Menu` represents a menubar or a context menu.
    */
  @JSGlobal("nw.Menu")
  @js.native
  /**
    * Create a Menu object.
    *
    * @param option {Object} (Optional) Option to customize returned menu object.
    */
  class Menu () extends StObject {
    def this(option: MenuOption) = this()
    
    /**
      * Append `item` to the tail of the menu.
      *
      * @param item {MenuItem} the item to be appended to the tail of the menu
      */
    def append(item: MenuItem): Unit = js.native
    
    /**
      * Creates the builtin menus (App, Edit and Window) within the menubar on Mac.
      *
      * @param appname {string} The application name
      * @param options {Object} (Optional) Options to modify default `edit` and `window` MenuItems in Mac
      */
    def createMacBuiltin(appname: String): Unit = js.native
    def createMacBuiltin(appname: String, options: CreateMacBuiltinOption): Unit = js.native
    
    /**
      * Insert the `item` at `i`th position of the menu. The index is started from 0.
      *
      * @param item {MenuItem} the item to be inserted into the menu
      * @param i {Integer} the index in the menu list to insert the the item
      */
    def insert(item: MenuItem, i: Double): Unit = js.native
    
    /**
      * Get an array that contains all items of a menu. Each item is an instance of MenuItem.
      */
    var items: js.Array[MenuItem] = js.native
    
    /**
      * Popup the context menu at the anchor in (`x`, `y`) in current window.
      *
      * @param x {Integer} the x position of the anchor
      * @param y {Integer} the y position of the anchor
      */
    def popup(x: Double, y: Double): Unit = js.native
    
    /**
      * Remove `item` from the menu.
      *
      * @param item {MenuItem} the item to be removed
      */
    def remove(item: MenuItem): Unit = js.native
    
    /**
      * Remove the `i`th item form the menu.
      *
      * @param i {Integer} the index of the item to be removed from the menu
      */
    def removeAt(i: Double): Unit = js.native
  }
  
  /* MenuItem: http://docs.nwjs.io/en/latest/References/MenuItem/ */
  /**
    * `MenuItem` represents an item in a menu.
    */
  @JSGlobal("nw.MenuItem")
  @js.native
  class MenuItem protected () extends EventEmitter {
    /**
      * Create a new MenuItem.
      *
      * @param option {Object} Customize how MenuItem render and behave.
      */
    def this(option: MenuItemOption) = this()
    
    /**
      * Get or set whether the `MenuItem` is `checked`
      */
    var checked: Boolean = js.native
    
    /**
      * Get or set the click `callback` of a `MenuItem`
      */
    var click: js.Function = js.native
    
    /**
      * Get or set whether the `MenuItem` is `enabled`
      */
    var enabled: String = js.native
    
    /**
      * Get or set the `icon` of a `MenuItem`
      */
    var icon: String = js.native
    
    /**
      * Get or set whether `icon` image is treated as "template" (`true` by default).
      */
    var iconIsTemplate: Boolean = js.native
    
    /**
      * A single character string to specify the shortcut key for the menu item.
      */
    var key: String = js.native
    
    /**
      * Get or set the `label` of a `MenuItem`
      */
    var lable: String = js.native
    
    /**
      * A string to specify the modifier keys for the shortcut of the menu item.
      */
    var modifiers: String = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    /**
      * Emitted when user activates the menu item.
      *
      * @param event {string} Event name
      * @param listener {Function} The callback that handles the `click` event.
      */
    @JSName("on")
    def on_click(event: click, listener: js.Function0[_]): this.type = js.native
    
    /**
      * Get or set the `submenu` of a `MenuItem`, the `submenu` must be a `Menu` object.
      */
    var submenu: Menu = js.native
    
    /**
      * Get or set the `tooltip` of a `MenuItem`
      */
    var tooltip: Boolean = js.native
    
    /**
      * Get the `type` of a `MenuItem`
      */
    var `type`: String = js.native
  }
  
  /* Screen: http://docs.nwjs.io/en/latest/References/Screen/ */
  /**
    * Screen is an instance of EventEmitter object, and you"re able to use Screen.on(...) to respond to native screen"s events.
    * Screen is a singleton object, need to be initiated once by calling nw.Screen.Init().
    */
  @js.native
  trait Screen extends EventEmitter {
    
    /**
      * Use this API to monitor the changes of screens and windows on desktop. This is an instance of EventEmitter.
      */
    var DesktopCaptureMonitor: typings.nwJs.mod.global.NWJSHelpers.DesktopCaptureMonitor = js.native
    
    /**
      * Init the Screen singleton object, you only need to call this once.
      */
    def Init(): Unit = js.native
    
    /**
      *
      * @param sources {string[]} Array of source types.
      * @param callback {Function} callback function with chosed streamId.
      * - (optional) streamId {string}  streamId will be false if failed to execute or existing session is alive.
      */
    def chooseDesktopMedia(
      sources: js.Array[String],
      callback: js.Function1[/* streamId */ js.UndefOr[String | Boolean], Unit]
    ): Unit = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    /**
      * Emitted when a new screen added.
      *
      * @param event {string} Event name
      * @param listener {Function(screen?)} The callback that handles the `displayAdded` event.
      * - (optional) screen {screen} screen object
      */
    @JSName("on")
    def on_displayAdded(event: `displayAdded `, listener: js.Function1[/* screen */ screen, _]): this.type = js.native
    /**
      * Emitted when the screen resolution, arrangement is changed.
      *
      * @param event {string} Event name
      * @param listener {Function(screen?)} The callback that handles the `displayBoundsChanged` event.
      * - (optional) screen {screen} screen object
      */
    @JSName("on")
    def on_displayBoundsChanged(event: displayBoundsChanged, listener: js.Function1[/* screen */ screen, _]): this.type = js.native
    /**
      * Emitted when existing screen removed.
      *
      * @param event {string} Event name
      * @param listener {Function(screen?)} The callback that handles the `displayRemoved` event.
      * - (optional) screen {screen} screen object
      */
    @JSName("on")
    def on_displayRemoved(event: `displayRemoved `, listener: js.Function1[/* screen */ screen, _]): this.type = js.native
    
    /**
      * Get the array of screen (number of screen connected to the computer)
      */
    var screens: js.Array[screen] = js.native
  }
  @JSGlobal("nw.Screen")
  @js.native
  def Screen: Screen = js.native
  @scala.inline
  def Screen_=(x: Screen): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Screen")(x.asInstanceOf[js.Any])
  
  /* Shell: http://docs.nwjs.io/en/latest/References/Shell/ */
  /**
    * `Shell` is a collection of APIs that do desktop related jobs.
    */
  @js.native
  trait Shell extends StObject {
    
    /**
      * Open the given external URI in the desktop"s default manner.
      *
      * @param uri {string} A URL to open in system default manner.
      */
    def openExternal(uri: String): Unit = js.native
    
    /**
      * Open the given file_path in the desktop"s default manner.
      *
      * @param file_path {string} path to a local file
      */
    def openItem(file_path: String): Unit = js.native
    
    /**
      * Show the given file_path in the parent folder with file manager. If possible, select the file.
      *
      * @param file_path {string} path to a local file
      */
    def showItemInFolder(file_path: String): Unit = js.native
  }
  object Shell {
    
    @JSGlobal("nw.Shell")
    @js.native
    val ^ : Shell = js.native
    
    @scala.inline
    implicit class ShellMutableBuilder[Self <: Shell] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpenExternal(value: String => Unit): Self = StObject.set(x, "openExternal", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenItem(value: String => Unit): Self = StObject.set(x, "openItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowItemInFolder(value: String => Unit): Self = StObject.set(x, "showItemInFolder", js.Any.fromFunction1(value))
    }
  }
  
  @JSGlobal("nw.Shortcut")
  @js.native
  class Shortcut protected () extends EventEmitter {
    /**
      * Create new Shortcut.
      *
      * @param option {Object} Shortcut option is an object contains initial settings for the Shortcut.
      */
    def this(option: ShortcutOption) = this()
    
    /**
      * Get or set the active callback of a Shortcut. It will be called when user presses the shortcut.
      */
    var active: js.Function = js.native
    
    /**
      * Get or set the failed callback of a Shortcut. It will be called when application passes an invalid key , or failed to register the key.
      *
      * @param msg {string} Failure message
      */
    def failed(): js.Any = js.native
    def failed(msg: String): js.Any = js.native
    
    /**
      * Get the key of a Shortcut.
      */
    var key: String = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    /**
      * Get or set the active callback of a Shortcut. It will be called when user presses the shortcut.
      *
      * @param event {string} Event name
      * @param listener {Function} The callback that handles the `active` event.
      */
    @JSName("on")
    def on_active(event: active, listener: js.Function0[_]): this.type = js.native
    /**
      * Get or set the failed callback of a Shortcut. It will be called when application passes an invalid key, or failed to register the key.
      *
      * @param event {string} Event name
      * @param listener {Function(msg?)} The callback that handles the `failed` event.
      * - (optional) msg {string} Failure message
      */
    @JSName("on")
    def on_failed(event: failed, listener: js.Function1[/* msg */ js.UndefOr[String], _]): this.type = js.native
  }
  
  @JSGlobal("nw.Tray")
  @js.native
  class Tray protected () extends EventEmitter {
    /**
      * Create a new Tray.
      * @param option {Object} Contains initial settings for the Tray.
      */
    def this(option: TrayOption) = this()
    
    /**
      * Get or set the alternate (active) tray icon. (Mac)
      */
    var alticon: String = js.native
    
    /**
      * Get or set the icon of the tray.
      */
    var icon: String = js.native
    
    /**
      * Get or set whether icon and alticon images are treated as "templates" (true by default). (Mac)
      */
    var iconsAreTemplates: Boolean = js.native
    
    /**
      * Get or set the menu of the tray.
      */
    var menu: Menu = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    /**
      * Emitted when user clicks the menu item with left mouse button.
      *
      * @param event {string} Event name
      * @param listener {Function} The callback that handles the `click` event.
      */
    @JSName("on")
    def on_click(event: `click `, listener: js.Function0[_]): this.type = js.native
    
    /**
      * Remove the tray.
      */
    def remove(): Unit = js.native
    
    /**
      * Get or set the title of the tray.
      */
    var title: String = js.native
    
    /**
      * Get or set the tooltip of the tray.
      */
    var tooltip: String = js.native
  }
  
  /* Window: http://docs.nwjs.io/en/latest/References/Window/ */
  /**
    * Window is a wrapper of the DOM's window object. It has extended operations and can receive various window events.
    */
  @js.native
  trait Window extends EventEmitter {
    
    /**
      * Get the native Window Object.
      *
      * @param event {DOM Window} (Optional) Is the DOM window
      */
    def get(): win = js.native
    def get(window_object: js.Object): win = js.native
    
    /**
      * Get all windows.
      *
      * @param callback {(windows: NWJS_Helpers.win[]) => void} A callback function whose parameter is an array of nw.Window objects
      */
    def getAll(callback: js.Function1[/* windows */ js.Array[win], Unit]): Unit = js.native
    
    /**
      * Open a new window and load url in it.
      *
      * @param url {string} URL to be loaded in the opened window
      * @param option {object} (Optional) New window open options like window subfields in manifest format plus some more options
      * @param callback {string} (Optional) Callback when with the opened native Window object
      * - (Optional) new_win {object} New opened window object.
      */
    def open(url: String): Unit = js.native
    def open(
      url: String,
      option: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* new_win */ js.UndefOr[win], Unit]
    ): Unit = js.native
    def open(url: String, option: WindowOpenOption): Unit = js.native
    def open(url: String, option: WindowOpenOption, callback: js.Function1[/* new_win */ js.UndefOr[win], Unit]): Unit = js.native
  }
  @JSGlobal("nw.Window")
  @js.native
  def Window: Window = js.native
  @scala.inline
  def Window_=(x: Window): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Window")(x.asInstanceOf[js.Any])
  
  @JSGlobal("nw.require")
  @js.native
  def require(id: String): js.Any = js.native
}
