package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminUpdateAttributeForEnterpriseUserEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminUpdateAttributeForEnterpriseUserRequestOptions
import typings.octokitTypes.endpointsMod.EnterpriseAdminUpdateAttributeForEnterpriseUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersEnterpriseAdminUpdateAttributeForEnterpriseUserEndpoint extends StObject {
  
  var parameters: EnterpriseAdminUpdateAttributeForEnterpriseUserEndpoint
  
  var request: EnterpriseAdminUpdateAttributeForEnterpriseUserRequestOptions
  
  var response: OctokitResponse[EnterpriseAdminUpdateAttributeForEnterpriseUserResponseData]
}
object ParametersEnterpriseAdminUpdateAttributeForEnterpriseUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminUpdateAttributeForEnterpriseUserEndpoint,
    request: EnterpriseAdminUpdateAttributeForEnterpriseUserRequestOptions,
    response: OctokitResponse[EnterpriseAdminUpdateAttributeForEnterpriseUserResponseData]
  ): ParametersEnterpriseAdminUpdateAttributeForEnterpriseUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminUpdateAttributeForEnterpriseUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminUpdateAttributeForEnterpriseUserEndpointMutableBuilder[Self <: ParametersEnterpriseAdminUpdateAttributeForEnterpriseUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminUpdateAttributeForEnterpriseUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminUpdateAttributeForEnterpriseUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminUpdateAttributeForEnterpriseUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
