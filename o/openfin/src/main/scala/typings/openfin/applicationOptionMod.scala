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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applicationOptionMod {
  
  trait ApplicationOption
    extends StObject
       with LegacyWinOptionsInAppOptions {
    
    var commands: js.UndefOr[js.Array[ShortcutOverride]] = js.undefined
    
    var defaultViewOptions: js.UndefOr[ViewCreationOptions] = js.undefined
    
    var defaultWindowOptions: js.UndefOr[WindowOption] = js.undefined
    
    var disableIabSecureLogging: js.UndefOr[Boolean] = js.undefined
    
    var fdc3Api: js.UndefOr[Boolean] = js.undefined
    
    var isPlatformController: js.UndefOr[Boolean] = js.undefined
    
    var loadErrorMessage: js.UndefOr[String] = js.undefined
    
    var mainWindowOptions: js.UndefOr[WindowOption] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var nonPersistent: js.UndefOr[Boolean] = js.undefined
    
    var plugins: js.UndefOr[Boolean] = js.undefined
    
    var spellCheck: js.UndefOr[Boolean] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var uuid: String
    
    var webSecurity: js.UndefOr[Boolean] = js.undefined
  }
  object ApplicationOption {
    
    inline def apply(uuid: String): ApplicationOption = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationOption]
    }
    
    extension [Self <: ApplicationOption](x: Self) {
      
      inline def setCommands(value: js.Array[ShortcutOverride]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
      
      inline def setCommandsVarargs(value: ShortcutOverride*): Self = StObject.set(x, "commands", js.Array(value*))
      
      inline def setDefaultViewOptions(value: ViewCreationOptions): Self = StObject.set(x, "defaultViewOptions", value.asInstanceOf[js.Any])
      
      inline def setDefaultViewOptionsUndefined: Self = StObject.set(x, "defaultViewOptions", js.undefined)
      
      inline def setDefaultWindowOptions(value: WindowOption): Self = StObject.set(x, "defaultWindowOptions", value.asInstanceOf[js.Any])
      
      inline def setDefaultWindowOptionsUndefined: Self = StObject.set(x, "defaultWindowOptions", js.undefined)
      
      inline def setDisableIabSecureLogging(value: Boolean): Self = StObject.set(x, "disableIabSecureLogging", value.asInstanceOf[js.Any])
      
      inline def setDisableIabSecureLoggingUndefined: Self = StObject.set(x, "disableIabSecureLogging", js.undefined)
      
      inline def setFdc3Api(value: Boolean): Self = StObject.set(x, "fdc3Api", value.asInstanceOf[js.Any])
      
      inline def setFdc3ApiUndefined: Self = StObject.set(x, "fdc3Api", js.undefined)
      
      inline def setIsPlatformController(value: Boolean): Self = StObject.set(x, "isPlatformController", value.asInstanceOf[js.Any])
      
      inline def setIsPlatformControllerUndefined: Self = StObject.set(x, "isPlatformController", js.undefined)
      
      inline def setLoadErrorMessage(value: String): Self = StObject.set(x, "loadErrorMessage", value.asInstanceOf[js.Any])
      
      inline def setLoadErrorMessageUndefined: Self = StObject.set(x, "loadErrorMessage", js.undefined)
      
      inline def setMainWindowOptions(value: WindowOption): Self = StObject.set(x, "mainWindowOptions", value.asInstanceOf[js.Any])
      
      inline def setMainWindowOptionsUndefined: Self = StObject.set(x, "mainWindowOptions", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNonPersistent(value: Boolean): Self = StObject.set(x, "nonPersistent", value.asInstanceOf[js.Any])
      
      inline def setNonPersistentUndefined: Self = StObject.set(x, "nonPersistent", js.undefined)
      
      inline def setPlugins(value: Boolean): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setSpellCheck(value: Boolean): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setWebSecurity(value: Boolean): Self = StObject.set(x, "webSecurity", value.asInstanceOf[js.Any])
      
      inline def setWebSecurityUndefined: Self = StObject.set(x, "webSecurity", js.undefined)
    }
  }
  
  /* Inlined std.Pick<openfin.openfin/_v2/api/window/windowOption.WindowOption, 'accelerator' | 'alwaysOnTop' | 'api' | 'aspectRatio' | 'autoShow' | 'backgroundColor' | 'contentNavigation' | 'contextMenu' | 'cornerRounding' | 'customData' | 'customRequestHeaders' | 'defaultCentered' | 'defaultHeight' | 'defaultLeft' | 'defaultTop' | 'defaultWidth' | 'frame' | 'hideOnClose' | 'icon' | 'maxHeight' | 'maximizable' | 'maxWidth' | 'minHeight' | 'minimizable' | 'minWidth' | 'opacity' | 'preloadScripts' | 'resizable' | 'resizeRegion' | 'saveWindowState' | 'shadow' | 'showTaskbarIcon' | 'smallWindow' | 'state' | 'taskbarIconGroup' | 'waitForPageLoad'> */
  trait LegacyWinOptionsInAppOptions extends StObject {
    
    var accelerator: js.UndefOr[Accelerator] = js.undefined
    
    var alwaysOnTop: js.UndefOr[Boolean] = js.undefined
    
    var api: js.UndefOr[Api] = js.undefined
    
    var aspectRatio: js.UndefOr[Double] = js.undefined
    
    var autoShow: js.UndefOr[Boolean] = js.undefined
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var contentNavigation: js.UndefOr[ContentNavigation] = js.undefined
    
    var contextMenu: js.UndefOr[Boolean] = js.undefined
    
    var cornerRounding: js.UndefOr[CornerRounding] = js.undefined
    
    var customData: js.UndefOr[Any] = js.undefined
    
    var customRequestHeaders: js.UndefOr[js.Array[CustomRequestHeaders]] = js.undefined
    
    var defaultCentered: js.UndefOr[Boolean] = js.undefined
    
    var defaultHeight: js.UndefOr[Double] = js.undefined
    
    var defaultLeft: js.UndefOr[Double] = js.undefined
    
    var defaultTop: js.UndefOr[Double] = js.undefined
    
    var defaultWidth: js.UndefOr[Double] = js.undefined
    
    var frame: js.UndefOr[Boolean] = js.undefined
    
    var hideOnClose: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var maximizable: js.UndefOr[Boolean] = js.undefined
    
    var minHeight: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var minimizable: js.UndefOr[Boolean] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var preloadScripts: js.UndefOr[js.Array[DownloadPreloadOption]] = js.undefined
    
    var resizable: js.UndefOr[Boolean] = js.undefined
    
    var resizeRegion: js.UndefOr[ResizeRegion] = js.undefined
    
    var saveWindowState: js.UndefOr[Boolean] = js.undefined
    
    var shadow: js.UndefOr[Boolean] = js.undefined
    
    var showTaskbarIcon: js.UndefOr[Boolean] = js.undefined
    
    var smallWindow: js.UndefOr[Boolean] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
    
    var taskbarIconGroup: js.UndefOr[String] = js.undefined
    
    var waitForPageLoad: js.UndefOr[Boolean] = js.undefined
  }
  object LegacyWinOptionsInAppOptions {
    
    inline def apply(): LegacyWinOptionsInAppOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegacyWinOptionsInAppOptions]
    }
    
    extension [Self <: LegacyWinOptionsInAppOptions](x: Self) {
      
      inline def setAccelerator(value: Accelerator): Self = StObject.set(x, "accelerator", value.asInstanceOf[js.Any])
      
      inline def setAcceleratorUndefined: Self = StObject.set(x, "accelerator", js.undefined)
      
      inline def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
      
      inline def setAlwaysOnTopUndefined: Self = StObject.set(x, "alwaysOnTop", js.undefined)
      
      inline def setApi(value: Api): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
      
      inline def setAutoShow(value: Boolean): Self = StObject.set(x, "autoShow", value.asInstanceOf[js.Any])
      
      inline def setAutoShowUndefined: Self = StObject.set(x, "autoShow", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setContentNavigation(value: ContentNavigation): Self = StObject.set(x, "contentNavigation", value.asInstanceOf[js.Any])
      
      inline def setContentNavigationUndefined: Self = StObject.set(x, "contentNavigation", js.undefined)
      
      inline def setContextMenu(value: Boolean): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setCornerRounding(value: CornerRounding): Self = StObject.set(x, "cornerRounding", value.asInstanceOf[js.Any])
      
      inline def setCornerRoundingUndefined: Self = StObject.set(x, "cornerRounding", js.undefined)
      
      inline def setCustomData(value: Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      inline def setCustomRequestHeaders(value: js.Array[CustomRequestHeaders]): Self = StObject.set(x, "customRequestHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomRequestHeadersUndefined: Self = StObject.set(x, "customRequestHeaders", js.undefined)
      
      inline def setCustomRequestHeadersVarargs(value: CustomRequestHeaders*): Self = StObject.set(x, "customRequestHeaders", js.Array(value*))
      
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
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
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
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPreloadScripts(value: js.Array[DownloadPreloadOption]): Self = StObject.set(x, "preloadScripts", value.asInstanceOf[js.Any])
      
      inline def setPreloadScriptsUndefined: Self = StObject.set(x, "preloadScripts", js.undefined)
      
      inline def setPreloadScriptsVarargs(value: DownloadPreloadOption*): Self = StObject.set(x, "preloadScripts", js.Array(value*))
      
      inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      inline def setResizeRegion(value: ResizeRegion): Self = StObject.set(x, "resizeRegion", value.asInstanceOf[js.Any])
      
      inline def setResizeRegionUndefined: Self = StObject.set(x, "resizeRegion", js.undefined)
      
      inline def setSaveWindowState(value: Boolean): Self = StObject.set(x, "saveWindowState", value.asInstanceOf[js.Any])
      
      inline def setSaveWindowStateUndefined: Self = StObject.set(x, "saveWindowState", js.undefined)
      
      inline def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
      
      inline def setShowTaskbarIcon(value: Boolean): Self = StObject.set(x, "showTaskbarIcon", value.asInstanceOf[js.Any])
      
      inline def setShowTaskbarIconUndefined: Self = StObject.set(x, "showTaskbarIcon", js.undefined)
      
      inline def setSmallWindow(value: Boolean): Self = StObject.set(x, "smallWindow", value.asInstanceOf[js.Any])
      
      inline def setSmallWindowUndefined: Self = StObject.set(x, "smallWindow", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTaskbarIconGroup(value: String): Self = StObject.set(x, "taskbarIconGroup", value.asInstanceOf[js.Any])
      
      inline def setTaskbarIconGroupUndefined: Self = StObject.set(x, "taskbarIconGroup", js.undefined)
      
      inline def setWaitForPageLoad(value: Boolean): Self = StObject.set(x, "waitForPageLoad", value.asInstanceOf[js.Any])
      
      inline def setWaitForPageLoadUndefined: Self = StObject.set(x, "waitForPageLoad", js.undefined)
    }
  }
}
