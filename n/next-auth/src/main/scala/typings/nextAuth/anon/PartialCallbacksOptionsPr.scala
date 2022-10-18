package typings.nextAuth.anon

import typings.nextAuth.coreTypesMod.Awaitable
import typings.nextAuth.jwtTypesMod.JWT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<next-auth.next-auth/core/types.CallbacksOptions<next-auth.next-auth/core/types.Profile, next-auth.next-auth/core/types.Account>> */
trait PartialCallbacksOptionsPr extends StObject {
  
  var jwt: js.UndefOr[js.Function1[/* params */ ProfileToken, Awaitable[JWT]]] = js.undefined
  
  var redirect: js.UndefOr[js.Function1[/* params */ BaseUrl, Awaitable[String]]] = js.undefined
  
  var session: js.UndefOr[
    js.Function1[/* params */ SessionToken, Awaitable[typings.nextAuth.coreTypesMod.Session]]
  ] = js.undefined
  
  var signIn: js.UndefOr[js.Function1[/* params */ AccountCredentials, Awaitable[String | Boolean]]] = js.undefined
}
object PartialCallbacksOptionsPr {
  
  inline def apply(): PartialCallbacksOptionsPr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCallbacksOptionsPr]
  }
  
  extension [Self <: PartialCallbacksOptionsPr](x: Self) {
    
    inline def setJwt(value: /* params */ ProfileToken => Awaitable[JWT]): Self = StObject.set(x, "jwt", js.Any.fromFunction1(value))
    
    inline def setJwtUndefined: Self = StObject.set(x, "jwt", js.undefined)
    
    inline def setRedirect(value: /* params */ BaseUrl => Awaitable[String]): Self = StObject.set(x, "redirect", js.Any.fromFunction1(value))
    
    inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    inline def setSession(value: /* params */ SessionToken => Awaitable[typings.nextAuth.coreTypesMod.Session]): Self = StObject.set(x, "session", js.Any.fromFunction1(value))
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setSignIn(value: /* params */ AccountCredentials => Awaitable[String | Boolean]): Self = StObject.set(x, "signIn", js.Any.fromFunction1(value))
    
    inline def setSignInUndefined: Self = StObject.set(x, "signIn", js.undefined)
  }
}
