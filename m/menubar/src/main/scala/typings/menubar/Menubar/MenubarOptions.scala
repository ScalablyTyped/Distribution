package typings.menubar.Menubar

import typings.electron.Electron.BrowserWindow
import typings.electron.Electron.BrowserWindowConstructorOptions
import typings.electron.Electron.NativeImage
import typings.electron.Electron.Tray
import typings.electron.Electron.WebPreferences
import typings.electron.electronStrings.`appearance-based`
import typings.electron.electronStrings.`medium-light`
import typings.electron.electronStrings.`ultra-dark`
import typings.electron.electronStrings.customButtonsOnHover
import typings.electron.electronStrings.dark
import typings.electron.electronStrings.default
import typings.electron.electronStrings.hidden
import typings.electron.electronStrings.hiddenInset
import typings.electron.electronStrings.light
import typings.electron.electronStrings.menu
import typings.electron.electronStrings.popover
import typings.electron.electronStrings.selection
import typings.electron.electronStrings.sidebar
import typings.electron.electronStrings.titlebar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenubarOptions extends BrowserWindowConstructorOptions {
  var dir: js.UndefOr[String] = js.undefined
  var index: js.UndefOr[String] = js.undefined
  var preloadWindow: js.UndefOr[Boolean] = js.undefined
  var showDockIcon: js.UndefOr[Boolean] = js.undefined
  var showOnAllWorkspaces: js.UndefOr[Boolean] = js.undefined
  var showOnRightClick: js.UndefOr[Boolean] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
  var tray: js.UndefOr[Tray] = js.undefined
  var windowPosition: js.UndefOr[Position] = js.undefined
}

object MenubarOptions {
  @scala.inline
  def apply(
    acceptFirstMouse: js.UndefOr[Boolean] = js.undefined,
    alwaysOnTop: js.UndefOr[Boolean] = js.undefined,
    autoHideMenuBar: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String = null,
    center: js.UndefOr[Boolean] = js.undefined,
    closable: js.UndefOr[Boolean] = js.undefined,
    darkTheme: js.UndefOr[Boolean] = js.undefined,
    dir: String = null,
    disableAutoHideCursor: js.UndefOr[Boolean] = js.undefined,
    enableLargerThanScreen: js.UndefOr[Boolean] = js.undefined,
    focusable: js.UndefOr[Boolean] = js.undefined,
    frame: js.UndefOr[Boolean] = js.undefined,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    fullscreenWindowTitle: js.UndefOr[Boolean] = js.undefined,
    fullscreenable: js.UndefOr[Boolean] = js.undefined,
    hasShadow: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    icon: NativeImage | String = null,
    index: String = null,
    kiosk: js.UndefOr[Boolean] = js.undefined,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    maximizable: js.UndefOr[Boolean] = js.undefined,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    minimizable: js.UndefOr[Boolean] = js.undefined,
    modal: js.UndefOr[Boolean] = js.undefined,
    movable: js.UndefOr[Boolean] = js.undefined,
    opacity: Int | Double = null,
    parent: BrowserWindow = null,
    preloadWindow: js.UndefOr[Boolean] = js.undefined,
    resizable: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    showDockIcon: js.UndefOr[Boolean] = js.undefined,
    showOnAllWorkspaces: js.UndefOr[Boolean] = js.undefined,
    showOnRightClick: js.UndefOr[Boolean] = js.undefined,
    simpleFullscreen: js.UndefOr[Boolean] = js.undefined,
    skipTaskbar: js.UndefOr[Boolean] = js.undefined,
    tabbingIdentifier: String = null,
    thickFrame: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    titleBarStyle: default | hidden | hiddenInset | customButtonsOnHover = null,
    tooltip: String = null,
    transparent: js.UndefOr[Boolean] = js.undefined,
    tray: Tray = null,
    `type`: String = null,
    useContentSize: js.UndefOr[Boolean] = js.undefined,
    vibrancy: `appearance-based` | light | dark | titlebar | selection | menu | popover | sidebar | `medium-light` | `ultra-dark` = null,
    webPreferences: WebPreferences = null,
    width: Int | Double = null,
    windowPosition: Position = null,
    x: Int | Double = null,
    y: Int | Double = null,
    zoomToPageWidth: js.UndefOr[Boolean] = js.undefined
  ): MenubarOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptFirstMouse)) __obj.updateDynamic("acceptFirstMouse")(acceptFirstMouse)
    if (!js.isUndefined(alwaysOnTop)) __obj.updateDynamic("alwaysOnTop")(alwaysOnTop)
    if (!js.isUndefined(autoHideMenuBar)) __obj.updateDynamic("autoHideMenuBar")(autoHideMenuBar)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (!js.isUndefined(darkTheme)) __obj.updateDynamic("darkTheme")(darkTheme)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (!js.isUndefined(disableAutoHideCursor)) __obj.updateDynamic("disableAutoHideCursor")(disableAutoHideCursor)
    if (!js.isUndefined(enableLargerThanScreen)) __obj.updateDynamic("enableLargerThanScreen")(enableLargerThanScreen)
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable)
    if (!js.isUndefined(frame)) __obj.updateDynamic("frame")(frame)
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen)
    if (!js.isUndefined(fullscreenWindowTitle)) __obj.updateDynamic("fullscreenWindowTitle")(fullscreenWindowTitle)
    if (!js.isUndefined(fullscreenable)) __obj.updateDynamic("fullscreenable")(fullscreenable)
    if (!js.isUndefined(hasShadow)) __obj.updateDynamic("hasShadow")(hasShadow)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index)
    if (!js.isUndefined(kiosk)) __obj.updateDynamic("kiosk")(kiosk)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(maximizable)) __obj.updateDynamic("maximizable")(maximizable)
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(minimizable)) __obj.updateDynamic("minimizable")(minimizable)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (!js.isUndefined(movable)) __obj.updateDynamic("movable")(movable)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (!js.isUndefined(preloadWindow)) __obj.updateDynamic("preloadWindow")(preloadWindow)
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (!js.isUndefined(showDockIcon)) __obj.updateDynamic("showDockIcon")(showDockIcon)
    if (!js.isUndefined(showOnAllWorkspaces)) __obj.updateDynamic("showOnAllWorkspaces")(showOnAllWorkspaces)
    if (!js.isUndefined(showOnRightClick)) __obj.updateDynamic("showOnRightClick")(showOnRightClick)
    if (!js.isUndefined(simpleFullscreen)) __obj.updateDynamic("simpleFullscreen")(simpleFullscreen)
    if (!js.isUndefined(skipTaskbar)) __obj.updateDynamic("skipTaskbar")(skipTaskbar)
    if (tabbingIdentifier != null) __obj.updateDynamic("tabbingIdentifier")(tabbingIdentifier)
    if (!js.isUndefined(thickFrame)) __obj.updateDynamic("thickFrame")(thickFrame)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleBarStyle != null) __obj.updateDynamic("titleBarStyle")(titleBarStyle.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    if (tray != null) __obj.updateDynamic("tray")(tray)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(useContentSize)) __obj.updateDynamic("useContentSize")(useContentSize)
    if (vibrancy != null) __obj.updateDynamic("vibrancy")(vibrancy.asInstanceOf[js.Any])
    if (webPreferences != null) __obj.updateDynamic("webPreferences")(webPreferences)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (windowPosition != null) __obj.updateDynamic("windowPosition")(windowPosition)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomToPageWidth)) __obj.updateDynamic("zoomToPageWidth")(zoomToPageWidth)
    __obj.asInstanceOf[MenubarOptions]
  }
}

