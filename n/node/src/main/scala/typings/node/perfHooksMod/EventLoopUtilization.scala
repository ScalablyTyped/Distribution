package typings.node.perfHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventLoopUtilization extends js.Object {
  
  var active: Double = js.native
  
  var idle: Double = js.native
  
  var utilization: Double = js.native
}
object EventLoopUtilization {
  
  @scala.inline
  def apply(active: Double, idle: Double, utilization: Double): EventLoopUtilization = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], idle = idle.asInstanceOf[js.Any], utilization = utilization.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventLoopUtilization]
  }
  
  @scala.inline
  implicit class EventLoopUtilizationOps[Self <: EventLoopUtilization] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Double): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdle(value: Double): Self = this.set("idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtilization(value: Double): Self = this.set("utilization", value.asInstanceOf[js.Any])
  }
}
