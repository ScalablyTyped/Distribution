package typings.nyaapi.mod.pantsu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginResult extends StObject {
  
  var created_at: String
  
  var liked_count: Double
  
  var liking_count: Double
  
  var md5: String
  
  var status: Double
  
  var token: String
  
  var user_id: Double
  
  var username: String
}
object LoginResult {
  
  inline def apply(
    created_at: String,
    liked_count: Double,
    liking_count: Double,
    md5: String,
    status: Double,
    token: String,
    user_id: Double,
    username: String
  ): LoginResult = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], liked_count = liked_count.asInstanceOf[js.Any], liking_count = liking_count.asInstanceOf[js.Any], md5 = md5.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginResult]
  }
  
  extension [Self <: LoginResult](x: Self) {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setLiked_count(value: Double): Self = StObject.set(x, "liked_count", value.asInstanceOf[js.Any])
    
    inline def setLiking_count(value: Double): Self = StObject.set(x, "liking_count", value.asInstanceOf[js.Any])
    
    inline def setMd5(value: String): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
