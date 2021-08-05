package typings.nwGui

import typings.nwGui.anon.Datatype
import typings.std.HTMLIFrameElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nw.gui", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait App
    extends StObject
       with EventEmitter {
    
    def addOriginAccessWhitelistEntry(
      sourceOrigin: String,
      destinationProtocol: String,
      destinationHost: String,
      allowDestinationSubdomains: Boolean
    ): Unit = js.native
    
    var argv: js.Any = js.native
    
    def clearCache(): Unit = js.native
    
    def closeAllWindows(): Unit = js.native
    
    def crashBrowser(): Unit = js.native
    
    def crashRenderer(): Unit = js.native
    
    var dataPath: String = js.native
    
    var fullArgv: js.Any = js.native
    
    def getProxyForURL(url: String): Unit = js.native
    
    var manifest: js.Any = js.native
    
    def quit(): Unit = js.native
    
    def registerGlobalHotKey(shortcut: Shortcut): Unit = js.native
    
    def removeOriginAccessWhitelistEntry(
      sourceOrigin: String,
      destinationProtocol: String,
      destinationHost: String,
      allowDestinationSubdomains: Boolean
    ): Unit = js.native
    
    def setCrashDumpDir(dir: String): Unit = js.native
    
    def unregisterGlobalHotKey(shortcut: Shortcut): Unit = js.native
  }
  @JSImport("nw.gui", "App")
  @js.native
  def App: App = js.native
  inline def App_=(x: App): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("App")(x.asInstanceOf[js.Any])
  
  @JSImport("nw.gui", "Clipboard")
  @js.native
  class Clipboard () extends StObject {
    
    def clear(): Unit = js.native
    
    def get(): String = js.native
    def get(`type`: String): String = js.native
    
    def set(data: String): Unit = js.native
    def set(data: String, `type`: String): Unit = js.native
  }
  /* static members */
  object Clipboard {
    
    @JSImport("nw.gui", "Clipboard")
    @js.native
    val ^ : js.Any = js.native
    
    inline def get(): Clipboard = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[Clipboard]
  }
  
  @JSImport("nw.gui", "Menu")
  @js.native
  class Menu () extends StObject {
    def this(config: MenuConfig) = this()
    
    def append(item: MenuItem): Unit = js.native
    
    // since v0.10.0-rc1
    def createMacBuiltin(appname: String): Unit = js.native
    def createMacBuiltin(appname: String, options: HideMenusOptions): Unit = js.native
    
    def insert(item: MenuItem, atPosition: Double): Unit = js.native
    
    var items: js.Array[MenuItem] = js.native
    
    def popup(x: Double, y: Double): Unit = js.native
    
    def remove(item: MenuItem): Unit = js.native
    
    def removeAt(index: Double): Unit = js.native
  }
  
  @JSImport("nw.gui", "MenuItem")
  @js.native
  class MenuItem protected ()
    extends StObject
       with EventEmitter
       with MenuItemConfig {
    def this(config: MenuItemConfig) = this()
    
    @JSName("checked")
    var checked_MenuItem: Boolean = js.native
    
    @JSName("click")
    var click_MenuItem: js.Function = js.native
    
    @JSName("enabled")
    var enabled_MenuItem: Boolean = js.native
    
    @JSName("icon")
    var icon_MenuItem: String = js.native
    
    @JSName("key")
    var key_MenuItem: String = js.native
    
    @JSName("label")
    var label_MenuItem: String = js.native
    
    @JSName("modifiers")
    var modifiers_MenuItem: String = js.native
    
    @JSName("submenu")
    var submenu_MenuItem: Menu = js.native
    
    @JSName("tooltip")
    var tooltip_MenuItem: String = js.native
    
    @JSName("type")
    var type_MenuItem: String = js.native
  }
  
  trait Shell extends StObject {
    
    def openExternal(uri: String): Unit
    
    def openItem(file_path: String): Unit
    
    def showItemInFolder(file_path: String): Unit
  }
  object Shell {
    
    @JSImport("nw.gui", "Shell")
    @js.native
    val ^ : Shell = js.native
    
    extension [Self <: Shell](x: Self) {
      
      inline def setOpenExternal(value: String => Unit): Self = StObject.set(x, "openExternal", js.Any.fromFunction1(value))
      
      inline def setOpenItem(value: String => Unit): Self = StObject.set(x, "openItem", js.Any.fromFunction1(value))
      
      inline def setShowItemInFolder(value: String => Unit): Self = StObject.set(x, "showItemInFolder", js.Any.fromFunction1(value))
    }
  }
  
  @JSImport("nw.gui", "Shortcut")
  @js.native
  class Shortcut protected ()
    extends StObject
       with EventEmitter {
    def this(option: ShortcutOption) = this()
    
    var active: js.Function = js.native
    
    var failed: js.Function = js.native
    
    var key: String = js.native
  }
  
  @JSImport("nw.gui", "Tray")
  @js.native
  class Tray protected ()
    extends StObject
       with EventEmitter
       with TrayOption {
    def this(option: TrayOption) = this()
    
    @JSName("alticon")
    var alticon_Tray: String = js.native
    
    @JSName("icon")
    var icon_Tray: String = js.native
    
    @JSName("menu")
    var menu_Tray: Menu = js.native
    
    def remove(): Unit = js.native
    
    @JSName("title")
    var title_Tray: String = js.native
    
    @JSName("tooltip")
    var tooltip_Tray: String = js.native
  }
  
  @JSImport("nw.gui", "Window")
  @js.native
  class Window ()
    extends StObject
       with EventEmitter {
    
    def blur(): Unit = js.native
    
    def capturePage(callback: js.Function): Unit = js.native
    def capturePage(callback: js.Function, config_object: Datatype): Unit = js.native
    def capturePage(callback: js.Function, imageformat: String): Unit = js.native
    
    def close(): Unit = js.native
    def close(force: Boolean): Unit = js.native
    
    def closeDevTools(): Unit = js.native
    
    def enterFullscreen(): Unit = js.native
    
    def enterKioskMode(): Unit = js.native
    
    def eval(frame: HTMLIFrameElement, script: String): Unit = js.native
    
    def focus(): Unit = js.native
    
    var height: Double = js.native
    
    def hide(): Unit = js.native
    
    def isDevToolsOpen(): Boolean = js.native
    
    var isFullScreen: Boolean = js.native
    
    var isKioskMode: Boolean = js.native
    
    def leaveFullscreen(): Unit = js.native
    
    def leaveKioskMode(): Unit = js.native
    
    def maximize(): Unit = js.native
    
    var menu: Menu = js.native
    
    def minimize(): Unit = js.native
    
    def moveBy(x: Double, y: Double): Unit = js.native
    
    def moveTo(x: Double, y: Double): Unit = js.native
    
    def reload(): Unit = js.native
    
    def reloadIgnoringCache(): Unit = js.native
    
    def requestAttention(attention: Boolean): Unit = js.native
    def requestAttention(attention: Double): Unit = js.native
    
    def resizeBy(width: Double, height: Double): Unit = js.native
    
    def resizeTo(width: Double, height: Double): Unit = js.native
    
    def restore(): Unit = js.native
    
    def setAlwaysOnTop(top: Boolean): Unit = js.native
    
    def setBadgeLabel(label: String): Unit = js.native
    
    def setMaximumSize(width: Double, height: Double): Unit = js.native
    
    def setMinimumSize(width: Double, height: Double): Unit = js.native
    
    def setPosition(position: String): Unit = js.native
    
    def setProgressBar(progress: Double): Unit = js.native
    
    def setResizable(resizable: Boolean): Unit = js.native
    
    def setShowInTaskbar(show: Boolean): Unit = js.native
    
    def show(): Unit = js.native
    
    def showDevTools(): Unit = js.native
    def showDevTools(id: String): Unit = js.native
    def showDevTools(id: String, headless: Boolean): Unit = js.native
    def showDevTools(id: Unit, headless: Boolean): Unit = js.native
    def showDevTools(id: HTMLIFrameElement): Unit = js.native
    def showDevTools(id: HTMLIFrameElement, headless: Boolean): Unit = js.native
    
    var title: String = js.native
    
    def toggleFullscreen(): Unit = js.native
    
    def toggleKioskMode(): Unit = js.native
    
    def unmaximize(): Unit = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var zoomLevel: Double = js.native
  }
  /* static members */
  object Window {
    
    @JSImport("nw.gui", "Window")
    @js.native
    val ^ : js.Any = js.native
    
    inline def get(): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[Window]
    inline def get(windowObject: js.Any): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(windowObject.asInstanceOf[js.Any]).asInstanceOf[Window]
    
    inline def open(url: String): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(url.asInstanceOf[js.Any]).asInstanceOf[Window]
    inline def open(url: String, options: WindowManifestOptions): Window = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Window]
  }
  
  @js.native
  trait EventEmitter
    extends StObject
       with IEventEmitter
  
  trait HideMenusOptions extends StObject {
    
    var hideEdit: Boolean
    
    var hideWindow: Boolean
  }
  object HideMenusOptions {
    
    inline def apply(hideEdit: Boolean, hideWindow: Boolean): HideMenusOptions = {
      val __obj = js.Dynamic.literal(hideEdit = hideEdit.asInstanceOf[js.Any], hideWindow = hideWindow.asInstanceOf[js.Any])
      __obj.asInstanceOf[HideMenusOptions]
    }
    
    extension [Self <: HideMenusOptions](x: Self) {
      
      inline def setHideEdit(value: Boolean): Self = StObject.set(x, "hideEdit", value.asInstanceOf[js.Any])
      
      inline def setHideWindow(value: Boolean): Self = StObject.set(x, "hideWindow", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IEventEmitter extends StObject {
    
    def addListener(event: String, listener: js.Function): EventEmitter = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    
    def listeners(event: String): js.Array[js.Function] = js.native
    
    def on(event: String, listener: js.Function): EventEmitter = js.native
    
    def once(event: String, listener: js.Function): EventEmitter = js.native
    
    def removeAllListeners(): EventEmitter = js.native
    def removeAllListeners(event: String): EventEmitter = js.native
    
    def removeListener(event: String, listener: js.Function): EventEmitter = js.native
    
    def setMaxListeners(n: Double): Unit = js.native
  }
  
  trait MenuConfig extends StObject {
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MenuConfig {
    
    inline def apply(): MenuConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuConfig]
    }
    
    extension [Self <: MenuConfig](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait MenuItemConfig extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var click: js.UndefOr[js.Function] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var modifiers: js.UndefOr[String] = js.undefined
    
    var submenu: js.UndefOr[Menu] = js.undefined
    
    var tooltip: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MenuItemConfig {
    
    inline def apply(): MenuItemConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemConfig]
    }
    
    extension [Self <: MenuItemConfig](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setClick(value: js.Function): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setModifiers(value: String): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setSubmenu(value: Menu): Self = StObject.set(x, "submenu", value.asInstanceOf[js.Any])
      
      inline def setSubmenuUndefined: Self = StObject.set(x, "submenu", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ShortcutOption extends StObject {
    
    var active: js.Function
    
    var failed: js.Function
    
    var key: String
  }
  object ShortcutOption {
    
    inline def apply(active: js.Function, failed: js.Function, key: String): ShortcutOption = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShortcutOption]
    }
    
    extension [Self <: ShortcutOption](x: Self) {
      
      inline def setActive(value: js.Function): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setFailed(value: js.Function): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait TrayOption extends StObject {
    
    var alticon: js.UndefOr[String] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var menu: js.UndefOr[Menu] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var tooltip: js.UndefOr[String] = js.undefined
  }
  object TrayOption {
    
    inline def apply(): TrayOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrayOption]
    }
    
    extension [Self <: TrayOption](x: Self) {
      
      inline def setAlticon(value: String): Self = StObject.set(x, "alticon", value.asInstanceOf[js.Any])
      
      inline def setAlticonUndefined: Self = StObject.set(x, "alticon", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMenu(value: Menu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  trait WindowManifestOptions extends StObject {
    
    var frame: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var max_height: js.UndefOr[Double] = js.undefined
    
    var max_width: js.UndefOr[Double] = js.undefined
    
    var min_height: js.UndefOr[Double] = js.undefined
    
    var min_width: js.UndefOr[Double] = js.undefined
    
    var position: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var toolbar: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object WindowManifestOptions {
    
    inline def apply(): WindowManifestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WindowManifestOptions]
    }
    
    extension [Self <: WindowManifestOptions](x: Self) {
      
      inline def setFrame(value: Boolean): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMax_height(value: Double): Self = StObject.set(x, "max_height", value.asInstanceOf[js.Any])
      
      inline def setMax_heightUndefined: Self = StObject.set(x, "max_height", js.undefined)
      
      inline def setMax_width(value: Double): Self = StObject.set(x, "max_width", value.asInstanceOf[js.Any])
      
      inline def setMax_widthUndefined: Self = StObject.set(x, "max_width", js.undefined)
      
      inline def setMin_height(value: Double): Self = StObject.set(x, "min_height", value.asInstanceOf[js.Any])
      
      inline def setMin_heightUndefined: Self = StObject.set(x, "min_height", js.undefined)
      
      inline def setMin_width(value: Double): Self = StObject.set(x, "min_width", value.asInstanceOf[js.Any])
      
      inline def setMin_widthUndefined: Self = StObject.set(x, "min_width", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setToolbar(value: Boolean): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
