package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposSetAdminBranchProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposSetAdminBranchProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposSetAdminBranchProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposSetAdminBranchProtectionEndpoint extends StObject {
  
  var parameters: ReposSetAdminBranchProtectionEndpoint
  
  var request: ReposSetAdminBranchProtectionRequestOptions
  
  var response: OctokitResponse[ReposSetAdminBranchProtectionResponseData]
}
object ParametersReposSetAdminBranchProtectionEndpoint {
  
  inline def apply(
    parameters: ReposSetAdminBranchProtectionEndpoint,
    request: ReposSetAdminBranchProtectionRequestOptions,
    response: OctokitResponse[ReposSetAdminBranchProtectionResponseData]
  ): ParametersReposSetAdminBranchProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposSetAdminBranchProtectionEndpoint]
  }
  
  extension [Self <: ParametersReposSetAdminBranchProtectionEndpoint](x: Self) {
    
    inline def setParameters(value: ReposSetAdminBranchProtectionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposSetAdminBranchProtectionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposSetAdminBranchProtectionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
