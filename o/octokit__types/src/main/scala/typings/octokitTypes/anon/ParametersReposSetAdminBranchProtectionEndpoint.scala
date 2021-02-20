package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposSetAdminBranchProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposSetAdminBranchProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposSetAdminBranchProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposSetAdminBranchProtectionEndpoint extends StObject {
  
  var parameters: ReposSetAdminBranchProtectionEndpoint = js.native
  
  var request: ReposSetAdminBranchProtectionRequestOptions = js.native
  
  var response: OctokitResponse[ReposSetAdminBranchProtectionResponseData] = js.native
}
object ParametersReposSetAdminBranchProtectionEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposSetAdminBranchProtectionEndpoint,
    request: ReposSetAdminBranchProtectionRequestOptions,
    response: OctokitResponse[ReposSetAdminBranchProtectionResponseData]
  ): ParametersReposSetAdminBranchProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposSetAdminBranchProtectionEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposSetAdminBranchProtectionEndpointMutableBuilder[Self <: ParametersReposSetAdminBranchProtectionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposSetAdminBranchProtectionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposSetAdminBranchProtectionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposSetAdminBranchProtectionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
