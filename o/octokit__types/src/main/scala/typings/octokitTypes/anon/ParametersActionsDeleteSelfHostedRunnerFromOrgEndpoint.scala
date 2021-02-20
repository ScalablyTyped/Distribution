package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDeleteSelfHostedRunnerFromOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsDeleteSelfHostedRunnerFromOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsDeleteSelfHostedRunnerFromOrgEndpoint extends StObject {
  
  var parameters: ActionsDeleteSelfHostedRunnerFromOrgEndpoint = js.native
  
  var request: ActionsDeleteSelfHostedRunnerFromOrgRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActionsDeleteSelfHostedRunnerFromOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsDeleteSelfHostedRunnerFromOrgEndpoint,
    request: ActionsDeleteSelfHostedRunnerFromOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsDeleteSelfHostedRunnerFromOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDeleteSelfHostedRunnerFromOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsDeleteSelfHostedRunnerFromOrgEndpointMutableBuilder[Self <: ParametersActionsDeleteSelfHostedRunnerFromOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsDeleteSelfHostedRunnerFromOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsDeleteSelfHostedRunnerFromOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
