package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsCreateRemoveTokenForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsCreateRemoveTokenForOrgRequestOptions
import typings.octokitTypes.endpointsMod.ActionsCreateRemoveTokenForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsCreateRemoveTokenForOrgEndpoint extends StObject {
  
  var parameters: ActionsCreateRemoveTokenForOrgEndpoint
  
  var request: ActionsCreateRemoveTokenForOrgRequestOptions
  
  var response: OctokitResponse[ActionsCreateRemoveTokenForOrgResponseData]
}
object ParametersActionsCreateRemoveTokenForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsCreateRemoveTokenForOrgEndpoint,
    request: ActionsCreateRemoveTokenForOrgRequestOptions,
    response: OctokitResponse[ActionsCreateRemoveTokenForOrgResponseData]
  ): ParametersActionsCreateRemoveTokenForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsCreateRemoveTokenForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsCreateRemoveTokenForOrgEndpointMutableBuilder[Self <: ParametersActionsCreateRemoveTokenForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsCreateRemoveTokenForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsCreateRemoveTokenForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsCreateRemoveTokenForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
