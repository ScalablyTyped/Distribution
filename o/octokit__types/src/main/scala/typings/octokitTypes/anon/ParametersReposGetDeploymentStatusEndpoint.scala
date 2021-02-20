package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetDeploymentStatusEndpoint
import typings.octokitTypes.endpointsMod.ReposGetDeploymentStatusRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetDeploymentStatusResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetDeploymentStatusEndpoint extends StObject {
  
  var parameters: ReposGetDeploymentStatusEndpoint = js.native
  
  var request: ReposGetDeploymentStatusRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetDeploymentStatusResponseData] = js.native
}
object ParametersReposGetDeploymentStatusEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetDeploymentStatusEndpoint,
    request: ReposGetDeploymentStatusRequestOptions,
    response: OctokitResponse[ReposGetDeploymentStatusResponseData]
  ): ParametersReposGetDeploymentStatusEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetDeploymentStatusEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetDeploymentStatusEndpointMutableBuilder[Self <: ParametersReposGetDeploymentStatusEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetDeploymentStatusEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetDeploymentStatusRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetDeploymentStatusResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
