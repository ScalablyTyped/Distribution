package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatInviteLink extends StObject {
  
  var creator: User
  
  var expire_date: js.UndefOr[Double] = js.undefined
  
  var invite_link: String
  
  var is_primary: Boolean
  
  var is_revoked: Boolean
  
  var member_limit: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object ChatInviteLink {
  
  inline def apply(creator: User, invite_link: String, is_primary: Boolean, is_revoked: Boolean): ChatInviteLink = {
    val __obj = js.Dynamic.literal(creator = creator.asInstanceOf[js.Any], invite_link = invite_link.asInstanceOf[js.Any], is_primary = is_primary.asInstanceOf[js.Any], is_revoked = is_revoked.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatInviteLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatInviteLink] (val x: Self) extends AnyVal {
    
    inline def setCreator(value: User): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setExpire_date(value: Double): Self = StObject.set(x, "expire_date", value.asInstanceOf[js.Any])
    
    inline def setExpire_dateUndefined: Self = StObject.set(x, "expire_date", js.undefined)
    
    inline def setInvite_link(value: String): Self = StObject.set(x, "invite_link", value.asInstanceOf[js.Any])
    
    inline def setIs_primary(value: Boolean): Self = StObject.set(x, "is_primary", value.asInstanceOf[js.Any])
    
    inline def setIs_revoked(value: Boolean): Self = StObject.set(x, "is_revoked", value.asInstanceOf[js.Any])
    
    inline def setMember_limit(value: Double): Self = StObject.set(x, "member_limit", value.asInstanceOf[js.Any])
    
    inline def setMember_limitUndefined: Self = StObject.set(x, "member_limit", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
