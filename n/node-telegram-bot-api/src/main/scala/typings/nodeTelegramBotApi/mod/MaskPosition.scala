package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaskPosition extends StObject {
  
  var point: String
  
  var scale: Double
  
  var x_shift: Double
  
  var y_shift: Double
}
object MaskPosition {
  
  inline def apply(point: String, scale: Double, x_shift: Double, y_shift: Double): MaskPosition = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], x_shift = x_shift.asInstanceOf[js.Any], y_shift = y_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskPosition]
  }
  
  extension [Self <: MaskPosition](x: Self) {
    
    inline def setPoint(value: String): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setX_shift(value: Double): Self = StObject.set(x, "x_shift", value.asInstanceOf[js.Any])
    
    inline def setY_shift(value: Double): Self = StObject.set(x, "y_shift", value.asInstanceOf[js.Any])
  }
}
