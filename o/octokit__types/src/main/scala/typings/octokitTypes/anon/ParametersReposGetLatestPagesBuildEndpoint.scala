package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetLatestPagesBuildEndpoint
import typings.octokitTypes.endpointsMod.ReposGetLatestPagesBuildRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetLatestPagesBuildResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetLatestPagesBuildEndpoint extends StObject {
  
  var parameters: ReposGetLatestPagesBuildEndpoint
  
  var request: ReposGetLatestPagesBuildRequestOptions
  
  var response: OctokitResponse[ReposGetLatestPagesBuildResponseData]
}
object ParametersReposGetLatestPagesBuildEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetLatestPagesBuildEndpoint,
    request: ReposGetLatestPagesBuildRequestOptions,
    response: OctokitResponse[ReposGetLatestPagesBuildResponseData]
  ): ParametersReposGetLatestPagesBuildEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetLatestPagesBuildEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetLatestPagesBuildEndpointMutableBuilder[Self <: ParametersReposGetLatestPagesBuildEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetLatestPagesBuildEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetLatestPagesBuildRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetLatestPagesBuildResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
