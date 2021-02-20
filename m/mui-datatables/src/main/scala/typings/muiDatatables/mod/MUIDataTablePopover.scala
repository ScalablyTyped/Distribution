package typings.muiDatatables.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTablePopover extends StObject {
  
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
  implicit class MUIDataTablePopoverMutableBuilder[Self <: MUIDataTablePopover] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: /* args */ js.Any => _): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setAnchorEl(value: ReactNode): Self = StObject.set(x, "anchorEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorElUndefined: Self = StObject.set(x, "anchorEl", js.undefined)
    
    @scala.inline
    def setAnchorOrigin(value: js.Any): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorOriginUndefined: Self = StObject.set(x, "anchorOrigin", js.undefined)
    
    @scala.inline
    def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
    
    @scala.inline
    def setOnClose(value: /* args */ js.Any => _): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOnExited(value: /* args */ js.Any => _): Self = StObject.set(x, "onExited", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
    
    @scala.inline
    def setOption(value: Boolean): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
    
    @scala.inline
    def setRef(value: js.Any): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setTransformOrigin(value: js.Any): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
  }
}
