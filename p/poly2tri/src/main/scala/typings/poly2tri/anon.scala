package typings.poly2tri

import typings.poly2tri.mod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Max extends StObject {
    
    var max: Point
    
    var min: Point
  }
  object Max {
    
    inline def apply(max: Point, min: Point): Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    extension [Self <: Max](x: Self) {
      
      inline def setMax(value: Point): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Point): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
}
