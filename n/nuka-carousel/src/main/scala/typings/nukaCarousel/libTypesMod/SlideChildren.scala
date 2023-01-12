package typings.nukaCarousel.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideChildren extends StObject {
  
  var offsetHeight: Double
}
object SlideChildren {
  
  inline def apply(offsetHeight: Double): SlideChildren = {
    val __obj = js.Dynamic.literal(offsetHeight = offsetHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideChildren]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlideChildren] (val x: Self) extends AnyVal {
    
    inline def setOffsetHeight(value: Double): Self = StObject.set(x, "offsetHeight", value.asInstanceOf[js.Any])
  }
}
