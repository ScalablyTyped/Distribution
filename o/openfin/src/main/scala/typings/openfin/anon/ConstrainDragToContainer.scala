package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstrainDragToContainer extends StObject {
  
  var constrainDragToContainer: js.UndefOr[Boolean] = js.undefined
  
  var popoutWholeStack: js.UndefOr[Boolean] = js.undefined
  
  var showCloseIcon: js.UndefOr[Boolean] = js.undefined
  
  var showMaximiseIcon: js.UndefOr[Boolean] = js.undefined
  
  var showPopoutIcon: js.UndefOr[Boolean] = js.undefined
}
object ConstrainDragToContainer {
  
  inline def apply(): ConstrainDragToContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstrainDragToContainer]
  }
  
  extension [Self <: ConstrainDragToContainer](x: Self) {
    
    inline def setConstrainDragToContainer(value: Boolean): Self = StObject.set(x, "constrainDragToContainer", value.asInstanceOf[js.Any])
    
    inline def setConstrainDragToContainerUndefined: Self = StObject.set(x, "constrainDragToContainer", js.undefined)
    
    inline def setPopoutWholeStack(value: Boolean): Self = StObject.set(x, "popoutWholeStack", value.asInstanceOf[js.Any])
    
    inline def setPopoutWholeStackUndefined: Self = StObject.set(x, "popoutWholeStack", js.undefined)
    
    inline def setShowCloseIcon(value: Boolean): Self = StObject.set(x, "showCloseIcon", value.asInstanceOf[js.Any])
    
    inline def setShowCloseIconUndefined: Self = StObject.set(x, "showCloseIcon", js.undefined)
    
    inline def setShowMaximiseIcon(value: Boolean): Self = StObject.set(x, "showMaximiseIcon", value.asInstanceOf[js.Any])
    
    inline def setShowMaximiseIconUndefined: Self = StObject.set(x, "showMaximiseIcon", js.undefined)
    
    inline def setShowPopoutIcon(value: Boolean): Self = StObject.set(x, "showPopoutIcon", value.asInstanceOf[js.Any])
    
    inline def setShowPopoutIconUndefined: Self = StObject.set(x, "showPopoutIcon", js.undefined)
  }
}
