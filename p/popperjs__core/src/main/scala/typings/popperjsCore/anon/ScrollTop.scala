package typings.popperjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollTop extends StObject {
  
  var scrollLeft: Any
  
  var scrollTop: Any
}
object ScrollTop {
  
  inline def apply(scrollLeft: Any, scrollTop: Any): ScrollTop = {
    val __obj = js.Dynamic.literal(scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollTop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollTop] (val x: Self) extends AnyVal {
    
    inline def setScrollLeft(value: Any): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    inline def setScrollTop(value: Any): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
  }
}
