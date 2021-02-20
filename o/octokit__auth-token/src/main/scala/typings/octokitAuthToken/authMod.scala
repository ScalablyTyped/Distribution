package typings.octokitAuthToken

import typings.octokitAuthToken.typesMod.Authentication
import typings.octokitAuthToken.typesMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authMod {
  
  @JSImport("@octokit/auth-token/dist-types/auth", "auth")
  @js.native
  def auth(token: Token): js.Promise[Authentication] = js.native
}
