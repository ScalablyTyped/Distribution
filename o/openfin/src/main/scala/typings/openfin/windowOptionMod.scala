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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowOptionMod {
  
  @js.native
  trait Accelerator extends StObject {
    
    var devtools: js.UndefOr[Boolean] = js.native
    
    var reload: js.UndefOr[Boolean] = js.native
    
    var reloadIgnoringCache: js.UndefOr[Boolean] = js.native
    
    var zoom: js.UndefOr[Boolean] = js.native
  }
  object Accelerator {
    
    @scala.inline
    def apply(): Accelerator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Accelerator]
    }
    
    @scala.inline
    implicit class AcceleratorMutableBuilder[Self <: Accelerator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevtools(value: Boolean): Self = StObject.set(x, "devtools", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevtoolsUndefined: Self = StObject.set(x, "devtools", js.undefined)
      
      @scala.inline
      def setReload(value: Boolean): Self = StObject.set(x, "reload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReloadIgnoringCache(value: Boolean): Self = StObject.set(x, "reloadIgnoringCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReloadIgnoringCacheUndefined: Self = StObject.set(x, "reloadIgnoringCache", js.undefined)
      
      @scala.inline
      def setReloadUndefined: Self = StObject.set(x, "reload", js.undefined)
      
      @scala.inline
      def setZoom(value: Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  @js.native
  trait Api extends StObject {
    
    var iframe: js.UndefOr[CrossOriginInjection] = js.native
  }
  object Api {
    
    @scala.inline
    def apply(): Api = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Api]
    }
    
    @scala.inline
    implicit class ApiMutableBuilder[Self <: Api] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIframe(value: CrossOriginInjection): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIframeUndefined: Self = StObject.set(x, "iframe", js.undefined)
    }
  }
  
  @js.native
  trait ContentNavigation extends StObject {
    
    var blacklist: js.UndefOr[js.Array[String]] = js.native
    
    var whitelist: js.UndefOr[js.Array[String]] = js.native
  }
  object ContentNavigation {
    
    @scala.inline
    def apply(): ContentNavigation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentNavigation]
    }
    
    @scala.inline
    implicit class ContentNavigationMutableBuilder[Self <: ContentNavigation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      @scala.inline
      def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
      
      @scala.inline
      def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      @scala.inline
      def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ContentRedirect extends StObject {
    
    var blacklist: js.UndefOr[js.Array[String]] = js.native
    
    var whitelist: js.UndefOr[js.Array[String]] = js.native
  }
  object ContentRedirect {
    
    @scala.inline
    def apply(): ContentRedirect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentRedirect]
    }
    
    @scala.inline
    implicit class ContentRedirectMutableBuilder[Self <: ContentRedirect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      @scala.inline
      def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
      
      @scala.inline
      def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      @scala.inline
      def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CornerRounding extends StObject {
    
    var height: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object CornerRounding {
    
    @scala.inline
    def apply(): CornerRounding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CornerRounding]
    }
    
    @scala.inline
    implicit class CornerRoundingMutableBuilder[Self <: CornerRounding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait CustomRequestHeaders extends StObject {
    
    var headers: js.Array[_] = js.native
    
    var urlPatterns: js.Array[String] = js.native
  }
  object CustomRequestHeaders {
    
    @scala.inline
    def apply(headers: js.Array[_], urlPatterns: js.Array[String]): CustomRequestHeaders = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], urlPatterns = urlPatterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomRequestHeaders]
    }
    
    @scala.inline
    implicit class CustomRequestHeadersMutableBuilder[Self <: CustomRequestHeaders] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: js.Array[_]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersVarargs(value: js.Any*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setUrlPatterns(value: js.Array[String]): Self = StObject.set(x, "urlPatterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlPatternsVarargs(value: String*): Self = StObject.set(x, "urlPatterns", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ResizeRegion extends StObject {
    
    var bottomRightCorner: js.UndefOr[Double] = js.native
    
    var sides: js.UndefOr[Bottom] = js.native
    
    var size: js.UndefOr[Double] = js.native
  }
  object ResizeRegion {
    
    @scala.inline
    def apply(): ResizeRegion = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeRegion]
    }
    
    @scala.inline
    implicit class ResizeRegionMutableBuilder[Self <: ResizeRegion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottomRightCorner(value: Double): Self = StObject.set(x, "bottomRightCorner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomRightCornerUndefined: Self = StObject.set(x, "bottomRightCorner", js.undefined)
      
      @scala.inline
      def setSides(value: Bottom): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSidesUndefined: Self = StObject.set(x, "sides", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait WindowOption extends StObject {
    
    var accelerator: js.UndefOr[Accelerator] = js.native
    
    var alphaMask: js.UndefOr[RGB] = js.native
    
    var alwaysOnTop: js.UndefOr[Boolean] = js.native
    
    var api: js.UndefOr[Api] = js.native
    
    var applicationIcon: js.UndefOr[String] = js.native
    
    var aspectRatio: js.UndefOr[Double] = js.native
    
    var autoShow: js.UndefOr[Boolean] = js.native
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var contentNavigation: js.UndefOr[ContentNavigation] = js.native
    
    var contentRedirect: js.UndefOr[ContentRedirect] = js.native
    
    var contextMenu: js.UndefOr[Boolean] = js.native
    
    var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.native
    
    var cornerRounding: js.UndefOr[CornerRounding] = js.native
    
    var customContext: js.UndefOr[js.Any] = js.native
    
    var customData: js.UndefOr[js.Any] = js.native
    
    var customRequestHeaders: js.UndefOr[js.Array[CustomRequestHeaders]] = js.native
    
    var defaultCentered: js.UndefOr[Boolean] = js.native
    
    var defaultHeight: js.UndefOr[Double] = js.native
    
    var defaultLeft: js.UndefOr[Double] = js.native
    
    var defaultTop: js.UndefOr[Double] = js.native
    
    var defaultWidth: js.UndefOr[Double] = js.native
    
    var frame: js.UndefOr[Boolean] = js.native
    
    var hideOnClose: js.UndefOr[Boolean] = js.native
    
    var hotkeys: js.UndefOr[js.Array[Hotkey]] = js.native
    
    var icon: js.UndefOr[String] = js.native
    
    var layout: js.UndefOr[Config] = js.native
    
    var maxHeight: js.UndefOr[Double] = js.native
    
    var maxWidth: js.UndefOr[Double] = js.native
    
    var maximizable: js.UndefOr[Boolean] = js.native
    
    var minHeight: js.UndefOr[Double] = js.native
    
    var minWidth: js.UndefOr[Double] = js.native
    
    var minimizable: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var preloadScripts: js.UndefOr[js.Array[DownloadPreloadOption]] = js.native
    
    var resizable: js.UndefOr[Boolean] = js.native
    
    var resizeRegion: js.UndefOr[ResizeRegion] = js.native
    
    var saveWindowState: js.UndefOr[Boolean] = js.native
    
    var shadow: js.UndefOr[Boolean] = js.native
    
    var showBackgroundImages: js.UndefOr[Boolean] = js.native
    
    var showTaskbarIcon: js.UndefOr[Boolean] = js.native
    
    var smallWindow: js.UndefOr[Boolean] = js.native
    
    var state: js.UndefOr[String] = js.native
    
    var taskbarIconGroup: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var uuid: js.UndefOr[String] = js.native
    
    var waitForPageLoad: js.UndefOr[Boolean] = js.native
  }
  object WindowOption {
    
    @scala.inline
    def apply(): WindowOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WindowOption]
    }
    
    @scala.inline
    implicit class WindowOptionMutableBuilder[Self <: WindowOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccelerator(value: Accelerator): Self = StObject.set(x, "accelerator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceleratorUndefined: Self = StObject.set(x, "accelerator", js.undefined)
      
      @scala.inline
      def setAlphaMask(value: RGB): Self = StObject.set(x, "alphaMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaMaskUndefined: Self = StObject.set(x, "alphaMask", js.undefined)
      
      @scala.inline
      def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysOnTopUndefined: Self = StObject.set(x, "alwaysOnTop", js.undefined)
      
      @scala.inline
      def setApi(value: Api): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
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
      def setContentNavigation(value: ContentNavigation): Self = StObject.set(x, "contentNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentNavigationUndefined: Self = StObject.set(x, "contentNavigation", js.undefined)
      
      @scala.inline
      def setContentRedirect(value: ContentRedirect): Self = StObject.set(x, "contentRedirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentRedirectUndefined: Self = StObject.set(x, "contentRedirect", js.undefined)
      
      @scala.inline
      def setContextMenu(value: Boolean): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuSettings(value: ContextMenuSettings): Self = StObject.set(x, "contextMenuSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuSettingsUndefined: Self = StObject.set(x, "contextMenuSettings", js.undefined)
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setCornerRounding(value: CornerRounding): Self = StObject.set(x, "cornerRounding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRoundingUndefined: Self = StObject.set(x, "cornerRounding", js.undefined)
      
      @scala.inline
      def setCustomContext(value: js.Any): Self = StObject.set(x, "customContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomContextUndefined: Self = StObject.set(x, "customContext", js.undefined)
      
      @scala.inline
      def setCustomData(value: js.Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      @scala.inline
      def setCustomRequestHeaders(value: js.Array[CustomRequestHeaders]): Self = StObject.set(x, "customRequestHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomRequestHeadersUndefined: Self = StObject.set(x, "customRequestHeaders", js.undefined)
      
      @scala.inline
      def setCustomRequestHeadersVarargs(value: CustomRequestHeaders*): Self = StObject.set(x, "customRequestHeaders", js.Array(value :_*))
      
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
      def setFrame(value: Boolean): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      @scala.inline
      def setHideOnClose(value: Boolean): Self = StObject.set(x, "hideOnClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnCloseUndefined: Self = StObject.set(x, "hideOnClose", js.undefined)
      
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
      def setLayout(value: Config): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
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
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPreloadScripts(value: js.Array[DownloadPreloadOption]): Self = StObject.set(x, "preloadScripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadScriptsUndefined: Self = StObject.set(x, "preloadScripts", js.undefined)
      
      @scala.inline
      def setPreloadScriptsVarargs(value: DownloadPreloadOption*): Self = StObject.set(x, "preloadScripts", js.Array(value :_*))
      
      @scala.inline
      def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      @scala.inline
      def setResizeRegion(value: ResizeRegion): Self = StObject.set(x, "resizeRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeRegionUndefined: Self = StObject.set(x, "resizeRegion", js.undefined)
      
      @scala.inline
      def setSaveWindowState(value: Boolean): Self = StObject.set(x, "saveWindowState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveWindowStateUndefined: Self = StObject.set(x, "saveWindowState", js.undefined)
      
      @scala.inline
      def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
      
      @scala.inline
      def setShowBackgroundImages(value: Boolean): Self = StObject.set(x, "showBackgroundImages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowBackgroundImagesUndefined: Self = StObject.set(x, "showBackgroundImages", js.undefined)
      
      @scala.inline
      def setShowTaskbarIcon(value: Boolean): Self = StObject.set(x, "showTaskbarIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTaskbarIconUndefined: Self = StObject.set(x, "showTaskbarIcon", js.undefined)
      
      @scala.inline
      def setSmallWindow(value: Boolean): Self = StObject.set(x, "smallWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmallWindowUndefined: Self = StObject.set(x, "smallWindow", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTaskbarIconGroup(value: String): Self = StObject.set(x, "taskbarIconGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskbarIconGroupUndefined: Self = StObject.set(x, "taskbarIconGroup", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
      
      @scala.inline
      def setWaitForPageLoad(value: Boolean): Self = StObject.set(x, "waitForPageLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForPageLoadUndefined: Self = StObject.set(x, "waitForPageLoad", js.undefined)
    }
  }
  
  /* Inlined {[ key in keyof openfin.openfin/_v2/api/window/windowOption.WindowOption ]: {  oldVal :openfin.openfin/_v2/api/window/windowOption.WindowOption[key],   newVal :openfin.openfin/_v2/api/window/windowOption.WindowOption[key]}} */
  @js.native
  trait WindowOptionDiff extends StObject {
    
    var accelerator: js.UndefOr[`12`] = js.native
    
    var alphaMask: js.UndefOr[`5`] = js.native
    
    var alwaysOnTop: js.UndefOr[NewValOldVal] = js.native
    
    var api: js.UndefOr[`7`] = js.native
    
    var applicationIcon: js.UndefOr[`2`] = js.native
    
    var aspectRatio: js.UndefOr[NewVal] = js.native
    
    var autoShow: js.UndefOr[NewValOldVal] = js.native
    
    var backgroundColor: js.UndefOr[`2`] = js.native
    
    var contentNavigation: js.UndefOr[`8`] = js.native
    
    var contentRedirect: js.UndefOr[`4`] = js.native
    
    var contextMenu: js.UndefOr[NewValOldVal] = js.native
    
    var contextMenuSettings: js.UndefOr[`9`] = js.native
    
    var cornerRounding: js.UndefOr[`0`] = js.native
    
    var customContext: js.UndefOr[`1`] = js.native
    
    var customData: js.UndefOr[`1`] = js.native
    
    var customRequestHeaders: js.UndefOr[`6`] = js.native
    
    var defaultCentered: js.UndefOr[NewValOldVal] = js.native
    
    var defaultHeight: js.UndefOr[NewVal] = js.native
    
    var defaultLeft: js.UndefOr[NewVal] = js.native
    
    var defaultTop: js.UndefOr[NewVal] = js.native
    
    var defaultWidth: js.UndefOr[NewVal] = js.native
    
    var frame: js.UndefOr[NewValOldVal] = js.native
    
    var hideOnClose: js.UndefOr[NewValOldVal] = js.native
    
    var hotkeys: js.UndefOr[OldVal] = js.native
    
    var icon: js.UndefOr[`2`] = js.native
    
    var layout: js.UndefOr[`3`] = js.native
    
    var maxHeight: js.UndefOr[NewVal] = js.native
    
    var maxWidth: js.UndefOr[NewVal] = js.native
    
    var maximizable: js.UndefOr[NewValOldVal] = js.native
    
    var minHeight: js.UndefOr[NewVal] = js.native
    
    var minWidth: js.UndefOr[NewVal] = js.native
    
    var minimizable: js.UndefOr[NewValOldVal] = js.native
    
    var name: js.UndefOr[`2`] = js.native
    
    var opacity: js.UndefOr[NewVal] = js.native
    
    var preloadScripts: js.UndefOr[`10`] = js.native
    
    var resizable: js.UndefOr[NewValOldVal] = js.native
    
    var resizeRegion: js.UndefOr[`11`] = js.native
    
    var saveWindowState: js.UndefOr[NewValOldVal] = js.native
    
    var shadow: js.UndefOr[NewValOldVal] = js.native
    
    var showBackgroundImages: js.UndefOr[NewValOldVal] = js.native
    
    var showTaskbarIcon: js.UndefOr[NewValOldVal] = js.native
    
    var smallWindow: js.UndefOr[NewValOldVal] = js.native
    
    var state: js.UndefOr[`2`] = js.native
    
    var taskbarIconGroup: js.UndefOr[`2`] = js.native
    
    var url: js.UndefOr[`2`] = js.native
    
    var uuid: js.UndefOr[`2`] = js.native
    
    var waitForPageLoad: js.UndefOr[NewValOldVal] = js.native
  }
  object WindowOptionDiff {
    
    @scala.inline
    def apply(): WindowOptionDiff = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WindowOptionDiff]
    }
    
    @scala.inline
    implicit class WindowOptionDiffMutableBuilder[Self <: WindowOptionDiff] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccelerator(value: `12`): Self = StObject.set(x, "accelerator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceleratorUndefined: Self = StObject.set(x, "accelerator", js.undefined)
      
      @scala.inline
      def setAlphaMask(value: `5`): Self = StObject.set(x, "alphaMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaMaskUndefined: Self = StObject.set(x, "alphaMask", js.undefined)
      
      @scala.inline
      def setAlwaysOnTop(value: NewValOldVal): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysOnTopUndefined: Self = StObject.set(x, "alwaysOnTop", js.undefined)
      
      @scala.inline
      def setApi(value: `7`): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      @scala.inline
      def setApplicationIcon(value: `2`): Self = StObject.set(x, "applicationIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationIconUndefined: Self = StObject.set(x, "applicationIcon", js.undefined)
      
      @scala.inline
      def setAspectRatio(value: NewVal): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      @scala.inline
      def setAutoShow(value: NewValOldVal): Self = StObject.set(x, "autoShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoShowUndefined: Self = StObject.set(x, "autoShow", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: `2`): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setContentNavigation(value: `8`): Self = StObject.set(x, "contentNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentNavigationUndefined: Self = StObject.set(x, "contentNavigation", js.undefined)
      
      @scala.inline
      def setContentRedirect(value: `4`): Self = StObject.set(x, "contentRedirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentRedirectUndefined: Self = StObject.set(x, "contentRedirect", js.undefined)
      
      @scala.inline
      def setContextMenu(value: NewValOldVal): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuSettings(value: `9`): Self = StObject.set(x, "contextMenuSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuSettingsUndefined: Self = StObject.set(x, "contextMenuSettings", js.undefined)
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setCornerRounding(value: `0`): Self = StObject.set(x, "cornerRounding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRoundingUndefined: Self = StObject.set(x, "cornerRounding", js.undefined)
      
      @scala.inline
      def setCustomContext(value: `1`): Self = StObject.set(x, "customContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomContextUndefined: Self = StObject.set(x, "customContext", js.undefined)
      
      @scala.inline
      def setCustomData(value: `1`): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      @scala.inline
      def setCustomRequestHeaders(value: `6`): Self = StObject.set(x, "customRequestHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomRequestHeadersUndefined: Self = StObject.set(x, "customRequestHeaders", js.undefined)
      
      @scala.inline
      def setDefaultCentered(value: NewValOldVal): Self = StObject.set(x, "defaultCentered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCenteredUndefined: Self = StObject.set(x, "defaultCentered", js.undefined)
      
      @scala.inline
      def setDefaultHeight(value: NewVal): Self = StObject.set(x, "defaultHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultHeightUndefined: Self = StObject.set(x, "defaultHeight", js.undefined)
      
      @scala.inline
      def setDefaultLeft(value: NewVal): Self = StObject.set(x, "defaultLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultLeftUndefined: Self = StObject.set(x, "defaultLeft", js.undefined)
      
      @scala.inline
      def setDefaultTop(value: NewVal): Self = StObject.set(x, "defaultTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultTopUndefined: Self = StObject.set(x, "defaultTop", js.undefined)
      
      @scala.inline
      def setDefaultWidth(value: NewVal): Self = StObject.set(x, "defaultWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultWidthUndefined: Self = StObject.set(x, "defaultWidth", js.undefined)
      
      @scala.inline
      def setFrame(value: NewValOldVal): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      @scala.inline
      def setHideOnClose(value: NewValOldVal): Self = StObject.set(x, "hideOnClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnCloseUndefined: Self = StObject.set(x, "hideOnClose", js.undefined)
      
      @scala.inline
      def setHotkeys(value: OldVal): Self = StObject.set(x, "hotkeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHotkeysUndefined: Self = StObject.set(x, "hotkeys", js.undefined)
      
      @scala.inline
      def setIcon(value: `2`): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setLayout(value: `3`): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: NewVal): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: NewVal): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMaximizable(value: NewValOldVal): Self = StObject.set(x, "maximizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximizableUndefined: Self = StObject.set(x, "maximizable", js.undefined)
      
      @scala.inline
      def setMinHeight(value: NewVal): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinWidth(value: NewVal): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setMinimizable(value: NewValOldVal): Self = StObject.set(x, "minimizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimizableUndefined: Self = StObject.set(x, "minimizable", js.undefined)
      
      @scala.inline
      def setName(value: `2`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOpacity(value: NewVal): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPreloadScripts(value: `10`): Self = StObject.set(x, "preloadScripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadScriptsUndefined: Self = StObject.set(x, "preloadScripts", js.undefined)
      
      @scala.inline
      def setResizable(value: NewValOldVal): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      @scala.inline
      def setResizeRegion(value: `11`): Self = StObject.set(x, "resizeRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeRegionUndefined: Self = StObject.set(x, "resizeRegion", js.undefined)
      
      @scala.inline
      def setSaveWindowState(value: NewValOldVal): Self = StObject.set(x, "saveWindowState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveWindowStateUndefined: Self = StObject.set(x, "saveWindowState", js.undefined)
      
      @scala.inline
      def setShadow(value: NewValOldVal): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
      
      @scala.inline
      def setShowBackgroundImages(value: NewValOldVal): Self = StObject.set(x, "showBackgroundImages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowBackgroundImagesUndefined: Self = StObject.set(x, "showBackgroundImages", js.undefined)
      
      @scala.inline
      def setShowTaskbarIcon(value: NewValOldVal): Self = StObject.set(x, "showTaskbarIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTaskbarIconUndefined: Self = StObject.set(x, "showTaskbarIcon", js.undefined)
      
      @scala.inline
      def setSmallWindow(value: NewValOldVal): Self = StObject.set(x, "smallWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmallWindowUndefined: Self = StObject.set(x, "smallWindow", js.undefined)
      
      @scala.inline
      def setState(value: `2`): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTaskbarIconGroup(value: `2`): Self = StObject.set(x, "taskbarIconGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskbarIconGroupUndefined: Self = StObject.set(x, "taskbarIconGroup", js.undefined)
      
      @scala.inline
      def setUrl(value: `2`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setUuid(value: `2`): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
      
      @scala.inline
      def setWaitForPageLoad(value: NewValOldVal): Self = StObject.set(x, "waitForPageLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForPageLoadUndefined: Self = StObject.set(x, "waitForPageLoad", js.undefined)
    }
  }
}
