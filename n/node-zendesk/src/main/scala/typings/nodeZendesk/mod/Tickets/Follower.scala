package typings.nodeZendesk.mod.Tickets

import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Follower extends js.Object {
  
  var action: String = js.native
  
  var user_email: js.UndefOr[String] = js.native
  
  var user_id: js.UndefOr[ZendeskID] = js.native
}
object Follower {
  
  @scala.inline
  def apply(action: String): Follower = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[Follower]
  }
  
  @scala.inline
  implicit class FollowerOps[Self <: Follower] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_email(value: String): Self = this.set("user_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser_email: Self = this.set("user_email", js.undefined)
    
    @scala.inline
    def setUser_id(value: ZendeskID): Self = this.set("user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser_id: Self = this.set("user_id", js.undefined)
  }
}
