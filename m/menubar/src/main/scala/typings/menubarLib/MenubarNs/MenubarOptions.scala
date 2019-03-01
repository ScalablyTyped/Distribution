package typings
package menubarLib.MenubarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenubarOptions
  extends electronLib.ElectronNs.BrowserWindowConstructorOptions {
  var dir: js.UndefOr[java.lang.String] = js.undefined
  var index: js.UndefOr[java.lang.String] = js.undefined
  var preloadWindow: js.UndefOr[scala.Boolean] = js.undefined
  var showDockIcon: js.UndefOr[scala.Boolean] = js.undefined
  var showOnAllWorkspaces: js.UndefOr[scala.Boolean] = js.undefined
  var showOnRightClick: js.UndefOr[scala.Boolean] = js.undefined
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
  var tray: js.UndefOr[electronLib.ElectronNs.Tray] = js.undefined
  var windowPosition: js.UndefOr[Position] = js.undefined
}

object MenubarOptions {
  @scala.inline
  def apply(
    acceptFirstMouse: js.UndefOr[scala.Boolean] = js.undefined,
    alwaysOnTop: js.UndefOr[scala.Boolean] = js.undefined,
    autoHideMenuBar: js.UndefOr[scala.Boolean] = js.undefined,
    backgroundColor: java.lang.String = null,
    center: js.UndefOr[scala.Boolean] = js.undefined,
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    darkTheme: js.UndefOr[scala.Boolean] = js.undefined,
    dir: java.lang.String = null,
    disableAutoHideCursor: js.UndefOr[scala.Boolean] = js.undefined,
    enableLargerThanScreen: js.UndefOr[scala.Boolean] = js.undefined,
    focusable: js.UndefOr[scala.Boolean] = js.undefined,
    frame: js.UndefOr[scala.Boolean] = js.undefined,
    fullscreen: js.UndefOr[scala.Boolean] = js.undefined,
    fullscreenWindowTitle: js.UndefOr[scala.Boolean] = js.undefined,
    fullscreenable: js.UndefOr[scala.Boolean] = js.undefined,
    hasShadow: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    icon: electronLib.ElectronNs.NativeImage | java.lang.String = null,
    index: java.lang.String = null,
    kiosk: js.UndefOr[scala.Boolean] = js.undefined,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    maximizable: js.UndefOr[scala.Boolean] = js.undefined,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    minimizable: js.UndefOr[scala.Boolean] = js.undefined,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    movable: js.UndefOr[scala.Boolean] = js.undefined,
    opacity: scala.Int | scala.Double = null,
    parent: electronLib.ElectronNs.BrowserWindow = null,
    preloadWindow: js.UndefOr[scala.Boolean] = js.undefined,
    resizable: js.UndefOr[scala.Boolean] = js.undefined,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    showDockIcon: js.UndefOr[scala.Boolean] = js.undefined,
    showOnAllWorkspaces: js.UndefOr[scala.Boolean] = js.undefined,
    showOnRightClick: js.UndefOr[scala.Boolean] = js.undefined,
    simpleFullscreen: js.UndefOr[scala.Boolean] = js.undefined,
    skipTaskbar: js.UndefOr[scala.Boolean] = js.undefined,
    tabbingIdentifier: java.lang.String = null,
    thickFrame: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    titleBarStyle: electronLib.electronLibStrings.default | electronLib.electronLibStrings.hidden | electronLib.electronLibStrings.hiddenInset | electronLib.electronLibStrings.customButtonsOnHover = null,
    tooltip: java.lang.String = null,
    transparent: js.UndefOr[scala.Boolean] = js.undefined,
    tray: electronLib.ElectronNs.Tray = null,
    `type`: java.lang.String = null,
    useContentSize: js.UndefOr[scala.Boolean] = js.undefined,
    vibrancy: electronLib.electronLibStrings.`appearance-based` | electronLib.electronLibStrings.light | electronLib.electronLibStrings.dark | electronLib.electronLibStrings.titlebar | electronLib.electronLibStrings.selection | electronLib.electronLibStrings.menu | electronLib.electronLibStrings.popover | electronLib.electronLibStrings.sidebar | electronLib.electronLibStrings.`medium-light` | electronLib.electronLibStrings.`ultra-dark` = null,
    webPreferences: electronLib.ElectronNs.WebPreferences = null,
    width: scala.Int | scala.Double = null,
    windowPosition: Position = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null,
    zoomToPageWidth: js.UndefOr[scala.Boolean] = js.undefined
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

