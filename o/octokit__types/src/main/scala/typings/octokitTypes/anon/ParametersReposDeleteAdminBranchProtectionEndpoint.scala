package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteAdminBranchProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteAdminBranchProtectionRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposDeleteAdminBranchProtectionEndpoint extends StObject {
  
  var parameters: ReposDeleteAdminBranchProtectionEndpoint = js.native
  
  var request: ReposDeleteAdminBranchProtectionRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReposDeleteAdminBranchProtectionEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposDeleteAdminBranchProtectionEndpoint,
    request: ReposDeleteAdminBranchProtectionRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeleteAdminBranchProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteAdminBranchProtectionEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposDeleteAdminBranchProtectionEndpointMutableBuilder[Self <: ParametersReposDeleteAdminBranchProtectionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposDeleteAdminBranchProtectionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposDeleteAdminBranchProtectionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
