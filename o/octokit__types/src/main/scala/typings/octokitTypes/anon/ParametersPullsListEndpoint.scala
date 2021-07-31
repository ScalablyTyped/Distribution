package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsListEndpoint
import typings.octokitTypes.endpointsMod.PullsListRequestOptions
import typings.octokitTypes.endpointsMod.PullsListResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPullsListEndpoint extends StObject {
  
  var parameters: PullsListEndpoint
  
  var request: PullsListRequestOptions
  
  var response: OctokitResponse[PullsListResponseData]
}
object ParametersPullsListEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsListEndpoint,
    request: PullsListRequestOptions,
    response: OctokitResponse[PullsListResponseData]
  ): ParametersPullsListEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsListEndpointMutableBuilder[Self <: ParametersPullsListEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsListEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: PullsListRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
