package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetBranchEndpoint
import typings.octokitTypes.endpointsMod.ReposGetBranchRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetBranchResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetBranchEndpoint extends StObject {
  
  var parameters: ReposGetBranchEndpoint
  
  var request: ReposGetBranchRequestOptions
  
  var response: OctokitResponse[ReposGetBranchResponseData]
}
object ParametersReposGetBranchEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetBranchEndpoint,
    request: ReposGetBranchRequestOptions,
    response: OctokitResponse[ReposGetBranchResponseData]
  ): ParametersReposGetBranchEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetBranchEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetBranchEndpointMutableBuilder[Self <: ParametersReposGetBranchEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetBranchEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetBranchRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetBranchResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
