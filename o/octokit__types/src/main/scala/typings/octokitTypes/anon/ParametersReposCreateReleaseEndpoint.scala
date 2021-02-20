package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateReleaseEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateReleaseRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateReleaseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposCreateReleaseEndpoint extends StObject {
  
  var parameters: ReposCreateReleaseEndpoint = js.native
  
  var request: ReposCreateReleaseRequestOptions = js.native
  
  var response: OctokitResponse[ReposCreateReleaseResponseData] = js.native
}
object ParametersReposCreateReleaseEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposCreateReleaseEndpoint,
    request: ReposCreateReleaseRequestOptions,
    response: OctokitResponse[ReposCreateReleaseResponseData]
  ): ParametersReposCreateReleaseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateReleaseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposCreateReleaseEndpointMutableBuilder[Self <: ParametersReposCreateReleaseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposCreateReleaseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposCreateReleaseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateReleaseResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
