package typings.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Idle extends js.Object {
  
  var idle: Double = js.native
  
  var irq: Double = js.native
  
  var nice: Double = js.native
  
  var sys: Double = js.native
  
  var user: Double = js.native
}
object Idle {
  
  @scala.inline
  def apply(idle: Double, irq: Double, nice: Double, sys: Double, user: Double): Idle = {
    val __obj = js.Dynamic.literal(idle = idle.asInstanceOf[js.Any], irq = irq.asInstanceOf[js.Any], nice = nice.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Idle]
  }
  
  @scala.inline
  implicit class IdleOps[Self <: Idle] (val x: Self) extends AnyVal {
    
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
    def setIdle(value: Double): Self = this.set("idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIrq(value: Double): Self = this.set("irq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNice(value: Double): Self = this.set("nice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSys(value: Double): Self = this.set("sys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: Double): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
