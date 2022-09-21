package typings.plottable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<std.DOMRect, 'height' | 'width' | 'x' | 'y'> */
trait PickDOMRectheightwidthxy extends StObject {
  
  var height: Double
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object PickDOMRectheightwidthxy {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): PickDOMRectheightwidthxy = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickDOMRectheightwidthxy]
  }
  
  extension [Self <: PickDOMRectheightwidthxy](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
