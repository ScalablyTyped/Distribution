package typings.plugapi.mod.Event

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoothCycle extends js.Object {
  
  var cycle: Boolean = js.native
  
  var moderator: String = js.native
}
object BoothCycle {
  
  @scala.inline
  def apply(cycle: Boolean, moderator: String): BoothCycle = {
    val __obj = js.Dynamic.literal(cycle = cycle.asInstanceOf[js.Any], moderator = moderator.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoothCycle]
  }
  
  @scala.inline
  implicit class BoothCycleOps[Self <: BoothCycle] (val x: Self) extends AnyVal {
    
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
    def setCycle(value: Boolean): Self = this.set("cycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModerator(value: String): Self = this.set("moderator", value.asInstanceOf[js.Any])
  }
}
