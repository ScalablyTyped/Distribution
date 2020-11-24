package typings.plugapi.mod.Event

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModBan extends js.Object {
  
  var duration: Double = js.native
  
  var moderator: String = js.native
  
  var reason: String = js.native
  
  var ref: String = js.native
  
  var username: String = js.native
}
object ModBan {
  
  @scala.inline
  def apply(duration: Double, moderator: String, reason: String, ref: String, username: String): ModBan = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], moderator = moderator.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModBan]
  }
  
  @scala.inline
  implicit class ModBanOps[Self <: ModBan] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModerator(value: String): Self = this.set("moderator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
}
