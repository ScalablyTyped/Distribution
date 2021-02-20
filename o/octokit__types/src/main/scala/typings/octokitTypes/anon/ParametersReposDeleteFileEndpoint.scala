package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteFileEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteFileRequestOptions
import typings.octokitTypes.endpointsMod.ReposDeleteFileResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposDeleteFileEndpoint extends StObject {
  
  var parameters: ReposDeleteFileEndpoint = js.native
  
  var request: ReposDeleteFileRequestOptions = js.native
  
  var response: OctokitResponse[ReposDeleteFileResponseData] = js.native
}
object ParametersReposDeleteFileEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposDeleteFileEndpoint,
    request: ReposDeleteFileRequestOptions,
    response: OctokitResponse[ReposDeleteFileResponseData]
  ): ParametersReposDeleteFileEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteFileEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposDeleteFileEndpointMutableBuilder[Self <: ParametersReposDeleteFileEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposDeleteFileEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposDeleteFileRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposDeleteFileResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
