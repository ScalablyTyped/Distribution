package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposReplaceAllTopicsEndpoint
import typings.octokitTypes.endpointsMod.ReposReplaceAllTopicsRequestOptions
import typings.octokitTypes.endpointsMod.ReposReplaceAllTopicsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposReplaceAllTopicsEndpoint extends StObject {
  
  var parameters: ReposReplaceAllTopicsEndpoint = js.native
  
  var request: ReposReplaceAllTopicsRequestOptions = js.native
  
  var response: OctokitResponse[ReposReplaceAllTopicsResponseData] = js.native
}
object ParametersReposReplaceAllTopicsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposReplaceAllTopicsEndpoint,
    request: ReposReplaceAllTopicsRequestOptions,
    response: OctokitResponse[ReposReplaceAllTopicsResponseData]
  ): ParametersReposReplaceAllTopicsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposReplaceAllTopicsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposReplaceAllTopicsEndpointMutableBuilder[Self <: ParametersReposReplaceAllTopicsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposReplaceAllTopicsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposReplaceAllTopicsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposReplaceAllTopicsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
