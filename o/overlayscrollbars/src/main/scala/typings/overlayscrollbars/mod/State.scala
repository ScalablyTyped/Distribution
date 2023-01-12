package typings.overlayscrollbars.mod

import typings.overlayscrollbars.anon.B
import typings.overlayscrollbars.anon.Height
import typings.overlayscrollbars.anon.XBoolean
import typings.overlayscrollbars.anon.XNumber
import typings.overlayscrollbars.anon.Xs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State extends StObject {
  
  var autoUpdate: Boolean
  
  var contentScrollSize: Height
  
  var destroyed: Boolean
  
  var documentMixed: Boolean
  
  var hasOverflow: XBoolean
  
  var heightAuto: Boolean
  
  var hideOverflow: Xs
  
  var hostSize: Height
  
  var overflowAmount: XNumber
  
  var padding: B
  
  var sleeping: Boolean
  
  var viewportSize: Height
  
  var widthAuto: Boolean
}
object State {
  
  inline def apply(
    autoUpdate: Boolean,
    contentScrollSize: Height,
    destroyed: Boolean,
    documentMixed: Boolean,
    hasOverflow: XBoolean,
    heightAuto: Boolean,
    hideOverflow: Xs,
    hostSize: Height,
    overflowAmount: XNumber,
    padding: B,
    sleeping: Boolean,
    viewportSize: Height,
    widthAuto: Boolean
  ): State = {
    val __obj = js.Dynamic.literal(autoUpdate = autoUpdate.asInstanceOf[js.Any], contentScrollSize = contentScrollSize.asInstanceOf[js.Any], destroyed = destroyed.asInstanceOf[js.Any], documentMixed = documentMixed.asInstanceOf[js.Any], hasOverflow = hasOverflow.asInstanceOf[js.Any], heightAuto = heightAuto.asInstanceOf[js.Any], hideOverflow = hideOverflow.asInstanceOf[js.Any], hostSize = hostSize.asInstanceOf[js.Any], overflowAmount = overflowAmount.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], sleeping = sleeping.asInstanceOf[js.Any], viewportSize = viewportSize.asInstanceOf[js.Any], widthAuto = widthAuto.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
    
    inline def setAutoUpdate(value: Boolean): Self = StObject.set(x, "autoUpdate", value.asInstanceOf[js.Any])
    
    inline def setContentScrollSize(value: Height): Self = StObject.set(x, "contentScrollSize", value.asInstanceOf[js.Any])
    
    inline def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
    
    inline def setDocumentMixed(value: Boolean): Self = StObject.set(x, "documentMixed", value.asInstanceOf[js.Any])
    
    inline def setHasOverflow(value: XBoolean): Self = StObject.set(x, "hasOverflow", value.asInstanceOf[js.Any])
    
    inline def setHeightAuto(value: Boolean): Self = StObject.set(x, "heightAuto", value.asInstanceOf[js.Any])
    
    inline def setHideOverflow(value: Xs): Self = StObject.set(x, "hideOverflow", value.asInstanceOf[js.Any])
    
    inline def setHostSize(value: Height): Self = StObject.set(x, "hostSize", value.asInstanceOf[js.Any])
    
    inline def setOverflowAmount(value: XNumber): Self = StObject.set(x, "overflowAmount", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: B): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setSleeping(value: Boolean): Self = StObject.set(x, "sleeping", value.asInstanceOf[js.Any])
    
    inline def setViewportSize(value: Height): Self = StObject.set(x, "viewportSize", value.asInstanceOf[js.Any])
    
    inline def setWidthAuto(value: Boolean): Self = StObject.set(x, "widthAuto", value.asInstanceOf[js.Any])
  }
}
