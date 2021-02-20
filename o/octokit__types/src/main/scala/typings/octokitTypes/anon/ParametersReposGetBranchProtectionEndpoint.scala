package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetBranchProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposGetBranchProtectionRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetBranchProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetBranchProtectionEndpoint extends StObject {
  
  var parameters: ReposGetBranchProtectionEndpoint = js.native
  
  var request: ReposGetBranchProtectionRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetBranchProtectionResponseData] = js.native
}
object ParametersReposGetBranchProtectionEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetBranchProtectionEndpoint,
    request: ReposGetBranchProtectionRequestOptions,
    response: OctokitResponse[ReposGetBranchProtectionResponseData]
  ): ParametersReposGetBranchProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetBranchProtectionEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetBranchProtectionEndpointMutableBuilder[Self <: ParametersReposGetBranchProtectionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetBranchProtectionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetBranchProtectionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetBranchProtectionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
