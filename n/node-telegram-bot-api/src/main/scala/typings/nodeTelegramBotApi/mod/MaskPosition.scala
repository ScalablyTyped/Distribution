package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaskPosition extends StObject {
  
  var point: String = js.native
  
  var scale: Double = js.native
  
  var x_shift: Double = js.native
  
  var y_shift: Double = js.native
}
object MaskPosition {
  
  @scala.inline
  def apply(point: String, scale: Double, x_shift: Double, y_shift: Double): MaskPosition = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], x_shift = x_shift.asInstanceOf[js.Any], y_shift = y_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskPosition]
  }
  
  @scala.inline
  implicit class MaskPositionMutableBuilder[Self <: MaskPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPoint(value: String): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX_shift(value: Double): Self = StObject.set(x, "x_shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY_shift(value: Double): Self = StObject.set(x, "y_shift", value.asInstanceOf[js.Any])
  }
}
