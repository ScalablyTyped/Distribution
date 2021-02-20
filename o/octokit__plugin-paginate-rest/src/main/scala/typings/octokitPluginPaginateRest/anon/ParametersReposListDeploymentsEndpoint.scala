package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListDeploymentsEndpoint
import typings.octokitTypes.endpointsMod.ReposListDeploymentsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListDeploymentsEndpoint extends StObject {
  
  var parameters: ReposListDeploymentsEndpoint = js.native
  
  var response: OctokitResponse[ReposListDeploymentsResponseData] = js.native
}
object ParametersReposListDeploymentsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListDeploymentsEndpoint,
    response: OctokitResponse[ReposListDeploymentsResponseData]
  ): ParametersReposListDeploymentsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListDeploymentsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListDeploymentsEndpointMutableBuilder[Self <: ParametersReposListDeploymentsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListDeploymentsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListDeploymentsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
