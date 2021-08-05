package typings.openfin

import typings.openfin.GoldenLayout.Config
import typings.openfin.anon.Bottom
import typings.openfin.anon.CrossOriginInjection
import typings.openfin.anon.NewVal
import typings.openfin.anon.NewValOldVal
import typings.openfin.anon.OldVal
import typings.openfin.anon.`0`
import typings.openfin.anon.`10`
import typings.openfin.anon.`11`
import typings.openfin.anon.`12`
import typings.openfin.anon.`1`
import typings.openfin.anon.`2`
import typings.openfin.anon.`3`
import typings.openfin.anon.`4`
import typings.openfin.anon.`5`
import typings.openfin.anon.`6`
import typings.openfin.anon.`7`
import typings.openfin.anon.`8`
import typings.openfin.anon.`9`
import typings.openfin.downloadPreloadMod.DownloadPreloadOption
import typings.openfin.shapesMod.ContextMenuSettings
import typings.openfin.shapesMod.Hotkey
import typings.openfin.shapesMod.RGB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowOptionMod {
  
  trait Accelerator extends StObject {
    
    var devtools: js.UndefOr[Boolean] = js.undefined
    
    var reload: js.UndefOr[Boolean] = js.undefined
    
    var reloadIgnoringCache: js.UndefOr[Boolean] = js.undefined
    
    var zoom: js.UndefOr[Boolean] = js.undefined
  }
  object Accelerator {
    
    inline def apply(): Accelerator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Accelerator]
    }
    
    extension [Self <: Accelerator](x: Self) {
      
      inline def setDevtools(value: Boolean): Self = StObject.set(x, "devtools", value.asInstanceOf[js.Any])
      
      inline def setDevtoolsUndefined: Self = StObject.set(x, "devtools", js.undefined)
      
      inline def setReload(value: Boolean): Self = StObject.set(x, "reload", value.asInstanceOf[js.Any])
      
      inline def setReloadIgnoringCache(value: Boolean): Self = StObject.set(x, "reloadIgnoringCache", value.asInstanceOf[js.Any])
      
      inline def setReloadIgnoringCacheUndefined: Self = StObject.set(x, "reloadIgnoringCache", js.undefined)
      
      inline def setReloadUndefined: Self = StObject.set(x, "reload", js.undefined)
      
      inline def setZoom(value: Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  trait Api extends StObject {
    
    var iframe: js.UndefOr[CrossOriginInjection] = js.undefined
  }
  object Api {
    
    inline def apply(): Api = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Api]
    }
    
    extension [Self <: Api](x: Self) {
      
      inline def setIframe(value: CrossOriginInjection): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
      
      inline def setIframeUndefined: Self = StObject.set(x, "iframe", js.undefined)
    }
  }
  
  trait ContentNavigation extends StObject {
    
    var blacklist: js.UndefOr[js.Array[String]] = js.undefined
    
    var whitelist: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ContentNavigation {
    
    inline def apply(): ContentNavigation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentNavigation]
    }
    
    extension [Self <: ContentNavigation](x: Self) {
      
      inline def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      inline def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
      
      inline def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      inline def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
    }
  }
  
  trait ContentRedirect extends StObject {
    
    var blacklist: js.UndefOr[js.Array[String]] = js.undefined
    
    var whitelist: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ContentRedirect {
    
    inline def apply(): ContentRedirect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentRedirect]
    }
    
    extension [Self <: ContentRedirect](x: Self) {
      
      inline def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      inline def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
      
      inline def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      inline def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
    }
  }
  
  trait CornerRounding extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object CornerRounding {
    
    inline def apply(): CornerRounding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CornerRounding]
    }
    
    extension [Self <: CornerRounding](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait CustomRequestHeaders extends StObject {
    
    var headers: js.Array[js.Any]
    
    var urlPatterns: js.Array[String]
  }
  object CustomRequestHeaders {
    
    inline def apply(headers: js.Array[js.Any], urlPatterns: js.Array[String]): CustomRequestHeaders = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], urlPatterns = urlPatterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomRequestHeaders]
    }
    
    extension [Self <: CustomRequestHeaders](x: Self) {
      
      inline def setHeaders(value: js.Array[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: js.Any*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      inline def setUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "urlPatterns", value.asInstanceOf[js.Any])
      
      inline def setUrlPatternsVarargs(value: String*): Self = StObject.set(x, "urlPatterns", js.Array(value :_*))
    }
  }
  
  trait ResizeRegion extends StObject {
    
    var bottomRightCorner: js.UndefOr[Double] = js.undefined
    
    var sides: js.UndefOr[Bottom] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object ResizeRegion {
    
    inline def apply(): ResizeRegion = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeRegion]
    }
    
    extension [Self <: ResizeRegion](x: Self) {
      
      inline def setBottomRightCorner(value: Double): Self = StObject.set(x, "bottomRightCorner", value.asInstanceOf[js.Any])
      
      inline def setBottomRightCornerUndefined: Self = StObject.set(x, "bottomRightCorner", js.undefined)
      
      inline def setSides(value: Bottom): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
      
      inline def setSidesUndefined: Self = StObject.set(x, "sides", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait WindowOption extends StObject {
    
    var accelerator: js.UndefOr[Accelerator] = js.undefined
    
    var alphaMask: js.UndefOr[RGB] = js.undefined
    
    var alwaysOnTop: js.UndefOr[Boolean] = js.undefined
    
    var api: js.UndefOr[Api] = js.undefined
    
    var applicationIcon: js.UndefOr[String] = js.undefined
    
    var aspectRatio: js.UndefOr[Double] = js.undefined
    
    var autoShow: js.UndefOr[Boolean] = js.undefined
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var contentNavigation: js.UndefOr[ContentNavigation] = js.undefined
    
    var contentRedirect: js.UndefOr[ContentRedirect] = js.undefined
    
    var contextMenu: js.UndefOr[Boolean] = js.undefined
    
    var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.undefined
    
    var cornerRounding: js.UndefOr[CornerRounding] = js.undefined
    
    var customContext: js.UndefOr[js.Any] = js.undefined
    
    var customData: js.UndefOr[js.Any] = js.undefined
    
    var customRequestHeaders: js.UndefOr[js.Array[CustomRequestHeaders]] = js.undefined
    
    var defaultCentered: js.UndefOr[Boolean] = js.undefined
    
    var defaultHeight: js.UndefOr[Double] = js.undefined
    
    var defaultLeft: js.UndefOr[Double] = js.undefined
    
    var defaultTop: js.UndefOr[Double] = js.undefined
    
    var defaultWidth: js.UndefOr[Double] = js.undefined
    
    var frame: js.UndefOr[Boolean] = js.undefined
    
    var hideOnClose: js.UndefOr[Boolean] = js.undefined
    
    var hotkeys: js.UndefOr[js.Array[Hotkey]] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var layout: js.UndefOr[Config] = js.undefined
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var maximizable: js.UndefOr[Boolean] = js.undefined
    
    var minHeight: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var minimizable: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var preloadScripts: js.UndefOr[js.Array[DownloadPreloadOption]] = js.undefined
    
    var resizable: js.UndefOr[Boolean] = js.undefined
    
    var resizeRegion: js.UndefOr[ResizeRegion] = js.undefined
    
    var saveWindowState: js.UndefOr[Boolean] = js.undefined
    
    var shadow: js.UndefOr[Boolean] = js.undefined
    
    var showBackgroundImages: js.UndefOr[Boolean] = js.undefined
    
    var showTaskbarIcon: js.UndefOr[Boolean] = js.undefined
    
    var smallWindow: js.UndefOr[Boolean] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
    
    var taskbarIconGroup: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var uuid: js.UndefOr[String] = js.undefined
    
    var waitForPageLoad: js.UndefOr[Boolean] = js.undefined
  }
  object WindowOption {
    
    inline def apply(): WindowOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WindowOption]
    }
    
    extension [Self <: WindowOption](x: Self) {
      
      inline def setAccelerator(value: Accelerator): Self = StObject.set(x, "accelerator", value.asInstanceOf[js.Any])
      
      inline def setAcceleratorUndefined: Self = StObject.set(x, "accelerator", js.undefined)
      
      inline def setAlphaMask(value: RGB): Self = StObject.set(x, "alphaMask", value.asInstanceOf[js.Any])
      
      inline def setAlphaMaskUndefined: Self = StObject.set(x, "alphaMask", js.undefined)
      
      inline def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
      
      inline def setAlwaysOnTopUndefined: Self = StObject.set(x, "alwaysOnTop", js.undefined)
      
      inline def setApi(value: Api): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      inline def setApplicationIcon(value: String): Self = StObject.set(x, "applicationIcon", value.asInstanceOf[js.Any])
      
      inline def setApplicationIconUndefined: Self = StObject.set(x, "applicationIcon", js.undefined)
      
      inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      inline def setAutoShow(value: Boolean): Self = StObject.set(x, "autoShow", value.asInstanceOf[js.Any])
      
      inline def setAutoShowUndefined: Self = StObject.set(x, "autoShow", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setContentNavigation(value: ContentNavigation): Self = StObject.set(x, "contentNavigation", value.asInstanceOf[js.Any])
      
      inline def setContentNavigationUndefined: Self = StObject.set(x, "contentNavigation", js.undefined)
      
      inline def setContentRedirect(value: ContentRedirect): Self = StObject.set(x, "contentRedirect", value.asInstanceOf[js.Any])
      
      inline def setContentRedirectUndefined: Self = StObject.set(x, "contentRedirect", js.undefined)
      
      inline def setContextMenu(value: Boolean): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuSettings(value: ContextMenuSettings): Self = StObject.set(x, "contextMenuSettings", value.asInstanceOf[js.Any])
      
      inline def setContextMenuSettingsUndefined: Self = StObject.set(x, "contextMenuSettings", js.undefined)
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setCornerRounding(value: CornerRounding): Self = StObject.set(x, "cornerRounding", value.asInstanceOf[js.Any])
      
      inline def setCornerRoundingUndefined: Self = StObject.set(x, "cornerRounding", js.undefined)
      
      inline def setCustomContext(value: js.Any): Self = StObject.set(x, "customContext", value.asInstanceOf[js.Any])
      
      inline def setCustomContextUndefined: Self = StObject.set(x, "customContext", js.undefined)
      
      inline def setCustomData(value: js.Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      inline def setCustomRequestHeaders(value: js.Array[CustomRequestHeaders]): Self = StObject.set(x, "customRequestHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomRequestHeadersUndefined: Self = StObject.set(x, "customRequestHeaders", js.undefined)
      
      inline def setCustomRequestHeadersVarargs(value: CustomRequestHeaders*): Self = StObject.set(x, "customRequestHeaders", js.Array(value :_*))
      
      inline def setDefaultCentered(value: Boolean): Self = StObject.set(x, "defaultCentered", value.asInstanceOf[js.Any])
      
      inline def setDefaultCenteredUndefined: Self = StObject.set(x, "defaultCentered", js.undefined)
      
      inline def setDefaultHeight(value: Double): Self = StObject.set(x, "defaultHeight", value.asInstanceOf[js.Any])
      
      inline def setDefaultHeightUndefined: Self = StObject.set(x, "defaultHeight", js.undefined)
      
      inline def setDefaultLeft(value: Double): Self = StObject.set(x, "defaultLeft", value.asInstanceOf[js.Any])
      
      inline def setDefaultLeftUndefined: Self = StObject.set(x, "defaultLeft", js.undefined)
      
      inline def setDefaultTop(value: Double): Self = StObject.set(x, "defaultTop", value.asInstanceOf[js.Any])
      
      inline def setDefaultTopUndefined: Self = StObject.set(x, "defaultTop", js.undefined)
      
      inline def setDefaultWidth(value: Double): Self = StObject.set(x, "defaultWidth", value.asInstanceOf[js.Any])
      
      inline def setDefaultWidthUndefined: Self = StObject.set(x, "defaultWidth", js.undefined)
      
      inline def setFrame(value: Boolean): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      inline def setHideOnClose(value: Boolean): Self = StObject.set(x, "hideOnClose", value.asInstanceOf[js.Any])
      
      inline def setHideOnCloseUndefined: Self = StObject.set(x, "hideOnClose", js.undefined)
      
      inline def setHotkeys(value: js.Array[Hotkey]): Self = StObject.set(x, "hotkeys", value.asInstanceOf[js.Any])
      
      inline def setHotkeysUndefined: Self = StObject.set(x, "hotkeys", js.undefined)
      
      inline def setHotkeysVarargs(value: Hotkey*): Self = StObject.set(x, "hotkeys", js.Array(value :_*))
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLayout(value: Config): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMaximizable(value: Boolean): Self = StObject.set(x, "maximizable", value.asInstanceOf[js.Any])
      
      inline def setMaximizableUndefined: Self = StObject.set(x, "maximizable", js.undefined)
      
      inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setMinimizable(value: Boolean): Self = StObject.set(x, "minimizable", value.asInstanceOf[js.Any])
      
      inline def setMinimizableUndefined: Self = StObject.set(x, "minimizable", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPreloadScripts(value: js.Array[DownloadPreloadOption]): Self = StObject.set(x, "preloadScripts", value.asInstanceOf[js.Any])
      
      inline def setPreloadScriptsUndefined: Self = StObject.set(x, "preloadScripts", js.undefined)
      
      inline def setPreloadScriptsVarargs(value: DownloadPreloadOption*): Self = StObject.set(x, "preloadScripts", js.Array(value :_*))
      
      inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      inline def setResizeRegion(value: ResizeRegion): Self = StObject.set(x, "resizeRegion", value.asInstanceOf[js.Any])
      
      inline def setResizeRegionUndefined: Self = StObject.set(x, "resizeRegion", js.undefined)
      
      inline def setSaveWindowState(value: Boolean): Self = StObject.set(x, "saveWindowState", value.asInstanceOf[js.Any])
      
      inline def setSaveWindowStateUndefined: Self = StObject.set(x, "saveWindowState", js.undefined)
      
      inline def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
      
      inline def setShowBackgroundImages(value: Boolean): Self = StObject.set(x, "showBackgroundImages", value.asInstanceOf[js.Any])
      
      inline def setShowBackgroundImagesUndefined: Self = StObject.set(x, "showBackgroundImages", js.undefined)
      
      inline def setShowTaskbarIcon(value: Boolean): Self = StObject.set(x, "showTaskbarIcon", value.asInstanceOf[js.Any])
      
      inline def setShowTaskbarIconUndefined: Self = StObject.set(x, "showTaskbarIcon", js.undefined)
      
      inline def setSmallWindow(value: Boolean): Self = StObject.set(x, "smallWindow", value.asInstanceOf[js.Any])
      
      inline def setSmallWindowUndefined: Self = StObject.set(x, "smallWindow", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTaskbarIconGroup(value: String): Self = StObject.set(x, "taskbarIconGroup", value.asInstanceOf[js.Any])
      
      inline def setTaskbarIconGroupUndefined: Self = StObject.set(x, "taskbarIconGroup", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
      
      inline def setWaitForPageLoad(value: Boolean): Self = StObject.set(x, "waitForPageLoad", value.asInstanceOf[js.Any])
      
      inline def setWaitForPageLoadUndefined: Self = StObject.set(x, "waitForPageLoad", js.undefined)
    }
  }
  
  /* Inlined {[ key in keyof openfin.openfin/_v2/api/window/windowOption.WindowOption ]: {  oldVal :openfin.openfin/_v2/api/window/windowOption.WindowOption[key],   newVal :openfin.openfin/_v2/api/window/windowOption.WindowOption[key]}} */
  trait WindowOptionDiff extends StObject {
    
    var accelerator: js.UndefOr[`12`] = js.undefined
    
    var alphaMask: js.UndefOr[`5`] = js.undefined
    
    var alwaysOnTop: js.UndefOr[NewValOldVal] = js.undefined
    
    var api: js.UndefOr[`7`] = js.undefined
    
    var applicationIcon: js.UndefOr[`2`] = js.undefined
    
    var aspectRatio: js.UndefOr[NewVal] = js.undefined
    
    var autoShow: js.UndefOr[NewValOldVal] = js.undefined
    
    var backgroundColor: js.UndefOr[`2`] = js.undefined
    
    var contentNavigation: js.UndefOr[`8`] = js.undefined
    
    var contentRedirect: js.UndefOr[`4`] = js.undefined
    
    var contextMenu: js.UndefOr[NewValOldVal] = js.undefined
    
    var contextMenuSettings: js.UndefOr[`9`] = js.undefined
    
    var cornerRounding: js.UndefOr[`0`] = js.undefined
    
    var customContext: js.UndefOr[`1`] = js.undefined
    
    var customData: js.UndefOr[`1`] = js.undefined
    
    var customRequestHeaders: js.UndefOr[`6`] = js.undefined
    
    var defaultCentered: js.UndefOr[NewValOldVal] = js.undefined
    
    var defaultHeight: js.UndefOr[NewVal] = js.undefined
    
    var defaultLeft: js.UndefOr[NewVal] = js.undefined
    
    var defaultTop: js.UndefOr[NewVal] = js.undefined
    
    var defaultWidth: js.UndefOr[NewVal] = js.undefined
    
    var frame: js.UndefOr[NewValOldVal] = js.undefined
    
    var hideOnClose: js.UndefOr[NewValOldVal] = js.undefined
    
    var hotkeys: js.UndefOr[OldVal] = js.undefined
    
    var icon: js.UndefOr[`2`] = js.undefined
    
    var layout: js.UndefOr[`3`] = js.undefined
    
    var maxHeight: js.UndefOr[NewVal] = js.undefined
    
    var maxWidth: js.UndefOr[NewVal] = js.undefined
    
    var maximizable: js.UndefOr[NewValOldVal] = js.undefined
    
    var minHeight: js.UndefOr[NewVal] = js.undefined
    
    var minWidth: js.UndefOr[NewVal] = js.undefined
    
    var minimizable: js.UndefOr[NewValOldVal] = js.undefined
    
    var name: js.UndefOr[`2`] = js.undefined
    
    var opacity: js.UndefOr[NewVal] = js.undefined
    
    var preloadScripts: js.UndefOr[`10`] = js.undefined
    
    var resizable: js.UndefOr[NewValOldVal] = js.undefined
    
    var resizeRegion: js.UndefOr[`11`] = js.undefined
    
    var saveWindowState: js.UndefOr[NewValOldVal] = js.undefined
    
    var shadow: js.UndefOr[NewValOldVal] = js.undefined
    
    var showBackgroundImages: js.UndefOr[NewValOldVal] = js.undefined
    
    var showTaskbarIcon: js.UndefOr[NewValOldVal] = js.undefined
    
    var smallWindow: js.UndefOr[NewValOldVal] = js.undefined
    
    var state: js.UndefOr[`2`] = js.undefined
    
    var taskbarIconGroup: js.UndefOr[`2`] = js.undefined
    
    var url: js.UndefOr[`2`] = js.undefined
    
    var uuid: js.UndefOr[`2`] = js.undefined
    
    var waitForPageLoad: js.UndefOr[NewValOldVal] = js.undefined
  }
  object WindowOptionDiff {
    
    inline def apply(): WindowOptionDiff = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WindowOptionDiff]
    }
    
    extension [Self <: WindowOptionDiff](x: Self) {
      
      inline def setAccelerator(value: `12`): Self = StObject.set(x, "accelerator", value.asInstanceOf[js.Any])
      
      inline def setAcceleratorUndefined: Self = StObject.set(x, "accelerator", js.undefined)
      
      inline def setAlphaMask(value: `5`): Self = StObject.set(x, "alphaMask", value.asInstanceOf[js.Any])
      
      inline def setAlphaMaskUndefined: Self = StObject.set(x, "alphaMask", js.undefined)
      
      inline def setAlwaysOnTop(value: NewValOldVal): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
      
      inline def setAlwaysOnTopUndefined: Self = StObject.set(x, "alwaysOnTop", js.undefined)
      
      inline def setApi(value: `7`): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      inline def setApplicationIcon(value: `2`): Self = StObject.set(x, "applicationIcon", value.asInstanceOf[js.Any])
      
      inline def setApplicationIconUndefined: Self = StObject.set(x, "applicationIcon", js.undefined)
      
      inline def setAspectRatio(value: NewVal): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      inline def setAutoShow(value: NewValOldVal): Self = StObject.set(x, "autoShow", value.asInstanceOf[js.Any])
      
      inline def setAutoShowUndefined: Self = StObject.set(x, "autoShow", js.undefined)
      
      inline def setBackgroundColor(value: `2`): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setContentNavigation(value: `8`): Self = StObject.set(x, "contentNavigation", value.asInstanceOf[js.Any])
      
      inline def setContentNavigationUndefined: Self = StObject.set(x, "contentNavigation", js.undefined)
      
      inline def setContentRedirect(value: `4`): Self = StObject.set(x, "contentRedirect", value.asInstanceOf[js.Any])
      
      inline def setContentRedirectUndefined: Self = StObject.set(x, "contentRedirect", js.undefined)
      
      inline def setContextMenu(value: NewValOldVal): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuSettings(value: `9`): Self = StObject.set(x, "contextMenuSettings", value.asInstanceOf[js.Any])
      
      inline def setContextMenuSettingsUndefined: Self = StObject.set(x, "contextMenuSettings", js.undefined)
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setCornerRounding(value: `0`): Self = StObject.set(x, "cornerRounding", value.asInstanceOf[js.Any])
      
      inline def setCornerRoundingUndefined: Self = StObject.set(x, "cornerRounding", js.undefined)
      
      inline def setCustomContext(value: `1`): Self = StObject.set(x, "customContext", value.asInstanceOf[js.Any])
      
      inline def setCustomContextUndefined: Self = StObject.set(x, "customContext", js.undefined)
      
      inline def setCustomData(value: `1`): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      inline def setCustomRequestHeaders(value: `6`): Self = StObject.set(x, "customRequestHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomRequestHeadersUndefined: Self = StObject.set(x, "customRequestHeaders", js.undefined)
      
      inline def setDefaultCentered(value: NewValOldVal): Self = StObject.set(x, "defaultCentered", value.asInstanceOf[js.Any])
      
      inline def setDefaultCenteredUndefined: Self = StObject.set(x, "defaultCentered", js.undefined)
      
      inline def setDefaultHeight(value: NewVal): Self = StObject.set(x, "defaultHeight", value.asInstanceOf[js.Any])
      
      inline def setDefaultHeightUndefined: Self = StObject.set(x, "defaultHeight", js.undefined)
      
      inline def setDefaultLeft(value: NewVal): Self = StObject.set(x, "defaultLeft", value.asInstanceOf[js.Any])
      
      inline def setDefaultLeftUndefined: Self = StObject.set(x, "defaultLeft", js.undefined)
      
      inline def setDefaultTop(value: NewVal): Self = StObject.set(x, "defaultTop", value.asInstanceOf[js.Any])
      
      inline def setDefaultTopUndefined: Self = StObject.set(x, "defaultTop", js.undefined)
      
      inline def setDefaultWidth(value: NewVal): Self = StObject.set(x, "defaultWidth", value.asInstanceOf[js.Any])
      
      inline def setDefaultWidthUndefined: Self = StObject.set(x, "defaultWidth", js.undefined)
      
      inline def setFrame(value: NewValOldVal): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      inline def setHideOnClose(value: NewValOldVal): Self = StObject.set(x, "hideOnClose", value.asInstanceOf[js.Any])
      
      inline def setHideOnCloseUndefined: Self = StObject.set(x, "hideOnClose", js.undefined)
      
      inline def setHotkeys(value: OldVal): Self = StObject.set(x, "hotkeys", value.asInstanceOf[js.Any])
      
      inline def setHotkeysUndefined: Self = StObject.set(x, "hotkeys", js.undefined)
      
      inline def setIcon(value: `2`): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLayout(value: `3`): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setMaxHeight(value: NewVal): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: NewVal): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMaximizable(value: NewValOldVal): Self = StObject.set(x, "maximizable", value.asInstanceOf[js.Any])
      
      inline def setMaximizableUndefined: Self = StObject.set(x, "maximizable", js.undefined)
      
      inline def setMinHeight(value: NewVal): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: NewVal): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setMinimizable(value: NewValOldVal): Self = StObject.set(x, "minimizable", value.asInstanceOf[js.Any])
      
      inline def setMinimizableUndefined: Self = StObject.set(x, "minimizable", js.undefined)
      
      inline def setName(value: `2`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOpacity(value: NewVal): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPreloadScripts(value: `10`): Self = StObject.set(x, "preloadScripts", value.asInstanceOf[js.Any])
      
      inline def setPreloadScriptsUndefined: Self = StObject.set(x, "preloadScripts", js.undefined)
      
      inline def setResizable(value: NewValOldVal): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      inline def setResizeRegion(value: `11`): Self = StObject.set(x, "resizeRegion", value.asInstanceOf[js.Any])
      
      inline def setResizeRegionUndefined: Self = StObject.set(x, "resizeRegion", js.undefined)
      
      inline def setSaveWindowState(value: NewValOldVal): Self = StObject.set(x, "saveWindowState", value.asInstanceOf[js.Any])
      
      inline def setSaveWindowStateUndefined: Self = StObject.set(x, "saveWindowState", js.undefined)
      
      inline def setShadow(value: NewValOldVal): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
      
      inline def setShowBackgroundImages(value: NewValOldVal): Self = StObject.set(x, "showBackgroundImages", value.asInstanceOf[js.Any])
      
      inline def setShowBackgroundImagesUndefined: Self = StObject.set(x, "showBackgroundImages", js.undefined)
      
      inline def setShowTaskbarIcon(value: NewValOldVal): Self = StObject.set(x, "showTaskbarIcon", value.asInstanceOf[js.Any])
      
      inline def setShowTaskbarIconUndefined: Self = StObject.set(x, "showTaskbarIcon", js.undefined)
      
      inline def setSmallWindow(value: NewValOldVal): Self = StObject.set(x, "smallWindow", value.asInstanceOf[js.Any])
      
      inline def setSmallWindowUndefined: Self = StObject.set(x, "smallWindow", js.undefined)
      
      inline def setState(value: `2`): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTaskbarIconGroup(value: `2`): Self = StObject.set(x, "taskbarIconGroup", value.asInstanceOf[js.Any])
      
      inline def setTaskbarIconGroupUndefined: Self = StObject.set(x, "taskbarIconGroup", js.undefined)
      
      inline def setUrl(value: `2`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUuid(value: `2`): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
      
      inline def setWaitForPageLoad(value: NewValOldVal): Self = StObject.set(x, "waitForPageLoad", value.asInstanceOf[js.Any])
      
      inline def setWaitForPageLoadUndefined: Self = StObject.set(x, "waitForPageLoad", js.undefined)
    }
  }
}
