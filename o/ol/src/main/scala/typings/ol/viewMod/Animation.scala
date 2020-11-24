package typings.ol.viewMod

import typings.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animation extends js.Object {
  
  var anchor: js.UndefOr[Coordinate] = js.native
  
  def callback(p0: Boolean): Unit = js.native
  
  var complete: Boolean = js.native
  
  var duration: Double = js.native
  
  def easing(p0: Double): Double = js.native
  
  var sourceCenter: js.UndefOr[Coordinate] = js.native
  
  var sourceResolution: js.UndefOr[Double] = js.native
  
  var sourceRotation: js.UndefOr[Double] = js.native
  
  var start: Double = js.native
  
  var targetCenter: js.UndefOr[Coordinate] = js.native
  
  var targetResolution: js.UndefOr[Double] = js.native
  
  var targetRotation: js.UndefOr[Double] = js.native
}
object Animation {
  
  @scala.inline
  def apply(
    callback: Boolean => Unit,
    complete: Boolean,
    duration: Double,
    easing: Double => Double,
    start: Double
  ): Animation = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), complete = complete.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = js.Any.fromFunction1(easing), start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
  
  @scala.inline
  implicit class AnimationOps[Self <: Animation] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: Boolean => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComplete(value: Boolean): Self = this.set("complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasing(value: Double => Double): Self = this.set("easing", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorVarargs(value: Double*): Self = this.set("anchor", js.Array(value :_*))
    
    @scala.inline
    def setAnchor(value: Coordinate): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setSourceCenterVarargs(value: Double*): Self = this.set("sourceCenter", js.Array(value :_*))
    
    @scala.inline
    def setSourceCenter(value: Coordinate): Self = this.set("sourceCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceCenter: Self = this.set("sourceCenter", js.undefined)
    
    @scala.inline
    def setSourceResolution(value: Double): Self = this.set("sourceResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceResolution: Self = this.set("sourceResolution", js.undefined)
    
    @scala.inline
    def setSourceRotation(value: Double): Self = this.set("sourceRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceRotation: Self = this.set("sourceRotation", js.undefined)
    
    @scala.inline
    def setTargetCenterVarargs(value: Double*): Self = this.set("targetCenter", js.Array(value :_*))
    
    @scala.inline
    def setTargetCenter(value: Coordinate): Self = this.set("targetCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetCenter: Self = this.set("targetCenter", js.undefined)
    
    @scala.inline
    def setTargetResolution(value: Double): Self = this.set("targetResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetResolution: Self = this.set("targetResolution", js.undefined)
    
    @scala.inline
    def setTargetRotation(value: Double): Self = this.set("targetRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetRotation: Self = this.set("targetRotation", js.undefined)
  }
}
