package typings.octokitRequest

import typings.octokitTypes.endpointInterfaceMod.EndpointInterface
import typings.octokitTypes.requestInterfaceMod.RequestInterface
import typings.octokitTypes.requestParametersMod.RequestParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withDefaultsMod {
  
  @JSImport("@octokit/request/dist-types/with-defaults", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(oldEndpoint: EndpointInterface[js.Object], newDefaults: RequestParameters): RequestInterface[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(oldEndpoint.asInstanceOf[js.Any], newDefaults.asInstanceOf[js.Any])).asInstanceOf[RequestInterface[js.Object]]
}
