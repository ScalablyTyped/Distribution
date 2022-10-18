package typings.nextAuth.anon

import typings.nextAuth.coreTypesMod.Awaitable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<next-auth.next-auth/core/types.EventCallbacks> */
trait PartialEventCallbacks extends StObject {
  
  var createUser: js.UndefOr[js.Function1[/* message */ User, Awaitable[Unit]]] = js.undefined
  
  var linkAccount: js.UndefOr[js.Function1[/* message */ Account, Awaitable[Unit]]] = js.undefined
  
  var session: js.UndefOr[js.Function1[/* message */ Token, Awaitable[Unit]]] = js.undefined
  
  var signIn: js.UndefOr[js.Function1[/* message */ IsNewUser, Awaitable[Unit]]] = js.undefined
  
  var signOut: js.UndefOr[js.Function1[/* message */ Token, Awaitable[Unit]]] = js.undefined
  
  var updateUser: js.UndefOr[js.Function1[/* message */ User, Awaitable[Unit]]] = js.undefined
}
object PartialEventCallbacks {
  
  inline def apply(): PartialEventCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEventCallbacks]
  }
  
  extension [Self <: PartialEventCallbacks](x: Self) {
    
    inline def setCreateUser(value: /* message */ User => Awaitable[Unit]): Self = StObject.set(x, "createUser", js.Any.fromFunction1(value))
    
    inline def setCreateUserUndefined: Self = StObject.set(x, "createUser", js.undefined)
    
    inline def setLinkAccount(value: /* message */ Account => Awaitable[Unit]): Self = StObject.set(x, "linkAccount", js.Any.fromFunction1(value))
    
    inline def setLinkAccountUndefined: Self = StObject.set(x, "linkAccount", js.undefined)
    
    inline def setSession(value: /* message */ Token => Awaitable[Unit]): Self = StObject.set(x, "session", js.Any.fromFunction1(value))
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setSignIn(value: /* message */ IsNewUser => Awaitable[Unit]): Self = StObject.set(x, "signIn", js.Any.fromFunction1(value))
    
    inline def setSignInUndefined: Self = StObject.set(x, "signIn", js.undefined)
    
    inline def setSignOut(value: /* message */ Token => Awaitable[Unit]): Self = StObject.set(x, "signOut", js.Any.fromFunction1(value))
    
    inline def setSignOutUndefined: Self = StObject.set(x, "signOut", js.undefined)
    
    inline def setUpdateUser(value: /* message */ User => Awaitable[Unit]): Self = StObject.set(x, "updateUser", js.Any.fromFunction1(value))
    
    inline def setUpdateUserUndefined: Self = StObject.set(x, "updateUser", js.undefined)
  }
}
