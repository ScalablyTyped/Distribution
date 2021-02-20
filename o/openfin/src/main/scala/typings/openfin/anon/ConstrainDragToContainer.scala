package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstrainDragToContainer extends StObject {
  
  var constrainDragToContainer: js.UndefOr[Boolean] = js.native
  
  var popoutWholeStack: js.UndefOr[Boolean] = js.native
  
  var showCloseIcon: js.UndefOr[Boolean] = js.native
  
  var showMaximiseIcon: js.UndefOr[Boolean] = js.native
  
  var showPopoutIcon: js.UndefOr[Boolean] = js.native
}
object ConstrainDragToContainer {
  
  @scala.inline
  def apply(): ConstrainDragToContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstrainDragToContainer]
  }
  
  @scala.inline
  implicit class ConstrainDragToContainerMutableBuilder[Self <: ConstrainDragToContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstrainDragToContainer(value: Boolean): Self = StObject.set(x, "constrainDragToContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstrainDragToContainerUndefined: Self = StObject.set(x, "constrainDragToContainer", js.undefined)
    
    @scala.inline
    def setPopoutWholeStack(value: Boolean): Self = StObject.set(x, "popoutWholeStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopoutWholeStackUndefined: Self = StObject.set(x, "popoutWholeStack", js.undefined)
    
    @scala.inline
    def setShowCloseIcon(value: Boolean): Self = StObject.set(x, "showCloseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCloseIconUndefined: Self = StObject.set(x, "showCloseIcon", js.undefined)
    
    @scala.inline
    def setShowMaximiseIcon(value: Boolean): Self = StObject.set(x, "showMaximiseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMaximiseIconUndefined: Self = StObject.set(x, "showMaximiseIcon", js.undefined)
    
    @scala.inline
    def setShowPopoutIcon(value: Boolean): Self = StObject.set(x, "showPopoutIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPopoutIconUndefined: Self = StObject.set(x, "showPopoutIcon", js.undefined)
  }
}
