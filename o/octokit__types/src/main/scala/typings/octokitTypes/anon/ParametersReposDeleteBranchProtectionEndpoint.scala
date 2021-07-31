package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteBranchProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteBranchProtectionRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposDeleteBranchProtectionEndpoint extends StObject {
  
  var parameters: ReposDeleteBranchProtectionEndpoint
  
  var request: ReposDeleteBranchProtectionRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReposDeleteBranchProtectionEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposDeleteBranchProtectionEndpoint,
    request: ReposDeleteBranchProtectionRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReposDeleteBranchProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteBranchProtectionEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposDeleteBranchProtectionEndpointMutableBuilder[Self <: ParametersReposDeleteBranchProtectionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposDeleteBranchProtectionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposDeleteBranchProtectionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
