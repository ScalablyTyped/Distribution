package typings.plottable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CenterX extends StObject {
  
  var centerX: Double
  
  var centerY: Double
}
object CenterX {
  
  inline def apply(centerX: Double, centerY: Double): CenterX = {
    val __obj = js.Dynamic.literal(centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any])
    __obj.asInstanceOf[CenterX]
  }
  
  extension [Self <: CenterX](x: Self) {
    
    inline def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
    
    inline def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
  }
}
