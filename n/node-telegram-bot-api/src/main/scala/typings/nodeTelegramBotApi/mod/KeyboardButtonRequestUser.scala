package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardButtonRequestUser extends StObject {
  
  var request_id: Double
  
  var user_is_bot: js.UndefOr[Boolean] = js.undefined
  
  var user_is_premium: js.UndefOr[Boolean] = js.undefined
}
object KeyboardButtonRequestUser {
  
  inline def apply(request_id: Double): KeyboardButtonRequestUser = {
    val __obj = js.Dynamic.literal(request_id = request_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardButtonRequestUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyboardButtonRequestUser] (val x: Self) extends AnyVal {
    
    inline def setRequest_id(value: Double): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
    
    inline def setUser_is_bot(value: Boolean): Self = StObject.set(x, "user_is_bot", value.asInstanceOf[js.Any])
    
    inline def setUser_is_botUndefined: Self = StObject.set(x, "user_is_bot", js.undefined)
    
    inline def setUser_is_premium(value: Boolean): Self = StObject.set(x, "user_is_premium", value.asInstanceOf[js.Any])
    
    inline def setUser_is_premiumUndefined: Self = StObject.set(x, "user_is_premium", js.undefined)
  }
}
