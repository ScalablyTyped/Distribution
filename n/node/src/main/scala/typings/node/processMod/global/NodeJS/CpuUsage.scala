package typings.node.processMod.global.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CpuUsage extends js.Object {
  
  var system: Double = js.native
  
  var user: Double = js.native
}
object CpuUsage {
  
  @scala.inline
  def apply(system: Double, user: Double): CpuUsage = {
    val __obj = js.Dynamic.literal(system = system.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuUsage]
  }
  
  @scala.inline
  implicit class CpuUsageOps[Self <: CpuUsage] (val x: Self) extends AnyVal {
    
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
    def setSystem(value: Double): Self = this.set("system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: Double): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
