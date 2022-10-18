package typings.nextAuth.coreTypesMod

import typings.nextAuth.anon.IsNewUser
import typings.nextAuth.anon.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventCallbacks extends StObject {
  
  def createUser(message: typings.nextAuth.anon.User): Awaitable[Unit]
  
  def linkAccount(message: typings.nextAuth.anon.Account): Awaitable[Unit]
  
  /**
    * The message object will contain one of these depending on
    * if you use JWT or database persisted sessions:
    * - `token`: The JWT token for this session.
    * - `session`: The session object from your adapter.
    */
  def session(message: Token): Awaitable[Unit]
  
  /**
    * If using a `credentials` type auth, the user is the raw response from your
    * credential provider.
    * For other providers, you'll get the User object from your adapter, the account,
    * and an indicator if the user was new to your Adapter.
    */
  def signIn(message: IsNewUser): Awaitable[Unit]
  
  /**
    * The message object will contain one of these depending on
    * if you use JWT or database persisted sessions:
    * - `token`: The JWT token for this session.
    * - `session`: The session object from your adapter that is being ended.
    */
  def signOut(message: Token): Awaitable[Unit]
  
  def updateUser(message: typings.nextAuth.anon.User): Awaitable[Unit]
}
object EventCallbacks {
  
  inline def apply(
    createUser: typings.nextAuth.anon.User => Awaitable[Unit],
    linkAccount: typings.nextAuth.anon.Account => Awaitable[Unit],
    session: Token => Awaitable[Unit],
    signIn: IsNewUser => Awaitable[Unit],
    signOut: Token => Awaitable[Unit],
    updateUser: typings.nextAuth.anon.User => Awaitable[Unit]
  ): EventCallbacks = {
    val __obj = js.Dynamic.literal(createUser = js.Any.fromFunction1(createUser), linkAccount = js.Any.fromFunction1(linkAccount), session = js.Any.fromFunction1(session), signIn = js.Any.fromFunction1(signIn), signOut = js.Any.fromFunction1(signOut), updateUser = js.Any.fromFunction1(updateUser))
    __obj.asInstanceOf[EventCallbacks]
  }
  
  extension [Self <: EventCallbacks](x: Self) {
    
    inline def setCreateUser(value: typings.nextAuth.anon.User => Awaitable[Unit]): Self = StObject.set(x, "createUser", js.Any.fromFunction1(value))
    
    inline def setLinkAccount(value: typings.nextAuth.anon.Account => Awaitable[Unit]): Self = StObject.set(x, "linkAccount", js.Any.fromFunction1(value))
    
    inline def setSession(value: Token => Awaitable[Unit]): Self = StObject.set(x, "session", js.Any.fromFunction1(value))
    
    inline def setSignIn(value: IsNewUser => Awaitable[Unit]): Self = StObject.set(x, "signIn", js.Any.fromFunction1(value))
    
    inline def setSignOut(value: Token => Awaitable[Unit]): Self = StObject.set(x, "signOut", js.Any.fromFunction1(value))
    
    inline def setUpdateUser(value: typings.nextAuth.anon.User => Awaitable[Unit]): Self = StObject.set(x, "updateUser", js.Any.fromFunction1(value))
  }
}
