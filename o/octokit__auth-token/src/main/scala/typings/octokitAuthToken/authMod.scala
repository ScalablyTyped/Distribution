package typings.octokitAuthToken

import typings.octokitAuthToken.typesMod.Authentication
import typings.octokitAuthToken.typesMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authMod {
  
  @JSImport("@octokit/auth-token/dist-types/auth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def auth(token: Token): js.Promise[Authentication] = ^.asInstanceOf[js.Dynamic].applyDynamic("auth")(token.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Authentication]]
}
