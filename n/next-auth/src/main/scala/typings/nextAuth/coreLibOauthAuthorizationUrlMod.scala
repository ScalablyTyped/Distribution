package typings.nextAuth

import typings.nextAuth.anon.CookiesRedirect
import typings.nextAuth.anon.Query
import typings.nextAuth.anon.Redirect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreLibOauthAuthorizationUrlMod {
  
  @JSImport("next-auth/core/lib/oauth/authorization-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: Query): js.Promise[Redirect | CookiesRedirect] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Redirect | CookiesRedirect]]
}
