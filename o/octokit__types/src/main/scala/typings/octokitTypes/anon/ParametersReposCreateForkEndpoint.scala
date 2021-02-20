package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateForkEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateForkRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateForkResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposCreateForkEndpoint extends StObject {
  
  var parameters: ReposCreateForkEndpoint = js.native
  
  var request: ReposCreateForkRequestOptions = js.native
  
  var response: OctokitResponse[ReposCreateForkResponseData] = js.native
}
object ParametersReposCreateForkEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposCreateForkEndpoint,
    request: ReposCreateForkRequestOptions,
    response: OctokitResponse[ReposCreateForkResponseData]
  ): ParametersReposCreateForkEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateForkEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposCreateForkEndpointMutableBuilder[Self <: ParametersReposCreateForkEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposCreateForkEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposCreateForkRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateForkResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
