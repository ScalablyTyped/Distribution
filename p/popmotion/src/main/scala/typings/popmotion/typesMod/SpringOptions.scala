package typings.popmotion.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpringOptions extends PhysicsSpringOptions {
  
  var bounce: js.UndefOr[Double] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var from: js.UndefOr[Double] = js.native
  
  var restDelta: js.UndefOr[Double] = js.native
  
  var restSpeed: js.UndefOr[Double] = js.native
  
  var to: js.UndefOr[Double] = js.native
}
object SpringOptions {
  
  @scala.inline
  def apply(): SpringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpringOptions]
  }
  
  @scala.inline
  implicit class SpringOptionsOps[Self <: SpringOptions] (val x: Self) extends AnyVal {
    
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
    def setBounce(value: Double): Self = this.set("bounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounce: Self = this.set("bounce", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setRestDelta(value: Double): Self = this.set("restDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestDelta: Self = this.set("restDelta", js.undefined)
    
    @scala.inline
    def setRestSpeed(value: Double): Self = this.set("restSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestSpeed: Self = this.set("restSpeed", js.undefined)
    
    @scala.inline
    def setTo(value: Double): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
}
