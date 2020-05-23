package typings.octokitAuthToken

import typings.octokitAuthToken.typesMod.AnyResponse
import typings.octokitAuthToken.typesMod.EndpointOptions
import typings.octokitAuthToken.typesMod.RequestInterface
import typings.octokitAuthToken.typesMod.RequestParameters
import typings.octokitAuthToken.typesMod.Route
import typings.octokitAuthToken.typesMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@octokit/auth-token/dist-types/hook", JSImport.Namespace)
@js.native
object hookMod extends js.Object {
  def hook(token: Token, request: RequestInterface, route: EndpointOptions): js.Promise[AnyResponse] = js.native
  def hook(token: Token, request: RequestInterface, route: EndpointOptions, parameters: RequestParameters): js.Promise[AnyResponse] = js.native
  def hook(token: Token, request: RequestInterface, route: Route): js.Promise[AnyResponse] = js.native
  def hook(token: Token, request: RequestInterface, route: Route, parameters: RequestParameters): js.Promise[AnyResponse] = js.native
}

