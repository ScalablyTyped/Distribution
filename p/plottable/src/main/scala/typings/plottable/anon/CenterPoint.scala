package typings.plottable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CenterPoint extends StObject {
  
  var centerPoint: Double = js.native
  
  var zoomAmount: Double = js.native
}
object CenterPoint {
  
  @scala.inline
  def apply(centerPoint: Double, zoomAmount: Double): CenterPoint = {
    val __obj = js.Dynamic.literal(centerPoint = centerPoint.asInstanceOf[js.Any], zoomAmount = zoomAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CenterPoint]
  }
  
  @scala.inline
  implicit class CenterPointMutableBuilder[Self <: CenterPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenterPoint(value: Double): Self = StObject.set(x, "centerPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomAmount(value: Double): Self = StObject.set(x, "zoomAmount", value.asInstanceOf[js.Any])
  }
}
