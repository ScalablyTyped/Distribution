package typings.nyaapi.mod.pantsu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comment extends StObject {
  
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
  implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_avatar(value: String): Self = StObject.set(x, "user_avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_status(value: String): Self = StObject.set(x, "user_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
