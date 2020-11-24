package typings.popupWindow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupWindowConfig extends js.Object {
  
  var height: js.UndefOr[Double] = js.native
  
  var left: js.UndefOr[Double] = js.native
  
  var location: js.UndefOr[Boolean] = js.native
  
  var menubar: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var resizable: js.UndefOr[Boolean] = js.native
  
  var scrollbars: js.UndefOr[Boolean] = js.native
  
  var status: js.UndefOr[Boolean] = js.native
  
  var toolbar: js.UndefOr[Boolean] = js.native
  
  var top: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object PopupWindowConfig {
  
  @scala.inline
  def apply(): PopupWindowConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupWindowConfig]
  }
  
  @scala.inline
  implicit class PopupWindowConfigOps[Self <: PopupWindowConfig] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setLocation(value: Boolean): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setMenubar(value: Boolean): Self = this.set("menubar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenubar: Self = this.set("menubar", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    
    @scala.inline
    def setScrollbars(value: Boolean): Self = this.set("scrollbars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollbars: Self = this.set("scrollbars", js.undefined)
    
    @scala.inline
    def setStatus(value: Boolean): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setToolbar(value: Boolean): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
