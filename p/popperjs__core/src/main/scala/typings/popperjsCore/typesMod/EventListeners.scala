package typings.popperjsCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventListeners extends StObject {
  
  var resize: Boolean
  
  var scroll: Boolean
}
object EventListeners {
  
  inline def apply(resize: Boolean, scroll: Boolean): EventListeners = {
    val __obj = js.Dynamic.literal(resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventListeners]
  }
  
  extension [Self <: EventListeners](x: Self) {
    
    inline def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
  }
}
