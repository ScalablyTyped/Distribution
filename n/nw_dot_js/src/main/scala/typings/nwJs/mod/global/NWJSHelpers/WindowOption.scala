package typings.nwJs.mod.global.NWJSHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * nw.Window Option that is in the same format as the Window subfields in manifest format.
  */
trait WindowOption extends StObject {
  
  /**
    * Whether the window should always stay on top of other windows.
    */
  var always_on_top: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show as desktop background window under X11 environment
    */
  var as_desktop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify it to false to make the window frameless
    */
  var frame: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether window is fullscreen
    */
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The initial height of the main window.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Path to window’s icon
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * The id used to identify the window.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to use Kiosk mode.
    */
  var kiosk: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum height of window
    */
  var max_height: js.UndefOr[Double] = js.undefined
  
  /**
    * Maximum width of window
    */
  var max_width: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum height of window
    */
  var min_height: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum width of window
    */
  var min_width: js.UndefOr[Double] = js.undefined
  
  /**
    * Controls where window will be put, be `null` or `center` or `mouse`
    */
  var position: js.UndefOr[String] = js.undefined
  
  /**
    * Whether window is resizable
    */
  var resizable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify it to false if you want your app to be hidden on startup
    */
  var show: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the window is shown in taskbar or dock. The default is true.
    */
  var show_in_taskbar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The default title of window created by NW.js
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to turn on transparent window mode.
    */
  var transparent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the window should be visible on all workspaces simultaneously (on platforms that support multiple workspaces, currently Mac OS X and Linux).
    */
  var visible_on_all_workspaces: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The initial width of the main window.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object WindowOption {
  
  inline def apply(): WindowOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowOption] (val x: Self) extends AnyVal {
    
    inline def setAlways_on_top(value: Boolean): Self = StObject.set(x, "always_on_top", value.asInstanceOf[js.Any])
    
    inline def setAlways_on_topUndefined: Self = StObject.set(x, "always_on_top", js.undefined)
    
    inline def setAs_desktop(value: Boolean): Self = StObject.set(x, "as_desktop", value.asInstanceOf[js.Any])
    
    inline def setAs_desktopUndefined: Self = StObject.set(x, "as_desktop", js.undefined)
    
    inline def setFrame(value: Boolean): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    inline def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKiosk(value: Boolean): Self = StObject.set(x, "kiosk", value.asInstanceOf[js.Any])
    
    inline def setKioskUndefined: Self = StObject.set(x, "kiosk", js.undefined)
    
    inline def setMax_height(value: Double): Self = StObject.set(x, "max_height", value.asInstanceOf[js.Any])
    
    inline def setMax_heightUndefined: Self = StObject.set(x, "max_height", js.undefined)
    
    inline def setMax_width(value: Double): Self = StObject.set(x, "max_width", value.asInstanceOf[js.Any])
    
    inline def setMax_widthUndefined: Self = StObject.set(x, "max_width", js.undefined)
    
    inline def setMin_height(value: Double): Self = StObject.set(x, "min_height", value.asInstanceOf[js.Any])
    
    inline def setMin_heightUndefined: Self = StObject.set(x, "min_height", js.undefined)
    
    inline def setMin_width(value: Double): Self = StObject.set(x, "min_width", value.asInstanceOf[js.Any])
    
    inline def setMin_widthUndefined: Self = StObject.set(x, "min_width", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setShow_in_taskbar(value: Boolean): Self = StObject.set(x, "show_in_taskbar", value.asInstanceOf[js.Any])
    
    inline def setShow_in_taskbarUndefined: Self = StObject.set(x, "show_in_taskbar", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    inline def setVisible_on_all_workspaces(value: Boolean): Self = StObject.set(x, "visible_on_all_workspaces", value.asInstanceOf[js.Any])
    
    inline def setVisible_on_all_workspacesUndefined: Self = StObject.set(x, "visible_on_all_workspaces", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
