package typings.octokitAuthToken

import typings.octokitAuthToken.typesMod.AnyResponse
import typings.octokitAuthToken.typesMod.EndpointOptions
import typings.octokitAuthToken.typesMod.RequestInterface
import typings.octokitAuthToken.typesMod.RequestParameters
import typings.octokitAuthToken.typesMod.Route
import typings.octokitAuthToken.typesMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hookMod {
  
  @JSImport("@octokit/auth-token/dist-types/hook", "hook")
  @js.native
  def hook(token: Token, request: RequestInterface, route: EndpointOptions): js.Promise[AnyResponse] = js.native
  @JSImport("@octokit/auth-token/dist-types/hook", "hook")
  @js.native
  def hook(token: Token, request: RequestInterface, route: EndpointOptions, parameters: RequestParameters): js.Promise[AnyResponse] = js.native
  @JSImport("@octokit/auth-token/dist-types/hook", "hook")
  @js.native
  def hook(token: Token, request: RequestInterface, route: Route): js.Promise[AnyResponse] = js.native
  @JSImport("@octokit/auth-token/dist-types/hook", "hook")
  @js.native
  def hook(token: Token, request: RequestInterface, route: Route, parameters: RequestParameters): js.Promise[AnyResponse] = js.native
}
