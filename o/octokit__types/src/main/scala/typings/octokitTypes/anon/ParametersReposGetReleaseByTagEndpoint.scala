package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetReleaseByTagEndpoint
import typings.octokitTypes.endpointsMod.ReposGetReleaseByTagRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetReleaseByTagResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetReleaseByTagEndpoint extends StObject {
  
  var parameters: ReposGetReleaseByTagEndpoint = js.native
  
  var request: ReposGetReleaseByTagRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetReleaseByTagResponseData] = js.native
}
object ParametersReposGetReleaseByTagEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetReleaseByTagEndpoint,
    request: ReposGetReleaseByTagRequestOptions,
    response: OctokitResponse[ReposGetReleaseByTagResponseData]
  ): ParametersReposGetReleaseByTagEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetReleaseByTagEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetReleaseByTagEndpointMutableBuilder[Self <: ParametersReposGetReleaseByTagEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetReleaseByTagEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetReleaseByTagRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetReleaseByTagResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
