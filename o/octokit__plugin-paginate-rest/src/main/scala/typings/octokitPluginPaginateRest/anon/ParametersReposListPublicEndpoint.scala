package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListPublicEndpoint
import typings.octokitTypes.endpointsMod.ReposListPublicResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListPublicEndpoint extends StObject {
  
  var parameters: ReposListPublicEndpoint = js.native
  
  var response: OctokitResponse[ReposListPublicResponseData] = js.native
}
object ParametersReposListPublicEndpoint {
  
  @scala.inline
  def apply(parameters: ReposListPublicEndpoint, response: OctokitResponse[ReposListPublicResponseData]): ParametersReposListPublicEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListPublicEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListPublicEndpointMutableBuilder[Self <: ParametersReposListPublicEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListPublicEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListPublicResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
