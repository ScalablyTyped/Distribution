package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsCreateRegistrationTokenForRepoEndpoint
import typings.octokitTypes.endpointsMod.ActionsCreateRegistrationTokenForRepoRequestOptions
import typings.octokitTypes.endpointsMod.ActionsCreateRegistrationTokenForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActionsCreateRegistrationTokenForRepoEndpoint extends StObject {
  
  var parameters: ActionsCreateRegistrationTokenForRepoEndpoint
  
  var request: ActionsCreateRegistrationTokenForRepoRequestOptions
  
  var response: OctokitResponse[ActionsCreateRegistrationTokenForRepoResponseData]
}
object ParametersActionsCreateRegistrationTokenForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsCreateRegistrationTokenForRepoEndpoint,
    request: ActionsCreateRegistrationTokenForRepoRequestOptions,
    response: OctokitResponse[ActionsCreateRegistrationTokenForRepoResponseData]
  ): ParametersActionsCreateRegistrationTokenForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsCreateRegistrationTokenForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsCreateRegistrationTokenForRepoEndpointMutableBuilder[Self <: ParametersActionsCreateRegistrationTokenForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsCreateRegistrationTokenForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsCreateRegistrationTokenForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsCreateRegistrationTokenForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
