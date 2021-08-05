package typings.popperjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollTop extends StObject {
  
  var scrollLeft: js.Any
  
  var scrollTop: js.Any
}
object ScrollTop {
  
  inline def apply(scrollLeft: js.Any, scrollTop: js.Any): ScrollTop = {
    val __obj = js.Dynamic.literal(scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollTop]
  }
  
  extension [Self <: ScrollTop](x: Self) {
    
    inline def setScrollLeft(value: js.Any): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    inline def setScrollTop(value: js.Any): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
  }
}
