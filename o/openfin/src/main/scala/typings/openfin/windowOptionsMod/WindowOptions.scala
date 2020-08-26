package typings.openfin.windowOptionsMod

import typings.openfin.anon.Blacklist
import typings.openfin.anon.Blue
import typings.openfin.anon.BottomRightCorner
import typings.openfin.anon.Devtools
import typings.openfin.anon.Enable
import typings.openfin.anon.NodeIntegration
import typings.openfin.anon.Width
import typings.openfin.errorBOXTYPESMod.ERROR_BOX_TYPES
import typings.openfin.openfinStrings.`main-window`
import typings.openfin.openfinStrings.all
import typings.openfin.openfinStrings.last
import typings.openfin.openfinStrings.maximized
import typings.openfin.openfinStrings.minimized
import typings.openfin.openfinStrings.normal
import typings.openfin.preloadScriptMod.PreloadScript
import typings.openfin.shapesLayoutMod.Layout
import typings.openfin.shapesMod.Hotkey
import typings.openfin.webOptionsMod.WebOptions
import typings.openfin.webRequestHeaderMod.WebRequestHeaderConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowOptions extends WebOptions {
  var _type: js.UndefOr[ERROR_BOX_TYPES] = js.native
  var accelerator: js.UndefOr[Devtools] = js.native
  var alphaMask: js.UndefOr[Blue] = js.native
  var alwaysOnBottom: js.UndefOr[Boolean] = js.native
  var alwaysOnTop: js.UndefOr[Boolean] = js.native
  var api: js.UndefOr[js.Any] = js.native
  var appLogFlushInterval: js.UndefOr[Double] = js.native
  var applicationIcon: js.UndefOr[String] = js.native
  var aspectRatio: js.UndefOr[Double] = js.native
  var autoShow: js.UndefOr[Boolean] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var backgroundThrottling: js.UndefOr[Boolean] = js.native
  var center: js.UndefOr[Boolean] = js.native
  var contentNavigation: js.UndefOr[Null | Blacklist] = js.native
  var contextMenu: js.UndefOr[Boolean] = js.native
  var contextMenuSettings: js.UndefOr[Enable] = js.native
  var cornerRounding: js.UndefOr[Width] = js.native
  var customData: js.UndefOr[String] = js.native
  var customRequestHeaders: js.UndefOr[js.Array[WebRequestHeaderConfig]] = js.native
  var defaultCentered: js.UndefOr[Boolean] = js.native
  var defaultHeight: js.UndefOr[Double] = js.native
  var defaultLeft: js.UndefOr[Double] = js.native
  var defaultTop: js.UndefOr[Double] = js.native
  var defaultWidth: js.UndefOr[Double] = js.native
  var description: js.UndefOr[String] = js.native
  var disableIabSecureLogging: js.UndefOr[Boolean] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var `enable-plugins`: js.UndefOr[Boolean] = js.native
  var enableAppLogging: js.UndefOr[Boolean] = js.native
  var enableLargerThanScreen: js.UndefOr[Boolean] = js.native
  var exitOnClose: js.UndefOr[Boolean] = js.native
  var fdc3Api: js.UndefOr[Boolean] = js.native
  var fdc3Manifest: js.UndefOr[String] = js.native
  var frame: js.UndefOr[Boolean] = js.native
  var frameConnect: js.UndefOr[all | last | `main-window`] = js.native
  var hasLoaded: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var hideOnBlur: js.UndefOr[Boolean] = js.native
  var hideOnClose: js.UndefOr[Boolean] = js.native
  var hideWhileChildrenVisible: js.UndefOr[Boolean] = js.native
  var hotkeys: js.UndefOr[js.Array[Hotkey]] = js.native
  var icon: js.UndefOr[String] = js.native
  var isRawWindowOpen: js.UndefOr[Boolean] = js.native
  var launchExternal: js.UndefOr[String] = js.native
  var layout: js.UndefOr[Layout] = js.native
  var loadErrorMessage: js.UndefOr[String] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var maximizable: js.UndefOr[Boolean] = js.native
  var minHeight: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var minimizable: js.UndefOr[Boolean] = js.native
  var nonPersistant: js.UndefOr[Boolean] = js.native
  var nonPersistent: js.UndefOr[Boolean] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var plugins: js.UndefOr[Boolean] = js.native
  var preload: js.UndefOr[String | js.Array[PreloadScript]] = js.native
  var resizable: js.UndefOr[Boolean] = js.native
  var resize: js.UndefOr[Boolean] = js.native
  var resizeRegion: js.UndefOr[BottomRightCorner] = js.native
  var saveWindowState: js.UndefOr[Boolean] = js.native
  var shadow: js.UndefOr[Boolean] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var showBackgroundImages: js.UndefOr[Boolean] = js.native
  var showTaskbarIcon: js.UndefOr[Boolean] = js.native
  var skipTaskbar: js.UndefOr[Boolean] = js.native
  var smallWindow: js.UndefOr[Boolean] = js.native
  var state: js.UndefOr[maximized | minimized | normal] = js.native
  var taskbarIcon: js.UndefOr[String] = js.native
  var taskbarIconGroup: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var toShowOnRun: js.UndefOr[Boolean] = js.native
  var transparent: js.UndefOr[Boolean] = js.native
  var url: js.UndefOr[String] = js.native
  var waitForPageLoad: js.UndefOr[Boolean] = js.native
  var webPreferences: js.UndefOr[NodeIntegration] = js.native
  var width: js.UndefOr[Double] = js.native
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
}

