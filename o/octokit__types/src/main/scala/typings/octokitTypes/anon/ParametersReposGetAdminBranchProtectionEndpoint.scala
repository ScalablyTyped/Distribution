package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetAdminBranchProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposGetAdminBranchProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetAdminBranchProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetAdminBranchProtectionEndpoint extends StObject {
  
  var parameters: ReposGetAdminBranchProtectionEndpoint = js.native
  
  var request: ReposGetAdminBranchProtectionRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetAdminBranchProtectionResponseData] = js.native
}
object ParametersReposGetAdminBranchProtectionEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetAdminBranchProtectionEndpoint,
    request: ReposGetAdminBranchProtectionRequestOptions,
    response: OctokitResponse[ReposGetAdminBranchProtectionResponseData]
  ): ParametersReposGetAdminBranchProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetAdminBranchProtectionEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetAdminBranchProtectionEndpointMutableBuilder[Self <: ParametersReposGetAdminBranchProtectionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetAdminBranchProtectionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetAdminBranchProtectionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetAdminBranchProtectionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
