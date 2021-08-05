package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateBranchProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateBranchProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateBranchProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposUpdateBranchProtectionEndpoint extends StObject {
  
  var parameters: ReposUpdateBranchProtectionEndpoint
  
  var request: ReposUpdateBranchProtectionRequestOptions
  
  var response: OctokitResponse[ReposUpdateBranchProtectionResponseData]
}
object ParametersReposUpdateBranchProtectionEndpoint {
  
  inline def apply(
    parameters: ReposUpdateBranchProtectionEndpoint,
    request: ReposUpdateBranchProtectionRequestOptions,
    response: OctokitResponse[ReposUpdateBranchProtectionResponseData]
  ): ParametersReposUpdateBranchProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateBranchProtectionEndpoint]
  }
  
  extension [Self <: ParametersReposUpdateBranchProtectionEndpoint](x: Self) {
    
    inline def setParameters(value: ReposUpdateBranchProtectionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposUpdateBranchProtectionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposUpdateBranchProtectionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
