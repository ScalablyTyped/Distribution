package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetAllTopicsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetAllTopicsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetAllTopicsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetAllTopicsEndpoint extends StObject {
  
  var parameters: ReposGetAllTopicsEndpoint = js.native
  
  var request: ReposGetAllTopicsRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetAllTopicsResponseData] = js.native
}
object ParametersReposGetAllTopicsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetAllTopicsEndpoint,
    request: ReposGetAllTopicsRequestOptions,
    response: OctokitResponse[ReposGetAllTopicsResponseData]
  ): ParametersReposGetAllTopicsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetAllTopicsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetAllTopicsEndpointMutableBuilder[Self <: ParametersReposGetAllTopicsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetAllTopicsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetAllTopicsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetAllTopicsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
