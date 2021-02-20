package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateReleaseEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateReleaseRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateReleaseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposUpdateReleaseEndpoint extends StObject {
  
  var parameters: ReposUpdateReleaseEndpoint = js.native
  
  var request: ReposUpdateReleaseRequestOptions = js.native
  
  var response: OctokitResponse[ReposUpdateReleaseResponseData] = js.native
}
object ParametersReposUpdateReleaseEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposUpdateReleaseEndpoint,
    request: ReposUpdateReleaseRequestOptions,
    response: OctokitResponse[ReposUpdateReleaseResponseData]
  ): ParametersReposUpdateReleaseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateReleaseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposUpdateReleaseEndpointMutableBuilder[Self <: ParametersReposUpdateReleaseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposUpdateReleaseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposUpdateReleaseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposUpdateReleaseResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
