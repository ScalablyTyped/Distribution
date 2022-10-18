package typings.nextAuth

import typings.nextAuth.anon.AccountIsNewUser
import typings.nextAuth.anon.IsNewUserSession
import typings.nextAuth.anon.Profile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreLibCallbackHandlerMod {
  
  @JSImport("next-auth/core/lib/callback-handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(params: Profile): js.Promise[AccountIsNewUser | IsNewUserSession] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AccountIsNewUser | IsNewUserSession]]
}
