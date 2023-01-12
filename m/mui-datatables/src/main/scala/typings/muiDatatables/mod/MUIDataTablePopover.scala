package typings.muiDatatables.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTablePopover extends StObject {
  
  var action: js.UndefOr[js.Function1[/* args */ Any, Any]] = js.undefined
  
  var anchorEl: js.UndefOr[ReactNode] = js.undefined
  
  var anchorOrigin: js.UndefOr[Any] = js.undefined
  
  var classes: js.UndefOr[js.Object] = js.undefined
  
  var content: js.UndefOr[ReactNode] = js.undefined
  
  var elevation: js.UndefOr[Double] = js.undefined
  
  var onClose: js.UndefOr[js.Function1[/* args */ Any, Any]] = js.undefined
  
  var onExited: js.UndefOr[js.Function1[/* args */ Any, Any]] = js.undefined
  
  var option: js.UndefOr[Boolean] = js.undefined
  
  var ref: js.UndefOr[Any] = js.undefined
  
  var refExit: js.UndefOr[js.Function1[/* args */ Any, Any]] = js.undefined
  
  var transformOrigin: js.UndefOr[Any] = js.undefined
  
  var trigger: js.UndefOr[ReactNode] = js.undefined
}
object MUIDataTablePopover {
  
  inline def apply(): MUIDataTablePopover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTablePopover]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MUIDataTablePopover] (val x: Self) extends AnyVal {
    
    inline def setAction(value: /* args */ Any => Any): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAnchorEl(value: ReactNode): Self = StObject.set(x, "anchorEl", value.asInstanceOf[js.Any])
    
    inline def setAnchorElUndefined: Self = StObject.set(x, "anchorEl", js.undefined)
    
    inline def setAnchorOrigin(value: Any): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
    
    inline def setAnchorOriginUndefined: Self = StObject.set(x, "anchorOrigin", js.undefined)
    
    inline def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    inline def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
    
    inline def setOnClose(value: /* args */ Any => Any): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnExited(value: /* args */ Any => Any): Self = StObject.set(x, "onExited", js.Any.fromFunction1(value))
    
    inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
    
    inline def setOption(value: Boolean): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
    
    inline def setRef(value: Any): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefExit(value: /* args */ Any => Any): Self = StObject.set(x, "refExit", js.Any.fromFunction1(value))
    
    inline def setRefExitUndefined: Self = StObject.set(x, "refExit", js.undefined)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setTransformOrigin(value: Any): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
    
    inline def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
    
    inline def setTrigger(value: ReactNode): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
