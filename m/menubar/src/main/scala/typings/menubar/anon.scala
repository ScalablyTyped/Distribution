package typings.menubar

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<menubar.menubar/lib/types.Options> */
  trait PartialOptions extends StObject {
    
    var browserWindow: js.UndefOr[BrowserWindowConstructorOptions] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var icon: js.UndefOr[String | NativeImage_] = js.undefined
    
    var index: js.UndefOr[String | `false`] = js.undefined
    
    var loadUrlOptions: js.UndefOr[LoadURLOptions] = js.undefined
    
    var preloadWindow: js.UndefOr[Boolean] = js.undefined
    
    var showDockIcon: js.UndefOr[Boolean] = js.undefined
    
    var showOnAllWorkspaces: js.UndefOr[Boolean] = js.undefined
    
    var showOnRightClick: js.UndefOr[Boolean] = js.undefined
    
    var tooltip: js.UndefOr[String] = js.undefined
    
    var tray: js.UndefOr[Tray] = js.undefined
    
    var windowPosition: js.UndefOr[
        trayLeft | trayBottomLeft | trayRight | trayBottomRight | trayCenter | trayBottomCenter | topLeft | topRight | bottomLeft | bottomRight | topCenter | bottomCenter | leftCenter | rightCenter | center
      ] = js.undefined
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowserWindow(value: BrowserWindowConstructorOptions): Self = StObject.set(x, "browserWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserWindowUndefined: Self = StObject.set(x, "browserWindow", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setIcon(value: String | NativeImage_): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIndex(value: String | `false`): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setLoadUrlOptions(value: LoadURLOptions): Self = StObject.set(x, "loadUrlOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadUrlOptionsUndefined: Self = StObject.set(x, "loadUrlOptions", js.undefined)
      
      @scala.inline
      def setPreloadWindow(value: Boolean): Self = StObject.set(x, "preloadWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadWindowUndefined: Self = StObject.set(x, "preloadWindow", js.undefined)
      
      @scala.inline
      def setShowDockIcon(value: Boolean): Self = StObject.set(x, "showDockIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDockIconUndefined: Self = StObject.set(x, "showDockIcon", js.undefined)
      
      @scala.inline
      def setShowOnAllWorkspaces(value: Boolean): Self = StObject.set(x, "showOnAllWorkspaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOnAllWorkspacesUndefined: Self = StObject.set(x, "showOnAllWorkspaces", js.undefined)
      
      @scala.inline
      def setShowOnRightClick(value: Boolean): Self = StObject.set(x, "showOnRightClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOnRightClickUndefined: Self = StObject.set(x, "showOnRightClick", js.undefined)
      
      @scala.inline
      def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setTray(value: Tray): Self = StObject.set(x, "tray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrayUndefined: Self = StObject.set(x, "tray", js.undefined)
      
      @scala.inline
      def setWindowPosition(
        value: trayLeft | trayBottomLeft | trayRight | trayBottomRight | trayCenter | trayBottomCenter | topLeft | topRight | bottomLeft | bottomRight | topCenter | bottomCenter | leftCenter | rightCenter | center
      ): Self = StObject.set(x, "windowPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowPositionUndefined: Self = StObject.set(x, "windowPosition", js.undefined)
    }
  }
}
