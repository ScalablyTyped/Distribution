package typings.nukaCarousel.typesMod

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
  
  extension [Self <: Slide](x: Self) {
    
    inline def setChildren(value: js.Array[SlideChildren]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: SlideChildren*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setOffsetHeight(value: Double): Self = StObject.set(x, "offsetHeight", value.asInstanceOf[js.Any])
  }
}
