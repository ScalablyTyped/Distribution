package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ScimListProvisionedIdentitiesEndpoint
import typings.octokitTypes.endpointsMod.ScimListProvisionedIdentitiesRequestOptions
import typings.octokitTypes.endpointsMod.ScimListProvisionedIdentitiesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersScimListProvisionedIdentitiesEndpoint extends StObject {
  
  var parameters: ScimListProvisionedIdentitiesEndpoint
  
  var request: ScimListProvisionedIdentitiesRequestOptions
  
  var response: OctokitResponse[ScimListProvisionedIdentitiesResponseData]
}
object ParametersScimListProvisionedIdentitiesEndpoint {
  
  inline def apply(
    parameters: ScimListProvisionedIdentitiesEndpoint,
    request: ScimListProvisionedIdentitiesRequestOptions,
    response: OctokitResponse[ScimListProvisionedIdentitiesResponseData]
  ): ParametersScimListProvisionedIdentitiesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimListProvisionedIdentitiesEndpoint]
  }
  
  extension [Self <: ParametersScimListProvisionedIdentitiesEndpoint](x: Self) {
    
    inline def setParameters(value: ScimListProvisionedIdentitiesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ScimListProvisionedIdentitiesRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ScimListProvisionedIdentitiesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
