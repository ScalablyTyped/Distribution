package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ScimGetProvisioningInformationForUserEndpoint
import typings.octokitTypes.endpointsMod.ScimGetProvisioningInformationForUserRequestOptions
import typings.octokitTypes.endpointsMod.ScimGetProvisioningInformationForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersScimGetProvisioningInformationForUserEndpoint extends StObject {
  
  var parameters: ScimGetProvisioningInformationForUserEndpoint
  
  var request: ScimGetProvisioningInformationForUserRequestOptions
  
  var response: OctokitResponse[ScimGetProvisioningInformationForUserResponseData]
}
object ParametersScimGetProvisioningInformationForUserEndpoint {
  
  inline def apply(
    parameters: ScimGetProvisioningInformationForUserEndpoint,
    request: ScimGetProvisioningInformationForUserRequestOptions,
    response: OctokitResponse[ScimGetProvisioningInformationForUserResponseData]
  ): ParametersScimGetProvisioningInformationForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimGetProvisioningInformationForUserEndpoint]
  }
  
  extension [Self <: ParametersScimGetProvisioningInformationForUserEndpoint](x: Self) {
    
    inline def setParameters(value: ScimGetProvisioningInformationForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ScimGetProvisioningInformationForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ScimGetProvisioningInformationForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
