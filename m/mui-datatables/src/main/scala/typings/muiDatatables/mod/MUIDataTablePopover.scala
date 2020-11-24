package typings.muiDatatables.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTablePopover extends js.Object {
  
  var action: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  
  var anchorEl: js.UndefOr[ReactNode] = js.native
  
  var anchorOrigin: js.UndefOr[js.Any] = js.native
  
  var elevation: js.UndefOr[Double] = js.native
  
  var onClose: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  
  var onExited: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  
  var option: js.UndefOr[Boolean] = js.native
  
  var ref: js.UndefOr[js.Any] = js.native
  
  var transformOrigin: js.UndefOr[js.Any] = js.native
}
object MUIDataTablePopover {
  
  @scala.inline
  def apply(): MUIDataTablePopover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTablePopover]
  }
  
  @scala.inline
  implicit class MUIDataTablePopoverOps[Self <: MUIDataTablePopover] (val x: Self) extends AnyVal {
    
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
    def setAction(value: /* args */ js.Any => _): Self = this.set("action", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setAnchorEl(value: ReactNode): Self = this.set("anchorEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorEl: Self = this.set("anchorEl", js.undefined)
    
    @scala.inline
    def setAnchorOrigin(value: js.Any): Self = this.set("anchorOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorOrigin: Self = this.set("anchorOrigin", js.undefined)
    
    @scala.inline
    def setElevation(value: Double): Self = this.set("elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElevation: Self = this.set("elevation", js.undefined)
    
    @scala.inline
    def setOnClose(value: /* args */ js.Any => _): Self = this.set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnExited(value: /* args */ js.Any => _): Self = this.set("onExited", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnExited: Self = this.set("onExited", js.undefined)
    
    @scala.inline
    def setOption(value: Boolean): Self = this.set("option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOption: Self = this.set("option", js.undefined)
    
    @scala.inline
    def setRef(value: js.Any): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setTransformOrigin(value: js.Any): Self = this.set("transformOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformOrigin: Self = this.set("transformOrigin", js.undefined)
  }
}
