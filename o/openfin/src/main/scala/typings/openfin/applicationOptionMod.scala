package typings.openfin

import typings.openfin.downloadPreloadMod.DownloadPreloadOption
import typings.openfin.shapesMod.ShortcutOverride
import typings.openfin.viewViewMod.ViewCreationOptions
import typings.openfin.windowOptionMod.Accelerator
import typings.openfin.windowOptionMod.Api
import typings.openfin.windowOptionMod.ContentNavigation
import typings.openfin.windowOptionMod.CornerRounding
import typings.openfin.windowOptionMod.CustomRequestHeaders
import typings.openfin.windowOptionMod.ResizeRegion
import typings.openfin.windowOptionMod.WindowOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applicationOptionMod {
  
  @js.native
  trait ApplicationOption extends LegacyWinOptionsInAppOptions {
    
    var commands: js.UndefOr[js.Array[ShortcutOverride]] = js.native
    
    var defaultViewOptions: js.UndefOr[ViewCreationOptions] = js.native
    
    var defaultWindowOptions: js.UndefOr[WindowOption] = js.native
    
    var disableIabSecureLogging: js.UndefOr[Boolean] = js.native
    
    var fdc3Api: js.UndefOr[Boolean] = js.native
    
    var isPlatformController: js.UndefOr[Boolean] = js.native
    
    var loadErrorMessage: js.UndefOr[String] = js.native
    
    var mainWindowOptions: js.UndefOr[WindowOption] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var nonPersistent: js.UndefOr[Boolean] = js.native
    
    var plugins: js.UndefOr[Boolean] = js.native
    
    var spellCheck: js.UndefOr[Boolean] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var uuid: String = js.native
    
    var webSecurity: js.UndefOr[Boolean] = js.native
  }
  object ApplicationOption {
    
    @scala.inline
    def apply(uuid: String): ApplicationOption = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationOption]
    }
    
    @scala.inline
    implicit class ApplicationOptionMutableBuilder[Self <: ApplicationOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommands(value: js.Array[ShortcutOverride]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
      
      @scala.inline
      def setCommandsVarargs(value: ShortcutOverride*): Self = StObject.set(x, "commands", js.Array(value :_*))
      
      @scala.inline
      def setDefaultViewOptions(value: ViewCreationOptions): Self = StObject.set(x, "defaultViewOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultViewOptionsUndefined: Self = StObject.set(x, "defaultViewOptions", js.undefined)
      
      @scala.inline
      def setDefaultWindowOptions(value: WindowOption): Self = StObject.set(x, "defaultWindowOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultWindowOptionsUndefined: Self = StObject.set(x, "defaultWindowOptions", js.undefined)
      
      @scala.inline
      def setDisableIabSecureLogging(value: Boolean): Self = StObject.set(x, "disableIabSecureLogging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableIabSecureLoggingUndefined: Self = StObject.set(x, "disableIabSecureLogging", js.undefined)
      
      @scala.inline
      def setFdc3Api(value: Boolean): Self = StObject.set(x, "fdc3Api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFdc3ApiUndefined: Self = StObject.set(x, "fdc3Api", js.undefined)
      
      @scala.inline
      def setIsPlatformController(value: Boolean): Self = StObject.set(x, "isPlatformController", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPlatformControllerUndefined: Self = StObject.set(x, "isPlatformController", js.undefined)
      
      @scala.inline
      def setLoadErrorMessage(value: String): Self = StObject.set(x, "loadErrorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadErrorMessageUndefined: Self = StObject.set(x, "loadErrorMessage", js.undefined)
      
      @scala.inline
      def setMainWindowOptions(value: WindowOption): Self = StObject.set(x, "mainWindowOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainWindowOptionsUndefined: Self = StObject.set(x, "mainWindowOptions", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNonPersistent(value: Boolean): Self = StObject.set(x, "nonPersistent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonPersistentUndefined: Self = StObject.set(x, "nonPersistent", js.undefined)
      
      @scala.inline
      def setPlugins(value: Boolean): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setSpellCheck(value: Boolean): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebSecurity(value: Boolean): Self = StObject.set(x, "webSecurity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebSecurityUndefined: Self = StObject.set(x, "webSecurity", js.undefined)
    }
  }
  
  /* Inlined std.Pick<openfin.openfin/_v2/api/window/windowOption.WindowOption, 'accelerator' | 'alwaysOnTop' | 'api' | 'aspectRatio' | 'autoShow' | 'backgroundColor' | 'contentNavigation' | 'contextMenu' | 'cornerRounding' | 'customData' | 'customRequestHeaders' | 'defaultCentered' | 'defaultHeight' | 'defaultLeft' | 'defaultTop' | 'defaultWidth' | 'frame' | 'hideOnClose' | 'icon' | 'maxHeight' | 'maximizable' | 'maxWidth' | 'minHeight' | 'minimizable' | 'minWidth' | 'opacity' | 'preloadScripts' | 'resizable' | 'resizeRegion' | 'saveWindowState' | 'shadow' | 'showTaskbarIcon' | 'smallWindow' | 'state' | 'taskbarIconGroup' | 'waitForPageLoad'> */
  @js.native
  trait LegacyWinOptionsInAppOptions extends StObject {
    
    var accelerator: js.UndefOr[Accelerator] = js.native
    
    var alwaysOnTop: js.UndefOr[Boolean] = js.native
    
    var api: js.UndefOr[Api] = js.native
    
    var aspectRatio: js.UndefOr[Double] = js.native
    
    var autoShow: js.UndefOr[Boolean] = js.native
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var contentNavigation: js.UndefOr[ContentNavigation] = js.native
    
    var contextMenu: js.UndefOr[Boolean] = js.native
    
    var cornerRounding: js.UndefOr[CornerRounding] = js.native
    
    var customData: js.UndefOr[js.Any] = js.native
    
    var customRequestHeaders: js.UndefOr[js.Array[CustomRequestHeaders]] = js.native
    
    var defaultCentered: js.UndefOr[Boolean] = js.native
    
    var defaultHeight: js.UndefOr[Double] = js.native
    
    var defaultLeft: js.UndefOr[Double] = js.native
    
    var defaultTop: js.UndefOr[Double] = js.native
    
    var defaultWidth: js.UndefOr[Double] = js.native
    
    var frame: js.UndefOr[Boolean] = js.native
    
    var hideOnClose: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[String] = js.native
    
    var maxHeight: js.UndefOr[Double] = js.native
    
    var maxWidth: js.UndefOr[Double] = js.native
    
    var maximizable: js.UndefOr[Boolean] = js.native
    
    var minHeight: js.UndefOr[Double] = js.native
    
    var minWidth: js.UndefOr[Double] = js.native
    
    var minimizable: js.UndefOr[Boolean] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var preloadScripts: js.UndefOr[js.Array[DownloadPreloadOption]] = js.native
    
    var resizable: js.UndefOr[Boolean] = js.native
    
    var resizeRegion: js.UndefOr[ResizeRegion] = js.native
    
    var saveWindowState: js.UndefOr[Boolean] = js.native
    
    var shadow: js.UndefOr[Boolean] = js.native
    
    var showTaskbarIcon: js.UndefOr[Boolean] = js.native
    
    var smallWindow: js.UndefOr[Boolean] = js.native
    
    var state: js.UndefOr[String] = js.native
    
    var taskbarIconGroup: js.UndefOr[String] = js.native
    
    var waitForPageLoad: js.UndefOr[Boolean] = js.native
  }
  object LegacyWinOptionsInAppOptions {
    
    @scala.inline
    def apply(): LegacyWinOptionsInAppOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegacyWinOptionsInAppOptions]
    }
    
    @scala.inline
    implicit class LegacyWinOptionsInAppOptionsMutableBuilder[Self <: LegacyWinOptionsInAppOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccelerator(value: Accelerator): Self = StObject.set(x, "accelerator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceleratorUndefined: Self = StObject.set(x, "accelerator", js.undefined)
      
      @scala.inline
      def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysOnTopUndefined: Self = StObject.set(x, "alwaysOnTop", js.undefined)
      
      @scala.inline
      def setApi(value: Api): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
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
      def setContextMenu(value: Boolean): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setCornerRounding(value: CornerRounding): Self = StObject.set(x, "cornerRounding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRoundingUndefined: Self = StObject.set(x, "cornerRounding", js.undefined)
      
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
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
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
      def setWaitForPageLoad(value: Boolean): Self = StObject.set(x, "waitForPageLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForPageLoadUndefined: Self = StObject.set(x, "waitForPageLoad", js.undefined)
    }
  }
}
