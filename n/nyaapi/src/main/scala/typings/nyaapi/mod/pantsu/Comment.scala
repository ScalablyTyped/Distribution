package typings.nyaapi.mod.pantsu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comment extends js.Object {
  
  var content: String = js.native
  
  var date: String = js.native
  
  var user_avatar: String = js.native
  
  var user_id: Double = js.native
  
  var user_status: String = js.native
  
  var username: String = js.native
}
object Comment {
  
  @scala.inline
  def apply(
    content: String,
    date: String,
    user_avatar: String,
    user_id: Double,
    user_status: String,
    username: String
  ): Comment = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], user_avatar = user_avatar.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], user_status = user_status.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  
  @scala.inline
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_avatar(value: String): Self = this.set("user_avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_id(value: Double): Self = this.set("user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_status(value: String): Self = this.set("user_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
}
