package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Axis extends js.Object {
  
  var axis: js.UndefOr[String] = js.native
  
  var backfaceVisibility: js.UndefOr[String] = js.native
  
  var delay: js.UndefOr[String] = js.native
  
  var duration: js.UndefOr[String] = js.native
  
  var endAngle: js.UndefOr[String] = js.native
  
  var flipTarget: js.UndefOr[String] = js.native
  
  var persist: js.UndefOr[String] = js.native
  
  var perspective: js.UndefOr[String] = js.native
  
  var startAngle: js.UndefOr[String] = js.native
  
  var timingFunction: js.UndefOr[String] = js.native
  
  var transformOrigin: js.UndefOr[String] = js.native
}
object Axis {
  
  @scala.inline
  def apply(): Axis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Axis]
  }
  
  @scala.inline
  implicit class AxisOps[Self <: Axis] (val x: Self) extends AnyVal {
    
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
    def setAxis(value: String): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setBackfaceVisibility(value: String): Self = this.set("backfaceVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackfaceVisibility: Self = this.set("backfaceVisibility", js.undefined)
    
    @scala.inline
    def setDelay(value: String): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEndAngle(value: String): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndAngle: Self = this.set("endAngle", js.undefined)
    
    @scala.inline
    def setFlipTarget(value: String): Self = this.set("flipTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlipTarget: Self = this.set("flipTarget", js.undefined)
    
    @scala.inline
    def setPersist(value: String): Self = this.set("persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersist: Self = this.set("persist", js.undefined)
    
    @scala.inline
    def setPerspective(value: String): Self = this.set("perspective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerspective: Self = this.set("perspective", js.undefined)
    
    @scala.inline
    def setStartAngle(value: String): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
    
    @scala.inline
    def setTimingFunction(value: String): Self = this.set("timingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimingFunction: Self = this.set("timingFunction", js.undefined)
    
    @scala.inline
    def setTransformOrigin(value: String): Self = this.set("transformOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformOrigin: Self = this.set("transformOrigin", js.undefined)
  }
}
