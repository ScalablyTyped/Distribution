package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.AdapterUser
import typings.nextAuth.nextAuthStrings.jwt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Profile extends StObject {
  
  var account: typings.nextAuth.coreTypesMod.Account | Null
  
  var options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions */ Any
  
  var profile: typings.nextAuth.coreTypesMod.User | AdapterUser | Email
  
  var sessionToken: js.UndefOr[typings.nextAuth.coreLibCookieMod.SessionToken[jwt]] = js.undefined
}
object Profile {
  
  inline def apply(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions */ Any,
    profile: typings.nextAuth.coreTypesMod.User | AdapterUser | Email
  ): Profile = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], account = null)
    __obj.asInstanceOf[Profile]
  }
  
  extension [Self <: Profile](x: Self) {
    
    inline def setAccount(value: typings.nextAuth.coreTypesMod.Account): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountNull: Self = StObject.set(x, "account", null)
    
    inline def setOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions */ Any
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setProfile(value: typings.nextAuth.coreTypesMod.User | AdapterUser | Email): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setSessionToken(value: typings.nextAuth.coreLibCookieMod.SessionToken[jwt]): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
  }
}
