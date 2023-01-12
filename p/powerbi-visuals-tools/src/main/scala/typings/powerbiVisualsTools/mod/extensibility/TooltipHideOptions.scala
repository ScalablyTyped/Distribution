package typings.powerbiVisualsTools.mod.extensibility

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipHideOptions extends StObject {
  
  var immediately: Boolean
  
  var isTouchEvent: Boolean
}
object TooltipHideOptions {
  
  inline def apply(immediately: Boolean, isTouchEvent: Boolean): TooltipHideOptions = {
    val __obj = js.Dynamic.literal(immediately = immediately.asInstanceOf[js.Any], isTouchEvent = isTouchEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipHideOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TooltipHideOptions] (val x: Self) extends AnyVal {
    
    inline def setImmediately(value: Boolean): Self = StObject.set(x, "immediately", value.asInstanceOf[js.Any])
    
    inline def setIsTouchEvent(value: Boolean): Self = StObject.set(x, "isTouchEvent", value.asInstanceOf[js.Any])
  }
}
