package typings.nyaapi.mod.pantsu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  var created_at: String
  
  var liked_count: Double
  
  var liking_count: Double
  
  var md5: String
  
  var status: UserStatus
  
  var user_id: Double
  
  var username: String
}
object User {
  
  @scala.inline
  def apply(
    created_at: String,
    liked_count: Double,
    liking_count: Double,
    md5: String,
    status: UserStatus,
    user_id: Double,
    username: String
  ): User = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], liked_count = liked_count.asInstanceOf[js.Any], liking_count = liking_count.asInstanceOf[js.Any], md5 = md5.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiked_count(value: Double): Self = StObject.set(x, "liked_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiking_count(value: Double): Self = StObject.set(x, "liking_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd5(value: String): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: UserStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
