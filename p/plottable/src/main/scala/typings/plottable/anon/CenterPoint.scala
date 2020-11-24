package typings.plottable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CenterPoint extends js.Object {
  
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
  implicit class CenterPointOps[Self <: CenterPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCenterPoint(value: Double): Self = this.set("centerPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomAmount(value: Double): Self = this.set("zoomAmount", value.asInstanceOf[js.Any])
  }
}
