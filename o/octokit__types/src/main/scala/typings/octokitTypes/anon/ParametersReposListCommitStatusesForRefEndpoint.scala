package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListCommitStatusesForRefEndpoint
import typings.octokitTypes.endpointsMod.ReposListCommitStatusesForRefRequestOptions
import typings.octokitTypes.endpointsMod.ReposListCommitStatusesForRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListCommitStatusesForRefEndpoint extends StObject {
  
  var parameters: ReposListCommitStatusesForRefEndpoint = js.native
  
  var request: ReposListCommitStatusesForRefRequestOptions = js.native
  
  var response: OctokitResponse[ReposListCommitStatusesForRefResponseData] = js.native
}
object ParametersReposListCommitStatusesForRefEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListCommitStatusesForRefEndpoint,
    request: ReposListCommitStatusesForRefRequestOptions,
    response: OctokitResponse[ReposListCommitStatusesForRefResponseData]
  ): ParametersReposListCommitStatusesForRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListCommitStatusesForRefEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListCommitStatusesForRefEndpointMutableBuilder[Self <: ParametersReposListCommitStatusesForRefEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListCommitStatusesForRefEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposListCommitStatusesForRefRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListCommitStatusesForRefResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
