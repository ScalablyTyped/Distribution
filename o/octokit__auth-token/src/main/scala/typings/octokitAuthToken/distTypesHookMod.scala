package typings.octokitAuthToken

import typings.octokitAuthToken.distTypesTypesMod.AnyResponse
import typings.octokitAuthToken.distTypesTypesMod.EndpointOptions
import typings.octokitAuthToken.distTypesTypesMod.RequestInterface
import typings.octokitAuthToken.distTypesTypesMod.RequestParameters
import typings.octokitAuthToken.distTypesTypesMod.Route
import typings.octokitAuthToken.distTypesTypesMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHookMod {
  
  @JSImport("@octokit/auth-token/dist-types/hook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hook(token: Token, request: RequestInterface, route: EndpointOptions): js.Promise[AnyResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("hook")(token.asInstanceOf[js.Any], request.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AnyResponse]]
  inline def hook(token: Token, request: RequestInterface, route: EndpointOptions, parameters: RequestParameters): js.Promise[AnyResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("hook")(token.asInstanceOf[js.Any], request.asInstanceOf[js.Any], route.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AnyResponse]]
  inline def hook(token: Token, request: RequestInterface, route: Route): js.Promise[AnyResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("hook")(token.asInstanceOf[js.Any], request.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AnyResponse]]
  inline def hook(token: Token, request: RequestInterface, route: Route, parameters: RequestParameters): js.Promise[AnyResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("hook")(token.asInstanceOf[js.Any], request.asInstanceOf[js.Any], route.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AnyResponse]]
}
