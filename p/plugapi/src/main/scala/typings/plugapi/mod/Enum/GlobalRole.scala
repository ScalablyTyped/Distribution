package typings.plugapi.mod.Enum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalRole extends js.Object {
  
  var ADMIN: Double = js.native
  
  var AMBASSADOR: Double = js.native
  
  var LEADER: Double = js.native
  
  var NONE: Double = js.native
  
  var VOLUNTEER: Double = js.native
}
object GlobalRole {
  
  @scala.inline
  def apply(ADMIN: Double, AMBASSADOR: Double, LEADER: Double, NONE: Double, VOLUNTEER: Double): GlobalRole = {
    val __obj = js.Dynamic.literal(ADMIN = ADMIN.asInstanceOf[js.Any], AMBASSADOR = AMBASSADOR.asInstanceOf[js.Any], LEADER = LEADER.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], VOLUNTEER = VOLUNTEER.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalRole]
  }
  
  @scala.inline
  implicit class GlobalRoleOps[Self <: GlobalRole] (val x: Self) extends AnyVal {
    
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
    def setADMIN(value: Double): Self = this.set("ADMIN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAMBASSADOR(value: Double): Self = this.set("AMBASSADOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLEADER(value: Double): Self = this.set("LEADER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNONE(value: Double): Self = this.set("NONE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVOLUNTEER(value: Double): Self = this.set("VOLUNTEER", value.asInstanceOf[js.Any])
  }
}
