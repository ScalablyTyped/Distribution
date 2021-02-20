package typings.openfin

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowOptionsMod {
  
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
    implicit class WindowOptionsMutableBuilder[Self <: WindowOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccelerator(value: Devtools): Self = StObject.set(x, "accelerator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceleratorUndefined: Self = StObject.set(x, "accelerator", js.undefined)
      
      @scala.inline
      def setAlphaMask(value: Blue): Self = StObject.set(x, "alphaMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaMaskUndefined: Self = StObject.set(x, "alphaMask", js.undefined)
      
      @scala.inline
      def setAlwaysOnBottom(value: Boolean): Self = StObject.set(x, "alwaysOnBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysOnBottomUndefined: Self = StObject.set(x, "alwaysOnBottom", js.undefined)
      
      @scala.inline
      def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysOnTopUndefined: Self = StObject.set(x, "alwaysOnTop", js.undefined)
      
      @scala.inline
      def setApi(value: js.Any): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      @scala.inline
      def setAppLogFlushInterval(value: Double): Self = StObject.set(x, "appLogFlushInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppLogFlushIntervalUndefined: Self = StObject.set(x, "appLogFlushInterval", js.undefined)
      
      @scala.inline
      def setApplicationIcon(value: String): Self = StObject.set(x, "applicationIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationIconUndefined: Self = StObject.set(x, "applicationIcon", js.undefined)
      
      @scala.inline
      def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      @scala.inline
      def setAutoShow(value: Boolean): Self = StObject.set(x, "autoShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoShowUndefined: Self = StObject.set(x, "autoShow", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBackgroundThrottling(value: Boolean): Self = StObject.set(x, "backgroundThrottling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundThrottlingUndefined: Self = StObject.set(x, "backgroundThrottling", js.undefined)
      
      @scala.inline
      def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setContentNavigation(value: Blacklist): Self = StObject.set(x, "contentNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentNavigationNull: Self = StObject.set(x, "contentNavigation", null)
      
      @scala.inline
      def setContentNavigationUndefined: Self = StObject.set(x, "contentNavigation", js.undefined)
      
      @scala.inline
      def setContextMenu(value: Boolean): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuSettings(value: Enable): Self = StObject.set(x, "contextMenuSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuSettingsUndefined: Self = StObject.set(x, "contextMenuSettings", js.undefined)
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setCornerRounding(value: Width): Self = StObject.set(x, "cornerRounding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRoundingUndefined: Self = StObject.set(x, "cornerRounding", js.undefined)
      
      @scala.inline
      def setCustomData(value: String): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      @scala.inline
      def setCustomRequestHeaders(value: js.Array[WebRequestHeaderConfig]): Self = StObject.set(x, "customRequestHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomRequestHeadersUndefined: Self = StObject.set(x, "customRequestHeaders", js.undefined)
      
      @scala.inline
      def setCustomRequestHeadersVarargs(value: WebRequestHeaderConfig*): Self = StObject.set(x, "customRequestHeaders", js.Array(value :_*))
      
      @scala.inline
      def setDefaultCentered(value: Boolean): Self = StObject.set(x, "defaultCentered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCenteredUndefined: Self = StObject.set(x, "defaultCentered", js.undefined)
      
      @scala.inline
      def setDefaultHeight(value: Double): Self = StObject.set(x, "defaultHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultHeightUndefined: Self = StObject.set(x, "defaultHeight", js.undefined)
      
      @scala.inline
      def setDefaultLeft(value: Double): Self = StObject.set(x, "defaultLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultLeftUndefined: Self = StObject.set(x, "defaultLeft", js.undefined)
      
      @scala.inline
      def setDefaultTop(value: Double): Self = StObject.set(x, "defaultTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultTopUndefined: Self = StObject.set(x, "defaultTop", js.undefined)
      
      @scala.inline
      def setDefaultWidth(value: Double): Self = StObject.set(x, "defaultWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultWidthUndefined: Self = StObject.set(x, "defaultWidth", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDisableIabSecureLogging(value: Boolean): Self = StObject.set(x, "disableIabSecureLogging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableIabSecureLoggingUndefined: Self = StObject.set(x, "disableIabSecureLogging", js.undefined)
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def `setEnable-plugins`(value: Boolean): Self = StObject.set(x, "enable-plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setEnable-pluginsUndefined`: Self = StObject.set(x, "enable-plugins", js.undefined)
      
      @scala.inline
      def setEnableAppLogging(value: Boolean): Self = StObject.set(x, "enableAppLogging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAppLoggingUndefined: Self = StObject.set(x, "enableAppLogging", js.undefined)
      
      @scala.inline
      def setEnableLargerThanScreen(value: Boolean): Self = StObject.set(x, "enableLargerThanScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableLargerThanScreenUndefined: Self = StObject.set(x, "enableLargerThanScreen", js.undefined)
      
      @scala.inline
      def setExitOnClose(value: Boolean): Self = StObject.set(x, "exitOnClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitOnCloseUndefined: Self = StObject.set(x, "exitOnClose", js.undefined)
      
      @scala.inline
      def setFdc3Api(value: Boolean): Self = StObject.set(x, "fdc3Api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFdc3ApiUndefined: Self = StObject.set(x, "fdc3Api", js.undefined)
      
      @scala.inline
      def setFdc3Manifest(value: String): Self = StObject.set(x, "fdc3Manifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFdc3ManifestUndefined: Self = StObject.set(x, "fdc3Manifest", js.undefined)
      
      @scala.inline
      def setFrame(value: Boolean): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameConnect(value: all | last | `main-window`): Self = StObject.set(x, "frameConnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameConnectUndefined: Self = StObject.set(x, "frameConnect", js.undefined)
      
      @scala.inline
      def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      @scala.inline
      def setHasLoaded(value: Boolean): Self = StObject.set(x, "hasLoaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasLoadedUndefined: Self = StObject.set(x, "hasLoaded", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHideOnBlur(value: Boolean): Self = StObject.set(x, "hideOnBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnBlurUndefined: Self = StObject.set(x, "hideOnBlur", js.undefined)
      
      @scala.inline
      def setHideOnClose(value: Boolean): Self = StObject.set(x, "hideOnClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnCloseUndefined: Self = StObject.set(x, "hideOnClose", js.undefined)
      
      @scala.inline
      def setHideWhileChildrenVisible(value: Boolean): Self = StObject.set(x, "hideWhileChildrenVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideWhileChildrenVisibleUndefined: Self = StObject.set(x, "hideWhileChildrenVisible", js.undefined)
      
      @scala.inline
      def setHotkeys(value: js.Array[Hotkey]): Self = StObject.set(x, "hotkeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHotkeysUndefined: Self = StObject.set(x, "hotkeys", js.undefined)
      
      @scala.inline
      def setHotkeysVarargs(value: Hotkey*): Self = StObject.set(x, "hotkeys", js.Array(value :_*))
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIsRawWindowOpen(value: Boolean): Self = StObject.set(x, "isRawWindowOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRawWindowOpenUndefined: Self = StObject.set(x, "isRawWindowOpen", js.undefined)
      
      @scala.inline
      def setLaunchExternal(value: String): Self = StObject.set(x, "launchExternal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchExternalUndefined: Self = StObject.set(x, "launchExternal", js.undefined)
      
      @scala.inline
      def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setLoadErrorMessage(value: String): Self = StObject.set(x, "loadErrorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadErrorMessageUndefined: Self = StObject.set(x, "loadErrorMessage", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMaximizable(value: Boolean): Self = StObject.set(x, "maximizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximizableUndefined: Self = StObject.set(x, "maximizable", js.undefined)
      
      @scala.inline
      def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setMinimizable(value: Boolean): Self = StObject.set(x, "minimizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimizableUndefined: Self = StObject.set(x, "minimizable", js.undefined)
      
      @scala.inline
      def setNonPersistant(value: Boolean): Self = StObject.set(x, "nonPersistant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonPersistantUndefined: Self = StObject.set(x, "nonPersistant", js.undefined)
      
      @scala.inline
      def setNonPersistent(value: Boolean): Self = StObject.set(x, "nonPersistent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonPersistentUndefined: Self = StObject.set(x, "nonPersistent", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPlugins(value: Boolean): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPreload(value: String | js.Array[PreloadScript]): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      @scala.inline
      def setPreloadVarargs(value: PreloadScript*): Self = StObject.set(x, "preload", js.Array(value :_*))
      
      @scala.inline
      def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      @scala.inline
      def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeRegion(value: BottomRightCorner): Self = StObject.set(x, "resizeRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeRegionUndefined: Self = StObject.set(x, "resizeRegion", js.undefined)
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setSaveWindowState(value: Boolean): Self = StObject.set(x, "saveWindowState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveWindowStateUndefined: Self = StObject.set(x, "saveWindowState", js.undefined)
      
      @scala.inline
      def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowBackgroundImages(value: Boolean): Self = StObject.set(x, "showBackgroundImages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowBackgroundImagesUndefined: Self = StObject.set(x, "showBackgroundImages", js.undefined)
      
      @scala.inline
      def setShowTaskbarIcon(value: Boolean): Self = StObject.set(x, "showTaskbarIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTaskbarIconUndefined: Self = StObject.set(x, "showTaskbarIcon", js.undefined)
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setSkipTaskbar(value: Boolean): Self = StObject.set(x, "skipTaskbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipTaskbarUndefined: Self = StObject.set(x, "skipTaskbar", js.undefined)
      
      @scala.inline
      def setSmallWindow(value: Boolean): Self = StObject.set(x, "smallWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmallWindowUndefined: Self = StObject.set(x, "smallWindow", js.undefined)
      
      @scala.inline
      def setState(value: maximized | minimized | normal): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTaskbarIcon(value: String): Self = StObject.set(x, "taskbarIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskbarIconGroup(value: String): Self = StObject.set(x, "taskbarIconGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskbarIconGroupUndefined: Self = StObject.set(x, "taskbarIconGroup", js.undefined)
      
      @scala.inline
      def setTaskbarIconUndefined: Self = StObject.set(x, "taskbarIcon", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setToShowOnRun(value: Boolean): Self = StObject.set(x, "toShowOnRun", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToShowOnRunUndefined: Self = StObject.set(x, "toShowOnRun", js.undefined)
      
      @scala.inline
      def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setWaitForPageLoad(value: Boolean): Self = StObject.set(x, "waitForPageLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForPageLoadUndefined: Self = StObject.set(x, "waitForPageLoad", js.undefined)
      
      @scala.inline
      def setWebPreferences(value: NodeIntegration): Self = StObject.set(x, "webPreferences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebPreferencesUndefined: Self = StObject.set(x, "webPreferences", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      @scala.inline
      def set_type(value: ERROR_BOX_TYPES): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    }
  }
}
