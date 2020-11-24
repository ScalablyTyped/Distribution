package typings.opentypeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Metrics extends js.Object {
  
  var leftSideBearing: Double = js.native
  
  var rightSideBearing: js.UndefOr[Double] = js.native
  
  var xMax: Double = js.native
  
  var xMin: Double = js.native
  
  var yMax: Double = js.native
  
  var yMin: Double = js.native
}
object Metrics {
  
  @scala.inline
  def apply(leftSideBearing: Double, xMax: Double, xMin: Double, yMax: Double, yMin: Double): Metrics = {
    val __obj = js.Dynamic.literal(leftSideBearing = leftSideBearing.asInstanceOf[js.Any], xMax = xMax.asInstanceOf[js.Any], xMin = xMin.asInstanceOf[js.Any], yMax = yMax.asInstanceOf[js.Any], yMin = yMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metrics]
  }
  
  @scala.inline
  implicit class MetricsOps[Self <: Metrics] (val x: Self) extends AnyVal {
    
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
    def setLeftSideBearing(value: Double): Self = this.set("leftSideBearing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXMax(value: Double): Self = this.set("xMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXMin(value: Double): Self = this.set("xMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYMax(value: Double): Self = this.set("yMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYMin(value: Double): Self = this.set("yMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightSideBearing(value: Double): Self = this.set("rightSideBearing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightSideBearing: Self = this.set("rightSideBearing", js.undefined)
  }
}
