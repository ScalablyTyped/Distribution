package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ScimSetInformationForProvisionedUserEndpoint
import typings.octokitTypes.endpointsMod.ScimSetInformationForProvisionedUserRequestOptions
import typings.octokitTypes.endpointsMod.ScimSetInformationForProvisionedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersScimSetInformationForProvisionedUserEndpoint extends StObject {
  
  var parameters: ScimSetInformationForProvisionedUserEndpoint
  
  var request: ScimSetInformationForProvisionedUserRequestOptions
  
  var response: OctokitResponse[ScimSetInformationForProvisionedUserResponseData]
}
object ParametersScimSetInformationForProvisionedUserEndpoint {
  
  inline def apply(
    parameters: ScimSetInformationForProvisionedUserEndpoint,
    request: ScimSetInformationForProvisionedUserRequestOptions,
    response: OctokitResponse[ScimSetInformationForProvisionedUserResponseData]
  ): ParametersScimSetInformationForProvisionedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimSetInformationForProvisionedUserEndpoint]
  }
  
  extension [Self <: ParametersScimSetInformationForProvisionedUserEndpoint](x: Self) {
    
    inline def setParameters(value: ScimSetInformationForProvisionedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ScimSetInformationForProvisionedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ScimSetInformationForProvisionedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
