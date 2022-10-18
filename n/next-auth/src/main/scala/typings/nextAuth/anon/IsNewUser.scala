package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsNewUser extends StObject {
  
  var account: typings.nextAuth.coreTypesMod.Account | Null
  
  var isNewUser: js.UndefOr[Boolean] = js.undefined
  
  var profile: js.UndefOr[typings.nextAuth.coreTypesMod.Profile] = js.undefined
  
  var user: typings.nextAuth.coreTypesMod.User
}
object IsNewUser {
  
  inline def apply(user: typings.nextAuth.coreTypesMod.User): IsNewUser = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any], account = null)
    __obj.asInstanceOf[IsNewUser]
  }
  
  extension [Self <: IsNewUser](x: Self) {
    
    inline def setAccount(value: typings.nextAuth.coreTypesMod.Account): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountNull: Self = StObject.set(x, "account", null)
    
    inline def setIsNewUser(value: Boolean): Self = StObject.set(x, "isNewUser", value.asInstanceOf[js.Any])
    
    inline def setIsNewUserUndefined: Self = StObject.set(x, "isNewUser", js.undefined)
    
    inline def setProfile(value: typings.nextAuth.coreTypesMod.Profile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setUser(value: typings.nextAuth.coreTypesMod.User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
