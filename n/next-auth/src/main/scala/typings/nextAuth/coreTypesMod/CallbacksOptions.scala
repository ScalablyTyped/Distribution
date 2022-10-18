package typings.nextAuth.coreTypesMod

import typings.nextAuth.anon.BaseUrl
import typings.nextAuth.anon.Credentials
import typings.nextAuth.anon.IsNewUserProfile
import typings.nextAuth.anon.SessionToken
import typings.nextAuth.jwtTypesMod.JWT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbacksOptions[P, A] extends StObject {
  
  /**
    * This callback is called whenever a JSON Web Token is created (i.e. at sign in)
    * or updated (i.e whenever a session is accessed in the client).
    * Its content is forwarded to the `session` callback,
    * where you can control what should be returned to the client.
    * Anything else will be kept from your front-end.
    *
    * ⚠ By default the JWT is signed, but not encrypted.
    *
    * [Documentation](https://next-auth.js.org/configuration/callbacks#jwt-callback) |
    * [`session` callback](https://next-auth.js.org/configuration/callbacks#session-callback)
    */
  def jwt(params: IsNewUserProfile[A, P]): Awaitable[JWT]
  
  /**
    * This callback is called anytime the user is redirected to a callback URL (e.g. on signin or signout).
    * By default only URLs on the same URL as the site are allowed,
    * you can use this callback to customise that behaviour.
    *
    * [Documentation](https://next-auth.js.org/configuration/callbacks#redirect-callback)
    */
  def redirect(params: BaseUrl): Awaitable[String]
  
  /**
    * This callback is called whenever a session is checked.
    * (Eg.: invoking the `/api/session` endpoint, using `useSession` or `getSession`)
    *
    * ⚠ By default, only a subset (email, name, image)
    * of the token is returned for increased security.
    *
    * If you want to make something available you added to the token through the `jwt` callback,
    * you have to explicitly forward it here to make it available to the client.
    *
    * [Documentation](https://next-auth.js.org/configuration/callbacks#session-callback) |
    * [`jwt` callback](https://next-auth.js.org/configuration/callbacks#jwt-callback) |
    * [`useSession`](https://next-auth.js.org/getting-started/client#usesession) |
    * [`getSession`](https://next-auth.js.org/getting-started/client#getsession) |
    *
    */
  def session(params: SessionToken): Awaitable[Session]
  
  /**
    * Use this callback to control if a user is allowed to sign in.
    * Returning true will continue the sign-in flow.
    * Throwing an error or returning a string will stop the flow, and redirect the user.
    *
    * [Documentation](https://next-auth.js.org/configuration/callbacks#sign-in-callback)
    */
  def signIn(params: Credentials[A, P]): Awaitable[String | Boolean]
}
object CallbacksOptions {
  
  inline def apply[P, A](
    jwt: IsNewUserProfile[A, P] => Awaitable[JWT],
    redirect: BaseUrl => Awaitable[String],
    session: SessionToken => Awaitable[Session],
    signIn: Credentials[A, P] => Awaitable[String | Boolean]
  ): CallbacksOptions[P, A] = {
    val __obj = js.Dynamic.literal(jwt = js.Any.fromFunction1(jwt), redirect = js.Any.fromFunction1(redirect), session = js.Any.fromFunction1(session), signIn = js.Any.fromFunction1(signIn))
    __obj.asInstanceOf[CallbacksOptions[P, A]]
  }
  
  extension [Self <: CallbacksOptions[?, ?], P, A](x: Self & (CallbacksOptions[P, A])) {
    
    inline def setJwt(value: IsNewUserProfile[A, P] => Awaitable[JWT]): Self = StObject.set(x, "jwt", js.Any.fromFunction1(value))
    
    inline def setRedirect(value: BaseUrl => Awaitable[String]): Self = StObject.set(x, "redirect", js.Any.fromFunction1(value))
    
    inline def setSession(value: SessionToken => Awaitable[Session]): Self = StObject.set(x, "session", js.Any.fromFunction1(value))
    
    inline def setSignIn(value: Credentials[A, P] => Awaitable[String | Boolean]): Self = StObject.set(x, "signIn", js.Any.fromFunction1(value))
  }
}
