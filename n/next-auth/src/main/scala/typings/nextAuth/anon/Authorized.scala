package typings.nextAuth.anon

import typings.nextAuth.coreTypesMod.Awaitable
import typings.nextAuth.nextMiddlewareMod.AuthorizedCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authorized extends StObject {
  
  /**
    * Callback that receives the user's JWT payload
    * and returns `true` to allow the user to continue.
    *
    * This is similar to the `signIn` callback in `NextAuthOptions`.
    *
    * If it returns `false`, the user is redirected to the sign-in page instead
    *
    * The default is to let the user continue if they have a valid JWT (basic authentication).
    *
    * How to restrict a page and all of it's subpages for admins-only:
    * @example
    *
    * ```js
    * // `middleware.js`
    * import { withAuth } from "next-auth/middleware"
    *
    * export default withAuth({
    *   callbacks: {
    *     authorized: ({ token }) => token?.user.isAdmin
    *   }
    * })
    *
    * export const config = { matcher: ["/admin"] }
    *
    * ```
    *
    * ---
    * [Documentation](https://next-auth.js.org/configuration/nextjs#middleware) | [`signIn` callback](configuration/callbacks#sign-in-callback)
    */
  var authorized: js.UndefOr[AuthorizedCallback] = js.undefined
}
object Authorized {
  
  inline def apply(): Authorized = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Authorized]
  }
  
  extension [Self <: Authorized](x: Self) {
    
    inline def setAuthorized(value: /* params */ ReqToken => Awaitable[Boolean]): Self = StObject.set(x, "authorized", js.Any.fromFunction1(value))
    
    inline def setAuthorizedUndefined: Self = StObject.set(x, "authorized", js.undefined)
  }
}
