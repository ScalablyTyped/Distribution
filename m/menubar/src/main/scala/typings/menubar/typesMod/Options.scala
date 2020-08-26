package typings.menubar.typesMod

import typings.electron.Electron.BrowserWindowConstructorOptions
import typings.electron.Electron.LoadURLOptions
import typings.electron.Electron.NativeImage_
import typings.electron.mod.Tray
import typings.menubar.menubarBooleans.`false`
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

@js.native
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
  var browserWindow: BrowserWindowConstructorOptions = js.native
  /**
    * The app source directory.
    */
  var dir: String = js.native
  /**
    * The png icon to use for the menubar. A good size to start with is 20x20.
    * To support retina, supply a 2x sized image (e.g. 40x40) with @2x added to
    * the end of the name, so icon.png and icon@2x.png and Electron will
    * automatically use your @2x version on retina screens.
    */
  var icon: js.UndefOr[String | NativeImage_] = js.native
  /**
    * The URL to load the menubar's browserWindow with. The url can be a remote
    * address (e.g. `http://`) or a path to a local HTML file using the
    * `file://` protocol. If false, then menubar won't call `loadUrl` on
    * start.
    * @default `file:// + options.dir + index.html`
    * @see https://electronjs.org/docs/api/browser-window#winloadurlurl-options
    */
  var index: String | `false` = js.native
  /**
    * The options passed when loading the index URL in the menubar's
    * browserWindow. Everything browserWindow.loadUrl supports is supported;
    * this object is simply passed onto browserWindow.loadUrl
    * @default `{}`
    * @see https://electronjs.org/docs/api/browser-window#winloadurlurl-options
    */
  var loadUrlOptions: js.UndefOr[LoadURLOptions] = js.native
  /**
    * Create BrowserWindow instance before it is used -- increasing resource
    * usage, but making the click on the menubar load faster.
    */
  var preloadWindow: js.UndefOr[Boolean] = js.native
  /**
    * Configure the visibility of the application dock icon, macOS only. Calls
    * [`app.dock.hide`](https://electronjs.org/docs/api/app#appdockhide-macos).
    */
  var showDockIcon: js.UndefOr[Boolean] = js.native
  /**
    * Makes the window available on all OS X workspaces. Calls
    * [`setVisibleOnAllWorkspaces`](https://electronjs.org/docs/api/browser-window#winsetvisibleonallworkspacesvisible-options).
    */
  var showOnAllWorkspaces: js.UndefOr[Boolean] = js.native
  /**
    * Show the window on 'right-click' event instead of regular 'click'.
    */
  var showOnRightClick: js.UndefOr[Boolean] = js.native
  /**
    * Menubar tray icon tooltip text. Calls [`tray.setTooltip`](https://electronjs.org/docs/api/tray#traysettooltiptooltip).
    */
  var tooltip: String = js.native
  /**
    * An electron Tray instance. If provided, `options.icon` will be ignored.
    */
  var tray: js.UndefOr[Tray] = js.native
  /**
    * Sets the window position (x and y will still override this), check
    * electron-positioner docs for valid values.
    */
  var windowPosition: js.UndefOr[
    trayLeft | trayBottomLeft | trayRight | trayBottomRight | trayCenter | trayBottomCenter | topLeft | topRight | bottomLeft | bottomRight | topCenter | bottomCenter | leftCenter | rightCenter | center
  ] = js.native
}

object Options {
  @scala.inline
  def apply(
    browserWindow: BrowserWindowConstructorOptions,
    dir: String,
    index: String | `false`,
    tooltip: String
  ): Options = {
    val __obj = js.Dynamic.literal(browserWindow = browserWindow.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBrowserWindow(value: BrowserWindowConstructorOptions): Self = this.set("browserWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: String | `false`): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: String | NativeImage_): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setLoadUrlOptions(value: LoadURLOptions): Self = this.set("loadUrlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadUrlOptions: Self = this.set("loadUrlOptions", js.undefined)
    @scala.inline
    def setPreloadWindow(value: Boolean): Self = this.set("preloadWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreloadWindow: Self = this.set("preloadWindow", js.undefined)
    @scala.inline
    def setShowDockIcon(value: Boolean): Self = this.set("showDockIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDockIcon: Self = this.set("showDockIcon", js.undefined)
    @scala.inline
    def setShowOnAllWorkspaces(value: Boolean): Self = this.set("showOnAllWorkspaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowOnAllWorkspaces: Self = this.set("showOnAllWorkspaces", js.undefined)
    @scala.inline
    def setShowOnRightClick(value: Boolean): Self = this.set("showOnRightClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowOnRightClick: Self = this.set("showOnRightClick", js.undefined)
    @scala.inline
    def setTray(value: Tray): Self = this.set("tray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTray: Self = this.set("tray", js.undefined)
    @scala.inline
    def setWindowPosition(
      value: trayLeft | trayBottomLeft | trayRight | trayBottomRight | trayCenter | trayBottomCenter | topLeft | topRight | bottomLeft | bottomRight | topCenter | bottomCenter | leftCenter | rightCenter | center
    ): Self = this.set("windowPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowPosition: Self = this.set("windowPosition", js.undefined)
  }
  
}