object WindowOptions {
  @scala.inline
  def apply(name: String, uuid: String): WindowOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOptions]
  }
  @scala.inline
  implicit class WindowOptionsOps[Self <: WindowOptions] (val x: Self) extends AnyVal {
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
    def set_type(value: ERROR_BOX_TYPES): Self = this.set("_type", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    @scala.inline
    def setAccelerator(value: Devtools): Self = this.set("accelerator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccelerator: Self = this.set("accelerator", js.undefined)
    @scala.inline
    def setAlphaMask(value: Blue): Self = this.set("alphaMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlphaMask: Self = this.set("alphaMask", js.undefined)
    @scala.inline
    def setAlwaysOnBottom(value: Boolean): Self = this.set("alwaysOnBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysOnBottom: Self = this.set("alwaysOnBottom", js.undefined)
    @scala.inline
    def setAlwaysOnTop(value: Boolean): Self = this.set("alwaysOnTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysOnTop: Self = this.set("alwaysOnTop", js.undefined)
    @scala.inline
    def setApi(value: js.Any): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApi: Self = this.set("api", js.undefined)
    @scala.inline
    def setAppLogFlushInterval(value: Double): Self = this.set("appLogFlushInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppLogFlushInterval: Self = this.set("appLogFlushInterval", js.undefined)
    @scala.inline
    def setApplicationIcon(value: String): Self = this.set("applicationIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationIcon: Self = this.set("applicationIcon", js.undefined)
    @scala.inline
    def setAspectRatio(value: Double): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    @scala.inline
    def setAutoShow(value: Boolean): Self = this.set("autoShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoShow: Self = this.set("autoShow", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBackgroundThrottling(value: Boolean): Self = this.set("backgroundThrottling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundThrottling: Self = this.set("backgroundThrottling", js.undefined)
    @scala.inline
    def setCenter(value: Boolean): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setContentNavigation(value: Blacklist): Self = this.set("contentNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentNavigation: Self = this.set("contentNavigation", js.undefined)
    @scala.inline
    def setContentNavigationNull: Self = this.set("contentNavigation", null)
    @scala.inline
    def setContextMenu(value: Boolean): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    @scala.inline
    def setContextMenuSettings(value: Enable): Self = this.set("contextMenuSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenuSettings: Self = this.set("contextMenuSettings", js.undefined)
    @scala.inline
    def setCornerRounding(value: Width): Self = this.set("cornerRounding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCornerRounding: Self = this.set("cornerRounding", js.undefined)
    @scala.inline
    def setCustomData(value: String): Self = this.set("customData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomData: Self = this.set("customData", js.undefined)
    @scala.inline
    def setCustomRequestHeadersVarargs(value: WebRequestHeaderConfig*): Self = this.set("customRequestHeaders", js.Array(value :_*))
    @scala.inline
    def setCustomRequestHeaders(value: js.Array[WebRequestHeaderConfig]): Self = this.set("customRequestHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomRequestHeaders: Self = this.set("customRequestHeaders", js.undefined)
    @scala.inline
    def setDefaultCentered(value: Boolean): Self = this.set("defaultCentered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultCentered: Self = this.set("defaultCentered", js.undefined)
    @scala.inline
    def setDefaultHeight(value: Double): Self = this.set("defaultHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultHeight: Self = this.set("defaultHeight", js.undefined)
    @scala.inline
    def setDefaultLeft(value: Double): Self = this.set("defaultLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultLeft: Self = this.set("defaultLeft", js.undefined)
    @scala.inline
    def setDefaultTop(value: Double): Self = this.set("defaultTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTop: Self = this.set("defaultTop", js.undefined)
    @scala.inline
    def setDefaultWidth(value: Double): Self = this.set("defaultWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultWidth: Self = this.set("defaultWidth", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisableIabSecureLogging(value: Boolean): Self = this.set("disableIabSecureLogging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableIabSecureLogging: Self = this.set("disableIabSecureLogging", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def `setEnable-plugins`(value: Boolean): Self = this.set("enable-plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteEnable-plugins`: Self = this.set("enable-plugins", js.undefined)
    @scala.inline
    def setEnableAppLogging(value: Boolean): Self = this.set("enableAppLogging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAppLogging: Self = this.set("enableAppLogging", js.undefined)
    @scala.inline
    def setEnableLargerThanScreen(value: Boolean): Self = this.set("enableLargerThanScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableLargerThanScreen: Self = this.set("enableLargerThanScreen", js.undefined)
    @scala.inline
    def setExitOnClose(value: Boolean): Self = this.set("exitOnClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExitOnClose: Self = this.set("exitOnClose", js.undefined)
    @scala.inline
    def setFdc3Api(value: Boolean): Self = this.set("fdc3Api", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFdc3Api: Self = this.set("fdc3Api", js.undefined)
    @scala.inline
    def setFdc3Manifest(value: String): Self = this.set("fdc3Manifest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFdc3Manifest: Self = this.set("fdc3Manifest", js.undefined)
    @scala.inline
    def setFrame(value: Boolean): Self = this.set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
    @scala.inline
    def setFrameConnect(value: all | last | `main-window`): Self = this.set("frameConnect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameConnect: Self = this.set("frameConnect", js.undefined)
    @scala.inline
    def setHasLoaded(value: Boolean): Self = this.set("hasLoaded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasLoaded: Self = this.set("hasLoaded", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHideOnBlur(value: Boolean): Self = this.set("hideOnBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideOnBlur: Self = this.set("hideOnBlur", js.undefined)
    @scala.inline
    def setHideOnClose(value: Boolean): Self = this.set("hideOnClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideOnClose: Self = this.set("hideOnClose", js.undefined)
    @scala.inline
    def setHideWhileChildrenVisible(value: Boolean): Self = this.set("hideWhileChildrenVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideWhileChildrenVisible: Self = this.set("hideWhileChildrenVisible", js.undefined)
    @scala.inline
    def setHotkeysVarargs(value: Hotkey*): Self = this.set("hotkeys", js.Array(value :_*))
    @scala.inline
    def setHotkeys(value: js.Array[Hotkey]): Self = this.set("hotkeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHotkeys: Self = this.set("hotkeys", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIsRawWindowOpen(value: Boolean): Self = this.set("isRawWindowOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRawWindowOpen: Self = this.set("isRawWindowOpen", js.undefined)
    @scala.inline
    def setLaunchExternal(value: String): Self = this.set("launchExternal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchExternal: Self = this.set("launchExternal", js.undefined)
    @scala.inline
    def setLayout(value: Layout): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setLoadErrorMessage(value: String): Self = this.set("loadErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadErrorMessage: Self = this.set("loadErrorMessage", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMaximizable(value: Boolean): Self = this.set("maximizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximizable: Self = this.set("maximizable", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setMinimizable(value: Boolean): Self = this.set("minimizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimizable: Self = this.set("minimizable", js.undefined)
    @scala.inline
    def setNonPersistant(value: Boolean): Self = this.set("nonPersistant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonPersistant: Self = this.set("nonPersistant", js.undefined)
    @scala.inline
    def setNonPersistent(value: Boolean): Self = this.set("nonPersistent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonPersistent: Self = this.set("nonPersistent", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setPlugins(value: Boolean): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setPreloadVarargs(value: PreloadScript*): Self = this.set("preload", js.Array(value :_*))
    @scala.inline
    def setPreload(value: String | js.Array[PreloadScript]): Self = this.set("preload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    @scala.inline
    def setResize(value: Boolean): Self = this.set("resize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setResizeRegion(value: BottomRightCorner): Self = this.set("resizeRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeRegion: Self = this.set("resizeRegion", js.undefined)
    @scala.inline
    def setSaveWindowState(value: Boolean): Self = this.set("saveWindowState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveWindowState: Self = this.set("saveWindowState", js.undefined)
    @scala.inline
    def setShadow(value: Boolean): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setShowBackgroundImages(value: Boolean): Self = this.set("showBackgroundImages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowBackgroundImages: Self = this.set("showBackgroundImages", js.undefined)
    @scala.inline
    def setShowTaskbarIcon(value: Boolean): Self = this.set("showTaskbarIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTaskbarIcon: Self = this.set("showTaskbarIcon", js.undefined)
    @scala.inline
    def setSkipTaskbar(value: Boolean): Self = this.set("skipTaskbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipTaskbar: Self = this.set("skipTaskbar", js.undefined)
    @scala.inline
    def setSmallWindow(value: Boolean): Self = this.set("smallWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmallWindow: Self = this.set("smallWindow", js.undefined)
    @scala.inline
    def setState(value: maximized | minimized | normal): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setTaskbarIcon(value: String): Self = this.set("taskbarIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskbarIcon: Self = this.set("taskbarIcon", js.undefined)
    @scala.inline
    def setTaskbarIconGroup(value: String): Self = this.set("taskbarIconGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskbarIconGroup: Self = this.set("taskbarIconGroup", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setToShowOnRun(value: Boolean): Self = this.set("toShowOnRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToShowOnRun: Self = this.set("toShowOnRun", js.undefined)
    @scala.inline
    def setTransparent(value: Boolean): Self = this.set("transparent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransparent: Self = this.set("transparent", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWaitForPageLoad(value: Boolean): Self = this.set("waitForPageLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForPageLoad: Self = this.set("waitForPageLoad", js.undefined)
    @scala.inline
    def setWebPreferences(value: NodeIntegration): Self = this.set("webPreferences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebPreferences: Self = this.set("webPreferences", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

