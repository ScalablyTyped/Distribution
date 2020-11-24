package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RingRadius extends js.Object {
  
  var ringRadius: js.UndefOr[Double] = js.native
  
  var segments: js.UndefOr[Double] = js.native
  
  var sides: js.UndefOr[Double] = js.native
  
  var tubeRadius: js.UndefOr[Double] = js.native
}
object RingRadius {
  
  @scala.inline
  def apply(): RingRadius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RingRadius]
  }
  
  @scala.inline
  implicit class RingRadiusOps[Self <: RingRadius] (val x: Self) extends AnyVal {
    
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
    def setRingRadius(value: Double): Self = this.set("ringRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRingRadius: Self = this.set("ringRadius", js.undefined)
    
    @scala.inline
    def setSegments(value: Double): Self = this.set("segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegments: Self = this.set("segments", js.undefined)
    
    @scala.inline
    def setSides(value: Double): Self = this.set("sides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSides: Self = this.set("sides", js.undefined)
    
    @scala.inline
    def setTubeRadius(value: Double): Self = this.set("tubeRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTubeRadius: Self = this.set("tubeRadius", js.undefined)
  }
}
