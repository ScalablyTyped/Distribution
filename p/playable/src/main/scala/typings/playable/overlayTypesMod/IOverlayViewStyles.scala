package typings.playable.overlayTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOverlayViewStyles extends js.Object {
  
  var active: String = js.native
  
  var hidden: String = js.native
  
  var overlay: String = js.native
  
  var poster: String = js.native
  
  var transparency: String = js.native
}
object IOverlayViewStyles {
  
  @scala.inline
  def apply(active: String, hidden: String, overlay: String, poster: String, transparency: String): IOverlayViewStyles = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any], poster = poster.asInstanceOf[js.Any], transparency = transparency.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOverlayViewStyles]
  }
  
  @scala.inline
  implicit class IOverlayViewStylesOps[Self <: IOverlayViewStyles] (val x: Self) extends AnyVal {
    
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlay(value: String): Self = this.set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoster(value: String): Self = this.set("poster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparency(value: String): Self = this.set("transparency", value.asInstanceOf[js.Any])
  }
}
