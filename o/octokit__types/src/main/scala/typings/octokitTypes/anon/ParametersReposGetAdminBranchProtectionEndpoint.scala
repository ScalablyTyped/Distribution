package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetAdminBranchProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposGetAdminBranchProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetAdminBranchProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetAdminBranchProtectionEndpoint extends StObject {
  
  var parameters: ReposGetAdminBranchProtectionEndpoint
  
  var request: ReposGetAdminBranchProtectionRequestOptions
  
  var response: OctokitResponse[ReposGetAdminBranchProtectionResponseData]
}
object ParametersReposGetAdminBranchProtectionEndpoint {
  
  inline def apply(
    parameters: ReposGetAdminBranchProtectionEndpoint,
    request: ReposGetAdminBranchProtectionRequestOptions,
    response: OctokitResponse[ReposGetAdminBranchProtectionResponseData]
  ): ParametersReposGetAdminBranchProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetAdminBranchProtectionEndpoint]
  }
  
  extension [Self <: ParametersReposGetAdminBranchProtectionEndpoint](x: Self) {
    
    inline def setParameters(value: ReposGetAdminBranchProtectionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposGetAdminBranchProtectionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetAdminBranchProtectionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
