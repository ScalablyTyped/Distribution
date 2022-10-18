package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.AdapterUser
import typings.nextAuth.jwtTypesMod.JWT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileToken extends StObject {
  
  var account: js.UndefOr[typings.nextAuth.coreTypesMod.Account | Null] = js.undefined
  
  var isNewUser: js.UndefOr[Boolean] = js.undefined
  
  var profile: js.UndefOr[typings.nextAuth.coreTypesMod.Profile] = js.undefined
  
  var token: JWT
  
  var user: js.UndefOr[typings.nextAuth.coreTypesMod.User | AdapterUser] = js.undefined
}
object ProfileToken {
  
  inline def apply(token: JWT): ProfileToken = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileToken]
  }
  
  extension [Self <: ProfileToken](x: Self) {
    
    inline def setAccount(value: typings.nextAuth.coreTypesMod.Account): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountNull: Self = StObject.set(x, "account", null)
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setIsNewUser(value: Boolean): Self = StObject.set(x, "isNewUser", value.asInstanceOf[js.Any])
    
    inline def setIsNewUserUndefined: Self = StObject.set(x, "isNewUser", js.undefined)
    
    inline def setProfile(value: typings.nextAuth.coreTypesMod.Profile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setToken(value: JWT): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setUser(value: typings.nextAuth.coreTypesMod.User | AdapterUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
