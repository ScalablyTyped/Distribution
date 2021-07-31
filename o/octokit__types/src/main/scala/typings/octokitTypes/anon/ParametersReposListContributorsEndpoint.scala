package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListContributorsEndpoint
import typings.octokitTypes.endpointsMod.ReposListContributorsRequestOptions
import typings.octokitTypes.endpointsMod.ReposListContributorsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposListContributorsEndpoint extends StObject {
  
  var parameters: ReposListContributorsEndpoint
  
  var request: ReposListContributorsRequestOptions
  
  var response: OctokitResponse[ReposListContributorsResponseData]
}
object ParametersReposListContributorsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListContributorsEndpoint,
    request: ReposListContributorsRequestOptions,
    response: OctokitResponse[ReposListContributorsResponseData]
  ): ParametersReposListContributorsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListContributorsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListContributorsEndpointMutableBuilder[Self <: ParametersReposListContributorsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListContributorsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposListContributorsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListContributorsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
