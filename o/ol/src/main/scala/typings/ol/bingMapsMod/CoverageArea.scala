package typings.ol.bingMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoverageArea extends js.Object {
  
  var bbox: js.Array[Double] = js.native
  
  var zoomMax: Double = js.native
  
  var zoomMin: Double = js.native
}
object CoverageArea {
  
  @scala.inline
  def apply(bbox: js.Array[Double], zoomMax: Double, zoomMin: Double): CoverageArea = {
    val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any], zoomMax = zoomMax.asInstanceOf[js.Any], zoomMin = zoomMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageArea]
  }
  
  @scala.inline
  implicit class CoverageAreaOps[Self <: CoverageArea] (val x: Self) extends AnyVal {
    
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
    def setBboxVarargs(value: Double*): Self = this.set("bbox", js.Array(value :_*))
    
    @scala.inline
    def setBbox(value: js.Array[Double]): Self = this.set("bbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomMax(value: Double): Self = this.set("zoomMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomMin(value: Double): Self = this.set("zoomMin", value.asInstanceOf[js.Any])
  }
}
