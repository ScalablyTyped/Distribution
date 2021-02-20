package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminCreateRegistrationTokenForEnterpriseRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminCreateRegistrationTokenForEnterpriseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint = js.native
  
  var request: EnterpriseAdminCreateRegistrationTokenForEnterpriseRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminCreateRegistrationTokenForEnterpriseResponseData] = js.native
}
object ParametersEnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint,
    request: EnterpriseAdminCreateRegistrationTokenForEnterpriseRequestOptions,
    response: OctokitResponse[EnterpriseAdminCreateRegistrationTokenForEnterpriseResponseData]
  ): ParametersEnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminCreateRegistrationTokenForEnterpriseEndpointMutableBuilder[Self <: ParametersEnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminCreateRegistrationTokenForEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminCreateRegistrationTokenForEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminCreateRegistrationTokenForEnterpriseResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
