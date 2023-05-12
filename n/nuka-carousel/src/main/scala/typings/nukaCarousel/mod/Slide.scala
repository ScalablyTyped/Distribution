package typings.nukaCarousel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Slide extends StObject {
  
  var children: js.UndefOr[js.Array[SlideChildren]] = js.undefined
  
  var offsetHeight: Double
}
object Slide {
  
  inline def apply(offsetHeight: Double): Slide = {
    val __obj = js.Dynamic.literal(offsetHeight = offsetHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slide]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Slide] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[SlideChildren]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: SlideChildren*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setOffsetHeight(value: Double): Self = StObject.set(x, "offsetHeight", value.asInstanceOf[js.Any])
  }
}
