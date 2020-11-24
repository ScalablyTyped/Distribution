package typings.nwJs.mod.global.NWJSHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * nw.Window Option that is in the same format as the Window subfields in manifest format.
  */
@js.native
trait WindowOption extends js.Object {
  
  /**
    * Whether the window should always stay on top of other windows.
    */
  var always_on_top: js.UndefOr[Boolean] = js.native
  
  /**
    * Show as desktop background window under X11 environment
    */
  var as_desktop: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify it to false to make the window frameless
    */
  var frame: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether window is fullscreen
    */
  var fullscreen: js.UndefOr[Boolean] = js.native
  
  /**
    * The initial height of the main window.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Path to window’s icon
    */
  var icon: js.UndefOr[String] = js.native
  
  /**
    * The id used to identify the window.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Whether to use Kiosk mode.
    */
  var kiosk: js.UndefOr[Boolean] = js.native
  
  /**
    * Maximum height of window
    */
  var max_height: js.UndefOr[Double] = js.native
  
  /**
    * Maximum width of window
    */
  var max_width: js.UndefOr[Double] = js.native
  
  /**
    * Minimum height of window
    */
  var min_height: js.UndefOr[Double] = js.native
  
  /**
    * Minimum width of window
    */
  var min_width: js.UndefOr[Double] = js.native
  
  /**
    * Controls where window will be put, be `null` or `center` or `mouse`
    */
  var position: js.UndefOr[String] = js.native
  
  /**
    * Whether window is resizable
    */
  var resizable: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify it to false if you want your app to be hidden on startup
    */
  var show: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the window is shown in taskbar or dock. The default is true.
    */
  var show_in_taskbar: js.UndefOr[Boolean] = js.native
  
  /**
    * The default title of window created by NW.js
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Whether to turn on transparent window mode.
    */
  var transparent: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the window should be visible on all workspaces simultaneously (on platforms that support multiple workspaces, currently Mac OS X and Linux).
    */
  var visible_on_all_workspaces: js.UndefOr[Boolean] = js.native
  
  /**
    * The initial width of the main window.
    */
  var width: js.UndefOr[Double] = js.native
}
object WindowOption {
  
  @scala.inline
  def apply(): WindowOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowOption]
  }
  
  @scala.inline
  implicit class WindowOptionOps[Self <: WindowOption] (val x: Self) extends AnyVal {
    
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
    def setAlways_on_top(value: Boolean): Self = this.set("always_on_top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlways_on_top: Self = this.set("always_on_top", js.undefined)
    
    @scala.inline
    def setAs_desktop(value: Boolean): Self = this.set("as_desktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs_desktop: Self = this.set("as_desktop", js.undefined)
    
    @scala.inline
    def setFrame(value: Boolean): Self = this.set("frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
    
    @scala.inline
    def setFullscreen(value: Boolean): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullscreen: Self = this.set("fullscreen", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKiosk(value: Boolean): Self = this.set("kiosk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKiosk: Self = this.set("kiosk", js.undefined)
    
    @scala.inline
    def setMax_height(value: Double): Self = this.set("max_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_height: Self = this.set("max_height", js.undefined)
    
    @scala.inline
    def setMax_width(value: Double): Self = this.set("max_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_width: Self = this.set("max_width", js.undefined)
    
    @scala.inline
    def setMin_height(value: Double): Self = this.set("min_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin_height: Self = this.set("min_height", js.undefined)
    
    @scala.inline
    def setMin_width(value: Double): Self = this.set("min_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin_width: Self = this.set("min_width", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setShow_in_taskbar(value: Boolean): Self = this.set("show_in_taskbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow_in_taskbar: Self = this.set("show_in_taskbar", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTransparent(value: Boolean): Self = this.set("transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransparent: Self = this.set("transparent", js.undefined)
    
    @scala.inline
    def setVisible_on_all_workspaces(value: Boolean): Self = this.set("visible_on_all_workspaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible_on_all_workspaces: Self = this.set("visible_on_all_workspaces", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
