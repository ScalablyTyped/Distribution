package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestrictChatMemberOptions extends StObject {
  
  var permissions: ChatPermissions
  
  var until_date: js.UndefOr[Double] = js.undefined
  
  var use_independent_chat_permissions: js.UndefOr[Boolean] = js.undefined
}
object RestrictChatMemberOptions {
  
  inline def apply(permissions: ChatPermissions): RestrictChatMemberOptions = {
    val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestrictChatMemberOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestrictChatMemberOptions] (val x: Self) extends AnyVal {
    
    inline def setPermissions(value: ChatPermissions): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setUntil_date(value: Double): Self = StObject.set(x, "until_date", value.asInstanceOf[js.Any])
    
    inline def setUntil_dateUndefined: Self = StObject.set(x, "until_date", js.undefined)
    
    inline def setUse_independent_chat_permissions(value: Boolean): Self = StObject.set(x, "use_independent_chat_permissions", value.asInstanceOf[js.Any])
    
    inline def setUse_independent_chat_permissionsUndefined: Self = StObject.set(x, "use_independent_chat_permissions", js.undefined)
  }
}
