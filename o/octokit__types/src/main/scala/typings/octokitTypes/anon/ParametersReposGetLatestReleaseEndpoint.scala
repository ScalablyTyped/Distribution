package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetLatestReleaseEndpoint
import typings.octokitTypes.endpointsMod.ReposGetLatestReleaseRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetLatestReleaseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetLatestReleaseEndpoint extends StObject {
  
  var parameters: ReposGetLatestReleaseEndpoint
  
  var request: ReposGetLatestReleaseRequestOptions
  
  var response: OctokitResponse[ReposGetLatestReleaseResponseData]
}
object ParametersReposGetLatestReleaseEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetLatestReleaseEndpoint,
    request: ReposGetLatestReleaseRequestOptions,
    response: OctokitResponse[ReposGetLatestReleaseResponseData]
  ): ParametersReposGetLatestReleaseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetLatestReleaseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetLatestReleaseEndpointMutableBuilder[Self <: ParametersReposGetLatestReleaseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetLatestReleaseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetLatestReleaseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetLatestReleaseResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
