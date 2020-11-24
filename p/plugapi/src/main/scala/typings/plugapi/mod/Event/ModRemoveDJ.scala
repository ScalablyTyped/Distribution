package typings.plugapi.mod.Event

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModRemoveDJ extends js.Object {
  
  var moderator: String = js.native
  
  var userID: String = js.native
  
  var username: String = js.native
}
object ModRemoveDJ {
  
  @scala.inline
  def apply(moderator: String, userID: String, username: String): ModRemoveDJ = {
    val __obj = js.Dynamic.literal(moderator = moderator.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModRemoveDJ]
  }
  
  @scala.inline
  implicit class ModRemoveDJOps[Self <: ModRemoveDJ] (val x: Self) extends AnyVal {
    
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
    def setModerator(value: String): Self = this.set("moderator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserID(value: String): Self = this.set("userID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
}
