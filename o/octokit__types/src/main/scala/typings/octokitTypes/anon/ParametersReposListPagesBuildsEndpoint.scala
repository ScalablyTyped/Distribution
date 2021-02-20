package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListPagesBuildsEndpoint
import typings.octokitTypes.endpointsMod.ReposListPagesBuildsRequestOptions
import typings.octokitTypes.endpointsMod.ReposListPagesBuildsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListPagesBuildsEndpoint extends StObject {
  
  var parameters: ReposListPagesBuildsEndpoint = js.native
  
  var request: ReposListPagesBuildsRequestOptions = js.native
  
  var response: OctokitResponse[ReposListPagesBuildsResponseData] = js.native
}
object ParametersReposListPagesBuildsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListPagesBuildsEndpoint,
    request: ReposListPagesBuildsRequestOptions,
    response: OctokitResponse[ReposListPagesBuildsResponseData]
  ): ParametersReposListPagesBuildsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListPagesBuildsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListPagesBuildsEndpointMutableBuilder[Self <: ParametersReposListPagesBuildsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListPagesBuildsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposListPagesBuildsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListPagesBuildsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
