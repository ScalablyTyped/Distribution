package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRemoveStatusCheckProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveStatusCheckProtectionRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposRemoveStatusCheckProtectionEndpoint extends StObject {
  
  var parameters: ReposRemoveStatusCheckProtectionEndpoint
  
  var request: ReposRemoveStatusCheckProtectionRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReposRemoveStatusCheckProtectionEndpoint {
  
  inline def apply(
    parameters: ReposRemoveStatusCheckProtectionEndpoint,
    request: ReposRemoveStatusCheckProtectionRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReposRemoveStatusCheckProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveStatusCheckProtectionEndpoint]
  }
  
  extension [Self <: ParametersReposRemoveStatusCheckProtectionEndpoint](x: Self) {
    
    inline def setParameters(value: ReposRemoveStatusCheckProtectionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposRemoveStatusCheckProtectionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
