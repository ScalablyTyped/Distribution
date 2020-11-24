package typings.plugapi.mod.Enum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoomRole extends js.Object {
  
  var BOUNCER: Double = js.native
  
  var COHOST: Double = js.native
  
  var HOST: Double = js.native
  
  var MANAGER: Double = js.native
  
  var NONE: Double = js.native
  
  var RESIDENTDJ: Double = js.native
}
object RoomRole {
  
  @scala.inline
  def apply(BOUNCER: Double, COHOST: Double, HOST: Double, MANAGER: Double, NONE: Double, RESIDENTDJ: Double): RoomRole = {
    val __obj = js.Dynamic.literal(BOUNCER = BOUNCER.asInstanceOf[js.Any], COHOST = COHOST.asInstanceOf[js.Any], HOST = HOST.asInstanceOf[js.Any], MANAGER = MANAGER.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], RESIDENTDJ = RESIDENTDJ.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomRole]
  }
  
  @scala.inline
  implicit class RoomRoleOps[Self <: RoomRole] (val x: Self) extends AnyVal {
    
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
    def setBOUNCER(value: Double): Self = this.set("BOUNCER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCOHOST(value: Double): Self = this.set("COHOST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHOST(value: Double): Self = this.set("HOST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMANAGER(value: Double): Self = this.set("MANAGER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNONE(value: Double): Self = this.set("NONE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRESIDENTDJ(value: Double): Self = this.set("RESIDENTDJ", value.asInstanceOf[js.Any])
  }
}
