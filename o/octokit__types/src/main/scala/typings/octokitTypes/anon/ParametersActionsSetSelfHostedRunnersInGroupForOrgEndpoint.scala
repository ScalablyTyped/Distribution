package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsSetSelfHostedRunnersInGroupForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsSetSelfHostedRunnersInGroupForOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsSetSelfHostedRunnersInGroupForOrgEndpoint extends StObject {
  
  var parameters: ActionsSetSelfHostedRunnersInGroupForOrgEndpoint = js.native
  
  var request: ActionsSetSelfHostedRunnersInGroupForOrgRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActionsSetSelfHostedRunnersInGroupForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsSetSelfHostedRunnersInGroupForOrgEndpoint,
    request: ActionsSetSelfHostedRunnersInGroupForOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsSetSelfHostedRunnersInGroupForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsSetSelfHostedRunnersInGroupForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsSetSelfHostedRunnersInGroupForOrgEndpointMutableBuilder[Self <: ParametersActionsSetSelfHostedRunnersInGroupForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsSetSelfHostedRunnersInGroupForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsSetSelfHostedRunnersInGroupForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
