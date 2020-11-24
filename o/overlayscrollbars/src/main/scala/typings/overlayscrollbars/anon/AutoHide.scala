package typings.overlayscrollbars.anon

import typings.overlayscrollbars.mod.AutoHideBehavior
import typings.overlayscrollbars.mod.VisibilityBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoHide extends js.Object {
  
  var autoHide: js.UndefOr[AutoHideBehavior] = js.native
  
  var autoHideDelay: js.UndefOr[Double] = js.native
  
  var clickScrolling: js.UndefOr[Boolean] = js.native
  
  var dragScrolling: js.UndefOr[Boolean] = js.native
  
  var snapHandle: js.UndefOr[Boolean] = js.native
  
  var touchSupport: js.UndefOr[Boolean] = js.native
  
  var visibility: js.UndefOr[VisibilityBehavior] = js.native
}
object AutoHide {
  
  @scala.inline
  def apply(): AutoHide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoHide]
  }
  
  @scala.inline
  implicit class AutoHideOps[Self <: AutoHide] (val x: Self) extends AnyVal {
    
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
    def setAutoHide(value: AutoHideBehavior): Self = this.set("autoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHide: Self = this.set("autoHide", js.undefined)
    
    @scala.inline
    def setAutoHideDelay(value: Double): Self = this.set("autoHideDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHideDelay: Self = this.set("autoHideDelay", js.undefined)
    
    @scala.inline
    def setClickScrolling(value: Boolean): Self = this.set("clickScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickScrolling: Self = this.set("clickScrolling", js.undefined)
    
    @scala.inline
    def setDragScrolling(value: Boolean): Self = this.set("dragScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragScrolling: Self = this.set("dragScrolling", js.undefined)
    
    @scala.inline
    def setSnapHandle(value: Boolean): Self = this.set("snapHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapHandle: Self = this.set("snapHandle", js.undefined)
    
    @scala.inline
    def setTouchSupport(value: Boolean): Self = this.set("touchSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchSupport: Self = this.set("touchSupport", js.undefined)
    
    @scala.inline
    def setVisibility(value: VisibilityBehavior): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
}
