package typings.plottable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CenterValue extends StObject {
  
  var centerValue: CenterX
  
  var zoomAmount: Double
}
object CenterValue {
  
  @scala.inline
  def apply(centerValue: CenterX, zoomAmount: Double): CenterValue = {
    val __obj = js.Dynamic.literal(centerValue = centerValue.asInstanceOf[js.Any], zoomAmount = zoomAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CenterValue]
  }
  
  @scala.inline
  implicit class CenterValueMutableBuilder[Self <: CenterValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenterValue(value: CenterX): Self = StObject.set(x, "centerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomAmount(value: Double): Self = StObject.set(x, "zoomAmount", value.asInstanceOf[js.Any])
  }
}
