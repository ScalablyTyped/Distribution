package typings.nukaCarousel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideHeight extends StObject {
  
  var height: Double
  
  var slideIndex: Double
}
object SlideHeight {
  
  inline def apply(height: Double, slideIndex: Double): SlideHeight = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], slideIndex = slideIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideHeight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlideHeight] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setSlideIndex(value: Double): Self = StObject.set(x, "slideIndex", value.asInstanceOf[js.Any])
  }
}
