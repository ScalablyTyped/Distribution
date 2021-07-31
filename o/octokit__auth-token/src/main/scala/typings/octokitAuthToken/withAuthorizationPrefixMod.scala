package typings.octokitAuthToken

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withAuthorizationPrefixMod {
  
  @JSImport("@octokit/auth-token/dist-types/with-authorization-prefix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def withAuthorizationPrefix(token: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("withAuthorizationPrefix")(token.asInstanceOf[js.Any]).asInstanceOf[String]
}
