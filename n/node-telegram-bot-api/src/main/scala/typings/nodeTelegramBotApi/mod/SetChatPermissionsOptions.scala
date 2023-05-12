package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetChatPermissionsOptions extends StObject {
  
  var use_independent_chat_permissions: js.UndefOr[Boolean] = js.undefined
}
object SetChatPermissionsOptions {
  
  inline def apply(): SetChatPermissionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetChatPermissionsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetChatPermissionsOptions] (val x: Self) extends AnyVal {
    
    inline def setUse_independent_chat_permissions(value: Boolean): Self = StObject.set(x, "use_independent_chat_permissions", value.asInstanceOf[js.Any])
    
    inline def setUse_independent_chat_permissionsUndefined: Self = StObject.set(x, "use_independent_chat_permissions", js.undefined)
  }
}
