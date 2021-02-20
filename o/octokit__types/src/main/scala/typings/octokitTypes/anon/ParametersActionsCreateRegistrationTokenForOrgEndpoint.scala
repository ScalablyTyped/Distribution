package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsCreateRegistrationTokenForOrgEndpoint
import typings.octokitTypes.endpointsMod.ActionsCreateRegistrationTokenForOrgRequestOptions
import typings.octokitTypes.endpointsMod.ActionsCreateRegistrationTokenForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsCreateRegistrationTokenForOrgEndpoint extends StObject {
  
  var parameters: ActionsCreateRegistrationTokenForOrgEndpoint = js.native
  
  var request: ActionsCreateRegistrationTokenForOrgRequestOptions = js.native
  
  var response: OctokitResponse[ActionsCreateRegistrationTokenForOrgResponseData] = js.native
}
object ParametersActionsCreateRegistrationTokenForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsCreateRegistrationTokenForOrgEndpoint,
    request: ActionsCreateRegistrationTokenForOrgRequestOptions,
    response: OctokitResponse[ActionsCreateRegistrationTokenForOrgResponseData]
  ): ParametersActionsCreateRegistrationTokenForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsCreateRegistrationTokenForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsCreateRegistrationTokenForOrgEndpointMutableBuilder[Self <: ParametersActionsCreateRegistrationTokenForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsCreateRegistrationTokenForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsCreateRegistrationTokenForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsCreateRegistrationTokenForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
