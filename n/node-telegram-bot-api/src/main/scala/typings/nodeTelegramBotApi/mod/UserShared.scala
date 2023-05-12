package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserShared extends StObject {
  
  var request_id: Double
  
  var user_id: Double
}
object UserShared {
  
  inline def apply(request_id: Double, user_id: Double): UserShared = {
    val __obj = js.Dynamic.literal(request_id = request_id.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserShared]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserShared] (val x: Self) extends AnyVal {
    
    inline def setRequest_id(value: Double): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
    
    inline def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
