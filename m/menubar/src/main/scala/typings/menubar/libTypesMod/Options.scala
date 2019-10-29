package typings.menubar.libTypesMod

import typings.electron.Electron.BrowserWindowConstructorOptions
import typings.electron.Electron.NativeImage
import typings.electron.electronMod.Tray
import typings.menubar.menubarStrings.bottomCenter
import typings.menubar.menubarStrings.bottomLeft
import typings.menubar.menubarStrings.bottomRight
import typings.menubar.menubarStrings.center
import typings.menubar.menubarStrings.leftCenter
import typings.menubar.menubarStrings.rightCenter
import typings.menubar.menubarStrings.topCenter
import typings.menubar.menubarStrings.topLeft
import typings.menubar.menubarStrings.topRight
import typings.menubar.menubarStrings.trayBottomCenter
import typings.menubar.menubarStrings.trayBottomLeft
import typings.menubar.menubarStrings.trayBottomRight
import typings.menubar.menubarStrings.trayCenter
import typings.menubar.menubarStrings.trayLeft
import typings.menubar.menubarStrings.trayRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * An Electron BrowserWindow instance, or an options object to be passed into
    * the BrowserWindow constructor.
    * @example
    * ```typescript
    * const options = { height: 640, width: 480 };
    *
    * const mb = new Menubar({
    *   browserWindow: options
    * });
    * ```
    */
  var browserWindow: BrowserWindowConstructorOptions
  /**
    * The app source directory.
    */
  var dir: String
  /**
    * The png icon to use for the menubar. A good size to start with is 20x20.
    * To support retina, supply a 2x sized image (e.g. 40x40) with @2x added to
    * the end of the name, so icon.png and icon@2x.png and Electron will
    * automatically use your @2x version on retina screens.
    */
  var icon: js.UndefOr[String | NativeImage] = js.undefined
  /**
    * The html to load for the pop up window.
    */
  var index: String
  /**
    * Create BrowserWindow instance before it is used -- increasing resource
    * usage, but making the click on the menubar load faster.
    */
  var preloadWindow: js.UndefOr[Boolean] = js.undefined
  /**
    * Configure the visibility of the application dock icon, macOS only. Calls
    * [`app.dock.hide`](https://electronjs.org/docs/api/app#appdockhide-macos).
    */
  var showDockIcon: js.UndefOr[Boolean] = js.undefined
  /**
    * Makes the window available on all OS X workspaces. Calls
    * [`setVisibleOnAllWorkspaces`](https://electronjs.org/docs/api/browser-window#winsetvisibleonallworkspacesvisible-options).
    */
  var showOnAllWorkspaces: js.UndefOr[Boolean] = js.undefined
  /**
    * Show the window on 'right-click' event instead of regular 'click'.
    */
  var showOnRightClick: js.UndefOr[Boolean] = js.undefined
  /**
    * Menubar tray icon tooltip text. Calls [`tray.setTooltip`](https://electronjs.org/docs/api/tray#traysettooltiptooltip).
    */
  var tooltip: String
  /**
    * An electron Tray instance. If provided, `options.icon` will be ignored.
    */
  var tray: js.UndefOr[Tray] = js.undefined
  /**
    * Sets the window position (x and y will still override this), check
    * electron-positioner docs for valid values.
    */
  var windowPosition: js.UndefOr[
    trayLeft | trayBottomLeft | trayRight | trayBottomRight | trayCenter | trayBottomCenter | topLeft | topRight | bottomLeft | bottomRight | topCenter | bottomCenter | leftCenter | rightCenter | center
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    browserWindow: BrowserWindowConstructorOptions,
    dir: String,
    index: String,
    tooltip: String,
    icon: String | NativeImage = null,
    preloadWindow: js.UndefOr[Boolean] = js.undefined,
    showDockIcon: js.UndefOr[Boolean] = js.undefined,
    showOnAllWorkspaces: js.UndefOr[Boolean] = js.undefined,
    showOnRightClick: js.UndefOr[Boolean] = js.undefined,
    tray: Tray = null,
    windowPosition: trayLeft | trayBottomLeft | trayRight | trayBottomRight | trayCenter | trayBottomCenter | topLeft | topRight | bottomLeft | bottomRight | topCenter | bottomCenter | leftCenter | rightCenter | center = null
  ): Options = {
    val __obj = js.Dynamic.literal(browserWindow = browserWindow, dir = dir, index = index, tooltip = tooltip)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(preloadWindow)) __obj.updateDynamic("preloadWindow")(preloadWindow)
    if (!js.isUndefined(showDockIcon)) __obj.updateDynamic("showDockIcon")(showDockIcon)
    if (!js.isUndefined(showOnAllWorkspaces)) __obj.updateDynamic("showOnAllWorkspaces")(showOnAllWorkspaces)
    if (!js.isUndefined(showOnRightClick)) __obj.updateDynamic("showOnRightClick")(showOnRightClick)
    if (tray != null) __obj.updateDynamic("tray")(tray)
    if (windowPosition != null) __obj.updateDynamic("windowPosition")(windowPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

