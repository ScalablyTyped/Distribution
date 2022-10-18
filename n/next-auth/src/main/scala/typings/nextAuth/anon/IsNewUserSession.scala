package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.AdapterSession
import typings.nextAuth.adaptersMod.AdapterUser
import typings.nextAuth.jwtTypesMod.JWT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsNewUserSession extends StObject {
  
  var account: Unit
  
  var isNewUser: Boolean
  
  var session: JWT | AdapterSession | Null
  
  var user: AdapterUser
}
object IsNewUserSession {
  
  inline def apply(account: Unit, isNewUser: Boolean, user: AdapterUser): IsNewUserSession = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], isNewUser = isNewUser.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], session = null)
    __obj.asInstanceOf[IsNewUserSession]
  }
  
  extension [Self <: IsNewUserSession](x: Self) {
    
    inline def setAccount(value: Unit): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setIsNewUser(value: Boolean): Self = StObject.set(x, "isNewUser", value.asInstanceOf[js.Any])
    
    inline def setSession(value: JWT | AdapterSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionNull: Self = StObject.set(x, "session", null)
    
    inline def setUser(value: AdapterUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
