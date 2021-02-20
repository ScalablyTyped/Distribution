package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetAppsWithAccessToProtectedBranchEndpoint
import typings.octokitTypes.endpointsMod.ReposGetAppsWithAccessToProtectedBranchRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetAppsWithAccessToProtectedBranchResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetAppsWithAccessToProtectedBranchEndpoint extends StObject {
  
  var parameters: ReposGetAppsWithAccessToProtectedBranchEndpoint = js.native
  
  var request: ReposGetAppsWithAccessToProtectedBranchRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetAppsWithAccessToProtectedBranchResponseData] = js.native
}
object ParametersReposGetAppsWithAccessToProtectedBranchEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetAppsWithAccessToProtectedBranchEndpoint,
    request: ReposGetAppsWithAccessToProtectedBranchRequestOptions,
    response: OctokitResponse[ReposGetAppsWithAccessToProtectedBranchResponseData]
  ): ParametersReposGetAppsWithAccessToProtectedBranchEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetAppsWithAccessToProtectedBranchEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetAppsWithAccessToProtectedBranchEndpointMutableBuilder[Self <: ParametersReposGetAppsWithAccessToProtectedBranchEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetAppsWithAccessToProtectedBranchEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetAppsWithAccessToProtectedBranchRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetAppsWithAccessToProtectedBranchResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
